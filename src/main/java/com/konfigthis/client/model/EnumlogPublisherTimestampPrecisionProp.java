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
 * Specifies the smallest time unit to be included in timestamps.
 */
@JsonAdapter(EnumlogPublisherTimestampPrecisionProp.Adapter.class)public enum EnumlogPublisherTimestampPrecisionProp {
  
  SECONDS("seconds"),
  
  MILLISECONDS("milliseconds");

  private String value;

  EnumlogPublisherTimestampPrecisionProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumlogPublisherTimestampPrecisionProp fromValue(String value) {
    for (EnumlogPublisherTimestampPrecisionProp b : EnumlogPublisherTimestampPrecisionProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumlogPublisherTimestampPrecisionProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumlogPublisherTimestampPrecisionProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumlogPublisherTimestampPrecisionProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumlogPublisherTimestampPrecisionProp.fromValue(value);
    }
  }
}

