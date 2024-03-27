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
 * The behavior to exhibit for modify and modify DN operations that update one or more of the source attributes used in any of the value patterns.
 */
@JsonAdapter(EnumpluginUpdateSourceAttributeBehaviorProp.Adapter.class)public enum EnumpluginUpdateSourceAttributeBehaviorProp {
  
  REPLACE_COMPOSED_VALUES("replace-composed-values"),
  
  REPLACE_ALL_VALUES("replace-all-values"),
  
  PRESERVE_EXISTING_VALUES("preserve-existing-values");

  private String value;

  EnumpluginUpdateSourceAttributeBehaviorProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumpluginUpdateSourceAttributeBehaviorProp fromValue(String value) {
    for (EnumpluginUpdateSourceAttributeBehaviorProp b : EnumpluginUpdateSourceAttributeBehaviorProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumpluginUpdateSourceAttributeBehaviorProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumpluginUpdateSourceAttributeBehaviorProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumpluginUpdateSourceAttributeBehaviorProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumpluginUpdateSourceAttributeBehaviorProp.fromValue(value);
    }
  }
}

