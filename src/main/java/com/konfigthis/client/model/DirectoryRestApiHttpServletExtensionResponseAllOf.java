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
import com.konfigthis.client.model.EnumdirectoryRestApiHttpServletExtensionSchemaUrn;
import com.konfigthis.client.model.EnumhttpServletExtensionAllowedControlProp;
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
 * DirectoryRestApiHttpServletExtensionResponseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DirectoryRestApiHttpServletExtensionResponseAllOf {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumdirectoryRestApiHttpServletExtensionSchemaUrn> schemas = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BASIC_AUTH_ENABLED = "basicAuthEnabled";
  @SerializedName(SERIALIZED_NAME_BASIC_AUTH_ENABLED)
  private Boolean basicAuthEnabled;

  public static final String SERIALIZED_NAME_IDENTITY_MAPPER = "identityMapper";
  @SerializedName(SERIALIZED_NAME_IDENTITY_MAPPER)
  private String identityMapper;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN_VALIDATOR = "accessTokenValidator";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN_VALIDATOR)
  private List<String> accessTokenValidator = null;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN_SCOPE = "accessTokenScope";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN_SCOPE)
  private String accessTokenScope;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private String audience;

  public static final String SERIALIZED_NAME_MAX_PAGE_SIZE = "maxPageSize";
  @SerializedName(SERIALIZED_NAME_MAX_PAGE_SIZE)
  private Integer maxPageSize;

  public static final String SERIALIZED_NAME_SCHEMAS_ENDPOINT_OBJECTCLASS = "schemasEndpointObjectclass";
  @SerializedName(SERIALIZED_NAME_SCHEMAS_ENDPOINT_OBJECTCLASS)
  private List<String> schemasEndpointObjectclass = null;

  public static final String SERIALIZED_NAME_DEFAULT_OPERATIONAL_ATTRIBUTE = "defaultOperationalAttribute";
  @SerializedName(SERIALIZED_NAME_DEFAULT_OPERATIONAL_ATTRIBUTE)
  private List<String> defaultOperationalAttribute = null;

  public static final String SERIALIZED_NAME_REJECT_EXPANSION_ATTRIBUTE = "rejectExpansionAttribute";
  @SerializedName(SERIALIZED_NAME_REJECT_EXPANSION_ATTRIBUTE)
  private List<String> rejectExpansionAttribute = null;

  public static final String SERIALIZED_NAME_ALWAYS_USE_PERMISSIVE_MODIFY = "alwaysUsePermissiveModify";
  @SerializedName(SERIALIZED_NAME_ALWAYS_USE_PERMISSIVE_MODIFY)
  private Boolean alwaysUsePermissiveModify;

  public static final String SERIALIZED_NAME_ALLOWED_CONTROL = "allowedControl";
  @SerializedName(SERIALIZED_NAME_ALLOWED_CONTROL)
  private List<EnumhttpServletExtensionAllowedControlProp> allowedControl = null;

  public static final String SERIALIZED_NAME_CROSS_ORIGIN_POLICY = "crossOriginPolicy";
  @SerializedName(SERIALIZED_NAME_CROSS_ORIGIN_POLICY)
  private String crossOriginPolicy;

  public static final String SERIALIZED_NAME_RESPONSE_HEADER = "responseHeader";
  @SerializedName(SERIALIZED_NAME_RESPONSE_HEADER)
  private List<String> responseHeader = null;

  public static final String SERIALIZED_NAME_CORRELATION_I_D_RESPONSE_HEADER = "correlationIDResponseHeader";
  @SerializedName(SERIALIZED_NAME_CORRELATION_I_D_RESPONSE_HEADER)
  private String correlationIDResponseHeader;

  public DirectoryRestApiHttpServletExtensionResponseAllOf() {
  }

  public DirectoryRestApiHttpServletExtensionResponseAllOf description(String description) {
    
    
    
    
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


  public DirectoryRestApiHttpServletExtensionResponseAllOf schemas(List<EnumdirectoryRestApiHttpServletExtensionSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public DirectoryRestApiHttpServletExtensionResponseAllOf addSchemasItem(EnumdirectoryRestApiHttpServletExtensionSchemaUrn schemasItem) {
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

  public List<EnumdirectoryRestApiHttpServletExtensionSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumdirectoryRestApiHttpServletExtensionSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public DirectoryRestApiHttpServletExtensionResponseAllOf id(String id) {
    
    
    
    
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


  public DirectoryRestApiHttpServletExtensionResponseAllOf basicAuthEnabled(Boolean basicAuthEnabled) {
    
    
    
    
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


  public DirectoryRestApiHttpServletExtensionResponseAllOf identityMapper(String identityMapper) {
    
    
    
    
    this.identityMapper = identityMapper;
    return this;
  }

   /**
   * Specifies the Identity Mapper that is to be used for associating user entries with basic authentication usernames.
   * @return identityMapper
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the Identity Mapper that is to be used for associating user entries with basic authentication usernames.")

  public String getIdentityMapper() {
    return identityMapper;
  }


  public void setIdentityMapper(String identityMapper) {
    
    
    
    this.identityMapper = identityMapper;
  }


  public DirectoryRestApiHttpServletExtensionResponseAllOf accessTokenValidator(List<String> accessTokenValidator) {
    
    
    
    
    this.accessTokenValidator = accessTokenValidator;
    return this;
  }

  public DirectoryRestApiHttpServletExtensionResponseAllOf addAccessTokenValidatorItem(String accessTokenValidatorItem) {
    if (this.accessTokenValidator == null) {
      this.accessTokenValidator = new ArrayList<>();
    }
    this.accessTokenValidator.add(accessTokenValidatorItem);
    return this;
  }

   /**
   * If specified, the Access Token Validator(s) that may be used to validate access tokens for requests submitted to this Directory REST API HTTP Servlet Extension.
   * @return accessTokenValidator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the Access Token Validator(s) that may be used to validate access tokens for requests submitted to this Directory REST API HTTP Servlet Extension.")

  public List<String> getAccessTokenValidator() {
    return accessTokenValidator;
  }


  public void setAccessTokenValidator(List<String> accessTokenValidator) {
    
    
    
    this.accessTokenValidator = accessTokenValidator;
  }


  public DirectoryRestApiHttpServletExtensionResponseAllOf accessTokenScope(String accessTokenScope) {
    
    
    
    
    this.accessTokenScope = accessTokenScope;
    return this;
  }

   /**
   * The name of a scope that must be present in an access token accepted by the Directory REST API HTTP Servlet Extension.
   * @return accessTokenScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a scope that must be present in an access token accepted by the Directory REST API HTTP Servlet Extension.")

  public String getAccessTokenScope() {
    return accessTokenScope;
  }


  public void setAccessTokenScope(String accessTokenScope) {
    
    
    
    this.accessTokenScope = accessTokenScope;
  }


  public DirectoryRestApiHttpServletExtensionResponseAllOf audience(String audience) {
    
    
    
    
    this.audience = audience;
    return this;
  }

   /**
   * A string or URI that identifies the Directory REST API HTTP Servlet Extension in the context of OAuth2 authorization.
   * @return audience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string or URI that identifies the Directory REST API HTTP Servlet Extension in the context of OAuth2 authorization.")

  public String getAudience() {
    return audience;
  }


  public void setAudience(String audience) {
    
    
    
    this.audience = audience;
  }


  public DirectoryRestApiHttpServletExtensionResponseAllOf maxPageSize(Integer maxPageSize) {
    
    
    
    
    this.maxPageSize = maxPageSize;
    return this;
  }

   /**
   * The maximum number of entries to be returned in one page of search results.
   * @return maxPageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of entries to be returned in one page of search results.")

  public Integer getMaxPageSize() {
    return maxPageSize;
  }


  public void setMaxPageSize(Integer maxPageSize) {
    
    
    
    this.maxPageSize = maxPageSize;
  }


  public DirectoryRestApiHttpServletExtensionResponseAllOf schemasEndpointObjectclass(List<String> schemasEndpointObjectclass) {
    
    
    
    
    this.schemasEndpointObjectclass = schemasEndpointObjectclass;
    return this;
  }

  public DirectoryRestApiHttpServletExtensionResponseAllOf addSchemasEndpointObjectclassItem(String schemasEndpointObjectclassItem) {
    if (this.schemasEndpointObjectclass == null) {
      this.schemasEndpointObjectclass = new ArrayList<>();
    }
    this.schemasEndpointObjectclass.add(schemasEndpointObjectclassItem);
    return this;
  }

   /**
   * The list of object classes which will be returned by the schemas endpoint.
   * @return schemasEndpointObjectclass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of object classes which will be returned by the schemas endpoint.")

  public List<String> getSchemasEndpointObjectclass() {
    return schemasEndpointObjectclass;
  }


  public void setSchemasEndpointObjectclass(List<String> schemasEndpointObjectclass) {
    
    
    
    this.schemasEndpointObjectclass = schemasEndpointObjectclass;
  }


  public DirectoryRestApiHttpServletExtensionResponseAllOf defaultOperationalAttribute(List<String> defaultOperationalAttribute) {
    
    
    
    
    this.defaultOperationalAttribute = defaultOperationalAttribute;
    return this;
  }

  public DirectoryRestApiHttpServletExtensionResponseAllOf addDefaultOperationalAttributeItem(String defaultOperationalAttributeItem) {
    if (this.defaultOperationalAttribute == null) {
      this.defaultOperationalAttribute = new ArrayList<>();
    }
    this.defaultOperationalAttribute.add(defaultOperationalAttributeItem);
    return this;
  }

   /**
   * A set of operational attributes that will be returned with entries by default.
   * @return defaultOperationalAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A set of operational attributes that will be returned with entries by default.")

  public List<String> getDefaultOperationalAttribute() {
    return defaultOperationalAttribute;
  }


  public void setDefaultOperationalAttribute(List<String> defaultOperationalAttribute) {
    
    
    
    this.defaultOperationalAttribute = defaultOperationalAttribute;
  }


  public DirectoryRestApiHttpServletExtensionResponseAllOf rejectExpansionAttribute(List<String> rejectExpansionAttribute) {
    
    
    
    
    this.rejectExpansionAttribute = rejectExpansionAttribute;
    return this;
  }

  public DirectoryRestApiHttpServletExtensionResponseAllOf addRejectExpansionAttributeItem(String rejectExpansionAttributeItem) {
    if (this.rejectExpansionAttribute == null) {
      this.rejectExpansionAttribute = new ArrayList<>();
    }
    this.rejectExpansionAttribute.add(rejectExpansionAttributeItem);
    return this;
  }

   /**
   * A set of attributes which the client is not allowed to provide for the expand query parameters. This should be used for attributes that could either have a large number of values or that reference entries that are very large like groups.
   * @return rejectExpansionAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A set of attributes which the client is not allowed to provide for the expand query parameters. This should be used for attributes that could either have a large number of values or that reference entries that are very large like groups.")

  public List<String> getRejectExpansionAttribute() {
    return rejectExpansionAttribute;
  }


  public void setRejectExpansionAttribute(List<String> rejectExpansionAttribute) {
    
    
    
    this.rejectExpansionAttribute = rejectExpansionAttribute;
  }


  public DirectoryRestApiHttpServletExtensionResponseAllOf alwaysUsePermissiveModify(Boolean alwaysUsePermissiveModify) {
    
    
    
    
    this.alwaysUsePermissiveModify = alwaysUsePermissiveModify;
    return this;
  }

   /**
   * Indicates whether to always use permissive modify behavior for PATCH requests, even if the request did not include the permissive modify request control.
   * @return alwaysUsePermissiveModify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether to always use permissive modify behavior for PATCH requests, even if the request did not include the permissive modify request control.")

  public Boolean getAlwaysUsePermissiveModify() {
    return alwaysUsePermissiveModify;
  }


  public void setAlwaysUsePermissiveModify(Boolean alwaysUsePermissiveModify) {
    
    
    
    this.alwaysUsePermissiveModify = alwaysUsePermissiveModify;
  }


  public DirectoryRestApiHttpServletExtensionResponseAllOf allowedControl(List<EnumhttpServletExtensionAllowedControlProp> allowedControl) {
    
    
    
    
    this.allowedControl = allowedControl;
    return this;
  }

  public DirectoryRestApiHttpServletExtensionResponseAllOf addAllowedControlItem(EnumhttpServletExtensionAllowedControlProp allowedControlItem) {
    if (this.allowedControl == null) {
      this.allowedControl = new ArrayList<>();
    }
    this.allowedControl.add(allowedControlItem);
    return this;
  }

   /**
   * Get allowedControl
   * @return allowedControl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumhttpServletExtensionAllowedControlProp> getAllowedControl() {
    return allowedControl;
  }


  public void setAllowedControl(List<EnumhttpServletExtensionAllowedControlProp> allowedControl) {
    
    
    
    this.allowedControl = allowedControl;
  }


  public DirectoryRestApiHttpServletExtensionResponseAllOf crossOriginPolicy(String crossOriginPolicy) {
    
    
    
    
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


  public DirectoryRestApiHttpServletExtensionResponseAllOf responseHeader(List<String> responseHeader) {
    
    
    
    
    this.responseHeader = responseHeader;
    return this;
  }

  public DirectoryRestApiHttpServletExtensionResponseAllOf addResponseHeaderItem(String responseHeaderItem) {
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


  public DirectoryRestApiHttpServletExtensionResponseAllOf correlationIDResponseHeader(String correlationIDResponseHeader) {
    
    
    
    
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
   * @return the DirectoryRestApiHttpServletExtensionResponseAllOf instance itself
   */
  public DirectoryRestApiHttpServletExtensionResponseAllOf putAdditionalProperty(String key, Object value) {
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
    DirectoryRestApiHttpServletExtensionResponseAllOf directoryRestApiHttpServletExtensionResponseAllOf = (DirectoryRestApiHttpServletExtensionResponseAllOf) o;
    return Objects.equals(this.description, directoryRestApiHttpServletExtensionResponseAllOf.description) &&
        Objects.equals(this.schemas, directoryRestApiHttpServletExtensionResponseAllOf.schemas) &&
        Objects.equals(this.id, directoryRestApiHttpServletExtensionResponseAllOf.id) &&
        Objects.equals(this.basicAuthEnabled, directoryRestApiHttpServletExtensionResponseAllOf.basicAuthEnabled) &&
        Objects.equals(this.identityMapper, directoryRestApiHttpServletExtensionResponseAllOf.identityMapper) &&
        Objects.equals(this.accessTokenValidator, directoryRestApiHttpServletExtensionResponseAllOf.accessTokenValidator) &&
        Objects.equals(this.accessTokenScope, directoryRestApiHttpServletExtensionResponseAllOf.accessTokenScope) &&
        Objects.equals(this.audience, directoryRestApiHttpServletExtensionResponseAllOf.audience) &&
        Objects.equals(this.maxPageSize, directoryRestApiHttpServletExtensionResponseAllOf.maxPageSize) &&
        Objects.equals(this.schemasEndpointObjectclass, directoryRestApiHttpServletExtensionResponseAllOf.schemasEndpointObjectclass) &&
        Objects.equals(this.defaultOperationalAttribute, directoryRestApiHttpServletExtensionResponseAllOf.defaultOperationalAttribute) &&
        Objects.equals(this.rejectExpansionAttribute, directoryRestApiHttpServletExtensionResponseAllOf.rejectExpansionAttribute) &&
        Objects.equals(this.alwaysUsePermissiveModify, directoryRestApiHttpServletExtensionResponseAllOf.alwaysUsePermissiveModify) &&
        Objects.equals(this.allowedControl, directoryRestApiHttpServletExtensionResponseAllOf.allowedControl) &&
        Objects.equals(this.crossOriginPolicy, directoryRestApiHttpServletExtensionResponseAllOf.crossOriginPolicy) &&
        Objects.equals(this.responseHeader, directoryRestApiHttpServletExtensionResponseAllOf.responseHeader) &&
        Objects.equals(this.correlationIDResponseHeader, directoryRestApiHttpServletExtensionResponseAllOf.correlationIDResponseHeader)&&
        Objects.equals(this.additionalProperties, directoryRestApiHttpServletExtensionResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, id, basicAuthEnabled, identityMapper, accessTokenValidator, accessTokenScope, audience, maxPageSize, schemasEndpointObjectclass, defaultOperationalAttribute, rejectExpansionAttribute, alwaysUsePermissiveModify, allowedControl, crossOriginPolicy, responseHeader, correlationIDResponseHeader, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectoryRestApiHttpServletExtensionResponseAllOf {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    basicAuthEnabled: ").append(toIndentedString(basicAuthEnabled)).append("\n");
    sb.append("    identityMapper: ").append(toIndentedString(identityMapper)).append("\n");
    sb.append("    accessTokenValidator: ").append(toIndentedString(accessTokenValidator)).append("\n");
    sb.append("    accessTokenScope: ").append(toIndentedString(accessTokenScope)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    maxPageSize: ").append(toIndentedString(maxPageSize)).append("\n");
    sb.append("    schemasEndpointObjectclass: ").append(toIndentedString(schemasEndpointObjectclass)).append("\n");
    sb.append("    defaultOperationalAttribute: ").append(toIndentedString(defaultOperationalAttribute)).append("\n");
    sb.append("    rejectExpansionAttribute: ").append(toIndentedString(rejectExpansionAttribute)).append("\n");
    sb.append("    alwaysUsePermissiveModify: ").append(toIndentedString(alwaysUsePermissiveModify)).append("\n");
    sb.append("    allowedControl: ").append(toIndentedString(allowedControl)).append("\n");
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
    openapiFields.add("basicAuthEnabled");
    openapiFields.add("identityMapper");
    openapiFields.add("accessTokenValidator");
    openapiFields.add("accessTokenScope");
    openapiFields.add("audience");
    openapiFields.add("maxPageSize");
    openapiFields.add("schemasEndpointObjectclass");
    openapiFields.add("defaultOperationalAttribute");
    openapiFields.add("rejectExpansionAttribute");
    openapiFields.add("alwaysUsePermissiveModify");
    openapiFields.add("allowedControl");
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
  * @throws IOException if the JSON Object is invalid with respect to DirectoryRestApiHttpServletExtensionResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DirectoryRestApiHttpServletExtensionResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DirectoryRestApiHttpServletExtensionResponseAllOf is not found in the empty JSON string", DirectoryRestApiHttpServletExtensionResponseAllOf.openapiRequiredFields.toString()));
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
      if ((jsonObj.get("accessTokenScope") != null && !jsonObj.get("accessTokenScope").isJsonNull()) && !jsonObj.get("accessTokenScope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessTokenScope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessTokenScope").toString()));
      }
      if ((jsonObj.get("audience") != null && !jsonObj.get("audience").isJsonNull()) && !jsonObj.get("audience").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audience` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audience").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("schemasEndpointObjectclass") != null && !jsonObj.get("schemasEndpointObjectclass").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemasEndpointObjectclass` to be an array in the JSON string but got `%s`", jsonObj.get("schemasEndpointObjectclass").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("defaultOperationalAttribute") != null && !jsonObj.get("defaultOperationalAttribute").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultOperationalAttribute` to be an array in the JSON string but got `%s`", jsonObj.get("defaultOperationalAttribute").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rejectExpansionAttribute") != null && !jsonObj.get("rejectExpansionAttribute").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rejectExpansionAttribute` to be an array in the JSON string but got `%s`", jsonObj.get("rejectExpansionAttribute").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowedControl") != null && !jsonObj.get("allowedControl").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedControl` to be an array in the JSON string but got `%s`", jsonObj.get("allowedControl").toString()));
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
       if (!DirectoryRestApiHttpServletExtensionResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DirectoryRestApiHttpServletExtensionResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DirectoryRestApiHttpServletExtensionResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DirectoryRestApiHttpServletExtensionResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<DirectoryRestApiHttpServletExtensionResponseAllOf>() {
           @Override
           public void write(JsonWriter out, DirectoryRestApiHttpServletExtensionResponseAllOf value) throws IOException {
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
           public DirectoryRestApiHttpServletExtensionResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DirectoryRestApiHttpServletExtensionResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DirectoryRestApiHttpServletExtensionResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DirectoryRestApiHttpServletExtensionResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to DirectoryRestApiHttpServletExtensionResponseAllOf
  */
  public static DirectoryRestApiHttpServletExtensionResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DirectoryRestApiHttpServletExtensionResponseAllOf.class);
  }

 /**
  * Convert an instance of DirectoryRestApiHttpServletExtensionResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

