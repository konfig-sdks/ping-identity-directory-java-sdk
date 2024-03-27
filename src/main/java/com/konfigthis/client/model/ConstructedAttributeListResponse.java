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
import com.konfigthis.client.model.ConstructedAttributeResponse;
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
 * ConstructedAttributeListResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ConstructedAttributeListResponse {
  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<String> schemas = null;

  public static final String SERIALIZED_NAME_TOTAL_RESULTS = "totalResults";
  @SerializedName(SERIALIZED_NAME_TOTAL_RESULTS)
  private Double totalResults;

  public static final String SERIALIZED_NAME_RESOURCES = "Resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private List<ConstructedAttributeResponse> resources = null;

  public ConstructedAttributeListResponse() {
  }

  public ConstructedAttributeListResponse schemas(List<String> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public ConstructedAttributeListResponse addSchemasItem(String schemasItem) {
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

  public List<String> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<String> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public ConstructedAttributeListResponse totalResults(Double totalResults) {
    
    
    
    
    this.totalResults = totalResults;
    return this;
  }

  public ConstructedAttributeListResponse totalResults(Integer totalResults) {
    
    
    
    
    this.totalResults = totalResults.doubleValue();
    return this;
  }

   /**
   * Get totalResults
   * @return totalResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.8008281904610115", value = "")

  public Double getTotalResults() {
    return totalResults;
  }


  public void setTotalResults(Double totalResults) {
    
    
    
    this.totalResults = totalResults;
  }


  public ConstructedAttributeListResponse resources(List<ConstructedAttributeResponse> resources) {
    
    
    
    
    this.resources = resources;
    return this;
  }

  public ConstructedAttributeListResponse addResourcesItem(ConstructedAttributeResponse resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ConstructedAttributeResponse> getResources() {
    return resources;
  }


  public void setResources(List<ConstructedAttributeResponse> resources) {
    
    
    
    this.resources = resources;
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
   * @return the ConstructedAttributeListResponse instance itself
   */
  public ConstructedAttributeListResponse putAdditionalProperty(String key, Object value) {
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
    ConstructedAttributeListResponse constructedAttributeListResponse = (ConstructedAttributeListResponse) o;
    return Objects.equals(this.schemas, constructedAttributeListResponse.schemas) &&
        Objects.equals(this.totalResults, constructedAttributeListResponse.totalResults) &&
        Objects.equals(this.resources, constructedAttributeListResponse.resources)&&
        Objects.equals(this.additionalProperties, constructedAttributeListResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, totalResults, resources, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConstructedAttributeListResponse {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
    openapiFields.add("totalResults");
    openapiFields.add("Resources");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConstructedAttributeListResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConstructedAttributeListResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConstructedAttributeListResponse is not found in the empty JSON string", ConstructedAttributeListResponse.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("schemas") != null && !jsonObj.get("schemas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemas` to be an array in the JSON string but got `%s`", jsonObj.get("schemas").toString()));
      }
      if (jsonObj.get("Resources") != null && !jsonObj.get("Resources").isJsonNull()) {
        JsonArray jsonArrayresources = jsonObj.getAsJsonArray("Resources");
        if (jsonArrayresources != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Resources").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Resources` to be an array in the JSON string but got `%s`", jsonObj.get("Resources").toString()));
          }

          // validate the optional field `Resources` (array)
          for (int i = 0; i < jsonArrayresources.size(); i++) {
            ConstructedAttributeResponse.validateJsonObject(jsonArrayresources.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConstructedAttributeListResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConstructedAttributeListResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConstructedAttributeListResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConstructedAttributeListResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ConstructedAttributeListResponse>() {
           @Override
           public void write(JsonWriter out, ConstructedAttributeListResponse value) throws IOException {
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
           public ConstructedAttributeListResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ConstructedAttributeListResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ConstructedAttributeListResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConstructedAttributeListResponse
  * @throws IOException if the JSON string is invalid with respect to ConstructedAttributeListResponse
  */
  public static ConstructedAttributeListResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConstructedAttributeListResponse.class);
  }

 /**
  * Convert an instance of ConstructedAttributeListResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

