package io.github.bitbox.bitbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PaymentInfo {
    private Long minusPointAmount;
    private Long minusCouponAmount;
    private Long totalPrice;
    private String couponCode;
    private Long realPrice;
}