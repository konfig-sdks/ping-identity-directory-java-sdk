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
import com.konfigthis.client.model.EnuminterServerAuthenticationInfoAuthenticationTypeProp;
import com.konfigthis.client.model.EnuminterServerAuthenticationInfoPurposeProp;
import com.konfigthis.client.model.EnumpasswordInterServerAuthenticationInfoSchemaUrn;
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
 * PasswordInterServerAuthenticationInfoResponseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PasswordInterServerAuthenticationInfoResponseAllOf {
  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumpasswordInterServerAuthenticationInfoSchemaUrn> schemas = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_AUTHENTICATION_TYPE = "authenticationType";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_TYPE)
  private EnuminterServerAuthenticationInfoAuthenticationTypeProp authenticationType;

  public static final String SERIALIZED_NAME_BIND_D_N = "bindDN";
  @SerializedName(SERIALIZED_NAME_BIND_D_N)
  private String bindDN;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PURPOSE = "purpose";
  @SerializedName(SERIALIZED_NAME_PURPOSE)
  private List<EnuminterServerAuthenticationInfoPurposeProp> purpose = null;

  public PasswordInterServerAuthenticationInfoResponseAllOf() {
  }

  public PasswordInterServerAuthenticationInfoResponseAllOf schemas(List<EnumpasswordInterServerAuthenticationInfoSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public PasswordInterServerAuthenticationInfoResponseAllOf addSchemasItem(EnumpasswordInterServerAuthenticationInfoSchemaUrn schemasItem) {
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

  public List<EnumpasswordInterServerAuthenticationInfoSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumpasswordInterServerAuthenticationInfoSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public PasswordInterServerAuthenticationInfoResponseAllOf id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Inter Server Authentication Info
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Inter Server Authentication Info")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public PasswordInterServerAuthenticationInfoResponseAllOf authenticationType(EnuminterServerAuthenticationInfoAuthenticationTypeProp authenticationType) {
    
    
    
    
    this.authenticationType = authenticationType;
    return this;
  }

   /**
   * Get authenticationType
   * @return authenticationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnuminterServerAuthenticationInfoAuthenticationTypeProp getAuthenticationType() {
    return authenticationType;
  }


  public void setAuthenticationType(EnuminterServerAuthenticationInfoAuthenticationTypeProp authenticationType) {
    
    
    
    this.authenticationType = authenticationType;
  }


  public PasswordInterServerAuthenticationInfoResponseAllOf bindDN(String bindDN) {
    
    
    
    
    this.bindDN = bindDN;
    return this;
  }

   /**
   * A DN of the username that should be used for the bind request.
   * @return bindDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A DN of the username that should be used for the bind request.")

  public String getBindDN() {
    return bindDN;
  }


  public void setBindDN(String bindDN) {
    
    
    
    this.bindDN = bindDN;
  }


  public PasswordInterServerAuthenticationInfoResponseAllOf username(String username) {
    
    
    
    
    this.username = username;
    return this;
  }

   /**
   * The username that should be used for the bind request.
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The username that should be used for the bind request.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    
    
    
    this.username = username;
  }


  public PasswordInterServerAuthenticationInfoResponseAllOf password(String password) {
    
    
    
    
    this.password = password;
    return this;
  }

   /**
   * The password for the username or bind-dn.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The password for the username or bind-dn.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    
    
    
    this.password = password;
  }


  public PasswordInterServerAuthenticationInfoResponseAllOf purpose(List<EnuminterServerAuthenticationInfoPurposeProp> purpose) {
    
    
    
    
    this.purpose = purpose;
    return this;
  }

  public PasswordInterServerAuthenticationInfoResponseAllOf addPurposeItem(EnuminterServerAuthenticationInfoPurposeProp purposeItem) {
    if (this.purpose == null) {
      this.purpose = new ArrayList<>();
    }
    this.purpose.add(purposeItem);
    return this;
  }

   /**
   * Get purpose
   * @return purpose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnuminterServerAuthenticationInfoPurposeProp> getPurpose() {
    return purpose;
  }


  public void setPurpose(List<EnuminterServerAuthenticationInfoPurposeProp> purpose) {
    
    
    
    this.purpose = purpose;
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
   * @return the PasswordInterServerAuthenticationInfoResponseAllOf instance itself
   */
  public PasswordInterServerAuthenticationInfoResponseAllOf putAdditionalProperty(String key, Object value) {
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
    PasswordInterServerAuthenticationInfoResponseAllOf passwordInterServerAuthenticationInfoResponseAllOf = (PasswordInterServerAuthenticationInfoResponseAllOf) o;
    return Objects.equals(this.schemas, passwordInterServerAuthenticationInfoResponseAllOf.schemas) &&
        Objects.equals(this.id, passwordInterServerAuthenticationInfoResponseAllOf.id) &&
        Objects.equals(this.authenticationType, passwordInterServerAuthenticationInfoResponseAllOf.authenticationType) &&
        Objects.equals(this.bindDN, passwordInterServerAuthenticationInfoResponseAllOf.bindDN) &&
        Objects.equals(this.username, passwordInterServerAuthenticationInfoResponseAllOf.username) &&
        Objects.equals(this.password, passwordInterServerAuthenticationInfoResponseAllOf.password) &&
        Objects.equals(this.purpose, passwordInterServerAuthenticationInfoResponseAllOf.purpose)&&
        Objects.equals(this.additionalProperties, passwordInterServerAuthenticationInfoResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, id, authenticationType, bindDN, username, password, purpose, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordInterServerAuthenticationInfoResponseAllOf {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    bindDN: ").append(toIndentedString(bindDN)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
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
    openapiFields.add("authenticationType");
    openapiFields.add("bindDN");
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("purpose");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PasswordInterServerAuthenticationInfoResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PasswordInterServerAuthenticationInfoResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PasswordInterServerAuthenticationInfoResponseAllOf is not found in the empty JSON string", PasswordInterServerAuthenticationInfoResponseAllOf.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("schemas") != null && !jsonObj.get("schemas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemas` to be an array in the JSON string but got `%s`", jsonObj.get("schemas").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("bindDN") != null && !jsonObj.get("bindDN").isJsonNull()) && !jsonObj.get("bindDN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bindDN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bindDN").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("purpose") != null && !jsonObj.get("purpose").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `purpose` to be an array in the JSON string but got `%s`", jsonObj.get("purpose").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PasswordInterServerAuthenticationInfoResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PasswordInterServerAuthenticationInfoResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PasswordInterServerAuthenticationInfoResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PasswordInterServerAuthenticationInfoResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<PasswordInterServerAuthenticationInfoResponseAllOf>() {
           @Override
           public void write(JsonWriter out, PasswordInterServerAuthenticationInfoResponseAllOf value) throws IOException {
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
           public PasswordInterServerAuthenticationInfoResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PasswordInterServerAuthenticationInfoResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PasswordInterServerAuthenticationInfoResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PasswordInterServerAuthenticationInfoResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to PasswordInterServerAuthenticationInfoResponseAllOf
  */
  public static PasswordInterServerAuthenticationInfoResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PasswordInterServerAuthenticationInfoResponseAllOf.class);
  }

 /**
  * Convert an instance of PasswordInterServerAuthenticationInfoResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

