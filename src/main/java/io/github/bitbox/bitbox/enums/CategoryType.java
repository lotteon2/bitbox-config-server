package io.github.bitbox.bitbox.enums;

public enum CategoryType {
  DEVLOG(1),
  COMMUNITY(2),
  SENIOR(3),
  ALUMNI(4),
  QUESTION(5),
  SHARE(6),
  INTERVIEW(7),
  TIP(8),
  TOGETHER_ALL(10),
  TOGETHER_1ST(11),
  TOGETHER_2ND(12),
  TOGETHER_3RD(13),
  TOGETHER_4TH(14),
  TOGETHER_5TH(15);

  private final long code;

  CategoryType(long code) {
    this.code = code;
  }

  public long getCode() {
    return code;
  }
}

