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
 * Specifies an allow list of JWT signing algorithms that will be accepted by the OpenID Connect ID Token Validator.
 */
@JsonAdapter(EnumidTokenValidatorAllowedSigningAlgorithmProp.Adapter.class)public enum EnumidTokenValidatorAllowedSigningAlgorithmProp {
  
  RS256("RS256"),
  
  RS384("RS384"),
  
  RS512("RS512"),
  
  ES256("ES256"),
  
  ES384("ES384"),
  
  ES512("ES512");

  private String value;

  EnumidTokenValidatorAllowedSigningAlgorithmProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumidTokenValidatorAllowedSigningAlgorithmProp fromValue(String value) {
    for (EnumidTokenValidatorAllowedSigningAlgorithmProp b : EnumidTokenValidatorAllowedSigningAlgorithmProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumidTokenValidatorAllowedSigningAlgorithmProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumidTokenValidatorAllowedSigningAlgorithmProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumidTokenValidatorAllowedSigningAlgorithmProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumidTokenValidatorAllowedSigningAlgorithmProp.fromValue(value);
    }
  }
}

