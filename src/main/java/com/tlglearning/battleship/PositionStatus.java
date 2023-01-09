package com.tlglearning.battleship;

public enum PositionStatus {
  SHIP('\u2610'),
  WATER('~'),
  HIT('\u2612'),
  MISS('\u2638');

  private final char status;

  PositionStatus(char c) {
    this.status=c;
  }

  public char getStatus() {
    return status;
  }
}