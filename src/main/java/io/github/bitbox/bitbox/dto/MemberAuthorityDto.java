package io.github.bitbox.bitbox.dto;

import io.github.bitbox.bitbox.enums.AuthorityType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemberAuthorityDto {
    private String memberId;
    private AuthorityType memberAuthority;
}