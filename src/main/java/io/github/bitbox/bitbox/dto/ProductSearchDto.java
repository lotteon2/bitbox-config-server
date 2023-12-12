package io.github.bitbox.bitbox.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class ProductSearchDto {
    private Long totalPrice;
    private List<ProductUpdateDto> productUpdateDtoList;
}