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
import com.konfigthis.client.model.EnumpingFederateAccessTokenValidatorSchemaUrn;
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
 * PingFederateAccessTokenValidatorShared
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PingFederateAccessTokenValidatorShared {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumpingFederateAccessTokenValidatorSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLIENT_I_D = "clientID";
  @SerializedName(SERIALIZED_NAME_CLIENT_I_D)
  private String clientID;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "clientSecret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_CLIENT_SECRET_PASSPHRASE_PROVIDER = "clientSecretPassphraseProvider";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET_PASSPHRASE_PROVIDER)
  private String clientSecretPassphraseProvider;

  public static final String SERIALIZED_NAME_INCLUDE_AUD_PARAMETER = "includeAudParameter";
  @SerializedName(SERIALIZED_NAME_INCLUDE_AUD_PARAMETER)
  private Boolean includeAudParameter;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN_MANAGER_I_D = "accessTokenManagerID";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN_MANAGER_I_D)
  private String accessTokenManagerID;

  public static final String SERIALIZED_NAME_ENDPOINT_CACHE_REFRESH = "endpointCacheRefresh";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_CACHE_REFRESH)
  private String endpointCacheRefresh;

  public static final String SERIALIZED_NAME_EVALUATION_ORDER_INDEX = "evaluationOrderIndex";
  @SerializedName(SERIALIZED_NAME_EVALUATION_ORDER_INDEX)
  private Integer evaluationOrderIndex;

  public static final String SERIALIZED_NAME_AUTHORIZATION_SERVER = "authorizationServer";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_SERVER)
  private String authorizationServer;

  public static final String SERIALIZED_NAME_IDENTITY_MAPPER = "identityMapper";
  @SerializedName(SERIALIZED_NAME_IDENTITY_MAPPER)
  private String identityMapper;

  public static final String SERIALIZED_NAME_SUBJECT_CLAIM_NAME = "subjectClaimName";
  @SerializedName(SERIALIZED_NAME_SUBJECT_CLAIM_NAME)
  private String subjectClaimName;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public PingFederateAccessTokenValidatorShared() {
  }

  public PingFederateAccessTokenValidatorShared description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Access Token Validator
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Access Token Validator")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public PingFederateAccessTokenValidatorShared schemas(List<EnumpingFederateAccessTokenValidatorSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public PingFederateAccessTokenValidatorShared addSchemasItem(EnumpingFederateAccessTokenValidatorSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumpingFederateAccessTokenValidatorSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumpingFederateAccessTokenValidatorSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public PingFederateAccessTokenValidatorShared clientID(String clientID) {
    
    
    
    
    this.clientID = clientID;
    return this;
  }

   /**
   * The client identifier to use when authenticating to the PingFederate authorization server.
   * @return clientID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The client identifier to use when authenticating to the PingFederate authorization server.")

  public String getClientID() {
    return clientID;
  }


  public void setClientID(String clientID) {
    
    
    
    this.clientID = clientID;
  }


  public PingFederateAccessTokenValidatorShared clientSecret(String clientSecret) {
    
    
    
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * The client secret to use when authenticating to the PingFederate authorization server.
   * @return clientSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The client secret to use when authenticating to the PingFederate authorization server.")

  public String getClientSecret() {
    return clientSecret;
  }


  public void setClientSecret(String clientSecret) {
    
    
    
    this.clientSecret = clientSecret;
  }


  public PingFederateAccessTokenValidatorShared clientSecretPassphraseProvider(String clientSecretPassphraseProvider) {
    
    
    
    
    this.clientSecretPassphraseProvider = clientSecretPassphraseProvider;
    return this;
  }

   /**
   * The passphrase provider for obtaining the client secret to use when authenticating to the PingFederate authorization server.
   * @return clientSecretPassphraseProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The passphrase provider for obtaining the client secret to use when authenticating to the PingFederate authorization server.")

  public String getClientSecretPassphraseProvider() {
    return clientSecretPassphraseProvider;
  }


  public void setClientSecretPassphraseProvider(String clientSecretPassphraseProvider) {
    
    
    
    this.clientSecretPassphraseProvider = clientSecretPassphraseProvider;
  }


  public PingFederateAccessTokenValidatorShared includeAudParameter(Boolean includeAudParameter) {
    
    
    
    
    this.includeAudParameter = includeAudParameter;
    return this;
  }

   /**
   * Whether to include the incoming request URL as the \&quot;aud\&quot; parameter when calling the PingFederate introspection endpoint. This property is ignored if the access-token-manager-id property is set.
   * @return includeAudParameter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to include the incoming request URL as the \"aud\" parameter when calling the PingFederate introspection endpoint. This property is ignored if the access-token-manager-id property is set.")

  public Boolean getIncludeAudParameter() {
    return includeAudParameter;
  }


  public void setIncludeAudParameter(Boolean includeAudParameter) {
    
    
    
    this.includeAudParameter = includeAudParameter;
  }


  public PingFederateAccessTokenValidatorShared accessTokenManagerID(String accessTokenManagerID) {
    
    
    
    
    this.accessTokenManagerID = accessTokenManagerID;
    return this;
  }

   /**
   * The Access Token Manager instance ID to specify when calling the PingFederate introspection endpoint. If this property is set the include-aud-parameter property is ignored.
   * @return accessTokenManagerID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Access Token Manager instance ID to specify when calling the PingFederate introspection endpoint. If this property is set the include-aud-parameter property is ignored.")

  public String getAccessTokenManagerID() {
    return accessTokenManagerID;
  }


  public void setAccessTokenManagerID(String accessTokenManagerID) {
    
    
    
    this.accessTokenManagerID = accessTokenManagerID;
  }


  public PingFederateAccessTokenValidatorShared endpointCacheRefresh(String endpointCacheRefresh) {
    
    
    
    
    this.endpointCacheRefresh = endpointCacheRefresh;
    return this;
  }

   /**
   * How often the Access Token Validator should refresh its stored value of the PingFederate server&#39;s token introspection endpoint.
   * @return endpointCacheRefresh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How often the Access Token Validator should refresh its stored value of the PingFederate server's token introspection endpoint.")

  public String getEndpointCacheRefresh() {
    return endpointCacheRefresh;
  }


  public void setEndpointCacheRefresh(String endpointCacheRefresh) {
    
    
    
    this.endpointCacheRefresh = endpointCacheRefresh;
  }


  public PingFederateAccessTokenValidatorShared evaluationOrderIndex(Integer evaluationOrderIndex) {
    
    
    
    
    this.evaluationOrderIndex = evaluationOrderIndex;
    return this;
  }

   /**
   * When multiple Ping Federate Access Token Validators are defined for a single Directory Server, this property determines the evaluation order for determining the correct validator class for an access token received by the Directory Server. Values of this property must be unique among all Ping Federate Access Token Validators defined within Directory Server but not necessarily contiguous. Ping Federate Access Token Validators with a smaller value will be evaluated first to determine if they are able to validate the access token.
   * @return evaluationOrderIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When multiple Ping Federate Access Token Validators are defined for a single Directory Server, this property determines the evaluation order for determining the correct validator class for an access token received by the Directory Server. Values of this property must be unique among all Ping Federate Access Token Validators defined within Directory Server but not necessarily contiguous. Ping Federate Access Token Validators with a smaller value will be evaluated first to determine if they are able to validate the access token.")

  public Integer getEvaluationOrderIndex() {
    return evaluationOrderIndex;
  }


  public void setEvaluationOrderIndex(Integer evaluationOrderIndex) {
    
    
    
    this.evaluationOrderIndex = evaluationOrderIndex;
  }


  public PingFederateAccessTokenValidatorShared authorizationServer(String authorizationServer) {
    
    
    
    
    this.authorizationServer = authorizationServer;
    return this;
  }

   /**
   * Specifies the external server that will be used to aid in validating access tokens. In most cases this will be the Authorization Server that minted the token.
   * @return authorizationServer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the external server that will be used to aid in validating access tokens. In most cases this will be the Authorization Server that minted the token.")

  public String getAuthorizationServer() {
    return authorizationServer;
  }


  public void setAuthorizationServer(String authorizationServer) {
    
    
    
    this.authorizationServer = authorizationServer;
  }


  public PingFederateAccessTokenValidatorShared identityMapper(String identityMapper) {
    
    
    
    
    this.identityMapper = identityMapper;
    return this;
  }

   /**
   * Specifies the name of the Identity Mapper that should be used for associating user entries with Bearer token subject names. The claim name from which to obtain the subject (i.e. the currently logged-in user) may be configured using the subject-claim-name property.
   * @return identityMapper
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the name of the Identity Mapper that should be used for associating user entries with Bearer token subject names. The claim name from which to obtain the subject (i.e. the currently logged-in user) may be configured using the subject-claim-name property.")

  public String getIdentityMapper() {
    return identityMapper;
  }


  public void setIdentityMapper(String identityMapper) {
    
    
    
    this.identityMapper = identityMapper;
  }


  public PingFederateAccessTokenValidatorShared subjectClaimName(String subjectClaimName) {
    
    
    
    
    this.subjectClaimName = subjectClaimName;
    return this;
  }

   /**
   * The name of the token claim that contains the subject, i.e. the logged-in user in an access token. This property goes hand-in-hand with the identity-mapper property and tells the Identity Mapper which field to use to look up the user entry on the server.
   * @return subjectClaimName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the token claim that contains the subject, i.e. the logged-in user in an access token. This property goes hand-in-hand with the identity-mapper property and tells the Identity Mapper which field to use to look up the user entry on the server.")

  public String getSubjectClaimName() {
    return subjectClaimName;
  }


  public void setSubjectClaimName(String subjectClaimName) {
    
    
    
    this.subjectClaimName = subjectClaimName;
  }


  public PingFederateAccessTokenValidatorShared enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether this Access Token Validator is enabled for use in Directory Server.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether this Access Token Validator is enabled for use in Directory Server.")

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
   * @return the PingFederateAccessTokenValidatorShared instance itself
   */
  public PingFederateAccessTokenValidatorShared putAdditionalProperty(String key, Object value) {
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
    PingFederateAccessTokenValidatorShared pingFederateAccessTokenValidatorShared = (PingFederateAccessTokenValidatorShared) o;
    return Objects.equals(this.description, pingFederateAccessTokenValidatorShared.description) &&
        Objects.equals(this.schemas, pingFederateAccessTokenValidatorShared.schemas) &&
        Objects.equals(this.clientID, pingFederateAccessTokenValidatorShared.clientID) &&
        Objects.equals(this.clientSecret, pingFederateAccessTokenValidatorShared.clientSecret) &&
        Objects.equals(this.clientSecretPassphraseProvider, pingFederateAccessTokenValidatorShared.clientSecretPassphraseProvider) &&
        Objects.equals(this.includeAudParameter, pingFederateAccessTokenValidatorShared.includeAudParameter) &&
        Objects.equals(this.accessTokenManagerID, pingFederateAccessTokenValidatorShared.accessTokenManagerID) &&
        Objects.equals(this.endpointCacheRefresh, pingFederateAccessTokenValidatorShared.endpointCacheRefresh) &&
        Objects.equals(this.evaluationOrderIndex, pingFederateAccessTokenValidatorShared.evaluationOrderIndex) &&
        Objects.equals(this.authorizationServer, pingFederateAccessTokenValidatorShared.authorizationServer) &&
        Objects.equals(this.identityMapper, pingFederateAccessTokenValidatorShared.identityMapper) &&
        Objects.equals(this.subjectClaimName, pingFederateAccessTokenValidatorShared.subjectClaimName) &&
        Objects.equals(this.enabled, pingFederateAccessTokenValidatorShared.enabled)&&
        Objects.equals(this.additionalProperties, pingFederateAccessTokenValidatorShared.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, clientID, clientSecret, clientSecretPassphraseProvider, includeAudParameter, accessTokenManagerID, endpointCacheRefresh, evaluationOrderIndex, authorizationServer, identityMapper, subjectClaimName, enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PingFederateAccessTokenValidatorShared {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    clientID: ").append(toIndentedString(clientID)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    clientSecretPassphraseProvider: ").append(toIndentedString(clientSecretPassphraseProvider)).append("\n");
    sb.append("    includeAudParameter: ").append(toIndentedString(includeAudParameter)).append("\n");
    sb.append("    accessTokenManagerID: ").append(toIndentedString(accessTokenManagerID)).append("\n");
    sb.append("    endpointCacheRefresh: ").append(toIndentedString(endpointCacheRefresh)).append("\n");
    sb.append("    evaluationOrderIndex: ").append(toIndentedString(evaluationOrderIndex)).append("\n");
    sb.append("    authorizationServer: ").append(toIndentedString(authorizationServer)).append("\n");
    sb.append("    identityMapper: ").append(toIndentedString(identityMapper)).append("\n");
    sb.append("    subjectClaimName: ").append(toIndentedString(subjectClaimName)).append("\n");
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
    openapiFields.add("clientID");
    openapiFields.add("clientSecret");
    openapiFields.add("clientSecretPassphraseProvider");
    openapiFields.add("includeAudParameter");
    openapiFields.add("accessTokenManagerID");
    openapiFields.add("endpointCacheRefresh");
    openapiFields.add("evaluationOrderIndex");
    openapiFields.add("authorizationServer");
    openapiFields.add("identityMapper");
    openapiFields.add("subjectClaimName");
    openapiFields.add("enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("clientID");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PingFederateAccessTokenValidatorShared
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PingFederateAccessTokenValidatorShared.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PingFederateAccessTokenValidatorShared is not found in the empty JSON string", PingFederateAccessTokenValidatorShared.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PingFederateAccessTokenValidatorShared.openapiRequiredFields) {
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
      if (!jsonObj.get("clientID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientID").toString()));
      }
      if ((jsonObj.get("clientSecret") != null && !jsonObj.get("clientSecret").isJsonNull()) && !jsonObj.get("clientSecret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientSecret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientSecret").toString()));
      }
      if ((jsonObj.get("clientSecretPassphraseProvider") != null && !jsonObj.get("clientSecretPassphraseProvider").isJsonNull()) && !jsonObj.get("clientSecretPassphraseProvider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientSecretPassphraseProvider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientSecretPassphraseProvider").toString()));
      }
      if ((jsonObj.get("accessTokenManagerID") != null && !jsonObj.get("accessTokenManagerID").isJsonNull()) && !jsonObj.get("accessTokenManagerID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessTokenManagerID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessTokenManagerID").toString()));
      }
      if ((jsonObj.get("endpointCacheRefresh") != null && !jsonObj.get("endpointCacheRefresh").isJsonNull()) && !jsonObj.get("endpointCacheRefresh").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpointCacheRefresh` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpointCacheRefresh").toString()));
      }
      if ((jsonObj.get("authorizationServer") != null && !jsonObj.get("authorizationServer").isJsonNull()) && !jsonObj.get("authorizationServer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorizationServer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorizationServer").toString()));
      }
      if ((jsonObj.get("identityMapper") != null && !jsonObj.get("identityMapper").isJsonNull()) && !jsonObj.get("identityMapper").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identityMapper` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identityMapper").toString()));
      }
      if ((jsonObj.get("subjectClaimName") != null && !jsonObj.get("subjectClaimName").isJsonNull()) && !jsonObj.get("subjectClaimName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subjectClaimName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subjectClaimName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PingFederateAccessTokenValidatorShared.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PingFederateAccessTokenValidatorShared' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PingFederateAccessTokenValidatorShared> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PingFederateAccessTokenValidatorShared.class));

       return (TypeAdapter<T>) new TypeAdapter<PingFederateAccessTokenValidatorShared>() {
           @Override
           public void write(JsonWriter out, PingFederateAccessTokenValidatorShared value) throws IOException {
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
           public PingFederateAccessTokenValidatorShared read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PingFederateAccessTokenValidatorShared instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PingFederateAccessTokenValidatorShared given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PingFederateAccessTokenValidatorShared
  * @throws IOException if the JSON string is invalid with respect to PingFederateAccessTokenValidatorShared
  */
  public static PingFederateAccessTokenValidatorShared fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PingFederateAccessTokenValidatorShared.class);
  }

 /**
  * Convert an instance of PingFederateAccessTokenValidatorShared to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

