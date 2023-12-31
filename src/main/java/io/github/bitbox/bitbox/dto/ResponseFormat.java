package io.github.bitbox.bitbox.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.bitbox.bitbox.enums.FailureTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 domain : all
 detail : Rest 통신시 사용되는 Success Format Dto
 method :
 comment :
 */

@Getter
@Builder
@AllArgsConstructor
public class ResponseFormat<T> {
    private Integer code;
    private String message;
    private String detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private FailureTypeEnum failure;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final T data;
}