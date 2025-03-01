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
import com.konfigthis.client.model.EnumsuccessfulBindResultCriteriaSchemaUrn;
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
 * AddSuccessfulBindResultCriteriaRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddSuccessfulBindResultCriteriaRequest {
  public static final String SERIALIZED_NAME_CRITERIA_NAME = "criteriaName";
  @SerializedName(SERIALIZED_NAME_CRITERIA_NAME)
  private String criteriaName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumsuccessfulBindResultCriteriaSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_CRITERIA = "requestCriteria";
  @SerializedName(SERIALIZED_NAME_REQUEST_CRITERIA)
  private String requestCriteria;

  public static final String SERIALIZED_NAME_INCLUDE_ANONYMOUS_BINDS = "includeAnonymousBinds";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ANONYMOUS_BINDS)
  private Boolean includeAnonymousBinds;

  public static final String SERIALIZED_NAME_INCLUDED_USER_BASE_D_N = "includedUserBaseDN";
  @SerializedName(SERIALIZED_NAME_INCLUDED_USER_BASE_D_N)
  private List<String> includedUserBaseDN = null;

  public static final String SERIALIZED_NAME_EXCLUDED_USER_BASE_D_N = "excludedUserBaseDN";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_USER_BASE_D_N)
  private List<String> excludedUserBaseDN = null;

  public static final String SERIALIZED_NAME_INCLUDED_USER_FILTER = "includedUserFilter";
  @SerializedName(SERIALIZED_NAME_INCLUDED_USER_FILTER)
  private List<String> includedUserFilter = null;

  public static final String SERIALIZED_NAME_EXCLUDED_USER_FILTER = "excludedUserFilter";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_USER_FILTER)
  private List<String> excludedUserFilter = null;

  public static final String SERIALIZED_NAME_INCLUDED_USER_GROUP_D_N = "includedUserGroupDN";
  @SerializedName(SERIALIZED_NAME_INCLUDED_USER_GROUP_D_N)
  private List<String> includedUserGroupDN = null;

  public static final String SERIALIZED_NAME_EXCLUDED_USER_GROUP_D_N = "excludedUserGroupDN";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_USER_GROUP_D_N)
  private List<String> excludedUserGroupDN = null;

  public AddSuccessfulBindResultCriteriaRequest() {
  }

  public AddSuccessfulBindResultCriteriaRequest criteriaName(String criteriaName) {
    
    
    
    
    this.criteriaName = criteriaName;
    return this;
  }

   /**
   * Name of the new Result Criteria
   * @return criteriaName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the new Result Criteria")

  public String getCriteriaName() {
    return criteriaName;
  }


  public void setCriteriaName(String criteriaName) {
    
    
    
    this.criteriaName = criteriaName;
  }


  public AddSuccessfulBindResultCriteriaRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Result Criteria
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Result Criteria")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AddSuccessfulBindResultCriteriaRequest schemas(List<EnumsuccessfulBindResultCriteriaSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddSuccessfulBindResultCriteriaRequest addSchemasItem(EnumsuccessfulBindResultCriteriaSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumsuccessfulBindResultCriteriaSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumsuccessfulBindResultCriteriaSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddSuccessfulBindResultCriteriaRequest requestCriteria(String requestCriteria) {
    
    
    
    
    this.requestCriteria = requestCriteria;
    return this;
  }

   /**
   * Specifies a request criteria object that must match the associated request for operations included in this Successful Bind Result Criteria.
   * @return requestCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a request criteria object that must match the associated request for operations included in this Successful Bind Result Criteria.")

  public String getRequestCriteria() {
    return requestCriteria;
  }


  public void setRequestCriteria(String requestCriteria) {
    
    
    
    this.requestCriteria = requestCriteria;
  }


  public AddSuccessfulBindResultCriteriaRequest includeAnonymousBinds(Boolean includeAnonymousBinds) {
    
    
    
    
    this.includeAnonymousBinds = includeAnonymousBinds;
    return this;
  }

   /**
   * Indicates whether this criteria will be permitted to match bind operations that resulted in anonymous authentication.
   * @return includeAnonymousBinds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether this criteria will be permitted to match bind operations that resulted in anonymous authentication.")

  public Boolean getIncludeAnonymousBinds() {
    return includeAnonymousBinds;
  }


  public void setIncludeAnonymousBinds(Boolean includeAnonymousBinds) {
    
    
    
    this.includeAnonymousBinds = includeAnonymousBinds;
  }


  public AddSuccessfulBindResultCriteriaRequest includedUserBaseDN(List<String> includedUserBaseDN) {
    
    
    
    
    this.includedUserBaseDN = includedUserBaseDN;
    return this;
  }

  public AddSuccessfulBindResultCriteriaRequest addIncludedUserBaseDNItem(String includedUserBaseDNItem) {
    if (this.includedUserBaseDN == null) {
      this.includedUserBaseDN = new ArrayList<>();
    }
    this.includedUserBaseDN.add(includedUserBaseDNItem);
    return this;
  }

   /**
   * A set of base DNs for authenticated users that will be permitted to match this criteria.
   * @return includedUserBaseDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A set of base DNs for authenticated users that will be permitted to match this criteria.")

  public List<String> getIncludedUserBaseDN() {
    return includedUserBaseDN;
  }


  public void setIncludedUserBaseDN(List<String> includedUserBaseDN) {
    
    
    
    this.includedUserBaseDN = includedUserBaseDN;
  }


  public AddSuccessfulBindResultCriteriaRequest excludedUserBaseDN(List<String> excludedUserBaseDN) {
    
    
    
    
    this.excludedUserBaseDN = excludedUserBaseDN;
    return this;
  }

  public AddSuccessfulBindResultCriteriaRequest addExcludedUserBaseDNItem(String excludedUserBaseDNItem) {
    if (this.excludedUserBaseDN == null) {
      this.excludedUserBaseDN = new ArrayList<>();
    }
    this.excludedUserBaseDN.add(excludedUserBaseDNItem);
    return this;
  }

   /**
   * A set of base DNs for authenticated users that will not be permitted to match this criteria.
   * @return excludedUserBaseDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A set of base DNs for authenticated users that will not be permitted to match this criteria.")

  public List<String> getExcludedUserBaseDN() {
    return excludedUserBaseDN;
  }


  public void setExcludedUserBaseDN(List<String> excludedUserBaseDN) {
    
    
    
    this.excludedUserBaseDN = excludedUserBaseDN;
  }


  public AddSuccessfulBindResultCriteriaRequest includedUserFilter(List<String> includedUserFilter) {
    
    
    
    
    this.includedUserFilter = includedUserFilter;
    return this;
  }

  public AddSuccessfulBindResultCriteriaRequest addIncludedUserFilterItem(String includedUserFilterItem) {
    if (this.includedUserFilter == null) {
      this.includedUserFilter = new ArrayList<>();
    }
    this.includedUserFilter.add(includedUserFilterItem);
    return this;
  }

   /**
   * A set of filters that may be used to identify entries for authenticated users that will be permitted to match this criteria.
   * @return includedUserFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A set of filters that may be used to identify entries for authenticated users that will be permitted to match this criteria.")

  public List<String> getIncludedUserFilter() {
    return includedUserFilter;
  }


  public void setIncludedUserFilter(List<String> includedUserFilter) {
    
    
    
    this.includedUserFilter = includedUserFilter;
  }


  public AddSuccessfulBindResultCriteriaRequest excludedUserFilter(List<String> excludedUserFilter) {
    
    
    
    
    this.excludedUserFilter = excludedUserFilter;
    return this;
  }

  public AddSuccessfulBindResultCriteriaRequest addExcludedUserFilterItem(String excludedUserFilterItem) {
    if (this.excludedUserFilter == null) {
      this.excludedUserFilter = new ArrayList<>();
    }
    this.excludedUserFilter.add(excludedUserFilterItem);
    return this;
  }

   /**
   * A set of filters that may be used to identify entries for authenticated users that will not be permitted to match this criteria.
   * @return excludedUserFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A set of filters that may be used to identify entries for authenticated users that will not be permitted to match this criteria.")

  public List<String> getExcludedUserFilter() {
    return excludedUserFilter;
  }


  public void setExcludedUserFilter(List<String> excludedUserFilter) {
    
    
    
    this.excludedUserFilter = excludedUserFilter;
  }


  public AddSuccessfulBindResultCriteriaRequest includedUserGroupDN(List<String> includedUserGroupDN) {
    
    
    
    
    this.includedUserGroupDN = includedUserGroupDN;
    return this;
  }

  public AddSuccessfulBindResultCriteriaRequest addIncludedUserGroupDNItem(String includedUserGroupDNItem) {
    if (this.includedUserGroupDN == null) {
      this.includedUserGroupDN = new ArrayList<>();
    }
    this.includedUserGroupDN.add(includedUserGroupDNItem);
    return this;
  }

   /**
   * The DNs of the groups whose members will be permitted to match this criteria.
   * @return includedUserGroupDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The DNs of the groups whose members will be permitted to match this criteria.")

  public List<String> getIncludedUserGroupDN() {
    return includedUserGroupDN;
  }


  public void setIncludedUserGroupDN(List<String> includedUserGroupDN) {
    
    
    
    this.includedUserGroupDN = includedUserGroupDN;
  }


  public AddSuccessfulBindResultCriteriaRequest excludedUserGroupDN(List<String> excludedUserGroupDN) {
    
    
    
    
    this.excludedUserGroupDN = excludedUserGroupDN;
    return this;
  }

  public AddSuccessfulBindResultCriteriaRequest addExcludedUserGroupDNItem(String excludedUserGroupDNItem) {
    if (this.excludedUserGroupDN == null) {
      this.excludedUserGroupDN = new ArrayList<>();
    }
    this.excludedUserGroupDN.add(excludedUserGroupDNItem);
    return this;
  }

   /**
   * The DNs of the groups whose members will not be permitted to match this criteria.
   * @return excludedUserGroupDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The DNs of the groups whose members will not be permitted to match this criteria.")

  public List<String> getExcludedUserGroupDN() {
    return excludedUserGroupDN;
  }


  public void setExcludedUserGroupDN(List<String> excludedUserGroupDN) {
    
    
    
    this.excludedUserGroupDN = excludedUserGroupDN;
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
   * @return the AddSuccessfulBindResultCriteriaRequest instance itself
   */
  public AddSuccessfulBindResultCriteriaRequest putAdditionalProperty(String key, Object value) {
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
    AddSuccessfulBindResultCriteriaRequest addSuccessfulBindResultCriteriaRequest = (AddSuccessfulBindResultCriteriaRequest) o;
    return Objects.equals(this.criteriaName, addSuccessfulBindResultCriteriaRequest.criteriaName) &&
        Objects.equals(this.description, addSuccessfulBindResultCriteriaRequest.description) &&
        Objects.equals(this.schemas, addSuccessfulBindResultCriteriaRequest.schemas) &&
        Objects.equals(this.requestCriteria, addSuccessfulBindResultCriteriaRequest.requestCriteria) &&
        Objects.equals(this.includeAnonymousBinds, addSuccessfulBindResultCriteriaRequest.includeAnonymousBinds) &&
        Objects.equals(this.includedUserBaseDN, addSuccessfulBindResultCriteriaRequest.includedUserBaseDN) &&
        Objects.equals(this.excludedUserBaseDN, addSuccessfulBindResultCriteriaRequest.excludedUserBaseDN) &&
        Objects.equals(this.includedUserFilter, addSuccessfulBindResultCriteriaRequest.includedUserFilter) &&
        Objects.equals(this.excludedUserFilter, addSuccessfulBindResultCriteriaRequest.excludedUserFilter) &&
        Objects.equals(this.includedUserGroupDN, addSuccessfulBindResultCriteriaRequest.includedUserGroupDN) &&
        Objects.equals(this.excludedUserGroupDN, addSuccessfulBindResultCriteriaRequest.excludedUserGroupDN)&&
        Objects.equals(this.additionalProperties, addSuccessfulBindResultCriteriaRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteriaName, description, schemas, requestCriteria, includeAnonymousBinds, includedUserBaseDN, excludedUserBaseDN, includedUserFilter, excludedUserFilter, includedUserGroupDN, excludedUserGroupDN, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddSuccessfulBindResultCriteriaRequest {\n");
    sb.append("    criteriaName: ").append(toIndentedString(criteriaName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    requestCriteria: ").append(toIndentedString(requestCriteria)).append("\n");
    sb.append("    includeAnonymousBinds: ").append(toIndentedString(includeAnonymousBinds)).append("\n");
    sb.append("    includedUserBaseDN: ").append(toIndentedString(includedUserBaseDN)).append("\n");
    sb.append("    excludedUserBaseDN: ").append(toIndentedString(excludedUserBaseDN)).append("\n");
    sb.append("    includedUserFilter: ").append(toIndentedString(includedUserFilter)).append("\n");
    sb.append("    excludedUserFilter: ").append(toIndentedString(excludedUserFilter)).append("\n");
    sb.append("    includedUserGroupDN: ").append(toIndentedString(includedUserGroupDN)).append("\n");
    sb.append("    excludedUserGroupDN: ").append(toIndentedString(excludedUserGroupDN)).append("\n");
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
    openapiFields.add("requestCriteria");
    openapiFields.add("includeAnonymousBinds");
    openapiFields.add("includedUserBaseDN");
    openapiFields.add("excludedUserBaseDN");
    openapiFields.add("includedUserFilter");
    openapiFields.add("excludedUserFilter");
    openapiFields.add("includedUserGroupDN");
    openapiFields.add("excludedUserGroupDN");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("criteriaName");
    openapiRequiredFields.add("schemas");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddSuccessfulBindResultCriteriaRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddSuccessfulBindResultCriteriaRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddSuccessfulBindResultCriteriaRequest is not found in the empty JSON string", AddSuccessfulBindResultCriteriaRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddSuccessfulBindResultCriteriaRequest.openapiRequiredFields) {
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
      if ((jsonObj.get("requestCriteria") != null && !jsonObj.get("requestCriteria").isJsonNull()) && !jsonObj.get("requestCriteria").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestCriteria` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestCriteria").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("includedUserBaseDN") != null && !jsonObj.get("includedUserBaseDN").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includedUserBaseDN` to be an array in the JSON string but got `%s`", jsonObj.get("includedUserBaseDN").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("excludedUserBaseDN") != null && !jsonObj.get("excludedUserBaseDN").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludedUserBaseDN` to be an array in the JSON string but got `%s`", jsonObj.get("excludedUserBaseDN").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("includedUserFilter") != null && !jsonObj.get("includedUserFilter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includedUserFilter` to be an array in the JSON string but got `%s`", jsonObj.get("includedUserFilter").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("excludedUserFilter") != null && !jsonObj.get("excludedUserFilter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludedUserFilter` to be an array in the JSON string but got `%s`", jsonObj.get("excludedUserFilter").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("includedUserGroupDN") != null && !jsonObj.get("includedUserGroupDN").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includedUserGroupDN` to be an array in the JSON string but got `%s`", jsonObj.get("includedUserGroupDN").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("excludedUserGroupDN") != null && !jsonObj.get("excludedUserGroupDN").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludedUserGroupDN` to be an array in the JSON string but got `%s`", jsonObj.get("excludedUserGroupDN").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddSuccessfulBindResultCriteriaRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddSuccessfulBindResultCriteriaRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddSuccessfulBindResultCriteriaRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddSuccessfulBindResultCriteriaRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddSuccessfulBindResultCriteriaRequest>() {
           @Override
           public void write(JsonWriter out, AddSuccessfulBindResultCriteriaRequest value) throws IOException {
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
           public AddSuccessfulBindResultCriteriaRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddSuccessfulBindResultCriteriaRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddSuccessfulBindResultCriteriaRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddSuccessfulBindResultCriteriaRequest
  * @throws IOException if the JSON string is invalid with respect to AddSuccessfulBindResultCriteriaRequest
  */
  public static AddSuccessfulBindResultCriteriaRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddSuccessfulBindResultCriteriaRequest.class);
  }

 /**
  * Convert an instance of AddSuccessfulBindResultCriteriaRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

