package io.github.bitbox.bitbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConsumerInfoDto {
  private String memberNickname;
  private String profileImage;
  private Long credit;

  public MemberDto to(Long consumerId) {
    return MemberDto.builder()
        .memberId(consumerId)
        .nickname(memberNickname)
        .profileImage(profileImage)
        .credit(credit)
        .build();
  }
}
