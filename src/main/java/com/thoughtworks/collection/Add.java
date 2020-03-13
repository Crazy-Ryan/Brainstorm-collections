package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        return IntStream.rangeClosed(Math.min(leftBorder, rightBorder), Math.max(leftBorder, rightBorder)).filter(num -> 0 == num % 2).sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        return IntStream.rangeClosed(Math.min(leftBorder, rightBorder), Math.max(leftBorder, rightBorder)).filter(num -> 1 == num % 2).sum();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(num -> num * 3 + 2).reduce(Integer::sum).orElse(0);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(num -> 1 == num % 2 ? num * 3 + 2 : num).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(num -> 1 == num % 2).map(num -> num * 3 + 5).reduce(Integer::sum).orElse(0);
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        List<Integer> evenNumList = arrayList.stream().filter(num -> 0 == num % 2).sorted().collect(Collectors.toList());
        int length = evenNumList.size();
        return 1 == length % 2 ? evenNumList.get((length - 1) / 2) : (evenNumList.get(length / 2 - 1) + evenNumList.get(length / 2)) / 2.0;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        List<Integer> evenNumList = arrayList.stream().filter(num -> 0 == num % 2).collect(Collectors.toList());
        return evenNumList.stream().reduce(Integer::sum).orElse(0) * 1.0 / evenNumList.size();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        return arrayList.stream().filter(num -> 0 == num % 2).anyMatch(num -> num.equals(specialElment));
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(num -> 0 == num % 2).distinct().collect(Collectors.toList());
    }
}
