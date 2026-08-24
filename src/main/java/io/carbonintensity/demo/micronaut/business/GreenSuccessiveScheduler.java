package io.carbonintensity.demo.micronaut.business;

import java.time.Duration;

import jakarta.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.carbonintensity.scheduler.GreenScheduled;

@Singleton
public class GreenSuccessiveScheduler {

    private static final Logger log = LoggerFactory.getLogger(GreenSuccessiveScheduler.class);

    private final DemoBusinessService businessService;

    public GreenSuccessiveScheduler(DemoBusinessService businessService) {
        this.businessService = businessService;
    }

    @GreenScheduled(successive = "30s 2m30s 2m30s", duration = "40s", carbonIntensityZone = "NL")
    public void greenSuccessiveJob() {
        log.info("Run Green Scheduled Successive Job");
        businessService.runBusinessTasks(Duration.ofSeconds(40));
    }
}
