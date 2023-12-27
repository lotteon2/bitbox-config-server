package io.github.bitbox.bitbox.dto;

import io.github.bitbox.bitbox.enums.OrderStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class OrderInfo {
    private String ordersId;
    private LocalDateTime orderDate;
    private OrderStatusEnum orderStatus;
    private boolean isAuction;
}
