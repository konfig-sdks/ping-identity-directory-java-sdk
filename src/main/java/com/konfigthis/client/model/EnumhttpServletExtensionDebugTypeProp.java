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
 * The types of debug messages that should be logged.
 */
@JsonAdapter(EnumhttpServletExtensionDebugTypeProp.Adapter.class)public enum EnumhttpServletExtensionDebugTypeProp {
  
  CODING_ERROR("coding-error"),
  
  EXCEPTION("exception"),
  
  OTHER("other");

  private String value;

  EnumhttpServletExtensionDebugTypeProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumhttpServletExtensionDebugTypeProp fromValue(String value) {
    for (EnumhttpServletExtensionDebugTypeProp b : EnumhttpServletExtensionDebugTypeProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumhttpServletExtensionDebugTypeProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumhttpServletExtensionDebugTypeProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumhttpServletExtensionDebugTypeProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumhttpServletExtensionDebugTypeProp.fromValue(value);
    }
  }
}

