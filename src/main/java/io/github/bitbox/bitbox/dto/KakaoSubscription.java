package io.github.bitbox.bitbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KakaoSubscription implements Subscripton{
    private String sid;
    private String cid;
    private String tid;
    private String orderId;

    public void cancel(Long paymentAmount, Long taxFreeAmount) {
        KakaoPayCancelDto.builder().tid(tid).cancelAmount(paymentAmount).cancelTaxFreeAmount(taxFreeAmount).build();
    }
}