package io.github.bitbox.bitbox.dto;

import io.github.bitbox.bitbox.enums.PaymentMethodEnum;
import io.github.bitbox.bitbox.enums.SubscriptionTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubscriptionDto {
    private Long consumerId;
    private SubscriptionTypeEnum subscriptionType;
    private Long paymentAmount;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private PaymentMethodEnum paymentMethod;
    private Subscripton subscripton;
}