package io.github.bitbox.bitbox.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AttendanceStatus {
    ABSENT,
    TARDY,
    ATTENDANCE,
    GO_OUT,
    LEAVE_EARLY
}