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
import com.konfigthis.client.model.EnumamazonAwsExternalServerSchemaUrn;
import com.konfigthis.client.model.EnumexternalServerAmazonAwsAuthenticationMethodProp;
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
 * AmazonAwsExternalServerResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AmazonAwsExternalServerResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumamazonAwsExternalServerSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_HTTP_PROXY_EXTERNAL_SERVER = "httpProxyExternalServer";
  @SerializedName(SERIALIZED_NAME_HTTP_PROXY_EXTERNAL_SERVER)
  private String httpProxyExternalServer;

  public static final String SERIALIZED_NAME_AUTHENTICATION_METHOD = "authenticationMethod";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_METHOD)
  private EnumexternalServerAmazonAwsAuthenticationMethodProp authenticationMethod;

  public static final String SERIALIZED_NAME_AWS_ACCESS_KEY_I_D = "awsAccessKeyID";
  @SerializedName(SERIALIZED_NAME_AWS_ACCESS_KEY_I_D)
  private String awsAccessKeyID;

  public static final String SERIALIZED_NAME_AWS_SECRET_ACCESS_KEY = "awsSecretAccessKey";
  @SerializedName(SERIALIZED_NAME_AWS_SECRET_ACCESS_KEY)
  private String awsSecretAccessKey;

  public static final String SERIALIZED_NAME_AWS_REGION_NAME = "awsRegionName";
  @SerializedName(SERIALIZED_NAME_AWS_REGION_NAME)
  private String awsRegionName;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public AmazonAwsExternalServerResponse() {
  }

  public AmazonAwsExternalServerResponse id(String id) {
    
    
    
    
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


  public AmazonAwsExternalServerResponse description(String description) {
    
    
    
    
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


  public AmazonAwsExternalServerResponse schemas(List<EnumamazonAwsExternalServerSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AmazonAwsExternalServerResponse addSchemasItem(EnumamazonAwsExternalServerSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumamazonAwsExternalServerSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumamazonAwsExternalServerSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AmazonAwsExternalServerResponse httpProxyExternalServer(String httpProxyExternalServer) {
    
    
    
    
    this.httpProxyExternalServer = httpProxyExternalServer;
    return this;
  }

   /**
   * A reference to an HTTP proxy server that should be used for requests sent to the AWS service.
   * @return httpProxyExternalServer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to an HTTP proxy server that should be used for requests sent to the AWS service.")

  public String getHttpProxyExternalServer() {
    return httpProxyExternalServer;
  }


  public void setHttpProxyExternalServer(String httpProxyExternalServer) {
    
    
    
    this.httpProxyExternalServer = httpProxyExternalServer;
  }


  public AmazonAwsExternalServerResponse authenticationMethod(EnumexternalServerAmazonAwsAuthenticationMethodProp authenticationMethod) {
    
    
    
    
    this.authenticationMethod = authenticationMethod;
    return this;
  }

   /**
   * Get authenticationMethod
   * @return authenticationMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumexternalServerAmazonAwsAuthenticationMethodProp getAuthenticationMethod() {
    return authenticationMethod;
  }


  public void setAuthenticationMethod(EnumexternalServerAmazonAwsAuthenticationMethodProp authenticationMethod) {
    
    
    
    this.authenticationMethod = authenticationMethod;
  }


  public AmazonAwsExternalServerResponse awsAccessKeyID(String awsAccessKeyID) {
    
    
    
    
    this.awsAccessKeyID = awsAccessKeyID;
    return this;
  }

   /**
   * The access key ID that will be used if authentication should use an access key. If this is provided, then an aws-secret-access-key must also be provided.
   * @return awsAccessKeyID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The access key ID that will be used if authentication should use an access key. If this is provided, then an aws-secret-access-key must also be provided.")

  public String getAwsAccessKeyID() {
    return awsAccessKeyID;
  }


  public void setAwsAccessKeyID(String awsAccessKeyID) {
    
    
    
    this.awsAccessKeyID = awsAccessKeyID;
  }


  public AmazonAwsExternalServerResponse awsSecretAccessKey(String awsSecretAccessKey) {
    
    
    
    
    this.awsSecretAccessKey = awsSecretAccessKey;
    return this;
  }

   /**
   * The secret access key that will be used if authentication should use an access key. If this is provided, then an aws-access-key-id must also be provided.
   * @return awsSecretAccessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The secret access key that will be used if authentication should use an access key. If this is provided, then an aws-access-key-id must also be provided.")

  public String getAwsSecretAccessKey() {
    return awsSecretAccessKey;
  }


  public void setAwsSecretAccessKey(String awsSecretAccessKey) {
    
    
    
    this.awsSecretAccessKey = awsSecretAccessKey;
  }


  public AmazonAwsExternalServerResponse awsRegionName(String awsRegionName) {
    
    
    
    
    this.awsRegionName = awsRegionName;
    return this;
  }

   /**
   * The name of the AWS region containing the resources that will be accessed.
   * @return awsRegionName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the AWS region containing the resources that will be accessed.")

  public String getAwsRegionName() {
    return awsRegionName;
  }


  public void setAwsRegionName(String awsRegionName) {
    
    
    
    this.awsRegionName = awsRegionName;
  }


  public AmazonAwsExternalServerResponse meta(MetaMeta meta) {
    
    
    
    
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


  public AmazonAwsExternalServerResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the AmazonAwsExternalServerResponse instance itself
   */
  public AmazonAwsExternalServerResponse putAdditionalProperty(String key, Object value) {
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
    AmazonAwsExternalServerResponse amazonAwsExternalServerResponse = (AmazonAwsExternalServerResponse) o;
    return Objects.equals(this.id, amazonAwsExternalServerResponse.id) &&
        Objects.equals(this.description, amazonAwsExternalServerResponse.description) &&
        Objects.equals(this.schemas, amazonAwsExternalServerResponse.schemas) &&
        Objects.equals(this.httpProxyExternalServer, amazonAwsExternalServerResponse.httpProxyExternalServer) &&
        Objects.equals(this.authenticationMethod, amazonAwsExternalServerResponse.authenticationMethod) &&
        Objects.equals(this.awsAccessKeyID, amazonAwsExternalServerResponse.awsAccessKeyID) &&
        Objects.equals(this.awsSecretAccessKey, amazonAwsExternalServerResponse.awsSecretAccessKey) &&
        Objects.equals(this.awsRegionName, amazonAwsExternalServerResponse.awsRegionName) &&
        Objects.equals(this.meta, amazonAwsExternalServerResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, amazonAwsExternalServerResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, amazonAwsExternalServerResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, schemas, httpProxyExternalServer, authenticationMethod, awsAccessKeyID, awsSecretAccessKey, awsRegionName, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmazonAwsExternalServerResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    httpProxyExternalServer: ").append(toIndentedString(httpProxyExternalServer)).append("\n");
    sb.append("    authenticationMethod: ").append(toIndentedString(authenticationMethod)).append("\n");
    sb.append("    awsAccessKeyID: ").append(toIndentedString(awsAccessKeyID)).append("\n");
    sb.append("    awsSecretAccessKey: ").append(toIndentedString(awsSecretAccessKey)).append("\n");
    sb.append("    awsRegionName: ").append(toIndentedString(awsRegionName)).append("\n");
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
    openapiFields.add("httpProxyExternalServer");
    openapiFields.add("authenticationMethod");
    openapiFields.add("awsAccessKeyID");
    openapiFields.add("awsSecretAccessKey");
    openapiFields.add("awsRegionName");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("awsRegionName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AmazonAwsExternalServerResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AmazonAwsExternalServerResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AmazonAwsExternalServerResponse is not found in the empty JSON string", AmazonAwsExternalServerResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AmazonAwsExternalServerResponse.openapiRequiredFields) {
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
      if ((jsonObj.get("httpProxyExternalServer") != null && !jsonObj.get("httpProxyExternalServer").isJsonNull()) && !jsonObj.get("httpProxyExternalServer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `httpProxyExternalServer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("httpProxyExternalServer").toString()));
      }
      if ((jsonObj.get("awsAccessKeyID") != null && !jsonObj.get("awsAccessKeyID").isJsonNull()) && !jsonObj.get("awsAccessKeyID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `awsAccessKeyID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("awsAccessKeyID").toString()));
      }
      if ((jsonObj.get("awsSecretAccessKey") != null && !jsonObj.get("awsSecretAccessKey").isJsonNull()) && !jsonObj.get("awsSecretAccessKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `awsSecretAccessKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("awsSecretAccessKey").toString()));
      }
      if (!jsonObj.get("awsRegionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `awsRegionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("awsRegionName").toString()));
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
       if (!AmazonAwsExternalServerResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AmazonAwsExternalServerResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AmazonAwsExternalServerResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AmazonAwsExternalServerResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AmazonAwsExternalServerResponse>() {
           @Override
           public void write(JsonWriter out, AmazonAwsExternalServerResponse value) throws IOException {
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
           public AmazonAwsExternalServerResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AmazonAwsExternalServerResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AmazonAwsExternalServerResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AmazonAwsExternalServerResponse
  * @throws IOException if the JSON string is invalid with respect to AmazonAwsExternalServerResponse
  */
  public static AmazonAwsExternalServerResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AmazonAwsExternalServerResponse.class);
  }

 /**
  * Convert an instance of AmazonAwsExternalServerResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

