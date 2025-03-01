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
 * Gets or Sets Enumpassword-policy-import-pluginSchemaUrn
 */
@JsonAdapter(EnumpasswordPolicyImportPluginSchemaUrn.Adapter.class)public enum EnumpasswordPolicyImportPluginSchemaUrn {
  
  URN_PINGIDENTITY_SCHEMAS_CONFIGURATION_2_0_PLUGIN_PASSWORD_POLICY_IMPORT("urn:pingidentity:schemas:configuration:2.0:plugin:password-policy-import");

  private String value;

  EnumpasswordPolicyImportPluginSchemaUrn(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumpasswordPolicyImportPluginSchemaUrn fromValue(String value) {
    for (EnumpasswordPolicyImportPluginSchemaUrn b : EnumpasswordPolicyImportPluginSchemaUrn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumpasswordPolicyImportPluginSchemaUrn> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumpasswordPolicyImportPluginSchemaUrn enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumpasswordPolicyImportPluginSchemaUrn read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumpasswordPolicyImportPluginSchemaUrn.fromValue(value);
    }
  }
}

