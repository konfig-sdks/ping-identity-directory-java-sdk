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
 * Indicates whether this Replication Assurance Result Criteria should match operations based on whether the assurance requirements have been satisfied.
 */
@JsonAdapter(EnumresultCriteriaAssuranceSatisfiedProp.Adapter.class)public enum EnumresultCriteriaAssuranceSatisfiedProp {
  
  ANY("any"),
  
  BOTH_SATISFIED("both-satisfied"),
  
  EITHER_SATISFIED("either-satisfied"),
  
  AT_LEAST_LOCAL_SATISFIED("at-least-local-satisfied"),
  
  AT_LEAST_REMOTE_SATISFIED("at-least-remote-satisfied"),
  
  ONLY_LOCAL_SATISFIED("only-local-satisfied"),
  
  ONLY_REMOTE_SATISFIED("only-remote-satisfied"),
  
  EITHER_NOT_SATISFIED("either-not-satisfied"),
  
  AT_LEAST_LOCAL_NOT_SATISFIED("at-least-local-not-satisfied"),
  
  AT_LEAST_REMOTE_NOT_SATISFIED("at-least-remote-not-satisfied"),
  
  NEITHER_SATISFIED("neither-satisfied");

  private String value;

  EnumresultCriteriaAssuranceSatisfiedProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumresultCriteriaAssuranceSatisfiedProp fromValue(String value) {
    for (EnumresultCriteriaAssuranceSatisfiedProp b : EnumresultCriteriaAssuranceSatisfiedProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumresultCriteriaAssuranceSatisfiedProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumresultCriteriaAssuranceSatisfiedProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumresultCriteriaAssuranceSatisfiedProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumresultCriteriaAssuranceSatisfiedProp.fromValue(value);
    }
  }
}

