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
import com.konfigthis.client.model.EnumuserDefinedVirtualAttributeSchemaUrn;
import com.konfigthis.client.model.EnumvirtualAttributeConflictBehaviorProp;
import com.konfigthis.client.model.EnumvirtualAttributeMultipleVirtualAttributeMergeBehaviorProp;
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
 * AddUserDefinedVirtualAttributeRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddUserDefinedVirtualAttributeRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumuserDefinedVirtualAttributeSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private List<String> value = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_ATTRIBUTE_TYPE = "attributeType";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_TYPE)
  private String attributeType;

  public static final String SERIALIZED_NAME_BASE_D_N = "baseDN";
  @SerializedName(SERIALIZED_NAME_BASE_D_N)
  private List<String> baseDN = null;

  public static final String SERIALIZED_NAME_GROUP_D_N = "groupDN";
  @SerializedName(SERIALIZED_NAME_GROUP_D_N)
  private List<String> groupDN = null;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private List<String> filter = null;

  public static final String SERIALIZED_NAME_CLIENT_CONNECTION_POLICY = "clientConnectionPolicy";
  @SerializedName(SERIALIZED_NAME_CLIENT_CONNECTION_POLICY)
  private List<String> clientConnectionPolicy = null;

  public static final String SERIALIZED_NAME_CONFLICT_BEHAVIOR = "conflictBehavior";
  @SerializedName(SERIALIZED_NAME_CONFLICT_BEHAVIOR)
  private EnumvirtualAttributeConflictBehaviorProp conflictBehavior;

  public static final String SERIALIZED_NAME_REQUIRE_EXPLICIT_REQUEST_BY_NAME = "requireExplicitRequestByName";
  @SerializedName(SERIALIZED_NAME_REQUIRE_EXPLICIT_REQUEST_BY_NAME)
  private Boolean requireExplicitRequestByName;

  public static final String SERIALIZED_NAME_MULTIPLE_VIRTUAL_ATTRIBUTE_EVALUATION_ORDER_INDEX = "multipleVirtualAttributeEvaluationOrderIndex";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_VIRTUAL_ATTRIBUTE_EVALUATION_ORDER_INDEX)
  private Integer multipleVirtualAttributeEvaluationOrderIndex;

  public static final String SERIALIZED_NAME_MULTIPLE_VIRTUAL_ATTRIBUTE_MERGE_BEHAVIOR = "multipleVirtualAttributeMergeBehavior";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_VIRTUAL_ATTRIBUTE_MERGE_BEHAVIOR)
  private EnumvirtualAttributeMultipleVirtualAttributeMergeBehaviorProp multipleVirtualAttributeMergeBehavior;

  public static final String SERIALIZED_NAME_ALLOW_INDEX_CONFLICTS = "allowIndexConflicts";
  @SerializedName(SERIALIZED_NAME_ALLOW_INDEX_CONFLICTS)
  private Boolean allowIndexConflicts;

  public AddUserDefinedVirtualAttributeRequest() {
  }

  public AddUserDefinedVirtualAttributeRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Name of the new Virtual Attribute
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the new Virtual Attribute")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public AddUserDefinedVirtualAttributeRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Virtual Attribute
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Virtual Attribute")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AddUserDefinedVirtualAttributeRequest schemas(List<EnumuserDefinedVirtualAttributeSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddUserDefinedVirtualAttributeRequest addSchemasItem(EnumuserDefinedVirtualAttributeSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumuserDefinedVirtualAttributeSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumuserDefinedVirtualAttributeSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddUserDefinedVirtualAttributeRequest value(List<String> value) {
    
    
    
    
    this.value = value;
    return this;
  }

  public AddUserDefinedVirtualAttributeRequest addValueItem(String valueItem) {
    this.value.add(valueItem);
    return this;
  }

   /**
   * Specifies the values to be included in the virtual attribute.
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the values to be included in the virtual attribute.")

  public List<String> getValue() {
    return value;
  }


  public void setValue(List<String> value) {
    
    
    
    this.value = value;
  }


  public AddUserDefinedVirtualAttributeRequest enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the Virtual Attribute is enabled for use.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether the Virtual Attribute is enabled for use.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public AddUserDefinedVirtualAttributeRequest attributeType(String attributeType) {
    
    
    
    
    this.attributeType = attributeType;
    return this;
  }

   /**
   * Specifies the attribute type for the attribute whose values are to be dynamically assigned by the virtual attribute.
   * @return attributeType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the attribute type for the attribute whose values are to be dynamically assigned by the virtual attribute.")

  public String getAttributeType() {
    return attributeType;
  }


  public void setAttributeType(String attributeType) {
    
    
    
    this.attributeType = attributeType;
  }


  public AddUserDefinedVirtualAttributeRequest baseDN(List<String> baseDN) {
    
    
    
    
    this.baseDN = baseDN;
    return this;
  }

  public AddUserDefinedVirtualAttributeRequest addBaseDNItem(String baseDNItem) {
    if (this.baseDN == null) {
      this.baseDN = new ArrayList<>();
    }
    this.baseDN.add(baseDNItem);
    return this;
  }

   /**
   * Specifies the base DNs for the branches containing entries that are eligible to use this virtual attribute.
   * @return baseDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the base DNs for the branches containing entries that are eligible to use this virtual attribute.")

  public List<String> getBaseDN() {
    return baseDN;
  }


  public void setBaseDN(List<String> baseDN) {
    
    
    
    this.baseDN = baseDN;
  }


  public AddUserDefinedVirtualAttributeRequest groupDN(List<String> groupDN) {
    
    
    
    
    this.groupDN = groupDN;
    return this;
  }

  public AddUserDefinedVirtualAttributeRequest addGroupDNItem(String groupDNItem) {
    if (this.groupDN == null) {
      this.groupDN = new ArrayList<>();
    }
    this.groupDN.add(groupDNItem);
    return this;
  }

   /**
   * Specifies the DNs of the groups whose members can be eligible to use this virtual attribute.
   * @return groupDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the DNs of the groups whose members can be eligible to use this virtual attribute.")

  public List<String> getGroupDN() {
    return groupDN;
  }


  public void setGroupDN(List<String> groupDN) {
    
    
    
    this.groupDN = groupDN;
  }


  public AddUserDefinedVirtualAttributeRequest filter(List<String> filter) {
    
    
    
    
    this.filter = filter;
    return this;
  }

  public AddUserDefinedVirtualAttributeRequest addFilterItem(String filterItem) {
    if (this.filter == null) {
      this.filter = new ArrayList<>();
    }
    this.filter.add(filterItem);
    return this;
  }

   /**
   * Specifies the search filters to be applied against entries to determine if the virtual attribute is to be generated for those entries.
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the search filters to be applied against entries to determine if the virtual attribute is to be generated for those entries.")

  public List<String> getFilter() {
    return filter;
  }


  public void setFilter(List<String> filter) {
    
    
    
    this.filter = filter;
  }


  public AddUserDefinedVirtualAttributeRequest clientConnectionPolicy(List<String> clientConnectionPolicy) {
    
    
    
    
    this.clientConnectionPolicy = clientConnectionPolicy;
    return this;
  }

  public AddUserDefinedVirtualAttributeRequest addClientConnectionPolicyItem(String clientConnectionPolicyItem) {
    if (this.clientConnectionPolicy == null) {
      this.clientConnectionPolicy = new ArrayList<>();
    }
    this.clientConnectionPolicy.add(clientConnectionPolicyItem);
    return this;
  }

   /**
   * Specifies a set of client connection policies for which this Virtual Attribute should be generated. If this is undefined, then this Virtual Attribute will always be generated. If it is associated with one or more client connection policies, then this Virtual Attribute will be generated only for operations requested by clients assigned to one of those client connection policies.
   * @return clientConnectionPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a set of client connection policies for which this Virtual Attribute should be generated. If this is undefined, then this Virtual Attribute will always be generated. If it is associated with one or more client connection policies, then this Virtual Attribute will be generated only for operations requested by clients assigned to one of those client connection policies.")

  public List<String> getClientConnectionPolicy() {
    return clientConnectionPolicy;
  }


  public void setClientConnectionPolicy(List<String> clientConnectionPolicy) {
    
    
    
    this.clientConnectionPolicy = clientConnectionPolicy;
  }


  public AddUserDefinedVirtualAttributeRequest conflictBehavior(EnumvirtualAttributeConflictBehaviorProp conflictBehavior) {
    
    
    
    
    this.conflictBehavior = conflictBehavior;
    return this;
  }

   /**
   * Get conflictBehavior
   * @return conflictBehavior
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumvirtualAttributeConflictBehaviorProp getConflictBehavior() {
    return conflictBehavior;
  }


  public void setConflictBehavior(EnumvirtualAttributeConflictBehaviorProp conflictBehavior) {
    
    
    
    this.conflictBehavior = conflictBehavior;
  }


  public AddUserDefinedVirtualAttributeRequest requireExplicitRequestByName(Boolean requireExplicitRequestByName) {
    
    
    
    
    this.requireExplicitRequestByName = requireExplicitRequestByName;
    return this;
  }

   /**
   * Indicates whether attributes of this type must be explicitly included by name in the list of requested attributes. Note that this will only apply to virtual attributes which are associated with an attribute type that is operational. It will be ignored for virtual attributes associated with a non-operational attribute type.
   * @return requireExplicitRequestByName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether attributes of this type must be explicitly included by name in the list of requested attributes. Note that this will only apply to virtual attributes which are associated with an attribute type that is operational. It will be ignored for virtual attributes associated with a non-operational attribute type.")

  public Boolean getRequireExplicitRequestByName() {
    return requireExplicitRequestByName;
  }


  public void setRequireExplicitRequestByName(Boolean requireExplicitRequestByName) {
    
    
    
    this.requireExplicitRequestByName = requireExplicitRequestByName;
  }


  public AddUserDefinedVirtualAttributeRequest multipleVirtualAttributeEvaluationOrderIndex(Integer multipleVirtualAttributeEvaluationOrderIndex) {
    
    
    
    
    this.multipleVirtualAttributeEvaluationOrderIndex = multipleVirtualAttributeEvaluationOrderIndex;
    return this;
  }

   /**
   * Specifies the order in which virtual attribute definitions for the same attribute type will be evaluated when generating values for an entry.
   * @return multipleVirtualAttributeEvaluationOrderIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the order in which virtual attribute definitions for the same attribute type will be evaluated when generating values for an entry.")

  public Integer getMultipleVirtualAttributeEvaluationOrderIndex() {
    return multipleVirtualAttributeEvaluationOrderIndex;
  }


  public void setMultipleVirtualAttributeEvaluationOrderIndex(Integer multipleVirtualAttributeEvaluationOrderIndex) {
    
    
    
    this.multipleVirtualAttributeEvaluationOrderIndex = multipleVirtualAttributeEvaluationOrderIndex;
  }


  public AddUserDefinedVirtualAttributeRequest multipleVirtualAttributeMergeBehavior(EnumvirtualAttributeMultipleVirtualAttributeMergeBehaviorProp multipleVirtualAttributeMergeBehavior) {
    
    
    
    
    this.multipleVirtualAttributeMergeBehavior = multipleVirtualAttributeMergeBehavior;
    return this;
  }

   /**
   * Get multipleVirtualAttributeMergeBehavior
   * @return multipleVirtualAttributeMergeBehavior
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumvirtualAttributeMultipleVirtualAttributeMergeBehaviorProp getMultipleVirtualAttributeMergeBehavior() {
    return multipleVirtualAttributeMergeBehavior;
  }


  public void setMultipleVirtualAttributeMergeBehavior(EnumvirtualAttributeMultipleVirtualAttributeMergeBehaviorProp multipleVirtualAttributeMergeBehavior) {
    
    
    
    this.multipleVirtualAttributeMergeBehavior = multipleVirtualAttributeMergeBehavior;
  }


  public AddUserDefinedVirtualAttributeRequest allowIndexConflicts(Boolean allowIndexConflicts) {
    
    
    
    
    this.allowIndexConflicts = allowIndexConflicts;
    return this;
  }

   /**
   * Indicates whether the server should allow creating or altering this virtual attribute definition even if it conflicts with one or more indexes defined in the server.
   * @return allowIndexConflicts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the server should allow creating or altering this virtual attribute definition even if it conflicts with one or more indexes defined in the server.")

  public Boolean getAllowIndexConflicts() {
    return allowIndexConflicts;
  }


  public void setAllowIndexConflicts(Boolean allowIndexConflicts) {
    
    
    
    this.allowIndexConflicts = allowIndexConflicts;
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
   * @return the AddUserDefinedVirtualAttributeRequest instance itself
   */
  public AddUserDefinedVirtualAttributeRequest putAdditionalProperty(String key, Object value) {
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
    AddUserDefinedVirtualAttributeRequest addUserDefinedVirtualAttributeRequest = (AddUserDefinedVirtualAttributeRequest) o;
    return Objects.equals(this.name, addUserDefinedVirtualAttributeRequest.name) &&
        Objects.equals(this.description, addUserDefinedVirtualAttributeRequest.description) &&
        Objects.equals(this.schemas, addUserDefinedVirtualAttributeRequest.schemas) &&
        Objects.equals(this.value, addUserDefinedVirtualAttributeRequest.value) &&
        Objects.equals(this.enabled, addUserDefinedVirtualAttributeRequest.enabled) &&
        Objects.equals(this.attributeType, addUserDefinedVirtualAttributeRequest.attributeType) &&
        Objects.equals(this.baseDN, addUserDefinedVirtualAttributeRequest.baseDN) &&
        Objects.equals(this.groupDN, addUserDefinedVirtualAttributeRequest.groupDN) &&
        Objects.equals(this.filter, addUserDefinedVirtualAttributeRequest.filter) &&
        Objects.equals(this.clientConnectionPolicy, addUserDefinedVirtualAttributeRequest.clientConnectionPolicy) &&
        Objects.equals(this.conflictBehavior, addUserDefinedVirtualAttributeRequest.conflictBehavior) &&
        Objects.equals(this.requireExplicitRequestByName, addUserDefinedVirtualAttributeRequest.requireExplicitRequestByName) &&
        Objects.equals(this.multipleVirtualAttributeEvaluationOrderIndex, addUserDefinedVirtualAttributeRequest.multipleVirtualAttributeEvaluationOrderIndex) &&
        Objects.equals(this.multipleVirtualAttributeMergeBehavior, addUserDefinedVirtualAttributeRequest.multipleVirtualAttributeMergeBehavior) &&
        Objects.equals(this.allowIndexConflicts, addUserDefinedVirtualAttributeRequest.allowIndexConflicts)&&
        Objects.equals(this.additionalProperties, addUserDefinedVirtualAttributeRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, schemas, value, enabled, attributeType, baseDN, groupDN, filter, clientConnectionPolicy, conflictBehavior, requireExplicitRequestByName, multipleVirtualAttributeEvaluationOrderIndex, multipleVirtualAttributeMergeBehavior, allowIndexConflicts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddUserDefinedVirtualAttributeRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    attributeType: ").append(toIndentedString(attributeType)).append("\n");
    sb.append("    baseDN: ").append(toIndentedString(baseDN)).append("\n");
    sb.append("    groupDN: ").append(toIndentedString(groupDN)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    clientConnectionPolicy: ").append(toIndentedString(clientConnectionPolicy)).append("\n");
    sb.append("    conflictBehavior: ").append(toIndentedString(conflictBehavior)).append("\n");
    sb.append("    requireExplicitRequestByName: ").append(toIndentedString(requireExplicitRequestByName)).append("\n");
    sb.append("    multipleVirtualAttributeEvaluationOrderIndex: ").append(toIndentedString(multipleVirtualAttributeEvaluationOrderIndex)).append("\n");
    sb.append("    multipleVirtualAttributeMergeBehavior: ").append(toIndentedString(multipleVirtualAttributeMergeBehavior)).append("\n");
    sb.append("    allowIndexConflicts: ").append(toIndentedString(allowIndexConflicts)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("value");
    openapiFields.add("enabled");
    openapiFields.add("attributeType");
    openapiFields.add("baseDN");
    openapiFields.add("groupDN");
    openapiFields.add("filter");
    openapiFields.add("clientConnectionPolicy");
    openapiFields.add("conflictBehavior");
    openapiFields.add("requireExplicitRequestByName");
    openapiFields.add("multipleVirtualAttributeEvaluationOrderIndex");
    openapiFields.add("multipleVirtualAttributeMergeBehavior");
    openapiFields.add("allowIndexConflicts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("enabled");
    openapiRequiredFields.add("attributeType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddUserDefinedVirtualAttributeRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddUserDefinedVirtualAttributeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddUserDefinedVirtualAttributeRequest is not found in the empty JSON string", AddUserDefinedVirtualAttributeRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddUserDefinedVirtualAttributeRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
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
      // ensure the required json array is present
      if (jsonObj.get("value") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("value").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be an array in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if (!jsonObj.get("attributeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeType").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("baseDN") != null && !jsonObj.get("baseDN").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseDN` to be an array in the JSON string but got `%s`", jsonObj.get("baseDN").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("groupDN") != null && !jsonObj.get("groupDN").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupDN` to be an array in the JSON string but got `%s`", jsonObj.get("groupDN").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be an array in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("clientConnectionPolicy") != null && !jsonObj.get("clientConnectionPolicy").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientConnectionPolicy` to be an array in the JSON string but got `%s`", jsonObj.get("clientConnectionPolicy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddUserDefinedVirtualAttributeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddUserDefinedVirtualAttributeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddUserDefinedVirtualAttributeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddUserDefinedVirtualAttributeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddUserDefinedVirtualAttributeRequest>() {
           @Override
           public void write(JsonWriter out, AddUserDefinedVirtualAttributeRequest value) throws IOException {
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
           public AddUserDefinedVirtualAttributeRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddUserDefinedVirtualAttributeRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddUserDefinedVirtualAttributeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddUserDefinedVirtualAttributeRequest
  * @throws IOException if the JSON string is invalid with respect to AddUserDefinedVirtualAttributeRequest
  */
  public static AddUserDefinedVirtualAttributeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddUserDefinedVirtualAttributeRequest.class);
  }

 /**
  * Convert an instance of AddUserDefinedVirtualAttributeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

