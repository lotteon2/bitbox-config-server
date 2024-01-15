package io.github.bitbox.bitbox.enums;

import lombok.Getter;

@Getter
public enum FailureTypeEnum {
    NOT_ORDER_CONFIRM("주문확정이 아닌 건에 대한 요청"),
    NOT_CORRESPOND_CREDENTIALS("잘못된 이메일 or 비밀번호로 로그인 시도 시"),
    DISABLED_MEMBER("탈퇴한 회원"),
    DUPLICATED_EMAIL("이메일 중복으로 회원 가입 실패 "),
    STOCK_OVER("장바구니에 재고 이상 수량을 담을 때"),
    NON_PRODUCT("비활성화된 상품일 시"),
    SOLD_OUT_P_COUPONS("쿠폰 수령 실패(쿠폰 수량 부족)"),
    NOT_OPEN_P_COUPON("쿠폰 수령 실패(쿠폰 수령 시각 미도달)"),
    NOT_VALID_REFRESH_TOKEN("access-token 재발급 실패, "),
    NOT_CORRESPOND_ORIGIN_PWD("비밀번호 변경 시, 기존 비밀번호가 일치하지 않을 때,"),
    OVER_PARTICIPATION("경매 물품 등록 시 참여 인원 초과일 경우,"),
    INSUFFICIENT_CREDIT("경매 크레딧 부족,"),
    NOT_FOUND_CONSUMER("찾을 수 없는 소비자"),
    INSUFFICIENT_POINT("포인트 부족"),
    POINT_USAGE_OVER_10_PERCENTAGE("포인트 사용액 10% 초과"),
    INSUFFICIENT_MIN_ORDER_PRICE("쿠폰 최소 사용 금액 미달"),
    NOT_FOUND_COUPON("찾을 수 없는 쿠폰"),
    EXPIRED_COUPON("만료된 쿠폰"),
    INSUFFICIENT_STOCK("재고가 부족합니다"),
    LACK_OF_STOCK("재고가 부족합니다."),
    MISMATCH_TOTAL_PRODUCT_AMOUNT("상품이 총 금액이 일치하지 않습니다."),
    INCORRECT_COUPON_DISCOUNT_AMOUNT("쿠폰 코드와 할인 금액 불일치"),
    EXISTING_SUBSCRIPTION_PAYMENT("이미 정기 구독에 가입되어 있습니다."),
    INVALID_CONSUMER_CREDIT("크레딧이 부족합니다.");

    private final String value;

    FailureTypeEnum(String value) {
        this.value = value;
    }
}