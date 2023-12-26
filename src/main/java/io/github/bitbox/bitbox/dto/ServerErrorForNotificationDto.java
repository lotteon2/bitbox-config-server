package io.github.bitbox.bitbox.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
public class ServerErrorForNotificationDto extends MemberInfoForNotificationDto {

    private OrderInfoDto error;
}
