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
 * Gets or Sets Enumtime-limit-log-retention-policySchemaUrn
 */
@JsonAdapter(EnumtimeLimitLogRetentionPolicySchemaUrn.Adapter.class)public enum EnumtimeLimitLogRetentionPolicySchemaUrn {
  
  URN_PINGIDENTITY_SCHEMAS_CONFIGURATION_2_0_LOG_RETENTION_POLICY_TIME_LIMIT("urn:pingidentity:schemas:configuration:2.0:log-retention-policy:time-limit");

  private String value;

  EnumtimeLimitLogRetentionPolicySchemaUrn(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumtimeLimitLogRetentionPolicySchemaUrn fromValue(String value) {
    for (EnumtimeLimitLogRetentionPolicySchemaUrn b : EnumtimeLimitLogRetentionPolicySchemaUrn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumtimeLimitLogRetentionPolicySchemaUrn> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumtimeLimitLogRetentionPolicySchemaUrn enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumtimeLimitLogRetentionPolicySchemaUrn read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumtimeLimitLogRetentionPolicySchemaUrn.fromValue(value);
    }
  }
}

