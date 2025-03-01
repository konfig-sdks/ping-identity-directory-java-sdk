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
 * Specifies the manner in which external servers should be used for pass-through authentication attempts if multiple servers are defined.
 */
@JsonAdapter(EnumpluginServerAccessModeProp.Adapter.class)public enum EnumpluginServerAccessModeProp {
  
  ROUND_ROBIN("round-robin"),
  
  FAILOVER_ON_UNAVAILABLE("failover-on-unavailable"),
  
  FAILOVER_ON_ANY_FAILURE("failover-on-any-failure");

  private String value;

  EnumpluginServerAccessModeProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumpluginServerAccessModeProp fromValue(String value) {
    for (EnumpluginServerAccessModeProp b : EnumpluginServerAccessModeProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumpluginServerAccessModeProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumpluginServerAccessModeProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumpluginServerAccessModeProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumpluginServerAccessModeProp.fromValue(value);
    }
  }
}

