package pbd;

import java.util.Arrays;
import java.util.Random;

public class BasicArrays2 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] values = new int[10];

		for (int i = 0; i < values.length; i++) {
				values[i] = 1 + r.nextInt(100);
			}
		System.out.println(Arrays.toString(values));
		}
	}
