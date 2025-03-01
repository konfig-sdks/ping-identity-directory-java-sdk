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
 * Gets or Sets Enumshort-unique-id-virtual-attributeSchemaUrn
 */
@JsonAdapter(EnumshortUniqueIdVirtualAttributeSchemaUrn.Adapter.class)public enum EnumshortUniqueIdVirtualAttributeSchemaUrn {
  
  URN_PINGIDENTITY_SCHEMAS_CONFIGURATION_2_0_VIRTUAL_ATTRIBUTE_SHORT_UNIQUE_ID("urn:pingidentity:schemas:configuration:2.0:virtual-attribute:short-unique-id");

  private String value;

  EnumshortUniqueIdVirtualAttributeSchemaUrn(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumshortUniqueIdVirtualAttributeSchemaUrn fromValue(String value) {
    for (EnumshortUniqueIdVirtualAttributeSchemaUrn b : EnumshortUniqueIdVirtualAttributeSchemaUrn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumshortUniqueIdVirtualAttributeSchemaUrn> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumshortUniqueIdVirtualAttributeSchemaUrn enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumshortUniqueIdVirtualAttributeSchemaUrn read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumshortUniqueIdVirtualAttributeSchemaUrn.fromValue(value);
    }
  }
}

