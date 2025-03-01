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
 * Specifies the cache mode that should be used when accessing the records in the database for this index.
 */
@JsonAdapter(EnumlocalDbVlvIndexCacheModeProp.Adapter.class)public enum EnumlocalDbVlvIndexCacheModeProp {
  
  CACHE_KEYS_AND_VALUES("cache-keys-and-values"),
  
  CACHE_KEYS_ONLY("cache-keys-only"),
  
  NO_CACHING("no-caching"),
  
  KEEP_HOT("keep-hot"),
  
  DEFAULT("default"),
  
  MAKE_COLD("make-cold"),
  
  EVICT_LEAF_IMMEDIATELY("evict-leaf-immediately"),
  
  EVICT_BIN_IMMEDIATELY("evict-bin-immediately");

  private String value;

  EnumlocalDbVlvIndexCacheModeProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumlocalDbVlvIndexCacheModeProp fromValue(String value) {
    for (EnumlocalDbVlvIndexCacheModeProp b : EnumlocalDbVlvIndexCacheModeProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumlocalDbVlvIndexCacheModeProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumlocalDbVlvIndexCacheModeProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumlocalDbVlvIndexCacheModeProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumlocalDbVlvIndexCacheModeProp.fromValue(value);
    }
  }
}

