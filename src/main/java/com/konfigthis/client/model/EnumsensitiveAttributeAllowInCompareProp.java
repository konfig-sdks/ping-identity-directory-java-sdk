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
 * Indicates whether clients will be allowed to target sensitive attributes with compare requests.
 */
@JsonAdapter(EnumsensitiveAttributeAllowInCompareProp.Adapter.class)public enum EnumsensitiveAttributeAllowInCompareProp {
  
  ALLOW("allow"),
  
  REJECT("reject"),
  
  SECURE_ONLY("secure-only");

  private String value;

  EnumsensitiveAttributeAllowInCompareProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumsensitiveAttributeAllowInCompareProp fromValue(String value) {
    for (EnumsensitiveAttributeAllowInCompareProp b : EnumsensitiveAttributeAllowInCompareProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumsensitiveAttributeAllowInCompareProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumsensitiveAttributeAllowInCompareProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumsensitiveAttributeAllowInCompareProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumsensitiveAttributeAllowInCompareProp.fromValue(value);
    }
  }
}

