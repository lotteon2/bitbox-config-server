package io.github.bitbox.bitbox.dto;

import io.github.bitbox.bitbox.enums.NotificationTypeEnum;
import io.github.bitbox.bitbox.enums.RecipientTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
public class MemberInfoForNotificationDto {
    private Long recipientId;
    private RecipientTypeEnum recipientType;
    private NotificationTypeEnum notificationType;
    private LocalDateTime createdAt;
}