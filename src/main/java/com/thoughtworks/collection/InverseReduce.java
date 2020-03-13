package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {
    }

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        if (number - 2 < 0) {
            return new ArrayList<>();
        } else {
            List<Integer> arr = divideToSmaller(number - 2);
            arr.add(0, number - 2);
            return arr;
        }
    }
}