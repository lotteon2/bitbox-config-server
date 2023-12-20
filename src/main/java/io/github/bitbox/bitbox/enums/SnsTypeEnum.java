package io.github.bitbox.bitbox.enums;

public enum SnsTypeEnum {
    KAKAO("카카오"),
    GOOGLE("구글");

    private final String value;

    SnsTypeEnum(String value) {
        this.value = value;
    }
}
