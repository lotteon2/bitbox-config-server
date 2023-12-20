package io.github.bitbox.bitbox.enums;

public enum CouponTypeEnum {

    WELCOME("회원가입 쿠폰"),
    YANGBAN("양반구독결제 쿠폰"),
    PROMOTION("이벤트 쿠폰");

    private String value;

    CouponTypeEnum(String value) {
        this.value = value;
    }
}
