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
import com.konfigthis.client.model.EnumazureKeyVaultPassphraseProviderSchemaUrn;
import com.konfigthis.client.model.MetaMeta;
import com.konfigthis.client.model.MetaUrnPingidentitySchemasConfigurationMessages20;
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
 * AzureKeyVaultPassphraseProviderResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AzureKeyVaultPassphraseProviderResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumazureKeyVaultPassphraseProviderSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_KEY_VAULT_U_R_I = "keyVaultURI";
  @SerializedName(SERIALIZED_NAME_KEY_VAULT_U_R_I)
  private String keyVaultURI;

  public static final String SERIALIZED_NAME_AZURE_AUTHENTICATION_METHOD = "azureAuthenticationMethod";
  @SerializedName(SERIALIZED_NAME_AZURE_AUTHENTICATION_METHOD)
  private String azureAuthenticationMethod;

  public static final String SERIALIZED_NAME_HTTP_PROXY_EXTERNAL_SERVER = "httpProxyExternalServer";
  @SerializedName(SERIALIZED_NAME_HTTP_PROXY_EXTERNAL_SERVER)
  private String httpProxyExternalServer;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";
  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;

  public static final String SERIALIZED_NAME_MAX_CACHE_DURATION = "maxCacheDuration";
  @SerializedName(SERIALIZED_NAME_MAX_CACHE_DURATION)
  private String maxCacheDuration;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public AzureKeyVaultPassphraseProviderResponse() {
  }

  public AzureKeyVaultPassphraseProviderResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Passphrase Provider
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the Passphrase Provider")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public AzureKeyVaultPassphraseProviderResponse description(String description) {
    
    
    
    
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


  public AzureKeyVaultPassphraseProviderResponse schemas(List<EnumazureKeyVaultPassphraseProviderSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AzureKeyVaultPassphraseProviderResponse addSchemasItem(EnumazureKeyVaultPassphraseProviderSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumazureKeyVaultPassphraseProviderSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumazureKeyVaultPassphraseProviderSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AzureKeyVaultPassphraseProviderResponse keyVaultURI(String keyVaultURI) {
    
    
    
    
    this.keyVaultURI = keyVaultURI;
    return this;
  }

   /**
   * The URI that identifies the Azure Key Vault from which the secret is to be retrieved.
   * @return keyVaultURI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The URI that identifies the Azure Key Vault from which the secret is to be retrieved.")

  public String getKeyVaultURI() {
    return keyVaultURI;
  }


  public void setKeyVaultURI(String keyVaultURI) {
    
    
    
    this.keyVaultURI = keyVaultURI;
  }


  public AzureKeyVaultPassphraseProviderResponse azureAuthenticationMethod(String azureAuthenticationMethod) {
    
    
    
    
    this.azureAuthenticationMethod = azureAuthenticationMethod;
    return this;
  }

   /**
   * The mechanism used to authenticate to the Azure service.
   * @return azureAuthenticationMethod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The mechanism used to authenticate to the Azure service.")

  public String getAzureAuthenticationMethod() {
    return azureAuthenticationMethod;
  }


  public void setAzureAuthenticationMethod(String azureAuthenticationMethod) {
    
    
    
    this.azureAuthenticationMethod = azureAuthenticationMethod;
  }


  public AzureKeyVaultPassphraseProviderResponse httpProxyExternalServer(String httpProxyExternalServer) {
    
    
    
    
    this.httpProxyExternalServer = httpProxyExternalServer;
    return this;
  }

   /**
   * A reference to an HTTP proxy server that should be used for requests sent to the Azure service.
   * @return httpProxyExternalServer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to an HTTP proxy server that should be used for requests sent to the Azure service.")

  public String getHttpProxyExternalServer() {
    return httpProxyExternalServer;
  }


  public void setHttpProxyExternalServer(String httpProxyExternalServer) {
    
    
    
    this.httpProxyExternalServer = httpProxyExternalServer;
  }


  public AzureKeyVaultPassphraseProviderResponse secretName(String secretName) {
    
    
    
    
    this.secretName = secretName;
    return this;
  }

   /**
   * The name of the secret to retrieve.
   * @return secretName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the secret to retrieve.")

  public String getSecretName() {
    return secretName;
  }


  public void setSecretName(String secretName) {
    
    
    
    this.secretName = secretName;
  }


  public AzureKeyVaultPassphraseProviderResponse maxCacheDuration(String maxCacheDuration) {
    
    
    
    
    this.maxCacheDuration = maxCacheDuration;
    return this;
  }

   /**
   * The maximum length of time that the passphrase provider may cache the passphrase that has been read from Azure Key Vault. A value of zero seconds indicates that the provider should always attempt to read the passphrase from the Azure service.
   * @return maxCacheDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum length of time that the passphrase provider may cache the passphrase that has been read from Azure Key Vault. A value of zero seconds indicates that the provider should always attempt to read the passphrase from the Azure service.")

  public String getMaxCacheDuration() {
    return maxCacheDuration;
  }


  public void setMaxCacheDuration(String maxCacheDuration) {
    
    
    
    this.maxCacheDuration = maxCacheDuration;
  }


  public AzureKeyVaultPassphraseProviderResponse enabled(Boolean enabled) {
    
    
    
    
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


  public AzureKeyVaultPassphraseProviderResponse meta(MetaMeta meta) {
    
    
    
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MetaMeta getMeta() {
    return meta;
  }


  public void setMeta(MetaMeta meta) {
    
    
    
    this.meta = meta;
  }


  public AzureKeyVaultPassphraseProviderResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
    this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20 = urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;
    return this;
  }

   /**
   * Get urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20
   * @return urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MetaUrnPingidentitySchemasConfigurationMessages20 getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20() {
    return urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;
  }


  public void setUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20 = urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;
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
   * @return the AzureKeyVaultPassphraseProviderResponse instance itself
   */
  public AzureKeyVaultPassphraseProviderResponse putAdditionalProperty(String key, Object value) {
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
    AzureKeyVaultPassphraseProviderResponse azureKeyVaultPassphraseProviderResponse = (AzureKeyVaultPassphraseProviderResponse) o;
    return Objects.equals(this.id, azureKeyVaultPassphraseProviderResponse.id) &&
        Objects.equals(this.description, azureKeyVaultPassphraseProviderResponse.description) &&
        Objects.equals(this.schemas, azureKeyVaultPassphraseProviderResponse.schemas) &&
        Objects.equals(this.keyVaultURI, azureKeyVaultPassphraseProviderResponse.keyVaultURI) &&
        Objects.equals(this.azureAuthenticationMethod, azureKeyVaultPassphraseProviderResponse.azureAuthenticationMethod) &&
        Objects.equals(this.httpProxyExternalServer, azureKeyVaultPassphraseProviderResponse.httpProxyExternalServer) &&
        Objects.equals(this.secretName, azureKeyVaultPassphraseProviderResponse.secretName) &&
        Objects.equals(this.maxCacheDuration, azureKeyVaultPassphraseProviderResponse.maxCacheDuration) &&
        Objects.equals(this.enabled, azureKeyVaultPassphraseProviderResponse.enabled) &&
        Objects.equals(this.meta, azureKeyVaultPassphraseProviderResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, azureKeyVaultPassphraseProviderResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, azureKeyVaultPassphraseProviderResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, schemas, keyVaultURI, azureAuthenticationMethod, httpProxyExternalServer, secretName, maxCacheDuration, enabled, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureKeyVaultPassphraseProviderResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    keyVaultURI: ").append(toIndentedString(keyVaultURI)).append("\n");
    sb.append("    azureAuthenticationMethod: ").append(toIndentedString(azureAuthenticationMethod)).append("\n");
    sb.append("    httpProxyExternalServer: ").append(toIndentedString(httpProxyExternalServer)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
    sb.append("    maxCacheDuration: ").append(toIndentedString(maxCacheDuration)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20: ").append(toIndentedString(urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("keyVaultURI");
    openapiFields.add("azureAuthenticationMethod");
    openapiFields.add("httpProxyExternalServer");
    openapiFields.add("secretName");
    openapiFields.add("maxCacheDuration");
    openapiFields.add("enabled");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("keyVaultURI");
    openapiRequiredFields.add("azureAuthenticationMethod");
    openapiRequiredFields.add("secretName");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AzureKeyVaultPassphraseProviderResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AzureKeyVaultPassphraseProviderResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AzureKeyVaultPassphraseProviderResponse is not found in the empty JSON string", AzureKeyVaultPassphraseProviderResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AzureKeyVaultPassphraseProviderResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
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
      if (!jsonObj.get("keyVaultURI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyVaultURI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyVaultURI").toString()));
      }
      if (!jsonObj.get("azureAuthenticationMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `azureAuthenticationMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("azureAuthenticationMethod").toString()));
      }
      if ((jsonObj.get("httpProxyExternalServer") != null && !jsonObj.get("httpProxyExternalServer").isJsonNull()) && !jsonObj.get("httpProxyExternalServer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `httpProxyExternalServer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("httpProxyExternalServer").toString()));
      }
      if (!jsonObj.get("secretName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secretName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secretName").toString()));
      }
      if ((jsonObj.get("maxCacheDuration") != null && !jsonObj.get("maxCacheDuration").isJsonNull()) && !jsonObj.get("maxCacheDuration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxCacheDuration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxCacheDuration").toString()));
      }
      // validate the optional field `meta`
      if (jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) {
        MetaMeta.validateJsonObject(jsonObj.getAsJsonObject("meta"));
      }
      // validate the optional field `urn:pingidentity:schemas:configuration:messages:2.0`
      if (jsonObj.get("urn:pingidentity:schemas:configuration:messages:2.0") != null && !jsonObj.get("urn:pingidentity:schemas:configuration:messages:2.0").isJsonNull()) {
        MetaUrnPingidentitySchemasConfigurationMessages20.validateJsonObject(jsonObj.getAsJsonObject("urn:pingidentity:schemas:configuration:messages:2.0"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AzureKeyVaultPassphraseProviderResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AzureKeyVaultPassphraseProviderResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AzureKeyVaultPassphraseProviderResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AzureKeyVaultPassphraseProviderResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AzureKeyVaultPassphraseProviderResponse>() {
           @Override
           public void write(JsonWriter out, AzureKeyVaultPassphraseProviderResponse value) throws IOException {
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
           public AzureKeyVaultPassphraseProviderResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AzureKeyVaultPassphraseProviderResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AzureKeyVaultPassphraseProviderResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AzureKeyVaultPassphraseProviderResponse
  * @throws IOException if the JSON string is invalid with respect to AzureKeyVaultPassphraseProviderResponse
  */
  public static AzureKeyVaultPassphraseProviderResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AzureKeyVaultPassphraseProviderResponse.class);
  }

 /**
  * Convert an instance of AzureKeyVaultPassphraseProviderResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

