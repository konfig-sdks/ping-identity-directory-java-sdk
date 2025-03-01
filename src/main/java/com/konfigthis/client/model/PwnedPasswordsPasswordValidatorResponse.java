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
import com.konfigthis.client.model.EnumpwnedPasswordsPasswordValidatorSchemaUrn;
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
 * PwnedPasswordsPasswordValidatorResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PwnedPasswordsPasswordValidatorResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumpwnedPasswordsPasswordValidatorSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_PWNED_PASSWORDS_BASE_U_R_L = "pwnedPasswordsBaseURL";
  @SerializedName(SERIALIZED_NAME_PWNED_PASSWORDS_BASE_U_R_L)
  private String pwnedPasswordsBaseURL;

  public static final String SERIALIZED_NAME_HTTP_PROXY_EXTERNAL_SERVER = "httpProxyExternalServer";
  @SerializedName(SERIALIZED_NAME_HTTP_PROXY_EXTERNAL_SERVER)
  private String httpProxyExternalServer;

  public static final String SERIALIZED_NAME_HTTP_CONNECT_TIMEOUT = "httpConnectTimeout";
  @SerializedName(SERIALIZED_NAME_HTTP_CONNECT_TIMEOUT)
  private String httpConnectTimeout;

  public static final String SERIALIZED_NAME_HTTP_RESPONSE_TIMEOUT = "httpResponseTimeout";
  @SerializedName(SERIALIZED_NAME_HTTP_RESPONSE_TIMEOUT)
  private String httpResponseTimeout;

  public static final String SERIALIZED_NAME_INVOKE_FOR_ADD = "invokeForAdd";
  @SerializedName(SERIALIZED_NAME_INVOKE_FOR_ADD)
  private Boolean invokeForAdd;

  public static final String SERIALIZED_NAME_INVOKE_FOR_SELF_CHANGE = "invokeForSelfChange";
  @SerializedName(SERIALIZED_NAME_INVOKE_FOR_SELF_CHANGE)
  private Boolean invokeForSelfChange;

  public static final String SERIALIZED_NAME_INVOKE_FOR_ADMIN_RESET = "invokeForAdminReset";
  @SerializedName(SERIALIZED_NAME_INVOKE_FOR_ADMIN_RESET)
  private Boolean invokeForAdminReset;

  public static final String SERIALIZED_NAME_ACCEPT_PASSWORD_ON_SERVICE_ERROR = "acceptPasswordOnServiceError";
  @SerializedName(SERIALIZED_NAME_ACCEPT_PASSWORD_ON_SERVICE_ERROR)
  private Boolean acceptPasswordOnServiceError;

  public static final String SERIALIZED_NAME_KEY_MANAGER_PROVIDER = "keyManagerProvider";
  @SerializedName(SERIALIZED_NAME_KEY_MANAGER_PROVIDER)
  private String keyManagerProvider;

  public static final String SERIALIZED_NAME_TRUST_MANAGER_PROVIDER = "trustManagerProvider";
  @SerializedName(SERIALIZED_NAME_TRUST_MANAGER_PROVIDER)
  private String trustManagerProvider;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_VALIDATOR_REQUIREMENT_DESCRIPTION = "validatorRequirementDescription";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_REQUIREMENT_DESCRIPTION)
  private String validatorRequirementDescription;

  public static final String SERIALIZED_NAME_VALIDATOR_FAILURE_MESSAGE = "validatorFailureMessage";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_FAILURE_MESSAGE)
  private String validatorFailureMessage;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public PwnedPasswordsPasswordValidatorResponse() {
  }

  public PwnedPasswordsPasswordValidatorResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Password Validator
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the Password Validator")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public PwnedPasswordsPasswordValidatorResponse description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Password Validator
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Password Validator")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public PwnedPasswordsPasswordValidatorResponse schemas(List<EnumpwnedPasswordsPasswordValidatorSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public PwnedPasswordsPasswordValidatorResponse addSchemasItem(EnumpwnedPasswordsPasswordValidatorSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumpwnedPasswordsPasswordValidatorSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumpwnedPasswordsPasswordValidatorSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public PwnedPasswordsPasswordValidatorResponse pwnedPasswordsBaseURL(String pwnedPasswordsBaseURL) {
    
    
    
    
    this.pwnedPasswordsBaseURL = pwnedPasswordsBaseURL;
    return this;
  }

   /**
   * The base URL for requests used to interact with the Pwned Passwords service. The first five characters of the hexadecimal representation of the unsalted SHA-1 digest of a proposed password will be appended to this base URL to construct the HTTP GET request used to obtain information about potential matches.
   * @return pwnedPasswordsBaseURL
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The base URL for requests used to interact with the Pwned Passwords service. The first five characters of the hexadecimal representation of the unsalted SHA-1 digest of a proposed password will be appended to this base URL to construct the HTTP GET request used to obtain information about potential matches.")

  public String getPwnedPasswordsBaseURL() {
    return pwnedPasswordsBaseURL;
  }


  public void setPwnedPasswordsBaseURL(String pwnedPasswordsBaseURL) {
    
    
    
    this.pwnedPasswordsBaseURL = pwnedPasswordsBaseURL;
  }


  public PwnedPasswordsPasswordValidatorResponse httpProxyExternalServer(String httpProxyExternalServer) {
    
    
    
    
    this.httpProxyExternalServer = httpProxyExternalServer;
    return this;
  }

   /**
   * A reference to an HTTP proxy server that should be used for requests sent to the Pwned Passwords service.
   * @return httpProxyExternalServer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to an HTTP proxy server that should be used for requests sent to the Pwned Passwords service.")

  public String getHttpProxyExternalServer() {
    return httpProxyExternalServer;
  }


  public void setHttpProxyExternalServer(String httpProxyExternalServer) {
    
    
    
    this.httpProxyExternalServer = httpProxyExternalServer;
  }


  public PwnedPasswordsPasswordValidatorResponse httpConnectTimeout(String httpConnectTimeout) {
    
    
    
    
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


  public PwnedPasswordsPasswordValidatorResponse httpResponseTimeout(String httpResponseTimeout) {
    
    
    
    
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


  public PwnedPasswordsPasswordValidatorResponse invokeForAdd(Boolean invokeForAdd) {
    
    
    
    
    this.invokeForAdd = invokeForAdd;
    return this;
  }

   /**
   * Indicates whether this password validator should be used to validate clear-text passwords provided in LDAP add requests.
   * @return invokeForAdd
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether this password validator should be used to validate clear-text passwords provided in LDAP add requests.")

  public Boolean getInvokeForAdd() {
    return invokeForAdd;
  }


  public void setInvokeForAdd(Boolean invokeForAdd) {
    
    
    
    this.invokeForAdd = invokeForAdd;
  }


  public PwnedPasswordsPasswordValidatorResponse invokeForSelfChange(Boolean invokeForSelfChange) {
    
    
    
    
    this.invokeForSelfChange = invokeForSelfChange;
    return this;
  }

   /**
   * Indicates whether this password validator should be used to validate clear-text passwords provided by an end user in the course of changing their own password.
   * @return invokeForSelfChange
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether this password validator should be used to validate clear-text passwords provided by an end user in the course of changing their own password.")

  public Boolean getInvokeForSelfChange() {
    return invokeForSelfChange;
  }


  public void setInvokeForSelfChange(Boolean invokeForSelfChange) {
    
    
    
    this.invokeForSelfChange = invokeForSelfChange;
  }


  public PwnedPasswordsPasswordValidatorResponse invokeForAdminReset(Boolean invokeForAdminReset) {
    
    
    
    
    this.invokeForAdminReset = invokeForAdminReset;
    return this;
  }

   /**
   * Indicates whether this password validator should be used to validate clear-text passwords provided by administrators when changing the password for another user.
   * @return invokeForAdminReset
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether this password validator should be used to validate clear-text passwords provided by administrators when changing the password for another user.")

  public Boolean getInvokeForAdminReset() {
    return invokeForAdminReset;
  }


  public void setInvokeForAdminReset(Boolean invokeForAdminReset) {
    
    
    
    this.invokeForAdminReset = invokeForAdminReset;
  }


  public PwnedPasswordsPasswordValidatorResponse acceptPasswordOnServiceError(Boolean acceptPasswordOnServiceError) {
    
    
    
    
    this.acceptPasswordOnServiceError = acceptPasswordOnServiceError;
    return this;
  }

   /**
   * Indicates whether to accept the proposed password if an error occurs while attempting to interact with the Pwned Passwords service.
   * @return acceptPasswordOnServiceError
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether to accept the proposed password if an error occurs while attempting to interact with the Pwned Passwords service.")

  public Boolean getAcceptPasswordOnServiceError() {
    return acceptPasswordOnServiceError;
  }


  public void setAcceptPasswordOnServiceError(Boolean acceptPasswordOnServiceError) {
    
    
    
    this.acceptPasswordOnServiceError = acceptPasswordOnServiceError;
  }


  public PwnedPasswordsPasswordValidatorResponse keyManagerProvider(String keyManagerProvider) {
    
    
    
    
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


  public PwnedPasswordsPasswordValidatorResponse trustManagerProvider(String trustManagerProvider) {
    
    
    
    
    this.trustManagerProvider = trustManagerProvider;
    return this;
  }

   /**
   * Specifies which trust manager provider should be used to determine whether to trust the certificate presented by the server when performing HTTPS communication. This may be left undefined if HTTPS communication is not needed, or if the validation service presents a certificate that is trusted by the default JVM configuration (which should be the case for the Pwned Password servers).
   * @return trustManagerProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies which trust manager provider should be used to determine whether to trust the certificate presented by the server when performing HTTPS communication. This may be left undefined if HTTPS communication is not needed, or if the validation service presents a certificate that is trusted by the default JVM configuration (which should be the case for the Pwned Password servers).")

  public String getTrustManagerProvider() {
    return trustManagerProvider;
  }


  public void setTrustManagerProvider(String trustManagerProvider) {
    
    
    
    this.trustManagerProvider = trustManagerProvider;
  }


  public PwnedPasswordsPasswordValidatorResponse enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the password validator is enabled for use.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether the password validator is enabled for use.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public PwnedPasswordsPasswordValidatorResponse validatorRequirementDescription(String validatorRequirementDescription) {
    
    
    
    
    this.validatorRequirementDescription = validatorRequirementDescription;
    return this;
  }

   /**
   * Specifies a message that can be used to describe the requirements imposed by this password validator to end users. If a value is provided for this property, then it will override any description that may have otherwise been generated by the validator.
   * @return validatorRequirementDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a message that can be used to describe the requirements imposed by this password validator to end users. If a value is provided for this property, then it will override any description that may have otherwise been generated by the validator.")

  public String getValidatorRequirementDescription() {
    return validatorRequirementDescription;
  }


  public void setValidatorRequirementDescription(String validatorRequirementDescription) {
    
    
    
    this.validatorRequirementDescription = validatorRequirementDescription;
  }


  public PwnedPasswordsPasswordValidatorResponse validatorFailureMessage(String validatorFailureMessage) {
    
    
    
    
    this.validatorFailureMessage = validatorFailureMessage;
    return this;
  }

   /**
   * Specifies a message that may be provided to the end user in the event that a proposed password is rejected by this validator. If a value is provided for this property, then it will override any failure message that may have otherwise been generated by the validator.
   * @return validatorFailureMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a message that may be provided to the end user in the event that a proposed password is rejected by this validator. If a value is provided for this property, then it will override any failure message that may have otherwise been generated by the validator.")

  public String getValidatorFailureMessage() {
    return validatorFailureMessage;
  }


  public void setValidatorFailureMessage(String validatorFailureMessage) {
    
    
    
    this.validatorFailureMessage = validatorFailureMessage;
  }


  public PwnedPasswordsPasswordValidatorResponse meta(MetaMeta meta) {
    
    
    
    
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


  public PwnedPasswordsPasswordValidatorResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the PwnedPasswordsPasswordValidatorResponse instance itself
   */
  public PwnedPasswordsPasswordValidatorResponse putAdditionalProperty(String key, Object value) {
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
    PwnedPasswordsPasswordValidatorResponse pwnedPasswordsPasswordValidatorResponse = (PwnedPasswordsPasswordValidatorResponse) o;
    return Objects.equals(this.id, pwnedPasswordsPasswordValidatorResponse.id) &&
        Objects.equals(this.description, pwnedPasswordsPasswordValidatorResponse.description) &&
        Objects.equals(this.schemas, pwnedPasswordsPasswordValidatorResponse.schemas) &&
        Objects.equals(this.pwnedPasswordsBaseURL, pwnedPasswordsPasswordValidatorResponse.pwnedPasswordsBaseURL) &&
        Objects.equals(this.httpProxyExternalServer, pwnedPasswordsPasswordValidatorResponse.httpProxyExternalServer) &&
        Objects.equals(this.httpConnectTimeout, pwnedPasswordsPasswordValidatorResponse.httpConnectTimeout) &&
        Objects.equals(this.httpResponseTimeout, pwnedPasswordsPasswordValidatorResponse.httpResponseTimeout) &&
        Objects.equals(this.invokeForAdd, pwnedPasswordsPasswordValidatorResponse.invokeForAdd) &&
        Objects.equals(this.invokeForSelfChange, pwnedPasswordsPasswordValidatorResponse.invokeForSelfChange) &&
        Objects.equals(this.invokeForAdminReset, pwnedPasswordsPasswordValidatorResponse.invokeForAdminReset) &&
        Objects.equals(this.acceptPasswordOnServiceError, pwnedPasswordsPasswordValidatorResponse.acceptPasswordOnServiceError) &&
        Objects.equals(this.keyManagerProvider, pwnedPasswordsPasswordValidatorResponse.keyManagerProvider) &&
        Objects.equals(this.trustManagerProvider, pwnedPasswordsPasswordValidatorResponse.trustManagerProvider) &&
        Objects.equals(this.enabled, pwnedPasswordsPasswordValidatorResponse.enabled) &&
        Objects.equals(this.validatorRequirementDescription, pwnedPasswordsPasswordValidatorResponse.validatorRequirementDescription) &&
        Objects.equals(this.validatorFailureMessage, pwnedPasswordsPasswordValidatorResponse.validatorFailureMessage) &&
        Objects.equals(this.meta, pwnedPasswordsPasswordValidatorResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, pwnedPasswordsPasswordValidatorResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, pwnedPasswordsPasswordValidatorResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, schemas, pwnedPasswordsBaseURL, httpProxyExternalServer, httpConnectTimeout, httpResponseTimeout, invokeForAdd, invokeForSelfChange, invokeForAdminReset, acceptPasswordOnServiceError, keyManagerProvider, trustManagerProvider, enabled, validatorRequirementDescription, validatorFailureMessage, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PwnedPasswordsPasswordValidatorResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    pwnedPasswordsBaseURL: ").append(toIndentedString(pwnedPasswordsBaseURL)).append("\n");
    sb.append("    httpProxyExternalServer: ").append(toIndentedString(httpProxyExternalServer)).append("\n");
    sb.append("    httpConnectTimeout: ").append(toIndentedString(httpConnectTimeout)).append("\n");
    sb.append("    httpResponseTimeout: ").append(toIndentedString(httpResponseTimeout)).append("\n");
    sb.append("    invokeForAdd: ").append(toIndentedString(invokeForAdd)).append("\n");
    sb.append("    invokeForSelfChange: ").append(toIndentedString(invokeForSelfChange)).append("\n");
    sb.append("    invokeForAdminReset: ").append(toIndentedString(invokeForAdminReset)).append("\n");
    sb.append("    acceptPasswordOnServiceError: ").append(toIndentedString(acceptPasswordOnServiceError)).append("\n");
    sb.append("    keyManagerProvider: ").append(toIndentedString(keyManagerProvider)).append("\n");
    sb.append("    trustManagerProvider: ").append(toIndentedString(trustManagerProvider)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    validatorRequirementDescription: ").append(toIndentedString(validatorRequirementDescription)).append("\n");
    sb.append("    validatorFailureMessage: ").append(toIndentedString(validatorFailureMessage)).append("\n");
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
    openapiFields.add("pwnedPasswordsBaseURL");
    openapiFields.add("httpProxyExternalServer");
    openapiFields.add("httpConnectTimeout");
    openapiFields.add("httpResponseTimeout");
    openapiFields.add("invokeForAdd");
    openapiFields.add("invokeForSelfChange");
    openapiFields.add("invokeForAdminReset");
    openapiFields.add("acceptPasswordOnServiceError");
    openapiFields.add("keyManagerProvider");
    openapiFields.add("trustManagerProvider");
    openapiFields.add("enabled");
    openapiFields.add("validatorRequirementDescription");
    openapiFields.add("validatorFailureMessage");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("pwnedPasswordsBaseURL");
    openapiRequiredFields.add("invokeForAdd");
    openapiRequiredFields.add("invokeForSelfChange");
    openapiRequiredFields.add("invokeForAdminReset");
    openapiRequiredFields.add("acceptPasswordOnServiceError");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PwnedPasswordsPasswordValidatorResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PwnedPasswordsPasswordValidatorResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PwnedPasswordsPasswordValidatorResponse is not found in the empty JSON string", PwnedPasswordsPasswordValidatorResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PwnedPasswordsPasswordValidatorResponse.openapiRequiredFields) {
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
      if (!jsonObj.get("pwnedPasswordsBaseURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pwnedPasswordsBaseURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pwnedPasswordsBaseURL").toString()));
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
      if ((jsonObj.get("keyManagerProvider") != null && !jsonObj.get("keyManagerProvider").isJsonNull()) && !jsonObj.get("keyManagerProvider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyManagerProvider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyManagerProvider").toString()));
      }
      if ((jsonObj.get("trustManagerProvider") != null && !jsonObj.get("trustManagerProvider").isJsonNull()) && !jsonObj.get("trustManagerProvider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trustManagerProvider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trustManagerProvider").toString()));
      }
      if ((jsonObj.get("validatorRequirementDescription") != null && !jsonObj.get("validatorRequirementDescription").isJsonNull()) && !jsonObj.get("validatorRequirementDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validatorRequirementDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validatorRequirementDescription").toString()));
      }
      if ((jsonObj.get("validatorFailureMessage") != null && !jsonObj.get("validatorFailureMessage").isJsonNull()) && !jsonObj.get("validatorFailureMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validatorFailureMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validatorFailureMessage").toString()));
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
       if (!PwnedPasswordsPasswordValidatorResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PwnedPasswordsPasswordValidatorResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PwnedPasswordsPasswordValidatorResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PwnedPasswordsPasswordValidatorResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PwnedPasswordsPasswordValidatorResponse>() {
           @Override
           public void write(JsonWriter out, PwnedPasswordsPasswordValidatorResponse value) throws IOException {
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
           public PwnedPasswordsPasswordValidatorResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PwnedPasswordsPasswordValidatorResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PwnedPasswordsPasswordValidatorResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PwnedPasswordsPasswordValidatorResponse
  * @throws IOException if the JSON string is invalid with respect to PwnedPasswordsPasswordValidatorResponse
  */
  public static PwnedPasswordsPasswordValidatorResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PwnedPasswordsPasswordValidatorResponse.class);
  }

 /**
  * Convert an instance of PwnedPasswordsPasswordValidatorResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

