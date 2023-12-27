package io.github.bitbox.bitbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class DeliveryInfo {
    private String recipientName;
    private String recipientPhoneNumber;
    private String basicAddress;
    private String addressDetail;
    private String zonecode;
}