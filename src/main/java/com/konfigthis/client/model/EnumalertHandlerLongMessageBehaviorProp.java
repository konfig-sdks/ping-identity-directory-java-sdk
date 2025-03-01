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
 * The behavior to use for alert messages that are longer than the 160-character size limit for SMS messages.
 */
@JsonAdapter(EnumalertHandlerLongMessageBehaviorProp.Adapter.class)public enum EnumalertHandlerLongMessageBehaviorProp {
  
  TRUNCATE("truncate"),
  
  SEND_AS_MULTIPLE_MESSAGES("send-as-multiple-messages");

  private String value;

  EnumalertHandlerLongMessageBehaviorProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumalertHandlerLongMessageBehaviorProp fromValue(String value) {
    for (EnumalertHandlerLongMessageBehaviorProp b : EnumalertHandlerLongMessageBehaviorProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumalertHandlerLongMessageBehaviorProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumalertHandlerLongMessageBehaviorProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumalertHandlerLongMessageBehaviorProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumalertHandlerLongMessageBehaviorProp.fromValue(value);
    }
  }
}

