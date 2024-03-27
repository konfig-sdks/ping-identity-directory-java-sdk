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
 * When defined, causes this Gauge to assume the specified severity, overriding its computed severity. This is useful for testing alarms generated by Gauges as well as suppressing alarms for known conditions.
 */
@JsonAdapter(EnumgaugeOverrideSeverityProp.Adapter.class)public enum EnumgaugeOverrideSeverityProp {
  
  NORMAL("normal"),
  
  WARNING("warning"),
  
  MINOR("minor"),
  
  MAJOR("major"),
  
  CRITICAL("critical");

  private String value;

  EnumgaugeOverrideSeverityProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumgaugeOverrideSeverityProp fromValue(String value) {
    for (EnumgaugeOverrideSeverityProp b : EnumgaugeOverrideSeverityProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumgaugeOverrideSeverityProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumgaugeOverrideSeverityProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumgaugeOverrideSeverityProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumgaugeOverrideSeverityProp.fromValue(value);
    }
  }
}

