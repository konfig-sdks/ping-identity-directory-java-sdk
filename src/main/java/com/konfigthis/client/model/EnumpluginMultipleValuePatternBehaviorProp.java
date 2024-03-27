/*
 * PingData Config - OpenAPI 3.0
 * This is the PingData Configuration API
 *
 * The version of the OpenAPI document: 0.1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The behavior to exhibit if the plugin is configured with multiple value patterns.
 */
@JsonAdapter(EnumpluginMultipleValuePatternBehaviorProp.Adapter.class)public enum EnumpluginMultipleValuePatternBehaviorProp {
  
  FIRST_NON_REJECTED_VALUE_PATTERN_WITH_NON_EMPTY_VALUES_BUT_MAY_REJECT("use-first-non-rejected-value-pattern-with-non-empty-values-but-may-reject"),
  
  FIRST_NON_REJECTED_VALUE_PATTERN_WITH_NON_EMPTY_VALUES_AND_NEVER_REJECT("use-first-non-rejected-value-pattern-with-non-empty-values-and-never-reject"),
  
  FIRST_REJECTION_OR_FIRST_VALUE_PATTERN_WITH_NON_EMPTY_VALUES("use-first-rejection-or-first-value-pattern-with-non-empty-values"),
  
  ALL_NON_REJECTED_VALUE_PATTERNS_WITH_NON_EMPTY_VALUES_BUT_MAY_REJECT("use-all-non-rejected-value-patterns-with-non-empty-values-but-may-reject"),
  
  ALL_NON_REJECTED_VALUE_PATTERNS_WITH_NON_EMPTY_VALUES_AND_NEVER_REJECT("use-all-non-rejected-value-patterns-with-non-empty-values-and-never-reject"),
  
  FIRST_REJECTION_OR_ALL_VALUE_PATTERNS_WITH_NON_EMPTY_VALUES("use-first-rejection-or-all-value-patterns-with-non-empty-values");

  private String value;

  EnumpluginMultipleValuePatternBehaviorProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumpluginMultipleValuePatternBehaviorProp fromValue(String value) {
    for (EnumpluginMultipleValuePatternBehaviorProp b : EnumpluginMultipleValuePatternBehaviorProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumpluginMultipleValuePatternBehaviorProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumpluginMultipleValuePatternBehaviorProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumpluginMultipleValuePatternBehaviorProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumpluginMultipleValuePatternBehaviorProp.fromValue(value);
    }
  }
}

