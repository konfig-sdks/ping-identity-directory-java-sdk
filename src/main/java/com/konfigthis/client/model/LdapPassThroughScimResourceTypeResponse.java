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
import com.konfigthis.client.model.EnumldapPassThroughScimResourceTypeSchemaUrn;
import com.konfigthis.client.model.EnumscimResourceTypeSchemaCheckingOptionProp;
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
 * LdapPassThroughScimResourceTypeResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LdapPassThroughScimResourceTypeResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumldapPassThroughScimResourceTypeSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public static final String SERIALIZED_NAME_LOOKTHROUGH_LIMIT = "lookthroughLimit";
  @SerializedName(SERIALIZED_NAME_LOOKTHROUGH_LIMIT)
  private Integer lookthroughLimit;

  public static final String SERIALIZED_NAME_SCHEMA_CHECKING_OPTION = "schemaCheckingOption";
  @SerializedName(SERIALIZED_NAME_SCHEMA_CHECKING_OPTION)
  private List<EnumscimResourceTypeSchemaCheckingOptionProp> schemaCheckingOption = null;

  public static final String SERIALIZED_NAME_STRUCTURAL_L_D_A_P_OBJECTCLASS = "structuralLDAPObjectclass";
  @SerializedName(SERIALIZED_NAME_STRUCTURAL_L_D_A_P_OBJECTCLASS)
  private String structuralLDAPObjectclass;

  public static final String SERIALIZED_NAME_AUXILIARY_L_D_A_P_OBJECTCLASS = "auxiliaryLDAPObjectclass";
  @SerializedName(SERIALIZED_NAME_AUXILIARY_L_D_A_P_OBJECTCLASS)
  private List<String> auxiliaryLDAPObjectclass = null;

  public static final String SERIALIZED_NAME_INCLUDE_BASE_D_N = "includeBaseDN";
  @SerializedName(SERIALIZED_NAME_INCLUDE_BASE_D_N)
  private String includeBaseDN;

  public static final String SERIALIZED_NAME_INCLUDE_FILTER = "includeFilter";
  @SerializedName(SERIALIZED_NAME_INCLUDE_FILTER)
  private List<String> includeFilter = null;

  public static final String SERIALIZED_NAME_INCLUDE_OPERATIONAL_ATTRIBUTE = "includeOperationalAttribute";
  @SerializedName(SERIALIZED_NAME_INCLUDE_OPERATIONAL_ATTRIBUTE)
  private List<String> includeOperationalAttribute = null;

  public static final String SERIALIZED_NAME_CREATE_D_N_PATTERN = "createDNPattern";
  @SerializedName(SERIALIZED_NAME_CREATE_D_N_PATTERN)
  private String createDNPattern;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public LdapPassThroughScimResourceTypeResponse() {
  }

  public LdapPassThroughScimResourceTypeResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the SCIM Resource Type
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the SCIM Resource Type")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public LdapPassThroughScimResourceTypeResponse description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this SCIM Resource Type
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this SCIM Resource Type")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public LdapPassThroughScimResourceTypeResponse schemas(List<EnumldapPassThroughScimResourceTypeSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public LdapPassThroughScimResourceTypeResponse addSchemasItem(EnumldapPassThroughScimResourceTypeSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumldapPassThroughScimResourceTypeSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumldapPassThroughScimResourceTypeSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public LdapPassThroughScimResourceTypeResponse enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the SCIM Resource Type is enabled.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether the SCIM Resource Type is enabled.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public LdapPassThroughScimResourceTypeResponse endpoint(String endpoint) {
    
    
    
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * The HTTP addressable endpoint of this SCIM Resource Type relative to the &#39;/scim/v2&#39; base URL. Do not include a leading &#39;/&#39;.
   * @return endpoint
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The HTTP addressable endpoint of this SCIM Resource Type relative to the '/scim/v2' base URL. Do not include a leading '/'.")

  public String getEndpoint() {
    return endpoint;
  }


  public void setEndpoint(String endpoint) {
    
    
    
    this.endpoint = endpoint;
  }


  public LdapPassThroughScimResourceTypeResponse lookthroughLimit(Integer lookthroughLimit) {
    
    
    
    
    this.lookthroughLimit = lookthroughLimit;
    return this;
  }

   /**
   * The maximum number of resources that the SCIM Resource Type should \&quot;look through\&quot; in the course of processing a search request.
   * @return lookthroughLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of resources that the SCIM Resource Type should \"look through\" in the course of processing a search request.")

  public Integer getLookthroughLimit() {
    return lookthroughLimit;
  }


  public void setLookthroughLimit(Integer lookthroughLimit) {
    
    
    
    this.lookthroughLimit = lookthroughLimit;
  }


  public LdapPassThroughScimResourceTypeResponse schemaCheckingOption(List<EnumscimResourceTypeSchemaCheckingOptionProp> schemaCheckingOption) {
    
    
    
    
    this.schemaCheckingOption = schemaCheckingOption;
    return this;
  }

  public LdapPassThroughScimResourceTypeResponse addSchemaCheckingOptionItem(EnumscimResourceTypeSchemaCheckingOptionProp schemaCheckingOptionItem) {
    if (this.schemaCheckingOption == null) {
      this.schemaCheckingOption = new ArrayList<>();
    }
    this.schemaCheckingOption.add(schemaCheckingOptionItem);
    return this;
  }

   /**
   * Get schemaCheckingOption
   * @return schemaCheckingOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumscimResourceTypeSchemaCheckingOptionProp> getSchemaCheckingOption() {
    return schemaCheckingOption;
  }


  public void setSchemaCheckingOption(List<EnumscimResourceTypeSchemaCheckingOptionProp> schemaCheckingOption) {
    
    
    
    this.schemaCheckingOption = schemaCheckingOption;
  }


  public LdapPassThroughScimResourceTypeResponse structuralLDAPObjectclass(String structuralLDAPObjectclass) {
    
    
    
    
    this.structuralLDAPObjectclass = structuralLDAPObjectclass;
    return this;
  }

   /**
   * Specifies the LDAP structural object class that should be exposed by this SCIM Resource Type.
   * @return structuralLDAPObjectclass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the LDAP structural object class that should be exposed by this SCIM Resource Type.")

  public String getStructuralLDAPObjectclass() {
    return structuralLDAPObjectclass;
  }


  public void setStructuralLDAPObjectclass(String structuralLDAPObjectclass) {
    
    
    
    this.structuralLDAPObjectclass = structuralLDAPObjectclass;
  }


  public LdapPassThroughScimResourceTypeResponse auxiliaryLDAPObjectclass(List<String> auxiliaryLDAPObjectclass) {
    
    
    
    
    this.auxiliaryLDAPObjectclass = auxiliaryLDAPObjectclass;
    return this;
  }

  public LdapPassThroughScimResourceTypeResponse addAuxiliaryLDAPObjectclassItem(String auxiliaryLDAPObjectclassItem) {
    if (this.auxiliaryLDAPObjectclass == null) {
      this.auxiliaryLDAPObjectclass = new ArrayList<>();
    }
    this.auxiliaryLDAPObjectclass.add(auxiliaryLDAPObjectclassItem);
    return this;
  }

   /**
   * Specifies an auxiliary LDAP object class that should be exposed by this SCIM Resource Type.
   * @return auxiliaryLDAPObjectclass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an auxiliary LDAP object class that should be exposed by this SCIM Resource Type.")

  public List<String> getAuxiliaryLDAPObjectclass() {
    return auxiliaryLDAPObjectclass;
  }


  public void setAuxiliaryLDAPObjectclass(List<String> auxiliaryLDAPObjectclass) {
    
    
    
    this.auxiliaryLDAPObjectclass = auxiliaryLDAPObjectclass;
  }


  public LdapPassThroughScimResourceTypeResponse includeBaseDN(String includeBaseDN) {
    
    
    
    
    this.includeBaseDN = includeBaseDN;
    return this;
  }

   /**
   * Specifies the base DN of the branch of the LDAP directory that can be accessed by this SCIM Resource Type.
   * @return includeBaseDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the base DN of the branch of the LDAP directory that can be accessed by this SCIM Resource Type.")

  public String getIncludeBaseDN() {
    return includeBaseDN;
  }


  public void setIncludeBaseDN(String includeBaseDN) {
    
    
    
    this.includeBaseDN = includeBaseDN;
  }


  public LdapPassThroughScimResourceTypeResponse includeFilter(List<String> includeFilter) {
    
    
    
    
    this.includeFilter = includeFilter;
    return this;
  }

  public LdapPassThroughScimResourceTypeResponse addIncludeFilterItem(String includeFilterItem) {
    if (this.includeFilter == null) {
      this.includeFilter = new ArrayList<>();
    }
    this.includeFilter.add(includeFilterItem);
    return this;
  }

   /**
   * The set of LDAP filters that define the LDAP entries that should be included in this SCIM Resource Type.
   * @return includeFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The set of LDAP filters that define the LDAP entries that should be included in this SCIM Resource Type.")

  public List<String> getIncludeFilter() {
    return includeFilter;
  }


  public void setIncludeFilter(List<String> includeFilter) {
    
    
    
    this.includeFilter = includeFilter;
  }


  public LdapPassThroughScimResourceTypeResponse includeOperationalAttribute(List<String> includeOperationalAttribute) {
    
    
    
    
    this.includeOperationalAttribute = includeOperationalAttribute;
    return this;
  }

  public LdapPassThroughScimResourceTypeResponse addIncludeOperationalAttributeItem(String includeOperationalAttributeItem) {
    if (this.includeOperationalAttribute == null) {
      this.includeOperationalAttribute = new ArrayList<>();
    }
    this.includeOperationalAttribute.add(includeOperationalAttributeItem);
    return this;
  }

   /**
   * Specifies the set of operational LDAP attributes to be provided by this SCIM Resource Type.
   * @return includeOperationalAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the set of operational LDAP attributes to be provided by this SCIM Resource Type.")

  public List<String> getIncludeOperationalAttribute() {
    return includeOperationalAttribute;
  }


  public void setIncludeOperationalAttribute(List<String> includeOperationalAttribute) {
    
    
    
    this.includeOperationalAttribute = includeOperationalAttribute;
  }


  public LdapPassThroughScimResourceTypeResponse createDNPattern(String createDNPattern) {
    
    
    
    
    this.createDNPattern = createDNPattern;
    return this;
  }

   /**
   * Specifies the template to use for the DN when creating new entries.
   * @return createDNPattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the template to use for the DN when creating new entries.")

  public String getCreateDNPattern() {
    return createDNPattern;
  }


  public void setCreateDNPattern(String createDNPattern) {
    
    
    
    this.createDNPattern = createDNPattern;
  }


  public LdapPassThroughScimResourceTypeResponse meta(MetaMeta meta) {
    
    
    
    
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


  public LdapPassThroughScimResourceTypeResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the LdapPassThroughScimResourceTypeResponse instance itself
   */
  public LdapPassThroughScimResourceTypeResponse putAdditionalProperty(String key, Object value) {
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
    LdapPassThroughScimResourceTypeResponse ldapPassThroughScimResourceTypeResponse = (LdapPassThroughScimResourceTypeResponse) o;
    return Objects.equals(this.id, ldapPassThroughScimResourceTypeResponse.id) &&
        Objects.equals(this.description, ldapPassThroughScimResourceTypeResponse.description) &&
        Objects.equals(this.schemas, ldapPassThroughScimResourceTypeResponse.schemas) &&
        Objects.equals(this.enabled, ldapPassThroughScimResourceTypeResponse.enabled) &&
        Objects.equals(this.endpoint, ldapPassThroughScimResourceTypeResponse.endpoint) &&
        Objects.equals(this.lookthroughLimit, ldapPassThroughScimResourceTypeResponse.lookthroughLimit) &&
        Objects.equals(this.schemaCheckingOption, ldapPassThroughScimResourceTypeResponse.schemaCheckingOption) &&
        Objects.equals(this.structuralLDAPObjectclass, ldapPassThroughScimResourceTypeResponse.structuralLDAPObjectclass) &&
        Objects.equals(this.auxiliaryLDAPObjectclass, ldapPassThroughScimResourceTypeResponse.auxiliaryLDAPObjectclass) &&
        Objects.equals(this.includeBaseDN, ldapPassThroughScimResourceTypeResponse.includeBaseDN) &&
        Objects.equals(this.includeFilter, ldapPassThroughScimResourceTypeResponse.includeFilter) &&
        Objects.equals(this.includeOperationalAttribute, ldapPassThroughScimResourceTypeResponse.includeOperationalAttribute) &&
        Objects.equals(this.createDNPattern, ldapPassThroughScimResourceTypeResponse.createDNPattern) &&
        Objects.equals(this.meta, ldapPassThroughScimResourceTypeResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, ldapPassThroughScimResourceTypeResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, ldapPassThroughScimResourceTypeResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, schemas, enabled, endpoint, lookthroughLimit, schemaCheckingOption, structuralLDAPObjectclass, auxiliaryLDAPObjectclass, includeBaseDN, includeFilter, includeOperationalAttribute, createDNPattern, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LdapPassThroughScimResourceTypeResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    lookthroughLimit: ").append(toIndentedString(lookthroughLimit)).append("\n");
    sb.append("    schemaCheckingOption: ").append(toIndentedString(schemaCheckingOption)).append("\n");
    sb.append("    structuralLDAPObjectclass: ").append(toIndentedString(structuralLDAPObjectclass)).append("\n");
    sb.append("    auxiliaryLDAPObjectclass: ").append(toIndentedString(auxiliaryLDAPObjectclass)).append("\n");
    sb.append("    includeBaseDN: ").append(toIndentedString(includeBaseDN)).append("\n");
    sb.append("    includeFilter: ").append(toIndentedString(includeFilter)).append("\n");
    sb.append("    includeOperationalAttribute: ").append(toIndentedString(includeOperationalAttribute)).append("\n");
    sb.append("    createDNPattern: ").append(toIndentedString(createDNPattern)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("endpoint");
    openapiFields.add("lookthroughLimit");
    openapiFields.add("schemaCheckingOption");
    openapiFields.add("structuralLDAPObjectclass");
    openapiFields.add("auxiliaryLDAPObjectclass");
    openapiFields.add("includeBaseDN");
    openapiFields.add("includeFilter");
    openapiFields.add("includeOperationalAttribute");
    openapiFields.add("createDNPattern");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("enabled");
    openapiRequiredFields.add("endpoint");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LdapPassThroughScimResourceTypeResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LdapPassThroughScimResourceTypeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LdapPassThroughScimResourceTypeResponse is not found in the empty JSON string", LdapPassThroughScimResourceTypeResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LdapPassThroughScimResourceTypeResponse.openapiRequiredFields) {
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
      if (!jsonObj.get("endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpoint").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("schemaCheckingOption") != null && !jsonObj.get("schemaCheckingOption").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemaCheckingOption` to be an array in the JSON string but got `%s`", jsonObj.get("schemaCheckingOption").toString()));
      }
      if ((jsonObj.get("structuralLDAPObjectclass") != null && !jsonObj.get("structuralLDAPObjectclass").isJsonNull()) && !jsonObj.get("structuralLDAPObjectclass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `structuralLDAPObjectclass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("structuralLDAPObjectclass").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("auxiliaryLDAPObjectclass") != null && !jsonObj.get("auxiliaryLDAPObjectclass").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `auxiliaryLDAPObjectclass` to be an array in the JSON string but got `%s`", jsonObj.get("auxiliaryLDAPObjectclass").toString()));
      }
      if ((jsonObj.get("includeBaseDN") != null && !jsonObj.get("includeBaseDN").isJsonNull()) && !jsonObj.get("includeBaseDN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `includeBaseDN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("includeBaseDN").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("includeFilter") != null && !jsonObj.get("includeFilter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includeFilter` to be an array in the JSON string but got `%s`", jsonObj.get("includeFilter").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("includeOperationalAttribute") != null && !jsonObj.get("includeOperationalAttribute").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includeOperationalAttribute` to be an array in the JSON string but got `%s`", jsonObj.get("includeOperationalAttribute").toString()));
      }
      if ((jsonObj.get("createDNPattern") != null && !jsonObj.get("createDNPattern").isJsonNull()) && !jsonObj.get("createDNPattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createDNPattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createDNPattern").toString()));
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
       if (!LdapPassThroughScimResourceTypeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LdapPassThroughScimResourceTypeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LdapPassThroughScimResourceTypeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LdapPassThroughScimResourceTypeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<LdapPassThroughScimResourceTypeResponse>() {
           @Override
           public void write(JsonWriter out, LdapPassThroughScimResourceTypeResponse value) throws IOException {
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
           public LdapPassThroughScimResourceTypeResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LdapPassThroughScimResourceTypeResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LdapPassThroughScimResourceTypeResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LdapPassThroughScimResourceTypeResponse
  * @throws IOException if the JSON string is invalid with respect to LdapPassThroughScimResourceTypeResponse
  */
  public static LdapPassThroughScimResourceTypeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LdapPassThroughScimResourceTypeResponse.class);
  }

 /**
  * Convert an instance of LdapPassThroughScimResourceTypeResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

