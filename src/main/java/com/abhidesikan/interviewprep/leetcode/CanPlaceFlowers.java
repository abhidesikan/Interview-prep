package com.abhidesikan.interviewprep.leetcode;

public class CanPlaceFlowers {

	public boolean canPlaceFlowers(int[] flowerbed, int n) {

		int size = flowerbed.length;
		if (size < 1) {
			return false;
		}
		if (size == 1) {
			if ((flowerbed[size - 1] == 1 && n == 0) || (flowerbed[size-1] == 0 && n == 1) || flowerbed[size-1] == 0 && n == 0) {
				return true;
			} else {
				return false;
			}
		}

		System.out.println(size);

		for (int i = 0; i < size; i++) {
			if(n == 0) {
				break;
			}
			if (i == 0) {
				if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
					flowerbed[i] = 1;
					n--;
				}
			} else if (i == size - 1) {
				if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
					flowerbed[i] = 1;
					n--;
				}
			} else {
				if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) {
					flowerbed[i] = 1;
					n--;
				}
			}
		}

		if (n == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = {0,0,1,0,0};
		System.out.println(new CanPlaceFlowers().canPlaceFlowers(arr, 1));
	}
}
