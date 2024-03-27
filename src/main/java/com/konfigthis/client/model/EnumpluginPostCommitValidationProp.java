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
 * Specifies the degree of validation that should be performed after a change has been successfully processed, in order to detect any conflicts that may have resulted from other changes processed simultaneously through this or another Directory Server instance. If a conflict is detected during post-commit validation, an administrative alert will be generated to notify administrators of the problem.
 */
@JsonAdapter(EnumpluginPostCommitValidationProp.Adapter.class)public enum EnumpluginPostCommitValidationProp {
  
  NONE("none"),
  
  ALL_SUBTREE_VIEWS("all-subtree-views"),
  
  ALL_BACKEND_SETS("all-backend-sets"),
  
  ALL_AVAILABLE_BACKEND_SERVERS("all-available-backend-servers");

  private String value;

  EnumpluginPostCommitValidationProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumpluginPostCommitValidationProp fromValue(String value) {
    for (EnumpluginPostCommitValidationProp b : EnumpluginPostCommitValidationProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumpluginPostCommitValidationProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumpluginPostCommitValidationProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumpluginPostCommitValidationProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumpluginPostCommitValidationProp.fromValue(value);
    }
  }
}

