package io.github.bitbox.bitbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemberTraineeResult {
    private List<MemberValidDto> validMember;
    private List<MemberValidDto> invalidMember;

    public static MemberTraineeResult convertLists(List<MemberValidDto> valid, List<MemberValidDto> invalid) {
        return MemberTraineeResult.builder().validMember(valid).invalidMember(invalid).build();
    }
}
