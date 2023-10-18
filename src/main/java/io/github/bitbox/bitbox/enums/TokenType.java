package io.github.bitbox.bitbox.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TokenType {
    ACCESS(1209600000), // for test
    REFRESH(86400000);

    private final long value;
}
