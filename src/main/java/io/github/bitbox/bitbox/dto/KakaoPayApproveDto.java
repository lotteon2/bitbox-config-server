package io.github.bitbox.bitbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
     domain : order, consumer, payment
     detail : kakao 결제 승인시 사용되는 DTO
     method : Kafka, Feign
     comment :
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KakaoPayApproveDto {
    private String tid;
    private String partnerOrderId;
    private String partnerUserId;
    private String pgToken;

    public String generateKakaoPayApproveData(String cid){
        return "cid=" + cid
                + "&tid=" + this.getTid()
                + "&partner_order_id=" + this.getPartnerOrderId()
                + "&partner_user_id=" + this.getPartnerUserId()
                + "&pg_token=" + this.getPgToken();
    }
}
