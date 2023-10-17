package io.github.bitbox.bitbox.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class MemberTraineeResult {
    private List<MemberValidDto> validMember;
    private List<MemberValidDto> invalidMember;
}
