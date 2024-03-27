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
 * Specifies the level of detail to include about the host system resource utilization including CPU, memory, disk and network activity.
 */
@JsonAdapter(EnumpluginHostInfoProp.Adapter.class)public enum EnumpluginHostInfoProp {
  
  CPU("cpu"),
  
  DISK("disk"),
  
  NETWORK("network");

  private String value;

  EnumpluginHostInfoProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumpluginHostInfoProp fromValue(String value) {
    for (EnumpluginHostInfoProp b : EnumpluginHostInfoProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumpluginHostInfoProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumpluginHostInfoProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumpluginHostInfoProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumpluginHostInfoProp.fromValue(value);
    }
  }
}

