package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FizzBuzz {
    public List<String> fizzBuzz(int end) {
        List<String> retVal = new ArrayList<>();

        for (int i = 1; i <= end; i++) {
            boolean fizz = (i % 3 == 0);
            boolean buzz = (i % 5 == 0);

            retVal.add((fizz && buzz) ? "FizzBuzz" : buzz ? "Buzz" : fizz ? "Fizz" : Integer.toString(i));
        }

        return retVal;
    }

    public String fizzBuzzFunctional(int end) {
        return Optional.of(end)
                .map(i -> {
                    if (i % (3 * 5) == 0) {
                        return "FizzBuzz";
                    } else if (i % 3 == 0) {
                        return "Fizz";
                    } else if (i % 5 == 0) {
                        return "Buzz";
                    } else {
                        return Integer.toString(i);
                    }
                }).get();
    }
}
