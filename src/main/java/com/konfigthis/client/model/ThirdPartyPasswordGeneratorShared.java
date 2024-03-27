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
import com.konfigthis.client.model.EnumthirdPartyPasswordGeneratorSchemaUrn;
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
 * ThirdPartyPasswordGeneratorShared
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ThirdPartyPasswordGeneratorShared {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumthirdPartyPasswordGeneratorSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXTENSION_CLASS = "extensionClass";
  @SerializedName(SERIALIZED_NAME_EXTENSION_CLASS)
  private String extensionClass;

  public static final String SERIALIZED_NAME_EXTENSION_ARGUMENT = "extensionArgument";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ARGUMENT)
  private List<String> extensionArgument = null;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public ThirdPartyPasswordGeneratorShared() {
  }

  public ThirdPartyPasswordGeneratorShared description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Password Generator
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Password Generator")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ThirdPartyPasswordGeneratorShared schemas(List<EnumthirdPartyPasswordGeneratorSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public ThirdPartyPasswordGeneratorShared addSchemasItem(EnumthirdPartyPasswordGeneratorSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumthirdPartyPasswordGeneratorSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumthirdPartyPasswordGeneratorSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public ThirdPartyPasswordGeneratorShared extensionClass(String extensionClass) {
    
    
    
    
    this.extensionClass = extensionClass;
    return this;
  }

   /**
   * The fully-qualified name of the Java class providing the logic for the Third Party Password Generator.
   * @return extensionClass
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The fully-qualified name of the Java class providing the logic for the Third Party Password Generator.")

  public String getExtensionClass() {
    return extensionClass;
  }


  public void setExtensionClass(String extensionClass) {
    
    
    
    this.extensionClass = extensionClass;
  }


  public ThirdPartyPasswordGeneratorShared extensionArgument(List<String> extensionArgument) {
    
    
    
    
    this.extensionArgument = extensionArgument;
    return this;
  }

  public ThirdPartyPasswordGeneratorShared addExtensionArgumentItem(String extensionArgumentItem) {
    if (this.extensionArgument == null) {
      this.extensionArgument = new ArrayList<>();
    }
    this.extensionArgument.add(extensionArgumentItem);
    return this;
  }

   /**
   * The set of arguments used to customize the behavior for the Third Party Password Generator. Each configuration property should be given in the form &#39;name&#x3D;value&#39;.
   * @return extensionArgument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The set of arguments used to customize the behavior for the Third Party Password Generator. Each configuration property should be given in the form 'name=value'.")

  public List<String> getExtensionArgument() {
    return extensionArgument;
  }


  public void setExtensionArgument(List<String> extensionArgument) {
    
    
    
    this.extensionArgument = extensionArgument;
  }


  public ThirdPartyPasswordGeneratorShared enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the Password Generator is enabled for use.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether the Password Generator is enabled for use.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
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
   * @return the ThirdPartyPasswordGeneratorShared instance itself
   */
  public ThirdPartyPasswordGeneratorShared putAdditionalProperty(String key, Object value) {
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
    ThirdPartyPasswordGeneratorShared thirdPartyPasswordGeneratorShared = (ThirdPartyPasswordGeneratorShared) o;
    return Objects.equals(this.description, thirdPartyPasswordGeneratorShared.description) &&
        Objects.equals(this.schemas, thirdPartyPasswordGeneratorShared.schemas) &&
        Objects.equals(this.extensionClass, thirdPartyPasswordGeneratorShared.extensionClass) &&
        Objects.equals(this.extensionArgument, thirdPartyPasswordGeneratorShared.extensionArgument) &&
        Objects.equals(this.enabled, thirdPartyPasswordGeneratorShared.enabled)&&
        Objects.equals(this.additionalProperties, thirdPartyPasswordGeneratorShared.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, extensionClass, extensionArgument, enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyPasswordGeneratorShared {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    extensionClass: ").append(toIndentedString(extensionClass)).append("\n");
    sb.append("    extensionArgument: ").append(toIndentedString(extensionArgument)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
    openapiFields.add("extensionClass");
    openapiFields.add("extensionArgument");
    openapiFields.add("enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("extensionClass");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThirdPartyPasswordGeneratorShared
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ThirdPartyPasswordGeneratorShared.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThirdPartyPasswordGeneratorShared is not found in the empty JSON string", ThirdPartyPasswordGeneratorShared.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ThirdPartyPasswordGeneratorShared.openapiRequiredFields) {
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
      if (!jsonObj.get("extensionClass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extensionClass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extensionClass").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("extensionArgument") != null && !jsonObj.get("extensionArgument").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `extensionArgument` to be an array in the JSON string but got `%s`", jsonObj.get("extensionArgument").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThirdPartyPasswordGeneratorShared.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThirdPartyPasswordGeneratorShared' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThirdPartyPasswordGeneratorShared> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThirdPartyPasswordGeneratorShared.class));

       return (TypeAdapter<T>) new TypeAdapter<ThirdPartyPasswordGeneratorShared>() {
           @Override
           public void write(JsonWriter out, ThirdPartyPasswordGeneratorShared value) throws IOException {
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
           public ThirdPartyPasswordGeneratorShared read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ThirdPartyPasswordGeneratorShared instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ThirdPartyPasswordGeneratorShared given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ThirdPartyPasswordGeneratorShared
  * @throws IOException if the JSON string is invalid with respect to ThirdPartyPasswordGeneratorShared
  */
  public static ThirdPartyPasswordGeneratorShared fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThirdPartyPasswordGeneratorShared.class);
  }

 /**
  * Convert an instance of ThirdPartyPasswordGeneratorShared to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

