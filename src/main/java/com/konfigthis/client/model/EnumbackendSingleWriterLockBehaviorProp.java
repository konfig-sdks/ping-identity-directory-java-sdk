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
 * Specifies the condition under which to acquire a single-writer lock to ensure that the associated operation will be the only write in progress at the time the lock is held. The single-writer lock can help avoid problems that result from database lock conflicts that arise between two write operations being processed at the same time in the same backend. This will not have any effect on the read operations processed while the write is in progress.
 */
@JsonAdapter(EnumbackendSingleWriterLockBehaviorProp.Adapter.class)public enum EnumbackendSingleWriterLockBehaviorProp {
  
  NEVER_ACQUIRE("never-acquire"),
  
  ACQUIRE_ON_RETRY("acquire-on-retry"),
  
  ALWAYS_ACQUIRE("always-acquire");

  private String value;

  EnumbackendSingleWriterLockBehaviorProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumbackendSingleWriterLockBehaviorProp fromValue(String value) {
    for (EnumbackendSingleWriterLockBehaviorProp b : EnumbackendSingleWriterLockBehaviorProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumbackendSingleWriterLockBehaviorProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumbackendSingleWriterLockBehaviorProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumbackendSingleWriterLockBehaviorProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumbackendSingleWriterLockBehaviorProp.fromValue(value);
    }
  }
}

