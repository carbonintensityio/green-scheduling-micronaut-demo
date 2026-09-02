# Green Scheduling Micronaut Demo

This is a demo project showcasing the integration of the [Green Scheduling Scheduler](https://github.com/carbonintensityio/green-scheduler) with a Micronaut application. The goal of this demo is to provide an example of how to utilize carbon intensity data for scheduling tasks, helping to make more energy-efficient decisions for your application.

It mirrors [green-scheduling-spring-boot-demo](https://github.com/carbonintensityio/green-scheduling-spring-boot-demo) and [green-scheduling-quarkus-demo](../green-scheduling-quarkus-demo), showing the same scheduling patterns on Micronaut.

## Overview

The `green-scheduling-micronaut-demo` project demonstrates how to schedule tasks based on real-time carbon intensity data, optimizing energy consumption by aligning tasks with periods of lower carbon emissions.

## Prerequisites

Before running the demo, ensure you have the following:

- Java 17 or newer
- Maven

## Setup

1. Clone the repository.
2. Request an API key at https://carbonintensity.io
3. Add the API key to `src/main/resources/application.properties` (or set it via the `CARBONINTENSITY_API_KEY` environment variable).
4. Run the application with `./mvnw mn:run`.

## Notes

- Depends on `io.carbonintensity:green-scheduler-micronaut` v0.8.6, published on Maven Central. This extension is still **experimental** (canary-tier in green-scheduler's own compatibility matrix) — see [green-scheduler's README](https://github.com/carbonintensityio/green-scheduler#usage) for details.
- Built and tested against Micronaut 4.10.25.
- There is no HTTP-facing extension included; this demo only exercises the scheduler.