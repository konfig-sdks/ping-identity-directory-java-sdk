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
import com.konfigthis.client.model.EnumjdbcBasedErrorLogPublisherSchemaUrn;
import com.konfigthis.client.model.EnumlogPublisherDefaultSeverityProp;
import com.konfigthis.client.model.EnumlogPublisherLoggingErrorBehaviorProp;
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
 * JdbcBasedErrorLogPublisherResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class JdbcBasedErrorLogPublisherResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumjdbcBasedErrorLogPublisherSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public static final String SERIALIZED_NAME_LOG_FIELD_MAPPING = "logFieldMapping";
  @SerializedName(SERIALIZED_NAME_LOG_FIELD_MAPPING)
  private String logFieldMapping;

  public static final String SERIALIZED_NAME_LOG_TABLE_NAME = "logTableName";
  @SerializedName(SERIALIZED_NAME_LOG_TABLE_NAME)
  private String logTableName;

  public static final String SERIALIZED_NAME_QUEUE_SIZE = "queueSize";
  @SerializedName(SERIALIZED_NAME_QUEUE_SIZE)
  private Integer queueSize;

  public static final String SERIALIZED_NAME_DEFAULT_SEVERITY = "defaultSeverity";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SEVERITY)
  private List<EnumlogPublisherDefaultSeverityProp> defaultSeverity = null;

  public static final String SERIALIZED_NAME_OVERRIDE_SEVERITY = "overrideSeverity";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_SEVERITY)
  private List<String> overrideSeverity = null;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_LOGGING_ERROR_BEHAVIOR = "loggingErrorBehavior";
  @SerializedName(SERIALIZED_NAME_LOGGING_ERROR_BEHAVIOR)
  private EnumlogPublisherLoggingErrorBehaviorProp loggingErrorBehavior;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public JdbcBasedErrorLogPublisherResponse() {
  }

  public JdbcBasedErrorLogPublisherResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Log Publisher
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the Log Publisher")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public JdbcBasedErrorLogPublisherResponse description(String description) {
    
    
    
    
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


  public JdbcBasedErrorLogPublisherResponse schemas(List<EnumjdbcBasedErrorLogPublisherSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public JdbcBasedErrorLogPublisherResponse addSchemasItem(EnumjdbcBasedErrorLogPublisherSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumjdbcBasedErrorLogPublisherSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumjdbcBasedErrorLogPublisherSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public JdbcBasedErrorLogPublisherResponse server(String server) {
    
    
    
    
    this.server = server;
    return this;
  }

   /**
   * The JDBC-based Database Server to use for a connection.
   * @return server
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The JDBC-based Database Server to use for a connection.")

  public String getServer() {
    return server;
  }


  public void setServer(String server) {
    
    
    
    this.server = server;
  }


  public JdbcBasedErrorLogPublisherResponse logFieldMapping(String logFieldMapping) {
    
    
    
    
    this.logFieldMapping = logFieldMapping;
    return this;
  }

   /**
   * The log field mapping associates loggable fields to database column names. The table name is not part of this mapping.
   * @return logFieldMapping
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The log field mapping associates loggable fields to database column names. The table name is not part of this mapping.")

  public String getLogFieldMapping() {
    return logFieldMapping;
  }


  public void setLogFieldMapping(String logFieldMapping) {
    
    
    
    this.logFieldMapping = logFieldMapping;
  }


  public JdbcBasedErrorLogPublisherResponse logTableName(String logTableName) {
    
    
    
    
    this.logTableName = logTableName;
    return this;
  }

   /**
   * The table name to log entries to the database server.
   * @return logTableName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The table name to log entries to the database server.")

  public String getLogTableName() {
    return logTableName;
  }


  public void setLogTableName(String logTableName) {
    
    
    
    this.logTableName = logTableName;
  }


  public JdbcBasedErrorLogPublisherResponse queueSize(Integer queueSize) {
    
    
    
    
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


  public JdbcBasedErrorLogPublisherResponse defaultSeverity(List<EnumlogPublisherDefaultSeverityProp> defaultSeverity) {
    
    
    
    
    this.defaultSeverity = defaultSeverity;
    return this;
  }

  public JdbcBasedErrorLogPublisherResponse addDefaultSeverityItem(EnumlogPublisherDefaultSeverityProp defaultSeverityItem) {
    if (this.defaultSeverity == null) {
      this.defaultSeverity = new ArrayList<>();
    }
    this.defaultSeverity.add(defaultSeverityItem);
    return this;
  }

   /**
   * Get defaultSeverity
   * @return defaultSeverity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumlogPublisherDefaultSeverityProp> getDefaultSeverity() {
    return defaultSeverity;
  }


  public void setDefaultSeverity(List<EnumlogPublisherDefaultSeverityProp> defaultSeverity) {
    
    
    
    this.defaultSeverity = defaultSeverity;
  }


  public JdbcBasedErrorLogPublisherResponse overrideSeverity(List<String> overrideSeverity) {
    
    
    
    
    this.overrideSeverity = overrideSeverity;
    return this;
  }

  public JdbcBasedErrorLogPublisherResponse addOverrideSeverityItem(String overrideSeverityItem) {
    if (this.overrideSeverity == null) {
      this.overrideSeverity = new ArrayList<>();
    }
    this.overrideSeverity.add(overrideSeverityItem);
    return this;
  }

   /**
   * Specifies the override severity levels for the logger based on the category of the messages.
   * @return overrideSeverity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the override severity levels for the logger based on the category of the messages.")

  public List<String> getOverrideSeverity() {
    return overrideSeverity;
  }


  public void setOverrideSeverity(List<String> overrideSeverity) {
    
    
    
    this.overrideSeverity = overrideSeverity;
  }


  public JdbcBasedErrorLogPublisherResponse enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the Log Publisher is enabled for use.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether the Log Publisher is enabled for use.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public JdbcBasedErrorLogPublisherResponse loggingErrorBehavior(EnumlogPublisherLoggingErrorBehaviorProp loggingErrorBehavior) {
    
    
    
    
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


  public JdbcBasedErrorLogPublisherResponse meta(MetaMeta meta) {
    
    
    
    
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


  public JdbcBasedErrorLogPublisherResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the JdbcBasedErrorLogPublisherResponse instance itself
   */
  public JdbcBasedErrorLogPublisherResponse putAdditionalProperty(String key, Object value) {
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
    JdbcBasedErrorLogPublisherResponse jdbcBasedErrorLogPublisherResponse = (JdbcBasedErrorLogPublisherResponse) o;
    return Objects.equals(this.id, jdbcBasedErrorLogPublisherResponse.id) &&
        Objects.equals(this.description, jdbcBasedErrorLogPublisherResponse.description) &&
        Objects.equals(this.schemas, jdbcBasedErrorLogPublisherResponse.schemas) &&
        Objects.equals(this.server, jdbcBasedErrorLogPublisherResponse.server) &&
        Objects.equals(this.logFieldMapping, jdbcBasedErrorLogPublisherResponse.logFieldMapping) &&
        Objects.equals(this.logTableName, jdbcBasedErrorLogPublisherResponse.logTableName) &&
        Objects.equals(this.queueSize, jdbcBasedErrorLogPublisherResponse.queueSize) &&
        Objects.equals(this.defaultSeverity, jdbcBasedErrorLogPublisherResponse.defaultSeverity) &&
        Objects.equals(this.overrideSeverity, jdbcBasedErrorLogPublisherResponse.overrideSeverity) &&
        Objects.equals(this.enabled, jdbcBasedErrorLogPublisherResponse.enabled) &&
        Objects.equals(this.loggingErrorBehavior, jdbcBasedErrorLogPublisherResponse.loggingErrorBehavior) &&
        Objects.equals(this.meta, jdbcBasedErrorLogPublisherResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, jdbcBasedErrorLogPublisherResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, jdbcBasedErrorLogPublisherResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, schemas, server, logFieldMapping, logTableName, queueSize, defaultSeverity, overrideSeverity, enabled, loggingErrorBehavior, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JdbcBasedErrorLogPublisherResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    logFieldMapping: ").append(toIndentedString(logFieldMapping)).append("\n");
    sb.append("    logTableName: ").append(toIndentedString(logTableName)).append("\n");
    sb.append("    queueSize: ").append(toIndentedString(queueSize)).append("\n");
    sb.append("    defaultSeverity: ").append(toIndentedString(defaultSeverity)).append("\n");
    sb.append("    overrideSeverity: ").append(toIndentedString(overrideSeverity)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    loggingErrorBehavior: ").append(toIndentedString(loggingErrorBehavior)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("server");
    openapiFields.add("logFieldMapping");
    openapiFields.add("logTableName");
    openapiFields.add("queueSize");
    openapiFields.add("defaultSeverity");
    openapiFields.add("overrideSeverity");
    openapiFields.add("enabled");
    openapiFields.add("loggingErrorBehavior");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("server");
    openapiRequiredFields.add("logFieldMapping");
    openapiRequiredFields.add("logTableName");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JdbcBasedErrorLogPublisherResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JdbcBasedErrorLogPublisherResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JdbcBasedErrorLogPublisherResponse is not found in the empty JSON string", JdbcBasedErrorLogPublisherResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JdbcBasedErrorLogPublisherResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
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
      if (!jsonObj.get("server").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server").toString()));
      }
      if (!jsonObj.get("logFieldMapping").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logFieldMapping` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logFieldMapping").toString()));
      }
      if (!jsonObj.get("logTableName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logTableName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logTableName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("defaultSeverity") != null && !jsonObj.get("defaultSeverity").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultSeverity` to be an array in the JSON string but got `%s`", jsonObj.get("defaultSeverity").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("overrideSeverity") != null && !jsonObj.get("overrideSeverity").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `overrideSeverity` to be an array in the JSON string but got `%s`", jsonObj.get("overrideSeverity").toString()));
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
       if (!JdbcBasedErrorLogPublisherResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JdbcBasedErrorLogPublisherResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JdbcBasedErrorLogPublisherResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JdbcBasedErrorLogPublisherResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<JdbcBasedErrorLogPublisherResponse>() {
           @Override
           public void write(JsonWriter out, JdbcBasedErrorLogPublisherResponse value) throws IOException {
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
           public JdbcBasedErrorLogPublisherResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JdbcBasedErrorLogPublisherResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JdbcBasedErrorLogPublisherResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JdbcBasedErrorLogPublisherResponse
  * @throws IOException if the JSON string is invalid with respect to JdbcBasedErrorLogPublisherResponse
  */
  public static JdbcBasedErrorLogPublisherResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JdbcBasedErrorLogPublisherResponse.class);
  }

 /**
  * Convert an instance of JdbcBasedErrorLogPublisherResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

