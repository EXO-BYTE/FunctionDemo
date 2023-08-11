package com.Function;

import java.util.function.Predicate;

public class CandidateAges {
    public static void main(String[] args) {
        Candidate candidate = new Candidate();
        Predicate<Integer> agePredicate = candidate::checkAge;

        int[] ageArray = {12, 23, 11, 19, 35, 22};

        for (int age : ageArray) {
            agePredicate.test(age);
        }
    }
}