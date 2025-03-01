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
import com.konfigthis.client.model.EnumsimpleSearchReferenceCriteriaSchemaUrn;
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
 * SimpleSearchReferenceCriteriaShared
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SimpleSearchReferenceCriteriaShared {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumsimpleSearchReferenceCriteriaSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_CRITERIA = "requestCriteria";
  @SerializedName(SERIALIZED_NAME_REQUEST_CRITERIA)
  private String requestCriteria;

  public static final String SERIALIZED_NAME_ALL_INCLUDED_REFERENCE_CONTROL = "allIncludedReferenceControl";
  @SerializedName(SERIALIZED_NAME_ALL_INCLUDED_REFERENCE_CONTROL)
  private List<String> allIncludedReferenceControl = null;

  public static final String SERIALIZED_NAME_ANY_INCLUDED_REFERENCE_CONTROL = "anyIncludedReferenceControl";
  @SerializedName(SERIALIZED_NAME_ANY_INCLUDED_REFERENCE_CONTROL)
  private List<String> anyIncludedReferenceControl = null;

  public static final String SERIALIZED_NAME_NOT_ALL_INCLUDED_REFERENCE_CONTROL = "notAllIncludedReferenceControl";
  @SerializedName(SERIALIZED_NAME_NOT_ALL_INCLUDED_REFERENCE_CONTROL)
  private List<String> notAllIncludedReferenceControl = null;

  public static final String SERIALIZED_NAME_NONE_INCLUDED_REFERENCE_CONTROL = "noneIncludedReferenceControl";
  @SerializedName(SERIALIZED_NAME_NONE_INCLUDED_REFERENCE_CONTROL)
  private List<String> noneIncludedReferenceControl = null;

  public SimpleSearchReferenceCriteriaShared() {
  }

  public SimpleSearchReferenceCriteriaShared description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Search Reference Criteria
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Search Reference Criteria")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public SimpleSearchReferenceCriteriaShared schemas(List<EnumsimpleSearchReferenceCriteriaSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public SimpleSearchReferenceCriteriaShared addSchemasItem(EnumsimpleSearchReferenceCriteriaSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumsimpleSearchReferenceCriteriaSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumsimpleSearchReferenceCriteriaSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public SimpleSearchReferenceCriteriaShared requestCriteria(String requestCriteria) {
    
    
    
    
    this.requestCriteria = requestCriteria;
    return this;
  }

   /**
   * Specifies a request criteria object that must match the associated request for references included in this Simple Search Reference Criteria.
   * @return requestCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a request criteria object that must match the associated request for references included in this Simple Search Reference Criteria.")

  public String getRequestCriteria() {
    return requestCriteria;
  }


  public void setRequestCriteria(String requestCriteria) {
    
    
    
    this.requestCriteria = requestCriteria;
  }


  public SimpleSearchReferenceCriteriaShared allIncludedReferenceControl(List<String> allIncludedReferenceControl) {
    
    
    
    
    this.allIncludedReferenceControl = allIncludedReferenceControl;
    return this;
  }

  public SimpleSearchReferenceCriteriaShared addAllIncludedReferenceControlItem(String allIncludedReferenceControlItem) {
    if (this.allIncludedReferenceControl == null) {
      this.allIncludedReferenceControl = new ArrayList<>();
    }
    this.allIncludedReferenceControl.add(allIncludedReferenceControlItem);
    return this;
  }

   /**
   * Specifies the OID of a control that must be present in search result references included in this Simple Search Reference Criteria. If any control OIDs are provided, then the reference must contain all of those controls.
   * @return allIncludedReferenceControl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the OID of a control that must be present in search result references included in this Simple Search Reference Criteria. If any control OIDs are provided, then the reference must contain all of those controls.")

  public List<String> getAllIncludedReferenceControl() {
    return allIncludedReferenceControl;
  }


  public void setAllIncludedReferenceControl(List<String> allIncludedReferenceControl) {
    
    
    
    this.allIncludedReferenceControl = allIncludedReferenceControl;
  }


  public SimpleSearchReferenceCriteriaShared anyIncludedReferenceControl(List<String> anyIncludedReferenceControl) {
    
    
    
    
    this.anyIncludedReferenceControl = anyIncludedReferenceControl;
    return this;
  }

  public SimpleSearchReferenceCriteriaShared addAnyIncludedReferenceControlItem(String anyIncludedReferenceControlItem) {
    if (this.anyIncludedReferenceControl == null) {
      this.anyIncludedReferenceControl = new ArrayList<>();
    }
    this.anyIncludedReferenceControl.add(anyIncludedReferenceControlItem);
    return this;
  }

   /**
   * Specifies the OID of a control that may be present in search result references included in this Simple Search Reference Criteria. If any control OIDs are provided, then the reference must contain at least one of those controls.
   * @return anyIncludedReferenceControl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the OID of a control that may be present in search result references included in this Simple Search Reference Criteria. If any control OIDs are provided, then the reference must contain at least one of those controls.")

  public List<String> getAnyIncludedReferenceControl() {
    return anyIncludedReferenceControl;
  }


  public void setAnyIncludedReferenceControl(List<String> anyIncludedReferenceControl) {
    
    
    
    this.anyIncludedReferenceControl = anyIncludedReferenceControl;
  }


  public SimpleSearchReferenceCriteriaShared notAllIncludedReferenceControl(List<String> notAllIncludedReferenceControl) {
    
    
    
    
    this.notAllIncludedReferenceControl = notAllIncludedReferenceControl;
    return this;
  }

  public SimpleSearchReferenceCriteriaShared addNotAllIncludedReferenceControlItem(String notAllIncludedReferenceControlItem) {
    if (this.notAllIncludedReferenceControl == null) {
      this.notAllIncludedReferenceControl = new ArrayList<>();
    }
    this.notAllIncludedReferenceControl.add(notAllIncludedReferenceControlItem);
    return this;
  }

   /**
   * Specifies the OID of a control that should not be present in search result references included in this Simple Search Reference Criteria. If any control OIDs are provided, then the reference must not contain at least one of those controls (that is, it may contain zero or more of those controls, but not all of them).
   * @return notAllIncludedReferenceControl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the OID of a control that should not be present in search result references included in this Simple Search Reference Criteria. If any control OIDs are provided, then the reference must not contain at least one of those controls (that is, it may contain zero or more of those controls, but not all of them).")

  public List<String> getNotAllIncludedReferenceControl() {
    return notAllIncludedReferenceControl;
  }


  public void setNotAllIncludedReferenceControl(List<String> notAllIncludedReferenceControl) {
    
    
    
    this.notAllIncludedReferenceControl = notAllIncludedReferenceControl;
  }


  public SimpleSearchReferenceCriteriaShared noneIncludedReferenceControl(List<String> noneIncludedReferenceControl) {
    
    
    
    
    this.noneIncludedReferenceControl = noneIncludedReferenceControl;
    return this;
  }

  public SimpleSearchReferenceCriteriaShared addNoneIncludedReferenceControlItem(String noneIncludedReferenceControlItem) {
    if (this.noneIncludedReferenceControl == null) {
      this.noneIncludedReferenceControl = new ArrayList<>();
    }
    this.noneIncludedReferenceControl.add(noneIncludedReferenceControlItem);
    return this;
  }

   /**
   * Specifies the OID of a control that must not be present in search result references included in this Simple Search Reference Criteria. If any control OIDs are provided, then the reference must not contain any of those controls.
   * @return noneIncludedReferenceControl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the OID of a control that must not be present in search result references included in this Simple Search Reference Criteria. If any control OIDs are provided, then the reference must not contain any of those controls.")

  public List<String> getNoneIncludedReferenceControl() {
    return noneIncludedReferenceControl;
  }


  public void setNoneIncludedReferenceControl(List<String> noneIncludedReferenceControl) {
    
    
    
    this.noneIncludedReferenceControl = noneIncludedReferenceControl;
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
   * @return the SimpleSearchReferenceCriteriaShared instance itself
   */
  public SimpleSearchReferenceCriteriaShared putAdditionalProperty(String key, Object value) {
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
    SimpleSearchReferenceCriteriaShared simpleSearchReferenceCriteriaShared = (SimpleSearchReferenceCriteriaShared) o;
    return Objects.equals(this.description, simpleSearchReferenceCriteriaShared.description) &&
        Objects.equals(this.schemas, simpleSearchReferenceCriteriaShared.schemas) &&
        Objects.equals(this.requestCriteria, simpleSearchReferenceCriteriaShared.requestCriteria) &&
        Objects.equals(this.allIncludedReferenceControl, simpleSearchReferenceCriteriaShared.allIncludedReferenceControl) &&
        Objects.equals(this.anyIncludedReferenceControl, simpleSearchReferenceCriteriaShared.anyIncludedReferenceControl) &&
        Objects.equals(this.notAllIncludedReferenceControl, simpleSearchReferenceCriteriaShared.notAllIncludedReferenceControl) &&
        Objects.equals(this.noneIncludedReferenceControl, simpleSearchReferenceCriteriaShared.noneIncludedReferenceControl)&&
        Objects.equals(this.additionalProperties, simpleSearchReferenceCriteriaShared.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, requestCriteria, allIncludedReferenceControl, anyIncludedReferenceControl, notAllIncludedReferenceControl, noneIncludedReferenceControl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleSearchReferenceCriteriaShared {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    requestCriteria: ").append(toIndentedString(requestCriteria)).append("\n");
    sb.append("    allIncludedReferenceControl: ").append(toIndentedString(allIncludedReferenceControl)).append("\n");
    sb.append("    anyIncludedReferenceControl: ").append(toIndentedString(anyIncludedReferenceControl)).append("\n");
    sb.append("    notAllIncludedReferenceControl: ").append(toIndentedString(notAllIncludedReferenceControl)).append("\n");
    sb.append("    noneIncludedReferenceControl: ").append(toIndentedString(noneIncludedReferenceControl)).append("\n");
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
    openapiFields.add("requestCriteria");
    openapiFields.add("allIncludedReferenceControl");
    openapiFields.add("anyIncludedReferenceControl");
    openapiFields.add("notAllIncludedReferenceControl");
    openapiFields.add("noneIncludedReferenceControl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemas");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SimpleSearchReferenceCriteriaShared
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SimpleSearchReferenceCriteriaShared.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimpleSearchReferenceCriteriaShared is not found in the empty JSON string", SimpleSearchReferenceCriteriaShared.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SimpleSearchReferenceCriteriaShared.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
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
      if (jsonObj.get("allIncludedReferenceControl") != null && !jsonObj.get("allIncludedReferenceControl").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allIncludedReferenceControl` to be an array in the JSON string but got `%s`", jsonObj.get("allIncludedReferenceControl").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("anyIncludedReferenceControl") != null && !jsonObj.get("anyIncludedReferenceControl").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `anyIncludedReferenceControl` to be an array in the JSON string but got `%s`", jsonObj.get("anyIncludedReferenceControl").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("notAllIncludedReferenceControl") != null && !jsonObj.get("notAllIncludedReferenceControl").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `notAllIncludedReferenceControl` to be an array in the JSON string but got `%s`", jsonObj.get("notAllIncludedReferenceControl").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("noneIncludedReferenceControl") != null && !jsonObj.get("noneIncludedReferenceControl").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `noneIncludedReferenceControl` to be an array in the JSON string but got `%s`", jsonObj.get("noneIncludedReferenceControl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimpleSearchReferenceCriteriaShared.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimpleSearchReferenceCriteriaShared' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimpleSearchReferenceCriteriaShared> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimpleSearchReferenceCriteriaShared.class));

       return (TypeAdapter<T>) new TypeAdapter<SimpleSearchReferenceCriteriaShared>() {
           @Override
           public void write(JsonWriter out, SimpleSearchReferenceCriteriaShared value) throws IOException {
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
           public SimpleSearchReferenceCriteriaShared read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SimpleSearchReferenceCriteriaShared instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SimpleSearchReferenceCriteriaShared given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimpleSearchReferenceCriteriaShared
  * @throws IOException if the JSON string is invalid with respect to SimpleSearchReferenceCriteriaShared
  */
  public static SimpleSearchReferenceCriteriaShared fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimpleSearchReferenceCriteriaShared.class);
  }

 /**
  * Convert an instance of SimpleSearchReferenceCriteriaShared to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

