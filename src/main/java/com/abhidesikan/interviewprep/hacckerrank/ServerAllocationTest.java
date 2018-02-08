package com.abhidesikan.interviewprep.hacckerrank;

import org.junit.Assert;
import org.junit.Test;

public class ServerAllocationTest {

	@Test
	public void serverAllocationTestWithValidValues() {
		int arr[] = new int[] {1,2,4,5};
		Assert.assertEquals(3, ServerAllocation.nextServerNumber(arr));

		arr = new int[] {1,5,6};
		Assert.assertEquals(2, ServerAllocation.nextServerNumber(arr));

		arr = new int[] {3,4,5,6,8};
		Assert.assertEquals(1, ServerAllocation.nextServerNumber(arr));

		arr = new int[] {3,2};
		Assert.assertEquals(1, ServerAllocation.nextServerNumber(arr));
	}

	@Test
	public void serverAllocationTestWithEmptyOrSingleValue() {
		int[] arr = new int[] {1};
		Assert.assertEquals(2, ServerAllocation.nextServerNumber(arr));

		arr = new int[] {4};
		Assert.assertEquals(1, ServerAllocation.nextServerNumber(arr));

		arr = new int[0];
		Assert.assertEquals(1, ServerAllocation.nextServerNumber(arr));
	}

	@Test
	public void serverAllocationTestWithNoMissingValues() {
		int arr[] = new int[]{1,2,3,4,5};
		Assert.assertEquals(6, ServerAllocation.nextServerNumber(arr));
	}
}
