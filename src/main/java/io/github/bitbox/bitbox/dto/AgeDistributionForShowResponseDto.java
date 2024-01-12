package io.github.bitbox.bitbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class AgeDistributionForShowResponseDto {

    private Double teenage;
    private Double twenty;
    private Double thirty;
    private Double fortyOver;

    public void assignTeenage(Double total) {
        this.teenage = total;
    }

    public void assignTwenty(Double total) {
        this.twenty = total;
    }

    public void assignThirty(Double total) {
        this.thirty = total;
    }

    public void assignFortyOver(Double total) {
        this.fortyOver = total;
    }
}
