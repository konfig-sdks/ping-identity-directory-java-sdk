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
import com.konfigthis.client.model.EnumunboundidDeliveredOtpSaslMechanismHandlerSchemaUrn;
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
 * AddUnboundidDeliveredOtpSaslMechanismHandlerRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddUnboundidDeliveredOtpSaslMechanismHandlerRequest {
  public static final String SERIALIZED_NAME_HANDLER_NAME = "handlerName";
  @SerializedName(SERIALIZED_NAME_HANDLER_NAME)
  private String handlerName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumunboundidDeliveredOtpSaslMechanismHandlerSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_IDENTITY_MAPPER = "identityMapper";
  @SerializedName(SERIALIZED_NAME_IDENTITY_MAPPER)
  private String identityMapper;

  public static final String SERIALIZED_NAME_OTP_VALIDITY_DURATION = "otpValidityDuration";
  @SerializedName(SERIALIZED_NAME_OTP_VALIDITY_DURATION)
  private String otpValidityDuration;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public AddUnboundidDeliveredOtpSaslMechanismHandlerRequest() {
  }

  public AddUnboundidDeliveredOtpSaslMechanismHandlerRequest handlerName(String handlerName) {
    
    
    
    
    this.handlerName = handlerName;
    return this;
  }

   /**
   * Name of the new SASL Mechanism Handler
   * @return handlerName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the new SASL Mechanism Handler")

  public String getHandlerName() {
    return handlerName;
  }


  public void setHandlerName(String handlerName) {
    
    
    
    this.handlerName = handlerName;
  }


  public AddUnboundidDeliveredOtpSaslMechanismHandlerRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this SASL Mechanism Handler
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this SASL Mechanism Handler")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AddUnboundidDeliveredOtpSaslMechanismHandlerRequest schemas(List<EnumunboundidDeliveredOtpSaslMechanismHandlerSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddUnboundidDeliveredOtpSaslMechanismHandlerRequest addSchemasItem(EnumunboundidDeliveredOtpSaslMechanismHandlerSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumunboundidDeliveredOtpSaslMechanismHandlerSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumunboundidDeliveredOtpSaslMechanismHandlerSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddUnboundidDeliveredOtpSaslMechanismHandlerRequest identityMapper(String identityMapper) {
    
    
    
    
    this.identityMapper = identityMapper;
    return this;
  }

   /**
   * The identity mapper that should be used to identify the user(s) targeted in the authentication and/or authorization identities contained in the bind request. This will only be used for \&quot;u:\&quot;-style identities.
   * @return identityMapper
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identity mapper that should be used to identify the user(s) targeted in the authentication and/or authorization identities contained in the bind request. This will only be used for \"u:\"-style identities.")

  public String getIdentityMapper() {
    return identityMapper;
  }


  public void setIdentityMapper(String identityMapper) {
    
    
    
    this.identityMapper = identityMapper;
  }


  public AddUnboundidDeliveredOtpSaslMechanismHandlerRequest otpValidityDuration(String otpValidityDuration) {
    
    
    
    
    this.otpValidityDuration = otpValidityDuration;
    return this;
  }

   /**
   * The maximum length of time that a one-time password value should be considered valid.
   * @return otpValidityDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum length of time that a one-time password value should be considered valid.")

  public String getOtpValidityDuration() {
    return otpValidityDuration;
  }


  public void setOtpValidityDuration(String otpValidityDuration) {
    
    
    
    this.otpValidityDuration = otpValidityDuration;
  }


  public AddUnboundidDeliveredOtpSaslMechanismHandlerRequest enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the SASL mechanism handler is enabled for use.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether the SASL mechanism handler is enabled for use.")

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
   * @return the AddUnboundidDeliveredOtpSaslMechanismHandlerRequest instance itself
   */
  public AddUnboundidDeliveredOtpSaslMechanismHandlerRequest putAdditionalProperty(String key, Object value) {
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
    AddUnboundidDeliveredOtpSaslMechanismHandlerRequest addUnboundidDeliveredOtpSaslMechanismHandlerRequest = (AddUnboundidDeliveredOtpSaslMechanismHandlerRequest) o;
    return Objects.equals(this.handlerName, addUnboundidDeliveredOtpSaslMechanismHandlerRequest.handlerName) &&
        Objects.equals(this.description, addUnboundidDeliveredOtpSaslMechanismHandlerRequest.description) &&
        Objects.equals(this.schemas, addUnboundidDeliveredOtpSaslMechanismHandlerRequest.schemas) &&
        Objects.equals(this.identityMapper, addUnboundidDeliveredOtpSaslMechanismHandlerRequest.identityMapper) &&
        Objects.equals(this.otpValidityDuration, addUnboundidDeliveredOtpSaslMechanismHandlerRequest.otpValidityDuration) &&
        Objects.equals(this.enabled, addUnboundidDeliveredOtpSaslMechanismHandlerRequest.enabled)&&
        Objects.equals(this.additionalProperties, addUnboundidDeliveredOtpSaslMechanismHandlerRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handlerName, description, schemas, identityMapper, otpValidityDuration, enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddUnboundidDeliveredOtpSaslMechanismHandlerRequest {\n");
    sb.append("    handlerName: ").append(toIndentedString(handlerName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    identityMapper: ").append(toIndentedString(identityMapper)).append("\n");
    sb.append("    otpValidityDuration: ").append(toIndentedString(otpValidityDuration)).append("\n");
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
    openapiFields.add("handlerName");
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("identityMapper");
    openapiFields.add("otpValidityDuration");
    openapiFields.add("enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("handlerName");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("identityMapper");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddUnboundidDeliveredOtpSaslMechanismHandlerRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddUnboundidDeliveredOtpSaslMechanismHandlerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddUnboundidDeliveredOtpSaslMechanismHandlerRequest is not found in the empty JSON string", AddUnboundidDeliveredOtpSaslMechanismHandlerRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddUnboundidDeliveredOtpSaslMechanismHandlerRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("handlerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `handlerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("handlerName").toString()));
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
      if (!jsonObj.get("identityMapper").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identityMapper` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identityMapper").toString()));
      }
      if ((jsonObj.get("otpValidityDuration") != null && !jsonObj.get("otpValidityDuration").isJsonNull()) && !jsonObj.get("otpValidityDuration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `otpValidityDuration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("otpValidityDuration").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddUnboundidDeliveredOtpSaslMechanismHandlerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddUnboundidDeliveredOtpSaslMechanismHandlerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddUnboundidDeliveredOtpSaslMechanismHandlerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddUnboundidDeliveredOtpSaslMechanismHandlerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddUnboundidDeliveredOtpSaslMechanismHandlerRequest>() {
           @Override
           public void write(JsonWriter out, AddUnboundidDeliveredOtpSaslMechanismHandlerRequest value) throws IOException {
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
           public AddUnboundidDeliveredOtpSaslMechanismHandlerRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddUnboundidDeliveredOtpSaslMechanismHandlerRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddUnboundidDeliveredOtpSaslMechanismHandlerRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddUnboundidDeliveredOtpSaslMechanismHandlerRequest
  * @throws IOException if the JSON string is invalid with respect to AddUnboundidDeliveredOtpSaslMechanismHandlerRequest
  */
  public static AddUnboundidDeliveredOtpSaslMechanismHandlerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddUnboundidDeliveredOtpSaslMechanismHandlerRequest.class);
  }

 /**
  * Convert an instance of AddUnboundidDeliveredOtpSaslMechanismHandlerRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

