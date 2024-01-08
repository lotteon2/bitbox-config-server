package io.github.bitbox.bitbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class ImpAuthInfoForUpdateDto {

    private Long consumerId;
    private String name;
    private Integer age;
    private String phoneNumber;
}
