package at.htl;

import java.util.Random;
import java.util.Scanner;

public class SortComplexity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Anzahl der zu sortierende Arrays: ");
        int number = scanner.nextInt();

        System.out.println("Größe der Arrays: ");
        int length = scanner.nextInt();




    }

    // Sorts an array of random numbers and returns the sorting run time in ms
    public static long sortRandomArray(int length) {

        int[] array = generateRandomArray(length);



        return 0;
    }

    // Returns an array of random numbers
    public static int[] generateRandomArray(int length) {

        int[] array = new int[length];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
           array[i] = random.nextInt(2000);
        }

        return array;
    }

    // Sorts an array of numbers in ascending order
    public static void sort(int[] array) {

        int min;
        int tmp;

        for (int i = 0; i < array.length-1; i++) {
            min = i;

            for (int j = 0; j < array.length; j++) {

            }
        }



    }

    // Swaps the array elements with index i and j
    public static void swap(int[] array, int i, int j) {

    }
}
