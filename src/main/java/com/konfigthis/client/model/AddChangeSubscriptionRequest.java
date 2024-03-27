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
import com.konfigthis.client.model.EnumchangeSubscriptionSchemaUrn;
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
 * AddChangeSubscriptionRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddChangeSubscriptionRequest {
  public static final String SERIALIZED_NAME_SUBSCRIPTION_NAME = "subscriptionName";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_NAME)
  private String subscriptionName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumchangeSubscriptionSchemaUrn> schemas = null;

  public static final String SERIALIZED_NAME_CONNECTION_CRITERIA = "connectionCriteria";
  @SerializedName(SERIALIZED_NAME_CONNECTION_CRITERIA)
  private String connectionCriteria;

  public static final String SERIALIZED_NAME_REQUEST_CRITERIA = "requestCriteria";
  @SerializedName(SERIALIZED_NAME_REQUEST_CRITERIA)
  private String requestCriteria;

  public static final String SERIALIZED_NAME_RESULT_CRITERIA = "resultCriteria";
  @SerializedName(SERIALIZED_NAME_RESULT_CRITERIA)
  private String resultCriteria;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME = "expirationTime";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME)
  private String expirationTime;

  public AddChangeSubscriptionRequest() {
  }

  public AddChangeSubscriptionRequest subscriptionName(String subscriptionName) {
    
    
    
    
    this.subscriptionName = subscriptionName;
    return this;
  }

   /**
   * Name of the new Change Subscription
   * @return subscriptionName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the new Change Subscription")

  public String getSubscriptionName() {
    return subscriptionName;
  }


  public void setSubscriptionName(String subscriptionName) {
    
    
    
    this.subscriptionName = subscriptionName;
  }


  public AddChangeSubscriptionRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Change Subscription
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Change Subscription")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AddChangeSubscriptionRequest schemas(List<EnumchangeSubscriptionSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddChangeSubscriptionRequest addSchemasItem(EnumchangeSubscriptionSchemaUrn schemasItem) {
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

  public List<EnumchangeSubscriptionSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumchangeSubscriptionSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddChangeSubscriptionRequest connectionCriteria(String connectionCriteria) {
    
    
    
    
    this.connectionCriteria = connectionCriteria;
    return this;
  }

   /**
   * Specifies a set of connection criteria that must match the client connection associated with an operation in order for that operation to be processed by a change subscription handler.
   * @return connectionCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a set of connection criteria that must match the client connection associated with an operation in order for that operation to be processed by a change subscription handler.")

  public String getConnectionCriteria() {
    return connectionCriteria;
  }


  public void setConnectionCriteria(String connectionCriteria) {
    
    
    
    this.connectionCriteria = connectionCriteria;
  }


  public AddChangeSubscriptionRequest requestCriteria(String requestCriteria) {
    
    
    
    
    this.requestCriteria = requestCriteria;
    return this;
  }

   /**
   * Specifies a set of request criteria that must match the request associated with an operation in order for that operation to be processed by a change subscription handler.
   * @return requestCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a set of request criteria that must match the request associated with an operation in order for that operation to be processed by a change subscription handler.")

  public String getRequestCriteria() {
    return requestCriteria;
  }


  public void setRequestCriteria(String requestCriteria) {
    
    
    
    this.requestCriteria = requestCriteria;
  }


  public AddChangeSubscriptionRequest resultCriteria(String resultCriteria) {
    
    
    
    
    this.resultCriteria = resultCriteria;
    return this;
  }

   /**
   * Specifies a set of result criteria that must match the result associated with an operation in order for that operation to be processed by a change subscription handler.
   * @return resultCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a set of result criteria that must match the result associated with an operation in order for that operation to be processed by a change subscription handler.")

  public String getResultCriteria() {
    return resultCriteria;
  }


  public void setResultCriteria(String resultCriteria) {
    
    
    
    this.resultCriteria = resultCriteria;
  }


  public AddChangeSubscriptionRequest expirationTime(String expirationTime) {
    
    
    
    
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * Specifies a timestamp that provides an expiration time for this change subscription. If an expiration time is provided, then the change subscription will not be active after that time has passed.
   * @return expirationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a timestamp that provides an expiration time for this change subscription. If an expiration time is provided, then the change subscription will not be active after that time has passed.")

  public String getExpirationTime() {
    return expirationTime;
  }


  public void setExpirationTime(String expirationTime) {
    
    
    
    this.expirationTime = expirationTime;
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
   * @return the AddChangeSubscriptionRequest instance itself
   */
  public AddChangeSubscriptionRequest putAdditionalProperty(String key, Object value) {
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
    AddChangeSubscriptionRequest addChangeSubscriptionRequest = (AddChangeSubscriptionRequest) o;
    return Objects.equals(this.subscriptionName, addChangeSubscriptionRequest.subscriptionName) &&
        Objects.equals(this.description, addChangeSubscriptionRequest.description) &&
        Objects.equals(this.schemas, addChangeSubscriptionRequest.schemas) &&
        Objects.equals(this.connectionCriteria, addChangeSubscriptionRequest.connectionCriteria) &&
        Objects.equals(this.requestCriteria, addChangeSubscriptionRequest.requestCriteria) &&
        Objects.equals(this.resultCriteria, addChangeSubscriptionRequest.resultCriteria) &&
        Objects.equals(this.expirationTime, addChangeSubscriptionRequest.expirationTime)&&
        Objects.equals(this.additionalProperties, addChangeSubscriptionRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionName, description, schemas, connectionCriteria, requestCriteria, resultCriteria, expirationTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddChangeSubscriptionRequest {\n");
    sb.append("    subscriptionName: ").append(toIndentedString(subscriptionName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    connectionCriteria: ").append(toIndentedString(connectionCriteria)).append("\n");
    sb.append("    requestCriteria: ").append(toIndentedString(requestCriteria)).append("\n");
    sb.append("    resultCriteria: ").append(toIndentedString(resultCriteria)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
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
    openapiFields.add("subscriptionName");
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("connectionCriteria");
    openapiFields.add("requestCriteria");
    openapiFields.add("resultCriteria");
    openapiFields.add("expirationTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("subscriptionName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddChangeSubscriptionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddChangeSubscriptionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddChangeSubscriptionRequest is not found in the empty JSON string", AddChangeSubscriptionRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddChangeSubscriptionRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("subscriptionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptionName").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("schemas") != null && !jsonObj.get("schemas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemas` to be an array in the JSON string but got `%s`", jsonObj.get("schemas").toString()));
      }
      if ((jsonObj.get("connectionCriteria") != null && !jsonObj.get("connectionCriteria").isJsonNull()) && !jsonObj.get("connectionCriteria").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connectionCriteria` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connectionCriteria").toString()));
      }
      if ((jsonObj.get("requestCriteria") != null && !jsonObj.get("requestCriteria").isJsonNull()) && !jsonObj.get("requestCriteria").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestCriteria` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestCriteria").toString()));
      }
      if ((jsonObj.get("resultCriteria") != null && !jsonObj.get("resultCriteria").isJsonNull()) && !jsonObj.get("resultCriteria").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultCriteria` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultCriteria").toString()));
      }
      if ((jsonObj.get("expirationTime") != null && !jsonObj.get("expirationTime").isJsonNull()) && !jsonObj.get("expirationTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expirationTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expirationTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddChangeSubscriptionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddChangeSubscriptionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddChangeSubscriptionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddChangeSubscriptionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddChangeSubscriptionRequest>() {
           @Override
           public void write(JsonWriter out, AddChangeSubscriptionRequest value) throws IOException {
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
           public AddChangeSubscriptionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddChangeSubscriptionRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddChangeSubscriptionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddChangeSubscriptionRequest
  * @throws IOException if the JSON string is invalid with respect to AddChangeSubscriptionRequest
  */
  public static AddChangeSubscriptionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddChangeSubscriptionRequest.class);
  }

 /**
  * Convert an instance of AddChangeSubscriptionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

