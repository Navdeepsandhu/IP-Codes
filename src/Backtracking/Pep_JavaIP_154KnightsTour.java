package Backtracking;

import java.util.Scanner;

public class Pep_JavaIP_154KnightsTour {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int x=scn.nextInt();
		int y=scn.nextInt();
		
		Integer[][] board = new Integer[n][n];
		int[] xdirs = {2, 1, -1, -2, -2, -1, 1, 2};
		int[] ydirs = {1, 2, 2, 1, -1, -2, -2, -1};
		boolean res = solve(board, x, y, 1, xdirs, ydirs);
		System.out.println(res);
		
	}

	private static boolean solve(Integer[][] board, int x, int y, int movenum, int[] xdirs, int[] ydirs) {
		if(movenum==board.length*board.length) {
			board[x][y]=movenum;
			for(int i=0; i<board.length; i++) {
				for(int j=0; j<board.length; j++) {
					System.out.print(board[i][j]+" ");
				}
				System.out.println();
			}
			return true;
		}
		
		board[x][y]=movenum;
		
		for(int di=0; di<xdirs.length; di++) {
			int xdash=x+xdirs[di];
			int ydash=y+ydirs[di];
			
			if(isValid(board, xdash, ydash)==false) {
				continue;
			}else {
				boolean rres=solve(board, xdash,ydash,movenum+1, xdirs, ydirs );
				if(rres==true) {
					return true;
				}
			}
		}
		
		board[x][y]=null;
		return false;
	
	
	}

	private static boolean isValid(Integer[][] board, int xdash, int ydash) {
		if(ydash<0 || xdash<0 || xdash>=board.length || ydash >= board.length) {
			return false;
		}
		return board[xdash][ydash]==null;
	}

}
