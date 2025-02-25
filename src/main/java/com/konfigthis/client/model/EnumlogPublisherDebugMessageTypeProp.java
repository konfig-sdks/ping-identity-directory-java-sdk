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
 * Specifies the debug message types which can be logged. Note that enabling these may result in sensitive information being logged.
 */
@JsonAdapter(EnumlogPublisherDebugMessageTypeProp.Adapter.class)public enum EnumlogPublisherDebugMessageTypeProp {
  
  HTTP_FULL_REQUEST_AND_RESPONSE("http-full-request-and-response"),
  
  LDAP_EXTERNAL_SERVER_REQUEST("ldap-external-server-request"),
  
  SERVER_SDK_EXTENSION("server-sdk-extension"),
  
  STORE_ADAPTER_MAPPING("store-adapter-mapping"),
  
  STORE_ADAPTER_PROCESSING("store-adapter-processing"),
  
  ACCESS_TOKEN_VALIDATOR_REQUEST_AND_RESPONSE("access-token-validator-request-and-response"),
  
  ACCESS_TOKEN_VALIDATOR_PROCESSING("access-token-validator-processing"),
  
  ID_TOKEN_VALIDATOR_REQUEST_AND_RESPONSE("id-token-validator-request-and-response"),
  
  ID_TOKEN_VALIDATOR_PROCESSING("id-token-validator-processing"),
  
  CONSENT_SERVICE_REQUEST_AND_RESPONSE("consent-service-request-and-response"),
  
  GATEWAY_REQUEST_AND_RESPONSE("gateway-request-and-response"),
  
  POLICY_REQUEST_AND_RESPONSE("policy-request-and-response"),
  
  POLICY_QUERY_REQUEST_AND_RESPONSE("policy-query-request-and-response");

  private String value;

  EnumlogPublisherDebugMessageTypeProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumlogPublisherDebugMessageTypeProp fromValue(String value) {
    for (EnumlogPublisherDebugMessageTypeProp b : EnumlogPublisherDebugMessageTypeProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumlogPublisherDebugMessageTypeProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumlogPublisherDebugMessageTypeProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumlogPublisherDebugMessageTypeProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumlogPublisherDebugMessageTypeProp.fromValue(value);
    }
  }
}

