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
 * Gets or Sets Enumprometheus-monitor-attribute-metricSchemaUrn
 */
@JsonAdapter(EnumprometheusMonitorAttributeMetricSchemaUrn.Adapter.class)public enum EnumprometheusMonitorAttributeMetricSchemaUrn {
  
  URN_PINGIDENTITY_SCHEMAS_CONFIGURATION_2_0_PROMETHEUS_MONITOR_ATTRIBUTE_METRIC("urn:pingidentity:schemas:configuration:2.0:prometheus-monitor-attribute-metric");

  private String value;

  EnumprometheusMonitorAttributeMetricSchemaUrn(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumprometheusMonitorAttributeMetricSchemaUrn fromValue(String value) {
    for (EnumprometheusMonitorAttributeMetricSchemaUrn b : EnumprometheusMonitorAttributeMetricSchemaUrn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumprometheusMonitorAttributeMetricSchemaUrn> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumprometheusMonitorAttributeMetricSchemaUrn enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumprometheusMonitorAttributeMetricSchemaUrn read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumprometheusMonitorAttributeMetricSchemaUrn.fromValue(value);
    }
  }
}

