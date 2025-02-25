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
 * The privacy protocol to use for SNMPv3 if privacy is to be used.
 */
@JsonAdapter(EnumpluginAgentPrivacyProtocolProp.Adapter.class)public enum EnumpluginAgentPrivacyProtocolProp {
  
  DES("des"),
  
  DES_EDE("des-ede"),
  
  AES128("aes128"),
  
  AES192("aes192"),
  
  AES256("aes256");

  private String value;

  EnumpluginAgentPrivacyProtocolProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumpluginAgentPrivacyProtocolProp fromValue(String value) {
    for (EnumpluginAgentPrivacyProtocolProp b : EnumpluginAgentPrivacyProtocolProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumpluginAgentPrivacyProtocolProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumpluginAgentPrivacyProtocolProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumpluginAgentPrivacyProtocolProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumpluginAgentPrivacyProtocolProp.fromValue(value);
    }
  }
}

