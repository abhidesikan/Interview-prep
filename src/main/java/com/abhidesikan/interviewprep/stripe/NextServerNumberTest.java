package com.abhidesikan.interviewprep.stripe;

import org.junit.Assert;
import org.junit.Test;

public class NextServerNumberTest {

	@Test
	public void nextServerNumberTest() {

		int arr[] = new int[]{5, 3, 1};
		Assert.assertEquals(2, NextServerNumber.nextServerNumber(arr));

		arr = new int[]{5,4,1,2};
		Assert.assertEquals(3, NextServerNumber.nextServerNumber(arr));

		arr = new int[]{3,2,1};
		Assert.assertEquals(4, NextServerNumber.nextServerNumber(arr));

		arr = new int[]{2,3};
		Assert.assertEquals(1, NextServerNumber.nextServerNumber(arr));

		arr = new int[]{};
		Assert.assertEquals(1, NextServerNumber.nextServerNumber(arr));

		arr = new int[]{5};
		Assert.assertEquals(1, NextServerNumber.nextServerNumber(arr));

		arr = new int[]{-3,-2, -5};
		Assert.assertEquals(1, NextServerNumber.nextServerNumber(arr));

		arr = new int[] {-3, -2 , 0, 1, 5};
		Assert.assertEquals(2, NextServerNumber.nextServerNumber(arr));

		arr = new int[] {-3, -2, -1, 0};
		Assert.assertEquals(1, NextServerNumber.nextServerNumber(arr));
	}
}
