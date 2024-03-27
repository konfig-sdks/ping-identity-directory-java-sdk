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
 * Search filters that include Is Member Of Virtual Attribute searches on dynamic groups can be updated to include the dynamic group filter in the search filter itself. This can allow the backend to more efficiently process the search filter by using attribute indexes sooner in the search processing.
 */
@JsonAdapter(EnumvirtualAttributeRewriteSearchFiltersProp.Adapter.class)public enum EnumvirtualAttributeRewriteSearchFiltersProp {
  
  ALWAYS("always"),
  
  WITHIN_GROUP_SCOPE("within-group-scope"),
  
  NEVER("never");

  private String value;

  EnumvirtualAttributeRewriteSearchFiltersProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumvirtualAttributeRewriteSearchFiltersProp fromValue(String value) {
    for (EnumvirtualAttributeRewriteSearchFiltersProp b : EnumvirtualAttributeRewriteSearchFiltersProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumvirtualAttributeRewriteSearchFiltersProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumvirtualAttributeRewriteSearchFiltersProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumvirtualAttributeRewriteSearchFiltersProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumvirtualAttributeRewriteSearchFiltersProp.fromValue(value);
    }
  }
}

