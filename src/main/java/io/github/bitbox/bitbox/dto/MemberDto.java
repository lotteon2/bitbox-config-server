package io.github.bitbox.bitbox.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
  private Long memberId;
  private String nickname;
  private String profileImage;
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long credit;
}