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
import com.konfigthis.client.model.EnumchangeSubscriptionNotificationPluginSchemaUrn;
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
 * ChangeSubscriptionNotificationPluginResponseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ChangeSubscriptionNotificationPluginResponseAllOf {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumchangeSubscriptionNotificationPluginSchemaUrn> schemas = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PLUGIN_TYPE = "pluginType";
  @SerializedName(SERIALIZED_NAME_PLUGIN_TYPE)
  private List<EnumpluginPluginTypeProp> pluginType = null;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_INVOKE_FOR_INTERNAL_OPERATIONS = "invokeForInternalOperations";
  @SerializedName(SERIALIZED_NAME_INVOKE_FOR_INTERNAL_OPERATIONS)
  private Boolean invokeForInternalOperations;

  public ChangeSubscriptionNotificationPluginResponseAllOf() {
  }

  public ChangeSubscriptionNotificationPluginResponseAllOf description(String description) {
    
    
    
    
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


  public ChangeSubscriptionNotificationPluginResponseAllOf schemas(List<EnumchangeSubscriptionNotificationPluginSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public ChangeSubscriptionNotificationPluginResponseAllOf addSchemasItem(EnumchangeSubscriptionNotificationPluginSchemaUrn schemasItem) {
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

  public List<EnumchangeSubscriptionNotificationPluginSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumchangeSubscriptionNotificationPluginSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public ChangeSubscriptionNotificationPluginResponseAllOf id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Plugin
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Plugin")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ChangeSubscriptionNotificationPluginResponseAllOf pluginType(List<EnumpluginPluginTypeProp> pluginType) {
    
    
    
    
    this.pluginType = pluginType;
    return this;
  }

  public ChangeSubscriptionNotificationPluginResponseAllOf addPluginTypeItem(EnumpluginPluginTypeProp pluginTypeItem) {
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


  public ChangeSubscriptionNotificationPluginResponseAllOf enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the plug-in is enabled for use.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the plug-in is enabled for use.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public ChangeSubscriptionNotificationPluginResponseAllOf invokeForInternalOperations(Boolean invokeForInternalOperations) {
    
    
    
    
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
   * @return the ChangeSubscriptionNotificationPluginResponseAllOf instance itself
   */
  public ChangeSubscriptionNotificationPluginResponseAllOf putAdditionalProperty(String key, Object value) {
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
    ChangeSubscriptionNotificationPluginResponseAllOf changeSubscriptionNotificationPluginResponseAllOf = (ChangeSubscriptionNotificationPluginResponseAllOf) o;
    return Objects.equals(this.description, changeSubscriptionNotificationPluginResponseAllOf.description) &&
        Objects.equals(this.schemas, changeSubscriptionNotificationPluginResponseAllOf.schemas) &&
        Objects.equals(this.id, changeSubscriptionNotificationPluginResponseAllOf.id) &&
        Objects.equals(this.pluginType, changeSubscriptionNotificationPluginResponseAllOf.pluginType) &&
        Objects.equals(this.enabled, changeSubscriptionNotificationPluginResponseAllOf.enabled) &&
        Objects.equals(this.invokeForInternalOperations, changeSubscriptionNotificationPluginResponseAllOf.invokeForInternalOperations)&&
        Objects.equals(this.additionalProperties, changeSubscriptionNotificationPluginResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, id, pluginType, enabled, invokeForInternalOperations, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeSubscriptionNotificationPluginResponseAllOf {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pluginType: ").append(toIndentedString(pluginType)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("id");
    openapiFields.add("pluginType");
    openapiFields.add("enabled");
    openapiFields.add("invokeForInternalOperations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChangeSubscriptionNotificationPluginResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChangeSubscriptionNotificationPluginResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangeSubscriptionNotificationPluginResponseAllOf is not found in the empty JSON string", ChangeSubscriptionNotificationPluginResponseAllOf.openapiRequiredFields.toString()));
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
      if (jsonObj.get("pluginType") != null && !jsonObj.get("pluginType").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pluginType` to be an array in the JSON string but got `%s`", jsonObj.get("pluginType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangeSubscriptionNotificationPluginResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangeSubscriptionNotificationPluginResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangeSubscriptionNotificationPluginResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangeSubscriptionNotificationPluginResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangeSubscriptionNotificationPluginResponseAllOf>() {
           @Override
           public void write(JsonWriter out, ChangeSubscriptionNotificationPluginResponseAllOf value) throws IOException {
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
           public ChangeSubscriptionNotificationPluginResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ChangeSubscriptionNotificationPluginResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ChangeSubscriptionNotificationPluginResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangeSubscriptionNotificationPluginResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to ChangeSubscriptionNotificationPluginResponseAllOf
  */
  public static ChangeSubscriptionNotificationPluginResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangeSubscriptionNotificationPluginResponseAllOf.class);
  }

 /**
  * Convert an instance of ChangeSubscriptionNotificationPluginResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

