package io.github.bitbox.bitbox.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.bitbox.bitbox.enums.FailureTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * domain : all
 * detail : Feign 통신시 사용되는 Format Dto
 * method : Feign
 * comment : null column의 경우 값이 안보이는 속성 추가
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeignFormat<T> {
    private Integer code;
    private String message;
    private String detail;
    private FailureTypeEnum failure;
    private T data;
}