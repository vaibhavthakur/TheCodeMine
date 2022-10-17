package com.javaminds.thecodemine.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,6,5);
        System.out.println("Normal for loop");
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        System.out.println("Enhanced for loop");
        for(int i: nums){
            System.out.println(i);
        }

        System.out.println("for loop using Java 8");
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        nums.forEach(consumer);

        System.out.println("for loop using Java 8 Lambda exp");
        nums.forEach(n -> System.out.println(n));

    }
}
