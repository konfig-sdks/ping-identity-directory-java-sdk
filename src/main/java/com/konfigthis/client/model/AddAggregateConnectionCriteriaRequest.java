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
import com.konfigthis.client.model.EnumaggregateConnectionCriteriaSchemaUrn;
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
 * AddAggregateConnectionCriteriaRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddAggregateConnectionCriteriaRequest {
  public static final String SERIALIZED_NAME_CRITERIA_NAME = "criteriaName";
  @SerializedName(SERIALIZED_NAME_CRITERIA_NAME)
  private String criteriaName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumaggregateConnectionCriteriaSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALL_INCLUDED_CONNECTION_CRITERIA = "allIncludedConnectionCriteria";
  @SerializedName(SERIALIZED_NAME_ALL_INCLUDED_CONNECTION_CRITERIA)
  private List<String> allIncludedConnectionCriteria = null;

  public static final String SERIALIZED_NAME_ANY_INCLUDED_CONNECTION_CRITERIA = "anyIncludedConnectionCriteria";
  @SerializedName(SERIALIZED_NAME_ANY_INCLUDED_CONNECTION_CRITERIA)
  private List<String> anyIncludedConnectionCriteria = null;

  public static final String SERIALIZED_NAME_NOT_ALL_INCLUDED_CONNECTION_CRITERIA = "notAllIncludedConnectionCriteria";
  @SerializedName(SERIALIZED_NAME_NOT_ALL_INCLUDED_CONNECTION_CRITERIA)
  private List<String> notAllIncludedConnectionCriteria = null;

  public static final String SERIALIZED_NAME_NONE_INCLUDED_CONNECTION_CRITERIA = "noneIncludedConnectionCriteria";
  @SerializedName(SERIALIZED_NAME_NONE_INCLUDED_CONNECTION_CRITERIA)
  private List<String> noneIncludedConnectionCriteria = null;

  public AddAggregateConnectionCriteriaRequest() {
  }

  public AddAggregateConnectionCriteriaRequest criteriaName(String criteriaName) {
    
    
    
    
    this.criteriaName = criteriaName;
    return this;
  }

   /**
   * Name of the new Connection Criteria
   * @return criteriaName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the new Connection Criteria")

  public String getCriteriaName() {
    return criteriaName;
  }


  public void setCriteriaName(String criteriaName) {
    
    
    
    this.criteriaName = criteriaName;
  }


  public AddAggregateConnectionCriteriaRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Connection Criteria
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Connection Criteria")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AddAggregateConnectionCriteriaRequest schemas(List<EnumaggregateConnectionCriteriaSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddAggregateConnectionCriteriaRequest addSchemasItem(EnumaggregateConnectionCriteriaSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumaggregateConnectionCriteriaSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumaggregateConnectionCriteriaSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddAggregateConnectionCriteriaRequest allIncludedConnectionCriteria(List<String> allIncludedConnectionCriteria) {
    
    
    
    
    this.allIncludedConnectionCriteria = allIncludedConnectionCriteria;
    return this;
  }

  public AddAggregateConnectionCriteriaRequest addAllIncludedConnectionCriteriaItem(String allIncludedConnectionCriteriaItem) {
    if (this.allIncludedConnectionCriteria == null) {
      this.allIncludedConnectionCriteria = new ArrayList<>();
    }
    this.allIncludedConnectionCriteria.add(allIncludedConnectionCriteriaItem);
    return this;
  }

   /**
   * Specifies a connection criteria object that must match the associated client connection in order to match the aggregate connection criteria. If one or more all-included connection criteria objects are provided, then a client connection must match all of them in order to match the aggregate connection criteria.
   * @return allIncludedConnectionCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a connection criteria object that must match the associated client connection in order to match the aggregate connection criteria. If one or more all-included connection criteria objects are provided, then a client connection must match all of them in order to match the aggregate connection criteria.")

  public List<String> getAllIncludedConnectionCriteria() {
    return allIncludedConnectionCriteria;
  }


  public void setAllIncludedConnectionCriteria(List<String> allIncludedConnectionCriteria) {
    
    
    
    this.allIncludedConnectionCriteria = allIncludedConnectionCriteria;
  }


  public AddAggregateConnectionCriteriaRequest anyIncludedConnectionCriteria(List<String> anyIncludedConnectionCriteria) {
    
    
    
    
    this.anyIncludedConnectionCriteria = anyIncludedConnectionCriteria;
    return this;
  }

  public AddAggregateConnectionCriteriaRequest addAnyIncludedConnectionCriteriaItem(String anyIncludedConnectionCriteriaItem) {
    if (this.anyIncludedConnectionCriteria == null) {
      this.anyIncludedConnectionCriteria = new ArrayList<>();
    }
    this.anyIncludedConnectionCriteria.add(anyIncludedConnectionCriteriaItem);
    return this;
  }

   /**
   * Specifies a connection criteria object that may match the associated client connection in order to match the aggregate connection criteria. If one or more any-included connection criteria objects are provided, then a client connection must match at least one of them in order to match the aggregate connection criteria.
   * @return anyIncludedConnectionCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a connection criteria object that may match the associated client connection in order to match the aggregate connection criteria. If one or more any-included connection criteria objects are provided, then a client connection must match at least one of them in order to match the aggregate connection criteria.")

  public List<String> getAnyIncludedConnectionCriteria() {
    return anyIncludedConnectionCriteria;
  }


  public void setAnyIncludedConnectionCriteria(List<String> anyIncludedConnectionCriteria) {
    
    
    
    this.anyIncludedConnectionCriteria = anyIncludedConnectionCriteria;
  }


  public AddAggregateConnectionCriteriaRequest notAllIncludedConnectionCriteria(List<String> notAllIncludedConnectionCriteria) {
    
    
    
    
    this.notAllIncludedConnectionCriteria = notAllIncludedConnectionCriteria;
    return this;
  }

  public AddAggregateConnectionCriteriaRequest addNotAllIncludedConnectionCriteriaItem(String notAllIncludedConnectionCriteriaItem) {
    if (this.notAllIncludedConnectionCriteria == null) {
      this.notAllIncludedConnectionCriteria = new ArrayList<>();
    }
    this.notAllIncludedConnectionCriteria.add(notAllIncludedConnectionCriteriaItem);
    return this;
  }

   /**
   * Specifies a connection criteria object that should not match the associated client connection in order to match the aggregate connection criteria. If one or more not-all-included connection criteria objects are provided, then a client connection must not match all of them (that is, it may match zero or more of them, but it must not match all of them) in order to match the aggregate connection criteria.
   * @return notAllIncludedConnectionCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a connection criteria object that should not match the associated client connection in order to match the aggregate connection criteria. If one or more not-all-included connection criteria objects are provided, then a client connection must not match all of them (that is, it may match zero or more of them, but it must not match all of them) in order to match the aggregate connection criteria.")

  public List<String> getNotAllIncludedConnectionCriteria() {
    return notAllIncludedConnectionCriteria;
  }


  public void setNotAllIncludedConnectionCriteria(List<String> notAllIncludedConnectionCriteria) {
    
    
    
    this.notAllIncludedConnectionCriteria = notAllIncludedConnectionCriteria;
  }


  public AddAggregateConnectionCriteriaRequest noneIncludedConnectionCriteria(List<String> noneIncludedConnectionCriteria) {
    
    
    
    
    this.noneIncludedConnectionCriteria = noneIncludedConnectionCriteria;
    return this;
  }

  public AddAggregateConnectionCriteriaRequest addNoneIncludedConnectionCriteriaItem(String noneIncludedConnectionCriteriaItem) {
    if (this.noneIncludedConnectionCriteria == null) {
      this.noneIncludedConnectionCriteria = new ArrayList<>();
    }
    this.noneIncludedConnectionCriteria.add(noneIncludedConnectionCriteriaItem);
    return this;
  }

   /**
   * Specifies a connection criteria object that must not match the associated client connection in order to match the aggregate connection criteria. If one or more none-included connection criteria objects are provided, then a client connection must not match any of them in order to match the aggregate connection criteria.
   * @return noneIncludedConnectionCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a connection criteria object that must not match the associated client connection in order to match the aggregate connection criteria. If one or more none-included connection criteria objects are provided, then a client connection must not match any of them in order to match the aggregate connection criteria.")

  public List<String> getNoneIncludedConnectionCriteria() {
    return noneIncludedConnectionCriteria;
  }


  public void setNoneIncludedConnectionCriteria(List<String> noneIncludedConnectionCriteria) {
    
    
    
    this.noneIncludedConnectionCriteria = noneIncludedConnectionCriteria;
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
   * @return the AddAggregateConnectionCriteriaRequest instance itself
   */
  public AddAggregateConnectionCriteriaRequest putAdditionalProperty(String key, Object value) {
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
    AddAggregateConnectionCriteriaRequest addAggregateConnectionCriteriaRequest = (AddAggregateConnectionCriteriaRequest) o;
    return Objects.equals(this.criteriaName, addAggregateConnectionCriteriaRequest.criteriaName) &&
        Objects.equals(this.description, addAggregateConnectionCriteriaRequest.description) &&
        Objects.equals(this.schemas, addAggregateConnectionCriteriaRequest.schemas) &&
        Objects.equals(this.allIncludedConnectionCriteria, addAggregateConnectionCriteriaRequest.allIncludedConnectionCriteria) &&
        Objects.equals(this.anyIncludedConnectionCriteria, addAggregateConnectionCriteriaRequest.anyIncludedConnectionCriteria) &&
        Objects.equals(this.notAllIncludedConnectionCriteria, addAggregateConnectionCriteriaRequest.notAllIncludedConnectionCriteria) &&
        Objects.equals(this.noneIncludedConnectionCriteria, addAggregateConnectionCriteriaRequest.noneIncludedConnectionCriteria)&&
        Objects.equals(this.additionalProperties, addAggregateConnectionCriteriaRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteriaName, description, schemas, allIncludedConnectionCriteria, anyIncludedConnectionCriteria, notAllIncludedConnectionCriteria, noneIncludedConnectionCriteria, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddAggregateConnectionCriteriaRequest {\n");
    sb.append("    criteriaName: ").append(toIndentedString(criteriaName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    allIncludedConnectionCriteria: ").append(toIndentedString(allIncludedConnectionCriteria)).append("\n");
    sb.append("    anyIncludedConnectionCriteria: ").append(toIndentedString(anyIncludedConnectionCriteria)).append("\n");
    sb.append("    notAllIncludedConnectionCriteria: ").append(toIndentedString(notAllIncludedConnectionCriteria)).append("\n");
    sb.append("    noneIncludedConnectionCriteria: ").append(toIndentedString(noneIncludedConnectionCriteria)).append("\n");
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
    openapiFields.add("criteriaName");
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("allIncludedConnectionCriteria");
    openapiFields.add("anyIncludedConnectionCriteria");
    openapiFields.add("notAllIncludedConnectionCriteria");
    openapiFields.add("noneIncludedConnectionCriteria");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("criteriaName");
    openapiRequiredFields.add("schemas");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddAggregateConnectionCriteriaRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddAggregateConnectionCriteriaRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddAggregateConnectionCriteriaRequest is not found in the empty JSON string", AddAggregateConnectionCriteriaRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddAggregateConnectionCriteriaRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("criteriaName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `criteriaName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("criteriaName").toString()));
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
      if (jsonObj.get("allIncludedConnectionCriteria") != null && !jsonObj.get("allIncludedConnectionCriteria").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allIncludedConnectionCriteria` to be an array in the JSON string but got `%s`", jsonObj.get("allIncludedConnectionCriteria").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("anyIncludedConnectionCriteria") != null && !jsonObj.get("anyIncludedConnectionCriteria").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `anyIncludedConnectionCriteria` to be an array in the JSON string but got `%s`", jsonObj.get("anyIncludedConnectionCriteria").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("notAllIncludedConnectionCriteria") != null && !jsonObj.get("notAllIncludedConnectionCriteria").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `notAllIncludedConnectionCriteria` to be an array in the JSON string but got `%s`", jsonObj.get("notAllIncludedConnectionCriteria").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("noneIncludedConnectionCriteria") != null && !jsonObj.get("noneIncludedConnectionCriteria").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `noneIncludedConnectionCriteria` to be an array in the JSON string but got `%s`", jsonObj.get("noneIncludedConnectionCriteria").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddAggregateConnectionCriteriaRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddAggregateConnectionCriteriaRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddAggregateConnectionCriteriaRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddAggregateConnectionCriteriaRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddAggregateConnectionCriteriaRequest>() {
           @Override
           public void write(JsonWriter out, AddAggregateConnectionCriteriaRequest value) throws IOException {
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
           public AddAggregateConnectionCriteriaRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddAggregateConnectionCriteriaRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddAggregateConnectionCriteriaRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddAggregateConnectionCriteriaRequest
  * @throws IOException if the JSON string is invalid with respect to AddAggregateConnectionCriteriaRequest
  */
  public static AddAggregateConnectionCriteriaRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddAggregateConnectionCriteriaRequest.class);
  }

 /**
  * Convert an instance of AddAggregateConnectionCriteriaRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

