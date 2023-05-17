package org.example;

public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService();

        long shouldCalculateForRegisteredAndUnderLimit = service.calculate(1_000, true);
        System.out.println(shouldCalculateForRegisteredAndUnderLimit + " expected 30");

        long shouldCalculateForRegisteredAndOverLimit = service.calculate(1_000_000, true);
        System.out.println(shouldCalculateForRegisteredAndOverLimit + " expected 500");

        long shouldCalculateForUnregisteredAndUnderLimit = service.calculate(1_000, false);
        System.out.println(shouldCalculateForUnregisteredAndUnderLimit + " expected 10");

        long shouldCalculateForUnregisteredAndOverLimit = service.calculate(1_000_000, false);
        System.out.println(shouldCalculateForUnregisteredAndOverLimit + " expected 500");
        }
    }