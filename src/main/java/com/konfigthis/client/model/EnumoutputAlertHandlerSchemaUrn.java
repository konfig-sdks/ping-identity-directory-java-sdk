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
 * Gets or Sets Enumoutput-alert-handlerSchemaUrn
 */
@JsonAdapter(EnumoutputAlertHandlerSchemaUrn.Adapter.class)public enum EnumoutputAlertHandlerSchemaUrn {
  
  URN_PINGIDENTITY_SCHEMAS_CONFIGURATION_2_0_ALERT_HANDLER_OUTPUT("urn:pingidentity:schemas:configuration:2.0:alert-handler:output");

  private String value;

  EnumoutputAlertHandlerSchemaUrn(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumoutputAlertHandlerSchemaUrn fromValue(String value) {
    for (EnumoutputAlertHandlerSchemaUrn b : EnumoutputAlertHandlerSchemaUrn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumoutputAlertHandlerSchemaUrn> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumoutputAlertHandlerSchemaUrn enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumoutputAlertHandlerSchemaUrn read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumoutputAlertHandlerSchemaUrn.fromValue(value);
    }
  }
}

