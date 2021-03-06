package com.thoughtworks.collection;


import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        return array.stream().filter(num -> 0 == num % 2).collect(Collectors.toList());
    }

    public List<Integer> filterMultipleOfThree() {
        return array.stream().filter(num -> 0 == num % 3).collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        return firstList.stream().filter(num -> secondList.stream().anyMatch(num2 -> num2.equals(num))).collect(Collectors.toList());
    }

    public List<Integer> getDifferentElements() {
        return array.stream().distinct().collect(Collectors.toList());
    }
}