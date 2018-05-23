package edu.tseidler;

import edu.tseidler.hanoi.Hanoi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi(1);
        hanoi.solution();
        System.out.println(hanoi);
        System.out.println("finished");

        List<Integer> list = Arrays.asList(1, 2, 3, 10, 20);
        Subsets<Integer> subsets = new Subsets<>(list);
        System.out.println(subsets.getSubsets());

        Subsets<String> subsets2 = new Subsets<>(Arrays.asList("awruk".split("")));
        System.out.println(subsets2.getSubsets());
    }
}
