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
 * The behavior to exhibit for source attributes that have multiple values.
 */
@JsonAdapter(EnumpluginMultiValuedAttributeBehaviorProp.Adapter.class)public enum EnumpluginMultiValuedAttributeBehaviorProp {
  
  USE_FIRST_VALUE("use-first-value"),
  
  REJECT_ENTRIES_WITH_ANY_MULTIVALUED_SOURCE_ATTRIBUTE("reject-entries-with-any-multivalued-source-attribute"),
  
  USE_ALL_VALUES_IF_POSSIBLE_BUT_REJECT_IF_NOT("use-all-values-if-possible-but-reject-if-not"),
  
  USE_ALL_VALUES_IF_POSSIBLE_BUT_ONLY_FIRST_VALUE_IF_NOT("use-all-values-if-possible-but-only-first-value-if-not");

  private String value;

  EnumpluginMultiValuedAttributeBehaviorProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumpluginMultiValuedAttributeBehaviorProp fromValue(String value) {
    for (EnumpluginMultiValuedAttributeBehaviorProp b : EnumpluginMultiValuedAttributeBehaviorProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumpluginMultiValuedAttributeBehaviorProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumpluginMultiValuedAttributeBehaviorProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumpluginMultiValuedAttributeBehaviorProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumpluginMultiValuedAttributeBehaviorProp.fromValue(value);
    }
  }
}

