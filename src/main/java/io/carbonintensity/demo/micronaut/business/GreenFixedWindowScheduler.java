package io.carbonintensity.demo.micronaut.business;

import java.time.Duration;

import jakarta.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.carbonintensity.scheduler.GreenScheduled;

@Singleton
public class GreenFixedWindowScheduler {

    private static final Logger log = LoggerFactory.getLogger(GreenFixedWindowScheduler.class);

    private final DemoBusinessService businessService;

    public GreenFixedWindowScheduler(DemoBusinessService businessService) {
        this.businessService = businessService;
    }

    @GreenScheduled(fixedWindow = "00:00 23:59", duration = "40s", carbonIntensityZone = "NL")
    public void greenFixedWindowJob() {
        log.info("Run Green Scheduled Fixed-Window Job");
        businessService.runBusinessTasks(Duration.ofSeconds(40));
    }
}
