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
 * Determines how the server responds when replication detects that some changes might have been missed. Each missing changes policy is a set of missing changes actions to take for a set of missing changes types. The value configured here acts as a default for all replication domains on this replication server.
 */
@JsonAdapter(EnumreplicationServerMissingChangesPolicyProp.Adapter.class)public enum EnumreplicationServerMissingChangesPolicyProp {
  
  MAXIMUM_INTEGRITY("maximum-integrity"),
  
  FAVOR_INTEGRITY("favor-integrity"),
  
  FAVOR_AVAILABILITY("favor-availability"),
  
  MAXIMUM_AVAILABILITY("maximum-availability");

  private String value;

  EnumreplicationServerMissingChangesPolicyProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumreplicationServerMissingChangesPolicyProp fromValue(String value) {
    for (EnumreplicationServerMissingChangesPolicyProp b : EnumreplicationServerMissingChangesPolicyProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumreplicationServerMissingChangesPolicyProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumreplicationServerMissingChangesPolicyProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumreplicationServerMissingChangesPolicyProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumreplicationServerMissingChangesPolicyProp.fromValue(value);
    }
  }
}

