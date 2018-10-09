package com.abhidesikan.interviewprep.leetcode;

import java.net.UnknownHostException;
import java.util.Arrays;

public class IntegerToBinary {

	static String ipAddressStr ="168";

	public static void convertIntegerToBinary() throws UnknownHostException {
		String[] octetArray = ipAddressStr.split("\\.");
		assert octetArray.length == 4;
		byte[] ipAddressBytes = new byte[4];
		for (int i = 0; i < 4; ++i) {
			ipAddressBytes[i] = Integer.valueOf(octetArray[i]).byteValue();
		}
		System.out.println(Arrays.toString(ipAddressBytes));
	}

	public static void main(String[] args) throws UnknownHostException {
		convertIntegerToBinary();
	}

}
