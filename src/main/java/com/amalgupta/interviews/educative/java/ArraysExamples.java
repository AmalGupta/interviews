package com.amalgupta.interviews.educative.java;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;


public class ArraysExamples {

    public static class SecondLargest {
        /**
         * Arrays to List and Sort Implementation
         *
         * @param arr
         * @return
         */
        public static Integer searchSecondLargestUsingLists(final int[] arr) {
            Integer[] arWrapped = ArrayUtils.toObject(arr);
            List<Integer> sortedList = Arrays.asList(arWrapped);
            Collections.sort(sortedList);
            return sortedList.get(sortedList.size() - 2);
        }

        /**
         * Priority Queue Implementation
         *
         * @param arr
         * @return
         */
        public static Integer searchSecondLargestUsingPriorityQueue(final int[] arr) {
            int length = arr.length;
            PriorityQueue<Integer> pQueue = new PriorityQueue<>();

            for (int i = 0; i < length; i++) {
                pQueue.add(arr[i]);
            }
            return pQueue.stream().skip(pQueue.size() - 3).findFirst().get();
        }

        /**
         * Arrays Sort Method.
         *
         * @param arr
         * @return
         */
        public static Integer searchSecondLargestUsingArraysSort(final int[] arr) {
            Arrays.sort(arr);
            return arr[arr.length - 2];
        }


        /**
         * Arrays Sort Method.
         *
         * @param arr
         * @return
         */
        public static Integer searchSecondLargestUsingBruteForce(final int[] arr) {

            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            int maxIndex = 0;

            for(int i = 0 ; i < arr.length ; i++) {
                if (arr[i] > max) {
                 max = arr[i];
                 maxIndex = i;
                }
            }

            arr[maxIndex] = Integer.MIN_VALUE;

            for(int i = 0 ; i < arr.length ; i++) {
                secondMax = (secondMax > arr[i]) ? secondMax : arr[i];
            }
            return secondMax;
        }

    }


}
