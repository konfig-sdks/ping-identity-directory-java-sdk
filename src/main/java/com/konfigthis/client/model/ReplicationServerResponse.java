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
import com.konfigthis.client.model.EnumreplicationServerCompressionCriteriaProp;
import com.konfigthis.client.model.EnumreplicationServerMissingChangesPolicyProp;
import com.konfigthis.client.model.EnumreplicationServerSchemaUrn;
import com.konfigthis.client.model.MetaMeta;
import com.konfigthis.client.model.MetaUrnPingidentitySchemasConfigurationMessages20;
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
 * ReplicationServerResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReplicationServerResponse {
  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumreplicationServerSchemaUrn> schemas = null;

  public static final String SERIALIZED_NAME_REPLICATION_SERVER_I_D = "replicationServerID";
  @SerializedName(SERIALIZED_NAME_REPLICATION_SERVER_I_D)
  private Integer replicationServerID;

  public static final String SERIALIZED_NAME_REPLICATION_D_B_DIRECTORY = "replicationDBDirectory";
  @SerializedName(SERIALIZED_NAME_REPLICATION_D_B_DIRECTORY)
  private String replicationDBDirectory;

  public static final String SERIALIZED_NAME_JE_PROPERTY = "jeProperty";
  @SerializedName(SERIALIZED_NAME_JE_PROPERTY)
  private List<String> jeProperty = null;

  public static final String SERIALIZED_NAME_REPLICATION_PURGE_DELAY = "replicationPurgeDelay";
  @SerializedName(SERIALIZED_NAME_REPLICATION_PURGE_DELAY)
  private String replicationPurgeDelay;

  public static final String SERIALIZED_NAME_TARGET_DATABASE_SIZE = "targetDatabaseSize";
  @SerializedName(SERIALIZED_NAME_TARGET_DATABASE_SIZE)
  private String targetDatabaseSize;

  public static final String SERIALIZED_NAME_REPLICATION_PORT = "replicationPort";
  @SerializedName(SERIALIZED_NAME_REPLICATION_PORT)
  private Integer replicationPort;

  public static final String SERIALIZED_NAME_LISTEN_ON_ALL_ADDRESSES = "listenOnAllAddresses";
  @SerializedName(SERIALIZED_NAME_LISTEN_ON_ALL_ADDRESSES)
  private Boolean listenOnAllAddresses;

  public static final String SERIALIZED_NAME_COMPRESSION_CRITERIA = "compressionCriteria";
  @SerializedName(SERIALIZED_NAME_COMPRESSION_CRITERIA)
  private EnumreplicationServerCompressionCriteriaProp compressionCriteria;

  public static final String SERIALIZED_NAME_HEARTBEAT_INTERVAL = "heartbeatInterval";
  @SerializedName(SERIALIZED_NAME_HEARTBEAT_INTERVAL)
  private String heartbeatInterval;

  public static final String SERIALIZED_NAME_REMOTE_MONITOR_UPDATE_INTERVAL = "remoteMonitorUpdateInterval";
  @SerializedName(SERIALIZED_NAME_REMOTE_MONITOR_UPDATE_INTERVAL)
  private String remoteMonitorUpdateInterval;

  public static final String SERIALIZED_NAME_RESTRICTED_DOMAIN = "restrictedDomain";
  @SerializedName(SERIALIZED_NAME_RESTRICTED_DOMAIN)
  private List<String> restrictedDomain = null;

  public static final String SERIALIZED_NAME_GATEWAY_PRIORITY = "gatewayPriority";
  @SerializedName(SERIALIZED_NAME_GATEWAY_PRIORITY)
  private Integer gatewayPriority;

  public static final String SERIALIZED_NAME_MISSING_CHANGES_ALERT_THRESHOLD_PERCENT = "missingChangesAlertThresholdPercent";
  @SerializedName(SERIALIZED_NAME_MISSING_CHANGES_ALERT_THRESHOLD_PERCENT)
  private Integer missingChangesAlertThresholdPercent;

  public static final String SERIALIZED_NAME_MISSING_CHANGES_POLICY = "missingChangesPolicy";
  @SerializedName(SERIALIZED_NAME_MISSING_CHANGES_POLICY)
  private EnumreplicationServerMissingChangesPolicyProp missingChangesPolicy;

  public static final String SERIALIZED_NAME_INCLUDE_ALL_REMOTE_SERVERS_STATE_IN_MONITOR_MESSAGE = "includeAllRemoteServersStateInMonitorMessage";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ALL_REMOTE_SERVERS_STATE_IN_MONITOR_MESSAGE)
  private Boolean includeAllRemoteServersStateInMonitorMessage;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public ReplicationServerResponse() {
  }

  public ReplicationServerResponse schemas(List<EnumreplicationServerSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public ReplicationServerResponse addSchemasItem(EnumreplicationServerSchemaUrn schemasItem) {
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

  public List<EnumreplicationServerSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumreplicationServerSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public ReplicationServerResponse replicationServerID(Integer replicationServerID) {
    
    
    
    
    this.replicationServerID = replicationServerID;
    return this;
  }

   /**
   * Specifies a unique identifier for the Replication Server.
   * @return replicationServerID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a unique identifier for the Replication Server.")

  public Integer getReplicationServerID() {
    return replicationServerID;
  }


  public void setReplicationServerID(Integer replicationServerID) {
    
    
    
    this.replicationServerID = replicationServerID;
  }


  public ReplicationServerResponse replicationDBDirectory(String replicationDBDirectory) {
    
    
    
    
    this.replicationDBDirectory = replicationDBDirectory;
    return this;
  }

   /**
   * The path where the Replication Server stores all persistent information.
   * @return replicationDBDirectory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The path where the Replication Server stores all persistent information.")

  public String getReplicationDBDirectory() {
    return replicationDBDirectory;
  }


  public void setReplicationDBDirectory(String replicationDBDirectory) {
    
    
    
    this.replicationDBDirectory = replicationDBDirectory;
  }


  public ReplicationServerResponse jeProperty(List<String> jeProperty) {
    
    
    
    
    this.jeProperty = jeProperty;
    return this;
  }

  public ReplicationServerResponse addJePropertyItem(String jePropertyItem) {
    if (this.jeProperty == null) {
      this.jeProperty = new ArrayList<>();
    }
    this.jeProperty.add(jePropertyItem);
    return this;
  }

   /**
   * Specifies the database and environment properties for the Berkeley DB Java Edition database for the replication changelog.
   * @return jeProperty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the database and environment properties for the Berkeley DB Java Edition database for the replication changelog.")

  public List<String> getJeProperty() {
    return jeProperty;
  }


  public void setJeProperty(List<String> jeProperty) {
    
    
    
    this.jeProperty = jeProperty;
  }


  public ReplicationServerResponse replicationPurgeDelay(String replicationPurgeDelay) {
    
    
    
    
    this.replicationPurgeDelay = replicationPurgeDelay;
    return this;
  }

   /**
   * Changes are guaranteed to be maintained in the changelog database for at least this duration. Setting target-database-size can allow additional changes to be maintained up to the configured size on disk.
   * @return replicationPurgeDelay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Changes are guaranteed to be maintained in the changelog database for at least this duration. Setting target-database-size can allow additional changes to be maintained up to the configured size on disk.")

  public String getReplicationPurgeDelay() {
    return replicationPurgeDelay;
  }


  public void setReplicationPurgeDelay(String replicationPurgeDelay) {
    
    
    
    this.replicationPurgeDelay = replicationPurgeDelay;
  }


  public ReplicationServerResponse targetDatabaseSize(String targetDatabaseSize) {
    
    
    
    
    this.targetDatabaseSize = targetDatabaseSize;
    return this;
  }

   /**
   * The replication changelog database is allowed to grow up to this size even if changes are older than the configured replication-purge-delay.
   * @return targetDatabaseSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The replication changelog database is allowed to grow up to this size even if changes are older than the configured replication-purge-delay.")

  public String getTargetDatabaseSize() {
    return targetDatabaseSize;
  }


  public void setTargetDatabaseSize(String targetDatabaseSize) {
    
    
    
    this.targetDatabaseSize = targetDatabaseSize;
  }


  public ReplicationServerResponse replicationPort(Integer replicationPort) {
    
    
    
    
    this.replicationPort = replicationPort;
    return this;
  }

   /**
   * The port on which this Replication Server waits for connections from other Replication Servers or Directory Server instances.
   * @return replicationPort
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The port on which this Replication Server waits for connections from other Replication Servers or Directory Server instances.")

  public Integer getReplicationPort() {
    return replicationPort;
  }


  public void setReplicationPort(Integer replicationPort) {
    
    
    
    this.replicationPort = replicationPort;
  }


  public ReplicationServerResponse listenOnAllAddresses(Boolean listenOnAllAddresses) {
    
    
    
    
    this.listenOnAllAddresses = listenOnAllAddresses;
    return this;
  }

   /**
   * Indicates whether the Replication Server should listen on all addresses for this host. If set to FALSE, then the Replication Server will listen only to the address resolved from the hostname provided.
   * @return listenOnAllAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the Replication Server should listen on all addresses for this host. If set to FALSE, then the Replication Server will listen only to the address resolved from the hostname provided.")

  public Boolean getListenOnAllAddresses() {
    return listenOnAllAddresses;
  }


  public void setListenOnAllAddresses(Boolean listenOnAllAddresses) {
    
    
    
    this.listenOnAllAddresses = listenOnAllAddresses;
  }


  public ReplicationServerResponse compressionCriteria(EnumreplicationServerCompressionCriteriaProp compressionCriteria) {
    
    
    
    
    this.compressionCriteria = compressionCriteria;
    return this;
  }

   /**
   * Get compressionCriteria
   * @return compressionCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumreplicationServerCompressionCriteriaProp getCompressionCriteria() {
    return compressionCriteria;
  }


  public void setCompressionCriteria(EnumreplicationServerCompressionCriteriaProp compressionCriteria) {
    
    
    
    this.compressionCriteria = compressionCriteria;
  }


  public ReplicationServerResponse heartbeatInterval(String heartbeatInterval) {
    
    
    
    
    this.heartbeatInterval = heartbeatInterval;
    return this;
  }

   /**
   * Specifies the heartbeat interval that the Directory Server will use when communicating with Replication Servers.
   * @return heartbeatInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the heartbeat interval that the Directory Server will use when communicating with Replication Servers.")

  public String getHeartbeatInterval() {
    return heartbeatInterval;
  }


  public void setHeartbeatInterval(String heartbeatInterval) {
    
    
    
    this.heartbeatInterval = heartbeatInterval;
  }


  public ReplicationServerResponse remoteMonitorUpdateInterval(String remoteMonitorUpdateInterval) {
    
    
    
    
    this.remoteMonitorUpdateInterval = remoteMonitorUpdateInterval;
    return this;
  }

   /**
   * Specifies the duration that topology monitor data will be cached before it is requested again from a remote server.
   * @return remoteMonitorUpdateInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the duration that topology monitor data will be cached before it is requested again from a remote server.")

  public String getRemoteMonitorUpdateInterval() {
    return remoteMonitorUpdateInterval;
  }


  public void setRemoteMonitorUpdateInterval(String remoteMonitorUpdateInterval) {
    
    
    
    this.remoteMonitorUpdateInterval = remoteMonitorUpdateInterval;
  }


  public ReplicationServerResponse restrictedDomain(List<String> restrictedDomain) {
    
    
    
    
    this.restrictedDomain = restrictedDomain;
    return this;
  }

  public ReplicationServerResponse addRestrictedDomainItem(String restrictedDomainItem) {
    if (this.restrictedDomain == null) {
      this.restrictedDomain = new ArrayList<>();
    }
    this.restrictedDomain.add(restrictedDomainItem);
    return this;
  }

   /**
   * Specifies the base DN of domains that are only replicated between server instances that belong to the same replication set.
   * @return restrictedDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the base DN of domains that are only replicated between server instances that belong to the same replication set.")

  public List<String> getRestrictedDomain() {
    return restrictedDomain;
  }


  public void setRestrictedDomain(List<String> restrictedDomain) {
    
    
    
    this.restrictedDomain = restrictedDomain;
  }


  public ReplicationServerResponse gatewayPriority(Integer gatewayPriority) {
    
    
    
    
    this.gatewayPriority = gatewayPriority;
    return this;
  }

   /**
   * Specifies the gateway priority of the Replication Server in the current location.
   * @return gatewayPriority
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the gateway priority of the Replication Server in the current location.")

  public Integer getGatewayPriority() {
    return gatewayPriority;
  }


  public void setGatewayPriority(Integer gatewayPriority) {
    
    
    
    this.gatewayPriority = gatewayPriority;
  }


  public ReplicationServerResponse missingChangesAlertThresholdPercent(Integer missingChangesAlertThresholdPercent) {
    
    
    
    
    this.missingChangesAlertThresholdPercent = missingChangesAlertThresholdPercent;
    return this;
  }

   /**
   * Specifies the missing changes alert threshold as a percentage of the total pending changes. For instance, a value of 80 indicates that the replica is 80% of the way to losing changes.
   * @return missingChangesAlertThresholdPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the missing changes alert threshold as a percentage of the total pending changes. For instance, a value of 80 indicates that the replica is 80% of the way to losing changes.")

  public Integer getMissingChangesAlertThresholdPercent() {
    return missingChangesAlertThresholdPercent;
  }


  public void setMissingChangesAlertThresholdPercent(Integer missingChangesAlertThresholdPercent) {
    
    
    
    this.missingChangesAlertThresholdPercent = missingChangesAlertThresholdPercent;
  }


  public ReplicationServerResponse missingChangesPolicy(EnumreplicationServerMissingChangesPolicyProp missingChangesPolicy) {
    
    
    
    
    this.missingChangesPolicy = missingChangesPolicy;
    return this;
  }

   /**
   * Get missingChangesPolicy
   * @return missingChangesPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumreplicationServerMissingChangesPolicyProp getMissingChangesPolicy() {
    return missingChangesPolicy;
  }


  public void setMissingChangesPolicy(EnumreplicationServerMissingChangesPolicyProp missingChangesPolicy) {
    
    
    
    this.missingChangesPolicy = missingChangesPolicy;
  }


  public ReplicationServerResponse includeAllRemoteServersStateInMonitorMessage(Boolean includeAllRemoteServersStateInMonitorMessage) {
    
    
    
    
    this.includeAllRemoteServersStateInMonitorMessage = includeAllRemoteServersStateInMonitorMessage;
    return this;
  }

   /**
   * Indicates monitor messages should include information about remote servers.
   * @return includeAllRemoteServersStateInMonitorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates monitor messages should include information about remote servers.")

  public Boolean getIncludeAllRemoteServersStateInMonitorMessage() {
    return includeAllRemoteServersStateInMonitorMessage;
  }


  public void setIncludeAllRemoteServersStateInMonitorMessage(Boolean includeAllRemoteServersStateInMonitorMessage) {
    
    
    
    this.includeAllRemoteServersStateInMonitorMessage = includeAllRemoteServersStateInMonitorMessage;
  }


  public ReplicationServerResponse meta(MetaMeta meta) {
    
    
    
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MetaMeta getMeta() {
    return meta;
  }


  public void setMeta(MetaMeta meta) {
    
    
    
    this.meta = meta;
  }


  public ReplicationServerResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
    this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20 = urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;
    return this;
  }

   /**
   * Get urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20
   * @return urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MetaUrnPingidentitySchemasConfigurationMessages20 getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20() {
    return urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;
  }


  public void setUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20 = urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;
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
   * @return the ReplicationServerResponse instance itself
   */
  public ReplicationServerResponse putAdditionalProperty(String key, Object value) {
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
    ReplicationServerResponse replicationServerResponse = (ReplicationServerResponse) o;
    return Objects.equals(this.schemas, replicationServerResponse.schemas) &&
        Objects.equals(this.replicationServerID, replicationServerResponse.replicationServerID) &&
        Objects.equals(this.replicationDBDirectory, replicationServerResponse.replicationDBDirectory) &&
        Objects.equals(this.jeProperty, replicationServerResponse.jeProperty) &&
        Objects.equals(this.replicationPurgeDelay, replicationServerResponse.replicationPurgeDelay) &&
        Objects.equals(this.targetDatabaseSize, replicationServerResponse.targetDatabaseSize) &&
        Objects.equals(this.replicationPort, replicationServerResponse.replicationPort) &&
        Objects.equals(this.listenOnAllAddresses, replicationServerResponse.listenOnAllAddresses) &&
        Objects.equals(this.compressionCriteria, replicationServerResponse.compressionCriteria) &&
        Objects.equals(this.heartbeatInterval, replicationServerResponse.heartbeatInterval) &&
        Objects.equals(this.remoteMonitorUpdateInterval, replicationServerResponse.remoteMonitorUpdateInterval) &&
        Objects.equals(this.restrictedDomain, replicationServerResponse.restrictedDomain) &&
        Objects.equals(this.gatewayPriority, replicationServerResponse.gatewayPriority) &&
        Objects.equals(this.missingChangesAlertThresholdPercent, replicationServerResponse.missingChangesAlertThresholdPercent) &&
        Objects.equals(this.missingChangesPolicy, replicationServerResponse.missingChangesPolicy) &&
        Objects.equals(this.includeAllRemoteServersStateInMonitorMessage, replicationServerResponse.includeAllRemoteServersStateInMonitorMessage) &&
        Objects.equals(this.meta, replicationServerResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, replicationServerResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, replicationServerResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, replicationServerID, replicationDBDirectory, jeProperty, replicationPurgeDelay, targetDatabaseSize, replicationPort, listenOnAllAddresses, compressionCriteria, heartbeatInterval, remoteMonitorUpdateInterval, restrictedDomain, gatewayPriority, missingChangesAlertThresholdPercent, missingChangesPolicy, includeAllRemoteServersStateInMonitorMessage, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplicationServerResponse {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    replicationServerID: ").append(toIndentedString(replicationServerID)).append("\n");
    sb.append("    replicationDBDirectory: ").append(toIndentedString(replicationDBDirectory)).append("\n");
    sb.append("    jeProperty: ").append(toIndentedString(jeProperty)).append("\n");
    sb.append("    replicationPurgeDelay: ").append(toIndentedString(replicationPurgeDelay)).append("\n");
    sb.append("    targetDatabaseSize: ").append(toIndentedString(targetDatabaseSize)).append("\n");
    sb.append("    replicationPort: ").append(toIndentedString(replicationPort)).append("\n");
    sb.append("    listenOnAllAddresses: ").append(toIndentedString(listenOnAllAddresses)).append("\n");
    sb.append("    compressionCriteria: ").append(toIndentedString(compressionCriteria)).append("\n");
    sb.append("    heartbeatInterval: ").append(toIndentedString(heartbeatInterval)).append("\n");
    sb.append("    remoteMonitorUpdateInterval: ").append(toIndentedString(remoteMonitorUpdateInterval)).append("\n");
    sb.append("    restrictedDomain: ").append(toIndentedString(restrictedDomain)).append("\n");
    sb.append("    gatewayPriority: ").append(toIndentedString(gatewayPriority)).append("\n");
    sb.append("    missingChangesAlertThresholdPercent: ").append(toIndentedString(missingChangesAlertThresholdPercent)).append("\n");
    sb.append("    missingChangesPolicy: ").append(toIndentedString(missingChangesPolicy)).append("\n");
    sb.append("    includeAllRemoteServersStateInMonitorMessage: ").append(toIndentedString(includeAllRemoteServersStateInMonitorMessage)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20: ").append(toIndentedString(urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)).append("\n");
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
    openapiFields.add("schemas");
    openapiFields.add("replicationServerID");
    openapiFields.add("replicationDBDirectory");
    openapiFields.add("jeProperty");
    openapiFields.add("replicationPurgeDelay");
    openapiFields.add("targetDatabaseSize");
    openapiFields.add("replicationPort");
    openapiFields.add("listenOnAllAddresses");
    openapiFields.add("compressionCriteria");
    openapiFields.add("heartbeatInterval");
    openapiFields.add("remoteMonitorUpdateInterval");
    openapiFields.add("restrictedDomain");
    openapiFields.add("gatewayPriority");
    openapiFields.add("missingChangesAlertThresholdPercent");
    openapiFields.add("missingChangesPolicy");
    openapiFields.add("includeAllRemoteServersStateInMonitorMessage");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("replicationServerID");
    openapiRequiredFields.add("replicationDBDirectory");
    openapiRequiredFields.add("replicationPort");
    openapiRequiredFields.add("gatewayPriority");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReplicationServerResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReplicationServerResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReplicationServerResponse is not found in the empty JSON string", ReplicationServerResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReplicationServerResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("schemas") != null && !jsonObj.get("schemas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemas` to be an array in the JSON string but got `%s`", jsonObj.get("schemas").toString()));
      }
      if (!jsonObj.get("replicationDBDirectory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `replicationDBDirectory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("replicationDBDirectory").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("jeProperty") != null && !jsonObj.get("jeProperty").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `jeProperty` to be an array in the JSON string but got `%s`", jsonObj.get("jeProperty").toString()));
      }
      if ((jsonObj.get("replicationPurgeDelay") != null && !jsonObj.get("replicationPurgeDelay").isJsonNull()) && !jsonObj.get("replicationPurgeDelay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `replicationPurgeDelay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("replicationPurgeDelay").toString()));
      }
      if ((jsonObj.get("targetDatabaseSize") != null && !jsonObj.get("targetDatabaseSize").isJsonNull()) && !jsonObj.get("targetDatabaseSize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetDatabaseSize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetDatabaseSize").toString()));
      }
      if ((jsonObj.get("heartbeatInterval") != null && !jsonObj.get("heartbeatInterval").isJsonNull()) && !jsonObj.get("heartbeatInterval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `heartbeatInterval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("heartbeatInterval").toString()));
      }
      if ((jsonObj.get("remoteMonitorUpdateInterval") != null && !jsonObj.get("remoteMonitorUpdateInterval").isJsonNull()) && !jsonObj.get("remoteMonitorUpdateInterval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remoteMonitorUpdateInterval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remoteMonitorUpdateInterval").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("restrictedDomain") != null && !jsonObj.get("restrictedDomain").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `restrictedDomain` to be an array in the JSON string but got `%s`", jsonObj.get("restrictedDomain").toString()));
      }
      // validate the optional field `meta`
      if (jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) {
        MetaMeta.validateJsonObject(jsonObj.getAsJsonObject("meta"));
      }
      // validate the optional field `urn:pingidentity:schemas:configuration:messages:2.0`
      if (jsonObj.get("urn:pingidentity:schemas:configuration:messages:2.0") != null && !jsonObj.get("urn:pingidentity:schemas:configuration:messages:2.0").isJsonNull()) {
        MetaUrnPingidentitySchemasConfigurationMessages20.validateJsonObject(jsonObj.getAsJsonObject("urn:pingidentity:schemas:configuration:messages:2.0"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReplicationServerResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReplicationServerResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReplicationServerResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReplicationServerResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ReplicationServerResponse>() {
           @Override
           public void write(JsonWriter out, ReplicationServerResponse value) throws IOException {
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
           public ReplicationServerResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReplicationServerResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReplicationServerResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReplicationServerResponse
  * @throws IOException if the JSON string is invalid with respect to ReplicationServerResponse
  */
  public static ReplicationServerResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReplicationServerResponse.class);
  }

 /**
  * Convert an instance of ReplicationServerResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

