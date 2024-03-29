package io.github.bitbox.bitbox.dto;

import io.github.bitbox.bitbox.enums.PaymentMethodEnum;
import io.github.bitbox.bitbox.enums.PaymentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
     domain : order
     detail : order에서 해당 정보를 기반으로 order product_order를 만든다
     method : Kafka
     comment :
 */
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderCreationDto {
    // 주문 정보
    private Long totalPrice;
    private Long consumerId;
    private LocalDateTime orderDate;
    private String orderId;

    // 주문-상품 정보
    private List<ProductInfoDto> productInfoDtoList;

    // 배송 정보
    private String recipientName;
    private String recipientPhoneNumber;
    private String basicAddress;
    private String addressDetail;
    private String zoneCode;

    // 결제 정보
    private PaymentTypeEnum paymentType;
    private PaymentMethodEnum paymentMethod;
    private PaymentMethod paymentInfo;

    // 장바구니 주문 여부
    private Boolean cart;
}