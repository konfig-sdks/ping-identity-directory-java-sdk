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
 * Gets or Sets Enumcharacter-set-password-validatorSchemaUrn
 */
@JsonAdapter(EnumcharacterSetPasswordValidatorSchemaUrn.Adapter.class)public enum EnumcharacterSetPasswordValidatorSchemaUrn {
  
  URN_PINGIDENTITY_SCHEMAS_CONFIGURATION_2_0_PASSWORD_VALIDATOR_CHARACTER_SET("urn:pingidentity:schemas:configuration:2.0:password-validator:character-set");

  private String value;

  EnumcharacterSetPasswordValidatorSchemaUrn(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumcharacterSetPasswordValidatorSchemaUrn fromValue(String value) {
    for (EnumcharacterSetPasswordValidatorSchemaUrn b : EnumcharacterSetPasswordValidatorSchemaUrn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumcharacterSetPasswordValidatorSchemaUrn> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumcharacterSetPasswordValidatorSchemaUrn enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumcharacterSetPasswordValidatorSchemaUrn read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumcharacterSetPasswordValidatorSchemaUrn.fromValue(value);
    }
  }
}

