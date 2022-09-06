package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        System.out.println("Enter 3 digits separated by a white space.");

        Scanner sc = new Scanner(System.in);
        List<String> list = List.of(sc.nextLine().split(" "));

        System.out.println(list.stream().min(Comparator.naturalOrder()).get());

    }
}