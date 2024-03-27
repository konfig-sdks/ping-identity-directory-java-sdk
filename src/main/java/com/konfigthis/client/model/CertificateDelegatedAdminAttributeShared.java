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
import com.konfigthis.client.model.EnumcertificateDelegatedAdminAttributeSchemaUrn;
import com.konfigthis.client.model.EnumdelegatedAdminAttributeAttributePresentationProp;
import com.konfigthis.client.model.EnumdelegatedAdminAttributeCertificateAllowedMIMETypeProp;
import com.konfigthis.client.model.EnumdelegatedAdminAttributeMutabilityProp;
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
 * CertificateDelegatedAdminAttributeShared
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CertificateDelegatedAdminAttributeShared {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumcertificateDelegatedAdminAttributeSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALLOWED_M_I_M_E_TYPE = "allowedMIMEType";
  @SerializedName(SERIALIZED_NAME_ALLOWED_M_I_M_E_TYPE)
  private List<EnumdelegatedAdminAttributeCertificateAllowedMIMETypeProp> allowedMIMEType = null;

  public static final String SERIALIZED_NAME_ATTRIBUTE_TYPE = "attributeType";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_TYPE)
  private String attributeType;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_MUTABILITY = "mutability";
  @SerializedName(SERIALIZED_NAME_MUTABILITY)
  private EnumdelegatedAdminAttributeMutabilityProp mutability;

  public static final String SERIALIZED_NAME_MULTI_VALUED = "multiValued";
  @SerializedName(SERIALIZED_NAME_MULTI_VALUED)
  private Boolean multiValued;

  public static final String SERIALIZED_NAME_ATTRIBUTE_CATEGORY = "attributeCategory";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_CATEGORY)
  private String attributeCategory;

  public static final String SERIALIZED_NAME_DISPLAY_ORDER_INDEX = "displayOrderIndex";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ORDER_INDEX)
  private Integer displayOrderIndex;

  public static final String SERIALIZED_NAME_REFERENCE_RESOURCE_TYPE = "referenceResourceType";
  @SerializedName(SERIALIZED_NAME_REFERENCE_RESOURCE_TYPE)
  private String referenceResourceType;

  public static final String SERIALIZED_NAME_ATTRIBUTE_PRESENTATION = "attributePresentation";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_PRESENTATION)
  private EnumdelegatedAdminAttributeAttributePresentationProp attributePresentation;

  public static final String SERIALIZED_NAME_DATE_TIME_FORMAT = "dateTimeFormat";
  @SerializedName(SERIALIZED_NAME_DATE_TIME_FORMAT)
  private String dateTimeFormat;

  public CertificateDelegatedAdminAttributeShared() {
  }

  public CertificateDelegatedAdminAttributeShared description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Delegated Admin Attribute
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Delegated Admin Attribute")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public CertificateDelegatedAdminAttributeShared schemas(List<EnumcertificateDelegatedAdminAttributeSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public CertificateDelegatedAdminAttributeShared addSchemasItem(EnumcertificateDelegatedAdminAttributeSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumcertificateDelegatedAdminAttributeSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumcertificateDelegatedAdminAttributeSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public CertificateDelegatedAdminAttributeShared allowedMIMEType(List<EnumdelegatedAdminAttributeCertificateAllowedMIMETypeProp> allowedMIMEType) {
    
    
    
    
    this.allowedMIMEType = allowedMIMEType;
    return this;
  }

  public CertificateDelegatedAdminAttributeShared addAllowedMIMETypeItem(EnumdelegatedAdminAttributeCertificateAllowedMIMETypeProp allowedMIMETypeItem) {
    if (this.allowedMIMEType == null) {
      this.allowedMIMEType = new ArrayList<>();
    }
    this.allowedMIMEType.add(allowedMIMETypeItem);
    return this;
  }

   /**
   * Get allowedMIMEType
   * @return allowedMIMEType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumdelegatedAdminAttributeCertificateAllowedMIMETypeProp> getAllowedMIMEType() {
    return allowedMIMEType;
  }


  public void setAllowedMIMEType(List<EnumdelegatedAdminAttributeCertificateAllowedMIMETypeProp> allowedMIMEType) {
    
    
    
    this.allowedMIMEType = allowedMIMEType;
  }


  public CertificateDelegatedAdminAttributeShared attributeType(String attributeType) {
    
    
    
    
    this.attributeType = attributeType;
    return this;
  }

   /**
   * Specifies the name or OID of the LDAP attribute type.
   * @return attributeType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the name or OID of the LDAP attribute type.")

  public String getAttributeType() {
    return attributeType;
  }


  public void setAttributeType(String attributeType) {
    
    
    
    this.attributeType = attributeType;
  }


  public CertificateDelegatedAdminAttributeShared displayName(String displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * A human readable display name for this Delegated Admin Attribute.
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A human readable display name for this Delegated Admin Attribute.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    
    
    
    this.displayName = displayName;
  }


  public CertificateDelegatedAdminAttributeShared mutability(EnumdelegatedAdminAttributeMutabilityProp mutability) {
    
    
    
    
    this.mutability = mutability;
    return this;
  }

   /**
   * Get mutability
   * @return mutability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumdelegatedAdminAttributeMutabilityProp getMutability() {
    return mutability;
  }


  public void setMutability(EnumdelegatedAdminAttributeMutabilityProp mutability) {
    
    
    
    this.mutability = mutability;
  }


  public CertificateDelegatedAdminAttributeShared multiValued(Boolean multiValued) {
    
    
    
    
    this.multiValued = multiValued;
    return this;
  }

   /**
   * Indicates whether this Delegated Admin Attribute may have multiple values.
   * @return multiValued
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether this Delegated Admin Attribute may have multiple values.")

  public Boolean getMultiValued() {
    return multiValued;
  }


  public void setMultiValued(Boolean multiValued) {
    
    
    
    this.multiValued = multiValued;
  }


  public CertificateDelegatedAdminAttributeShared attributeCategory(String attributeCategory) {
    
    
    
    
    this.attributeCategory = attributeCategory;
    return this;
  }

   /**
   * Specifies which attribute category this attribute belongs to.
   * @return attributeCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies which attribute category this attribute belongs to.")

  public String getAttributeCategory() {
    return attributeCategory;
  }


  public void setAttributeCategory(String attributeCategory) {
    
    
    
    this.attributeCategory = attributeCategory;
  }


  public CertificateDelegatedAdminAttributeShared displayOrderIndex(Integer displayOrderIndex) {
    
    
    
    
    this.displayOrderIndex = displayOrderIndex;
    return this;
  }

   /**
   * This property determines a display order for attributes within a given attribute category. Attributes are ordered within their category based on this index from least to greatest.
   * @return displayOrderIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This property determines a display order for attributes within a given attribute category. Attributes are ordered within their category based on this index from least to greatest.")

  public Integer getDisplayOrderIndex() {
    return displayOrderIndex;
  }


  public void setDisplayOrderIndex(Integer displayOrderIndex) {
    
    
    
    this.displayOrderIndex = displayOrderIndex;
  }


  public CertificateDelegatedAdminAttributeShared referenceResourceType(String referenceResourceType) {
    
    
    
    
    this.referenceResourceType = referenceResourceType;
    return this;
  }

   /**
   * For LDAP attributes with DN syntax, specifies what kind of resource is referenced.
   * @return referenceResourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For LDAP attributes with DN syntax, specifies what kind of resource is referenced.")

  public String getReferenceResourceType() {
    return referenceResourceType;
  }


  public void setReferenceResourceType(String referenceResourceType) {
    
    
    
    this.referenceResourceType = referenceResourceType;
  }


  public CertificateDelegatedAdminAttributeShared attributePresentation(EnumdelegatedAdminAttributeAttributePresentationProp attributePresentation) {
    
    
    
    
    this.attributePresentation = attributePresentation;
    return this;
  }

   /**
   * Get attributePresentation
   * @return attributePresentation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumdelegatedAdminAttributeAttributePresentationProp getAttributePresentation() {
    return attributePresentation;
  }


  public void setAttributePresentation(EnumdelegatedAdminAttributeAttributePresentationProp attributePresentation) {
    
    
    
    this.attributePresentation = attributePresentation;
  }


  public CertificateDelegatedAdminAttributeShared dateTimeFormat(String dateTimeFormat) {
    
    
    
    
    this.dateTimeFormat = dateTimeFormat;
    return this;
  }

   /**
   * Specifies the format string that is used to present a date and/or time value to the user of the app. This property only applies to LDAP attribute types whose LDAP syntax is GeneralizedTime and is ignored if the attribute type has any other syntax.
   * @return dateTimeFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the format string that is used to present a date and/or time value to the user of the app. This property only applies to LDAP attribute types whose LDAP syntax is GeneralizedTime and is ignored if the attribute type has any other syntax.")

  public String getDateTimeFormat() {
    return dateTimeFormat;
  }


  public void setDateTimeFormat(String dateTimeFormat) {
    
    
    
    this.dateTimeFormat = dateTimeFormat;
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
   * @return the CertificateDelegatedAdminAttributeShared instance itself
   */
  public CertificateDelegatedAdminAttributeShared putAdditionalProperty(String key, Object value) {
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
    CertificateDelegatedAdminAttributeShared certificateDelegatedAdminAttributeShared = (CertificateDelegatedAdminAttributeShared) o;
    return Objects.equals(this.description, certificateDelegatedAdminAttributeShared.description) &&
        Objects.equals(this.schemas, certificateDelegatedAdminAttributeShared.schemas) &&
        Objects.equals(this.allowedMIMEType, certificateDelegatedAdminAttributeShared.allowedMIMEType) &&
        Objects.equals(this.attributeType, certificateDelegatedAdminAttributeShared.attributeType) &&
        Objects.equals(this.displayName, certificateDelegatedAdminAttributeShared.displayName) &&
        Objects.equals(this.mutability, certificateDelegatedAdminAttributeShared.mutability) &&
        Objects.equals(this.multiValued, certificateDelegatedAdminAttributeShared.multiValued) &&
        Objects.equals(this.attributeCategory, certificateDelegatedAdminAttributeShared.attributeCategory) &&
        Objects.equals(this.displayOrderIndex, certificateDelegatedAdminAttributeShared.displayOrderIndex) &&
        Objects.equals(this.referenceResourceType, certificateDelegatedAdminAttributeShared.referenceResourceType) &&
        Objects.equals(this.attributePresentation, certificateDelegatedAdminAttributeShared.attributePresentation) &&
        Objects.equals(this.dateTimeFormat, certificateDelegatedAdminAttributeShared.dateTimeFormat)&&
        Objects.equals(this.additionalProperties, certificateDelegatedAdminAttributeShared.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, allowedMIMEType, attributeType, displayName, mutability, multiValued, attributeCategory, displayOrderIndex, referenceResourceType, attributePresentation, dateTimeFormat, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateDelegatedAdminAttributeShared {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    allowedMIMEType: ").append(toIndentedString(allowedMIMEType)).append("\n");
    sb.append("    attributeType: ").append(toIndentedString(attributeType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    mutability: ").append(toIndentedString(mutability)).append("\n");
    sb.append("    multiValued: ").append(toIndentedString(multiValued)).append("\n");
    sb.append("    attributeCategory: ").append(toIndentedString(attributeCategory)).append("\n");
    sb.append("    displayOrderIndex: ").append(toIndentedString(displayOrderIndex)).append("\n");
    sb.append("    referenceResourceType: ").append(toIndentedString(referenceResourceType)).append("\n");
    sb.append("    attributePresentation: ").append(toIndentedString(attributePresentation)).append("\n");
    sb.append("    dateTimeFormat: ").append(toIndentedString(dateTimeFormat)).append("\n");
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
    openapiFields.add("allowedMIMEType");
    openapiFields.add("attributeType");
    openapiFields.add("displayName");
    openapiFields.add("mutability");
    openapiFields.add("multiValued");
    openapiFields.add("attributeCategory");
    openapiFields.add("displayOrderIndex");
    openapiFields.add("referenceResourceType");
    openapiFields.add("attributePresentation");
    openapiFields.add("dateTimeFormat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("attributeType");
    openapiRequiredFields.add("displayName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CertificateDelegatedAdminAttributeShared
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CertificateDelegatedAdminAttributeShared.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CertificateDelegatedAdminAttributeShared is not found in the empty JSON string", CertificateDelegatedAdminAttributeShared.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CertificateDelegatedAdminAttributeShared.openapiRequiredFields) {
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowedMIMEType") != null && !jsonObj.get("allowedMIMEType").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedMIMEType` to be an array in the JSON string but got `%s`", jsonObj.get("allowedMIMEType").toString()));
      }
      if (!jsonObj.get("attributeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeType").toString()));
      }
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("attributeCategory") != null && !jsonObj.get("attributeCategory").isJsonNull()) && !jsonObj.get("attributeCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeCategory").toString()));
      }
      if ((jsonObj.get("referenceResourceType") != null && !jsonObj.get("referenceResourceType").isJsonNull()) && !jsonObj.get("referenceResourceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceResourceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceResourceType").toString()));
      }
      if ((jsonObj.get("dateTimeFormat") != null && !jsonObj.get("dateTimeFormat").isJsonNull()) && !jsonObj.get("dateTimeFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateTimeFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateTimeFormat").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CertificateDelegatedAdminAttributeShared.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CertificateDelegatedAdminAttributeShared' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CertificateDelegatedAdminAttributeShared> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CertificateDelegatedAdminAttributeShared.class));

       return (TypeAdapter<T>) new TypeAdapter<CertificateDelegatedAdminAttributeShared>() {
           @Override
           public void write(JsonWriter out, CertificateDelegatedAdminAttributeShared value) throws IOException {
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
           public CertificateDelegatedAdminAttributeShared read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CertificateDelegatedAdminAttributeShared instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CertificateDelegatedAdminAttributeShared given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CertificateDelegatedAdminAttributeShared
  * @throws IOException if the JSON string is invalid with respect to CertificateDelegatedAdminAttributeShared
  */
  public static CertificateDelegatedAdminAttributeShared fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CertificateDelegatedAdminAttributeShared.class);
  }

 /**
  * Convert an instance of CertificateDelegatedAdminAttributeShared to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

