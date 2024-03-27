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
import com.konfigthis.client.model.EnumdelegatedAdminCorrelatedRestResourceSchemaUrn;
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
 * DelegatedAdminCorrelatedRestResourceResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DelegatedAdminCorrelatedRestResourceResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumdelegatedAdminCorrelatedRestResourceSchemaUrn> schemas = null;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_CORRELATED_R_E_S_T_RESOURCE = "correlatedRESTResource";
  @SerializedName(SERIALIZED_NAME_CORRELATED_R_E_S_T_RESOURCE)
  private String correlatedRESTResource;

  public static final String SERIALIZED_NAME_PRIMARY_R_E_S_T_RESOURCE_CORRELATION_ATTRIBUTE = "primaryRESTResourceCorrelationAttribute";
  @SerializedName(SERIALIZED_NAME_PRIMARY_R_E_S_T_RESOURCE_CORRELATION_ATTRIBUTE)
  private String primaryRESTResourceCorrelationAttribute;

  public static final String SERIALIZED_NAME_SECONDARY_R_E_S_T_RESOURCE_CORRELATION_ATTRIBUTE = "secondaryRESTResourceCorrelationAttribute";
  @SerializedName(SERIALIZED_NAME_SECONDARY_R_E_S_T_RESOURCE_CORRELATION_ATTRIBUTE)
  private String secondaryRESTResourceCorrelationAttribute;

  public static final String SERIALIZED_NAME_USE_SECONDARY_VALUE_FOR_LINKING = "useSecondaryValueForLinking";
  @SerializedName(SERIALIZED_NAME_USE_SECONDARY_VALUE_FOR_LINKING)
  private Boolean useSecondaryValueForLinking;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public DelegatedAdminCorrelatedRestResourceResponse() {
  }

  public DelegatedAdminCorrelatedRestResourceResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Delegated Admin Correlated REST Resource
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the Delegated Admin Correlated REST Resource")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public DelegatedAdminCorrelatedRestResourceResponse schemas(List<EnumdelegatedAdminCorrelatedRestResourceSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public DelegatedAdminCorrelatedRestResourceResponse addSchemasItem(EnumdelegatedAdminCorrelatedRestResourceSchemaUrn schemasItem) {
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

  public List<EnumdelegatedAdminCorrelatedRestResourceSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumdelegatedAdminCorrelatedRestResourceSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public DelegatedAdminCorrelatedRestResourceResponse displayName(String displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * A human readable display name for this Delegated Admin Correlated REST Resource.
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A human readable display name for this Delegated Admin Correlated REST Resource.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    
    
    
    this.displayName = displayName;
  }


  public DelegatedAdminCorrelatedRestResourceResponse correlatedRESTResource(String correlatedRESTResource) {
    
    
    
    
    this.correlatedRESTResource = correlatedRESTResource;
    return this;
  }

   /**
   * The REST Resource Type that will be linked to this REST Resource Type.
   * @return correlatedRESTResource
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The REST Resource Type that will be linked to this REST Resource Type.")

  public String getCorrelatedRESTResource() {
    return correlatedRESTResource;
  }


  public void setCorrelatedRESTResource(String correlatedRESTResource) {
    
    
    
    this.correlatedRESTResource = correlatedRESTResource;
  }


  public DelegatedAdminCorrelatedRestResourceResponse primaryRESTResourceCorrelationAttribute(String primaryRESTResourceCorrelationAttribute) {
    
    
    
    
    this.primaryRESTResourceCorrelationAttribute = primaryRESTResourceCorrelationAttribute;
    return this;
  }

   /**
   * The LDAP attribute from the parent REST Resource Type whose value will be used to match objects in the Delegated Admin Correlated REST Resource. This attribute must be writeable when use-secondary-value-for-linking is enabled.
   * @return primaryRESTResourceCorrelationAttribute
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The LDAP attribute from the parent REST Resource Type whose value will be used to match objects in the Delegated Admin Correlated REST Resource. This attribute must be writeable when use-secondary-value-for-linking is enabled.")

  public String getPrimaryRESTResourceCorrelationAttribute() {
    return primaryRESTResourceCorrelationAttribute;
  }


  public void setPrimaryRESTResourceCorrelationAttribute(String primaryRESTResourceCorrelationAttribute) {
    
    
    
    this.primaryRESTResourceCorrelationAttribute = primaryRESTResourceCorrelationAttribute;
  }


  public DelegatedAdminCorrelatedRestResourceResponse secondaryRESTResourceCorrelationAttribute(String secondaryRESTResourceCorrelationAttribute) {
    
    
    
    
    this.secondaryRESTResourceCorrelationAttribute = secondaryRESTResourceCorrelationAttribute;
    return this;
  }

   /**
   * The LDAP attribute from the Delegated Admin Correlated REST Resource whose value will be matched with the primary-rest-resource-correlation-attribute. This attribute must be writeable when use-secondary-value-for-linking is disabled.
   * @return secondaryRESTResourceCorrelationAttribute
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The LDAP attribute from the Delegated Admin Correlated REST Resource whose value will be matched with the primary-rest-resource-correlation-attribute. This attribute must be writeable when use-secondary-value-for-linking is disabled.")

  public String getSecondaryRESTResourceCorrelationAttribute() {
    return secondaryRESTResourceCorrelationAttribute;
  }


  public void setSecondaryRESTResourceCorrelationAttribute(String secondaryRESTResourceCorrelationAttribute) {
    
    
    
    this.secondaryRESTResourceCorrelationAttribute = secondaryRESTResourceCorrelationAttribute;
  }


  public DelegatedAdminCorrelatedRestResourceResponse useSecondaryValueForLinking(Boolean useSecondaryValueForLinking) {
    
    
    
    
    this.useSecondaryValueForLinking = useSecondaryValueForLinking;
    return this;
  }

   /**
   * Indicates whether links should be created using the secondary correlation attribute value.
   * @return useSecondaryValueForLinking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether links should be created using the secondary correlation attribute value.")

  public Boolean getUseSecondaryValueForLinking() {
    return useSecondaryValueForLinking;
  }


  public void setUseSecondaryValueForLinking(Boolean useSecondaryValueForLinking) {
    
    
    
    this.useSecondaryValueForLinking = useSecondaryValueForLinking;
  }


  public DelegatedAdminCorrelatedRestResourceResponse meta(MetaMeta meta) {
    
    
    
    
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


  public DelegatedAdminCorrelatedRestResourceResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the DelegatedAdminCorrelatedRestResourceResponse instance itself
   */
  public DelegatedAdminCorrelatedRestResourceResponse putAdditionalProperty(String key, Object value) {
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
    DelegatedAdminCorrelatedRestResourceResponse delegatedAdminCorrelatedRestResourceResponse = (DelegatedAdminCorrelatedRestResourceResponse) o;
    return Objects.equals(this.id, delegatedAdminCorrelatedRestResourceResponse.id) &&
        Objects.equals(this.schemas, delegatedAdminCorrelatedRestResourceResponse.schemas) &&
        Objects.equals(this.displayName, delegatedAdminCorrelatedRestResourceResponse.displayName) &&
        Objects.equals(this.correlatedRESTResource, delegatedAdminCorrelatedRestResourceResponse.correlatedRESTResource) &&
        Objects.equals(this.primaryRESTResourceCorrelationAttribute, delegatedAdminCorrelatedRestResourceResponse.primaryRESTResourceCorrelationAttribute) &&
        Objects.equals(this.secondaryRESTResourceCorrelationAttribute, delegatedAdminCorrelatedRestResourceResponse.secondaryRESTResourceCorrelationAttribute) &&
        Objects.equals(this.useSecondaryValueForLinking, delegatedAdminCorrelatedRestResourceResponse.useSecondaryValueForLinking) &&
        Objects.equals(this.meta, delegatedAdminCorrelatedRestResourceResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, delegatedAdminCorrelatedRestResourceResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, delegatedAdminCorrelatedRestResourceResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, schemas, displayName, correlatedRESTResource, primaryRESTResourceCorrelationAttribute, secondaryRESTResourceCorrelationAttribute, useSecondaryValueForLinking, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelegatedAdminCorrelatedRestResourceResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    correlatedRESTResource: ").append(toIndentedString(correlatedRESTResource)).append("\n");
    sb.append("    primaryRESTResourceCorrelationAttribute: ").append(toIndentedString(primaryRESTResourceCorrelationAttribute)).append("\n");
    sb.append("    secondaryRESTResourceCorrelationAttribute: ").append(toIndentedString(secondaryRESTResourceCorrelationAttribute)).append("\n");
    sb.append("    useSecondaryValueForLinking: ").append(toIndentedString(useSecondaryValueForLinking)).append("\n");
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
    openapiFields.add("displayName");
    openapiFields.add("correlatedRESTResource");
    openapiFields.add("primaryRESTResourceCorrelationAttribute");
    openapiFields.add("secondaryRESTResourceCorrelationAttribute");
    openapiFields.add("useSecondaryValueForLinking");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("correlatedRESTResource");
    openapiRequiredFields.add("primaryRESTResourceCorrelationAttribute");
    openapiRequiredFields.add("secondaryRESTResourceCorrelationAttribute");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DelegatedAdminCorrelatedRestResourceResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DelegatedAdminCorrelatedRestResourceResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DelegatedAdminCorrelatedRestResourceResponse is not found in the empty JSON string", DelegatedAdminCorrelatedRestResourceResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DelegatedAdminCorrelatedRestResourceResponse.openapiRequiredFields) {
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
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if (!jsonObj.get("correlatedRESTResource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `correlatedRESTResource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("correlatedRESTResource").toString()));
      }
      if (!jsonObj.get("primaryRESTResourceCorrelationAttribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryRESTResourceCorrelationAttribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryRESTResourceCorrelationAttribute").toString()));
      }
      if (!jsonObj.get("secondaryRESTResourceCorrelationAttribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondaryRESTResourceCorrelationAttribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondaryRESTResourceCorrelationAttribute").toString()));
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
       if (!DelegatedAdminCorrelatedRestResourceResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DelegatedAdminCorrelatedRestResourceResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DelegatedAdminCorrelatedRestResourceResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DelegatedAdminCorrelatedRestResourceResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DelegatedAdminCorrelatedRestResourceResponse>() {
           @Override
           public void write(JsonWriter out, DelegatedAdminCorrelatedRestResourceResponse value) throws IOException {
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
           public DelegatedAdminCorrelatedRestResourceResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DelegatedAdminCorrelatedRestResourceResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DelegatedAdminCorrelatedRestResourceResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DelegatedAdminCorrelatedRestResourceResponse
  * @throws IOException if the JSON string is invalid with respect to DelegatedAdminCorrelatedRestResourceResponse
  */
  public static DelegatedAdminCorrelatedRestResourceResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DelegatedAdminCorrelatedRestResourceResponse.class);
  }

 /**
  * Convert an instance of DelegatedAdminCorrelatedRestResourceResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

