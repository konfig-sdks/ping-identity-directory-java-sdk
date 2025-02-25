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
import com.konfigthis.client.model.EnumconsentServiceSchemaUrn;
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
 * ConsentServiceResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ConsentServiceResponse {
  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumconsentServiceSchemaUrn> schemas = null;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_BASE_D_N = "baseDN";
  @SerializedName(SERIALIZED_NAME_BASE_D_N)
  private String baseDN;

  public static final String SERIALIZED_NAME_BIND_D_N = "bindDN";
  @SerializedName(SERIALIZED_NAME_BIND_D_N)
  private String bindDN;

  public static final String SERIALIZED_NAME_SEARCH_SIZE_LIMIT = "searchSizeLimit";
  @SerializedName(SERIALIZED_NAME_SEARCH_SIZE_LIMIT)
  private Integer searchSizeLimit;

  public static final String SERIALIZED_NAME_CONSENT_RECORD_IDENTITY_MAPPER = "consentRecordIdentityMapper";
  @SerializedName(SERIALIZED_NAME_CONSENT_RECORD_IDENTITY_MAPPER)
  private List<String> consentRecordIdentityMapper = null;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_D_N = "serviceAccountDN";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_D_N)
  private List<String> serviceAccountDN = null;

  public static final String SERIALIZED_NAME_UNPRIVILEGED_CONSENT_SCOPE = "unprivilegedConsentScope";
  @SerializedName(SERIALIZED_NAME_UNPRIVILEGED_CONSENT_SCOPE)
  private String unprivilegedConsentScope;

  public static final String SERIALIZED_NAME_PRIVILEGED_CONSENT_SCOPE = "privilegedConsentScope";
  @SerializedName(SERIALIZED_NAME_PRIVILEGED_CONSENT_SCOPE)
  private String privilegedConsentScope;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private String audience;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public ConsentServiceResponse() {
  }

  public ConsentServiceResponse schemas(List<EnumconsentServiceSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public ConsentServiceResponse addSchemasItem(EnumconsentServiceSchemaUrn schemasItem) {
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

  public List<EnumconsentServiceSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumconsentServiceSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public ConsentServiceResponse enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the Consent Service is enabled.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether the Consent Service is enabled.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public ConsentServiceResponse baseDN(String baseDN) {
    
    
    
    
    this.baseDN = baseDN;
    return this;
  }

   /**
   * The base DN under which consent records are stored.
   * @return baseDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The base DN under which consent records are stored.")

  public String getBaseDN() {
    return baseDN;
  }


  public void setBaseDN(String baseDN) {
    
    
    
    this.baseDN = baseDN;
  }


  public ConsentServiceResponse bindDN(String bindDN) {
    
    
    
    
    this.bindDN = bindDN;
    return this;
  }

   /**
   * The DN of an internal service account used by the Consent Service to make internal LDAP requests.
   * @return bindDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The DN of an internal service account used by the Consent Service to make internal LDAP requests.")

  public String getBindDN() {
    return bindDN;
  }


  public void setBindDN(String bindDN) {
    
    
    
    this.bindDN = bindDN;
  }


  public ConsentServiceResponse searchSizeLimit(Integer searchSizeLimit) {
    
    
    
    
    this.searchSizeLimit = searchSizeLimit;
    return this;
  }

   /**
   * The maximum number of consent resources that may be returned from a search request.
   * @return searchSizeLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of consent resources that may be returned from a search request.")

  public Integer getSearchSizeLimit() {
    return searchSizeLimit;
  }


  public void setSearchSizeLimit(Integer searchSizeLimit) {
    
    
    
    this.searchSizeLimit = searchSizeLimit;
  }


  public ConsentServiceResponse consentRecordIdentityMapper(List<String> consentRecordIdentityMapper) {
    
    
    
    
    this.consentRecordIdentityMapper = consentRecordIdentityMapper;
    return this;
  }

  public ConsentServiceResponse addConsentRecordIdentityMapperItem(String consentRecordIdentityMapperItem) {
    if (this.consentRecordIdentityMapper == null) {
      this.consentRecordIdentityMapper = new ArrayList<>();
    }
    this.consentRecordIdentityMapper.add(consentRecordIdentityMapperItem);
    return this;
  }

   /**
   * If specified, the Identity Mapper(s) that may be used to map consent record subject and actor values to DNs. This is typically only needed if privileged API clients will be used.
   * @return consentRecordIdentityMapper
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the Identity Mapper(s) that may be used to map consent record subject and actor values to DNs. This is typically only needed if privileged API clients will be used.")

  public List<String> getConsentRecordIdentityMapper() {
    return consentRecordIdentityMapper;
  }


  public void setConsentRecordIdentityMapper(List<String> consentRecordIdentityMapper) {
    
    
    
    this.consentRecordIdentityMapper = consentRecordIdentityMapper;
  }


  public ConsentServiceResponse serviceAccountDN(List<String> serviceAccountDN) {
    
    
    
    
    this.serviceAccountDN = serviceAccountDN;
    return this;
  }

  public ConsentServiceResponse addServiceAccountDNItem(String serviceAccountDNItem) {
    if (this.serviceAccountDN == null) {
      this.serviceAccountDN = new ArrayList<>();
    }
    this.serviceAccountDN.add(serviceAccountDNItem);
    return this;
  }

   /**
   * The set of account DNs that the Consent Service will consider to be privileged.
   * @return serviceAccountDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The set of account DNs that the Consent Service will consider to be privileged.")

  public List<String> getServiceAccountDN() {
    return serviceAccountDN;
  }


  public void setServiceAccountDN(List<String> serviceAccountDN) {
    
    
    
    this.serviceAccountDN = serviceAccountDN;
  }


  public ConsentServiceResponse unprivilegedConsentScope(String unprivilegedConsentScope) {
    
    
    
    
    this.unprivilegedConsentScope = unprivilegedConsentScope;
    return this;
  }

   /**
   * The name of a scope that must be present in an access token accepted by the Consent Service for unprivileged clients.
   * @return unprivilegedConsentScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a scope that must be present in an access token accepted by the Consent Service for unprivileged clients.")

  public String getUnprivilegedConsentScope() {
    return unprivilegedConsentScope;
  }


  public void setUnprivilegedConsentScope(String unprivilegedConsentScope) {
    
    
    
    this.unprivilegedConsentScope = unprivilegedConsentScope;
  }


  public ConsentServiceResponse privilegedConsentScope(String privilegedConsentScope) {
    
    
    
    
    this.privilegedConsentScope = privilegedConsentScope;
    return this;
  }

   /**
   * The name of a scope that must be present in an access token accepted by the Consent Service if the client is to be considered privileged.
   * @return privilegedConsentScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a scope that must be present in an access token accepted by the Consent Service if the client is to be considered privileged.")

  public String getPrivilegedConsentScope() {
    return privilegedConsentScope;
  }


  public void setPrivilegedConsentScope(String privilegedConsentScope) {
    
    
    
    this.privilegedConsentScope = privilegedConsentScope;
  }


  public ConsentServiceResponse audience(String audience) {
    
    
    
    
    this.audience = audience;
    return this;
  }

   /**
   * A string or URI that identifies the Consent Service in the context of OAuth2 authorization.
   * @return audience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string or URI that identifies the Consent Service in the context of OAuth2 authorization.")

  public String getAudience() {
    return audience;
  }


  public void setAudience(String audience) {
    
    
    
    this.audience = audience;
  }


  public ConsentServiceResponse meta(MetaMeta meta) {
    
    
    
    
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


  public ConsentServiceResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the ConsentServiceResponse instance itself
   */
  public ConsentServiceResponse putAdditionalProperty(String key, Object value) {
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
    ConsentServiceResponse consentServiceResponse = (ConsentServiceResponse) o;
    return Objects.equals(this.schemas, consentServiceResponse.schemas) &&
        Objects.equals(this.enabled, consentServiceResponse.enabled) &&
        Objects.equals(this.baseDN, consentServiceResponse.baseDN) &&
        Objects.equals(this.bindDN, consentServiceResponse.bindDN) &&
        Objects.equals(this.searchSizeLimit, consentServiceResponse.searchSizeLimit) &&
        Objects.equals(this.consentRecordIdentityMapper, consentServiceResponse.consentRecordIdentityMapper) &&
        Objects.equals(this.serviceAccountDN, consentServiceResponse.serviceAccountDN) &&
        Objects.equals(this.unprivilegedConsentScope, consentServiceResponse.unprivilegedConsentScope) &&
        Objects.equals(this.privilegedConsentScope, consentServiceResponse.privilegedConsentScope) &&
        Objects.equals(this.audience, consentServiceResponse.audience) &&
        Objects.equals(this.meta, consentServiceResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, consentServiceResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, consentServiceResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, enabled, baseDN, bindDN, searchSizeLimit, consentRecordIdentityMapper, serviceAccountDN, unprivilegedConsentScope, privilegedConsentScope, audience, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentServiceResponse {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    baseDN: ").append(toIndentedString(baseDN)).append("\n");
    sb.append("    bindDN: ").append(toIndentedString(bindDN)).append("\n");
    sb.append("    searchSizeLimit: ").append(toIndentedString(searchSizeLimit)).append("\n");
    sb.append("    consentRecordIdentityMapper: ").append(toIndentedString(consentRecordIdentityMapper)).append("\n");
    sb.append("    serviceAccountDN: ").append(toIndentedString(serviceAccountDN)).append("\n");
    sb.append("    unprivilegedConsentScope: ").append(toIndentedString(unprivilegedConsentScope)).append("\n");
    sb.append("    privilegedConsentScope: ").append(toIndentedString(privilegedConsentScope)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
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
    openapiFields.add("schemas");
    openapiFields.add("enabled");
    openapiFields.add("baseDN");
    openapiFields.add("bindDN");
    openapiFields.add("searchSizeLimit");
    openapiFields.add("consentRecordIdentityMapper");
    openapiFields.add("serviceAccountDN");
    openapiFields.add("unprivilegedConsentScope");
    openapiFields.add("privilegedConsentScope");
    openapiFields.add("audience");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConsentServiceResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConsentServiceResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsentServiceResponse is not found in the empty JSON string", ConsentServiceResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConsentServiceResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("schemas") != null && !jsonObj.get("schemas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemas` to be an array in the JSON string but got `%s`", jsonObj.get("schemas").toString()));
      }
      if ((jsonObj.get("baseDN") != null && !jsonObj.get("baseDN").isJsonNull()) && !jsonObj.get("baseDN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseDN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseDN").toString()));
      }
      if ((jsonObj.get("bindDN") != null && !jsonObj.get("bindDN").isJsonNull()) && !jsonObj.get("bindDN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bindDN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bindDN").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("consentRecordIdentityMapper") != null && !jsonObj.get("consentRecordIdentityMapper").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `consentRecordIdentityMapper` to be an array in the JSON string but got `%s`", jsonObj.get("consentRecordIdentityMapper").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("serviceAccountDN") != null && !jsonObj.get("serviceAccountDN").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceAccountDN` to be an array in the JSON string but got `%s`", jsonObj.get("serviceAccountDN").toString()));
      }
      if ((jsonObj.get("unprivilegedConsentScope") != null && !jsonObj.get("unprivilegedConsentScope").isJsonNull()) && !jsonObj.get("unprivilegedConsentScope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unprivilegedConsentScope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unprivilegedConsentScope").toString()));
      }
      if ((jsonObj.get("privilegedConsentScope") != null && !jsonObj.get("privilegedConsentScope").isJsonNull()) && !jsonObj.get("privilegedConsentScope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privilegedConsentScope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privilegedConsentScope").toString()));
      }
      if ((jsonObj.get("audience") != null && !jsonObj.get("audience").isJsonNull()) && !jsonObj.get("audience").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audience` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audience").toString()));
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
       if (!ConsentServiceResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsentServiceResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsentServiceResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsentServiceResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsentServiceResponse>() {
           @Override
           public void write(JsonWriter out, ConsentServiceResponse value) throws IOException {
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
           public ConsentServiceResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ConsentServiceResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ConsentServiceResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConsentServiceResponse
  * @throws IOException if the JSON string is invalid with respect to ConsentServiceResponse
  */
  public static ConsentServiceResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsentServiceResponse.class);
  }

 /**
  * Convert an instance of ConsentServiceResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

