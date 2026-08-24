package io.carbonintensity.demo.micronaut.business;

import java.time.Duration;

import jakarta.inject.Singleton;

import io.micronaut.scheduling.annotation.Scheduled;

@Singleton
public class RegularScheduler {

    private final DemoBusinessService demoBusinessService;

    public RegularScheduler(DemoBusinessService demoBusinessService) {
        this.demoBusinessService = demoBusinessService;
    }

    @Scheduled(cron = "0 0 1 1 1 *")
    public void regularJob() {
        demoBusinessService.runBusinessTasks(Duration.ofSeconds(6));
    }
}
