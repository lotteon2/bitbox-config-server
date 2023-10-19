package io.github.bitbox.bitbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemberValidDto {
    private String memberId;
    private Long classId;
}