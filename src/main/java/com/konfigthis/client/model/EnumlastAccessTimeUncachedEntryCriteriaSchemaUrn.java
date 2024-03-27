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
 * Gets or Sets Enumlast-access-time-uncached-entry-criteriaSchemaUrn
 */
@JsonAdapter(EnumlastAccessTimeUncachedEntryCriteriaSchemaUrn.Adapter.class)public enum EnumlastAccessTimeUncachedEntryCriteriaSchemaUrn {
  
  URN_PINGIDENTITY_SCHEMAS_CONFIGURATION_2_0_UNCACHED_ENTRY_CRITERIA_LAST_ACCESS_TIME("urn:pingidentity:schemas:configuration:2.0:uncached-entry-criteria:last-access-time");

  private String value;

  EnumlastAccessTimeUncachedEntryCriteriaSchemaUrn(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumlastAccessTimeUncachedEntryCriteriaSchemaUrn fromValue(String value) {
    for (EnumlastAccessTimeUncachedEntryCriteriaSchemaUrn b : EnumlastAccessTimeUncachedEntryCriteriaSchemaUrn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumlastAccessTimeUncachedEntryCriteriaSchemaUrn> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumlastAccessTimeUncachedEntryCriteriaSchemaUrn enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumlastAccessTimeUncachedEntryCriteriaSchemaUrn read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumlastAccessTimeUncachedEntryCriteriaSchemaUrn.fromValue(value);
    }
  }
}

