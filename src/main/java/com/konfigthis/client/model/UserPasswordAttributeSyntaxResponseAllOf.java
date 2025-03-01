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
import com.konfigthis.client.model.EnumuserPasswordAttributeSyntaxSchemaUrn;
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
 * UserPasswordAttributeSyntaxResponseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UserPasswordAttributeSyntaxResponseAllOf {
  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumuserPasswordAttributeSyntaxSchemaUrn> schemas = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ENABLE_COMPACTION = "enableCompaction";
  @SerializedName(SERIALIZED_NAME_ENABLE_COMPACTION)
  private Boolean enableCompaction;

  public static final String SERIALIZED_NAME_INCLUDE_ATTRIBUTE_IN_COMPACTION = "includeAttributeInCompaction";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ATTRIBUTE_IN_COMPACTION)
  private List<String> includeAttributeInCompaction = null;

  public static final String SERIALIZED_NAME_EXCLUDE_ATTRIBUTE_FROM_COMPACTION = "excludeAttributeFromCompaction";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_ATTRIBUTE_FROM_COMPACTION)
  private List<String> excludeAttributeFromCompaction = null;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_REQUIRE_BINARY_TRANSFER = "requireBinaryTransfer";
  @SerializedName(SERIALIZED_NAME_REQUIRE_BINARY_TRANSFER)
  private Boolean requireBinaryTransfer;

  public UserPasswordAttributeSyntaxResponseAllOf() {
  }

  public UserPasswordAttributeSyntaxResponseAllOf schemas(List<EnumuserPasswordAttributeSyntaxSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public UserPasswordAttributeSyntaxResponseAllOf addSchemasItem(EnumuserPasswordAttributeSyntaxSchemaUrn schemasItem) {
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

  public List<EnumuserPasswordAttributeSyntaxSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumuserPasswordAttributeSyntaxSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public UserPasswordAttributeSyntaxResponseAllOf id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Attribute Syntax
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Attribute Syntax")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public UserPasswordAttributeSyntaxResponseAllOf enableCompaction(Boolean enableCompaction) {
    
    
    
    
    this.enableCompaction = enableCompaction;
    return this;
  }

   /**
   * Indicates whether values of attributes with this syntax should be compacted when stored in a local DB database.
   * @return enableCompaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether values of attributes with this syntax should be compacted when stored in a local DB database.")

  public Boolean getEnableCompaction() {
    return enableCompaction;
  }


  public void setEnableCompaction(Boolean enableCompaction) {
    
    
    
    this.enableCompaction = enableCompaction;
  }


  public UserPasswordAttributeSyntaxResponseAllOf includeAttributeInCompaction(List<String> includeAttributeInCompaction) {
    
    
    
    
    this.includeAttributeInCompaction = includeAttributeInCompaction;
    return this;
  }

  public UserPasswordAttributeSyntaxResponseAllOf addIncludeAttributeInCompactionItem(String includeAttributeInCompactionItem) {
    if (this.includeAttributeInCompaction == null) {
      this.includeAttributeInCompaction = new ArrayList<>();
    }
    this.includeAttributeInCompaction.add(includeAttributeInCompactionItem);
    return this;
  }

   /**
   * Specifies the specific attributes (which should be associated with this syntax) whose values should be compacted. If one or more include attributes are specified, then only those attributes will have their values compacted. If not set then all attributes will have their values compacted. The exclude-attribute-from-compaction property takes precedence over this property.
   * @return includeAttributeInCompaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the specific attributes (which should be associated with this syntax) whose values should be compacted. If one or more include attributes are specified, then only those attributes will have their values compacted. If not set then all attributes will have their values compacted. The exclude-attribute-from-compaction property takes precedence over this property.")

  public List<String> getIncludeAttributeInCompaction() {
    return includeAttributeInCompaction;
  }


  public void setIncludeAttributeInCompaction(List<String> includeAttributeInCompaction) {
    
    
    
    this.includeAttributeInCompaction = includeAttributeInCompaction;
  }


  public UserPasswordAttributeSyntaxResponseAllOf excludeAttributeFromCompaction(List<String> excludeAttributeFromCompaction) {
    
    
    
    
    this.excludeAttributeFromCompaction = excludeAttributeFromCompaction;
    return this;
  }

  public UserPasswordAttributeSyntaxResponseAllOf addExcludeAttributeFromCompactionItem(String excludeAttributeFromCompactionItem) {
    if (this.excludeAttributeFromCompaction == null) {
      this.excludeAttributeFromCompaction = new ArrayList<>();
    }
    this.excludeAttributeFromCompaction.add(excludeAttributeFromCompactionItem);
    return this;
  }

   /**
   * Specifies the specific attributes (which should be associated with this syntax) whose values should not be compacted. If one or more exclude attributes are specified, then values of those attributes will not have their values compacted. This property takes precedence over the include-attribute-in-compaction property.
   * @return excludeAttributeFromCompaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the specific attributes (which should be associated with this syntax) whose values should not be compacted. If one or more exclude attributes are specified, then values of those attributes will not have their values compacted. This property takes precedence over the include-attribute-in-compaction property.")

  public List<String> getExcludeAttributeFromCompaction() {
    return excludeAttributeFromCompaction;
  }


  public void setExcludeAttributeFromCompaction(List<String> excludeAttributeFromCompaction) {
    
    
    
    this.excludeAttributeFromCompaction = excludeAttributeFromCompaction;
  }


  public UserPasswordAttributeSyntaxResponseAllOf enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the Attribute Syntax is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the Attribute Syntax is enabled.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public UserPasswordAttributeSyntaxResponseAllOf requireBinaryTransfer(Boolean requireBinaryTransfer) {
    
    
    
    
    this.requireBinaryTransfer = requireBinaryTransfer;
    return this;
  }

   /**
   * Indicates whether values of this attribute are required to have a \&quot;binary\&quot; transfer option as described in RFC 4522. Attributes with this syntax will generally be referenced with names including \&quot;;binary\&quot; (e.g., \&quot;userCertificate;binary\&quot;).
   * @return requireBinaryTransfer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether values of this attribute are required to have a \"binary\" transfer option as described in RFC 4522. Attributes with this syntax will generally be referenced with names including \";binary\" (e.g., \"userCertificate;binary\").")

  public Boolean getRequireBinaryTransfer() {
    return requireBinaryTransfer;
  }


  public void setRequireBinaryTransfer(Boolean requireBinaryTransfer) {
    
    
    
    this.requireBinaryTransfer = requireBinaryTransfer;
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
   * @return the UserPasswordAttributeSyntaxResponseAllOf instance itself
   */
  public UserPasswordAttributeSyntaxResponseAllOf putAdditionalProperty(String key, Object value) {
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
    UserPasswordAttributeSyntaxResponseAllOf userPasswordAttributeSyntaxResponseAllOf = (UserPasswordAttributeSyntaxResponseAllOf) o;
    return Objects.equals(this.schemas, userPasswordAttributeSyntaxResponseAllOf.schemas) &&
        Objects.equals(this.id, userPasswordAttributeSyntaxResponseAllOf.id) &&
        Objects.equals(this.enableCompaction, userPasswordAttributeSyntaxResponseAllOf.enableCompaction) &&
        Objects.equals(this.includeAttributeInCompaction, userPasswordAttributeSyntaxResponseAllOf.includeAttributeInCompaction) &&
        Objects.equals(this.excludeAttributeFromCompaction, userPasswordAttributeSyntaxResponseAllOf.excludeAttributeFromCompaction) &&
        Objects.equals(this.enabled, userPasswordAttributeSyntaxResponseAllOf.enabled) &&
        Objects.equals(this.requireBinaryTransfer, userPasswordAttributeSyntaxResponseAllOf.requireBinaryTransfer)&&
        Objects.equals(this.additionalProperties, userPasswordAttributeSyntaxResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, id, enableCompaction, includeAttributeInCompaction, excludeAttributeFromCompaction, enabled, requireBinaryTransfer, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPasswordAttributeSyntaxResponseAllOf {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    enableCompaction: ").append(toIndentedString(enableCompaction)).append("\n");
    sb.append("    includeAttributeInCompaction: ").append(toIndentedString(includeAttributeInCompaction)).append("\n");
    sb.append("    excludeAttributeFromCompaction: ").append(toIndentedString(excludeAttributeFromCompaction)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    requireBinaryTransfer: ").append(toIndentedString(requireBinaryTransfer)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("enableCompaction");
    openapiFields.add("includeAttributeInCompaction");
    openapiFields.add("excludeAttributeFromCompaction");
    openapiFields.add("enabled");
    openapiFields.add("requireBinaryTransfer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserPasswordAttributeSyntaxResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserPasswordAttributeSyntaxResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserPasswordAttributeSyntaxResponseAllOf is not found in the empty JSON string", UserPasswordAttributeSyntaxResponseAllOf.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("schemas") != null && !jsonObj.get("schemas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemas` to be an array in the JSON string but got `%s`", jsonObj.get("schemas").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("includeAttributeInCompaction") != null && !jsonObj.get("includeAttributeInCompaction").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includeAttributeInCompaction` to be an array in the JSON string but got `%s`", jsonObj.get("includeAttributeInCompaction").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("excludeAttributeFromCompaction") != null && !jsonObj.get("excludeAttributeFromCompaction").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludeAttributeFromCompaction` to be an array in the JSON string but got `%s`", jsonObj.get("excludeAttributeFromCompaction").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserPasswordAttributeSyntaxResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserPasswordAttributeSyntaxResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserPasswordAttributeSyntaxResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserPasswordAttributeSyntaxResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<UserPasswordAttributeSyntaxResponseAllOf>() {
           @Override
           public void write(JsonWriter out, UserPasswordAttributeSyntaxResponseAllOf value) throws IOException {
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
           public UserPasswordAttributeSyntaxResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UserPasswordAttributeSyntaxResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UserPasswordAttributeSyntaxResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserPasswordAttributeSyntaxResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to UserPasswordAttributeSyntaxResponseAllOf
  */
  public static UserPasswordAttributeSyntaxResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserPasswordAttributeSyntaxResponseAllOf.class);
  }

 /**
  * Convert an instance of UserPasswordAttributeSyntaxResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

