package io.github.bitbox.bitbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
    domain : payment, consumer
    detail : 경매 크레딧 결제 이후 크레딧 충전을 위해서 사용되는 DTO
    method : kafka
    comment : consumerId, credit은 크레딧 충전을 위한 값들이고 tid, cancelAmount, cancelTaxFreeAmount는 보상패턴을 위한 값들임
 */
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreditUpdateDto {
    private Long consumerId;
    private Long credit;
    private String tid;
    private Long cancelAmount;
    private Long cancelTaxFreeAmount;
}
