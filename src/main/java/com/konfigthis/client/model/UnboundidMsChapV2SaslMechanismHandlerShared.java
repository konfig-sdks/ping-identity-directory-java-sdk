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
import com.konfigthis.client.model.EnumunboundidMsChapV2SaslMechanismHandlerSchemaUrn;
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
 * UnboundidMsChapV2SaslMechanismHandlerShared
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UnboundidMsChapV2SaslMechanismHandlerShared {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumunboundidMsChapV2SaslMechanismHandlerSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_IDENTITY_MAPPER = "identityMapper";
  @SerializedName(SERIALIZED_NAME_IDENTITY_MAPPER)
  private String identityMapper;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public UnboundidMsChapV2SaslMechanismHandlerShared() {
  }

  public UnboundidMsChapV2SaslMechanismHandlerShared description(String description) {
    
    
    
    
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


  public UnboundidMsChapV2SaslMechanismHandlerShared schemas(List<EnumunboundidMsChapV2SaslMechanismHandlerSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public UnboundidMsChapV2SaslMechanismHandlerShared addSchemasItem(EnumunboundidMsChapV2SaslMechanismHandlerSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumunboundidMsChapV2SaslMechanismHandlerSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumunboundidMsChapV2SaslMechanismHandlerSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public UnboundidMsChapV2SaslMechanismHandlerShared identityMapper(String identityMapper) {
    
    
    
    
    this.identityMapper = identityMapper;
    return this;
  }

   /**
   * The identity mapper that should be used to identify the entry associated with the username provided in the bind request.
   * @return identityMapper
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identity mapper that should be used to identify the entry associated with the username provided in the bind request.")

  public String getIdentityMapper() {
    return identityMapper;
  }


  public void setIdentityMapper(String identityMapper) {
    
    
    
    this.identityMapper = identityMapper;
  }


  public UnboundidMsChapV2SaslMechanismHandlerShared enabled(Boolean enabled) {
    
    
    
    
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
   * @return the UnboundidMsChapV2SaslMechanismHandlerShared instance itself
   */
  public UnboundidMsChapV2SaslMechanismHandlerShared putAdditionalProperty(String key, Object value) {
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
    UnboundidMsChapV2SaslMechanismHandlerShared unboundidMsChapV2SaslMechanismHandlerShared = (UnboundidMsChapV2SaslMechanismHandlerShared) o;
    return Objects.equals(this.description, unboundidMsChapV2SaslMechanismHandlerShared.description) &&
        Objects.equals(this.schemas, unboundidMsChapV2SaslMechanismHandlerShared.schemas) &&
        Objects.equals(this.identityMapper, unboundidMsChapV2SaslMechanismHandlerShared.identityMapper) &&
        Objects.equals(this.enabled, unboundidMsChapV2SaslMechanismHandlerShared.enabled)&&
        Objects.equals(this.additionalProperties, unboundidMsChapV2SaslMechanismHandlerShared.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, identityMapper, enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnboundidMsChapV2SaslMechanismHandlerShared {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    identityMapper: ").append(toIndentedString(identityMapper)).append("\n");
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
    openapiFields.add("identityMapper");
    openapiFields.add("enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("identityMapper");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UnboundidMsChapV2SaslMechanismHandlerShared
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UnboundidMsChapV2SaslMechanismHandlerShared.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UnboundidMsChapV2SaslMechanismHandlerShared is not found in the empty JSON string", UnboundidMsChapV2SaslMechanismHandlerShared.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UnboundidMsChapV2SaslMechanismHandlerShared.openapiRequiredFields) {
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
      if (!jsonObj.get("identityMapper").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identityMapper` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identityMapper").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UnboundidMsChapV2SaslMechanismHandlerShared.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UnboundidMsChapV2SaslMechanismHandlerShared' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UnboundidMsChapV2SaslMechanismHandlerShared> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UnboundidMsChapV2SaslMechanismHandlerShared.class));

       return (TypeAdapter<T>) new TypeAdapter<UnboundidMsChapV2SaslMechanismHandlerShared>() {
           @Override
           public void write(JsonWriter out, UnboundidMsChapV2SaslMechanismHandlerShared value) throws IOException {
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
           public UnboundidMsChapV2SaslMechanismHandlerShared read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UnboundidMsChapV2SaslMechanismHandlerShared instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UnboundidMsChapV2SaslMechanismHandlerShared given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UnboundidMsChapV2SaslMechanismHandlerShared
  * @throws IOException if the JSON string is invalid with respect to UnboundidMsChapV2SaslMechanismHandlerShared
  */
  public static UnboundidMsChapV2SaslMechanismHandlerShared fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UnboundidMsChapV2SaslMechanismHandlerShared.class);
  }

 /**
  * Convert an instance of UnboundidMsChapV2SaslMechanismHandlerShared to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

