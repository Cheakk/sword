package com.sword.array;

import java.util.LinkedList;
import java.util.Queue;

/**
 * �����˵��˶��켣
 * 
 * @author Administrator
 *
 */
public class RobotPath {
	int m, n, k;
	boolean[][] visited;

	public int movingCount(int m, int n, int k) {
		this.m = m;
		this.n = n;
		this.k = k;
		this.visited = new boolean[m][n];
		return dfs(0, 0, 0, 0);
	}

	public int dfs(int i, int j, int si, int sj) {
		if (i >= m || j >= n || k < si + sj || visited[i][j])
			return 0;
		visited[i][j] = true;
		return 1 + dfs(i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj)
				+ dfs(i, j + 1, si, (j + 1) % 10 != 0 ? sj + 1 : sj - 8);
	}

	public int movingCount2(int m, int n, int k) {
		boolean[][] visited = new boolean[m][n];
		int res = 0;
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[] { 0, 0, 0, 0 });
		while (queue.size() > 0) {
			int[] x = queue.poll();
			int i = x[0], j = x[1], si = x[2], sj = x[3];
			if (i >= m || j >= n || k < si + sj || visited[i][j])
				continue;
			visited[i][j] = true;
			res++;
			queue.add(new int[] { i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj });
			queue.add(new int[] { i, j + 1, si, (j + 1) % 10 != 0 ? sj + 1 : sj - 8 });
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		RobotPath rp = new RobotPath();
		System.out.println(rp.movingCount(5, 10, 10));
	}

}