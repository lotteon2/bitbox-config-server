package io.github.bitbox.bitbox.dto;

import lombok.*;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductIdListDto {
    private List<String> productIdList;
}