package io.github.bitbox.bitbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AdminBoardRegisterDto {
    private Long classId;
    private String classCode;
}