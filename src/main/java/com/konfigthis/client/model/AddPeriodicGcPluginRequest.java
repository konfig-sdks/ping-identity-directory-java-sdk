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
import com.konfigthis.client.model.EnumperiodicGcPluginSchemaUrn;
import com.konfigthis.client.model.EnumpluginInvokeGCDayOfWeekProp;
import com.konfigthis.client.model.EnumpluginPluginTypeProp;
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
 * AddPeriodicGcPluginRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddPeriodicGcPluginRequest {
  public static final String SERIALIZED_NAME_PLUGIN_NAME = "pluginName";
  @SerializedName(SERIALIZED_NAME_PLUGIN_NAME)
  private String pluginName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumperiodicGcPluginSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_PLUGIN_TYPE = "pluginType";
  @SerializedName(SERIALIZED_NAME_PLUGIN_TYPE)
  private List<EnumpluginPluginTypeProp> pluginType = null;

  public static final String SERIALIZED_NAME_INVOKE_G_C_DAY_OF_WEEK = "invokeGCDayOfWeek";
  @SerializedName(SERIALIZED_NAME_INVOKE_G_C_DAY_OF_WEEK)
  private List<EnumpluginInvokeGCDayOfWeekProp> invokeGCDayOfWeek = null;

  public static final String SERIALIZED_NAME_INVOKE_G_C_TIME_UTC = "invokeGCTimeUtc";
  @SerializedName(SERIALIZED_NAME_INVOKE_G_C_TIME_UTC)
  private List<String> invokeGCTimeUtc = new ArrayList<>();

  public static final String SERIALIZED_NAME_DELAY_AFTER_ALERT = "delayAfterAlert";
  @SerializedName(SERIALIZED_NAME_DELAY_AFTER_ALERT)
  private String delayAfterAlert;

  public static final String SERIALIZED_NAME_DELAY_POST_G_C = "delayPostGC";
  @SerializedName(SERIALIZED_NAME_DELAY_POST_G_C)
  private String delayPostGC;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_INVOKE_FOR_INTERNAL_OPERATIONS = "invokeForInternalOperations";
  @SerializedName(SERIALIZED_NAME_INVOKE_FOR_INTERNAL_OPERATIONS)
  private Boolean invokeForInternalOperations;

  public AddPeriodicGcPluginRequest() {
  }

  public AddPeriodicGcPluginRequest pluginName(String pluginName) {
    
    
    
    
    this.pluginName = pluginName;
    return this;
  }

   /**
   * Name of the new Plugin
   * @return pluginName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the new Plugin")

  public String getPluginName() {
    return pluginName;
  }


  public void setPluginName(String pluginName) {
    
    
    
    this.pluginName = pluginName;
  }


  public AddPeriodicGcPluginRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Plugin
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Plugin")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AddPeriodicGcPluginRequest schemas(List<EnumperiodicGcPluginSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddPeriodicGcPluginRequest addSchemasItem(EnumperiodicGcPluginSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumperiodicGcPluginSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumperiodicGcPluginSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddPeriodicGcPluginRequest pluginType(List<EnumpluginPluginTypeProp> pluginType) {
    
    
    
    
    this.pluginType = pluginType;
    return this;
  }

  public AddPeriodicGcPluginRequest addPluginTypeItem(EnumpluginPluginTypeProp pluginTypeItem) {
    if (this.pluginType == null) {
      this.pluginType = new ArrayList<>();
    }
    this.pluginType.add(pluginTypeItem);
    return this;
  }

   /**
   * Get pluginType
   * @return pluginType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumpluginPluginTypeProp> getPluginType() {
    return pluginType;
  }


  public void setPluginType(List<EnumpluginPluginTypeProp> pluginType) {
    
    
    
    this.pluginType = pluginType;
  }


  public AddPeriodicGcPluginRequest invokeGCDayOfWeek(List<EnumpluginInvokeGCDayOfWeekProp> invokeGCDayOfWeek) {
    
    
    
    
    this.invokeGCDayOfWeek = invokeGCDayOfWeek;
    return this;
  }

  public AddPeriodicGcPluginRequest addInvokeGCDayOfWeekItem(EnumpluginInvokeGCDayOfWeekProp invokeGCDayOfWeekItem) {
    if (this.invokeGCDayOfWeek == null) {
      this.invokeGCDayOfWeek = new ArrayList<>();
    }
    this.invokeGCDayOfWeek.add(invokeGCDayOfWeekItem);
    return this;
  }

   /**
   * Get invokeGCDayOfWeek
   * @return invokeGCDayOfWeek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumpluginInvokeGCDayOfWeekProp> getInvokeGCDayOfWeek() {
    return invokeGCDayOfWeek;
  }


  public void setInvokeGCDayOfWeek(List<EnumpluginInvokeGCDayOfWeekProp> invokeGCDayOfWeek) {
    
    
    
    this.invokeGCDayOfWeek = invokeGCDayOfWeek;
  }


  public AddPeriodicGcPluginRequest invokeGCTimeUtc(List<String> invokeGCTimeUtc) {
    
    
    
    
    this.invokeGCTimeUtc = invokeGCTimeUtc;
    return this;
  }

  public AddPeriodicGcPluginRequest addInvokeGCTimeUtcItem(String invokeGCTimeUtcItem) {
    this.invokeGCTimeUtc.add(invokeGCTimeUtcItem);
    return this;
  }

   /**
   * Specifies the times of the day at which garbage collection may be explicitly invoked. The times should be specified in \&quot;HH:MM\&quot; format, with \&quot;HH\&quot; as a two-digit numeric value between 00 and 23 representing the hour of the day, and MM as a two-digit numeric value between 00 and 59 representing the minute of the hour. All times will be interpreted in the UTC time zone.
   * @return invokeGCTimeUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the times of the day at which garbage collection may be explicitly invoked. The times should be specified in \"HH:MM\" format, with \"HH\" as a two-digit numeric value between 00 and 23 representing the hour of the day, and MM as a two-digit numeric value between 00 and 59 representing the minute of the hour. All times will be interpreted in the UTC time zone.")

  public List<String> getInvokeGCTimeUtc() {
    return invokeGCTimeUtc;
  }


  public void setInvokeGCTimeUtc(List<String> invokeGCTimeUtc) {
    
    
    
    this.invokeGCTimeUtc = invokeGCTimeUtc;
  }


  public AddPeriodicGcPluginRequest delayAfterAlert(String delayAfterAlert) {
    
    
    
    
    this.delayAfterAlert = delayAfterAlert;
    return this;
  }

   /**
   * Specifies the length of time that the Directory Server should wait after sending the \&quot;force-gc-starting\&quot; administrative alert before actually invoking the garbage collection processing.
   * @return delayAfterAlert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the length of time that the Directory Server should wait after sending the \"force-gc-starting\" administrative alert before actually invoking the garbage collection processing.")

  public String getDelayAfterAlert() {
    return delayAfterAlert;
  }


  public void setDelayAfterAlert(String delayAfterAlert) {
    
    
    
    this.delayAfterAlert = delayAfterAlert;
  }


  public AddPeriodicGcPluginRequest delayPostGC(String delayPostGC) {
    
    
    
    
    this.delayPostGC = delayPostGC;
    return this;
  }

   /**
   * Specifies the length of time that the Directory Server should wait after successfully completing the garbage collection processing, before removing the \&quot;force-gc-starting\&quot; administrative alert, which marks the server as unavailable.
   * @return delayPostGC
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the length of time that the Directory Server should wait after successfully completing the garbage collection processing, before removing the \"force-gc-starting\" administrative alert, which marks the server as unavailable.")

  public String getDelayPostGC() {
    return delayPostGC;
  }


  public void setDelayPostGC(String delayPostGC) {
    
    
    
    this.delayPostGC = delayPostGC;
  }


  public AddPeriodicGcPluginRequest enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the plug-in is enabled for use.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether the plug-in is enabled for use.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public AddPeriodicGcPluginRequest invokeForInternalOperations(Boolean invokeForInternalOperations) {
    
    
    
    
    this.invokeForInternalOperations = invokeForInternalOperations;
    return this;
  }

   /**
   * Indicates whether the plug-in should be invoked for internal operations.
   * @return invokeForInternalOperations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the plug-in should be invoked for internal operations.")

  public Boolean getInvokeForInternalOperations() {
    return invokeForInternalOperations;
  }


  public void setInvokeForInternalOperations(Boolean invokeForInternalOperations) {
    
    
    
    this.invokeForInternalOperations = invokeForInternalOperations;
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
   * @return the AddPeriodicGcPluginRequest instance itself
   */
  public AddPeriodicGcPluginRequest putAdditionalProperty(String key, Object value) {
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
    AddPeriodicGcPluginRequest addPeriodicGcPluginRequest = (AddPeriodicGcPluginRequest) o;
    return Objects.equals(this.pluginName, addPeriodicGcPluginRequest.pluginName) &&
        Objects.equals(this.description, addPeriodicGcPluginRequest.description) &&
        Objects.equals(this.schemas, addPeriodicGcPluginRequest.schemas) &&
        Objects.equals(this.pluginType, addPeriodicGcPluginRequest.pluginType) &&
        Objects.equals(this.invokeGCDayOfWeek, addPeriodicGcPluginRequest.invokeGCDayOfWeek) &&
        Objects.equals(this.invokeGCTimeUtc, addPeriodicGcPluginRequest.invokeGCTimeUtc) &&
        Objects.equals(this.delayAfterAlert, addPeriodicGcPluginRequest.delayAfterAlert) &&
        Objects.equals(this.delayPostGC, addPeriodicGcPluginRequest.delayPostGC) &&
        Objects.equals(this.enabled, addPeriodicGcPluginRequest.enabled) &&
        Objects.equals(this.invokeForInternalOperations, addPeriodicGcPluginRequest.invokeForInternalOperations)&&
        Objects.equals(this.additionalProperties, addPeriodicGcPluginRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pluginName, description, schemas, pluginType, invokeGCDayOfWeek, invokeGCTimeUtc, delayAfterAlert, delayPostGC, enabled, invokeForInternalOperations, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddPeriodicGcPluginRequest {\n");
    sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    pluginType: ").append(toIndentedString(pluginType)).append("\n");
    sb.append("    invokeGCDayOfWeek: ").append(toIndentedString(invokeGCDayOfWeek)).append("\n");
    sb.append("    invokeGCTimeUtc: ").append(toIndentedString(invokeGCTimeUtc)).append("\n");
    sb.append("    delayAfterAlert: ").append(toIndentedString(delayAfterAlert)).append("\n");
    sb.append("    delayPostGC: ").append(toIndentedString(delayPostGC)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    invokeForInternalOperations: ").append(toIndentedString(invokeForInternalOperations)).append("\n");
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
    openapiFields.add("pluginName");
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("pluginType");
    openapiFields.add("invokeGCDayOfWeek");
    openapiFields.add("invokeGCTimeUtc");
    openapiFields.add("delayAfterAlert");
    openapiFields.add("delayPostGC");
    openapiFields.add("enabled");
    openapiFields.add("invokeForInternalOperations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pluginName");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("invokeGCTimeUtc");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddPeriodicGcPluginRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddPeriodicGcPluginRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddPeriodicGcPluginRequest is not found in the empty JSON string", AddPeriodicGcPluginRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddPeriodicGcPluginRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("pluginName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pluginName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pluginName").toString()));
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("pluginType") != null && !jsonObj.get("pluginType").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pluginType` to be an array in the JSON string but got `%s`", jsonObj.get("pluginType").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("invokeGCDayOfWeek") != null && !jsonObj.get("invokeGCDayOfWeek").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `invokeGCDayOfWeek` to be an array in the JSON string but got `%s`", jsonObj.get("invokeGCDayOfWeek").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("invokeGCTimeUtc") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("invokeGCTimeUtc").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `invokeGCTimeUtc` to be an array in the JSON string but got `%s`", jsonObj.get("invokeGCTimeUtc").toString()));
      }
      if ((jsonObj.get("delayAfterAlert") != null && !jsonObj.get("delayAfterAlert").isJsonNull()) && !jsonObj.get("delayAfterAlert").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delayAfterAlert` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delayAfterAlert").toString()));
      }
      if ((jsonObj.get("delayPostGC") != null && !jsonObj.get("delayPostGC").isJsonNull()) && !jsonObj.get("delayPostGC").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delayPostGC` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delayPostGC").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddPeriodicGcPluginRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddPeriodicGcPluginRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddPeriodicGcPluginRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddPeriodicGcPluginRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddPeriodicGcPluginRequest>() {
           @Override
           public void write(JsonWriter out, AddPeriodicGcPluginRequest value) throws IOException {
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
           public AddPeriodicGcPluginRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddPeriodicGcPluginRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddPeriodicGcPluginRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddPeriodicGcPluginRequest
  * @throws IOException if the JSON string is invalid with respect to AddPeriodicGcPluginRequest
  */
  public static AddPeriodicGcPluginRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddPeriodicGcPluginRequest.class);
  }

 /**
  * Convert an instance of AddPeriodicGcPluginRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

