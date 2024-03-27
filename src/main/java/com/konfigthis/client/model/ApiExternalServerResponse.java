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
import com.konfigthis.client.model.EnumapiExternalServerSchemaUrn;
import com.konfigthis.client.model.EnumexternalServerApiHostnameVerificationMethodProp;
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
 * ApiExternalServerResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ApiExternalServerResponse {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumapiExternalServerSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BASE_U_R_L = "baseURL";
  @SerializedName(SERIALIZED_NAME_BASE_U_R_L)
  private String baseURL;

  public static final String SERIALIZED_NAME_HOSTNAME_VERIFICATION_METHOD = "hostnameVerificationMethod";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_VERIFICATION_METHOD)
  private EnumexternalServerApiHostnameVerificationMethodProp hostnameVerificationMethod;

  public static final String SERIALIZED_NAME_KEY_MANAGER_PROVIDER = "keyManagerProvider";
  @SerializedName(SERIALIZED_NAME_KEY_MANAGER_PROVIDER)
  private String keyManagerProvider;

  public static final String SERIALIZED_NAME_TRUST_MANAGER_PROVIDER = "trustManagerProvider";
  @SerializedName(SERIALIZED_NAME_TRUST_MANAGER_PROVIDER)
  private String trustManagerProvider;

  public static final String SERIALIZED_NAME_ALLOWED_HEADER = "allowedHeader";
  @SerializedName(SERIALIZED_NAME_ALLOWED_HEADER)
  private List<String> allowedHeader = null;

  public static final String SERIALIZED_NAME_USER_NAME = "userName";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_SSL_CERT_NICKNAME = "sslCertNickname";
  @SerializedName(SERIALIZED_NAME_SSL_CERT_NICKNAME)
  private String sslCertNickname;

  public static final String SERIALIZED_NAME_CONNECT_TIMEOUT = "connectTimeout";
  @SerializedName(SERIALIZED_NAME_CONNECT_TIMEOUT)
  private String connectTimeout;

  public static final String SERIALIZED_NAME_RESPONSE_TIMEOUT = "responseTimeout";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TIMEOUT)
  private String responseTimeout;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public ApiExternalServerResponse() {
  }

  public ApiExternalServerResponse description(String description) {
    
    
    
    
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


  public ApiExternalServerResponse schemas(List<EnumapiExternalServerSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public ApiExternalServerResponse addSchemasItem(EnumapiExternalServerSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumapiExternalServerSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumapiExternalServerSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public ApiExternalServerResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the External Server
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the External Server")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ApiExternalServerResponse baseURL(String baseURL) {
    
    
    
    
    this.baseURL = baseURL;
    return this;
  }

   /**
   * The base URL of the external server, optionally including port number, for example \&quot;https://externalService:9031\&quot;.
   * @return baseURL
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The base URL of the external server, optionally including port number, for example \"https://externalService:9031\".")

  public String getBaseURL() {
    return baseURL;
  }


  public void setBaseURL(String baseURL) {
    
    
    
    this.baseURL = baseURL;
  }


  public ApiExternalServerResponse hostnameVerificationMethod(EnumexternalServerApiHostnameVerificationMethodProp hostnameVerificationMethod) {
    
    
    
    
    this.hostnameVerificationMethod = hostnameVerificationMethod;
    return this;
  }

   /**
   * Get hostnameVerificationMethod
   * @return hostnameVerificationMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumexternalServerApiHostnameVerificationMethodProp getHostnameVerificationMethod() {
    return hostnameVerificationMethod;
  }


  public void setHostnameVerificationMethod(EnumexternalServerApiHostnameVerificationMethodProp hostnameVerificationMethod) {
    
    
    
    this.hostnameVerificationMethod = hostnameVerificationMethod;
  }


  public ApiExternalServerResponse keyManagerProvider(String keyManagerProvider) {
    
    
    
    
    this.keyManagerProvider = keyManagerProvider;
    return this;
  }

   /**
   * The key manager provider to use if SSL (HTTPS) is to be used for connection-level security. When specifying a value for this property (except when using the Null key manager provider) you must ensure that the external server trusts this server&#39;s public certificate by adding this server&#39;s public certificate to the external server&#39;s trust store.
   * @return keyManagerProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key manager provider to use if SSL (HTTPS) is to be used for connection-level security. When specifying a value for this property (except when using the Null key manager provider) you must ensure that the external server trusts this server's public certificate by adding this server's public certificate to the external server's trust store.")

  public String getKeyManagerProvider() {
    return keyManagerProvider;
  }


  public void setKeyManagerProvider(String keyManagerProvider) {
    
    
    
    this.keyManagerProvider = keyManagerProvider;
  }


  public ApiExternalServerResponse trustManagerProvider(String trustManagerProvider) {
    
    
    
    
    this.trustManagerProvider = trustManagerProvider;
    return this;
  }

   /**
   * The trust manager provider to use if SSL (HTTPS) is to be used for connection-level security.
   * @return trustManagerProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The trust manager provider to use if SSL (HTTPS) is to be used for connection-level security.")

  public String getTrustManagerProvider() {
    return trustManagerProvider;
  }


  public void setTrustManagerProvider(String trustManagerProvider) {
    
    
    
    this.trustManagerProvider = trustManagerProvider;
  }


  public ApiExternalServerResponse allowedHeader(List<String> allowedHeader) {
    
    
    
    
    this.allowedHeader = allowedHeader;
    return this;
  }

  public ApiExternalServerResponse addAllowedHeaderItem(String allowedHeaderItem) {
    if (this.allowedHeader == null) {
      this.allowedHeader = new ArrayList<>();
    }
    this.allowedHeader.add(allowedHeaderItem);
    return this;
  }

   /**
   * A list of HTTP headers that will be forwarded by the PingAuthorize Server to the downstream API server.
   * @return allowedHeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of HTTP headers that will be forwarded by the PingAuthorize Server to the downstream API server.")

  public List<String> getAllowedHeader() {
    return allowedHeader;
  }


  public void setAllowedHeader(List<String> allowedHeader) {
    
    
    
    this.allowedHeader = allowedHeader;
  }


  public ApiExternalServerResponse userName(String userName) {
    
    
    
    
    this.userName = userName;
    return this;
  }

   /**
   * The name of the login account to use for HTTP requests to the downstream API server using basic authentication. This property is ignored unless an associated Gateway API Endpoint&#39;s http-auth-evaluation-behavior property is set to \&quot;evaluate-and-replace\&quot;.
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the login account to use for HTTP requests to the downstream API server using basic authentication. This property is ignored unless an associated Gateway API Endpoint's http-auth-evaluation-behavior property is set to \"evaluate-and-replace\".")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    
    
    
    this.userName = userName;
  }


  public ApiExternalServerResponse password(String password) {
    
    
    
    
    this.password = password;
    return this;
  }

   /**
   * The name of the login password to use for HTTP requests to the downstream API server using basic authentication. This property is ignored unless an associated Gateway API Endpoint&#39;s http-auth-evaluation-behavior property is set to \&quot;evaluate-and-replace\&quot;.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the login password to use for HTTP requests to the downstream API server using basic authentication. This property is ignored unless an associated Gateway API Endpoint's http-auth-evaluation-behavior property is set to \"evaluate-and-replace\".")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    
    
    
    this.password = password;
  }


  public ApiExternalServerResponse sslCertNickname(String sslCertNickname) {
    
    
    
    
    this.sslCertNickname = sslCertNickname;
    return this;
  }

   /**
   * The certificate alias within the keystore to use if SSL (HTTPS) is to be used for connection-level security. When specifying a value for this property you must ensure that the external server trusts this server&#39;s public certificate by adding this server&#39;s public certificate to the external server&#39;s trust store.
   * @return sslCertNickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The certificate alias within the keystore to use if SSL (HTTPS) is to be used for connection-level security. When specifying a value for this property you must ensure that the external server trusts this server's public certificate by adding this server's public certificate to the external server's trust store.")

  public String getSslCertNickname() {
    return sslCertNickname;
  }


  public void setSslCertNickname(String sslCertNickname) {
    
    
    
    this.sslCertNickname = sslCertNickname;
  }


  public ApiExternalServerResponse connectTimeout(String connectTimeout) {
    
    
    
    
    this.connectTimeout = connectTimeout;
    return this;
  }

   /**
   * Specifies the maximum length of time to wait for a connection to be established before aborting a request to the server.
   * @return connectTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the maximum length of time to wait for a connection to be established before aborting a request to the server.")

  public String getConnectTimeout() {
    return connectTimeout;
  }


  public void setConnectTimeout(String connectTimeout) {
    
    
    
    this.connectTimeout = connectTimeout;
  }


  public ApiExternalServerResponse responseTimeout(String responseTimeout) {
    
    
    
    
    this.responseTimeout = responseTimeout;
    return this;
  }

   /**
   * Specifies the maximum length of time to wait for response data to be read from an established connection before aborting a request to the server.
   * @return responseTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the maximum length of time to wait for response data to be read from an established connection before aborting a request to the server.")

  public String getResponseTimeout() {
    return responseTimeout;
  }


  public void setResponseTimeout(String responseTimeout) {
    
    
    
    this.responseTimeout = responseTimeout;
  }


  public ApiExternalServerResponse meta(MetaMeta meta) {
    
    
    
    
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


  public ApiExternalServerResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the ApiExternalServerResponse instance itself
   */
  public ApiExternalServerResponse putAdditionalProperty(String key, Object value) {
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
    ApiExternalServerResponse apiExternalServerResponse = (ApiExternalServerResponse) o;
    return Objects.equals(this.description, apiExternalServerResponse.description) &&
        Objects.equals(this.schemas, apiExternalServerResponse.schemas) &&
        Objects.equals(this.id, apiExternalServerResponse.id) &&
        Objects.equals(this.baseURL, apiExternalServerResponse.baseURL) &&
        Objects.equals(this.hostnameVerificationMethod, apiExternalServerResponse.hostnameVerificationMethod) &&
        Objects.equals(this.keyManagerProvider, apiExternalServerResponse.keyManagerProvider) &&
        Objects.equals(this.trustManagerProvider, apiExternalServerResponse.trustManagerProvider) &&
        Objects.equals(this.allowedHeader, apiExternalServerResponse.allowedHeader) &&
        Objects.equals(this.userName, apiExternalServerResponse.userName) &&
        Objects.equals(this.password, apiExternalServerResponse.password) &&
        Objects.equals(this.sslCertNickname, apiExternalServerResponse.sslCertNickname) &&
        Objects.equals(this.connectTimeout, apiExternalServerResponse.connectTimeout) &&
        Objects.equals(this.responseTimeout, apiExternalServerResponse.responseTimeout) &&
        Objects.equals(this.meta, apiExternalServerResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, apiExternalServerResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, apiExternalServerResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, id, baseURL, hostnameVerificationMethod, keyManagerProvider, trustManagerProvider, allowedHeader, userName, password, sslCertNickname, connectTimeout, responseTimeout, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiExternalServerResponse {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    baseURL: ").append(toIndentedString(baseURL)).append("\n");
    sb.append("    hostnameVerificationMethod: ").append(toIndentedString(hostnameVerificationMethod)).append("\n");
    sb.append("    keyManagerProvider: ").append(toIndentedString(keyManagerProvider)).append("\n");
    sb.append("    trustManagerProvider: ").append(toIndentedString(trustManagerProvider)).append("\n");
    sb.append("    allowedHeader: ").append(toIndentedString(allowedHeader)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    sslCertNickname: ").append(toIndentedString(sslCertNickname)).append("\n");
    sb.append("    connectTimeout: ").append(toIndentedString(connectTimeout)).append("\n");
    sb.append("    responseTimeout: ").append(toIndentedString(responseTimeout)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("id");
    openapiFields.add("baseURL");
    openapiFields.add("hostnameVerificationMethod");
    openapiFields.add("keyManagerProvider");
    openapiFields.add("trustManagerProvider");
    openapiFields.add("allowedHeader");
    openapiFields.add("userName");
    openapiFields.add("password");
    openapiFields.add("sslCertNickname");
    openapiFields.add("connectTimeout");
    openapiFields.add("responseTimeout");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("baseURL");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiExternalServerResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApiExternalServerResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiExternalServerResponse is not found in the empty JSON string", ApiExternalServerResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApiExternalServerResponse.openapiRequiredFields) {
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
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("baseURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseURL").toString()));
      }
      if ((jsonObj.get("keyManagerProvider") != null && !jsonObj.get("keyManagerProvider").isJsonNull()) && !jsonObj.get("keyManagerProvider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyManagerProvider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyManagerProvider").toString()));
      }
      if ((jsonObj.get("trustManagerProvider") != null && !jsonObj.get("trustManagerProvider").isJsonNull()) && !jsonObj.get("trustManagerProvider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trustManagerProvider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trustManagerProvider").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowedHeader") != null && !jsonObj.get("allowedHeader").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedHeader` to be an array in the JSON string but got `%s`", jsonObj.get("allowedHeader").toString()));
      }
      if ((jsonObj.get("userName") != null && !jsonObj.get("userName").isJsonNull()) && !jsonObj.get("userName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userName").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("sslCertNickname") != null && !jsonObj.get("sslCertNickname").isJsonNull()) && !jsonObj.get("sslCertNickname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sslCertNickname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sslCertNickname").toString()));
      }
      if ((jsonObj.get("connectTimeout") != null && !jsonObj.get("connectTimeout").isJsonNull()) && !jsonObj.get("connectTimeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connectTimeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connectTimeout").toString()));
      }
      if ((jsonObj.get("responseTimeout") != null && !jsonObj.get("responseTimeout").isJsonNull()) && !jsonObj.get("responseTimeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseTimeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responseTimeout").toString()));
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
       if (!ApiExternalServerResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiExternalServerResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiExternalServerResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiExternalServerResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiExternalServerResponse>() {
           @Override
           public void write(JsonWriter out, ApiExternalServerResponse value) throws IOException {
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
           public ApiExternalServerResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ApiExternalServerResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ApiExternalServerResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiExternalServerResponse
  * @throws IOException if the JSON string is invalid with respect to ApiExternalServerResponse
  */
  public static ApiExternalServerResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiExternalServerResponse.class);
  }

 /**
  * Convert an instance of ApiExternalServerResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

