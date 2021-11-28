package com.amalgupta.interviews.educative.java;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ArraysExamplesTest {


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Tag("Search second biggest Element in an array")
    @Test
    public void arraySearch_secondLargest() {
        int[] input = new int[]{65,21,42,7,90,24};
        int result = ArraysExamples.SecondLargest.searchSecondLargestUsingLists(input);
        int resultUsingPQueue = ArraysExamples.SecondLargest.searchSecondLargestUsingPriorityQueue(input);
        int resultUsingArraySort = ArraysExamples.SecondLargest.searchSecondLargestUsingArraysSort(input);
        int resultUsingBruteForce = ArraysExamples.SecondLargest.searchSecondLargestUsingBruteForce(input);
        Assert.assertEquals(65, result);
        Assert.assertEquals(65, resultUsingPQueue);
        Assert.assertEquals(65, resultUsingArraySort);
        Assert.assertEquals(65, resultUsingBruteForce);
    }

}