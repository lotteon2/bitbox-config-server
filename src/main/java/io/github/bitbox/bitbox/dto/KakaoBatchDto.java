package io.github.bitbox.bitbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class KakaoBatchDto implements SubscriptionBatchInterface {
    private String cid;
    private String sid;
    private String partnerOrderId;
    private String partnerUserId;
    private Long quantity;
    private Long totalAmount;
    private Long taxFreeAmount;

    public String settingSubscriptionDto() {
        return "cid=" + cid
                + "&sid=" + sid
                + "&partner_order_id=" + partnerOrderId
                + "&partner_user_id=" + partnerUserId
                + "&quantity=" + quantity
                + "&total_amount=" + totalAmount
                + "&tax_free_amount=" + taxFreeAmount;
    }
}