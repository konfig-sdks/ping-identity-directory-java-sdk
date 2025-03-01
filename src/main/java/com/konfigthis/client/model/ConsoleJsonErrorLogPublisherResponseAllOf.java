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
import com.konfigthis.client.model.EnumconsoleJsonErrorLogPublisherSchemaUrn;
import com.konfigthis.client.model.EnumlogPublisherDefaultSeverityProp;
import com.konfigthis.client.model.EnumlogPublisherLoggingErrorBehaviorProp;
import com.konfigthis.client.model.EnumlogPublisherOutputLocationProp;
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
 * ConsoleJsonErrorLogPublisherResponseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ConsoleJsonErrorLogPublisherResponseAllOf {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumconsoleJsonErrorLogPublisherSchemaUrn> schemas = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_DEFAULT_SEVERITY = "defaultSeverity";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SEVERITY)
  private List<EnumlogPublisherDefaultSeverityProp> defaultSeverity = null;

  public static final String SERIALIZED_NAME_WRITE_MULTI_LINE_MESSAGES = "writeMultiLineMessages";
  @SerializedName(SERIALIZED_NAME_WRITE_MULTI_LINE_MESSAGES)
  private Boolean writeMultiLineMessages;

  public static final String SERIALIZED_NAME_OUTPUT_LOCATION = "outputLocation";
  @SerializedName(SERIALIZED_NAME_OUTPUT_LOCATION)
  private EnumlogPublisherOutputLocationProp outputLocation;

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

  public static final String SERIALIZED_NAME_GENERIFY_MESSAGE_STRINGS_WHEN_POSSIBLE = "generifyMessageStringsWhenPossible";
  @SerializedName(SERIALIZED_NAME_GENERIFY_MESSAGE_STRINGS_WHEN_POSSIBLE)
  private Boolean generifyMessageStringsWhenPossible;

  public static final String SERIALIZED_NAME_OVERRIDE_SEVERITY = "overrideSeverity";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_SEVERITY)
  private List<String> overrideSeverity = null;

  public static final String SERIALIZED_NAME_LOGGING_ERROR_BEHAVIOR = "loggingErrorBehavior";
  @SerializedName(SERIALIZED_NAME_LOGGING_ERROR_BEHAVIOR)
  private EnumlogPublisherLoggingErrorBehaviorProp loggingErrorBehavior;

  public ConsoleJsonErrorLogPublisherResponseAllOf() {
  }

  public ConsoleJsonErrorLogPublisherResponseAllOf description(String description) {
    
    
    
    
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


  public ConsoleJsonErrorLogPublisherResponseAllOf schemas(List<EnumconsoleJsonErrorLogPublisherSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public ConsoleJsonErrorLogPublisherResponseAllOf addSchemasItem(EnumconsoleJsonErrorLogPublisherSchemaUrn schemasItem) {
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

  public List<EnumconsoleJsonErrorLogPublisherSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumconsoleJsonErrorLogPublisherSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public ConsoleJsonErrorLogPublisherResponseAllOf id(String id) {
    
    
    
    
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


  public ConsoleJsonErrorLogPublisherResponseAllOf enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the Console JSON Error Log Publisher is enabled for use.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the Console JSON Error Log Publisher is enabled for use.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public ConsoleJsonErrorLogPublisherResponseAllOf defaultSeverity(List<EnumlogPublisherDefaultSeverityProp> defaultSeverity) {
    
    
    
    
    this.defaultSeverity = defaultSeverity;
    return this;
  }

  public ConsoleJsonErrorLogPublisherResponseAllOf addDefaultSeverityItem(EnumlogPublisherDefaultSeverityProp defaultSeverityItem) {
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


  public ConsoleJsonErrorLogPublisherResponseAllOf writeMultiLineMessages(Boolean writeMultiLineMessages) {
    
    
    
    
    this.writeMultiLineMessages = writeMultiLineMessages;
    return this;
  }

   /**
   * Indicates whether the JSON objects should be formatted to span multiple lines with a single element on each line. The multi-line format is potentially more user friendly (if administrators may need to look at the log files), but each message will be larger because of the additional spaces and end-of-line markers.
   * @return writeMultiLineMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the JSON objects should be formatted to span multiple lines with a single element on each line. The multi-line format is potentially more user friendly (if administrators may need to look at the log files), but each message will be larger because of the additional spaces and end-of-line markers.")

  public Boolean getWriteMultiLineMessages() {
    return writeMultiLineMessages;
  }


  public void setWriteMultiLineMessages(Boolean writeMultiLineMessages) {
    
    
    
    this.writeMultiLineMessages = writeMultiLineMessages;
  }


  public ConsoleJsonErrorLogPublisherResponseAllOf outputLocation(EnumlogPublisherOutputLocationProp outputLocation) {
    
    
    
    
    this.outputLocation = outputLocation;
    return this;
  }

   /**
   * Get outputLocation
   * @return outputLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumlogPublisherOutputLocationProp getOutputLocation() {
    return outputLocation;
  }


  public void setOutputLocation(EnumlogPublisherOutputLocationProp outputLocation) {
    
    
    
    this.outputLocation = outputLocation;
  }


  public ConsoleJsonErrorLogPublisherResponseAllOf includeProductName(Boolean includeProductName) {
    
    
    
    
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


  public ConsoleJsonErrorLogPublisherResponseAllOf includeInstanceName(Boolean includeInstanceName) {
    
    
    
    
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


  public ConsoleJsonErrorLogPublisherResponseAllOf includeStartupID(Boolean includeStartupID) {
    
    
    
    
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


  public ConsoleJsonErrorLogPublisherResponseAllOf includeThreadID(Boolean includeThreadID) {
    
    
    
    
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


  public ConsoleJsonErrorLogPublisherResponseAllOf generifyMessageStringsWhenPossible(Boolean generifyMessageStringsWhenPossible) {
    
    
    
    
    this.generifyMessageStringsWhenPossible = generifyMessageStringsWhenPossible;
    return this;
  }

   /**
   * Indicates whether to use the generified version of the log message string (which may use placeholders like %s for a string or %d for an integer), rather than the version of the message with those placeholders replaced with specific values that would normally be written to the log.
   * @return generifyMessageStringsWhenPossible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether to use the generified version of the log message string (which may use placeholders like %s for a string or %d for an integer), rather than the version of the message with those placeholders replaced with specific values that would normally be written to the log.")

  public Boolean getGenerifyMessageStringsWhenPossible() {
    return generifyMessageStringsWhenPossible;
  }


  public void setGenerifyMessageStringsWhenPossible(Boolean generifyMessageStringsWhenPossible) {
    
    
    
    this.generifyMessageStringsWhenPossible = generifyMessageStringsWhenPossible;
  }


  public ConsoleJsonErrorLogPublisherResponseAllOf overrideSeverity(List<String> overrideSeverity) {
    
    
    
    
    this.overrideSeverity = overrideSeverity;
    return this;
  }

  public ConsoleJsonErrorLogPublisherResponseAllOf addOverrideSeverityItem(String overrideSeverityItem) {
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


  public ConsoleJsonErrorLogPublisherResponseAllOf loggingErrorBehavior(EnumlogPublisherLoggingErrorBehaviorProp loggingErrorBehavior) {
    
    
    
    
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
   * @return the ConsoleJsonErrorLogPublisherResponseAllOf instance itself
   */
  public ConsoleJsonErrorLogPublisherResponseAllOf putAdditionalProperty(String key, Object value) {
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
    ConsoleJsonErrorLogPublisherResponseAllOf consoleJsonErrorLogPublisherResponseAllOf = (ConsoleJsonErrorLogPublisherResponseAllOf) o;
    return Objects.equals(this.description, consoleJsonErrorLogPublisherResponseAllOf.description) &&
        Objects.equals(this.schemas, consoleJsonErrorLogPublisherResponseAllOf.schemas) &&
        Objects.equals(this.id, consoleJsonErrorLogPublisherResponseAllOf.id) &&
        Objects.equals(this.enabled, consoleJsonErrorLogPublisherResponseAllOf.enabled) &&
        Objects.equals(this.defaultSeverity, consoleJsonErrorLogPublisherResponseAllOf.defaultSeverity) &&
        Objects.equals(this.writeMultiLineMessages, consoleJsonErrorLogPublisherResponseAllOf.writeMultiLineMessages) &&
        Objects.equals(this.outputLocation, consoleJsonErrorLogPublisherResponseAllOf.outputLocation) &&
        Objects.equals(this.includeProductName, consoleJsonErrorLogPublisherResponseAllOf.includeProductName) &&
        Objects.equals(this.includeInstanceName, consoleJsonErrorLogPublisherResponseAllOf.includeInstanceName) &&
        Objects.equals(this.includeStartupID, consoleJsonErrorLogPublisherResponseAllOf.includeStartupID) &&
        Objects.equals(this.includeThreadID, consoleJsonErrorLogPublisherResponseAllOf.includeThreadID) &&
        Objects.equals(this.generifyMessageStringsWhenPossible, consoleJsonErrorLogPublisherResponseAllOf.generifyMessageStringsWhenPossible) &&
        Objects.equals(this.overrideSeverity, consoleJsonErrorLogPublisherResponseAllOf.overrideSeverity) &&
        Objects.equals(this.loggingErrorBehavior, consoleJsonErrorLogPublisherResponseAllOf.loggingErrorBehavior)&&
        Objects.equals(this.additionalProperties, consoleJsonErrorLogPublisherResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, id, enabled, defaultSeverity, writeMultiLineMessages, outputLocation, includeProductName, includeInstanceName, includeStartupID, includeThreadID, generifyMessageStringsWhenPossible, overrideSeverity, loggingErrorBehavior, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleJsonErrorLogPublisherResponseAllOf {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    defaultSeverity: ").append(toIndentedString(defaultSeverity)).append("\n");
    sb.append("    writeMultiLineMessages: ").append(toIndentedString(writeMultiLineMessages)).append("\n");
    sb.append("    outputLocation: ").append(toIndentedString(outputLocation)).append("\n");
    sb.append("    includeProductName: ").append(toIndentedString(includeProductName)).append("\n");
    sb.append("    includeInstanceName: ").append(toIndentedString(includeInstanceName)).append("\n");
    sb.append("    includeStartupID: ").append(toIndentedString(includeStartupID)).append("\n");
    sb.append("    includeThreadID: ").append(toIndentedString(includeThreadID)).append("\n");
    sb.append("    generifyMessageStringsWhenPossible: ").append(toIndentedString(generifyMessageStringsWhenPossible)).append("\n");
    sb.append("    overrideSeverity: ").append(toIndentedString(overrideSeverity)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("defaultSeverity");
    openapiFields.add("writeMultiLineMessages");
    openapiFields.add("outputLocation");
    openapiFields.add("includeProductName");
    openapiFields.add("includeInstanceName");
    openapiFields.add("includeStartupID");
    openapiFields.add("includeThreadID");
    openapiFields.add("generifyMessageStringsWhenPossible");
    openapiFields.add("overrideSeverity");
    openapiFields.add("loggingErrorBehavior");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConsoleJsonErrorLogPublisherResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConsoleJsonErrorLogPublisherResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsoleJsonErrorLogPublisherResponseAllOf is not found in the empty JSON string", ConsoleJsonErrorLogPublisherResponseAllOf.openapiRequiredFields.toString()));
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
      if (jsonObj.get("defaultSeverity") != null && !jsonObj.get("defaultSeverity").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultSeverity` to be an array in the JSON string but got `%s`", jsonObj.get("defaultSeverity").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("overrideSeverity") != null && !jsonObj.get("overrideSeverity").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `overrideSeverity` to be an array in the JSON string but got `%s`", jsonObj.get("overrideSeverity").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsoleJsonErrorLogPublisherResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsoleJsonErrorLogPublisherResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsoleJsonErrorLogPublisherResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsoleJsonErrorLogPublisherResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsoleJsonErrorLogPublisherResponseAllOf>() {
           @Override
           public void write(JsonWriter out, ConsoleJsonErrorLogPublisherResponseAllOf value) throws IOException {
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
           public ConsoleJsonErrorLogPublisherResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ConsoleJsonErrorLogPublisherResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ConsoleJsonErrorLogPublisherResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConsoleJsonErrorLogPublisherResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to ConsoleJsonErrorLogPublisherResponseAllOf
  */
  public static ConsoleJsonErrorLogPublisherResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsoleJsonErrorLogPublisherResponseAllOf.class);
  }

 /**
  * Convert an instance of ConsoleJsonErrorLogPublisherResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

