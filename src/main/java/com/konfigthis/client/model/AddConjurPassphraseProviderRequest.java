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
import com.konfigthis.client.model.EnumconjurPassphraseProviderSchemaUrn;
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
 * AddConjurPassphraseProviderRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddConjurPassphraseProviderRequest {
  public static final String SERIALIZED_NAME_PROVIDER_NAME = "providerName";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  private String providerName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumconjurPassphraseProviderSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONJUR_EXTERNAL_SERVER = "conjurExternalServer";
  @SerializedName(SERIALIZED_NAME_CONJUR_EXTERNAL_SERVER)
  private String conjurExternalServer;

  public static final String SERIALIZED_NAME_CONJUR_SECRET_RELATIVE_PATH = "conjurSecretRelativePath";
  @SerializedName(SERIALIZED_NAME_CONJUR_SECRET_RELATIVE_PATH)
  private String conjurSecretRelativePath;

  public static final String SERIALIZED_NAME_MAX_CACHE_DURATION = "maxCacheDuration";
  @SerializedName(SERIALIZED_NAME_MAX_CACHE_DURATION)
  private String maxCacheDuration;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public AddConjurPassphraseProviderRequest() {
  }

  public AddConjurPassphraseProviderRequest providerName(String providerName) {
    
    
    
    
    this.providerName = providerName;
    return this;
  }

   /**
   * Name of the new Passphrase Provider
   * @return providerName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the new Passphrase Provider")

  public String getProviderName() {
    return providerName;
  }


  public void setProviderName(String providerName) {
    
    
    
    this.providerName = providerName;
  }


  public AddConjurPassphraseProviderRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Passphrase Provider
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Passphrase Provider")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AddConjurPassphraseProviderRequest schemas(List<EnumconjurPassphraseProviderSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddConjurPassphraseProviderRequest addSchemasItem(EnumconjurPassphraseProviderSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumconjurPassphraseProviderSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumconjurPassphraseProviderSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddConjurPassphraseProviderRequest conjurExternalServer(String conjurExternalServer) {
    
    
    
    
    this.conjurExternalServer = conjurExternalServer;
    return this;
  }

   /**
   * An external server definition with information needed to connect and authenticate to the Conjur instance containing the passphrase.
   * @return conjurExternalServer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An external server definition with information needed to connect and authenticate to the Conjur instance containing the passphrase.")

  public String getConjurExternalServer() {
    return conjurExternalServer;
  }


  public void setConjurExternalServer(String conjurExternalServer) {
    
    
    
    this.conjurExternalServer = conjurExternalServer;
  }


  public AddConjurPassphraseProviderRequest conjurSecretRelativePath(String conjurSecretRelativePath) {
    
    
    
    
    this.conjurSecretRelativePath = conjurSecretRelativePath;
    return this;
  }

   /**
   * The portion of the path that follows the account name in the URI needed to obtain the desired secret. Any special characters in the path must be URL-encoded.
   * @return conjurSecretRelativePath
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The portion of the path that follows the account name in the URI needed to obtain the desired secret. Any special characters in the path must be URL-encoded.")

  public String getConjurSecretRelativePath() {
    return conjurSecretRelativePath;
  }


  public void setConjurSecretRelativePath(String conjurSecretRelativePath) {
    
    
    
    this.conjurSecretRelativePath = conjurSecretRelativePath;
  }


  public AddConjurPassphraseProviderRequest maxCacheDuration(String maxCacheDuration) {
    
    
    
    
    this.maxCacheDuration = maxCacheDuration;
    return this;
  }

   /**
   * The maximum length of time that the passphrase provider may cache the passphrase that has been read from Conjur. A value of zero seconds indicates that the provider should always attempt to read the passphrase from Conjur.
   * @return maxCacheDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum length of time that the passphrase provider may cache the passphrase that has been read from Conjur. A value of zero seconds indicates that the provider should always attempt to read the passphrase from Conjur.")

  public String getMaxCacheDuration() {
    return maxCacheDuration;
  }


  public void setMaxCacheDuration(String maxCacheDuration) {
    
    
    
    this.maxCacheDuration = maxCacheDuration;
  }


  public AddConjurPassphraseProviderRequest enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether this Passphrase Provider is enabled for use in the server.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether this Passphrase Provider is enabled for use in the server.")

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
   * @return the AddConjurPassphraseProviderRequest instance itself
   */
  public AddConjurPassphraseProviderRequest putAdditionalProperty(String key, Object value) {
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
    AddConjurPassphraseProviderRequest addConjurPassphraseProviderRequest = (AddConjurPassphraseProviderRequest) o;
    return Objects.equals(this.providerName, addConjurPassphraseProviderRequest.providerName) &&
        Objects.equals(this.description, addConjurPassphraseProviderRequest.description) &&
        Objects.equals(this.schemas, addConjurPassphraseProviderRequest.schemas) &&
        Objects.equals(this.conjurExternalServer, addConjurPassphraseProviderRequest.conjurExternalServer) &&
        Objects.equals(this.conjurSecretRelativePath, addConjurPassphraseProviderRequest.conjurSecretRelativePath) &&
        Objects.equals(this.maxCacheDuration, addConjurPassphraseProviderRequest.maxCacheDuration) &&
        Objects.equals(this.enabled, addConjurPassphraseProviderRequest.enabled)&&
        Objects.equals(this.additionalProperties, addConjurPassphraseProviderRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerName, description, schemas, conjurExternalServer, conjurSecretRelativePath, maxCacheDuration, enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddConjurPassphraseProviderRequest {\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    conjurExternalServer: ").append(toIndentedString(conjurExternalServer)).append("\n");
    sb.append("    conjurSecretRelativePath: ").append(toIndentedString(conjurSecretRelativePath)).append("\n");
    sb.append("    maxCacheDuration: ").append(toIndentedString(maxCacheDuration)).append("\n");
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
    openapiFields.add("providerName");
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("conjurExternalServer");
    openapiFields.add("conjurSecretRelativePath");
    openapiFields.add("maxCacheDuration");
    openapiFields.add("enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("providerName");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("conjurExternalServer");
    openapiRequiredFields.add("conjurSecretRelativePath");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddConjurPassphraseProviderRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddConjurPassphraseProviderRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddConjurPassphraseProviderRequest is not found in the empty JSON string", AddConjurPassphraseProviderRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddConjurPassphraseProviderRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("providerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerName").toString()));
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
      if (!jsonObj.get("conjurExternalServer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conjurExternalServer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conjurExternalServer").toString()));
      }
      if (!jsonObj.get("conjurSecretRelativePath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conjurSecretRelativePath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conjurSecretRelativePath").toString()));
      }
      if ((jsonObj.get("maxCacheDuration") != null && !jsonObj.get("maxCacheDuration").isJsonNull()) && !jsonObj.get("maxCacheDuration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxCacheDuration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxCacheDuration").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddConjurPassphraseProviderRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddConjurPassphraseProviderRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddConjurPassphraseProviderRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddConjurPassphraseProviderRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddConjurPassphraseProviderRequest>() {
           @Override
           public void write(JsonWriter out, AddConjurPassphraseProviderRequest value) throws IOException {
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
           public AddConjurPassphraseProviderRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddConjurPassphraseProviderRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddConjurPassphraseProviderRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddConjurPassphraseProviderRequest
  * @throws IOException if the JSON string is invalid with respect to AddConjurPassphraseProviderRequest
  */
  public static AddConjurPassphraseProviderRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddConjurPassphraseProviderRequest.class);
  }

 /**
  * Convert an instance of AddConjurPassphraseProviderRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

