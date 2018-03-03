package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PeekingIterator implements Iterator<Integer> {
	Iterator it = null;
	List<Integer> list = null;
	int i;
	public PeekingIterator(Iterator<Integer> iterator) {
		// initialize any member here.
		this.it = iterator;
		list = new ArrayList();
		iterator.forEachRemaining(list::add);
		i = 0;
	}

	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		return list.get(i);
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		int val = list.get(i);
		i++;
		return val;
	}

	@Override
	public boolean hasNext() {
		if(i < list.size()) {
			return true;
		}
		return false;
	}
}
