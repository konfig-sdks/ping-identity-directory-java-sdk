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
 * The behavior to exhibit for modify or modify DN operations that update an entry that previously satisfied the base DN and filter criteria, but now no longer satisfies that criteria.
 */
@JsonAdapter(EnumpluginUpdatedEntryNoLongerMatchesCriteriaBehaviorProp.Adapter.class)public enum EnumpluginUpdatedEntryNoLongerMatchesCriteriaBehaviorProp {
  
  PRESERVE_ALL_VALUES("preserve-all-values"),
  
  PRESERVE_NON_COMPOSED_VALUES("preserve-non-composed-values"),
  
  REMOVE_ALL_VALUES_BUT_PRESERVE_ALL_IF_REQUIRED("remove-all-values-but-preserve-all-if-required"),
  
  REMOVE_ALL_VALUES_BUT_PRESERVE_NON_COMPOSED_IF_REQUIRED("remove-all-values-but-preserve-non-composed-if-required");

  private String value;

  EnumpluginUpdatedEntryNoLongerMatchesCriteriaBehaviorProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumpluginUpdatedEntryNoLongerMatchesCriteriaBehaviorProp fromValue(String value) {
    for (EnumpluginUpdatedEntryNoLongerMatchesCriteriaBehaviorProp b : EnumpluginUpdatedEntryNoLongerMatchesCriteriaBehaviorProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumpluginUpdatedEntryNoLongerMatchesCriteriaBehaviorProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumpluginUpdatedEntryNoLongerMatchesCriteriaBehaviorProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumpluginUpdatedEntryNoLongerMatchesCriteriaBehaviorProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumpluginUpdatedEntryNoLongerMatchesCriteriaBehaviorProp.fromValue(value);
    }
  }
}

