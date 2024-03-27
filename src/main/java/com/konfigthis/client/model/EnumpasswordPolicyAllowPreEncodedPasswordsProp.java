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
 * Indicates whether users can change their passwords by providing a pre-encoded value.
 */
@JsonAdapter(EnumpasswordPolicyAllowPreEncodedPasswordsProp.Adapter.class)public enum EnumpasswordPolicyAllowPreEncodedPasswordsProp {
  
  FALSE("false"),
  
  ADD_ONLY("add-only"),
  
  ADMIN_RESET_ONLY("admin-reset-only"),
  
  ADD_AND_ADMIN_RESET_ONLY("add-and-admin-reset-only"),
  
  TRUE("true");

  private String value;

  EnumpasswordPolicyAllowPreEncodedPasswordsProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumpasswordPolicyAllowPreEncodedPasswordsProp fromValue(String value) {
    for (EnumpasswordPolicyAllowPreEncodedPasswordsProp b : EnumpasswordPolicyAllowPreEncodedPasswordsProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumpasswordPolicyAllowPreEncodedPasswordsProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumpasswordPolicyAllowPreEncodedPasswordsProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumpasswordPolicyAllowPreEncodedPasswordsProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumpasswordPolicyAllowPreEncodedPasswordsProp.fromValue(value);
    }
  }
}

