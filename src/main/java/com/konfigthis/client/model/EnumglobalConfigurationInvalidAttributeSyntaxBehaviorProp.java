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
 * Specifies how the Directory Server should handle operations whenever an attribute value violates the associated attribute syntax.
 */
@JsonAdapter(EnumglobalConfigurationInvalidAttributeSyntaxBehaviorProp.Adapter.class)public enum EnumglobalConfigurationInvalidAttributeSyntaxBehaviorProp {
  
  ACCEPT("accept"),
  
  REJECT("reject"),
  
  WARN("warn");

  private String value;

  EnumglobalConfigurationInvalidAttributeSyntaxBehaviorProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumglobalConfigurationInvalidAttributeSyntaxBehaviorProp fromValue(String value) {
    for (EnumglobalConfigurationInvalidAttributeSyntaxBehaviorProp b : EnumglobalConfigurationInvalidAttributeSyntaxBehaviorProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumglobalConfigurationInvalidAttributeSyntaxBehaviorProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumglobalConfigurationInvalidAttributeSyntaxBehaviorProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumglobalConfigurationInvalidAttributeSyntaxBehaviorProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumglobalConfigurationInvalidAttributeSyntaxBehaviorProp.fromValue(value);
    }
  }
}

