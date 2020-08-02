package com.sword.lru;

import java.util.LinkedHashMap;

public class LruCache<K, V> extends LinkedHashMap<K, V> {
	private static final long serialVersionUID = 1L;
	private final int CACHE_SIZE;

	public LruCache(int cache_size) {
		super((int) Math.ceil(cache_size / 0.75), 0.75f, true);
		this.CACHE_SIZE = cache_size;
	}

	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		// TODO Auto-generated method stub
		return size() > CACHE_SIZE;
	}
	
	
	
	public static void main(String[] args) {
		LruCache<Integer ,Integer> l = new LruCache(5);
		l.put(1,2 );
		l.put(3,4 );
		l.put(5,6 );
		l.put(7,8 );
		l.put(9,10 );
		l.put(11,12 );
		System.out.println(l);
	}

}
