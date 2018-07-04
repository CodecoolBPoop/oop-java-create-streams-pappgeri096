package com.codecool;

import java.util.List;

public class Fibonacci {


    public static Integer fib(int n){
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
}
