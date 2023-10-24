package io.github.bitbox.bitbox.jwt;

import io.github.bitbox.bitbox.enums.AuthorityType;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class JwtPayload {
    private String memberId;
    private Long classId;
    private String memberNickname;
    private AuthorityType memberAuthority;
    private String memberProfileImg;
}