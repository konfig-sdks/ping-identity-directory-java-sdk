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
import com.konfigthis.client.model.EnumaggregatePassThroughAuthenticationHandlerSchemaUrn;
import com.konfigthis.client.model.EnumpassThroughAuthenticationHandlerContinueOnFailureTypeProp;
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
 * AggregatePassThroughAuthenticationHandlerShared
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AggregatePassThroughAuthenticationHandlerShared {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumaggregatePassThroughAuthenticationHandlerSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUBORDINATE_PASS_THROUGH_AUTHENTICATION_HANDLER = "subordinatePassThroughAuthenticationHandler";
  @SerializedName(SERIALIZED_NAME_SUBORDINATE_PASS_THROUGH_AUTHENTICATION_HANDLER)
  private List<String> subordinatePassThroughAuthenticationHandler = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTINUE_ON_FAILURE_TYPE = "continueOnFailureType";
  @SerializedName(SERIALIZED_NAME_CONTINUE_ON_FAILURE_TYPE)
  private List<EnumpassThroughAuthenticationHandlerContinueOnFailureTypeProp> continueOnFailureType = null;

  public static final String SERIALIZED_NAME_INCLUDED_LOCAL_ENTRY_BASE_D_N = "includedLocalEntryBaseDN";
  @SerializedName(SERIALIZED_NAME_INCLUDED_LOCAL_ENTRY_BASE_D_N)
  private List<String> includedLocalEntryBaseDN = null;

  public static final String SERIALIZED_NAME_CONNECTION_CRITERIA = "connectionCriteria";
  @SerializedName(SERIALIZED_NAME_CONNECTION_CRITERIA)
  private String connectionCriteria;

  public static final String SERIALIZED_NAME_REQUEST_CRITERIA = "requestCriteria";
  @SerializedName(SERIALIZED_NAME_REQUEST_CRITERIA)
  private String requestCriteria;

  public AggregatePassThroughAuthenticationHandlerShared() {
  }

  public AggregatePassThroughAuthenticationHandlerShared description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Pass Through Authentication Handler
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Pass Through Authentication Handler")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AggregatePassThroughAuthenticationHandlerShared schemas(List<EnumaggregatePassThroughAuthenticationHandlerSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AggregatePassThroughAuthenticationHandlerShared addSchemasItem(EnumaggregatePassThroughAuthenticationHandlerSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumaggregatePassThroughAuthenticationHandlerSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumaggregatePassThroughAuthenticationHandlerSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AggregatePassThroughAuthenticationHandlerShared subordinatePassThroughAuthenticationHandler(List<String> subordinatePassThroughAuthenticationHandler) {
    
    
    
    
    this.subordinatePassThroughAuthenticationHandler = subordinatePassThroughAuthenticationHandler;
    return this;
  }

  public AggregatePassThroughAuthenticationHandlerShared addSubordinatePassThroughAuthenticationHandlerItem(String subordinatePassThroughAuthenticationHandlerItem) {
    this.subordinatePassThroughAuthenticationHandler.add(subordinatePassThroughAuthenticationHandlerItem);
    return this;
  }

   /**
   * The set of subordinate pass-through authentication handlers that may be used to perform the authentication processing. Handlers will be invoked in order until one is found for which the bind operation matches the associated criteria and either succeeds or fails in a manner that should not be ignored.
   * @return subordinatePassThroughAuthenticationHandler
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The set of subordinate pass-through authentication handlers that may be used to perform the authentication processing. Handlers will be invoked in order until one is found for which the bind operation matches the associated criteria and either succeeds or fails in a manner that should not be ignored.")

  public List<String> getSubordinatePassThroughAuthenticationHandler() {
    return subordinatePassThroughAuthenticationHandler;
  }


  public void setSubordinatePassThroughAuthenticationHandler(List<String> subordinatePassThroughAuthenticationHandler) {
    
    
    
    this.subordinatePassThroughAuthenticationHandler = subordinatePassThroughAuthenticationHandler;
  }


  public AggregatePassThroughAuthenticationHandlerShared continueOnFailureType(List<EnumpassThroughAuthenticationHandlerContinueOnFailureTypeProp> continueOnFailureType) {
    
    
    
    
    this.continueOnFailureType = continueOnFailureType;
    return this;
  }

  public AggregatePassThroughAuthenticationHandlerShared addContinueOnFailureTypeItem(EnumpassThroughAuthenticationHandlerContinueOnFailureTypeProp continueOnFailureTypeItem) {
    if (this.continueOnFailureType == null) {
      this.continueOnFailureType = new ArrayList<>();
    }
    this.continueOnFailureType.add(continueOnFailureTypeItem);
    return this;
  }

   /**
   * Get continueOnFailureType
   * @return continueOnFailureType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumpassThroughAuthenticationHandlerContinueOnFailureTypeProp> getContinueOnFailureType() {
    return continueOnFailureType;
  }


  public void setContinueOnFailureType(List<EnumpassThroughAuthenticationHandlerContinueOnFailureTypeProp> continueOnFailureType) {
    
    
    
    this.continueOnFailureType = continueOnFailureType;
  }


  public AggregatePassThroughAuthenticationHandlerShared includedLocalEntryBaseDN(List<String> includedLocalEntryBaseDN) {
    
    
    
    
    this.includedLocalEntryBaseDN = includedLocalEntryBaseDN;
    return this;
  }

  public AggregatePassThroughAuthenticationHandlerShared addIncludedLocalEntryBaseDNItem(String includedLocalEntryBaseDNItem) {
    if (this.includedLocalEntryBaseDN == null) {
      this.includedLocalEntryBaseDN = new ArrayList<>();
    }
    this.includedLocalEntryBaseDN.add(includedLocalEntryBaseDNItem);
    return this;
  }

   /**
   * The base DNs for the local users whose authentication attempts may be passed through to the external authentication service.
   * @return includedLocalEntryBaseDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The base DNs for the local users whose authentication attempts may be passed through to the external authentication service.")

  public List<String> getIncludedLocalEntryBaseDN() {
    return includedLocalEntryBaseDN;
  }


  public void setIncludedLocalEntryBaseDN(List<String> includedLocalEntryBaseDN) {
    
    
    
    this.includedLocalEntryBaseDN = includedLocalEntryBaseDN;
  }


  public AggregatePassThroughAuthenticationHandlerShared connectionCriteria(String connectionCriteria) {
    
    
    
    
    this.connectionCriteria = connectionCriteria;
    return this;
  }

   /**
   * A reference to connection criteria that will be used to indicate which bind requests should be passed through to the external authentication service.
   * @return connectionCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to connection criteria that will be used to indicate which bind requests should be passed through to the external authentication service.")

  public String getConnectionCriteria() {
    return connectionCriteria;
  }


  public void setConnectionCriteria(String connectionCriteria) {
    
    
    
    this.connectionCriteria = connectionCriteria;
  }


  public AggregatePassThroughAuthenticationHandlerShared requestCriteria(String requestCriteria) {
    
    
    
    
    this.requestCriteria = requestCriteria;
    return this;
  }

   /**
   * A reference to request criteria that will be used to indicate which bind requests should be passed through to the external authentication service.
   * @return requestCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to request criteria that will be used to indicate which bind requests should be passed through to the external authentication service.")

  public String getRequestCriteria() {
    return requestCriteria;
  }


  public void setRequestCriteria(String requestCriteria) {
    
    
    
    this.requestCriteria = requestCriteria;
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
   * @return the AggregatePassThroughAuthenticationHandlerShared instance itself
   */
  public AggregatePassThroughAuthenticationHandlerShared putAdditionalProperty(String key, Object value) {
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
    AggregatePassThroughAuthenticationHandlerShared aggregatePassThroughAuthenticationHandlerShared = (AggregatePassThroughAuthenticationHandlerShared) o;
    return Objects.equals(this.description, aggregatePassThroughAuthenticationHandlerShared.description) &&
        Objects.equals(this.schemas, aggregatePassThroughAuthenticationHandlerShared.schemas) &&
        Objects.equals(this.subordinatePassThroughAuthenticationHandler, aggregatePassThroughAuthenticationHandlerShared.subordinatePassThroughAuthenticationHandler) &&
        Objects.equals(this.continueOnFailureType, aggregatePassThroughAuthenticationHandlerShared.continueOnFailureType) &&
        Objects.equals(this.includedLocalEntryBaseDN, aggregatePassThroughAuthenticationHandlerShared.includedLocalEntryBaseDN) &&
        Objects.equals(this.connectionCriteria, aggregatePassThroughAuthenticationHandlerShared.connectionCriteria) &&
        Objects.equals(this.requestCriteria, aggregatePassThroughAuthenticationHandlerShared.requestCriteria)&&
        Objects.equals(this.additionalProperties, aggregatePassThroughAuthenticationHandlerShared.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, subordinatePassThroughAuthenticationHandler, continueOnFailureType, includedLocalEntryBaseDN, connectionCriteria, requestCriteria, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatePassThroughAuthenticationHandlerShared {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    subordinatePassThroughAuthenticationHandler: ").append(toIndentedString(subordinatePassThroughAuthenticationHandler)).append("\n");
    sb.append("    continueOnFailureType: ").append(toIndentedString(continueOnFailureType)).append("\n");
    sb.append("    includedLocalEntryBaseDN: ").append(toIndentedString(includedLocalEntryBaseDN)).append("\n");
    sb.append("    connectionCriteria: ").append(toIndentedString(connectionCriteria)).append("\n");
    sb.append("    requestCriteria: ").append(toIndentedString(requestCriteria)).append("\n");
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
    openapiFields.add("subordinatePassThroughAuthenticationHandler");
    openapiFields.add("continueOnFailureType");
    openapiFields.add("includedLocalEntryBaseDN");
    openapiFields.add("connectionCriteria");
    openapiFields.add("requestCriteria");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("subordinatePassThroughAuthenticationHandler");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AggregatePassThroughAuthenticationHandlerShared
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AggregatePassThroughAuthenticationHandlerShared.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AggregatePassThroughAuthenticationHandlerShared is not found in the empty JSON string", AggregatePassThroughAuthenticationHandlerShared.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AggregatePassThroughAuthenticationHandlerShared.openapiRequiredFields) {
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
      // ensure the required json array is present
      if (jsonObj.get("subordinatePassThroughAuthenticationHandler") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("subordinatePassThroughAuthenticationHandler").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `subordinatePassThroughAuthenticationHandler` to be an array in the JSON string but got `%s`", jsonObj.get("subordinatePassThroughAuthenticationHandler").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("continueOnFailureType") != null && !jsonObj.get("continueOnFailureType").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `continueOnFailureType` to be an array in the JSON string but got `%s`", jsonObj.get("continueOnFailureType").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("includedLocalEntryBaseDN") != null && !jsonObj.get("includedLocalEntryBaseDN").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includedLocalEntryBaseDN` to be an array in the JSON string but got `%s`", jsonObj.get("includedLocalEntryBaseDN").toString()));
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
       if (!AggregatePassThroughAuthenticationHandlerShared.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AggregatePassThroughAuthenticationHandlerShared' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AggregatePassThroughAuthenticationHandlerShared> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AggregatePassThroughAuthenticationHandlerShared.class));

       return (TypeAdapter<T>) new TypeAdapter<AggregatePassThroughAuthenticationHandlerShared>() {
           @Override
           public void write(JsonWriter out, AggregatePassThroughAuthenticationHandlerShared value) throws IOException {
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
           public AggregatePassThroughAuthenticationHandlerShared read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AggregatePassThroughAuthenticationHandlerShared instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AggregatePassThroughAuthenticationHandlerShared given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AggregatePassThroughAuthenticationHandlerShared
  * @throws IOException if the JSON string is invalid with respect to AggregatePassThroughAuthenticationHandlerShared
  */
  public static AggregatePassThroughAuthenticationHandlerShared fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AggregatePassThroughAuthenticationHandlerShared.class);
  }

 /**
  * Convert an instance of AggregatePassThroughAuthenticationHandlerShared to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

