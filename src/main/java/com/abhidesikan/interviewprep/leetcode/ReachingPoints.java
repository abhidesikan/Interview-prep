package com.abhidesikan.interviewprep.leetcode;

public class ReachingPoints {
	public boolean reachingPoints(int sx, int sy, int tx, int ty) {

		if(tx == ty) {
			return false;
		}

		if(sx == tx && (ty-sy) % sx == 0) {
			return true;
		} else if(sx == tx && (ty-sy) % sx != 0) {
			return false;
		}

		if(sy == ty && (tx-sx) % sy == 0) {
			return true;
		} else if(sy == ty && (tx-sx) % sy != 0) {
			return false;
		}

		if(sx > tx || sy > ty) {
			return false;
		}

		if(sx == tx && sy == ty) {
			return true;
		}

		if(tx < ty) {
			return reachingPoints(sx, sy, tx, ty-tx);
		} else {
			return reachingPoints(sx, sy, tx-ty, ty);
		}
	}
}
