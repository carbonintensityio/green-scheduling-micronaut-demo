package io.carbonintensity.demo.micronaut;

import org.junit.jupiter.api.Test;

import io.micronaut.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

class GreenSchedulingMicronautDemoApplicationTest {

    @Test
    void contextLoads() {
        try (ApplicationContext context = ApplicationContext.run()) {
            assertThat(context.isRunning()).isTrue();
        }
    }
}
