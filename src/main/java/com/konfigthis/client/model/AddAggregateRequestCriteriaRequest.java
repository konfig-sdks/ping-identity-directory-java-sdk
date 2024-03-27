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
import com.konfigthis.client.model.EnumaggregateRequestCriteriaSchemaUrn;
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
 * AddAggregateRequestCriteriaRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddAggregateRequestCriteriaRequest {
  public static final String SERIALIZED_NAME_CRITERIA_NAME = "criteriaName";
  @SerializedName(SERIALIZED_NAME_CRITERIA_NAME)
  private String criteriaName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumaggregateRequestCriteriaSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALL_INCLUDED_REQUEST_CRITERIA = "allIncludedRequestCriteria";
  @SerializedName(SERIALIZED_NAME_ALL_INCLUDED_REQUEST_CRITERIA)
  private List<String> allIncludedRequestCriteria = null;

  public static final String SERIALIZED_NAME_ANY_INCLUDED_REQUEST_CRITERIA = "anyIncludedRequestCriteria";
  @SerializedName(SERIALIZED_NAME_ANY_INCLUDED_REQUEST_CRITERIA)
  private List<String> anyIncludedRequestCriteria = null;

  public static final String SERIALIZED_NAME_NOT_ALL_INCLUDED_REQUEST_CRITERIA = "notAllIncludedRequestCriteria";
  @SerializedName(SERIALIZED_NAME_NOT_ALL_INCLUDED_REQUEST_CRITERIA)
  private List<String> notAllIncludedRequestCriteria = null;

  public static final String SERIALIZED_NAME_NONE_INCLUDED_REQUEST_CRITERIA = "noneIncludedRequestCriteria";
  @SerializedName(SERIALIZED_NAME_NONE_INCLUDED_REQUEST_CRITERIA)
  private List<String> noneIncludedRequestCriteria = null;

  public AddAggregateRequestCriteriaRequest() {
  }

  public AddAggregateRequestCriteriaRequest criteriaName(String criteriaName) {
    
    
    
    
    this.criteriaName = criteriaName;
    return this;
  }

   /**
   * Name of the new Request Criteria
   * @return criteriaName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the new Request Criteria")

  public String getCriteriaName() {
    return criteriaName;
  }


  public void setCriteriaName(String criteriaName) {
    
    
    
    this.criteriaName = criteriaName;
  }


  public AddAggregateRequestCriteriaRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Request Criteria
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Request Criteria")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AddAggregateRequestCriteriaRequest schemas(List<EnumaggregateRequestCriteriaSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddAggregateRequestCriteriaRequest addSchemasItem(EnumaggregateRequestCriteriaSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumaggregateRequestCriteriaSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumaggregateRequestCriteriaSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddAggregateRequestCriteriaRequest allIncludedRequestCriteria(List<String> allIncludedRequestCriteria) {
    
    
    
    
    this.allIncludedRequestCriteria = allIncludedRequestCriteria;
    return this;
  }

  public AddAggregateRequestCriteriaRequest addAllIncludedRequestCriteriaItem(String allIncludedRequestCriteriaItem) {
    if (this.allIncludedRequestCriteria == null) {
      this.allIncludedRequestCriteria = new ArrayList<>();
    }
    this.allIncludedRequestCriteria.add(allIncludedRequestCriteriaItem);
    return this;
  }

   /**
   * Specifies a request criteria object that must match the associated operation request in order to match the aggregate request criteria. If one or more all-included request criteria objects are provided, then an operation request must match all of them in order to match the aggregate request criteria.
   * @return allIncludedRequestCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a request criteria object that must match the associated operation request in order to match the aggregate request criteria. If one or more all-included request criteria objects are provided, then an operation request must match all of them in order to match the aggregate request criteria.")

  public List<String> getAllIncludedRequestCriteria() {
    return allIncludedRequestCriteria;
  }


  public void setAllIncludedRequestCriteria(List<String> allIncludedRequestCriteria) {
    
    
    
    this.allIncludedRequestCriteria = allIncludedRequestCriteria;
  }


  public AddAggregateRequestCriteriaRequest anyIncludedRequestCriteria(List<String> anyIncludedRequestCriteria) {
    
    
    
    
    this.anyIncludedRequestCriteria = anyIncludedRequestCriteria;
    return this;
  }

  public AddAggregateRequestCriteriaRequest addAnyIncludedRequestCriteriaItem(String anyIncludedRequestCriteriaItem) {
    if (this.anyIncludedRequestCriteria == null) {
      this.anyIncludedRequestCriteria = new ArrayList<>();
    }
    this.anyIncludedRequestCriteria.add(anyIncludedRequestCriteriaItem);
    return this;
  }

   /**
   * Specifies a request criteria object that may match the associated operation request in order to the this aggregate request criteria. If one or more any-included request criteria objects are provided, then an operation request must match at least one of them in order to match the aggregate request criteria.
   * @return anyIncludedRequestCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a request criteria object that may match the associated operation request in order to the this aggregate request criteria. If one or more any-included request criteria objects are provided, then an operation request must match at least one of them in order to match the aggregate request criteria.")

  public List<String> getAnyIncludedRequestCriteria() {
    return anyIncludedRequestCriteria;
  }


  public void setAnyIncludedRequestCriteria(List<String> anyIncludedRequestCriteria) {
    
    
    
    this.anyIncludedRequestCriteria = anyIncludedRequestCriteria;
  }


  public AddAggregateRequestCriteriaRequest notAllIncludedRequestCriteria(List<String> notAllIncludedRequestCriteria) {
    
    
    
    
    this.notAllIncludedRequestCriteria = notAllIncludedRequestCriteria;
    return this;
  }

  public AddAggregateRequestCriteriaRequest addNotAllIncludedRequestCriteriaItem(String notAllIncludedRequestCriteriaItem) {
    if (this.notAllIncludedRequestCriteria == null) {
      this.notAllIncludedRequestCriteria = new ArrayList<>();
    }
    this.notAllIncludedRequestCriteria.add(notAllIncludedRequestCriteriaItem);
    return this;
  }

   /**
   * Specifies a request criteria object that should not match the associated operation request in order to match the aggregate request criteria. If one or more not-all-included request criteria objects are provided, then an operation request must not match all of them (that is, it may match zero or more of them, but it must not match all of them) in order to match the aggregate request criteria.
   * @return notAllIncludedRequestCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a request criteria object that should not match the associated operation request in order to match the aggregate request criteria. If one or more not-all-included request criteria objects are provided, then an operation request must not match all of them (that is, it may match zero or more of them, but it must not match all of them) in order to match the aggregate request criteria.")

  public List<String> getNotAllIncludedRequestCriteria() {
    return notAllIncludedRequestCriteria;
  }


  public void setNotAllIncludedRequestCriteria(List<String> notAllIncludedRequestCriteria) {
    
    
    
    this.notAllIncludedRequestCriteria = notAllIncludedRequestCriteria;
  }


  public AddAggregateRequestCriteriaRequest noneIncludedRequestCriteria(List<String> noneIncludedRequestCriteria) {
    
    
    
    
    this.noneIncludedRequestCriteria = noneIncludedRequestCriteria;
    return this;
  }

  public AddAggregateRequestCriteriaRequest addNoneIncludedRequestCriteriaItem(String noneIncludedRequestCriteriaItem) {
    if (this.noneIncludedRequestCriteria == null) {
      this.noneIncludedRequestCriteria = new ArrayList<>();
    }
    this.noneIncludedRequestCriteria.add(noneIncludedRequestCriteriaItem);
    return this;
  }

   /**
   * Specifies a request criteria object that must not match the associated operation request in order to match the aggregate request criteria. If one or more none-included request criteria objects are provided, then an operation request must not match any of them in order to match the aggregate request criteria.
   * @return noneIncludedRequestCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a request criteria object that must not match the associated operation request in order to match the aggregate request criteria. If one or more none-included request criteria objects are provided, then an operation request must not match any of them in order to match the aggregate request criteria.")

  public List<String> getNoneIncludedRequestCriteria() {
    return noneIncludedRequestCriteria;
  }


  public void setNoneIncludedRequestCriteria(List<String> noneIncludedRequestCriteria) {
    
    
    
    this.noneIncludedRequestCriteria = noneIncludedRequestCriteria;
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
   * @return the AddAggregateRequestCriteriaRequest instance itself
   */
  public AddAggregateRequestCriteriaRequest putAdditionalProperty(String key, Object value) {
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
    AddAggregateRequestCriteriaRequest addAggregateRequestCriteriaRequest = (AddAggregateRequestCriteriaRequest) o;
    return Objects.equals(this.criteriaName, addAggregateRequestCriteriaRequest.criteriaName) &&
        Objects.equals(this.description, addAggregateRequestCriteriaRequest.description) &&
        Objects.equals(this.schemas, addAggregateRequestCriteriaRequest.schemas) &&
        Objects.equals(this.allIncludedRequestCriteria, addAggregateRequestCriteriaRequest.allIncludedRequestCriteria) &&
        Objects.equals(this.anyIncludedRequestCriteria, addAggregateRequestCriteriaRequest.anyIncludedRequestCriteria) &&
        Objects.equals(this.notAllIncludedRequestCriteria, addAggregateRequestCriteriaRequest.notAllIncludedRequestCriteria) &&
        Objects.equals(this.noneIncludedRequestCriteria, addAggregateRequestCriteriaRequest.noneIncludedRequestCriteria)&&
        Objects.equals(this.additionalProperties, addAggregateRequestCriteriaRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteriaName, description, schemas, allIncludedRequestCriteria, anyIncludedRequestCriteria, notAllIncludedRequestCriteria, noneIncludedRequestCriteria, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddAggregateRequestCriteriaRequest {\n");
    sb.append("    criteriaName: ").append(toIndentedString(criteriaName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    allIncludedRequestCriteria: ").append(toIndentedString(allIncludedRequestCriteria)).append("\n");
    sb.append("    anyIncludedRequestCriteria: ").append(toIndentedString(anyIncludedRequestCriteria)).append("\n");
    sb.append("    notAllIncludedRequestCriteria: ").append(toIndentedString(notAllIncludedRequestCriteria)).append("\n");
    sb.append("    noneIncludedRequestCriteria: ").append(toIndentedString(noneIncludedRequestCriteria)).append("\n");
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
    openapiFields.add("allIncludedRequestCriteria");
    openapiFields.add("anyIncludedRequestCriteria");
    openapiFields.add("notAllIncludedRequestCriteria");
    openapiFields.add("noneIncludedRequestCriteria");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("criteriaName");
    openapiRequiredFields.add("schemas");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddAggregateRequestCriteriaRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddAggregateRequestCriteriaRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddAggregateRequestCriteriaRequest is not found in the empty JSON string", AddAggregateRequestCriteriaRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddAggregateRequestCriteriaRequest.openapiRequiredFields) {
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
      if (jsonObj.get("allIncludedRequestCriteria") != null && !jsonObj.get("allIncludedRequestCriteria").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allIncludedRequestCriteria` to be an array in the JSON string but got `%s`", jsonObj.get("allIncludedRequestCriteria").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("anyIncludedRequestCriteria") != null && !jsonObj.get("anyIncludedRequestCriteria").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `anyIncludedRequestCriteria` to be an array in the JSON string but got `%s`", jsonObj.get("anyIncludedRequestCriteria").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("notAllIncludedRequestCriteria") != null && !jsonObj.get("notAllIncludedRequestCriteria").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `notAllIncludedRequestCriteria` to be an array in the JSON string but got `%s`", jsonObj.get("notAllIncludedRequestCriteria").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("noneIncludedRequestCriteria") != null && !jsonObj.get("noneIncludedRequestCriteria").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `noneIncludedRequestCriteria` to be an array in the JSON string but got `%s`", jsonObj.get("noneIncludedRequestCriteria").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddAggregateRequestCriteriaRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddAggregateRequestCriteriaRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddAggregateRequestCriteriaRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddAggregateRequestCriteriaRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddAggregateRequestCriteriaRequest>() {
           @Override
           public void write(JsonWriter out, AddAggregateRequestCriteriaRequest value) throws IOException {
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
           public AddAggregateRequestCriteriaRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddAggregateRequestCriteriaRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddAggregateRequestCriteriaRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddAggregateRequestCriteriaRequest
  * @throws IOException if the JSON string is invalid with respect to AddAggregateRequestCriteriaRequest
  */
  public static AddAggregateRequestCriteriaRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddAggregateRequestCriteriaRequest.class);
  }

 /**
  * Convert an instance of AddAggregateRequestCriteriaRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

