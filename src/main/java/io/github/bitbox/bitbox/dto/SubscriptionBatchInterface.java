package io.github.bitbox.bitbox.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use= JsonTypeInfo.Id.NAME,
        property = "type",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = KakaoBatchDto.class, name = "kakaoBatch"),
})
public interface SubscriptionBatchInterface {
}