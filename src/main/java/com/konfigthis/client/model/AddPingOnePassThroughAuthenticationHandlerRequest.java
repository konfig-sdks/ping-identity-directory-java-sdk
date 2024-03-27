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
import com.konfigthis.client.model.EnumpingOnePassThroughAuthenticationHandlerSchemaUrn;
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
 * AddPingOnePassThroughAuthenticationHandlerRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddPingOnePassThroughAuthenticationHandlerRequest {
  public static final String SERIALIZED_NAME_HANDLER_NAME = "handlerName";
  @SerializedName(SERIALIZED_NAME_HANDLER_NAME)
  private String handlerName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumpingOnePassThroughAuthenticationHandlerSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_API_U_R_L = "apiURL";
  @SerializedName(SERIALIZED_NAME_API_U_R_L)
  private String apiURL;

  public static final String SERIALIZED_NAME_AUTH_U_R_L = "authURL";
  @SerializedName(SERIALIZED_NAME_AUTH_U_R_L)
  private String authURL;

  public static final String SERIALIZED_NAME_OAUTH_CLIENT_I_D = "OAuthClientID";
  @SerializedName(SERIALIZED_NAME_OAUTH_CLIENT_I_D)
  private String oauthClientID;

  public static final String SERIALIZED_NAME_OAUTH_CLIENT_SECRET = "OAuthClientSecret";
  @SerializedName(SERIALIZED_NAME_OAUTH_CLIENT_SECRET)
  private String oauthClientSecret;

  public static final String SERIALIZED_NAME_OAUTH_CLIENT_SECRET_PASSPHRASE_PROVIDER = "OAuthClientSecretPassphraseProvider";
  @SerializedName(SERIALIZED_NAME_OAUTH_CLIENT_SECRET_PASSPHRASE_PROVIDER)
  private String oauthClientSecretPassphraseProvider;

  public static final String SERIALIZED_NAME_ENVIRONMENT_I_D = "environmentID";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_I_D)
  private String environmentID;

  public static final String SERIALIZED_NAME_HTTP_PROXY_EXTERNAL_SERVER = "httpProxyExternalServer";
  @SerializedName(SERIALIZED_NAME_HTTP_PROXY_EXTERNAL_SERVER)
  private String httpProxyExternalServer;

  public static final String SERIALIZED_NAME_USER_MAPPING_LOCAL_ATTRIBUTE = "userMappingLocalAttribute";
  @SerializedName(SERIALIZED_NAME_USER_MAPPING_LOCAL_ATTRIBUTE)
  private List<String> userMappingLocalAttribute = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER_MAPPING_REMOTE_J_S_O_N_FIELD = "userMappingRemoteJSONField";
  @SerializedName(SERIALIZED_NAME_USER_MAPPING_REMOTE_J_S_O_N_FIELD)
  private List<String> userMappingRemoteJSONField = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADDITIONAL_USER_MAPPING_S_C_I_M_FILTER = "additionalUserMappingSCIMFilter";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_USER_MAPPING_S_C_I_M_FILTER)
  private String additionalUserMappingSCIMFilter;

  public static final String SERIALIZED_NAME_INCLUDED_LOCAL_ENTRY_BASE_D_N = "includedLocalEntryBaseDN";
  @SerializedName(SERIALIZED_NAME_INCLUDED_LOCAL_ENTRY_BASE_D_N)
  private List<String> includedLocalEntryBaseDN = null;

  public static final String SERIALIZED_NAME_CONNECTION_CRITERIA = "connectionCriteria";
  @SerializedName(SERIALIZED_NAME_CONNECTION_CRITERIA)
  private String connectionCriteria;

  public static final String SERIALIZED_NAME_REQUEST_CRITERIA = "requestCriteria";
  @SerializedName(SERIALIZED_NAME_REQUEST_CRITERIA)
  private String requestCriteria;

  public AddPingOnePassThroughAuthenticationHandlerRequest() {
  }

  public AddPingOnePassThroughAuthenticationHandlerRequest handlerName(String handlerName) {
    
    
    
    
    this.handlerName = handlerName;
    return this;
  }

   /**
   * Name of the new Pass Through Authentication Handler
   * @return handlerName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the new Pass Through Authentication Handler")

  public String getHandlerName() {
    return handlerName;
  }


  public void setHandlerName(String handlerName) {
    
    
    
    this.handlerName = handlerName;
  }


  public AddPingOnePassThroughAuthenticationHandlerRequest description(String description) {
    
    
    
    
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


  public AddPingOnePassThroughAuthenticationHandlerRequest schemas(List<EnumpingOnePassThroughAuthenticationHandlerSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddPingOnePassThroughAuthenticationHandlerRequest addSchemasItem(EnumpingOnePassThroughAuthenticationHandlerSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumpingOnePassThroughAuthenticationHandlerSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumpingOnePassThroughAuthenticationHandlerSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddPingOnePassThroughAuthenticationHandlerRequest apiURL(String apiURL) {
    
    
    
    
    this.apiURL = apiURL;
    return this;
  }

   /**
   * Specifies the API endpoint for the PingOne web service.
   * @return apiURL
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the API endpoint for the PingOne web service.")

  public String getApiURL() {
    return apiURL;
  }


  public void setApiURL(String apiURL) {
    
    
    
    this.apiURL = apiURL;
  }


  public AddPingOnePassThroughAuthenticationHandlerRequest authURL(String authURL) {
    
    
    
    
    this.authURL = authURL;
    return this;
  }

   /**
   * Specifies the API endpoint for the PingOne authentication service.
   * @return authURL
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the API endpoint for the PingOne authentication service.")

  public String getAuthURL() {
    return authURL;
  }


  public void setAuthURL(String authURL) {
    
    
    
    this.authURL = authURL;
  }


  public AddPingOnePassThroughAuthenticationHandlerRequest oauthClientID(String oauthClientID) {
    
    
    
    
    this.oauthClientID = oauthClientID;
    return this;
  }

   /**
   * Specifies the OAuth Client ID used to authenticate connections to the PingOne API.
   * @return oauthClientID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the OAuth Client ID used to authenticate connections to the PingOne API.")

  public String getOauthClientID() {
    return oauthClientID;
  }


  public void setOauthClientID(String oauthClientID) {
    
    
    
    this.oauthClientID = oauthClientID;
  }


  public AddPingOnePassThroughAuthenticationHandlerRequest oauthClientSecret(String oauthClientSecret) {
    
    
    
    
    this.oauthClientSecret = oauthClientSecret;
    return this;
  }

   /**
   * Specifies the OAuth Client Secret used to authenticate connections to the PingOne API.
   * @return oauthClientSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the OAuth Client Secret used to authenticate connections to the PingOne API.")

  public String getOauthClientSecret() {
    return oauthClientSecret;
  }


  public void setOauthClientSecret(String oauthClientSecret) {
    
    
    
    this.oauthClientSecret = oauthClientSecret;
  }


  public AddPingOnePassThroughAuthenticationHandlerRequest oauthClientSecretPassphraseProvider(String oauthClientSecretPassphraseProvider) {
    
    
    
    
    this.oauthClientSecretPassphraseProvider = oauthClientSecretPassphraseProvider;
    return this;
  }

   /**
   * Specifies a passphrase provider that can be used to obtain the OAuth Client Secret used to authenticate connections to the PingOne API.
   * @return oauthClientSecretPassphraseProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a passphrase provider that can be used to obtain the OAuth Client Secret used to authenticate connections to the PingOne API.")

  public String getOauthClientSecretPassphraseProvider() {
    return oauthClientSecretPassphraseProvider;
  }


  public void setOauthClientSecretPassphraseProvider(String oauthClientSecretPassphraseProvider) {
    
    
    
    this.oauthClientSecretPassphraseProvider = oauthClientSecretPassphraseProvider;
  }


  public AddPingOnePassThroughAuthenticationHandlerRequest environmentID(String environmentID) {
    
    
    
    
    this.environmentID = environmentID;
    return this;
  }

   /**
   * Specifies the PingOne Environment that will be associated with this PingOne Pass Through Authentication Handler.
   * @return environmentID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the PingOne Environment that will be associated with this PingOne Pass Through Authentication Handler.")

  public String getEnvironmentID() {
    return environmentID;
  }


  public void setEnvironmentID(String environmentID) {
    
    
    
    this.environmentID = environmentID;
  }


  public AddPingOnePassThroughAuthenticationHandlerRequest httpProxyExternalServer(String httpProxyExternalServer) {
    
    
    
    
    this.httpProxyExternalServer = httpProxyExternalServer;
    return this;
  }

   /**
   * A reference to an HTTP proxy server that should be used for requests sent to the PingOne service.
   * @return httpProxyExternalServer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to an HTTP proxy server that should be used for requests sent to the PingOne service.")

  public String getHttpProxyExternalServer() {
    return httpProxyExternalServer;
  }


  public void setHttpProxyExternalServer(String httpProxyExternalServer) {
    
    
    
    this.httpProxyExternalServer = httpProxyExternalServer;
  }


  public AddPingOnePassThroughAuthenticationHandlerRequest userMappingLocalAttribute(List<String> userMappingLocalAttribute) {
    
    
    
    
    this.userMappingLocalAttribute = userMappingLocalAttribute;
    return this;
  }

  public AddPingOnePassThroughAuthenticationHandlerRequest addUserMappingLocalAttributeItem(String userMappingLocalAttributeItem) {
    this.userMappingLocalAttribute.add(userMappingLocalAttributeItem);
    return this;
  }

   /**
   * The names of the attributes in the local user entry whose values must match the values of the corresponding fields in the PingOne service.
   * @return userMappingLocalAttribute
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The names of the attributes in the local user entry whose values must match the values of the corresponding fields in the PingOne service.")

  public List<String> getUserMappingLocalAttribute() {
    return userMappingLocalAttribute;
  }


  public void setUserMappingLocalAttribute(List<String> userMappingLocalAttribute) {
    
    
    
    this.userMappingLocalAttribute = userMappingLocalAttribute;
  }


  public AddPingOnePassThroughAuthenticationHandlerRequest userMappingRemoteJSONField(List<String> userMappingRemoteJSONField) {
    
    
    
    
    this.userMappingRemoteJSONField = userMappingRemoteJSONField;
    return this;
  }

  public AddPingOnePassThroughAuthenticationHandlerRequest addUserMappingRemoteJSONFieldItem(String userMappingRemoteJSONFieldItem) {
    this.userMappingRemoteJSONField.add(userMappingRemoteJSONFieldItem);
    return this;
  }

   /**
   * The names of the fields in the PingOne service whose values must match the values of the corresponding attributes in the local user entry, as specified in the user-mapping-local-attribute property.
   * @return userMappingRemoteJSONField
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The names of the fields in the PingOne service whose values must match the values of the corresponding attributes in the local user entry, as specified in the user-mapping-local-attribute property.")

  public List<String> getUserMappingRemoteJSONField() {
    return userMappingRemoteJSONField;
  }


  public void setUserMappingRemoteJSONField(List<String> userMappingRemoteJSONField) {
    
    
    
    this.userMappingRemoteJSONField = userMappingRemoteJSONField;
  }


  public AddPingOnePassThroughAuthenticationHandlerRequest additionalUserMappingSCIMFilter(String additionalUserMappingSCIMFilter) {
    
    
    
    
    this.additionalUserMappingSCIMFilter = additionalUserMappingSCIMFilter;
    return this;
  }

   /**
   * An optional SCIM filter that will be ANDed with the filter created to identify the account in the PingOne service that corresponds to the local entry. Only the \&quot;eq\&quot;, \&quot;sw\&quot;, \&quot;and\&quot;, and \&quot;or\&quot; filter types may be used.
   * @return additionalUserMappingSCIMFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional SCIM filter that will be ANDed with the filter created to identify the account in the PingOne service that corresponds to the local entry. Only the \"eq\", \"sw\", \"and\", and \"or\" filter types may be used.")

  public String getAdditionalUserMappingSCIMFilter() {
    return additionalUserMappingSCIMFilter;
  }


  public void setAdditionalUserMappingSCIMFilter(String additionalUserMappingSCIMFilter) {
    
    
    
    this.additionalUserMappingSCIMFilter = additionalUserMappingSCIMFilter;
  }


  public AddPingOnePassThroughAuthenticationHandlerRequest includedLocalEntryBaseDN(List<String> includedLocalEntryBaseDN) {
    
    
    
    
    this.includedLocalEntryBaseDN = includedLocalEntryBaseDN;
    return this;
  }

  public AddPingOnePassThroughAuthenticationHandlerRequest addIncludedLocalEntryBaseDNItem(String includedLocalEntryBaseDNItem) {
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


  public AddPingOnePassThroughAuthenticationHandlerRequest connectionCriteria(String connectionCriteria) {
    
    
    
    
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


  public AddPingOnePassThroughAuthenticationHandlerRequest requestCriteria(String requestCriteria) {
    
    
    
    
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
   * @return the AddPingOnePassThroughAuthenticationHandlerRequest instance itself
   */
  public AddPingOnePassThroughAuthenticationHandlerRequest putAdditionalProperty(String key, Object value) {
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
    AddPingOnePassThroughAuthenticationHandlerRequest addPingOnePassThroughAuthenticationHandlerRequest = (AddPingOnePassThroughAuthenticationHandlerRequest) o;
    return Objects.equals(this.handlerName, addPingOnePassThroughAuthenticationHandlerRequest.handlerName) &&
        Objects.equals(this.description, addPingOnePassThroughAuthenticationHandlerRequest.description) &&
        Objects.equals(this.schemas, addPingOnePassThroughAuthenticationHandlerRequest.schemas) &&
        Objects.equals(this.apiURL, addPingOnePassThroughAuthenticationHandlerRequest.apiURL) &&
        Objects.equals(this.authURL, addPingOnePassThroughAuthenticationHandlerRequest.authURL) &&
        Objects.equals(this.oauthClientID, addPingOnePassThroughAuthenticationHandlerRequest.oauthClientID) &&
        Objects.equals(this.oauthClientSecret, addPingOnePassThroughAuthenticationHandlerRequest.oauthClientSecret) &&
        Objects.equals(this.oauthClientSecretPassphraseProvider, addPingOnePassThroughAuthenticationHandlerRequest.oauthClientSecretPassphraseProvider) &&
        Objects.equals(this.environmentID, addPingOnePassThroughAuthenticationHandlerRequest.environmentID) &&
        Objects.equals(this.httpProxyExternalServer, addPingOnePassThroughAuthenticationHandlerRequest.httpProxyExternalServer) &&
        Objects.equals(this.userMappingLocalAttribute, addPingOnePassThroughAuthenticationHandlerRequest.userMappingLocalAttribute) &&
        Objects.equals(this.userMappingRemoteJSONField, addPingOnePassThroughAuthenticationHandlerRequest.userMappingRemoteJSONField) &&
        Objects.equals(this.additionalUserMappingSCIMFilter, addPingOnePassThroughAuthenticationHandlerRequest.additionalUserMappingSCIMFilter) &&
        Objects.equals(this.includedLocalEntryBaseDN, addPingOnePassThroughAuthenticationHandlerRequest.includedLocalEntryBaseDN) &&
        Objects.equals(this.connectionCriteria, addPingOnePassThroughAuthenticationHandlerRequest.connectionCriteria) &&
        Objects.equals(this.requestCriteria, addPingOnePassThroughAuthenticationHandlerRequest.requestCriteria)&&
        Objects.equals(this.additionalProperties, addPingOnePassThroughAuthenticationHandlerRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handlerName, description, schemas, apiURL, authURL, oauthClientID, oauthClientSecret, oauthClientSecretPassphraseProvider, environmentID, httpProxyExternalServer, userMappingLocalAttribute, userMappingRemoteJSONField, additionalUserMappingSCIMFilter, includedLocalEntryBaseDN, connectionCriteria, requestCriteria, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddPingOnePassThroughAuthenticationHandlerRequest {\n");
    sb.append("    handlerName: ").append(toIndentedString(handlerName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    apiURL: ").append(toIndentedString(apiURL)).append("\n");
    sb.append("    authURL: ").append(toIndentedString(authURL)).append("\n");
    sb.append("    oauthClientID: ").append(toIndentedString(oauthClientID)).append("\n");
    sb.append("    oauthClientSecret: ").append(toIndentedString(oauthClientSecret)).append("\n");
    sb.append("    oauthClientSecretPassphraseProvider: ").append(toIndentedString(oauthClientSecretPassphraseProvider)).append("\n");
    sb.append("    environmentID: ").append(toIndentedString(environmentID)).append("\n");
    sb.append("    httpProxyExternalServer: ").append(toIndentedString(httpProxyExternalServer)).append("\n");
    sb.append("    userMappingLocalAttribute: ").append(toIndentedString(userMappingLocalAttribute)).append("\n");
    sb.append("    userMappingRemoteJSONField: ").append(toIndentedString(userMappingRemoteJSONField)).append("\n");
    sb.append("    additionalUserMappingSCIMFilter: ").append(toIndentedString(additionalUserMappingSCIMFilter)).append("\n");
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
    openapiFields.add("handlerName");
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("apiURL");
    openapiFields.add("authURL");
    openapiFields.add("OAuthClientID");
    openapiFields.add("OAuthClientSecret");
    openapiFields.add("OAuthClientSecretPassphraseProvider");
    openapiFields.add("environmentID");
    openapiFields.add("httpProxyExternalServer");
    openapiFields.add("userMappingLocalAttribute");
    openapiFields.add("userMappingRemoteJSONField");
    openapiFields.add("additionalUserMappingSCIMFilter");
    openapiFields.add("includedLocalEntryBaseDN");
    openapiFields.add("connectionCriteria");
    openapiFields.add("requestCriteria");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("handlerName");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("apiURL");
    openapiRequiredFields.add("authURL");
    openapiRequiredFields.add("OAuthClientID");
    openapiRequiredFields.add("environmentID");
    openapiRequiredFields.add("userMappingLocalAttribute");
    openapiRequiredFields.add("userMappingRemoteJSONField");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddPingOnePassThroughAuthenticationHandlerRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddPingOnePassThroughAuthenticationHandlerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddPingOnePassThroughAuthenticationHandlerRequest is not found in the empty JSON string", AddPingOnePassThroughAuthenticationHandlerRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddPingOnePassThroughAuthenticationHandlerRequest.openapiRequiredFields) {
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
      if (!jsonObj.get("apiURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiURL").toString()));
      }
      if (!jsonObj.get("authURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authURL").toString()));
      }
      if (!jsonObj.get("OAuthClientID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OAuthClientID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OAuthClientID").toString()));
      }
      if ((jsonObj.get("OAuthClientSecret") != null && !jsonObj.get("OAuthClientSecret").isJsonNull()) && !jsonObj.get("OAuthClientSecret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OAuthClientSecret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OAuthClientSecret").toString()));
      }
      if ((jsonObj.get("OAuthClientSecretPassphraseProvider") != null && !jsonObj.get("OAuthClientSecretPassphraseProvider").isJsonNull()) && !jsonObj.get("OAuthClientSecretPassphraseProvider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OAuthClientSecretPassphraseProvider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OAuthClientSecretPassphraseProvider").toString()));
      }
      if (!jsonObj.get("environmentID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environmentID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environmentID").toString()));
      }
      if ((jsonObj.get("httpProxyExternalServer") != null && !jsonObj.get("httpProxyExternalServer").isJsonNull()) && !jsonObj.get("httpProxyExternalServer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `httpProxyExternalServer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("httpProxyExternalServer").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("userMappingLocalAttribute") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("userMappingLocalAttribute").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `userMappingLocalAttribute` to be an array in the JSON string but got `%s`", jsonObj.get("userMappingLocalAttribute").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("userMappingRemoteJSONField") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("userMappingRemoteJSONField").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `userMappingRemoteJSONField` to be an array in the JSON string but got `%s`", jsonObj.get("userMappingRemoteJSONField").toString()));
      }
      if ((jsonObj.get("additionalUserMappingSCIMFilter") != null && !jsonObj.get("additionalUserMappingSCIMFilter").isJsonNull()) && !jsonObj.get("additionalUserMappingSCIMFilter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalUserMappingSCIMFilter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additionalUserMappingSCIMFilter").toString()));
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
       if (!AddPingOnePassThroughAuthenticationHandlerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddPingOnePassThroughAuthenticationHandlerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddPingOnePassThroughAuthenticationHandlerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddPingOnePassThroughAuthenticationHandlerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddPingOnePassThroughAuthenticationHandlerRequest>() {
           @Override
           public void write(JsonWriter out, AddPingOnePassThroughAuthenticationHandlerRequest value) throws IOException {
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
           public AddPingOnePassThroughAuthenticationHandlerRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddPingOnePassThroughAuthenticationHandlerRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddPingOnePassThroughAuthenticationHandlerRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddPingOnePassThroughAuthenticationHandlerRequest
  * @throws IOException if the JSON string is invalid with respect to AddPingOnePassThroughAuthenticationHandlerRequest
  */
  public static AddPingOnePassThroughAuthenticationHandlerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddPingOnePassThroughAuthenticationHandlerRequest.class);
  }

 /**
  * Convert an instance of AddPingOnePassThroughAuthenticationHandlerRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

