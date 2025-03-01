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
 * Specifies the policy that the HTTP Connection Handler should use regarding client SSL certificates. In order for a client certificate to be accepted it must be known to the trust-manager-provider associated with this HTTP Connection Handler. Client certificates received by the HTTP Connection Handler are by default used for TLS mutual authentication only, as there is no support for user authentication.
 */
@JsonAdapter(EnumconnectionHandlerSslClientAuthPolicyProp.Adapter.class)public enum EnumconnectionHandlerSslClientAuthPolicyProp {
  
  DISABLED("disabled"),
  
  OPTIONAL("optional"),
  
  REQUIRED("required");

  private String value;

  EnumconnectionHandlerSslClientAuthPolicyProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumconnectionHandlerSslClientAuthPolicyProp fromValue(String value) {
    for (EnumconnectionHandlerSslClientAuthPolicyProp b : EnumconnectionHandlerSslClientAuthPolicyProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumconnectionHandlerSslClientAuthPolicyProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumconnectionHandlerSslClientAuthPolicyProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumconnectionHandlerSslClientAuthPolicyProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumconnectionHandlerSslClientAuthPolicyProp.fromValue(value);
    }
  }
}

