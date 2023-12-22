package io.github.bitbox.bitbox.dto;

import io.github.bitbox.bitbox.enums.PaymentMethodEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class SubscriptionBatchDto {
    private PaymentMethodEnum paymentMethod;
    private SubscriptionBatchInterface subscriptionBatchInterface;
}