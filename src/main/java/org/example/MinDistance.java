package org.example;

public class MinDistance {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 4, 5, 6, 6, 8 };
		int x = 4, y = 6;
		System.out.println("Minimum distance: " + minDistance(arr, x, y));
	}

	public static int minDistance(int[] arr, int x, int y) {
		int lastX = -1, lastY = -1;
		int minDist = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				lastX = i;
				if (lastY != -1) {
					minDist = Math.min(minDist, lastX - lastY);
				}
			} else if (arr[i] == y) {
				lastY = i;
				if (lastX != -1) {
					minDist = Math.min(minDist, lastY - lastX);
				}
			}
		}

		return minDist == Integer.MAX_VALUE ? -1 : minDist; // Return -1 if x or y not found
	}
}