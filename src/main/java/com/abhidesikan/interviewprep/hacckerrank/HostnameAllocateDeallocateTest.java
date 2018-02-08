package com.abhidesikan.interviewprep.hacckerrank;

import org.junit.Assert;
import org.junit.Test;

public class HostnameAllocateDeallocateTest {

	@Test
	public void allocateAndDeallocateTest() {
		Assert.assertEquals("abhishek1", HostnameAllocateDeallocate.allocateServer("abhishek"));
		Assert.assertEquals("abhishek2", HostnameAllocateDeallocate.allocateServer("abhishek"));
		Assert.assertEquals("abhishek3", HostnameAllocateDeallocate.allocateServer("abhishek"));
		Assert.assertEquals("nidhi1", HostnameAllocateDeallocate.allocateServer("nidhi"));

		HostnameAllocateDeallocate.deallocateServer("abhishek2");
		Assert.assertEquals("abhishek2", HostnameAllocateDeallocate.allocateServer("abhishek"));
		Assert.assertEquals("abhishek4", HostnameAllocateDeallocate.allocateServer("abhishek"));

		HostnameAllocateDeallocate.deallocateServer("abhishek4");
		HostnameAllocateDeallocate.deallocateServer("abhishek3");
		Assert.assertEquals("abhishek3", HostnameAllocateDeallocate.allocateServer("abhishek"));
	}
}
