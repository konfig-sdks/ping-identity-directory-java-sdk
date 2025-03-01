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
import com.konfigthis.client.model.EnumexternalServerPolicyHostnameVerificationMethodProp;
import com.konfigthis.client.model.EnumpolicyExternalServerSchemaUrn;
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
 * PolicyExternalServerResponseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PolicyExternalServerResponseAllOf {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumpolicyExternalServerSchemaUrn> schemas = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_USER_I_D = "userID";
  @SerializedName(SERIALIZED_NAME_USER_I_D)
  private String userID;

  public static final String SERIALIZED_NAME_SHARED_SECRET = "sharedSecret";
  @SerializedName(SERIALIZED_NAME_SHARED_SECRET)
  private String sharedSecret;

  public static final String SERIALIZED_NAME_DECISION_NODE = "decisionNode";
  @SerializedName(SERIALIZED_NAME_DECISION_NODE)
  private String decisionNode;

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_SNAPSHOT = "snapshot";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT)
  private String snapshot;

  public static final String SERIALIZED_NAME_HOSTNAME_VERIFICATION_METHOD = "hostnameVerificationMethod";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_VERIFICATION_METHOD)
  private EnumexternalServerPolicyHostnameVerificationMethodProp hostnameVerificationMethod;

  public static final String SERIALIZED_NAME_KEY_MANAGER_PROVIDER = "keyManagerProvider";
  @SerializedName(SERIALIZED_NAME_KEY_MANAGER_PROVIDER)
  private String keyManagerProvider;

  public static final String SERIALIZED_NAME_TRUST_MANAGER_PROVIDER = "trustManagerProvider";
  @SerializedName(SERIALIZED_NAME_TRUST_MANAGER_PROVIDER)
  private String trustManagerProvider;

  public static final String SERIALIZED_NAME_BASE_U_R_L = "baseURL";
  @SerializedName(SERIALIZED_NAME_BASE_U_R_L)
  private String baseURL;

  public static final String SERIALIZED_NAME_SSL_CERT_NICKNAME = "sslCertNickname";
  @SerializedName(SERIALIZED_NAME_SSL_CERT_NICKNAME)
  private String sslCertNickname;

  public static final String SERIALIZED_NAME_CONNECT_TIMEOUT = "connectTimeout";
  @SerializedName(SERIALIZED_NAME_CONNECT_TIMEOUT)
  private String connectTimeout;

  public static final String SERIALIZED_NAME_RESPONSE_TIMEOUT = "responseTimeout";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TIMEOUT)
  private String responseTimeout;

  public PolicyExternalServerResponseAllOf() {
  }

  public PolicyExternalServerResponseAllOf description(String description) {
    
    
    
    
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


  public PolicyExternalServerResponseAllOf schemas(List<EnumpolicyExternalServerSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public PolicyExternalServerResponseAllOf addSchemasItem(EnumpolicyExternalServerSchemaUrn schemasItem) {
    if (this.schemas == null) {
      this.schemas = new ArrayList<>();
    }
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumpolicyExternalServerSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumpolicyExternalServerSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public PolicyExternalServerResponseAllOf id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the External Server
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the External Server")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public PolicyExternalServerResponseAllOf userID(String userID) {
    
    
    
    
    this.userID = userID;
    return this;
  }

   /**
   * Specifies the user ID to authenticate calls to the policy server&#39;s governance engine API.
   * @return userID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the user ID to authenticate calls to the policy server's governance engine API.")

  public String getUserID() {
    return userID;
  }


  public void setUserID(String userID) {
    
    
    
    this.userID = userID;
  }


  public PolicyExternalServerResponseAllOf sharedSecret(String sharedSecret) {
    
    
    
    
    this.sharedSecret = sharedSecret;
    return this;
  }

   /**
   * Specifies the shared secret to authenticate calls to the policy server&#39;s governance engine API.
   * @return sharedSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the shared secret to authenticate calls to the policy server's governance engine API.")

  public String getSharedSecret() {
    return sharedSecret;
  }


  public void setSharedSecret(String sharedSecret) {
    
    
    
    this.sharedSecret = sharedSecret;
  }


  public PolicyExternalServerResponseAllOf decisionNode(String decisionNode) {
    
    
    
    
    this.decisionNode = decisionNode;
    return this;
  }

   /**
   * Specifies the ID of the policy tree node that will act as the root node for policy evaluation.
   * @return decisionNode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the ID of the policy tree node that will act as the root node for policy evaluation.")

  public String getDecisionNode() {
    return decisionNode;
  }


  public void setDecisionNode(String decisionNode) {
    
    
    
    this.decisionNode = decisionNode;
  }


  public PolicyExternalServerResponseAllOf branch(String branch) {
    
    
    
    
    this.branch = branch;
    return this;
  }

   /**
   * Specifies the name of the policy branch to use for policy evaluation.
   * @return branch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the name of the policy branch to use for policy evaluation.")

  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    
    
    
    this.branch = branch;
  }


  public PolicyExternalServerResponseAllOf snapshot(String snapshot) {
    
    
    
    
    this.snapshot = snapshot;
    return this;
  }

   /**
   * Specifies the ID of a specific commit to use for policy evaluation.
   * @return snapshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the ID of a specific commit to use for policy evaluation.")

  public String getSnapshot() {
    return snapshot;
  }


  public void setSnapshot(String snapshot) {
    
    
    
    this.snapshot = snapshot;
  }


  public PolicyExternalServerResponseAllOf hostnameVerificationMethod(EnumexternalServerPolicyHostnameVerificationMethodProp hostnameVerificationMethod) {
    
    
    
    
    this.hostnameVerificationMethod = hostnameVerificationMethod;
    return this;
  }

   /**
   * Get hostnameVerificationMethod
   * @return hostnameVerificationMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumexternalServerPolicyHostnameVerificationMethodProp getHostnameVerificationMethod() {
    return hostnameVerificationMethod;
  }


  public void setHostnameVerificationMethod(EnumexternalServerPolicyHostnameVerificationMethodProp hostnameVerificationMethod) {
    
    
    
    this.hostnameVerificationMethod = hostnameVerificationMethod;
  }


  public PolicyExternalServerResponseAllOf keyManagerProvider(String keyManagerProvider) {
    
    
    
    
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


  public PolicyExternalServerResponseAllOf trustManagerProvider(String trustManagerProvider) {
    
    
    
    
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


  public PolicyExternalServerResponseAllOf baseURL(String baseURL) {
    
    
    
    
    this.baseURL = baseURL;
    return this;
  }

   /**
   * The base URL of the external server, optionally including port number, for example \&quot;https://externalService:9031\&quot;.
   * @return baseURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The base URL of the external server, optionally including port number, for example \"https://externalService:9031\".")

  public String getBaseURL() {
    return baseURL;
  }


  public void setBaseURL(String baseURL) {
    
    
    
    this.baseURL = baseURL;
  }


  public PolicyExternalServerResponseAllOf sslCertNickname(String sslCertNickname) {
    
    
    
    
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


  public PolicyExternalServerResponseAllOf connectTimeout(String connectTimeout) {
    
    
    
    
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


  public PolicyExternalServerResponseAllOf responseTimeout(String responseTimeout) {
    
    
    
    
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
   * @return the PolicyExternalServerResponseAllOf instance itself
   */
  public PolicyExternalServerResponseAllOf putAdditionalProperty(String key, Object value) {
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
    PolicyExternalServerResponseAllOf policyExternalServerResponseAllOf = (PolicyExternalServerResponseAllOf) o;
    return Objects.equals(this.description, policyExternalServerResponseAllOf.description) &&
        Objects.equals(this.schemas, policyExternalServerResponseAllOf.schemas) &&
        Objects.equals(this.id, policyExternalServerResponseAllOf.id) &&
        Objects.equals(this.userID, policyExternalServerResponseAllOf.userID) &&
        Objects.equals(this.sharedSecret, policyExternalServerResponseAllOf.sharedSecret) &&
        Objects.equals(this.decisionNode, policyExternalServerResponseAllOf.decisionNode) &&
        Objects.equals(this.branch, policyExternalServerResponseAllOf.branch) &&
        Objects.equals(this.snapshot, policyExternalServerResponseAllOf.snapshot) &&
        Objects.equals(this.hostnameVerificationMethod, policyExternalServerResponseAllOf.hostnameVerificationMethod) &&
        Objects.equals(this.keyManagerProvider, policyExternalServerResponseAllOf.keyManagerProvider) &&
        Objects.equals(this.trustManagerProvider, policyExternalServerResponseAllOf.trustManagerProvider) &&
        Objects.equals(this.baseURL, policyExternalServerResponseAllOf.baseURL) &&
        Objects.equals(this.sslCertNickname, policyExternalServerResponseAllOf.sslCertNickname) &&
        Objects.equals(this.connectTimeout, policyExternalServerResponseAllOf.connectTimeout) &&
        Objects.equals(this.responseTimeout, policyExternalServerResponseAllOf.responseTimeout)&&
        Objects.equals(this.additionalProperties, policyExternalServerResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, id, userID, sharedSecret, decisionNode, branch, snapshot, hostnameVerificationMethod, keyManagerProvider, trustManagerProvider, baseURL, sslCertNickname, connectTimeout, responseTimeout, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyExternalServerResponseAllOf {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    sharedSecret: ").append(toIndentedString(sharedSecret)).append("\n");
    sb.append("    decisionNode: ").append(toIndentedString(decisionNode)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
    sb.append("    hostnameVerificationMethod: ").append(toIndentedString(hostnameVerificationMethod)).append("\n");
    sb.append("    keyManagerProvider: ").append(toIndentedString(keyManagerProvider)).append("\n");
    sb.append("    trustManagerProvider: ").append(toIndentedString(trustManagerProvider)).append("\n");
    sb.append("    baseURL: ").append(toIndentedString(baseURL)).append("\n");
    sb.append("    sslCertNickname: ").append(toIndentedString(sslCertNickname)).append("\n");
    sb.append("    connectTimeout: ").append(toIndentedString(connectTimeout)).append("\n");
    sb.append("    responseTimeout: ").append(toIndentedString(responseTimeout)).append("\n");
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
    openapiFields.add("userID");
    openapiFields.add("sharedSecret");
    openapiFields.add("decisionNode");
    openapiFields.add("branch");
    openapiFields.add("snapshot");
    openapiFields.add("hostnameVerificationMethod");
    openapiFields.add("keyManagerProvider");
    openapiFields.add("trustManagerProvider");
    openapiFields.add("baseURL");
    openapiFields.add("sslCertNickname");
    openapiFields.add("connectTimeout");
    openapiFields.add("responseTimeout");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PolicyExternalServerResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PolicyExternalServerResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PolicyExternalServerResponseAllOf is not found in the empty JSON string", PolicyExternalServerResponseAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("schemas") != null && !jsonObj.get("schemas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemas` to be an array in the JSON string but got `%s`", jsonObj.get("schemas").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("userID") != null && !jsonObj.get("userID").isJsonNull()) && !jsonObj.get("userID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userID").toString()));
      }
      if ((jsonObj.get("sharedSecret") != null && !jsonObj.get("sharedSecret").isJsonNull()) && !jsonObj.get("sharedSecret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedSecret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sharedSecret").toString()));
      }
      if ((jsonObj.get("decisionNode") != null && !jsonObj.get("decisionNode").isJsonNull()) && !jsonObj.get("decisionNode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `decisionNode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("decisionNode").toString()));
      }
      if ((jsonObj.get("branch") != null && !jsonObj.get("branch").isJsonNull()) && !jsonObj.get("branch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `branch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("branch").toString()));
      }
      if ((jsonObj.get("snapshot") != null && !jsonObj.get("snapshot").isJsonNull()) && !jsonObj.get("snapshot").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `snapshot` to be a primitive type in the JSON string but got `%s`", jsonObj.get("snapshot").toString()));
      }
      if ((jsonObj.get("keyManagerProvider") != null && !jsonObj.get("keyManagerProvider").isJsonNull()) && !jsonObj.get("keyManagerProvider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyManagerProvider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyManagerProvider").toString()));
      }
      if ((jsonObj.get("trustManagerProvider") != null && !jsonObj.get("trustManagerProvider").isJsonNull()) && !jsonObj.get("trustManagerProvider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trustManagerProvider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trustManagerProvider").toString()));
      }
      if ((jsonObj.get("baseURL") != null && !jsonObj.get("baseURL").isJsonNull()) && !jsonObj.get("baseURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseURL").toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PolicyExternalServerResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PolicyExternalServerResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PolicyExternalServerResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PolicyExternalServerResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<PolicyExternalServerResponseAllOf>() {
           @Override
           public void write(JsonWriter out, PolicyExternalServerResponseAllOf value) throws IOException {
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
           public PolicyExternalServerResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PolicyExternalServerResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PolicyExternalServerResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PolicyExternalServerResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to PolicyExternalServerResponseAllOf
  */
  public static PolicyExternalServerResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PolicyExternalServerResponseAllOf.class);
  }

 /**
  * Convert an instance of PolicyExternalServerResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

