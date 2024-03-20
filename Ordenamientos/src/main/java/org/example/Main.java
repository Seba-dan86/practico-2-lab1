package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[]datos={2,5,4,7,9,8,6,44,23,1};
        public void shellSort(int[])datos{
            int n = datos.length;

            for (int gap = n/2; gap > 0; gap /= 2) {

                for (int i = gap; i < n; i += 1) {
                    // add arr[i] to the elements that have been gap sorted
                    // save arr[i] in temp and make a hole at position i
                    int temp = datos[i];

                    // shift earlier gap-sorted elements up until the correct location for arr[i] is found
                    int j;
                    for (j = i; j >= gap && datos[j - gap] > temp; j -= gap) {
                        datos[j] = datos[j - gap];
                    }

                    // put temp (the original arr[i]) in its correct location
                    datos[j] = temp;
                }
            }


    }
}
