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
 * The behavior to exhibit if the target attribute exists when initially populating the entry with composed values (whether during an LDIF import, an add operation, or an invocation of the populate composed attribute values task).
 */
@JsonAdapter(EnumpluginTargetAttributeExistsDuringInitialPopulationBehaviorProp.Adapter.class)public enum EnumpluginTargetAttributeExistsDuringInitialPopulationBehaviorProp {
  
  PRESERVE_EXISTING_VALUES("preserve-existing-values"),
  
  OVERWRITE_EXISTING_VALUES("overwrite-existing-values"),
  
  MERGE_EXISTING_AND_COMPOSED_VALUES("merge-existing-and-composed-values"),
  
  REJECT_EXISTING_VALUES_IN_ADD_BUT_PRESERVE_IN_LDIF_IMPORT("reject-existing-values-in-add-but-preserve-in-ldif-import"),
  
  REJECT_EXISTING_VALUES_IN_ADD_BUT_OVERWRITE_IN_LDIF_IMPORT("reject-existing-values-in-add-but-overwrite-in-ldif-import"),
  
  REJECT_EXISTING_VALUES_IN_ADD_BUT_MERGE_IN_LDIF_IMPORT("reject-existing-values-in-add-but-merge-in-ldif-import");

  private String value;

  EnumpluginTargetAttributeExistsDuringInitialPopulationBehaviorProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumpluginTargetAttributeExistsDuringInitialPopulationBehaviorProp fromValue(String value) {
    for (EnumpluginTargetAttributeExistsDuringInitialPopulationBehaviorProp b : EnumpluginTargetAttributeExistsDuringInitialPopulationBehaviorProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumpluginTargetAttributeExistsDuringInitialPopulationBehaviorProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumpluginTargetAttributeExistsDuringInitialPopulationBehaviorProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumpluginTargetAttributeExistsDuringInitialPopulationBehaviorProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumpluginTargetAttributeExistsDuringInitialPopulationBehaviorProp.fromValue(value);
    }
  }
}

