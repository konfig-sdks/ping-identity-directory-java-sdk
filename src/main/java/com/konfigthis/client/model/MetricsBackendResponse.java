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
import com.konfigthis.client.model.EnumbackendWritabilityModeProp;
import com.konfigthis.client.model.EnummetricsBackendSchemaUrn;
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
 * MetricsBackendResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MetricsBackendResponse {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnummetricsBackendSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BACKEND_I_D = "backendID";
  @SerializedName(SERIALIZED_NAME_BACKEND_I_D)
  private String backendID;

  public static final String SERIALIZED_NAME_STORAGE_DIR = "storageDir";
  @SerializedName(SERIALIZED_NAME_STORAGE_DIR)
  private String storageDir;

  public static final String SERIALIZED_NAME_METRICS_DIR = "metricsDir";
  @SerializedName(SERIALIZED_NAME_METRICS_DIR)
  private String metricsDir;

  public static final String SERIALIZED_NAME_SAMPLE_FLUSH_INTERVAL = "sampleFlushInterval";
  @SerializedName(SERIALIZED_NAME_SAMPLE_FLUSH_INTERVAL)
  private String sampleFlushInterval;

  public static final String SERIALIZED_NAME_RETENTION_POLICY = "retentionPolicy";
  @SerializedName(SERIALIZED_NAME_RETENTION_POLICY)
  private List<String> retentionPolicy = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_WRITABILITY_MODE = "writabilityMode";
  @SerializedName(SERIALIZED_NAME_WRITABILITY_MODE)
  private EnumbackendWritabilityModeProp writabilityMode;

  public static final String SERIALIZED_NAME_RETURN_UNAVAILABLE_WHEN_DISABLED = "returnUnavailableWhenDisabled";
  @SerializedName(SERIALIZED_NAME_RETURN_UNAVAILABLE_WHEN_DISABLED)
  private Boolean returnUnavailableWhenDisabled;

  public static final String SERIALIZED_NAME_NOTIFICATION_MANAGER = "notificationManager";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_MANAGER)
  private String notificationManager;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public MetricsBackendResponse() {
  }

  public MetricsBackendResponse description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Backend
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Backend")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public MetricsBackendResponse schemas(List<EnummetricsBackendSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public MetricsBackendResponse addSchemasItem(EnummetricsBackendSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnummetricsBackendSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnummetricsBackendSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public MetricsBackendResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Backend
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the Backend")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public MetricsBackendResponse backendID(String backendID) {
    
    
    
    
    this.backendID = backendID;
    return this;
  }

   /**
   * Specifies a name to identify the associated backend.
   * @return backendID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a name to identify the associated backend.")

  public String getBackendID() {
    return backendID;
  }


  public void setBackendID(String backendID) {
    
    
    
    this.backendID = backendID;
  }


  public MetricsBackendResponse storageDir(String storageDir) {
    
    
    
    
    this.storageDir = storageDir;
    return this;
  }

   /**
   * Specifies the path to the directory that will be used to store queued samples.
   * @return storageDir
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the path to the directory that will be used to store queued samples.")

  public String getStorageDir() {
    return storageDir;
  }


  public void setStorageDir(String storageDir) {
    
    
    
    this.storageDir = storageDir;
  }


  public MetricsBackendResponse metricsDir(String metricsDir) {
    
    
    
    
    this.metricsDir = metricsDir;
    return this;
  }

   /**
   * Specifies the path to the directory that contains metric definitions.
   * @return metricsDir
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the path to the directory that contains metric definitions.")

  public String getMetricsDir() {
    return metricsDir;
  }


  public void setMetricsDir(String metricsDir) {
    
    
    
    this.metricsDir = metricsDir;
  }


  public MetricsBackendResponse sampleFlushInterval(String sampleFlushInterval) {
    
    
    
    
    this.sampleFlushInterval = sampleFlushInterval;
    return this;
  }

   /**
   * Period when samples are flushed to disk.
   * @return sampleFlushInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Period when samples are flushed to disk.")

  public String getSampleFlushInterval() {
    return sampleFlushInterval;
  }


  public void setSampleFlushInterval(String sampleFlushInterval) {
    
    
    
    this.sampleFlushInterval = sampleFlushInterval;
  }


  public MetricsBackendResponse retentionPolicy(List<String> retentionPolicy) {
    
    
    
    
    this.retentionPolicy = retentionPolicy;
    return this;
  }

  public MetricsBackendResponse addRetentionPolicyItem(String retentionPolicyItem) {
    this.retentionPolicy.add(retentionPolicyItem);
    return this;
  }

   /**
   * The retention policy to use for the Metrics Backend .
   * @return retentionPolicy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The retention policy to use for the Metrics Backend .")

  public List<String> getRetentionPolicy() {
    return retentionPolicy;
  }


  public void setRetentionPolicy(List<String> retentionPolicy) {
    
    
    
    this.retentionPolicy = retentionPolicy;
  }


  public MetricsBackendResponse enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the backend is enabled in the server.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether the backend is enabled in the server.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public MetricsBackendResponse writabilityMode(EnumbackendWritabilityModeProp writabilityMode) {
    
    
    
    
    this.writabilityMode = writabilityMode;
    return this;
  }

   /**
   * Get writabilityMode
   * @return writabilityMode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EnumbackendWritabilityModeProp getWritabilityMode() {
    return writabilityMode;
  }


  public void setWritabilityMode(EnumbackendWritabilityModeProp writabilityMode) {
    
    
    
    this.writabilityMode = writabilityMode;
  }


  public MetricsBackendResponse returnUnavailableWhenDisabled(Boolean returnUnavailableWhenDisabled) {
    
    
    
    
    this.returnUnavailableWhenDisabled = returnUnavailableWhenDisabled;
    return this;
  }

   /**
   * Determines whether any LDAP operation that would use this Backend is to return UNAVAILABLE when this Backend is disabled.
   * @return returnUnavailableWhenDisabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether any LDAP operation that would use this Backend is to return UNAVAILABLE when this Backend is disabled.")

  public Boolean getReturnUnavailableWhenDisabled() {
    return returnUnavailableWhenDisabled;
  }


  public void setReturnUnavailableWhenDisabled(Boolean returnUnavailableWhenDisabled) {
    
    
    
    this.returnUnavailableWhenDisabled = returnUnavailableWhenDisabled;
  }


  public MetricsBackendResponse notificationManager(String notificationManager) {
    
    
    
    
    this.notificationManager = notificationManager;
    return this;
  }

   /**
   * Specifies a notification manager for changes resulting from operations processed through this Backend
   * @return notificationManager
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a notification manager for changes resulting from operations processed through this Backend")

  public String getNotificationManager() {
    return notificationManager;
  }


  public void setNotificationManager(String notificationManager) {
    
    
    
    this.notificationManager = notificationManager;
  }


  public MetricsBackendResponse meta(MetaMeta meta) {
    
    
    
    
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


  public MetricsBackendResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the MetricsBackendResponse instance itself
   */
  public MetricsBackendResponse putAdditionalProperty(String key, Object value) {
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
    MetricsBackendResponse metricsBackendResponse = (MetricsBackendResponse) o;
    return Objects.equals(this.description, metricsBackendResponse.description) &&
        Objects.equals(this.schemas, metricsBackendResponse.schemas) &&
        Objects.equals(this.id, metricsBackendResponse.id) &&
        Objects.equals(this.backendID, metricsBackendResponse.backendID) &&
        Objects.equals(this.storageDir, metricsBackendResponse.storageDir) &&
        Objects.equals(this.metricsDir, metricsBackendResponse.metricsDir) &&
        Objects.equals(this.sampleFlushInterval, metricsBackendResponse.sampleFlushInterval) &&
        Objects.equals(this.retentionPolicy, metricsBackendResponse.retentionPolicy) &&
        Objects.equals(this.enabled, metricsBackendResponse.enabled) &&
        Objects.equals(this.writabilityMode, metricsBackendResponse.writabilityMode) &&
        Objects.equals(this.returnUnavailableWhenDisabled, metricsBackendResponse.returnUnavailableWhenDisabled) &&
        Objects.equals(this.notificationManager, metricsBackendResponse.notificationManager) &&
        Objects.equals(this.meta, metricsBackendResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, metricsBackendResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, metricsBackendResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, id, backendID, storageDir, metricsDir, sampleFlushInterval, retentionPolicy, enabled, writabilityMode, returnUnavailableWhenDisabled, notificationManager, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsBackendResponse {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    backendID: ").append(toIndentedString(backendID)).append("\n");
    sb.append("    storageDir: ").append(toIndentedString(storageDir)).append("\n");
    sb.append("    metricsDir: ").append(toIndentedString(metricsDir)).append("\n");
    sb.append("    sampleFlushInterval: ").append(toIndentedString(sampleFlushInterval)).append("\n");
    sb.append("    retentionPolicy: ").append(toIndentedString(retentionPolicy)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    writabilityMode: ").append(toIndentedString(writabilityMode)).append("\n");
    sb.append("    returnUnavailableWhenDisabled: ").append(toIndentedString(returnUnavailableWhenDisabled)).append("\n");
    sb.append("    notificationManager: ").append(toIndentedString(notificationManager)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("id");
    openapiFields.add("backendID");
    openapiFields.add("storageDir");
    openapiFields.add("metricsDir");
    openapiFields.add("sampleFlushInterval");
    openapiFields.add("retentionPolicy");
    openapiFields.add("enabled");
    openapiFields.add("writabilityMode");
    openapiFields.add("returnUnavailableWhenDisabled");
    openapiFields.add("notificationManager");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("backendID");
    openapiRequiredFields.add("storageDir");
    openapiRequiredFields.add("metricsDir");
    openapiRequiredFields.add("retentionPolicy");
    openapiRequiredFields.add("enabled");
    openapiRequiredFields.add("writabilityMode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MetricsBackendResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MetricsBackendResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetricsBackendResponse is not found in the empty JSON string", MetricsBackendResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MetricsBackendResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("schemas") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("schemas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemas` to be an array in the JSON string but got `%s`", jsonObj.get("schemas").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("backendID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backendID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backendID").toString()));
      }
      if (!jsonObj.get("storageDir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storageDir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storageDir").toString()));
      }
      if (!jsonObj.get("metricsDir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metricsDir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metricsDir").toString()));
      }
      if ((jsonObj.get("sampleFlushInterval") != null && !jsonObj.get("sampleFlushInterval").isJsonNull()) && !jsonObj.get("sampleFlushInterval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sampleFlushInterval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sampleFlushInterval").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("retentionPolicy") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("retentionPolicy").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `retentionPolicy` to be an array in the JSON string but got `%s`", jsonObj.get("retentionPolicy").toString()));
      }
      if ((jsonObj.get("notificationManager") != null && !jsonObj.get("notificationManager").isJsonNull()) && !jsonObj.get("notificationManager").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notificationManager` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notificationManager").toString()));
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
       if (!MetricsBackendResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetricsBackendResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetricsBackendResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetricsBackendResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<MetricsBackendResponse>() {
           @Override
           public void write(JsonWriter out, MetricsBackendResponse value) throws IOException {
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
           public MetricsBackendResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MetricsBackendResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MetricsBackendResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MetricsBackendResponse
  * @throws IOException if the JSON string is invalid with respect to MetricsBackendResponse
  */
  public static MetricsBackendResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetricsBackendResponse.class);
  }

 /**
  * Convert an instance of MetricsBackendResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

