package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Program {

    public void start() {
        System.out.println("Enter 3 digits separated by a white space.");

        Scanner sc = new Scanner(System.in);
        List<String> list = List.of(sc.nextLine().split(" "));

        System.out.println(list.stream().min(Comparator.naturalOrder()).get());
    }
}
