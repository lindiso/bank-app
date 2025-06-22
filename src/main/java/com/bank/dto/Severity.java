package com.bank.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The error severity
 */
public enum Severity {
  
  FATAL("FATAL"),
  
  ERROR("ERROR"),
  
  WARNING("WARNING"),
  
  INFO("INFO");

  private String value;

  Severity(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Severity fromValue(String text) {
    for (Severity b : Severity.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

