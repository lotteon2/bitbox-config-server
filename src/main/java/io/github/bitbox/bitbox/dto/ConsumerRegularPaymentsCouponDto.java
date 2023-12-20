package io.github.bitbox.bitbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class ConsumerRegularPaymentsCouponDto {
    private Long consumerId;
    private LocalDateTime successedAt; // 양반 구독 결제 완료 날짜
}
