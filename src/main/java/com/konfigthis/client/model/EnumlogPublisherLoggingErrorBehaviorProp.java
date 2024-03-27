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
 * Specifies the behavior that the server should exhibit if an error occurs during logging processing.
 */
@JsonAdapter(EnumlogPublisherLoggingErrorBehaviorProp.Adapter.class)public enum EnumlogPublisherLoggingErrorBehaviorProp {
  
  STANDARD_ERROR("standard-error"),
  
  LOCKDOWN_MODE("lockdown-mode");

  private String value;

  EnumlogPublisherLoggingErrorBehaviorProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumlogPublisherLoggingErrorBehaviorProp fromValue(String value) {
    for (EnumlogPublisherLoggingErrorBehaviorProp b : EnumlogPublisherLoggingErrorBehaviorProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumlogPublisherLoggingErrorBehaviorProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumlogPublisherLoggingErrorBehaviorProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumlogPublisherLoggingErrorBehaviorProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumlogPublisherLoggingErrorBehaviorProp.fromValue(value);
    }
  }
}

