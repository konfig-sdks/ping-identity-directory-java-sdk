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
import com.konfigthis.client.model.EnumappRoleVaultAuthenticationMethodSchemaUrn;
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
 * AddAppRoleVaultAuthenticationMethodRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddAppRoleVaultAuthenticationMethodRequest {
  public static final String SERIALIZED_NAME_METHOD_NAME = "methodName";
  @SerializedName(SERIALIZED_NAME_METHOD_NAME)
  private String methodName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumappRoleVaultAuthenticationMethodSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_VAULT_ROLE_I_D = "vaultRoleID";
  @SerializedName(SERIALIZED_NAME_VAULT_ROLE_I_D)
  private String vaultRoleID;

  public static final String SERIALIZED_NAME_VAULT_SECRET_I_D = "vaultSecretID";
  @SerializedName(SERIALIZED_NAME_VAULT_SECRET_I_D)
  private String vaultSecretID;

  public static final String SERIALIZED_NAME_LOGIN_MECHANISM_NAME = "loginMechanismName";
  @SerializedName(SERIALIZED_NAME_LOGIN_MECHANISM_NAME)
  private String loginMechanismName;

  public AddAppRoleVaultAuthenticationMethodRequest() {
  }

  public AddAppRoleVaultAuthenticationMethodRequest methodName(String methodName) {
    
    
    
    
    this.methodName = methodName;
    return this;
  }

   /**
   * Name of the new Vault Authentication Method
   * @return methodName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the new Vault Authentication Method")

  public String getMethodName() {
    return methodName;
  }


  public void setMethodName(String methodName) {
    
    
    
    this.methodName = methodName;
  }


  public AddAppRoleVaultAuthenticationMethodRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Vault Authentication Method
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Vault Authentication Method")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AddAppRoleVaultAuthenticationMethodRequest schemas(List<EnumappRoleVaultAuthenticationMethodSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddAppRoleVaultAuthenticationMethodRequest addSchemasItem(EnumappRoleVaultAuthenticationMethodSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumappRoleVaultAuthenticationMethodSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumappRoleVaultAuthenticationMethodSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddAppRoleVaultAuthenticationMethodRequest vaultRoleID(String vaultRoleID) {
    
    
    
    
    this.vaultRoleID = vaultRoleID;
    return this;
  }

   /**
   * The role ID for the AppRole to authenticate.
   * @return vaultRoleID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The role ID for the AppRole to authenticate.")

  public String getVaultRoleID() {
    return vaultRoleID;
  }


  public void setVaultRoleID(String vaultRoleID) {
    
    
    
    this.vaultRoleID = vaultRoleID;
  }


  public AddAppRoleVaultAuthenticationMethodRequest vaultSecretID(String vaultSecretID) {
    
    
    
    
    this.vaultSecretID = vaultSecretID;
    return this;
  }

   /**
   * The secret ID for the AppRole to authenticate.
   * @return vaultSecretID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The secret ID for the AppRole to authenticate.")

  public String getVaultSecretID() {
    return vaultSecretID;
  }


  public void setVaultSecretID(String vaultSecretID) {
    
    
    
    this.vaultSecretID = vaultSecretID;
  }


  public AddAppRoleVaultAuthenticationMethodRequest loginMechanismName(String loginMechanismName) {
    
    
    
    
    this.loginMechanismName = loginMechanismName;
    return this;
  }

   /**
   * The name used when enabling the desired AppRole authentication mechanism in the Vault server.
   * @return loginMechanismName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name used when enabling the desired AppRole authentication mechanism in the Vault server.")

  public String getLoginMechanismName() {
    return loginMechanismName;
  }


  public void setLoginMechanismName(String loginMechanismName) {
    
    
    
    this.loginMechanismName = loginMechanismName;
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
   * @return the AddAppRoleVaultAuthenticationMethodRequest instance itself
   */
  public AddAppRoleVaultAuthenticationMethodRequest putAdditionalProperty(String key, Object value) {
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
    AddAppRoleVaultAuthenticationMethodRequest addAppRoleVaultAuthenticationMethodRequest = (AddAppRoleVaultAuthenticationMethodRequest) o;
    return Objects.equals(this.methodName, addAppRoleVaultAuthenticationMethodRequest.methodName) &&
        Objects.equals(this.description, addAppRoleVaultAuthenticationMethodRequest.description) &&
        Objects.equals(this.schemas, addAppRoleVaultAuthenticationMethodRequest.schemas) &&
        Objects.equals(this.vaultRoleID, addAppRoleVaultAuthenticationMethodRequest.vaultRoleID) &&
        Objects.equals(this.vaultSecretID, addAppRoleVaultAuthenticationMethodRequest.vaultSecretID) &&
        Objects.equals(this.loginMechanismName, addAppRoleVaultAuthenticationMethodRequest.loginMechanismName)&&
        Objects.equals(this.additionalProperties, addAppRoleVaultAuthenticationMethodRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methodName, description, schemas, vaultRoleID, vaultSecretID, loginMechanismName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddAppRoleVaultAuthenticationMethodRequest {\n");
    sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    vaultRoleID: ").append(toIndentedString(vaultRoleID)).append("\n");
    sb.append("    vaultSecretID: ").append(toIndentedString(vaultSecretID)).append("\n");
    sb.append("    loginMechanismName: ").append(toIndentedString(loginMechanismName)).append("\n");
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
    openapiFields.add("methodName");
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("vaultRoleID");
    openapiFields.add("vaultSecretID");
    openapiFields.add("loginMechanismName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("methodName");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("vaultRoleID");
    openapiRequiredFields.add("vaultSecretID");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddAppRoleVaultAuthenticationMethodRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddAppRoleVaultAuthenticationMethodRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddAppRoleVaultAuthenticationMethodRequest is not found in the empty JSON string", AddAppRoleVaultAuthenticationMethodRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddAppRoleVaultAuthenticationMethodRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("methodName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `methodName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("methodName").toString()));
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
      if (!jsonObj.get("vaultRoleID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vaultRoleID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vaultRoleID").toString()));
      }
      if (!jsonObj.get("vaultSecretID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vaultSecretID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vaultSecretID").toString()));
      }
      if ((jsonObj.get("loginMechanismName") != null && !jsonObj.get("loginMechanismName").isJsonNull()) && !jsonObj.get("loginMechanismName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loginMechanismName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loginMechanismName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddAppRoleVaultAuthenticationMethodRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddAppRoleVaultAuthenticationMethodRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddAppRoleVaultAuthenticationMethodRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddAppRoleVaultAuthenticationMethodRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddAppRoleVaultAuthenticationMethodRequest>() {
           @Override
           public void write(JsonWriter out, AddAppRoleVaultAuthenticationMethodRequest value) throws IOException {
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
           public AddAppRoleVaultAuthenticationMethodRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddAppRoleVaultAuthenticationMethodRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddAppRoleVaultAuthenticationMethodRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddAppRoleVaultAuthenticationMethodRequest
  * @throws IOException if the JSON string is invalid with respect to AddAppRoleVaultAuthenticationMethodRequest
  */
  public static AddAppRoleVaultAuthenticationMethodRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddAppRoleVaultAuthenticationMethodRequest.class);
  }

 /**
  * Convert an instance of AddAppRoleVaultAuthenticationMethodRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

