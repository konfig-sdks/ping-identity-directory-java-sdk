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
import com.konfigthis.client.model.EnumalertHandlerDisabledAlertTypeProp;
import com.konfigthis.client.model.EnumalertHandlerEnabledAlertSeverityProp;
import com.konfigthis.client.model.EnumalertHandlerEnabledAlertTypeProp;
import com.konfigthis.client.model.EnumcustomAlertHandlerSchemaUrn;
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
 * CustomAlertHandlerResponseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CustomAlertHandlerResponseAllOf {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumcustomAlertHandlerSchemaUrn> schemas = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_ASYNCHRONOUS = "asynchronous";
  @SerializedName(SERIALIZED_NAME_ASYNCHRONOUS)
  private Boolean asynchronous;

  public static final String SERIALIZED_NAME_ENABLED_ALERT_SEVERITY = "enabledAlertSeverity";
  @SerializedName(SERIALIZED_NAME_ENABLED_ALERT_SEVERITY)
  private List<EnumalertHandlerEnabledAlertSeverityProp> enabledAlertSeverity = null;

  public static final String SERIALIZED_NAME_ENABLED_ALERT_TYPE = "enabledAlertType";
  @SerializedName(SERIALIZED_NAME_ENABLED_ALERT_TYPE)
  private List<EnumalertHandlerEnabledAlertTypeProp> enabledAlertType = null;

  public static final String SERIALIZED_NAME_DISABLED_ALERT_TYPE = "disabledAlertType";
  @SerializedName(SERIALIZED_NAME_DISABLED_ALERT_TYPE)
  private List<EnumalertHandlerDisabledAlertTypeProp> disabledAlertType = null;

  public CustomAlertHandlerResponseAllOf() {
  }

  public CustomAlertHandlerResponseAllOf description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Alert Handler
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Alert Handler")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public CustomAlertHandlerResponseAllOf schemas(List<EnumcustomAlertHandlerSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public CustomAlertHandlerResponseAllOf addSchemasItem(EnumcustomAlertHandlerSchemaUrn schemasItem) {
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

  public List<EnumcustomAlertHandlerSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumcustomAlertHandlerSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public CustomAlertHandlerResponseAllOf id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Alert Handler
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Alert Handler")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public CustomAlertHandlerResponseAllOf enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the Alert Handler is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the Alert Handler is enabled.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public CustomAlertHandlerResponseAllOf asynchronous(Boolean asynchronous) {
    
    
    
    
    this.asynchronous = asynchronous;
    return this;
  }

   /**
   * Indicates whether the server should attempt to invoke this Alert Handler in a background thread so that any potentially-expensive processing (e.g., performing network communication to deliver the alert notification) will not delay whatever processing the server was performing when the alert was generated.
   * @return asynchronous
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the server should attempt to invoke this Alert Handler in a background thread so that any potentially-expensive processing (e.g., performing network communication to deliver the alert notification) will not delay whatever processing the server was performing when the alert was generated.")

  public Boolean getAsynchronous() {
    return asynchronous;
  }


  public void setAsynchronous(Boolean asynchronous) {
    
    
    
    this.asynchronous = asynchronous;
  }


  public CustomAlertHandlerResponseAllOf enabledAlertSeverity(List<EnumalertHandlerEnabledAlertSeverityProp> enabledAlertSeverity) {
    
    
    
    
    this.enabledAlertSeverity = enabledAlertSeverity;
    return this;
  }

  public CustomAlertHandlerResponseAllOf addEnabledAlertSeverityItem(EnumalertHandlerEnabledAlertSeverityProp enabledAlertSeverityItem) {
    if (this.enabledAlertSeverity == null) {
      this.enabledAlertSeverity = new ArrayList<>();
    }
    this.enabledAlertSeverity.add(enabledAlertSeverityItem);
    return this;
  }

   /**
   * Get enabledAlertSeverity
   * @return enabledAlertSeverity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumalertHandlerEnabledAlertSeverityProp> getEnabledAlertSeverity() {
    return enabledAlertSeverity;
  }


  public void setEnabledAlertSeverity(List<EnumalertHandlerEnabledAlertSeverityProp> enabledAlertSeverity) {
    
    
    
    this.enabledAlertSeverity = enabledAlertSeverity;
  }


  public CustomAlertHandlerResponseAllOf enabledAlertType(List<EnumalertHandlerEnabledAlertTypeProp> enabledAlertType) {
    
    
    
    
    this.enabledAlertType = enabledAlertType;
    return this;
  }

  public CustomAlertHandlerResponseAllOf addEnabledAlertTypeItem(EnumalertHandlerEnabledAlertTypeProp enabledAlertTypeItem) {
    if (this.enabledAlertType == null) {
      this.enabledAlertType = new ArrayList<>();
    }
    this.enabledAlertType.add(enabledAlertTypeItem);
    return this;
  }

   /**
   * Get enabledAlertType
   * @return enabledAlertType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumalertHandlerEnabledAlertTypeProp> getEnabledAlertType() {
    return enabledAlertType;
  }


  public void setEnabledAlertType(List<EnumalertHandlerEnabledAlertTypeProp> enabledAlertType) {
    
    
    
    this.enabledAlertType = enabledAlertType;
  }


  public CustomAlertHandlerResponseAllOf disabledAlertType(List<EnumalertHandlerDisabledAlertTypeProp> disabledAlertType) {
    
    
    
    
    this.disabledAlertType = disabledAlertType;
    return this;
  }

  public CustomAlertHandlerResponseAllOf addDisabledAlertTypeItem(EnumalertHandlerDisabledAlertTypeProp disabledAlertTypeItem) {
    if (this.disabledAlertType == null) {
      this.disabledAlertType = new ArrayList<>();
    }
    this.disabledAlertType.add(disabledAlertTypeItem);
    return this;
  }

   /**
   * Get disabledAlertType
   * @return disabledAlertType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumalertHandlerDisabledAlertTypeProp> getDisabledAlertType() {
    return disabledAlertType;
  }


  public void setDisabledAlertType(List<EnumalertHandlerDisabledAlertTypeProp> disabledAlertType) {
    
    
    
    this.disabledAlertType = disabledAlertType;
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
   * @return the CustomAlertHandlerResponseAllOf instance itself
   */
  public CustomAlertHandlerResponseAllOf putAdditionalProperty(String key, Object value) {
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
    CustomAlertHandlerResponseAllOf customAlertHandlerResponseAllOf = (CustomAlertHandlerResponseAllOf) o;
    return Objects.equals(this.description, customAlertHandlerResponseAllOf.description) &&
        Objects.equals(this.schemas, customAlertHandlerResponseAllOf.schemas) &&
        Objects.equals(this.id, customAlertHandlerResponseAllOf.id) &&
        Objects.equals(this.enabled, customAlertHandlerResponseAllOf.enabled) &&
        Objects.equals(this.asynchronous, customAlertHandlerResponseAllOf.asynchronous) &&
        Objects.equals(this.enabledAlertSeverity, customAlertHandlerResponseAllOf.enabledAlertSeverity) &&
        Objects.equals(this.enabledAlertType, customAlertHandlerResponseAllOf.enabledAlertType) &&
        Objects.equals(this.disabledAlertType, customAlertHandlerResponseAllOf.disabledAlertType)&&
        Objects.equals(this.additionalProperties, customAlertHandlerResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, id, enabled, asynchronous, enabledAlertSeverity, enabledAlertType, disabledAlertType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAlertHandlerResponseAllOf {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    asynchronous: ").append(toIndentedString(asynchronous)).append("\n");
    sb.append("    enabledAlertSeverity: ").append(toIndentedString(enabledAlertSeverity)).append("\n");
    sb.append("    enabledAlertType: ").append(toIndentedString(enabledAlertType)).append("\n");
    sb.append("    disabledAlertType: ").append(toIndentedString(disabledAlertType)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("asynchronous");
    openapiFields.add("enabledAlertSeverity");
    openapiFields.add("enabledAlertType");
    openapiFields.add("disabledAlertType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomAlertHandlerResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomAlertHandlerResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomAlertHandlerResponseAllOf is not found in the empty JSON string", CustomAlertHandlerResponseAllOf.openapiRequiredFields.toString()));
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("enabledAlertSeverity") != null && !jsonObj.get("enabledAlertSeverity").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `enabledAlertSeverity` to be an array in the JSON string but got `%s`", jsonObj.get("enabledAlertSeverity").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("enabledAlertType") != null && !jsonObj.get("enabledAlertType").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `enabledAlertType` to be an array in the JSON string but got `%s`", jsonObj.get("enabledAlertType").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("disabledAlertType") != null && !jsonObj.get("disabledAlertType").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `disabledAlertType` to be an array in the JSON string but got `%s`", jsonObj.get("disabledAlertType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomAlertHandlerResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomAlertHandlerResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomAlertHandlerResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomAlertHandlerResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomAlertHandlerResponseAllOf>() {
           @Override
           public void write(JsonWriter out, CustomAlertHandlerResponseAllOf value) throws IOException {
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
           public CustomAlertHandlerResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CustomAlertHandlerResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CustomAlertHandlerResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomAlertHandlerResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to CustomAlertHandlerResponseAllOf
  */
  public static CustomAlertHandlerResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomAlertHandlerResponseAllOf.class);
  }

 /**
  * Convert an instance of CustomAlertHandlerResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

