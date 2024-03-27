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
import com.konfigthis.client.model.EnumsimpleToExternalBindPluginSchemaUrn;
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
 * AddSimpleToExternalBindPluginRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddSimpleToExternalBindPluginRequest {
  public static final String SERIALIZED_NAME_PLUGIN_NAME = "pluginName";
  @SerializedName(SERIALIZED_NAME_PLUGIN_NAME)
  private String pluginName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumsimpleToExternalBindPluginSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONNECTION_CRITERIA = "connectionCriteria";
  @SerializedName(SERIALIZED_NAME_CONNECTION_CRITERIA)
  private String connectionCriteria;

  public static final String SERIALIZED_NAME_REQUEST_CRITERIA = "requestCriteria";
  @SerializedName(SERIALIZED_NAME_REQUEST_CRITERIA)
  private String requestCriteria;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public AddSimpleToExternalBindPluginRequest() {
  }

  public AddSimpleToExternalBindPluginRequest pluginName(String pluginName) {
    
    
    
    
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


  public AddSimpleToExternalBindPluginRequest description(String description) {
    
    
    
    
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


  public AddSimpleToExternalBindPluginRequest schemas(List<EnumsimpleToExternalBindPluginSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddSimpleToExternalBindPluginRequest addSchemasItem(EnumsimpleToExternalBindPluginSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumsimpleToExternalBindPluginSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumsimpleToExternalBindPluginSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddSimpleToExternalBindPluginRequest connectionCriteria(String connectionCriteria) {
    
    
    
    
    this.connectionCriteria = connectionCriteria;
    return this;
  }

   /**
   * Specifies a connection criteria object that may be used to indicate the set of clients for which this plugin should be used. If a value is provided, then this plugin will only be used for requests from client connections matching this criteria.
   * @return connectionCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a connection criteria object that may be used to indicate the set of clients for which this plugin should be used. If a value is provided, then this plugin will only be used for requests from client connections matching this criteria.")

  public String getConnectionCriteria() {
    return connectionCriteria;
  }


  public void setConnectionCriteria(String connectionCriteria) {
    
    
    
    this.connectionCriteria = connectionCriteria;
  }


  public AddSimpleToExternalBindPluginRequest requestCriteria(String requestCriteria) {
    
    
    
    
    this.requestCriteria = requestCriteria;
    return this;
  }

   /**
   * Specifies a request criteria object that may be used to indicate the set of requests for which this plugin should be used. If a value is provided, then this plugin will only be used for bind requests matching this criteria.
   * @return requestCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a request criteria object that may be used to indicate the set of requests for which this plugin should be used. If a value is provided, then this plugin will only be used for bind requests matching this criteria.")

  public String getRequestCriteria() {
    return requestCriteria;
  }


  public void setRequestCriteria(String requestCriteria) {
    
    
    
    this.requestCriteria = requestCriteria;
  }


  public AddSimpleToExternalBindPluginRequest enabled(Boolean enabled) {
    
    
    
    
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
   * @return the AddSimpleToExternalBindPluginRequest instance itself
   */
  public AddSimpleToExternalBindPluginRequest putAdditionalProperty(String key, Object value) {
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
    AddSimpleToExternalBindPluginRequest addSimpleToExternalBindPluginRequest = (AddSimpleToExternalBindPluginRequest) o;
    return Objects.equals(this.pluginName, addSimpleToExternalBindPluginRequest.pluginName) &&
        Objects.equals(this.description, addSimpleToExternalBindPluginRequest.description) &&
        Objects.equals(this.schemas, addSimpleToExternalBindPluginRequest.schemas) &&
        Objects.equals(this.connectionCriteria, addSimpleToExternalBindPluginRequest.connectionCriteria) &&
        Objects.equals(this.requestCriteria, addSimpleToExternalBindPluginRequest.requestCriteria) &&
        Objects.equals(this.enabled, addSimpleToExternalBindPluginRequest.enabled)&&
        Objects.equals(this.additionalProperties, addSimpleToExternalBindPluginRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pluginName, description, schemas, connectionCriteria, requestCriteria, enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddSimpleToExternalBindPluginRequest {\n");
    sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    connectionCriteria: ").append(toIndentedString(connectionCriteria)).append("\n");
    sb.append("    requestCriteria: ").append(toIndentedString(requestCriteria)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
    openapiFields.add("connectionCriteria");
    openapiFields.add("requestCriteria");
    openapiFields.add("enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pluginName");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddSimpleToExternalBindPluginRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddSimpleToExternalBindPluginRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddSimpleToExternalBindPluginRequest is not found in the empty JSON string", AddSimpleToExternalBindPluginRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddSimpleToExternalBindPluginRequest.openapiRequiredFields) {
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
      if ((jsonObj.get("connectionCriteria") != null && !jsonObj.get("connectionCriteria").isJsonNull()) && !jsonObj.get("connectionCriteria").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connectionCriteria` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connectionCriteria").toString()));
      }
      if ((jsonObj.get("requestCriteria") != null && !jsonObj.get("requestCriteria").isJsonNull()) && !jsonObj.get("requestCriteria").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestCriteria` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestCriteria").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddSimpleToExternalBindPluginRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddSimpleToExternalBindPluginRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddSimpleToExternalBindPluginRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddSimpleToExternalBindPluginRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddSimpleToExternalBindPluginRequest>() {
           @Override
           public void write(JsonWriter out, AddSimpleToExternalBindPluginRequest value) throws IOException {
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
           public AddSimpleToExternalBindPluginRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddSimpleToExternalBindPluginRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddSimpleToExternalBindPluginRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddSimpleToExternalBindPluginRequest
  * @throws IOException if the JSON string is invalid with respect to AddSimpleToExternalBindPluginRequest
  */
  public static AddSimpleToExternalBindPluginRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddSimpleToExternalBindPluginRequest.class);
  }

 /**
  * Convert an instance of AddSimpleToExternalBindPluginRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

