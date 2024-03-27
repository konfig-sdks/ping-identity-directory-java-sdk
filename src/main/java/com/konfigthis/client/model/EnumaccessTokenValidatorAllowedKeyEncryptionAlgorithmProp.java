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
 * Specifies an allow list of JWT key encryption algorithms that will be accepted by the JWT Access Token Validator. This setting is only used if encryption-key-pair is set.
 */
@JsonAdapter(EnumaccessTokenValidatorAllowedKeyEncryptionAlgorithmProp.Adapter.class)public enum EnumaccessTokenValidatorAllowedKeyEncryptionAlgorithmProp {
  
  RSA_OAEP("RSA_OAEP"),
  
  ECDH_ES("ECDH_ES"),
  
  ECDH_ES_A128KW("ECDH_ES_A128KW"),
  
  ECDH_ES_A192KW("ECDH_ES_A192KW"),
  
  ECDH_ES_A256KW("ECDH_ES_A256KW");

  private String value;

  EnumaccessTokenValidatorAllowedKeyEncryptionAlgorithmProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumaccessTokenValidatorAllowedKeyEncryptionAlgorithmProp fromValue(String value) {
    for (EnumaccessTokenValidatorAllowedKeyEncryptionAlgorithmProp b : EnumaccessTokenValidatorAllowedKeyEncryptionAlgorithmProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumaccessTokenValidatorAllowedKeyEncryptionAlgorithmProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumaccessTokenValidatorAllowedKeyEncryptionAlgorithmProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumaccessTokenValidatorAllowedKeyEncryptionAlgorithmProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumaccessTokenValidatorAllowedKeyEncryptionAlgorithmProp.fromValue(value);
    }
  }
}

