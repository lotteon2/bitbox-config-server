package io.github.bitbox.bitbox.enums;

public enum NotificationTypeEnum {
    OUT_OF_STOCK("재고 소진"),
    BALANCE_ACCOUNTS("정산"),
    SUCCESS_SUBSCRIPTION_PAYMENTS("구독 결제 성공"),
    INTERNAL_ORDER_SERVER_ERROR("주문 서버 오류"),
    INTERNAL_PAYMENT_SERVER_ERROR("결제 서버 오류"),
    INTERNAL_PRODUCT_SERVER_ERROR("상품 서버 오류"),
    INTERNAL_CONSUMER_SERVER_ERROR("소비자 서버 오류"),
    INTERNAL_COUPON_SERVER_ERROR("쿠폰 서버 오류");

    private String value;

    NotificationTypeEnum(String value) {
        this.value = value;
    }
}
