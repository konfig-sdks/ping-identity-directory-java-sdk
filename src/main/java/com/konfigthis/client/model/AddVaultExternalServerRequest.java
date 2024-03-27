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
import com.konfigthis.client.model.EnumvaultExternalServerSchemaUrn;
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
 * AddVaultExternalServerRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddVaultExternalServerRequest {
  public static final String SERIALIZED_NAME_SERVER_NAME = "serverName";
  @SerializedName(SERIALIZED_NAME_SERVER_NAME)
  private String serverName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumvaultExternalServerSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_VAULT_SERVER_BASE_U_R_I = "vaultServerBaseURI";
  @SerializedName(SERIALIZED_NAME_VAULT_SERVER_BASE_U_R_I)
  private List<String> vaultServerBaseURI = new ArrayList<>();

  public static final String SERIALIZED_NAME_VAULT_AUTHENTICATION_METHOD = "vaultAuthenticationMethod";
  @SerializedName(SERIALIZED_NAME_VAULT_AUTHENTICATION_METHOD)
  private String vaultAuthenticationMethod;

  public static final String SERIALIZED_NAME_HTTP_CONNECT_TIMEOUT = "httpConnectTimeout";
  @SerializedName(SERIALIZED_NAME_HTTP_CONNECT_TIMEOUT)
  private String httpConnectTimeout;

  public static final String SERIALIZED_NAME_HTTP_RESPONSE_TIMEOUT = "httpResponseTimeout";
  @SerializedName(SERIALIZED_NAME_HTTP_RESPONSE_TIMEOUT)
  private String httpResponseTimeout;

  public static final String SERIALIZED_NAME_TRUST_STORE_FILE = "trustStoreFile";
  @SerializedName(SERIALIZED_NAME_TRUST_STORE_FILE)
  private String trustStoreFile;

  public static final String SERIALIZED_NAME_TRUST_STORE_PIN = "trustStorePin";
  @SerializedName(SERIALIZED_NAME_TRUST_STORE_PIN)
  private String trustStorePin;

  public static final String SERIALIZED_NAME_TRUST_STORE_TYPE = "trustStoreType";
  @SerializedName(SERIALIZED_NAME_TRUST_STORE_TYPE)
  private String trustStoreType;

  public AddVaultExternalServerRequest() {
  }

  public AddVaultExternalServerRequest serverName(String serverName) {
    
    
    
    
    this.serverName = serverName;
    return this;
  }

   /**
   * Name of the new External Server
   * @return serverName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the new External Server")

  public String getServerName() {
    return serverName;
  }


  public void setServerName(String serverName) {
    
    
    
    this.serverName = serverName;
  }


  public AddVaultExternalServerRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this External Server
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this External Server")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AddVaultExternalServerRequest schemas(List<EnumvaultExternalServerSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddVaultExternalServerRequest addSchemasItem(EnumvaultExternalServerSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumvaultExternalServerSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumvaultExternalServerSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddVaultExternalServerRequest vaultServerBaseURI(List<String> vaultServerBaseURI) {
    
    
    
    
    this.vaultServerBaseURI = vaultServerBaseURI;
    return this;
  }

  public AddVaultExternalServerRequest addVaultServerBaseURIItem(String vaultServerBaseURIItem) {
    this.vaultServerBaseURI.add(vaultServerBaseURIItem);
    return this;
  }

   /**
   * The base URL needed to access the Vault server. The base URL should consist of the protocol (\&quot;http\&quot; or \&quot;https\&quot;), the server address (resolvable name or IP address), and the port number. For example, \&quot;https://vault.example.com:8200/\&quot;.
   * @return vaultServerBaseURI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The base URL needed to access the Vault server. The base URL should consist of the protocol (\"http\" or \"https\"), the server address (resolvable name or IP address), and the port number. For example, \"https://vault.example.com:8200/\".")

  public List<String> getVaultServerBaseURI() {
    return vaultServerBaseURI;
  }


  public void setVaultServerBaseURI(List<String> vaultServerBaseURI) {
    
    
    
    this.vaultServerBaseURI = vaultServerBaseURI;
  }


  public AddVaultExternalServerRequest vaultAuthenticationMethod(String vaultAuthenticationMethod) {
    
    
    
    
    this.vaultAuthenticationMethod = vaultAuthenticationMethod;
    return this;
  }

   /**
   * The mechanism used to authenticate to the Vault server.
   * @return vaultAuthenticationMethod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The mechanism used to authenticate to the Vault server.")

  public String getVaultAuthenticationMethod() {
    return vaultAuthenticationMethod;
  }


  public void setVaultAuthenticationMethod(String vaultAuthenticationMethod) {
    
    
    
    this.vaultAuthenticationMethod = vaultAuthenticationMethod;
  }


  public AddVaultExternalServerRequest httpConnectTimeout(String httpConnectTimeout) {
    
    
    
    
    this.httpConnectTimeout = httpConnectTimeout;
    return this;
  }

   /**
   * The maximum length of time to wait to obtain an HTTP connection.
   * @return httpConnectTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum length of time to wait to obtain an HTTP connection.")

  public String getHttpConnectTimeout() {
    return httpConnectTimeout;
  }


  public void setHttpConnectTimeout(String httpConnectTimeout) {
    
    
    
    this.httpConnectTimeout = httpConnectTimeout;
  }


  public AddVaultExternalServerRequest httpResponseTimeout(String httpResponseTimeout) {
    
    
    
    
    this.httpResponseTimeout = httpResponseTimeout;
    return this;
  }

   /**
   * The maximum length of time to wait for a response to an HTTP request.
   * @return httpResponseTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum length of time to wait for a response to an HTTP request.")

  public String getHttpResponseTimeout() {
    return httpResponseTimeout;
  }


  public void setHttpResponseTimeout(String httpResponseTimeout) {
    
    
    
    this.httpResponseTimeout = httpResponseTimeout;
  }


  public AddVaultExternalServerRequest trustStoreFile(String trustStoreFile) {
    
    
    
    
    this.trustStoreFile = trustStoreFile;
    return this;
  }

   /**
   * The path to a file containing the information needed to trust the certificate presented by the Vault servers.
   * @return trustStoreFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The path to a file containing the information needed to trust the certificate presented by the Vault servers.")

  public String getTrustStoreFile() {
    return trustStoreFile;
  }


  public void setTrustStoreFile(String trustStoreFile) {
    
    
    
    this.trustStoreFile = trustStoreFile;
  }


  public AddVaultExternalServerRequest trustStorePin(String trustStorePin) {
    
    
    
    
    this.trustStorePin = trustStorePin;
    return this;
  }

   /**
   * The passphrase needed to access the contents of the trust store. This is only required if a trust store file is required, and if that trust store requires a PIN to access its contents.
   * @return trustStorePin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The passphrase needed to access the contents of the trust store. This is only required if a trust store file is required, and if that trust store requires a PIN to access its contents.")

  public String getTrustStorePin() {
    return trustStorePin;
  }


  public void setTrustStorePin(String trustStorePin) {
    
    
    
    this.trustStorePin = trustStorePin;
  }


  public AddVaultExternalServerRequest trustStoreType(String trustStoreType) {
    
    
    
    
    this.trustStoreType = trustStoreType;
    return this;
  }

   /**
   * The store type for the specified trust store file. The value should likely be one of \&quot;JKS\&quot;, \&quot;PKCS12\&quot;, or \&quot;BCFKS\&quot;.
   * @return trustStoreType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The store type for the specified trust store file. The value should likely be one of \"JKS\", \"PKCS12\", or \"BCFKS\".")

  public String getTrustStoreType() {
    return trustStoreType;
  }


  public void setTrustStoreType(String trustStoreType) {
    
    
    
    this.trustStoreType = trustStoreType;
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
   * @return the AddVaultExternalServerRequest instance itself
   */
  public AddVaultExternalServerRequest putAdditionalProperty(String key, Object value) {
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
    AddVaultExternalServerRequest addVaultExternalServerRequest = (AddVaultExternalServerRequest) o;
    return Objects.equals(this.serverName, addVaultExternalServerRequest.serverName) &&
        Objects.equals(this.description, addVaultExternalServerRequest.description) &&
        Objects.equals(this.schemas, addVaultExternalServerRequest.schemas) &&
        Objects.equals(this.vaultServerBaseURI, addVaultExternalServerRequest.vaultServerBaseURI) &&
        Objects.equals(this.vaultAuthenticationMethod, addVaultExternalServerRequest.vaultAuthenticationMethod) &&
        Objects.equals(this.httpConnectTimeout, addVaultExternalServerRequest.httpConnectTimeout) &&
        Objects.equals(this.httpResponseTimeout, addVaultExternalServerRequest.httpResponseTimeout) &&
        Objects.equals(this.trustStoreFile, addVaultExternalServerRequest.trustStoreFile) &&
        Objects.equals(this.trustStorePin, addVaultExternalServerRequest.trustStorePin) &&
        Objects.equals(this.trustStoreType, addVaultExternalServerRequest.trustStoreType)&&
        Objects.equals(this.additionalProperties, addVaultExternalServerRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverName, description, schemas, vaultServerBaseURI, vaultAuthenticationMethod, httpConnectTimeout, httpResponseTimeout, trustStoreFile, trustStorePin, trustStoreType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddVaultExternalServerRequest {\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    vaultServerBaseURI: ").append(toIndentedString(vaultServerBaseURI)).append("\n");
    sb.append("    vaultAuthenticationMethod: ").append(toIndentedString(vaultAuthenticationMethod)).append("\n");
    sb.append("    httpConnectTimeout: ").append(toIndentedString(httpConnectTimeout)).append("\n");
    sb.append("    httpResponseTimeout: ").append(toIndentedString(httpResponseTimeout)).append("\n");
    sb.append("    trustStoreFile: ").append(toIndentedString(trustStoreFile)).append("\n");
    sb.append("    trustStorePin: ").append(toIndentedString(trustStorePin)).append("\n");
    sb.append("    trustStoreType: ").append(toIndentedString(trustStoreType)).append("\n");
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
    openapiFields.add("serverName");
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("vaultServerBaseURI");
    openapiFields.add("vaultAuthenticationMethod");
    openapiFields.add("httpConnectTimeout");
    openapiFields.add("httpResponseTimeout");
    openapiFields.add("trustStoreFile");
    openapiFields.add("trustStorePin");
    openapiFields.add("trustStoreType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("serverName");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("vaultServerBaseURI");
    openapiRequiredFields.add("vaultAuthenticationMethod");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddVaultExternalServerRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddVaultExternalServerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddVaultExternalServerRequest is not found in the empty JSON string", AddVaultExternalServerRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddVaultExternalServerRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("serverName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverName").toString()));
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
      if (jsonObj.get("vaultServerBaseURI") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("vaultServerBaseURI").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vaultServerBaseURI` to be an array in the JSON string but got `%s`", jsonObj.get("vaultServerBaseURI").toString()));
      }
      if (!jsonObj.get("vaultAuthenticationMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vaultAuthenticationMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vaultAuthenticationMethod").toString()));
      }
      if ((jsonObj.get("httpConnectTimeout") != null && !jsonObj.get("httpConnectTimeout").isJsonNull()) && !jsonObj.get("httpConnectTimeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `httpConnectTimeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("httpConnectTimeout").toString()));
      }
      if ((jsonObj.get("httpResponseTimeout") != null && !jsonObj.get("httpResponseTimeout").isJsonNull()) && !jsonObj.get("httpResponseTimeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `httpResponseTimeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("httpResponseTimeout").toString()));
      }
      if ((jsonObj.get("trustStoreFile") != null && !jsonObj.get("trustStoreFile").isJsonNull()) && !jsonObj.get("trustStoreFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trustStoreFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trustStoreFile").toString()));
      }
      if ((jsonObj.get("trustStorePin") != null && !jsonObj.get("trustStorePin").isJsonNull()) && !jsonObj.get("trustStorePin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trustStorePin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trustStorePin").toString()));
      }
      if ((jsonObj.get("trustStoreType") != null && !jsonObj.get("trustStoreType").isJsonNull()) && !jsonObj.get("trustStoreType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trustStoreType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trustStoreType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddVaultExternalServerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddVaultExternalServerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddVaultExternalServerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddVaultExternalServerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddVaultExternalServerRequest>() {
           @Override
           public void write(JsonWriter out, AddVaultExternalServerRequest value) throws IOException {
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
           public AddVaultExternalServerRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddVaultExternalServerRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddVaultExternalServerRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddVaultExternalServerRequest
  * @throws IOException if the JSON string is invalid with respect to AddVaultExternalServerRequest
  */
  public static AddVaultExternalServerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddVaultExternalServerRequest.class);
  }

 /**
  * Convert an instance of AddVaultExternalServerRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

