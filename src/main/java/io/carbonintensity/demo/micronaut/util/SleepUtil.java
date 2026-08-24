package io.carbonintensity.demo.micronaut.util;

import java.time.Duration;

public class SleepUtil {
    public static void sleep(Duration duration) {
        try {
            Thread.sleep(duration.toMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
