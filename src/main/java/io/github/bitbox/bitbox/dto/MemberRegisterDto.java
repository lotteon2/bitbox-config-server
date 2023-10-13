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
public class MemberRegisterDto {
    private String id;
    private String email;
    private String name;
    private String profileImg;
    private AuthorityType authority;
    private Long classId;
}
