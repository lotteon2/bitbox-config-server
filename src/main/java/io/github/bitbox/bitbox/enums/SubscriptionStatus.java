package io.github.bitbox.bitbox.enums;

public enum SubscriptionStatus {
    EXPIRED(0),
    ONE_HOUR_LEFT(1),
    OTHER(2);

    private final int code;

    SubscriptionStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}