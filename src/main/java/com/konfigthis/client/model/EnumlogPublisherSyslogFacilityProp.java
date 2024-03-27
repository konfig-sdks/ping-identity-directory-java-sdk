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
 * The syslog facility to use for the messages that are logged by this Syslog JSON Audit Log Publisher.
 */
@JsonAdapter(EnumlogPublisherSyslogFacilityProp.Adapter.class)public enum EnumlogPublisherSyslogFacilityProp {
  
  USER_LEVEL_MESSAGES("user-level-messages"),
  
  SYSTEM_DAEMONS("system-daemons"),
  
  SECURITY_AND_AUTHORIZATION("security-and-authorization"),
  
  SECURITY_AND_AUTHORIZATION_ALTERNATIVE("security-and-authorization-alternative"),
  
  LOG_AUDIT("log-audit"),
  
  LOG_ALERT("log-alert"),
  
  LOCAL_USE_0("local-use-0"),
  
  LOCAL_USE_1("local-use-1"),
  
  LOCAL_USE_2("local-use-2"),
  
  LOCAL_USE_3("local-use-3"),
  
  LOCAL_USE_4("local-use-4"),
  
  LOCAL_USE_5("local-use-5"),
  
  LOCAL_USE_6("local-use-6"),
  
  LOCAL_USE_7("local-use-7"),
  
  KERNEL_MESSAGES("kernel-messages"),
  
  MAIL_SYSTEM("mail-system"),
  
  SYSLOGD_INTERNAL_MESSAGES("syslogd-internal-messages"),
  
  LINE_PRINTER("line-printer"),
  
  NETWORK_NEWS("network-news"),
  
  UUCP("uucp"),
  
  CLOCK_DAEMON("clock-daemon"),
  
  FTP_DAEMON("ftp-daemon"),
  
  NTP_DAEMON("ntp-daemon"),
  
  CLOCK_DAEMON_ALTERNATIVE("clock-daemon-alternative");

  private String value;

  EnumlogPublisherSyslogFacilityProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumlogPublisherSyslogFacilityProp fromValue(String value) {
    for (EnumlogPublisherSyslogFacilityProp b : EnumlogPublisherSyslogFacilityProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumlogPublisherSyslogFacilityProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumlogPublisherSyslogFacilityProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumlogPublisherSyslogFacilityProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumlogPublisherSyslogFacilityProp.fromValue(value);
    }
  }
}

