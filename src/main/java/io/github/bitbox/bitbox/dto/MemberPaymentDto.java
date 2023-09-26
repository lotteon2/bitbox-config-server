package io.github.bitbox.bitbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemberPaymentDto {
    private String memberId;
    private Long memberCredit;
    private String tid;
    private Long cancelAmount;
    private Long cancelTaxFreeAmount;
}