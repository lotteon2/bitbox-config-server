package io.github.bitbox.bitbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ConsumerOrderListResponseDto {
    private OrderInfo order;
    private List<ProductInfo> product;
    private PaymentInfo payment;
    private DeliveryInfo delivery;
}