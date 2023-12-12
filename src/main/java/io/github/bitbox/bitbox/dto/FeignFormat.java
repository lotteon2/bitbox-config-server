package io.github.bitbox.bitbox.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
     domain : all
     detail : Feign 통신시 사용되는 Format Dto
     method : Feign
     comment : null column의 경우 값이 안보이는 속성 추가
 */
@AllArgsConstructor
@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeignFormat<T> {

    private final Integer code;
    private final String message;
    private final String detail;
    private final String failure;
    private final T data;
}