package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList();

		if(rowIndex < 0) {
			return list;
		}

		for(int i=0;i<=rowIndex;i++){
			list.add(0,1);
			for(int j=1; j<list.size()-1;j++){
				list.set(j, list.get(j+1) + list.get(j));
			}
		}
		return list;
	}

	public static void main(String[] args) {
		System.out.println(getRow(4));
	}
}
