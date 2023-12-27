package io.github.bitbox.bitbox.dto;

import io.github.bitbox.bitbox.enums.ProductOrderStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ProductInfo {
    private Long productOrderId;
    private String productId;
    private String productName;
    private Long productCount;
    private Long productPrice;
    private Long productTotalAmount;
    private ProductOrderStatusEnum productOrderStatus;
    private String productThumbnailImageUrl;
}
