package io.github.bitbox.bitbox.dto;

import io.github.bitbox.bitbox.enums.NotificationTypeEnum;
import io.github.bitbox.bitbox.enums.RecipientTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class MemberInfoForNotificationDto {
    private Long recipientId;
    private RecipientTypeEnum recipientType;
    private NotificationTypeEnum notificationType;
    private LocalDateTime createdAt;
    private OrderInfoDto orderInfoDto;
}