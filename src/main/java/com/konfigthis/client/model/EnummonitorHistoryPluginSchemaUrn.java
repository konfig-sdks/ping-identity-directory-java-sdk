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
 * Gets or Sets Enummonitor-history-pluginSchemaUrn
 */
@JsonAdapter(EnummonitorHistoryPluginSchemaUrn.Adapter.class)public enum EnummonitorHistoryPluginSchemaUrn {
  
  URN_PINGIDENTITY_SCHEMAS_CONFIGURATION_2_0_PLUGIN_MONITOR_HISTORY("urn:pingidentity:schemas:configuration:2.0:plugin:monitor-history");

  private String value;

  EnummonitorHistoryPluginSchemaUrn(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnummonitorHistoryPluginSchemaUrn fromValue(String value) {
    for (EnummonitorHistoryPluginSchemaUrn b : EnummonitorHistoryPluginSchemaUrn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnummonitorHistoryPluginSchemaUrn> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnummonitorHistoryPluginSchemaUrn enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnummonitorHistoryPluginSchemaUrn read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnummonitorHistoryPluginSchemaUrn.fromValue(value);
    }
  }
}

