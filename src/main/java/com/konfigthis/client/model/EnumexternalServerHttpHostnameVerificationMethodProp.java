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
 * The mechanism for checking if the hostname of the HTTP External Server matches the name(s) stored inside the server&#39;s X.509 certificate. This is only applicable if SSL is being used for connection security.
 */
@JsonAdapter(EnumexternalServerHttpHostnameVerificationMethodProp.Adapter.class)public enum EnumexternalServerHttpHostnameVerificationMethodProp {
  
  ALLOW_ALL("allow-all"),
  
  STRICT("strict");

  private String value;

  EnumexternalServerHttpHostnameVerificationMethodProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumexternalServerHttpHostnameVerificationMethodProp fromValue(String value) {
    for (EnumexternalServerHttpHostnameVerificationMethodProp b : EnumexternalServerHttpHostnameVerificationMethodProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumexternalServerHttpHostnameVerificationMethodProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumexternalServerHttpHostnameVerificationMethodProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumexternalServerHttpHostnameVerificationMethodProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumexternalServerHttpHostnameVerificationMethodProp.fromValue(value);
    }
  }
}

