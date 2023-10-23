package io.github.bitbox.bitbox.dto;

import io.github.bitbox.bitbox.enums.NotificationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDto {
    private NotificationType notificationType;
    private String receiverId;
    private Long boardId;
    private String senderNickname;
}