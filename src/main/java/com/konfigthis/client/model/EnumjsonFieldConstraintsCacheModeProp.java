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
 * Specifies the behavior that the server should exhibit when caching data for the associated JSON index. This can be useful in environments in which the system does not have enough memory to fully cache the entire data set, as it makes it possible to prioritize which data is the most important to keep in memory.
 */
@JsonAdapter(EnumjsonFieldConstraintsCacheModeProp.Adapter.class)public enum EnumjsonFieldConstraintsCacheModeProp {
  
  CACHE_KEYS_AND_VALUES("cache-keys-and-values"),
  
  CACHE_KEYS_ONLY("cache-keys-only"),
  
  NO_CACHING("no-caching");

  private String value;

  EnumjsonFieldConstraintsCacheModeProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumjsonFieldConstraintsCacheModeProp fromValue(String value) {
    for (EnumjsonFieldConstraintsCacheModeProp b : EnumjsonFieldConstraintsCacheModeProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumjsonFieldConstraintsCacheModeProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumjsonFieldConstraintsCacheModeProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumjsonFieldConstraintsCacheModeProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumjsonFieldConstraintsCacheModeProp.fromValue(value);
    }
  }
}

