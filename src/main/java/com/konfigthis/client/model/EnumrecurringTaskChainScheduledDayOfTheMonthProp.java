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
 * The specific days of the month on which instances of this Recurring Task Chain may be scheduled to start. If the scheduled-day-selection-type property has a value of selected-days-of-the-month, then this property must have one or more values; otherwise, it must be left undefined.
 */
@JsonAdapter(EnumrecurringTaskChainScheduledDayOfTheMonthProp.Adapter.class)public enum EnumrecurringTaskChainScheduledDayOfTheMonthProp {
  
  DAY_01("day-01"),
  
  DAY_02("day-02"),
  
  DAY_03("day-03"),
  
  DAY_04("day-04"),
  
  DAY_05("day-05"),
  
  DAY_06("day-06"),
  
  DAY_07("day-07"),
  
  DAY_08("day-08"),
  
  DAY_09("day-09"),
  
  DAY_10("day-10"),
  
  DAY_11("day-11"),
  
  DAY_12("day-12"),
  
  DAY_13("day-13"),
  
  DAY_14("day-14"),
  
  DAY_15("day-15"),
  
  DAY_16("day-16"),
  
  DAY_17("day-17"),
  
  DAY_18("day-18"),
  
  DAY_19("day-19"),
  
  DAY_20("day-20"),
  
  DAY_21("day-21"),
  
  DAY_22("day-22"),
  
  DAY_23("day-23"),
  
  DAY_24("day-24"),
  
  DAY_25("day-25"),
  
  DAY_26("day-26"),
  
  DAY_27("day-27"),
  
  DAY_28("day-28"),
  
  DAY_29("day-29"),
  
  DAY_30("day-30"),
  
  DAY_31("day-31"),
  
  NEXT_TO_LAST_DAY_OF_THE_MONTH("next-to-last-day-of-the-month"),
  
  LAST_DAY_OF_THE_MONTH("last-day-of-the-month");

  private String value;

  EnumrecurringTaskChainScheduledDayOfTheMonthProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumrecurringTaskChainScheduledDayOfTheMonthProp fromValue(String value) {
    for (EnumrecurringTaskChainScheduledDayOfTheMonthProp b : EnumrecurringTaskChainScheduledDayOfTheMonthProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumrecurringTaskChainScheduledDayOfTheMonthProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumrecurringTaskChainScheduledDayOfTheMonthProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumrecurringTaskChainScheduledDayOfTheMonthProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumrecurringTaskChainScheduledDayOfTheMonthProp.fromValue(value);
    }
  }
}

