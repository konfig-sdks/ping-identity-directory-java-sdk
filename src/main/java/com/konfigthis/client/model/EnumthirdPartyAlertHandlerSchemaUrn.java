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
 * Gets or Sets Enumthird-party-alert-handlerSchemaUrn
 */
@JsonAdapter(EnumthirdPartyAlertHandlerSchemaUrn.Adapter.class)public enum EnumthirdPartyAlertHandlerSchemaUrn {
  
  URN_PINGIDENTITY_SCHEMAS_CONFIGURATION_2_0_ALERT_HANDLER_THIRD_PARTY("urn:pingidentity:schemas:configuration:2.0:alert-handler:third-party");

  private String value;

  EnumthirdPartyAlertHandlerSchemaUrn(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumthirdPartyAlertHandlerSchemaUrn fromValue(String value) {
    for (EnumthirdPartyAlertHandlerSchemaUrn b : EnumthirdPartyAlertHandlerSchemaUrn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumthirdPartyAlertHandlerSchemaUrn> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumthirdPartyAlertHandlerSchemaUrn enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumthirdPartyAlertHandlerSchemaUrn read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumthirdPartyAlertHandlerSchemaUrn.fromValue(value);
    }
  }
}

