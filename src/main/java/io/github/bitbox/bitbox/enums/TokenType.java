package io.github.bitbox.bitbox.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TokenType {
    ACCESS(3600000),
    REFRESH(86400000),
    SESSION(15000);

    private final long value;
}
