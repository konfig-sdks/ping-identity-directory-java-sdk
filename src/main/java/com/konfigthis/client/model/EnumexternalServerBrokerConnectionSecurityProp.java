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
 * The mechanism to use to secure communication with the directory server.
 */
@JsonAdapter(EnumexternalServerBrokerConnectionSecurityProp.Adapter.class)public enum EnumexternalServerBrokerConnectionSecurityProp {
  
  NONE("none"),
  
  SSL("ssl"),
  
  STARTTLS("starttls");

  private String value;

  EnumexternalServerBrokerConnectionSecurityProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumexternalServerBrokerConnectionSecurityProp fromValue(String value) {
    for (EnumexternalServerBrokerConnectionSecurityProp b : EnumexternalServerBrokerConnectionSecurityProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumexternalServerBrokerConnectionSecurityProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumexternalServerBrokerConnectionSecurityProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumexternalServerBrokerConnectionSecurityProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumexternalServerBrokerConnectionSecurityProp.fromValue(value);
    }
  }
}

