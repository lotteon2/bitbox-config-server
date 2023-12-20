package io.github.bitbox.bitbox.dto;

import io.github.bitbox.bitbox.enums.CouponTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class ConsumerRegularPaymentsCouponDto {

    private Long consumerId;
    private CouponTypeEnum couponName;
    private Timestamp successedAt; // 양반 구독 결제 완료 날짜
}
