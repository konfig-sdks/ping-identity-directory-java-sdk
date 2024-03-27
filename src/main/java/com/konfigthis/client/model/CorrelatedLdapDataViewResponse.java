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
import com.konfigthis.client.model.EnumcorrelatedLdapDataViewSchemaUrn;
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
 * CorrelatedLdapDataViewResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CorrelatedLdapDataViewResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumcorrelatedLdapDataViewSchemaUrn> schemas = null;

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

  public static final String SERIALIZED_NAME_PRIMARY_CORRELATION_ATTRIBUTE = "primaryCorrelationAttribute";
  @SerializedName(SERIALIZED_NAME_PRIMARY_CORRELATION_ATTRIBUTE)
  private String primaryCorrelationAttribute;

  public static final String SERIALIZED_NAME_SECONDARY_CORRELATION_ATTRIBUTE = "secondaryCorrelationAttribute";
  @SerializedName(SERIALIZED_NAME_SECONDARY_CORRELATION_ATTRIBUTE)
  private String secondaryCorrelationAttribute;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public CorrelatedLdapDataViewResponse() {
  }

  public CorrelatedLdapDataViewResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Correlated LDAP Data View
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the Correlated LDAP Data View")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public CorrelatedLdapDataViewResponse schemas(List<EnumcorrelatedLdapDataViewSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public CorrelatedLdapDataViewResponse addSchemasItem(EnumcorrelatedLdapDataViewSchemaUrn schemasItem) {
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

  public List<EnumcorrelatedLdapDataViewSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumcorrelatedLdapDataViewSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public CorrelatedLdapDataViewResponse structuralLDAPObjectclass(String structuralLDAPObjectclass) {
    
    
    
    
    this.structuralLDAPObjectclass = structuralLDAPObjectclass;
    return this;
  }

   /**
   * Specifies the LDAP structural object class that should be exposed by this Correlated LDAP Data View.
   * @return structuralLDAPObjectclass
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the LDAP structural object class that should be exposed by this Correlated LDAP Data View.")

  public String getStructuralLDAPObjectclass() {
    return structuralLDAPObjectclass;
  }


  public void setStructuralLDAPObjectclass(String structuralLDAPObjectclass) {
    
    
    
    this.structuralLDAPObjectclass = structuralLDAPObjectclass;
  }


  public CorrelatedLdapDataViewResponse auxiliaryLDAPObjectclass(List<String> auxiliaryLDAPObjectclass) {
    
    
    
    
    this.auxiliaryLDAPObjectclass = auxiliaryLDAPObjectclass;
    return this;
  }

  public CorrelatedLdapDataViewResponse addAuxiliaryLDAPObjectclassItem(String auxiliaryLDAPObjectclassItem) {
    if (this.auxiliaryLDAPObjectclass == null) {
      this.auxiliaryLDAPObjectclass = new ArrayList<>();
    }
    this.auxiliaryLDAPObjectclass.add(auxiliaryLDAPObjectclassItem);
    return this;
  }

   /**
   * Specifies an auxiliary LDAP object class that should be exposed by this Correlated LDAP Data View.
   * @return auxiliaryLDAPObjectclass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an auxiliary LDAP object class that should be exposed by this Correlated LDAP Data View.")

  public List<String> getAuxiliaryLDAPObjectclass() {
    return auxiliaryLDAPObjectclass;
  }


  public void setAuxiliaryLDAPObjectclass(List<String> auxiliaryLDAPObjectclass) {
    
    
    
    this.auxiliaryLDAPObjectclass = auxiliaryLDAPObjectclass;
  }


  public CorrelatedLdapDataViewResponse includeBaseDN(String includeBaseDN) {
    
    
    
    
    this.includeBaseDN = includeBaseDN;
    return this;
  }

   /**
   * Specifies the base DN of the branch of the LDAP directory that can be accessed by this Correlated LDAP Data View.
   * @return includeBaseDN
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the base DN of the branch of the LDAP directory that can be accessed by this Correlated LDAP Data View.")

  public String getIncludeBaseDN() {
    return includeBaseDN;
  }


  public void setIncludeBaseDN(String includeBaseDN) {
    
    
    
    this.includeBaseDN = includeBaseDN;
  }


  public CorrelatedLdapDataViewResponse includeFilter(List<String> includeFilter) {
    
    
    
    
    this.includeFilter = includeFilter;
    return this;
  }

  public CorrelatedLdapDataViewResponse addIncludeFilterItem(String includeFilterItem) {
    if (this.includeFilter == null) {
      this.includeFilter = new ArrayList<>();
    }
    this.includeFilter.add(includeFilterItem);
    return this;
  }

   /**
   * The set of LDAP filters that define the LDAP entries that should be included in this Correlated LDAP Data View.
   * @return includeFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The set of LDAP filters that define the LDAP entries that should be included in this Correlated LDAP Data View.")

  public List<String> getIncludeFilter() {
    return includeFilter;
  }


  public void setIncludeFilter(List<String> includeFilter) {
    
    
    
    this.includeFilter = includeFilter;
  }


  public CorrelatedLdapDataViewResponse includeOperationalAttribute(List<String> includeOperationalAttribute) {
    
    
    
    
    this.includeOperationalAttribute = includeOperationalAttribute;
    return this;
  }

  public CorrelatedLdapDataViewResponse addIncludeOperationalAttributeItem(String includeOperationalAttributeItem) {
    if (this.includeOperationalAttribute == null) {
      this.includeOperationalAttribute = new ArrayList<>();
    }
    this.includeOperationalAttribute.add(includeOperationalAttributeItem);
    return this;
  }

   /**
   * Specifies the set of operational LDAP attributes to be provided by this Correlated LDAP Data View.
   * @return includeOperationalAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the set of operational LDAP attributes to be provided by this Correlated LDAP Data View.")

  public List<String> getIncludeOperationalAttribute() {
    return includeOperationalAttribute;
  }


  public void setIncludeOperationalAttribute(List<String> includeOperationalAttribute) {
    
    
    
    this.includeOperationalAttribute = includeOperationalAttribute;
  }


  public CorrelatedLdapDataViewResponse createDNPattern(String createDNPattern) {
    
    
    
    
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


  public CorrelatedLdapDataViewResponse primaryCorrelationAttribute(String primaryCorrelationAttribute) {
    
    
    
    
    this.primaryCorrelationAttribute = primaryCorrelationAttribute;
    return this;
  }

   /**
   * The LDAP attribute from the parent SCIM Resource Type whose value will be used to match objects in the Correlated LDAP Data View. If multiple correlation attributes are required they may be created using additional correlation-attribute-pairs.
   * @return primaryCorrelationAttribute
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The LDAP attribute from the parent SCIM Resource Type whose value will be used to match objects in the Correlated LDAP Data View. If multiple correlation attributes are required they may be created using additional correlation-attribute-pairs.")

  public String getPrimaryCorrelationAttribute() {
    return primaryCorrelationAttribute;
  }


  public void setPrimaryCorrelationAttribute(String primaryCorrelationAttribute) {
    
    
    
    this.primaryCorrelationAttribute = primaryCorrelationAttribute;
  }


  public CorrelatedLdapDataViewResponse secondaryCorrelationAttribute(String secondaryCorrelationAttribute) {
    
    
    
    
    this.secondaryCorrelationAttribute = secondaryCorrelationAttribute;
    return this;
  }

   /**
   * The LDAP attribute from the Correlated LDAP Data View whose value will be matched with the primary-correlation-attribute. If multiple correlation attributes are required they may be specified by creating additional correlation-attribute-pairs.
   * @return secondaryCorrelationAttribute
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The LDAP attribute from the Correlated LDAP Data View whose value will be matched with the primary-correlation-attribute. If multiple correlation attributes are required they may be specified by creating additional correlation-attribute-pairs.")

  public String getSecondaryCorrelationAttribute() {
    return secondaryCorrelationAttribute;
  }


  public void setSecondaryCorrelationAttribute(String secondaryCorrelationAttribute) {
    
    
    
    this.secondaryCorrelationAttribute = secondaryCorrelationAttribute;
  }


  public CorrelatedLdapDataViewResponse meta(MetaMeta meta) {
    
    
    
    
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


  public CorrelatedLdapDataViewResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the CorrelatedLdapDataViewResponse instance itself
   */
  public CorrelatedLdapDataViewResponse putAdditionalProperty(String key, Object value) {
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
    CorrelatedLdapDataViewResponse correlatedLdapDataViewResponse = (CorrelatedLdapDataViewResponse) o;
    return Objects.equals(this.id, correlatedLdapDataViewResponse.id) &&
        Objects.equals(this.schemas, correlatedLdapDataViewResponse.schemas) &&
        Objects.equals(this.structuralLDAPObjectclass, correlatedLdapDataViewResponse.structuralLDAPObjectclass) &&
        Objects.equals(this.auxiliaryLDAPObjectclass, correlatedLdapDataViewResponse.auxiliaryLDAPObjectclass) &&
        Objects.equals(this.includeBaseDN, correlatedLdapDataViewResponse.includeBaseDN) &&
        Objects.equals(this.includeFilter, correlatedLdapDataViewResponse.includeFilter) &&
        Objects.equals(this.includeOperationalAttribute, correlatedLdapDataViewResponse.includeOperationalAttribute) &&
        Objects.equals(this.createDNPattern, correlatedLdapDataViewResponse.createDNPattern) &&
        Objects.equals(this.primaryCorrelationAttribute, correlatedLdapDataViewResponse.primaryCorrelationAttribute) &&
        Objects.equals(this.secondaryCorrelationAttribute, correlatedLdapDataViewResponse.secondaryCorrelationAttribute) &&
        Objects.equals(this.meta, correlatedLdapDataViewResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, correlatedLdapDataViewResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, correlatedLdapDataViewResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, schemas, structuralLDAPObjectclass, auxiliaryLDAPObjectclass, includeBaseDN, includeFilter, includeOperationalAttribute, createDNPattern, primaryCorrelationAttribute, secondaryCorrelationAttribute, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrelatedLdapDataViewResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    structuralLDAPObjectclass: ").append(toIndentedString(structuralLDAPObjectclass)).append("\n");
    sb.append("    auxiliaryLDAPObjectclass: ").append(toIndentedString(auxiliaryLDAPObjectclass)).append("\n");
    sb.append("    includeBaseDN: ").append(toIndentedString(includeBaseDN)).append("\n");
    sb.append("    includeFilter: ").append(toIndentedString(includeFilter)).append("\n");
    sb.append("    includeOperationalAttribute: ").append(toIndentedString(includeOperationalAttribute)).append("\n");
    sb.append("    createDNPattern: ").append(toIndentedString(createDNPattern)).append("\n");
    sb.append("    primaryCorrelationAttribute: ").append(toIndentedString(primaryCorrelationAttribute)).append("\n");
    sb.append("    secondaryCorrelationAttribute: ").append(toIndentedString(secondaryCorrelationAttribute)).append("\n");
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
    openapiFields.add("schemas");
    openapiFields.add("structuralLDAPObjectclass");
    openapiFields.add("auxiliaryLDAPObjectclass");
    openapiFields.add("includeBaseDN");
    openapiFields.add("includeFilter");
    openapiFields.add("includeOperationalAttribute");
    openapiFields.add("createDNPattern");
    openapiFields.add("primaryCorrelationAttribute");
    openapiFields.add("secondaryCorrelationAttribute");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("structuralLDAPObjectclass");
    openapiRequiredFields.add("includeBaseDN");
    openapiRequiredFields.add("primaryCorrelationAttribute");
    openapiRequiredFields.add("secondaryCorrelationAttribute");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CorrelatedLdapDataViewResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CorrelatedLdapDataViewResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CorrelatedLdapDataViewResponse is not found in the empty JSON string", CorrelatedLdapDataViewResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CorrelatedLdapDataViewResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("schemas") != null && !jsonObj.get("schemas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemas` to be an array in the JSON string but got `%s`", jsonObj.get("schemas").toString()));
      }
      if (!jsonObj.get("structuralLDAPObjectclass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `structuralLDAPObjectclass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("structuralLDAPObjectclass").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("auxiliaryLDAPObjectclass") != null && !jsonObj.get("auxiliaryLDAPObjectclass").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `auxiliaryLDAPObjectclass` to be an array in the JSON string but got `%s`", jsonObj.get("auxiliaryLDAPObjectclass").toString()));
      }
      if (!jsonObj.get("includeBaseDN").isJsonPrimitive()) {
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
      if (!jsonObj.get("primaryCorrelationAttribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryCorrelationAttribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryCorrelationAttribute").toString()));
      }
      if (!jsonObj.get("secondaryCorrelationAttribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondaryCorrelationAttribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondaryCorrelationAttribute").toString()));
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
       if (!CorrelatedLdapDataViewResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CorrelatedLdapDataViewResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CorrelatedLdapDataViewResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CorrelatedLdapDataViewResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CorrelatedLdapDataViewResponse>() {
           @Override
           public void write(JsonWriter out, CorrelatedLdapDataViewResponse value) throws IOException {
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
           public CorrelatedLdapDataViewResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CorrelatedLdapDataViewResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CorrelatedLdapDataViewResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CorrelatedLdapDataViewResponse
  * @throws IOException if the JSON string is invalid with respect to CorrelatedLdapDataViewResponse
  */
  public static CorrelatedLdapDataViewResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CorrelatedLdapDataViewResponse.class);
  }

 /**
  * Convert an instance of CorrelatedLdapDataViewResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

