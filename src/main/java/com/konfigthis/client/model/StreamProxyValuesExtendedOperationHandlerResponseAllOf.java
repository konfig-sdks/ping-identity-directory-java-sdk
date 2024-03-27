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
import com.konfigthis.client.model.EnumstreamProxyValuesExtendedOperationHandlerSchemaUrn;
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
 * StreamProxyValuesExtendedOperationHandlerResponseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class StreamProxyValuesExtendedOperationHandlerResponseAllOf {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumstreamProxyValuesExtendedOperationHandlerSchemaUrn> schemas = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_VALUES_PER_STREAM_RESPONSE = "valuesPerStreamResponse";
  @SerializedName(SERIALIZED_NAME_VALUES_PER_STREAM_RESPONSE)
  private Integer valuesPerStreamResponse;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public StreamProxyValuesExtendedOperationHandlerResponseAllOf() {
  }

  public StreamProxyValuesExtendedOperationHandlerResponseAllOf description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Extended Operation Handler
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Extended Operation Handler")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public StreamProxyValuesExtendedOperationHandlerResponseAllOf schemas(List<EnumstreamProxyValuesExtendedOperationHandlerSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public StreamProxyValuesExtendedOperationHandlerResponseAllOf addSchemasItem(EnumstreamProxyValuesExtendedOperationHandlerSchemaUrn schemasItem) {
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

  public List<EnumstreamProxyValuesExtendedOperationHandlerSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumstreamProxyValuesExtendedOperationHandlerSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public StreamProxyValuesExtendedOperationHandlerResponseAllOf id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Extended Operation Handler
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Extended Operation Handler")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public StreamProxyValuesExtendedOperationHandlerResponseAllOf valuesPerStreamResponse(Integer valuesPerStreamResponse) {
    
    
    
    
    this.valuesPerStreamResponse = valuesPerStreamResponse;
    return this;
  }

   /**
   * The maximum number of values to include per response when responding to a stream values extended request, when the client does not specify a value.
   * @return valuesPerStreamResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of values to include per response when responding to a stream values extended request, when the client does not specify a value.")

  public Integer getValuesPerStreamResponse() {
    return valuesPerStreamResponse;
  }


  public void setValuesPerStreamResponse(Integer valuesPerStreamResponse) {
    
    
    
    this.valuesPerStreamResponse = valuesPerStreamResponse;
  }


  public StreamProxyValuesExtendedOperationHandlerResponseAllOf enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the Extended Operation Handler is enabled (that is, whether the types of extended operations are allowed in the server).
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the Extended Operation Handler is enabled (that is, whether the types of extended operations are allowed in the server).")

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
   * @return the StreamProxyValuesExtendedOperationHandlerResponseAllOf instance itself
   */
  public StreamProxyValuesExtendedOperationHandlerResponseAllOf putAdditionalProperty(String key, Object value) {
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
    StreamProxyValuesExtendedOperationHandlerResponseAllOf streamProxyValuesExtendedOperationHandlerResponseAllOf = (StreamProxyValuesExtendedOperationHandlerResponseAllOf) o;
    return Objects.equals(this.description, streamProxyValuesExtendedOperationHandlerResponseAllOf.description) &&
        Objects.equals(this.schemas, streamProxyValuesExtendedOperationHandlerResponseAllOf.schemas) &&
        Objects.equals(this.id, streamProxyValuesExtendedOperationHandlerResponseAllOf.id) &&
        Objects.equals(this.valuesPerStreamResponse, streamProxyValuesExtendedOperationHandlerResponseAllOf.valuesPerStreamResponse) &&
        Objects.equals(this.enabled, streamProxyValuesExtendedOperationHandlerResponseAllOf.enabled)&&
        Objects.equals(this.additionalProperties, streamProxyValuesExtendedOperationHandlerResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, id, valuesPerStreamResponse, enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamProxyValuesExtendedOperationHandlerResponseAllOf {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    valuesPerStreamResponse: ").append(toIndentedString(valuesPerStreamResponse)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("id");
    openapiFields.add("valuesPerStreamResponse");
    openapiFields.add("enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StreamProxyValuesExtendedOperationHandlerResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StreamProxyValuesExtendedOperationHandlerResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StreamProxyValuesExtendedOperationHandlerResponseAllOf is not found in the empty JSON string", StreamProxyValuesExtendedOperationHandlerResponseAllOf.openapiRequiredFields.toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StreamProxyValuesExtendedOperationHandlerResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StreamProxyValuesExtendedOperationHandlerResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StreamProxyValuesExtendedOperationHandlerResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StreamProxyValuesExtendedOperationHandlerResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<StreamProxyValuesExtendedOperationHandlerResponseAllOf>() {
           @Override
           public void write(JsonWriter out, StreamProxyValuesExtendedOperationHandlerResponseAllOf value) throws IOException {
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
           public StreamProxyValuesExtendedOperationHandlerResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             StreamProxyValuesExtendedOperationHandlerResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of StreamProxyValuesExtendedOperationHandlerResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StreamProxyValuesExtendedOperationHandlerResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to StreamProxyValuesExtendedOperationHandlerResponseAllOf
  */
  public static StreamProxyValuesExtendedOperationHandlerResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StreamProxyValuesExtendedOperationHandlerResponseAllOf.class);
  }

 /**
  * Convert an instance of StreamProxyValuesExtendedOperationHandlerResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

