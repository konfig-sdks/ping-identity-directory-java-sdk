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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Enumhttp-configurationSchemaUrn
 */
@JsonAdapter(EnumhttpConfigurationSchemaUrn.Adapter.class)public enum EnumhttpConfigurationSchemaUrn {
  
  URN_PINGIDENTITY_SCHEMAS_CONFIGURATION_2_0_HTTP_CONFIGURATION("urn:pingidentity:schemas:configuration:2.0:http-configuration");

  private String value;

  EnumhttpConfigurationSchemaUrn(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumhttpConfigurationSchemaUrn fromValue(String value) {
    for (EnumhttpConfigurationSchemaUrn b : EnumhttpConfigurationSchemaUrn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumhttpConfigurationSchemaUrn> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumhttpConfigurationSchemaUrn enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumhttpConfigurationSchemaUrn read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumhttpConfigurationSchemaUrn.fromValue(value);
    }
  }
}

