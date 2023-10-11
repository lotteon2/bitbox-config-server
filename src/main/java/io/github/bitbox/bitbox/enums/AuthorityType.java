package io.github.bitbox.bitbox.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AuthorityType {
    ADMIN,
    MANAGER,
    TEACHER,
    GRADUATE,
    TRAINEE,
    GENERAL
}
