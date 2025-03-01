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
 * Gets or Sets Enumvault-cipher-stream-providerSchemaUrn
 */
@JsonAdapter(EnumvaultCipherStreamProviderSchemaUrn.Adapter.class)public enum EnumvaultCipherStreamProviderSchemaUrn {
  
  URN_PINGIDENTITY_SCHEMAS_CONFIGURATION_2_0_CIPHER_STREAM_PROVIDER_VAULT("urn:pingidentity:schemas:configuration:2.0:cipher-stream-provider:vault");

  private String value;

  EnumvaultCipherStreamProviderSchemaUrn(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumvaultCipherStreamProviderSchemaUrn fromValue(String value) {
    for (EnumvaultCipherStreamProviderSchemaUrn b : EnumvaultCipherStreamProviderSchemaUrn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumvaultCipherStreamProviderSchemaUrn> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumvaultCipherStreamProviderSchemaUrn enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumvaultCipherStreamProviderSchemaUrn read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumvaultCipherStreamProviderSchemaUrn.fromValue(value);
    }
  }
}

