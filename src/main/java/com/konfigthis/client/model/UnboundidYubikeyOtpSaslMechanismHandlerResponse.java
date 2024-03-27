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
import com.konfigthis.client.model.EnumunboundidYubikeyOtpSaslMechanismHandlerSchemaUrn;
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
 * UnboundidYubikeyOtpSaslMechanismHandlerResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UnboundidYubikeyOtpSaslMechanismHandlerResponse {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumunboundidYubikeyOtpSaslMechanismHandlerSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_YUBIKEY_CLIENT_I_D = "yubikeyClientID";
  @SerializedName(SERIALIZED_NAME_YUBIKEY_CLIENT_I_D)
  private String yubikeyClientID;

  public static final String SERIALIZED_NAME_YUBIKEY_A_P_I_KEY = "yubikeyAPIKey";
  @SerializedName(SERIALIZED_NAME_YUBIKEY_A_P_I_KEY)
  private String yubikeyAPIKey;

  public static final String SERIALIZED_NAME_YUBIKEY_A_P_I_KEY_PASSPHRASE_PROVIDER = "yubikeyAPIKeyPassphraseProvider";
  @SerializedName(SERIALIZED_NAME_YUBIKEY_A_P_I_KEY_PASSPHRASE_PROVIDER)
  private String yubikeyAPIKeyPassphraseProvider;

  public static final String SERIALIZED_NAME_YUBIKEY_VALIDATION_SERVER_BASE_U_R_L = "yubikeyValidationServerBaseURL";
  @SerializedName(SERIALIZED_NAME_YUBIKEY_VALIDATION_SERVER_BASE_U_R_L)
  private List<String> yubikeyValidationServerBaseURL = new ArrayList<>();

  public static final String SERIALIZED_NAME_HTTP_PROXY_EXTERNAL_SERVER = "httpProxyExternalServer";
  @SerializedName(SERIALIZED_NAME_HTTP_PROXY_EXTERNAL_SERVER)
  private String httpProxyExternalServer;

  public static final String SERIALIZED_NAME_HTTP_CONNECT_TIMEOUT = "httpConnectTimeout";
  @SerializedName(SERIALIZED_NAME_HTTP_CONNECT_TIMEOUT)
  private String httpConnectTimeout;

  public static final String SERIALIZED_NAME_HTTP_RESPONSE_TIMEOUT = "httpResponseTimeout";
  @SerializedName(SERIALIZED_NAME_HTTP_RESPONSE_TIMEOUT)
  private String httpResponseTimeout;

  public static final String SERIALIZED_NAME_IDENTITY_MAPPER = "identityMapper";
  @SerializedName(SERIALIZED_NAME_IDENTITY_MAPPER)
  private String identityMapper;

  public static final String SERIALIZED_NAME_REQUIRE_STATIC_PASSWORD = "requireStaticPassword";
  @SerializedName(SERIALIZED_NAME_REQUIRE_STATIC_PASSWORD)
  private Boolean requireStaticPassword;

  public static final String SERIALIZED_NAME_KEY_MANAGER_PROVIDER = "keyManagerProvider";
  @SerializedName(SERIALIZED_NAME_KEY_MANAGER_PROVIDER)
  private String keyManagerProvider;

  public static final String SERIALIZED_NAME_TRUST_MANAGER_PROVIDER = "trustManagerProvider";
  @SerializedName(SERIALIZED_NAME_TRUST_MANAGER_PROVIDER)
  private String trustManagerProvider;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public UnboundidYubikeyOtpSaslMechanismHandlerResponse() {
  }

  public UnboundidYubikeyOtpSaslMechanismHandlerResponse description(String description) {
    
    
    
    
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


  public UnboundidYubikeyOtpSaslMechanismHandlerResponse schemas(List<EnumunboundidYubikeyOtpSaslMechanismHandlerSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public UnboundidYubikeyOtpSaslMechanismHandlerResponse addSchemasItem(EnumunboundidYubikeyOtpSaslMechanismHandlerSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumunboundidYubikeyOtpSaslMechanismHandlerSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumunboundidYubikeyOtpSaslMechanismHandlerSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public UnboundidYubikeyOtpSaslMechanismHandlerResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the SASL Mechanism Handler
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the SASL Mechanism Handler")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public UnboundidYubikeyOtpSaslMechanismHandlerResponse yubikeyClientID(String yubikeyClientID) {
    
    
    
    
    this.yubikeyClientID = yubikeyClientID;
    return this;
  }

   /**
   * The client ID to include in requests to the YubiKey validation server. A client ID and API key may be obtained for free from https://upgrade.yubico.com/getapikey/.
   * @return yubikeyClientID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The client ID to include in requests to the YubiKey validation server. A client ID and API key may be obtained for free from https://upgrade.yubico.com/getapikey/.")

  public String getYubikeyClientID() {
    return yubikeyClientID;
  }


  public void setYubikeyClientID(String yubikeyClientID) {
    
    
    
    this.yubikeyClientID = yubikeyClientID;
  }


  public UnboundidYubikeyOtpSaslMechanismHandlerResponse yubikeyAPIKey(String yubikeyAPIKey) {
    
    
    
    
    this.yubikeyAPIKey = yubikeyAPIKey;
    return this;
  }

   /**
   * The API key needed to verify signatures generated by the YubiKey validation server. A client ID and API key may be obtained for free from https://upgrade.yubico.com/getapikey/.
   * @return yubikeyAPIKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The API key needed to verify signatures generated by the YubiKey validation server. A client ID and API key may be obtained for free from https://upgrade.yubico.com/getapikey/.")

  public String getYubikeyAPIKey() {
    return yubikeyAPIKey;
  }


  public void setYubikeyAPIKey(String yubikeyAPIKey) {
    
    
    
    this.yubikeyAPIKey = yubikeyAPIKey;
  }


  public UnboundidYubikeyOtpSaslMechanismHandlerResponse yubikeyAPIKeyPassphraseProvider(String yubikeyAPIKeyPassphraseProvider) {
    
    
    
    
    this.yubikeyAPIKeyPassphraseProvider = yubikeyAPIKeyPassphraseProvider;
    return this;
  }

   /**
   * The passphrase provider to use to obtain the API key needed to verify signatures generated by the YubiKey validation server. A client ID and API key may be obtained for free from https://upgrade.yubico.com/getapikey/.
   * @return yubikeyAPIKeyPassphraseProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The passphrase provider to use to obtain the API key needed to verify signatures generated by the YubiKey validation server. A client ID and API key may be obtained for free from https://upgrade.yubico.com/getapikey/.")

  public String getYubikeyAPIKeyPassphraseProvider() {
    return yubikeyAPIKeyPassphraseProvider;
  }


  public void setYubikeyAPIKeyPassphraseProvider(String yubikeyAPIKeyPassphraseProvider) {
    
    
    
    this.yubikeyAPIKeyPassphraseProvider = yubikeyAPIKeyPassphraseProvider;
  }


  public UnboundidYubikeyOtpSaslMechanismHandlerResponse yubikeyValidationServerBaseURL(List<String> yubikeyValidationServerBaseURL) {
    
    
    
    
    this.yubikeyValidationServerBaseURL = yubikeyValidationServerBaseURL;
    return this;
  }

  public UnboundidYubikeyOtpSaslMechanismHandlerResponse addYubikeyValidationServerBaseURLItem(String yubikeyValidationServerBaseURLItem) {
    this.yubikeyValidationServerBaseURL.add(yubikeyValidationServerBaseURLItem);
    return this;
  }

   /**
   * The base URL of the validation server to use to verify one-time passwords. You should only need to change the value if you wish to use your own validation server instead of using one of the Yubico servers. The server must use the YubiKey Validation Protocol version 2.0.
   * @return yubikeyValidationServerBaseURL
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The base URL of the validation server to use to verify one-time passwords. You should only need to change the value if you wish to use your own validation server instead of using one of the Yubico servers. The server must use the YubiKey Validation Protocol version 2.0.")

  public List<String> getYubikeyValidationServerBaseURL() {
    return yubikeyValidationServerBaseURL;
  }


  public void setYubikeyValidationServerBaseURL(List<String> yubikeyValidationServerBaseURL) {
    
    
    
    this.yubikeyValidationServerBaseURL = yubikeyValidationServerBaseURL;
  }


  public UnboundidYubikeyOtpSaslMechanismHandlerResponse httpProxyExternalServer(String httpProxyExternalServer) {
    
    
    
    
    this.httpProxyExternalServer = httpProxyExternalServer;
    return this;
  }

   /**
   * A reference to an HTTP proxy server that should be used for requests sent to the YubiKey validation service.
   * @return httpProxyExternalServer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to an HTTP proxy server that should be used for requests sent to the YubiKey validation service.")

  public String getHttpProxyExternalServer() {
    return httpProxyExternalServer;
  }


  public void setHttpProxyExternalServer(String httpProxyExternalServer) {
    
    
    
    this.httpProxyExternalServer = httpProxyExternalServer;
  }


  public UnboundidYubikeyOtpSaslMechanismHandlerResponse httpConnectTimeout(String httpConnectTimeout) {
    
    
    
    
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


  public UnboundidYubikeyOtpSaslMechanismHandlerResponse httpResponseTimeout(String httpResponseTimeout) {
    
    
    
    
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


  public UnboundidYubikeyOtpSaslMechanismHandlerResponse identityMapper(String identityMapper) {
    
    
    
    
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


  public UnboundidYubikeyOtpSaslMechanismHandlerResponse requireStaticPassword(Boolean requireStaticPassword) {
    
    
    
    
    this.requireStaticPassword = requireStaticPassword;
    return this;
  }

   /**
   * Indicates whether a user will be required to provide a static password when authenticating via the UNBOUNDID-YUBIKEY-OTP SASL mechanism.
   * @return requireStaticPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether a user will be required to provide a static password when authenticating via the UNBOUNDID-YUBIKEY-OTP SASL mechanism.")

  public Boolean getRequireStaticPassword() {
    return requireStaticPassword;
  }


  public void setRequireStaticPassword(Boolean requireStaticPassword) {
    
    
    
    this.requireStaticPassword = requireStaticPassword;
  }


  public UnboundidYubikeyOtpSaslMechanismHandlerResponse keyManagerProvider(String keyManagerProvider) {
    
    
    
    
    this.keyManagerProvider = keyManagerProvider;
    return this;
  }

   /**
   * Specifies which key manager provider should be used to obtain a client certificate to present to the validation server when performing HTTPS communication. This may be left undefined if communication will not be secured with HTTPS, or if there is no need to present a client certificate to the validation service.
   * @return keyManagerProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies which key manager provider should be used to obtain a client certificate to present to the validation server when performing HTTPS communication. This may be left undefined if communication will not be secured with HTTPS, or if there is no need to present a client certificate to the validation service.")

  public String getKeyManagerProvider() {
    return keyManagerProvider;
  }


  public void setKeyManagerProvider(String keyManagerProvider) {
    
    
    
    this.keyManagerProvider = keyManagerProvider;
  }


  public UnboundidYubikeyOtpSaslMechanismHandlerResponse trustManagerProvider(String trustManagerProvider) {
    
    
    
    
    this.trustManagerProvider = trustManagerProvider;
    return this;
  }

   /**
   * Specifies which trust manager provider should be used to determine whether to trust the certificate presented by the server when performing HTTPS communication. This may be left undefined if HTTPS communication is not needed, or if the validation service presents a certificate that is trusted by the default JVM configuration (which should be the case for the validation servers that Yubico provides, but may not be the case if an alternate validation server is configured).
   * @return trustManagerProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies which trust manager provider should be used to determine whether to trust the certificate presented by the server when performing HTTPS communication. This may be left undefined if HTTPS communication is not needed, or if the validation service presents a certificate that is trusted by the default JVM configuration (which should be the case for the validation servers that Yubico provides, but may not be the case if an alternate validation server is configured).")

  public String getTrustManagerProvider() {
    return trustManagerProvider;
  }


  public void setTrustManagerProvider(String trustManagerProvider) {
    
    
    
    this.trustManagerProvider = trustManagerProvider;
  }


  public UnboundidYubikeyOtpSaslMechanismHandlerResponse enabled(Boolean enabled) {
    
    
    
    
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


  public UnboundidYubikeyOtpSaslMechanismHandlerResponse meta(MetaMeta meta) {
    
    
    
    
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


  public UnboundidYubikeyOtpSaslMechanismHandlerResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the UnboundidYubikeyOtpSaslMechanismHandlerResponse instance itself
   */
  public UnboundidYubikeyOtpSaslMechanismHandlerResponse putAdditionalProperty(String key, Object value) {
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
    UnboundidYubikeyOtpSaslMechanismHandlerResponse unboundidYubikeyOtpSaslMechanismHandlerResponse = (UnboundidYubikeyOtpSaslMechanismHandlerResponse) o;
    return Objects.equals(this.description, unboundidYubikeyOtpSaslMechanismHandlerResponse.description) &&
        Objects.equals(this.schemas, unboundidYubikeyOtpSaslMechanismHandlerResponse.schemas) &&
        Objects.equals(this.id, unboundidYubikeyOtpSaslMechanismHandlerResponse.id) &&
        Objects.equals(this.yubikeyClientID, unboundidYubikeyOtpSaslMechanismHandlerResponse.yubikeyClientID) &&
        Objects.equals(this.yubikeyAPIKey, unboundidYubikeyOtpSaslMechanismHandlerResponse.yubikeyAPIKey) &&
        Objects.equals(this.yubikeyAPIKeyPassphraseProvider, unboundidYubikeyOtpSaslMechanismHandlerResponse.yubikeyAPIKeyPassphraseProvider) &&
        Objects.equals(this.yubikeyValidationServerBaseURL, unboundidYubikeyOtpSaslMechanismHandlerResponse.yubikeyValidationServerBaseURL) &&
        Objects.equals(this.httpProxyExternalServer, unboundidYubikeyOtpSaslMechanismHandlerResponse.httpProxyExternalServer) &&
        Objects.equals(this.httpConnectTimeout, unboundidYubikeyOtpSaslMechanismHandlerResponse.httpConnectTimeout) &&
        Objects.equals(this.httpResponseTimeout, unboundidYubikeyOtpSaslMechanismHandlerResponse.httpResponseTimeout) &&
        Objects.equals(this.identityMapper, unboundidYubikeyOtpSaslMechanismHandlerResponse.identityMapper) &&
        Objects.equals(this.requireStaticPassword, unboundidYubikeyOtpSaslMechanismHandlerResponse.requireStaticPassword) &&
        Objects.equals(this.keyManagerProvider, unboundidYubikeyOtpSaslMechanismHandlerResponse.keyManagerProvider) &&
        Objects.equals(this.trustManagerProvider, unboundidYubikeyOtpSaslMechanismHandlerResponse.trustManagerProvider) &&
        Objects.equals(this.enabled, unboundidYubikeyOtpSaslMechanismHandlerResponse.enabled) &&
        Objects.equals(this.meta, unboundidYubikeyOtpSaslMechanismHandlerResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, unboundidYubikeyOtpSaslMechanismHandlerResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, unboundidYubikeyOtpSaslMechanismHandlerResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, id, yubikeyClientID, yubikeyAPIKey, yubikeyAPIKeyPassphraseProvider, yubikeyValidationServerBaseURL, httpProxyExternalServer, httpConnectTimeout, httpResponseTimeout, identityMapper, requireStaticPassword, keyManagerProvider, trustManagerProvider, enabled, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnboundidYubikeyOtpSaslMechanismHandlerResponse {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    yubikeyClientID: ").append(toIndentedString(yubikeyClientID)).append("\n");
    sb.append("    yubikeyAPIKey: ").append(toIndentedString(yubikeyAPIKey)).append("\n");
    sb.append("    yubikeyAPIKeyPassphraseProvider: ").append(toIndentedString(yubikeyAPIKeyPassphraseProvider)).append("\n");
    sb.append("    yubikeyValidationServerBaseURL: ").append(toIndentedString(yubikeyValidationServerBaseURL)).append("\n");
    sb.append("    httpProxyExternalServer: ").append(toIndentedString(httpProxyExternalServer)).append("\n");
    sb.append("    httpConnectTimeout: ").append(toIndentedString(httpConnectTimeout)).append("\n");
    sb.append("    httpResponseTimeout: ").append(toIndentedString(httpResponseTimeout)).append("\n");
    sb.append("    identityMapper: ").append(toIndentedString(identityMapper)).append("\n");
    sb.append("    requireStaticPassword: ").append(toIndentedString(requireStaticPassword)).append("\n");
    sb.append("    keyManagerProvider: ").append(toIndentedString(keyManagerProvider)).append("\n");
    sb.append("    trustManagerProvider: ").append(toIndentedString(trustManagerProvider)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("id");
    openapiFields.add("yubikeyClientID");
    openapiFields.add("yubikeyAPIKey");
    openapiFields.add("yubikeyAPIKeyPassphraseProvider");
    openapiFields.add("yubikeyValidationServerBaseURL");
    openapiFields.add("httpProxyExternalServer");
    openapiFields.add("httpConnectTimeout");
    openapiFields.add("httpResponseTimeout");
    openapiFields.add("identityMapper");
    openapiFields.add("requireStaticPassword");
    openapiFields.add("keyManagerProvider");
    openapiFields.add("trustManagerProvider");
    openapiFields.add("enabled");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("yubikeyValidationServerBaseURL");
    openapiRequiredFields.add("identityMapper");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UnboundidYubikeyOtpSaslMechanismHandlerResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UnboundidYubikeyOtpSaslMechanismHandlerResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UnboundidYubikeyOtpSaslMechanismHandlerResponse is not found in the empty JSON string", UnboundidYubikeyOtpSaslMechanismHandlerResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UnboundidYubikeyOtpSaslMechanismHandlerResponse.openapiRequiredFields) {
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
      if ((jsonObj.get("yubikeyClientID") != null && !jsonObj.get("yubikeyClientID").isJsonNull()) && !jsonObj.get("yubikeyClientID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `yubikeyClientID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("yubikeyClientID").toString()));
      }
      if ((jsonObj.get("yubikeyAPIKey") != null && !jsonObj.get("yubikeyAPIKey").isJsonNull()) && !jsonObj.get("yubikeyAPIKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `yubikeyAPIKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("yubikeyAPIKey").toString()));
      }
      if ((jsonObj.get("yubikeyAPIKeyPassphraseProvider") != null && !jsonObj.get("yubikeyAPIKeyPassphraseProvider").isJsonNull()) && !jsonObj.get("yubikeyAPIKeyPassphraseProvider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `yubikeyAPIKeyPassphraseProvider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("yubikeyAPIKeyPassphraseProvider").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("yubikeyValidationServerBaseURL") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("yubikeyValidationServerBaseURL").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `yubikeyValidationServerBaseURL` to be an array in the JSON string but got `%s`", jsonObj.get("yubikeyValidationServerBaseURL").toString()));
      }
      if ((jsonObj.get("httpProxyExternalServer") != null && !jsonObj.get("httpProxyExternalServer").isJsonNull()) && !jsonObj.get("httpProxyExternalServer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `httpProxyExternalServer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("httpProxyExternalServer").toString()));
      }
      if ((jsonObj.get("httpConnectTimeout") != null && !jsonObj.get("httpConnectTimeout").isJsonNull()) && !jsonObj.get("httpConnectTimeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `httpConnectTimeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("httpConnectTimeout").toString()));
      }
      if ((jsonObj.get("httpResponseTimeout") != null && !jsonObj.get("httpResponseTimeout").isJsonNull()) && !jsonObj.get("httpResponseTimeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `httpResponseTimeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("httpResponseTimeout").toString()));
      }
      if (!jsonObj.get("identityMapper").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identityMapper` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identityMapper").toString()));
      }
      if ((jsonObj.get("keyManagerProvider") != null && !jsonObj.get("keyManagerProvider").isJsonNull()) && !jsonObj.get("keyManagerProvider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyManagerProvider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyManagerProvider").toString()));
      }
      if ((jsonObj.get("trustManagerProvider") != null && !jsonObj.get("trustManagerProvider").isJsonNull()) && !jsonObj.get("trustManagerProvider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trustManagerProvider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trustManagerProvider").toString()));
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
       if (!UnboundidYubikeyOtpSaslMechanismHandlerResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UnboundidYubikeyOtpSaslMechanismHandlerResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UnboundidYubikeyOtpSaslMechanismHandlerResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UnboundidYubikeyOtpSaslMechanismHandlerResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UnboundidYubikeyOtpSaslMechanismHandlerResponse>() {
           @Override
           public void write(JsonWriter out, UnboundidYubikeyOtpSaslMechanismHandlerResponse value) throws IOException {
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
           public UnboundidYubikeyOtpSaslMechanismHandlerResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UnboundidYubikeyOtpSaslMechanismHandlerResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UnboundidYubikeyOtpSaslMechanismHandlerResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UnboundidYubikeyOtpSaslMechanismHandlerResponse
  * @throws IOException if the JSON string is invalid with respect to UnboundidYubikeyOtpSaslMechanismHandlerResponse
  */
  public static UnboundidYubikeyOtpSaslMechanismHandlerResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UnboundidYubikeyOtpSaslMechanismHandlerResponse.class);
  }

 /**
  * Convert an instance of UnboundidYubikeyOtpSaslMechanismHandlerResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

