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
 * Gets or Sets Enumpkcs11-cipher-stream-providerSchemaUrn
 */
@JsonAdapter(Enumpkcs11CipherStreamProviderSchemaUrn.Adapter.class)public enum Enumpkcs11CipherStreamProviderSchemaUrn {
  
  URN_PINGIDENTITY_SCHEMAS_CONFIGURATION_2_0_CIPHER_STREAM_PROVIDER_PKCS11("urn:pingidentity:schemas:configuration:2.0:cipher-stream-provider:pkcs11");

  private String value;

  Enumpkcs11CipherStreamProviderSchemaUrn(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Enumpkcs11CipherStreamProviderSchemaUrn fromValue(String value) {
    for (Enumpkcs11CipherStreamProviderSchemaUrn b : Enumpkcs11CipherStreamProviderSchemaUrn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Enumpkcs11CipherStreamProviderSchemaUrn> {
    @Override
    public void write(final JsonWriter jsonWriter, final Enumpkcs11CipherStreamProviderSchemaUrn enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Enumpkcs11CipherStreamProviderSchemaUrn read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Enumpkcs11CipherStreamProviderSchemaUrn.fromValue(value);
    }
  }
}

