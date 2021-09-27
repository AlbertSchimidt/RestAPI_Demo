package com.example.demo.utils;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

public class RandomValue {

    public static Double getRandomDouble(Optional<Double> minDouble, Optional<Double> maxDouble) {
        Double min = 0d;
        Double max = 100d;

        if (Optional.ofNullable(minDouble).isPresent()) {
            min = minDouble.orElse(0d);
        }

        if (Optional.ofNullable(maxDouble).isPresent()) {
            max = maxDouble.orElse(100d);
        }

        return (ThreadLocalRandom.current().nextDouble(min, max) * 100d / 100d);
    }

}
