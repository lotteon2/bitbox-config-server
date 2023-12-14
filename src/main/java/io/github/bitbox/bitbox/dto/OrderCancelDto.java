package io.github.bitbox.bitbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderCancelDto {
    private Long consumerId;
    private String ordersId;
    private String couponCode;
    private Long point;
    private Long cancelAmount;
    private List<ProductUpdateDto> productUpdateDtoList;
}