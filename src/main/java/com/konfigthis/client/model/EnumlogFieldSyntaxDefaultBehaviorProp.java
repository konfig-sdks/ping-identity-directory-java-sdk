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
 * The default behavior that the server should exhibit when logging fields with this syntax. This may be overridden on a per-field basis.
 */
@JsonAdapter(EnumlogFieldSyntaxDefaultBehaviorProp.Adapter.class)public enum EnumlogFieldSyntaxDefaultBehaviorProp {
  
  PRESERVE("preserve"),
  
  OMIT("omit"),
  
  REDACT_ENTIRE_VALUE("redact-entire-value"),
  
  REDACT_VALUE_COMPONENTS("redact-value-components"),
  
  TOKENIZE_ENTIRE_VALUE("tokenize-entire-value"),
  
  TOKENIZE_VALUE_COMPONENTS("tokenize-value-components");

  private String value;

  EnumlogFieldSyntaxDefaultBehaviorProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumlogFieldSyntaxDefaultBehaviorProp fromValue(String value) {
    for (EnumlogFieldSyntaxDefaultBehaviorProp b : EnumlogFieldSyntaxDefaultBehaviorProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumlogFieldSyntaxDefaultBehaviorProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumlogFieldSyntaxDefaultBehaviorProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumlogFieldSyntaxDefaultBehaviorProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumlogFieldSyntaxDefaultBehaviorProp.fromValue(value);
    }
  }
}

