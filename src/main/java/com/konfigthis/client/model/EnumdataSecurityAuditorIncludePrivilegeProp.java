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
 * If defined, only entries with the specified privileges will be reported. By default, entries with any privilege assigned will be reported.
 */
@JsonAdapter(EnumdataSecurityAuditorIncludePrivilegeProp.Adapter.class)public enum EnumdataSecurityAuditorIncludePrivilegeProp {
  
  AUDIT_DATA_SECURITY("audit-data-security"),
  
  BYPASS_ACL("bypass-acl"),
  
  BYPASS_READ_ACL("bypass-read-acl"),
  
  MODIFY_ACL("modify-acl"),
  
  CONFIG_READ("config-read"),
  
  CONFIG_WRITE("config-write"),
  
  JMX_READ("jmx-read"),
  
  JMX_WRITE("jmx-write"),
  
  JMX_NOTIFY("jmx-notify"),
  
  LDIF_IMPORT("ldif-import"),
  
  LDIF_EXPORT("ldif-export"),
  
  BACKEND_BACKUP("backend-backup"),
  
  BACKEND_RESTORE("backend-restore"),
  
  SERVER_SHUTDOWN("server-shutdown"),
  
  SERVER_RESTART("server-restart"),
  
  PROXIED_AUTH("proxied-auth"),
  
  DISCONNECT_CLIENT("disconnect-client"),
  
  PASSWORD_RESET("password-reset"),
  
  UPDATE_SCHEMA("update-schema"),
  
  PRIVILEGE_CHANGE("privilege-change"),
  
  UNINDEXED_SEARCH("unindexed-search"),
  
  UNINDEXED_SEARCH_WITH_CONTROL("unindexed-search-with-control"),
  
  BYPASS_PW_POLICY("bypass-pw-policy"),
  
  LOCKDOWN_MODE("lockdown-mode"),
  
  STREAM_VALUES("stream-values"),
  
  THIRD_PARTY_TASK("third-party-task"),
  
  SOFT_DELETE_READ("soft-delete-read"),
  
  METRICS_READ("metrics-read"),
  
  REMOTE_LOG_READ("remote-log-read"),
  
  MANAGE_TOPOLOGY("manage-topology"),
  
  PERMIT_GET_PASSWORD_POLICY_STATE_ISSUES("permit-get-password-policy-state-issues"),
  
  PERMIT_PROXIED_MSCHAPV2_DETAILS("permit-proxied-mschapv2-details"),
  
  PERMIT_FORWARDING_CLIENT_CONNECTION_POLICY("permit-forwarding-client-connection-policy"),
  
  EXEC_TASK("exec-task"),
  
  COLLECT_SUPPORT_DATA("collect-support-data"),
  
  FILE_SERVLET_ACCESS("file-servlet-access"),
  
  PERMIT_REPLACE_CERTIFICATE_REQUEST("permit-replace-certificate-request");

  private String value;

  EnumdataSecurityAuditorIncludePrivilegeProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumdataSecurityAuditorIncludePrivilegeProp fromValue(String value) {
    for (EnumdataSecurityAuditorIncludePrivilegeProp b : EnumdataSecurityAuditorIncludePrivilegeProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumdataSecurityAuditorIncludePrivilegeProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumdataSecurityAuditorIncludePrivilegeProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumdataSecurityAuditorIncludePrivilegeProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumdataSecurityAuditorIncludePrivilegeProp.fromValue(value);
    }
  }
}

