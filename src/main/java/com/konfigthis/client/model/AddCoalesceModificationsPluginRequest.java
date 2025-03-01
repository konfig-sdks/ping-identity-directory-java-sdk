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
import com.konfigthis.client.model.EnumcoalesceModificationsPluginSchemaUrn;
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
 * AddCoalesceModificationsPluginRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddCoalesceModificationsPluginRequest {
  public static final String SERIALIZED_NAME_PLUGIN_NAME = "pluginName";
  @SerializedName(SERIALIZED_NAME_PLUGIN_NAME)
  private String pluginName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumcoalesceModificationsPluginSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_CRITERIA = "requestCriteria";
  @SerializedName(SERIALIZED_NAME_REQUEST_CRITERIA)
  private String requestCriteria;

  public static final String SERIALIZED_NAME_ALLOWED_REQUEST_CONTROL = "allowedRequestControl";
  @SerializedName(SERIALIZED_NAME_ALLOWED_REQUEST_CONTROL)
  private List<String> allowedRequestControl = null;

  public static final String SERIALIZED_NAME_INVOKE_FOR_INTERNAL_OPERATIONS = "invokeForInternalOperations";
  @SerializedName(SERIALIZED_NAME_INVOKE_FOR_INTERNAL_OPERATIONS)
  private Boolean invokeForInternalOperations;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public AddCoalesceModificationsPluginRequest() {
  }

  public AddCoalesceModificationsPluginRequest pluginName(String pluginName) {
    
    
    
    
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


  public AddCoalesceModificationsPluginRequest description(String description) {
    
    
    
    
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


  public AddCoalesceModificationsPluginRequest schemas(List<EnumcoalesceModificationsPluginSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddCoalesceModificationsPluginRequest addSchemasItem(EnumcoalesceModificationsPluginSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumcoalesceModificationsPluginSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumcoalesceModificationsPluginSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddCoalesceModificationsPluginRequest requestCriteria(String requestCriteria) {
    
    
    
    
    this.requestCriteria = requestCriteria;
    return this;
  }

   /**
   * A reference to request criteria that indicates which modify requests should be coalesced.
   * @return requestCriteria
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A reference to request criteria that indicates which modify requests should be coalesced.")

  public String getRequestCriteria() {
    return requestCriteria;
  }


  public void setRequestCriteria(String requestCriteria) {
    
    
    
    this.requestCriteria = requestCriteria;
  }


  public AddCoalesceModificationsPluginRequest allowedRequestControl(List<String> allowedRequestControl) {
    
    
    
    
    this.allowedRequestControl = allowedRequestControl;
    return this;
  }

  public AddCoalesceModificationsPluginRequest addAllowedRequestControlItem(String allowedRequestControlItem) {
    if (this.allowedRequestControl == null) {
      this.allowedRequestControl = new ArrayList<>();
    }
    this.allowedRequestControl.add(allowedRequestControlItem);
    return this;
  }

   /**
   * Specifies the OIDs of the controls that are allowed to be present in operations to coalesce. These controls are passed through when the request is validated, but they will not be included when the background thread applies the coalesced modify requests.
   * @return allowedRequestControl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the OIDs of the controls that are allowed to be present in operations to coalesce. These controls are passed through when the request is validated, but they will not be included when the background thread applies the coalesced modify requests.")

  public List<String> getAllowedRequestControl() {
    return allowedRequestControl;
  }


  public void setAllowedRequestControl(List<String> allowedRequestControl) {
    
    
    
    this.allowedRequestControl = allowedRequestControl;
  }


  public AddCoalesceModificationsPluginRequest invokeForInternalOperations(Boolean invokeForInternalOperations) {
    
    
    
    
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


  public AddCoalesceModificationsPluginRequest enabled(Boolean enabled) {
    
    
    
    
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
   * @return the AddCoalesceModificationsPluginRequest instance itself
   */
  public AddCoalesceModificationsPluginRequest putAdditionalProperty(String key, Object value) {
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
    AddCoalesceModificationsPluginRequest addCoalesceModificationsPluginRequest = (AddCoalesceModificationsPluginRequest) o;
    return Objects.equals(this.pluginName, addCoalesceModificationsPluginRequest.pluginName) &&
        Objects.equals(this.description, addCoalesceModificationsPluginRequest.description) &&
        Objects.equals(this.schemas, addCoalesceModificationsPluginRequest.schemas) &&
        Objects.equals(this.requestCriteria, addCoalesceModificationsPluginRequest.requestCriteria) &&
        Objects.equals(this.allowedRequestControl, addCoalesceModificationsPluginRequest.allowedRequestControl) &&
        Objects.equals(this.invokeForInternalOperations, addCoalesceModificationsPluginRequest.invokeForInternalOperations) &&
        Objects.equals(this.enabled, addCoalesceModificationsPluginRequest.enabled)&&
        Objects.equals(this.additionalProperties, addCoalesceModificationsPluginRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pluginName, description, schemas, requestCriteria, allowedRequestControl, invokeForInternalOperations, enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCoalesceModificationsPluginRequest {\n");
    sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    requestCriteria: ").append(toIndentedString(requestCriteria)).append("\n");
    sb.append("    allowedRequestControl: ").append(toIndentedString(allowedRequestControl)).append("\n");
    sb.append("    invokeForInternalOperations: ").append(toIndentedString(invokeForInternalOperations)).append("\n");
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
    openapiFields.add("requestCriteria");
    openapiFields.add("allowedRequestControl");
    openapiFields.add("invokeForInternalOperations");
    openapiFields.add("enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pluginName");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("requestCriteria");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddCoalesceModificationsPluginRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddCoalesceModificationsPluginRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddCoalesceModificationsPluginRequest is not found in the empty JSON string", AddCoalesceModificationsPluginRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddCoalesceModificationsPluginRequest.openapiRequiredFields) {
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
      if (!jsonObj.get("requestCriteria").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestCriteria` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestCriteria").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowedRequestControl") != null && !jsonObj.get("allowedRequestControl").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedRequestControl` to be an array in the JSON string but got `%s`", jsonObj.get("allowedRequestControl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddCoalesceModificationsPluginRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddCoalesceModificationsPluginRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddCoalesceModificationsPluginRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddCoalesceModificationsPluginRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddCoalesceModificationsPluginRequest>() {
           @Override
           public void write(JsonWriter out, AddCoalesceModificationsPluginRequest value) throws IOException {
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
           public AddCoalesceModificationsPluginRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddCoalesceModificationsPluginRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddCoalesceModificationsPluginRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddCoalesceModificationsPluginRequest
  * @throws IOException if the JSON string is invalid with respect to AddCoalesceModificationsPluginRequest
  */
  public static AddCoalesceModificationsPluginRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddCoalesceModificationsPluginRequest.class);
  }

 /**
  * Convert an instance of AddCoalesceModificationsPluginRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

