package com.company;

import java.util.Arrays;

public class massive {
    public static void invert(int[] arr) {
        for (int k = 0; k < arr.length / 2; k++) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;


        }
    }

    public static void sort(int[] data) {

        for (int barrier = data.length - 1; barrier >= 0; barrier--) {

            for (int index = 0; index < barrier; index++) {
                if (data[index] > data[index + 1]) {
                    int tmp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = tmp;
                }
            }
        }


    }
}
