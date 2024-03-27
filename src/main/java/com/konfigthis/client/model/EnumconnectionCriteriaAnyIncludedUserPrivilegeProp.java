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
 * Specifies the name of a privilege that may be held by the authenticated user for clients included in this Simple Connection Criteria. If any privilege names are provided, then the authenticated user must have at least one of those privileges. This will only be taken into account for client connections that have authenticated to the server and will be ignored for unauthenticated client connections.
 */
@JsonAdapter(EnumconnectionCriteriaAnyIncludedUserPrivilegeProp.Adapter.class)public enum EnumconnectionCriteriaAnyIncludedUserPrivilegeProp {
  
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
  
  USE_ADMIN_SESSION("use-admin-session"),
  
  SOFT_DELETE_READ("soft-delete-read"),
  
  METRICS_READ("metrics-read"),
  
  REMOTE_LOG_READ("remote-log-read"),
  
  MANAGE_TOPOLOGY("manage-topology"),
  
  PERMIT_GET_PASSWORD_POLICY_STATE_ISSUES("permit-get-password-policy-state-issues"),
  
  PERMIT_PROXIED_MSCHAPV2_DETAILS("permit-proxied-mschapv2-details"),
  
  PERMIT_EXTERNALLY_PROCESSED_AUTHENTICATION("permit-externally-processed-authentication"),
  
  PERMIT_EXPORT_REVERSIBLE_PASSWORDS("permit-export-reversible-passwords"),
  
  PERMIT_FORWARDING_CLIENT_CONNECTION_POLICY("permit-forwarding-client-connection-policy"),
  
  EXEC_TASK("exec-task"),
  
  COLLECT_SUPPORT_DATA("collect-support-data"),
  
  FILE_SERVLET_ACCESS("file-servlet-access"),
  
  PERMIT_REPLACE_CERTIFICATE_REQUEST("permit-replace-certificate-request");

  private String value;

  EnumconnectionCriteriaAnyIncludedUserPrivilegeProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumconnectionCriteriaAnyIncludedUserPrivilegeProp fromValue(String value) {
    for (EnumconnectionCriteriaAnyIncludedUserPrivilegeProp b : EnumconnectionCriteriaAnyIncludedUserPrivilegeProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumconnectionCriteriaAnyIncludedUserPrivilegeProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumconnectionCriteriaAnyIncludedUserPrivilegeProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumconnectionCriteriaAnyIncludedUserPrivilegeProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumconnectionCriteriaAnyIncludedUserPrivilegeProp.fromValue(value);
    }
  }
}

