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
import com.konfigthis.client.model.EnumconsentHttpServletExtensionSchemaUrn;
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
 * ConsentHttpServletExtensionResponseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ConsentHttpServletExtensionResponseAllOf {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumconsentHttpServletExtensionSchemaUrn> schemas = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BEARER_TOKEN_AUTH_ENABLED = "bearerTokenAuthEnabled";
  @SerializedName(SERIALIZED_NAME_BEARER_TOKEN_AUTH_ENABLED)
  private Boolean bearerTokenAuthEnabled;

  public static final String SERIALIZED_NAME_BASIC_AUTH_ENABLED = "basicAuthEnabled";
  @SerializedName(SERIALIZED_NAME_BASIC_AUTH_ENABLED)
  private Boolean basicAuthEnabled;

  public static final String SERIALIZED_NAME_IDENTITY_MAPPER = "identityMapper";
  @SerializedName(SERIALIZED_NAME_IDENTITY_MAPPER)
  private String identityMapper;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN_VALIDATOR = "accessTokenValidator";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN_VALIDATOR)
  private List<String> accessTokenValidator = null;

  public static final String SERIALIZED_NAME_CROSS_ORIGIN_POLICY = "crossOriginPolicy";
  @SerializedName(SERIALIZED_NAME_CROSS_ORIGIN_POLICY)
  private String crossOriginPolicy;

  public static final String SERIALIZED_NAME_RESPONSE_HEADER = "responseHeader";
  @SerializedName(SERIALIZED_NAME_RESPONSE_HEADER)
  private List<String> responseHeader = null;

  public static final String SERIALIZED_NAME_CORRELATION_I_D_RESPONSE_HEADER = "correlationIDResponseHeader";
  @SerializedName(SERIALIZED_NAME_CORRELATION_I_D_RESPONSE_HEADER)
  private String correlationIDResponseHeader;

  public ConsentHttpServletExtensionResponseAllOf() {
  }

  public ConsentHttpServletExtensionResponseAllOf description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this HTTP Servlet Extension
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this HTTP Servlet Extension")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ConsentHttpServletExtensionResponseAllOf schemas(List<EnumconsentHttpServletExtensionSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public ConsentHttpServletExtensionResponseAllOf addSchemasItem(EnumconsentHttpServletExtensionSchemaUrn schemasItem) {
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

  public List<EnumconsentHttpServletExtensionSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumconsentHttpServletExtensionSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public ConsentHttpServletExtensionResponseAllOf id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the HTTP Servlet Extension
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the HTTP Servlet Extension")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ConsentHttpServletExtensionResponseAllOf bearerTokenAuthEnabled(Boolean bearerTokenAuthEnabled) {
    
    
    
    
    this.bearerTokenAuthEnabled = bearerTokenAuthEnabled;
    return this;
  }

   /**
   * Enables HTTP bearer token authentication.
   * @return bearerTokenAuthEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enables HTTP bearer token authentication.")

  public Boolean getBearerTokenAuthEnabled() {
    return bearerTokenAuthEnabled;
  }


  public void setBearerTokenAuthEnabled(Boolean bearerTokenAuthEnabled) {
    
    
    
    this.bearerTokenAuthEnabled = bearerTokenAuthEnabled;
  }


  public ConsentHttpServletExtensionResponseAllOf basicAuthEnabled(Boolean basicAuthEnabled) {
    
    
    
    
    this.basicAuthEnabled = basicAuthEnabled;
    return this;
  }

   /**
   * Enables HTTP Basic authentication, using a username and password. The Identity Mapper specified by the identity-mapper property will be used to map the username to a DN.
   * @return basicAuthEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enables HTTP Basic authentication, using a username and password. The Identity Mapper specified by the identity-mapper property will be used to map the username to a DN.")

  public Boolean getBasicAuthEnabled() {
    return basicAuthEnabled;
  }


  public void setBasicAuthEnabled(Boolean basicAuthEnabled) {
    
    
    
    this.basicAuthEnabled = basicAuthEnabled;
  }


  public ConsentHttpServletExtensionResponseAllOf identityMapper(String identityMapper) {
    
    
    
    
    this.identityMapper = identityMapper;
    return this;
  }

   /**
   * Specifies the Identity Mapper that is to be used for associating basic authentication usernames with DNs.
   * @return identityMapper
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the Identity Mapper that is to be used for associating basic authentication usernames with DNs.")

  public String getIdentityMapper() {
    return identityMapper;
  }


  public void setIdentityMapper(String identityMapper) {
    
    
    
    this.identityMapper = identityMapper;
  }


  public ConsentHttpServletExtensionResponseAllOf accessTokenValidator(List<String> accessTokenValidator) {
    
    
    
    
    this.accessTokenValidator = accessTokenValidator;
    return this;
  }

  public ConsentHttpServletExtensionResponseAllOf addAccessTokenValidatorItem(String accessTokenValidatorItem) {
    if (this.accessTokenValidator == null) {
      this.accessTokenValidator = new ArrayList<>();
    }
    this.accessTokenValidator.add(accessTokenValidatorItem);
    return this;
  }

   /**
   * If specified, the Access Token Validator(s) that may be used to validate access tokens for requests submitted to this Consent HTTP Servlet Extension.
   * @return accessTokenValidator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the Access Token Validator(s) that may be used to validate access tokens for requests submitted to this Consent HTTP Servlet Extension.")

  public List<String> getAccessTokenValidator() {
    return accessTokenValidator;
  }


  public void setAccessTokenValidator(List<String> accessTokenValidator) {
    
    
    
    this.accessTokenValidator = accessTokenValidator;
  }


  public ConsentHttpServletExtensionResponseAllOf crossOriginPolicy(String crossOriginPolicy) {
    
    
    
    
    this.crossOriginPolicy = crossOriginPolicy;
    return this;
  }

   /**
   * The cross-origin request policy to use for the HTTP Servlet Extension.
   * @return crossOriginPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cross-origin request policy to use for the HTTP Servlet Extension.")

  public String getCrossOriginPolicy() {
    return crossOriginPolicy;
  }


  public void setCrossOriginPolicy(String crossOriginPolicy) {
    
    
    
    this.crossOriginPolicy = crossOriginPolicy;
  }


  public ConsentHttpServletExtensionResponseAllOf responseHeader(List<String> responseHeader) {
    
    
    
    
    this.responseHeader = responseHeader;
    return this;
  }

  public ConsentHttpServletExtensionResponseAllOf addResponseHeaderItem(String responseHeaderItem) {
    if (this.responseHeader == null) {
      this.responseHeader = new ArrayList<>();
    }
    this.responseHeader.add(responseHeaderItem);
    return this;
  }

   /**
   * Specifies HTTP header fields and values added to response headers for all requests.
   * @return responseHeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies HTTP header fields and values added to response headers for all requests.")

  public List<String> getResponseHeader() {
    return responseHeader;
  }


  public void setResponseHeader(List<String> responseHeader) {
    
    
    
    this.responseHeader = responseHeader;
  }


  public ConsentHttpServletExtensionResponseAllOf correlationIDResponseHeader(String correlationIDResponseHeader) {
    
    
    
    
    this.correlationIDResponseHeader = correlationIDResponseHeader;
    return this;
  }

   /**
   * Specifies the name of the HTTP response header that will contain a correlation ID value. Example values are \&quot;Correlation-Id\&quot;, \&quot;X-Amzn-Trace-Id\&quot;, and \&quot;X-Request-Id\&quot;.
   * @return correlationIDResponseHeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the name of the HTTP response header that will contain a correlation ID value. Example values are \"Correlation-Id\", \"X-Amzn-Trace-Id\", and \"X-Request-Id\".")

  public String getCorrelationIDResponseHeader() {
    return correlationIDResponseHeader;
  }


  public void setCorrelationIDResponseHeader(String correlationIDResponseHeader) {
    
    
    
    this.correlationIDResponseHeader = correlationIDResponseHeader;
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
   * @return the ConsentHttpServletExtensionResponseAllOf instance itself
   */
  public ConsentHttpServletExtensionResponseAllOf putAdditionalProperty(String key, Object value) {
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
    ConsentHttpServletExtensionResponseAllOf consentHttpServletExtensionResponseAllOf = (ConsentHttpServletExtensionResponseAllOf) o;
    return Objects.equals(this.description, consentHttpServletExtensionResponseAllOf.description) &&
        Objects.equals(this.schemas, consentHttpServletExtensionResponseAllOf.schemas) &&
        Objects.equals(this.id, consentHttpServletExtensionResponseAllOf.id) &&
        Objects.equals(this.bearerTokenAuthEnabled, consentHttpServletExtensionResponseAllOf.bearerTokenAuthEnabled) &&
        Objects.equals(this.basicAuthEnabled, consentHttpServletExtensionResponseAllOf.basicAuthEnabled) &&
        Objects.equals(this.identityMapper, consentHttpServletExtensionResponseAllOf.identityMapper) &&
        Objects.equals(this.accessTokenValidator, consentHttpServletExtensionResponseAllOf.accessTokenValidator) &&
        Objects.equals(this.crossOriginPolicy, consentHttpServletExtensionResponseAllOf.crossOriginPolicy) &&
        Objects.equals(this.responseHeader, consentHttpServletExtensionResponseAllOf.responseHeader) &&
        Objects.equals(this.correlationIDResponseHeader, consentHttpServletExtensionResponseAllOf.correlationIDResponseHeader)&&
        Objects.equals(this.additionalProperties, consentHttpServletExtensionResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, id, bearerTokenAuthEnabled, basicAuthEnabled, identityMapper, accessTokenValidator, crossOriginPolicy, responseHeader, correlationIDResponseHeader, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentHttpServletExtensionResponseAllOf {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bearerTokenAuthEnabled: ").append(toIndentedString(bearerTokenAuthEnabled)).append("\n");
    sb.append("    basicAuthEnabled: ").append(toIndentedString(basicAuthEnabled)).append("\n");
    sb.append("    identityMapper: ").append(toIndentedString(identityMapper)).append("\n");
    sb.append("    accessTokenValidator: ").append(toIndentedString(accessTokenValidator)).append("\n");
    sb.append("    crossOriginPolicy: ").append(toIndentedString(crossOriginPolicy)).append("\n");
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    correlationIDResponseHeader: ").append(toIndentedString(correlationIDResponseHeader)).append("\n");
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
    openapiFields.add("bearerTokenAuthEnabled");
    openapiFields.add("basicAuthEnabled");
    openapiFields.add("identityMapper");
    openapiFields.add("accessTokenValidator");
    openapiFields.add("crossOriginPolicy");
    openapiFields.add("responseHeader");
    openapiFields.add("correlationIDResponseHeader");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConsentHttpServletExtensionResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConsentHttpServletExtensionResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsentHttpServletExtensionResponseAllOf is not found in the empty JSON string", ConsentHttpServletExtensionResponseAllOf.openapiRequiredFields.toString()));
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
      if ((jsonObj.get("identityMapper") != null && !jsonObj.get("identityMapper").isJsonNull()) && !jsonObj.get("identityMapper").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identityMapper` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identityMapper").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("accessTokenValidator") != null && !jsonObj.get("accessTokenValidator").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessTokenValidator` to be an array in the JSON string but got `%s`", jsonObj.get("accessTokenValidator").toString()));
      }
      if ((jsonObj.get("crossOriginPolicy") != null && !jsonObj.get("crossOriginPolicy").isJsonNull()) && !jsonObj.get("crossOriginPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crossOriginPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crossOriginPolicy").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("responseHeader") != null && !jsonObj.get("responseHeader").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseHeader` to be an array in the JSON string but got `%s`", jsonObj.get("responseHeader").toString()));
      }
      if ((jsonObj.get("correlationIDResponseHeader") != null && !jsonObj.get("correlationIDResponseHeader").isJsonNull()) && !jsonObj.get("correlationIDResponseHeader").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `correlationIDResponseHeader` to be a primitive type in the JSON string but got `%s`", jsonObj.get("correlationIDResponseHeader").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsentHttpServletExtensionResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsentHttpServletExtensionResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsentHttpServletExtensionResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsentHttpServletExtensionResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsentHttpServletExtensionResponseAllOf>() {
           @Override
           public void write(JsonWriter out, ConsentHttpServletExtensionResponseAllOf value) throws IOException {
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
           public ConsentHttpServletExtensionResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ConsentHttpServletExtensionResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ConsentHttpServletExtensionResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConsentHttpServletExtensionResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to ConsentHttpServletExtensionResponseAllOf
  */
  public static ConsentHttpServletExtensionResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsentHttpServletExtensionResponseAllOf.class);
  }

 /**
  * Convert an instance of ConsentHttpServletExtensionResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

