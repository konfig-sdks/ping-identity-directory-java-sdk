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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.EnumlogPublisherLoggedMessageTypeProp;
import com.konfigthis.client.model.EnumlogPublisherLoggingErrorBehaviorProp;
import com.konfigthis.client.model.EnumlogPublisherSyslogFacilityProp;
import com.konfigthis.client.model.EnumlogPublisherSyslogSeverityProp;
import com.konfigthis.client.model.EnumsyslogJsonSyncLogPublisherSchemaUrn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * SyslogJsonSyncLogPublisherResponseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SyslogJsonSyncLogPublisherResponseAllOf {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumsyslogJsonSyncLogPublisherSchemaUrn> schemas = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SYSLOG_EXTERNAL_SERVER = "syslogExternalServer";
  @SerializedName(SERIALIZED_NAME_SYSLOG_EXTERNAL_SERVER)
  private List<String> syslogExternalServer = null;

  public static final String SERIALIZED_NAME_SYSLOG_FACILITY = "syslogFacility";
  @SerializedName(SERIALIZED_NAME_SYSLOG_FACILITY)
  private EnumlogPublisherSyslogFacilityProp syslogFacility;

  public static final String SERIALIZED_NAME_SYSLOG_SEVERITY = "syslogSeverity";
  @SerializedName(SERIALIZED_NAME_SYSLOG_SEVERITY)
  private EnumlogPublisherSyslogSeverityProp syslogSeverity;

  public static final String SERIALIZED_NAME_SYSLOG_MESSAGE_HOST_NAME = "syslogMessageHostName";
  @SerializedName(SERIALIZED_NAME_SYSLOG_MESSAGE_HOST_NAME)
  private String syslogMessageHostName;

  public static final String SERIALIZED_NAME_SYSLOG_MESSAGE_APPLICATION_NAME = "syslogMessageApplicationName";
  @SerializedName(SERIALIZED_NAME_SYSLOG_MESSAGE_APPLICATION_NAME)
  private String syslogMessageApplicationName;

  public static final String SERIALIZED_NAME_QUEUE_SIZE = "queueSize";
  @SerializedName(SERIALIZED_NAME_QUEUE_SIZE)
  private Integer queueSize;

  public static final String SERIALIZED_NAME_WRITE_MULTI_LINE_MESSAGES = "writeMultiLineMessages";
  @SerializedName(SERIALIZED_NAME_WRITE_MULTI_LINE_MESSAGES)
  private Boolean writeMultiLineMessages;

  public static final String SERIALIZED_NAME_INCLUDE_PRODUCT_NAME = "includeProductName";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PRODUCT_NAME)
  private Boolean includeProductName;

  public static final String SERIALIZED_NAME_INCLUDE_INSTANCE_NAME = "includeInstanceName";
  @SerializedName(SERIALIZED_NAME_INCLUDE_INSTANCE_NAME)
  private Boolean includeInstanceName;

  public static final String SERIALIZED_NAME_INCLUDE_STARTUP_I_D = "includeStartupID";
  @SerializedName(SERIALIZED_NAME_INCLUDE_STARTUP_I_D)
  private Boolean includeStartupID;

  public static final String SERIALIZED_NAME_INCLUDE_THREAD_I_D = "includeThreadID";
  @SerializedName(SERIALIZED_NAME_INCLUDE_THREAD_I_D)
  private Boolean includeThreadID;

  public static final String SERIALIZED_NAME_INCLUDE_SYNC_PIPE = "includeSyncPipe";
  @SerializedName(SERIALIZED_NAME_INCLUDE_SYNC_PIPE)
  private List<String> includeSyncPipe = null;

  public static final String SERIALIZED_NAME_LOGGED_MESSAGE_TYPE = "loggedMessageType";
  @SerializedName(SERIALIZED_NAME_LOGGED_MESSAGE_TYPE)
  private List<EnumlogPublisherLoggedMessageTypeProp> loggedMessageType = null;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_LOGGING_ERROR_BEHAVIOR = "loggingErrorBehavior";
  @SerializedName(SERIALIZED_NAME_LOGGING_ERROR_BEHAVIOR)
  private EnumlogPublisherLoggingErrorBehaviorProp loggingErrorBehavior;

  public SyslogJsonSyncLogPublisherResponseAllOf() {
  }

  public SyslogJsonSyncLogPublisherResponseAllOf description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Log Publisher
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Log Publisher")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public SyslogJsonSyncLogPublisherResponseAllOf schemas(List<EnumsyslogJsonSyncLogPublisherSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public SyslogJsonSyncLogPublisherResponseAllOf addSchemasItem(EnumsyslogJsonSyncLogPublisherSchemaUrn schemasItem) {
    if (this.schemas == null) {
      this.schemas = new ArrayList<>();
    }
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumsyslogJsonSyncLogPublisherSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumsyslogJsonSyncLogPublisherSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public SyslogJsonSyncLogPublisherResponseAllOf id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Log Publisher
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Log Publisher")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public SyslogJsonSyncLogPublisherResponseAllOf syslogExternalServer(List<String> syslogExternalServer) {
    
    
    
    
    this.syslogExternalServer = syslogExternalServer;
    return this;
  }

  public SyslogJsonSyncLogPublisherResponseAllOf addSyslogExternalServerItem(String syslogExternalServerItem) {
    if (this.syslogExternalServer == null) {
      this.syslogExternalServer = new ArrayList<>();
    }
    this.syslogExternalServer.add(syslogExternalServerItem);
    return this;
  }

   /**
   * The syslog server to which messages should be sent.
   * @return syslogExternalServer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The syslog server to which messages should be sent.")

  public List<String> getSyslogExternalServer() {
    return syslogExternalServer;
  }


  public void setSyslogExternalServer(List<String> syslogExternalServer) {
    
    
    
    this.syslogExternalServer = syslogExternalServer;
  }


  public SyslogJsonSyncLogPublisherResponseAllOf syslogFacility(EnumlogPublisherSyslogFacilityProp syslogFacility) {
    
    
    
    
    this.syslogFacility = syslogFacility;
    return this;
  }

   /**
   * Get syslogFacility
   * @return syslogFacility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumlogPublisherSyslogFacilityProp getSyslogFacility() {
    return syslogFacility;
  }


  public void setSyslogFacility(EnumlogPublisherSyslogFacilityProp syslogFacility) {
    
    
    
    this.syslogFacility = syslogFacility;
  }


  public SyslogJsonSyncLogPublisherResponseAllOf syslogSeverity(EnumlogPublisherSyslogSeverityProp syslogSeverity) {
    
    
    
    
    this.syslogSeverity = syslogSeverity;
    return this;
  }

   /**
   * Get syslogSeverity
   * @return syslogSeverity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumlogPublisherSyslogSeverityProp getSyslogSeverity() {
    return syslogSeverity;
  }


  public void setSyslogSeverity(EnumlogPublisherSyslogSeverityProp syslogSeverity) {
    
    
    
    this.syslogSeverity = syslogSeverity;
  }


  public SyslogJsonSyncLogPublisherResponseAllOf syslogMessageHostName(String syslogMessageHostName) {
    
    
    
    
    this.syslogMessageHostName = syslogMessageHostName;
    return this;
  }

   /**
   * The local host name that will be included in syslog messages that are logged by this Syslog JSON Sync Log Publisher.
   * @return syslogMessageHostName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The local host name that will be included in syslog messages that are logged by this Syslog JSON Sync Log Publisher.")

  public String getSyslogMessageHostName() {
    return syslogMessageHostName;
  }


  public void setSyslogMessageHostName(String syslogMessageHostName) {
    
    
    
    this.syslogMessageHostName = syslogMessageHostName;
  }


  public SyslogJsonSyncLogPublisherResponseAllOf syslogMessageApplicationName(String syslogMessageApplicationName) {
    
    
    
    
    this.syslogMessageApplicationName = syslogMessageApplicationName;
    return this;
  }

   /**
   * The application name that will be included in syslog messages that are logged by this Syslog JSON Sync Log Publisher.
   * @return syslogMessageApplicationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The application name that will be included in syslog messages that are logged by this Syslog JSON Sync Log Publisher.")

  public String getSyslogMessageApplicationName() {
    return syslogMessageApplicationName;
  }


  public void setSyslogMessageApplicationName(String syslogMessageApplicationName) {
    
    
    
    this.syslogMessageApplicationName = syslogMessageApplicationName;
  }


  public SyslogJsonSyncLogPublisherResponseAllOf queueSize(Integer queueSize) {
    
    
    
    
    this.queueSize = queueSize;
    return this;
  }

   /**
   * The maximum number of log records that can be stored in the asynchronous queue.
   * @return queueSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of log records that can be stored in the asynchronous queue.")

  public Integer getQueueSize() {
    return queueSize;
  }


  public void setQueueSize(Integer queueSize) {
    
    
    
    this.queueSize = queueSize;
  }


  public SyslogJsonSyncLogPublisherResponseAllOf writeMultiLineMessages(Boolean writeMultiLineMessages) {
    
    
    
    
    this.writeMultiLineMessages = writeMultiLineMessages;
    return this;
  }

   /**
   * Indicates whether the JSON objects should use a multi-line representation (with each object field and array value on its own line) that may be easier for administrators to read, but each message will be larger (because of additional spaces and end-of-line markers), and it may be more difficult to consume and parse through some text-oriented tools.
   * @return writeMultiLineMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the JSON objects should use a multi-line representation (with each object field and array value on its own line) that may be easier for administrators to read, but each message will be larger (because of additional spaces and end-of-line markers), and it may be more difficult to consume and parse through some text-oriented tools.")

  public Boolean getWriteMultiLineMessages() {
    return writeMultiLineMessages;
  }


  public void setWriteMultiLineMessages(Boolean writeMultiLineMessages) {
    
    
    
    this.writeMultiLineMessages = writeMultiLineMessages;
  }


  public SyslogJsonSyncLogPublisherResponseAllOf includeProductName(Boolean includeProductName) {
    
    
    
    
    this.includeProductName = includeProductName;
    return this;
  }

   /**
   * Indicates whether log messages should include the product name for the Directory Server.
   * @return includeProductName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether log messages should include the product name for the Directory Server.")

  public Boolean getIncludeProductName() {
    return includeProductName;
  }


  public void setIncludeProductName(Boolean includeProductName) {
    
    
    
    this.includeProductName = includeProductName;
  }


  public SyslogJsonSyncLogPublisherResponseAllOf includeInstanceName(Boolean includeInstanceName) {
    
    
    
    
    this.includeInstanceName = includeInstanceName;
    return this;
  }

   /**
   * Indicates whether log messages should include the instance name for the Directory Server.
   * @return includeInstanceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether log messages should include the instance name for the Directory Server.")

  public Boolean getIncludeInstanceName() {
    return includeInstanceName;
  }


  public void setIncludeInstanceName(Boolean includeInstanceName) {
    
    
    
    this.includeInstanceName = includeInstanceName;
  }


  public SyslogJsonSyncLogPublisherResponseAllOf includeStartupID(Boolean includeStartupID) {
    
    
    
    
    this.includeStartupID = includeStartupID;
    return this;
  }

   /**
   * Indicates whether log messages should include the startup ID for the Directory Server, which is a value assigned to the server instance at startup and may be used to identify when the server has been restarted.
   * @return includeStartupID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether log messages should include the startup ID for the Directory Server, which is a value assigned to the server instance at startup and may be used to identify when the server has been restarted.")

  public Boolean getIncludeStartupID() {
    return includeStartupID;
  }


  public void setIncludeStartupID(Boolean includeStartupID) {
    
    
    
    this.includeStartupID = includeStartupID;
  }


  public SyslogJsonSyncLogPublisherResponseAllOf includeThreadID(Boolean includeThreadID) {
    
    
    
    
    this.includeThreadID = includeThreadID;
    return this;
  }

   /**
   * Indicates whether log messages should include the thread ID for the Directory Server in each log message. This ID can be used to correlate log messages from the same thread within a single log as well as generated by the same thread across different types of log files. More information about the thread with a specific ID can be obtained using the cn&#x3D;JVM Stack Trace,cn&#x3D;monitor entry.
   * @return includeThreadID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether log messages should include the thread ID for the Directory Server in each log message. This ID can be used to correlate log messages from the same thread within a single log as well as generated by the same thread across different types of log files. More information about the thread with a specific ID can be obtained using the cn=JVM Stack Trace,cn=monitor entry.")

  public Boolean getIncludeThreadID() {
    return includeThreadID;
  }


  public void setIncludeThreadID(Boolean includeThreadID) {
    
    
    
    this.includeThreadID = includeThreadID;
  }


  public SyslogJsonSyncLogPublisherResponseAllOf includeSyncPipe(List<String> includeSyncPipe) {
    
    
    
    
    this.includeSyncPipe = includeSyncPipe;
    return this;
  }

  public SyslogJsonSyncLogPublisherResponseAllOf addIncludeSyncPipeItem(String includeSyncPipeItem) {
    if (this.includeSyncPipe == null) {
      this.includeSyncPipe = new ArrayList<>();
    }
    this.includeSyncPipe.add(includeSyncPipeItem);
    return this;
  }

   /**
   * Specifies which Sync Pipes can log messages to this Sync Log Publisher.
   * @return includeSyncPipe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies which Sync Pipes can log messages to this Sync Log Publisher.")

  public List<String> getIncludeSyncPipe() {
    return includeSyncPipe;
  }


  public void setIncludeSyncPipe(List<String> includeSyncPipe) {
    
    
    
    this.includeSyncPipe = includeSyncPipe;
  }


  public SyslogJsonSyncLogPublisherResponseAllOf loggedMessageType(List<EnumlogPublisherLoggedMessageTypeProp> loggedMessageType) {
    
    
    
    
    this.loggedMessageType = loggedMessageType;
    return this;
  }

  public SyslogJsonSyncLogPublisherResponseAllOf addLoggedMessageTypeItem(EnumlogPublisherLoggedMessageTypeProp loggedMessageTypeItem) {
    if (this.loggedMessageType == null) {
      this.loggedMessageType = new ArrayList<>();
    }
    this.loggedMessageType.add(loggedMessageTypeItem);
    return this;
  }

   /**
   * Get loggedMessageType
   * @return loggedMessageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumlogPublisherLoggedMessageTypeProp> getLoggedMessageType() {
    return loggedMessageType;
  }


  public void setLoggedMessageType(List<EnumlogPublisherLoggedMessageTypeProp> loggedMessageType) {
    
    
    
    this.loggedMessageType = loggedMessageType;
  }


  public SyslogJsonSyncLogPublisherResponseAllOf enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the Log Publisher is enabled for use.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the Log Publisher is enabled for use.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public SyslogJsonSyncLogPublisherResponseAllOf loggingErrorBehavior(EnumlogPublisherLoggingErrorBehaviorProp loggingErrorBehavior) {
    
    
    
    
    this.loggingErrorBehavior = loggingErrorBehavior;
    return this;
  }

   /**
   * Get loggingErrorBehavior
   * @return loggingErrorBehavior
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumlogPublisherLoggingErrorBehaviorProp getLoggingErrorBehavior() {
    return loggingErrorBehavior;
  }


  public void setLoggingErrorBehavior(EnumlogPublisherLoggingErrorBehaviorProp loggingErrorBehavior) {
    
    
    
    this.loggingErrorBehavior = loggingErrorBehavior;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the SyslogJsonSyncLogPublisherResponseAllOf instance itself
   */
  public SyslogJsonSyncLogPublisherResponseAllOf putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyslogJsonSyncLogPublisherResponseAllOf syslogJsonSyncLogPublisherResponseAllOf = (SyslogJsonSyncLogPublisherResponseAllOf) o;
    return Objects.equals(this.description, syslogJsonSyncLogPublisherResponseAllOf.description) &&
        Objects.equals(this.schemas, syslogJsonSyncLogPublisherResponseAllOf.schemas) &&
        Objects.equals(this.id, syslogJsonSyncLogPublisherResponseAllOf.id) &&
        Objects.equals(this.syslogExternalServer, syslogJsonSyncLogPublisherResponseAllOf.syslogExternalServer) &&
        Objects.equals(this.syslogFacility, syslogJsonSyncLogPublisherResponseAllOf.syslogFacility) &&
        Objects.equals(this.syslogSeverity, syslogJsonSyncLogPublisherResponseAllOf.syslogSeverity) &&
        Objects.equals(this.syslogMessageHostName, syslogJsonSyncLogPublisherResponseAllOf.syslogMessageHostName) &&
        Objects.equals(this.syslogMessageApplicationName, syslogJsonSyncLogPublisherResponseAllOf.syslogMessageApplicationName) &&
        Objects.equals(this.queueSize, syslogJsonSyncLogPublisherResponseAllOf.queueSize) &&
        Objects.equals(this.writeMultiLineMessages, syslogJsonSyncLogPublisherResponseAllOf.writeMultiLineMessages) &&
        Objects.equals(this.includeProductName, syslogJsonSyncLogPublisherResponseAllOf.includeProductName) &&
        Objects.equals(this.includeInstanceName, syslogJsonSyncLogPublisherResponseAllOf.includeInstanceName) &&
        Objects.equals(this.includeStartupID, syslogJsonSyncLogPublisherResponseAllOf.includeStartupID) &&
        Objects.equals(this.includeThreadID, syslogJsonSyncLogPublisherResponseAllOf.includeThreadID) &&
        Objects.equals(this.includeSyncPipe, syslogJsonSyncLogPublisherResponseAllOf.includeSyncPipe) &&
        Objects.equals(this.loggedMessageType, syslogJsonSyncLogPublisherResponseAllOf.loggedMessageType) &&
        Objects.equals(this.enabled, syslogJsonSyncLogPublisherResponseAllOf.enabled) &&
        Objects.equals(this.loggingErrorBehavior, syslogJsonSyncLogPublisherResponseAllOf.loggingErrorBehavior)&&
        Objects.equals(this.additionalProperties, syslogJsonSyncLogPublisherResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, id, syslogExternalServer, syslogFacility, syslogSeverity, syslogMessageHostName, syslogMessageApplicationName, queueSize, writeMultiLineMessages, includeProductName, includeInstanceName, includeStartupID, includeThreadID, includeSyncPipe, loggedMessageType, enabled, loggingErrorBehavior, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyslogJsonSyncLogPublisherResponseAllOf {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    syslogExternalServer: ").append(toIndentedString(syslogExternalServer)).append("\n");
    sb.append("    syslogFacility: ").append(toIndentedString(syslogFacility)).append("\n");
    sb.append("    syslogSeverity: ").append(toIndentedString(syslogSeverity)).append("\n");
    sb.append("    syslogMessageHostName: ").append(toIndentedString(syslogMessageHostName)).append("\n");
    sb.append("    syslogMessageApplicationName: ").append(toIndentedString(syslogMessageApplicationName)).append("\n");
    sb.append("    queueSize: ").append(toIndentedString(queueSize)).append("\n");
    sb.append("    writeMultiLineMessages: ").append(toIndentedString(writeMultiLineMessages)).append("\n");
    sb.append("    includeProductName: ").append(toIndentedString(includeProductName)).append("\n");
    sb.append("    includeInstanceName: ").append(toIndentedString(includeInstanceName)).append("\n");
    sb.append("    includeStartupID: ").append(toIndentedString(includeStartupID)).append("\n");
    sb.append("    includeThreadID: ").append(toIndentedString(includeThreadID)).append("\n");
    sb.append("    includeSyncPipe: ").append(toIndentedString(includeSyncPipe)).append("\n");
    sb.append("    loggedMessageType: ").append(toIndentedString(loggedMessageType)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    loggingErrorBehavior: ").append(toIndentedString(loggingErrorBehavior)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("id");
    openapiFields.add("syslogExternalServer");
    openapiFields.add("syslogFacility");
    openapiFields.add("syslogSeverity");
    openapiFields.add("syslogMessageHostName");
    openapiFields.add("syslogMessageApplicationName");
    openapiFields.add("queueSize");
    openapiFields.add("writeMultiLineMessages");
    openapiFields.add("includeProductName");
    openapiFields.add("includeInstanceName");
    openapiFields.add("includeStartupID");
    openapiFields.add("includeThreadID");
    openapiFields.add("includeSyncPipe");
    openapiFields.add("loggedMessageType");
    openapiFields.add("enabled");
    openapiFields.add("loggingErrorBehavior");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SyslogJsonSyncLogPublisherResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SyslogJsonSyncLogPublisherResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SyslogJsonSyncLogPublisherResponseAllOf is not found in the empty JSON string", SyslogJsonSyncLogPublisherResponseAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("schemas") != null && !jsonObj.get("schemas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemas` to be an array in the JSON string but got `%s`", jsonObj.get("schemas").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("syslogExternalServer") != null && !jsonObj.get("syslogExternalServer").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `syslogExternalServer` to be an array in the JSON string but got `%s`", jsonObj.get("syslogExternalServer").toString()));
      }
      if ((jsonObj.get("syslogMessageHostName") != null && !jsonObj.get("syslogMessageHostName").isJsonNull()) && !jsonObj.get("syslogMessageHostName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `syslogMessageHostName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("syslogMessageHostName").toString()));
      }
      if ((jsonObj.get("syslogMessageApplicationName") != null && !jsonObj.get("syslogMessageApplicationName").isJsonNull()) && !jsonObj.get("syslogMessageApplicationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `syslogMessageApplicationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("syslogMessageApplicationName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("includeSyncPipe") != null && !jsonObj.get("includeSyncPipe").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includeSyncPipe` to be an array in the JSON string but got `%s`", jsonObj.get("includeSyncPipe").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("loggedMessageType") != null && !jsonObj.get("loggedMessageType").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `loggedMessageType` to be an array in the JSON string but got `%s`", jsonObj.get("loggedMessageType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SyslogJsonSyncLogPublisherResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SyslogJsonSyncLogPublisherResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SyslogJsonSyncLogPublisherResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SyslogJsonSyncLogPublisherResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<SyslogJsonSyncLogPublisherResponseAllOf>() {
           @Override
           public void write(JsonWriter out, SyslogJsonSyncLogPublisherResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SyslogJsonSyncLogPublisherResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SyslogJsonSyncLogPublisherResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SyslogJsonSyncLogPublisherResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SyslogJsonSyncLogPublisherResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to SyslogJsonSyncLogPublisherResponseAllOf
  */
  public static SyslogJsonSyncLogPublisherResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SyslogJsonSyncLogPublisherResponseAllOf.class);
  }

 /**
  * Convert an instance of SyslogJsonSyncLogPublisherResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

