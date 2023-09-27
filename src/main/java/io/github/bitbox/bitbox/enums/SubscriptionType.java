package io.github.bitbox.bitbox.enums;

public enum SubscriptionType {
    ONE_DAY(0),
    THREE_DAYS(1),
    SEVEN_DAYS(2);

    private final int value;

    SubscriptionType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}