package tasks;

import java.util.ArrayList;
import java.util.Collections;

public class Tasks251_260 {
    public static int task251getMaxNumber(ArrayList<Integer> numbers) {
        System.out.println("Task - 251");
        int max = Collections.max(numbers);
        System.out.println("Max number on List = " + max);
        System.out.println("-------------------------------");
        return max;
    }

    public static int task252getMinNumber(ArrayList<Integer> numbers) {
        System.out.println("Task - 252");
        int min = Collections.min(numbers);
        System.out.println("Min number on List = " + min);
        System.out.println("-------------------------------");
        return min;
    }

    public static void task253(ArrayList<Integer> numbers) {
        System.out.println("Task - 253 start");
        int max = task251getMaxNumber(numbers);
        int min = task252getMinNumber(numbers);
        int result = max + min;
        System.out.println("result = " + result);
        System.out.println("--------------Task - 253 End-----------------\n");
    }


    public static void task254(ArrayList<Integer> numbers) {
        System.out.println("Task - 254 Start");
        int max = task251getMaxNumber(numbers);
        int min = task252getMinNumber(numbers);
        int result = max * min;
        System.out.println("result = " + result);
        System.out.println("--------------Task - 254 End-----------------\n");
    }

    public static void task255(ArrayList<Integer> numbers) {
        System.out.println("Task - 255 Start");
        int max = task251getMaxNumber(numbers);
        int indexMaxNumber = numbers.indexOf(max);
        int result = max + indexMaxNumber;
        System.out.println("Max Number index " + indexMaxNumber + "\nresult = " + result);
        System.out.println("--------------Task - 255 End-----------------\n");
    }

    public static void task256(ArrayList<Integer> numbers) {
        System.out.println("Task - 256 Start");
        int min = task252getMinNumber(numbers);
        int indexMinNumber = numbers.indexOf(min);
        int result = min + indexMinNumber;
        System.out.println("Max Number index " + indexMinNumber + "\nresult = " + result);
        System.out.println("-------------Task - 256 End------------------\n");
    }


    public static void task257(ArrayList<Integer> numbers) {
        System.out.println("Task - 257 Start");
        int max = task251getMaxNumber(numbers);
        int indexMaxNumber = numbers.indexOf(max);
        System.out.println("First max number index on List = " + indexMaxNumber);
        System.out.println("--------------Task - 257 End-----------------\n");
    }

    public static void task258(ArrayList<Integer> numbers) {
        System.out.println("Task - 257 Start");
        int max = task251getMaxNumber(numbers);
        int indexMaxNumber = numbers.lastIndexOf(max);
        System.out.println("Last max number index on List = " + indexMaxNumber);
        System.out.println("-------------Task - 258 End------------------\n");
    }

    public static void task259(ArrayList<Integer> numbers) {
        System.out.println("Task - 257 Start");
        int min = task252getMinNumber(numbers);
        int indexMinNumber = numbers.indexOf(min);
        System.out.println("First min number index on List = " + indexMinNumber);
        System.out.println("--------------Task - 259 End-----------------\n");
    }


    public static void task260(ArrayList<Integer> numbers) {
        System.out.println("Task - 260 Start");
        int min = task252getMinNumber(numbers);
        int indexMinNumber = numbers.lastIndexOf(min);
        System.out.println("Last min number index on List = " + indexMinNumber);
        System.out.println("--------------Task - 260 End-----------------\n");
    }

}

