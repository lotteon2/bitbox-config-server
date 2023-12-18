package io.github.bitbox.bitbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
     domain : order, consumer, payment
     detail : kakao 결제 취소시 사용되는 DTO
     method : Kafka, Feign
     comment :
 */
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class KakaoPayCancelDto {
    private String tid;
    private Long cancelAmount;
    private Long cancelTaxFreeAmount;

    public String generateKakaoPayCancelData(String cid){
        return "cid=" + cid
                + "&tid=" + this.getTid()
                + "&cancel_amount=" + this.getCancelAmount()
                + "&cancel_tax_free_amount=" + 0L;
    }
}
