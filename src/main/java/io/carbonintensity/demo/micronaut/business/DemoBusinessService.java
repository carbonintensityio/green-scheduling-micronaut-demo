package io.carbonintensity.demo.micronaut.business;

import java.time.Duration;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.carbonintensity.scheduler.micronaut.GreenSchedulerConfigurationProperties;

import static io.carbonintensity.demo.micronaut.util.SleepUtil.sleep;

@Singleton
public class DemoBusinessService {

    private final Logger log = LoggerFactory.getLogger(DemoBusinessService.class);

    @Inject
    GreenSchedulerConfigurationProperties properties;

    public void runBusinessTasks(final Duration duration) {
        log.info("Running business tasks during {}.", duration);
        sleep(duration);
        log.info("Finished business tasks.");
    }

}
