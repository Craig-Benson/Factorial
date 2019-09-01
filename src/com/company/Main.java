package com.company;



public class Main {

    public static void main(String[] args) {

        forloop(5);
        recursion(4);
        tailrecursion(5);

    }

    public static int forloop(int n) {

        int factorial = 1;

        for (int i = 1; i <= n; i++) {

            factorial *= i;
        }

        return factorial;
    }

    public static int recursion(int n) {

        if (n > 1) {
            return n * recursion(n - 1);
        }

        return n;
    }

    public static int tailrecursion(int n) {

        if (n < 1) {
            return n;
        }

        return n * tailrecursion(n - 1);
    }


}

