package io.github.bitbox.bitbox.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use= JsonTypeInfo.Id.NAME,
        property = "type",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = KakaoSubscription.class, name = "kakao"),
})
public interface Subscripton {
    KakaoPayCancelDto cancel(Long paymentAmount, Long taxFreeAmount);
}
