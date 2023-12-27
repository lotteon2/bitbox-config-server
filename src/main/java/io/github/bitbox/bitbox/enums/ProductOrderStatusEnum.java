package io.github.bitbox.bitbox.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ProductOrderStatusEnum {
    ORDER,
    CANCEL,
    CONFIRMED,
    SHIPPING,
    COMPLETED
}
