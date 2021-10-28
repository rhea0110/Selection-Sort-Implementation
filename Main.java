package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {22, -10, 0, 11, 13, -99};
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            int min = i;

            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
