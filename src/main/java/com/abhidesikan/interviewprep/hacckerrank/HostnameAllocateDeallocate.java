package com.abhidesikan.interviewprep.hacckerrank;

import java.util.ArrayList;
import java.util.HashMap;

public class HostnameAllocateDeallocate {

	static HashMap<String, ArrayList> map = new HashMap<>();

	public static String allocateServer(String hostType) {
		if(map.containsKey(hostType)) {
			ArrayList<Integer> temp = map.get(hostType);
			int[] arr = temp.stream().mapToInt(i -> i).toArray();
			int toAllocate = ServerAllocation.nextServerNumber(arr);
			map.get(hostType).add(toAllocate);
			return hostType + toAllocate;
		} else {
			ArrayList temp = new ArrayList();
			temp.add(1);
			map.put(hostType, temp);
			return hostType + 1;
		}
	}

	public static void deallocateServer(String hostname) {
		int index = findIndex(hostname);
		String hostType = index == 0? hostname : hostname.substring(0, index);
		int serverToDeAllocate = index == 0? 1 : Integer.parseInt(hostname.substring(index));
		if(map.containsKey(hostType)) {
			map.get(hostType).remove(Integer.valueOf(serverToDeAllocate));
		}
	}

	public static int findIndex(String hostname) {
		int lastIndex = 0;

		for(int i=0; i<hostname.length(); i++) {
			if(Character.isDigit(hostname.charAt(i))) {
				lastIndex = i;
				break;
			}
		}
		return lastIndex;
	}

}
