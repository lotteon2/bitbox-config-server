package io.github.bitbox.bitbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductWishInfoDto {

    private String productId;
    private String productName;
    private Long productPrice;
    private String productThumbnailImage;
    private Long stockQuantity;
    private Boolean isActivate;

}