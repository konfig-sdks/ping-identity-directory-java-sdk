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
 * This property specifies type of connection security to use when connecting to the outgoing mail server.
 */
@JsonAdapter(EnumexternalServerSmtpSecurityProp.Adapter.class)public enum EnumexternalServerSmtpSecurityProp {
  
  NONE("none"),
  
  STARTTLS("starttls"),
  
  SSL("ssl");

  private String value;

  EnumexternalServerSmtpSecurityProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumexternalServerSmtpSecurityProp fromValue(String value) {
    for (EnumexternalServerSmtpSecurityProp b : EnumexternalServerSmtpSecurityProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumexternalServerSmtpSecurityProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumexternalServerSmtpSecurityProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumexternalServerSmtpSecurityProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumexternalServerSmtpSecurityProp.fromValue(value);
    }
  }
}

