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
 * Specifies the assurance level used to replicate to remote servers. A remote server is defined as one with a different value for the location setting in the global configuration.
 */
@JsonAdapter(EnumreplicationAssurancePolicyRemoteLevelProp.Adapter.class)public enum EnumreplicationAssurancePolicyRemoteLevelProp {
  
  NONE("none"),
  
  RECEIVED_ANY_REMOTE_LOCATION("received-any-remote-location"),
  
  RECEIVED_ALL_REMOTE_LOCATIONS("received-all-remote-locations"),
  
  PROCESSED_ALL_REMOTE_SERVERS("processed-all-remote-servers");

  private String value;

  EnumreplicationAssurancePolicyRemoteLevelProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumreplicationAssurancePolicyRemoteLevelProp fromValue(String value) {
    for (EnumreplicationAssurancePolicyRemoteLevelProp b : EnumreplicationAssurancePolicyRemoteLevelProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumreplicationAssurancePolicyRemoteLevelProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumreplicationAssurancePolicyRemoteLevelProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumreplicationAssurancePolicyRemoteLevelProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumreplicationAssurancePolicyRemoteLevelProp.fromValue(value);
    }
  }
}

