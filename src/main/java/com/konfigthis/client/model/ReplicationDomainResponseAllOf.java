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
import com.konfigthis.client.model.EnumreplicationDomainMissingChangesPolicyProp;
import com.konfigthis.client.model.EnumreplicationDomainSchemaUrn;
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
 * ReplicationDomainResponseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReplicationDomainResponseAllOf {
  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumreplicationDomainSchemaUrn> schemas = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SERVER_I_D = "serverID";
  @SerializedName(SERIALIZED_NAME_SERVER_I_D)
  private Integer serverID;

  public static final String SERIALIZED_NAME_BASE_D_N = "baseDN";
  @SerializedName(SERIALIZED_NAME_BASE_D_N)
  private String baseDN;

  public static final String SERIALIZED_NAME_WINDOW_SIZE = "windowSize";
  @SerializedName(SERIALIZED_NAME_WINDOW_SIZE)
  private Integer windowSize;

  public static final String SERIALIZED_NAME_HEARTBEAT_INTERVAL = "heartbeatInterval";
  @SerializedName(SERIALIZED_NAME_HEARTBEAT_INTERVAL)
  private String heartbeatInterval;

  public static final String SERIALIZED_NAME_SYNC_HIST_PURGE_DELAY = "syncHistPurgeDelay";
  @SerializedName(SERIALIZED_NAME_SYNC_HIST_PURGE_DELAY)
  private String syncHistPurgeDelay;

  public static final String SERIALIZED_NAME_RESTRICTED = "restricted";
  @SerializedName(SERIALIZED_NAME_RESTRICTED)
  private Boolean restricted;

  public static final String SERIALIZED_NAME_ON_REPLAY_FAILURE_WAIT_FOR_DEPENDENT_OPS_TIMEOUT = "onReplayFailureWaitForDependentOpsTimeout";
  @SerializedName(SERIALIZED_NAME_ON_REPLAY_FAILURE_WAIT_FOR_DEPENDENT_OPS_TIMEOUT)
  private String onReplayFailureWaitForDependentOpsTimeout;

  public static final String SERIALIZED_NAME_DEPENDENT_OPS_REPLAY_FAILURE_WAIT_TIME = "dependentOpsReplayFailureWaitTime";
  @SerializedName(SERIALIZED_NAME_DEPENDENT_OPS_REPLAY_FAILURE_WAIT_TIME)
  private String dependentOpsReplayFailureWaitTime;

  public static final String SERIALIZED_NAME_MISSING_CHANGES_POLICY = "missingChangesPolicy";
  @SerializedName(SERIALIZED_NAME_MISSING_CHANGES_POLICY)
  private EnumreplicationDomainMissingChangesPolicyProp missingChangesPolicy;

  public ReplicationDomainResponseAllOf() {
  }

  public ReplicationDomainResponseAllOf schemas(List<EnumreplicationDomainSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public ReplicationDomainResponseAllOf addSchemasItem(EnumreplicationDomainSchemaUrn schemasItem) {
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

  public List<EnumreplicationDomainSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumreplicationDomainSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public ReplicationDomainResponseAllOf id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Replication Domain
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Replication Domain")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ReplicationDomainResponseAllOf serverID(Integer serverID) {
    
    
    
    
    this.serverID = serverID;
    return this;
  }

   /**
   * Specifies a unique identifier for the Directory Server within the Replication Domain.
   * @return serverID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a unique identifier for the Directory Server within the Replication Domain.")

  public Integer getServerID() {
    return serverID;
  }


  public void setServerID(Integer serverID) {
    
    
    
    this.serverID = serverID;
  }


  public ReplicationDomainResponseAllOf baseDN(String baseDN) {
    
    
    
    
    this.baseDN = baseDN;
    return this;
  }

   /**
   * Specifies the base DN of the replicated data.
   * @return baseDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the base DN of the replicated data.")

  public String getBaseDN() {
    return baseDN;
  }


  public void setBaseDN(String baseDN) {
    
    
    
    this.baseDN = baseDN;
  }


  public ReplicationDomainResponseAllOf windowSize(Integer windowSize) {
    
    
    
    
    this.windowSize = windowSize;
    return this;
  }

   /**
   * Specifies the maximum number of replication updates the Directory Server can have outstanding from the Replication Server.
   * @return windowSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the maximum number of replication updates the Directory Server can have outstanding from the Replication Server.")

  public Integer getWindowSize() {
    return windowSize;
  }


  public void setWindowSize(Integer windowSize) {
    
    
    
    this.windowSize = windowSize;
  }


  public ReplicationDomainResponseAllOf heartbeatInterval(String heartbeatInterval) {
    
    
    
    
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


  public ReplicationDomainResponseAllOf syncHistPurgeDelay(String syncHistPurgeDelay) {
    
    
    
    
    this.syncHistPurgeDelay = syncHistPurgeDelay;
    return this;
  }

   /**
   * The time in seconds after which historical information used in replication conflict resolution is purged. The information is removed from entries when they are modified after the purge delay has elapsed.
   * @return syncHistPurgeDelay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time in seconds after which historical information used in replication conflict resolution is purged. The information is removed from entries when they are modified after the purge delay has elapsed.")

  public String getSyncHistPurgeDelay() {
    return syncHistPurgeDelay;
  }


  public void setSyncHistPurgeDelay(String syncHistPurgeDelay) {
    
    
    
    this.syncHistPurgeDelay = syncHistPurgeDelay;
  }


  public ReplicationDomainResponseAllOf restricted(Boolean restricted) {
    
    
    
    
    this.restricted = restricted;
    return this;
  }

   /**
   * When set to true, changes are only replicated with server instances that belong to the same replication set.
   * @return restricted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When set to true, changes are only replicated with server instances that belong to the same replication set.")

  public Boolean getRestricted() {
    return restricted;
  }


  public void setRestricted(Boolean restricted) {
    
    
    
    this.restricted = restricted;
  }


  public ReplicationDomainResponseAllOf onReplayFailureWaitForDependentOpsTimeout(String onReplayFailureWaitForDependentOpsTimeout) {
    
    
    
    
    this.onReplayFailureWaitForDependentOpsTimeout = onReplayFailureWaitForDependentOpsTimeout;
    return this;
  }

   /**
   * Defines the maximum time to retry a failed operation. An operation will be retried only if it appears that the failure might be dependent on an earlier operation from a different server that hasn&#39;t replicated yet. The frequency of the retry is determined by the dependent-ops-replay-failure-wait-time property.
   * @return onReplayFailureWaitForDependentOpsTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the maximum time to retry a failed operation. An operation will be retried only if it appears that the failure might be dependent on an earlier operation from a different server that hasn't replicated yet. The frequency of the retry is determined by the dependent-ops-replay-failure-wait-time property.")

  public String getOnReplayFailureWaitForDependentOpsTimeout() {
    return onReplayFailureWaitForDependentOpsTimeout;
  }


  public void setOnReplayFailureWaitForDependentOpsTimeout(String onReplayFailureWaitForDependentOpsTimeout) {
    
    
    
    this.onReplayFailureWaitForDependentOpsTimeout = onReplayFailureWaitForDependentOpsTimeout;
  }


  public ReplicationDomainResponseAllOf dependentOpsReplayFailureWaitTime(String dependentOpsReplayFailureWaitTime) {
    
    
    
    
    this.dependentOpsReplayFailureWaitTime = dependentOpsReplayFailureWaitTime;
    return this;
  }

   /**
   * Defines how long to wait before retrying certain operations, specifically operations that might have failed because they depend on an operation from a different server that has not yet replicated to this instance.
   * @return dependentOpsReplayFailureWaitTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines how long to wait before retrying certain operations, specifically operations that might have failed because they depend on an operation from a different server that has not yet replicated to this instance.")

  public String getDependentOpsReplayFailureWaitTime() {
    return dependentOpsReplayFailureWaitTime;
  }


  public void setDependentOpsReplayFailureWaitTime(String dependentOpsReplayFailureWaitTime) {
    
    
    
    this.dependentOpsReplayFailureWaitTime = dependentOpsReplayFailureWaitTime;
  }


  public ReplicationDomainResponseAllOf missingChangesPolicy(EnumreplicationDomainMissingChangesPolicyProp missingChangesPolicy) {
    
    
    
    
    this.missingChangesPolicy = missingChangesPolicy;
    return this;
  }

   /**
   * Get missingChangesPolicy
   * @return missingChangesPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumreplicationDomainMissingChangesPolicyProp getMissingChangesPolicy() {
    return missingChangesPolicy;
  }


  public void setMissingChangesPolicy(EnumreplicationDomainMissingChangesPolicyProp missingChangesPolicy) {
    
    
    
    this.missingChangesPolicy = missingChangesPolicy;
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
   * @return the ReplicationDomainResponseAllOf instance itself
   */
  public ReplicationDomainResponseAllOf putAdditionalProperty(String key, Object value) {
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
    ReplicationDomainResponseAllOf replicationDomainResponseAllOf = (ReplicationDomainResponseAllOf) o;
    return Objects.equals(this.schemas, replicationDomainResponseAllOf.schemas) &&
        Objects.equals(this.id, replicationDomainResponseAllOf.id) &&
        Objects.equals(this.serverID, replicationDomainResponseAllOf.serverID) &&
        Objects.equals(this.baseDN, replicationDomainResponseAllOf.baseDN) &&
        Objects.equals(this.windowSize, replicationDomainResponseAllOf.windowSize) &&
        Objects.equals(this.heartbeatInterval, replicationDomainResponseAllOf.heartbeatInterval) &&
        Objects.equals(this.syncHistPurgeDelay, replicationDomainResponseAllOf.syncHistPurgeDelay) &&
        Objects.equals(this.restricted, replicationDomainResponseAllOf.restricted) &&
        Objects.equals(this.onReplayFailureWaitForDependentOpsTimeout, replicationDomainResponseAllOf.onReplayFailureWaitForDependentOpsTimeout) &&
        Objects.equals(this.dependentOpsReplayFailureWaitTime, replicationDomainResponseAllOf.dependentOpsReplayFailureWaitTime) &&
        Objects.equals(this.missingChangesPolicy, replicationDomainResponseAllOf.missingChangesPolicy)&&
        Objects.equals(this.additionalProperties, replicationDomainResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, id, serverID, baseDN, windowSize, heartbeatInterval, syncHistPurgeDelay, restricted, onReplayFailureWaitForDependentOpsTimeout, dependentOpsReplayFailureWaitTime, missingChangesPolicy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplicationDomainResponseAllOf {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serverID: ").append(toIndentedString(serverID)).append("\n");
    sb.append("    baseDN: ").append(toIndentedString(baseDN)).append("\n");
    sb.append("    windowSize: ").append(toIndentedString(windowSize)).append("\n");
    sb.append("    heartbeatInterval: ").append(toIndentedString(heartbeatInterval)).append("\n");
    sb.append("    syncHistPurgeDelay: ").append(toIndentedString(syncHistPurgeDelay)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    onReplayFailureWaitForDependentOpsTimeout: ").append(toIndentedString(onReplayFailureWaitForDependentOpsTimeout)).append("\n");
    sb.append("    dependentOpsReplayFailureWaitTime: ").append(toIndentedString(dependentOpsReplayFailureWaitTime)).append("\n");
    sb.append("    missingChangesPolicy: ").append(toIndentedString(missingChangesPolicy)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("serverID");
    openapiFields.add("baseDN");
    openapiFields.add("windowSize");
    openapiFields.add("heartbeatInterval");
    openapiFields.add("syncHistPurgeDelay");
    openapiFields.add("restricted");
    openapiFields.add("onReplayFailureWaitForDependentOpsTimeout");
    openapiFields.add("dependentOpsReplayFailureWaitTime");
    openapiFields.add("missingChangesPolicy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReplicationDomainResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReplicationDomainResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReplicationDomainResponseAllOf is not found in the empty JSON string", ReplicationDomainResponseAllOf.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("schemas") != null && !jsonObj.get("schemas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemas` to be an array in the JSON string but got `%s`", jsonObj.get("schemas").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("baseDN") != null && !jsonObj.get("baseDN").isJsonNull()) && !jsonObj.get("baseDN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseDN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseDN").toString()));
      }
      if ((jsonObj.get("heartbeatInterval") != null && !jsonObj.get("heartbeatInterval").isJsonNull()) && !jsonObj.get("heartbeatInterval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `heartbeatInterval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("heartbeatInterval").toString()));
      }
      if ((jsonObj.get("syncHistPurgeDelay") != null && !jsonObj.get("syncHistPurgeDelay").isJsonNull()) && !jsonObj.get("syncHistPurgeDelay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `syncHistPurgeDelay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("syncHistPurgeDelay").toString()));
      }
      if ((jsonObj.get("onReplayFailureWaitForDependentOpsTimeout") != null && !jsonObj.get("onReplayFailureWaitForDependentOpsTimeout").isJsonNull()) && !jsonObj.get("onReplayFailureWaitForDependentOpsTimeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `onReplayFailureWaitForDependentOpsTimeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("onReplayFailureWaitForDependentOpsTimeout").toString()));
      }
      if ((jsonObj.get("dependentOpsReplayFailureWaitTime") != null && !jsonObj.get("dependentOpsReplayFailureWaitTime").isJsonNull()) && !jsonObj.get("dependentOpsReplayFailureWaitTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dependentOpsReplayFailureWaitTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dependentOpsReplayFailureWaitTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReplicationDomainResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReplicationDomainResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReplicationDomainResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReplicationDomainResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ReplicationDomainResponseAllOf>() {
           @Override
           public void write(JsonWriter out, ReplicationDomainResponseAllOf value) throws IOException {
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
           public ReplicationDomainResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReplicationDomainResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReplicationDomainResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReplicationDomainResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to ReplicationDomainResponseAllOf
  */
  public static ReplicationDomainResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReplicationDomainResponseAllOf.class);
  }

 /**
  * Convert an instance of ReplicationDomainResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

