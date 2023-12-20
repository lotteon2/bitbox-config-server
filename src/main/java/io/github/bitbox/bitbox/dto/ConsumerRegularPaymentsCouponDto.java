package io.github.bitbox.bitbox.dto;

import io.github.bitbox.bitbox.enums.CouponTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class ConsumerRegularPaymentsCouponDto {
    private Long consumerId;
    private CouponTypeEnum couponType;
    private LocalDateTime successedAt; // 양반 구독 결제 완료 날짜
}
