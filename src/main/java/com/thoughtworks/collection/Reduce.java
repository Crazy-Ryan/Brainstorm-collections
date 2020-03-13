package com.thoughtworks.collection;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return arrayList.stream().mapToInt(num -> num).max().orElse(0);
    }

    public double getMinimum() {
        return arrayList.stream().mapToInt(num -> num).min().orElse(0);
    }

    public double getAverage() {
        return arrayList.stream().mapToInt(num -> num).average().orElse(0);
    }

    public int getFirstEven() {
        return arrayList.stream().mapToInt(num -> num).filter(num -> num % 2 == 0).findFirst().orElse(-1);
    }
}