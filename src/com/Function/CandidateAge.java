package com.Function;
import java.util.function.Predicate;

class Candidate {
    public boolean checkAge(int age) {
        if (age > 18) {
            System.out.println("valid age");
        } else {
            System.out.println("invalid age");
        }
		return false;
    }
}

