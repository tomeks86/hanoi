package edu.tseidler;

import edu.tseidler.hanoi.Hanoi;

public class Main {
    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi(5);
        hanoi.solution();
        System.out.println(hanoi);
        System.out.println("finished");
    }
}
