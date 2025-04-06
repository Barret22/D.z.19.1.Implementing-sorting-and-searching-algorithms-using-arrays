package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // від 0 до 99
        }

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        ArrayUtils.mergeSort(array);
        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter number to search: ");
        int target = scanner.nextInt();

        int index = ArrayUtils.binarySearch(array, target);
        if (index != -1) {
            System.out.println("Found " + target + " at index: " + index);
        } else {
            System.out.println("Number " + target + " not found.");
        }
    }
}

