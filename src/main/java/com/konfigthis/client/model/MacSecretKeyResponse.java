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
import com.konfigthis.client.model.EnummacSecretKeySchemaUrn;
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
 * MacSecretKeyResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MacSecretKeyResponse {
  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnummacSecretKeySchemaUrn> schemas = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MAC_ALGORITHM_NAME = "macAlgorithmName";
  @SerializedName(SERIALIZED_NAME_MAC_ALGORITHM_NAME)
  private String macAlgorithmName;

  public static final String SERIALIZED_NAME_KEY_I_D = "keyID";
  @SerializedName(SERIALIZED_NAME_KEY_I_D)
  private String keyID;

  public static final String SERIALIZED_NAME_IS_COMPROMISED = "isCompromised";
  @SerializedName(SERIALIZED_NAME_IS_COMPROMISED)
  private Boolean isCompromised;

  public static final String SERIALIZED_NAME_SYMMETRIC_KEY = "symmetricKey";
  @SerializedName(SERIALIZED_NAME_SYMMETRIC_KEY)
  private List<String> symmetricKey = null;

  public static final String SERIALIZED_NAME_KEY_LENGTH_BITS = "keyLengthBits";
  @SerializedName(SERIALIZED_NAME_KEY_LENGTH_BITS)
  private Integer keyLengthBits;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public MacSecretKeyResponse() {
  }

  public MacSecretKeyResponse schemas(List<EnummacSecretKeySchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public MacSecretKeyResponse addSchemasItem(EnummacSecretKeySchemaUrn schemasItem) {
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

  public List<EnummacSecretKeySchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnummacSecretKeySchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public MacSecretKeyResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Mac Secret Key
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the Mac Secret Key")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public MacSecretKeyResponse macAlgorithmName(String macAlgorithmName) {
    
    
    
    
    this.macAlgorithmName = macAlgorithmName;
    return this;
  }

   /**
   * The algorithm name used to generate this MAC key, e.g. HmacMD5, HmacSHA1, HMacSHA256, etc.
   * @return macAlgorithmName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The algorithm name used to generate this MAC key, e.g. HmacMD5, HmacSHA1, HMacSHA256, etc.")

  public String getMacAlgorithmName() {
    return macAlgorithmName;
  }


  public void setMacAlgorithmName(String macAlgorithmName) {
    
    
    
    this.macAlgorithmName = macAlgorithmName;
  }


  public MacSecretKeyResponse keyID(String keyID) {
    
    
    
    
    this.keyID = keyID;
    return this;
  }

   /**
   * The unique system-generated identifier for the Secret Key.
   * @return keyID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique system-generated identifier for the Secret Key.")

  public String getKeyID() {
    return keyID;
  }


  public void setKeyID(String keyID) {
    
    
    
    this.keyID = keyID;
  }


  public MacSecretKeyResponse isCompromised(Boolean isCompromised) {
    
    
    
    
    this.isCompromised = isCompromised;
    return this;
  }

   /**
   * If the key is compromised, an administrator may set this flag to immediately trigger the creation of a new secret key. After the new key is generated, the value of this property will be reset to false.
   * @return isCompromised
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the key is compromised, an administrator may set this flag to immediately trigger the creation of a new secret key. After the new key is generated, the value of this property will be reset to false.")

  public Boolean getIsCompromised() {
    return isCompromised;
  }


  public void setIsCompromised(Boolean isCompromised) {
    
    
    
    this.isCompromised = isCompromised;
  }


  public MacSecretKeyResponse symmetricKey(List<String> symmetricKey) {
    
    
    
    
    this.symmetricKey = symmetricKey;
    return this;
  }

  public MacSecretKeyResponse addSymmetricKeyItem(String symmetricKeyItem) {
    if (this.symmetricKey == null) {
      this.symmetricKey = new ArrayList<>();
    }
    this.symmetricKey.add(symmetricKeyItem);
    return this;
  }

   /**
   * The symmetric key that is used for both encryption of plain text and decryption of cipher text. This stores the secret key for each server instance encrypted with that server&#39;s inter-server certificate.
   * @return symmetricKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The symmetric key that is used for both encryption of plain text and decryption of cipher text. This stores the secret key for each server instance encrypted with that server's inter-server certificate.")

  public List<String> getSymmetricKey() {
    return symmetricKey;
  }


  public void setSymmetricKey(List<String> symmetricKey) {
    
    
    
    this.symmetricKey = symmetricKey;
  }


  public MacSecretKeyResponse keyLengthBits(Integer keyLengthBits) {
    
    
    
    
    this.keyLengthBits = keyLengthBits;
    return this;
  }

   /**
   * The length of the key in bits.
   * @return keyLengthBits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The length of the key in bits.")

  public Integer getKeyLengthBits() {
    return keyLengthBits;
  }


  public void setKeyLengthBits(Integer keyLengthBits) {
    
    
    
    this.keyLengthBits = keyLengthBits;
  }


  public MacSecretKeyResponse meta(MetaMeta meta) {
    
    
    
    
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


  public MacSecretKeyResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the MacSecretKeyResponse instance itself
   */
  public MacSecretKeyResponse putAdditionalProperty(String key, Object value) {
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
    MacSecretKeyResponse macSecretKeyResponse = (MacSecretKeyResponse) o;
    return Objects.equals(this.schemas, macSecretKeyResponse.schemas) &&
        Objects.equals(this.id, macSecretKeyResponse.id) &&
        Objects.equals(this.macAlgorithmName, macSecretKeyResponse.macAlgorithmName) &&
        Objects.equals(this.keyID, macSecretKeyResponse.keyID) &&
        Objects.equals(this.isCompromised, macSecretKeyResponse.isCompromised) &&
        Objects.equals(this.symmetricKey, macSecretKeyResponse.symmetricKey) &&
        Objects.equals(this.keyLengthBits, macSecretKeyResponse.keyLengthBits) &&
        Objects.equals(this.meta, macSecretKeyResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, macSecretKeyResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, macSecretKeyResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, id, macAlgorithmName, keyID, isCompromised, symmetricKey, keyLengthBits, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MacSecretKeyResponse {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    macAlgorithmName: ").append(toIndentedString(macAlgorithmName)).append("\n");
    sb.append("    keyID: ").append(toIndentedString(keyID)).append("\n");
    sb.append("    isCompromised: ").append(toIndentedString(isCompromised)).append("\n");
    sb.append("    symmetricKey: ").append(toIndentedString(symmetricKey)).append("\n");
    sb.append("    keyLengthBits: ").append(toIndentedString(keyLengthBits)).append("\n");
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
    openapiFields.add("schemas");
    openapiFields.add("id");
    openapiFields.add("macAlgorithmName");
    openapiFields.add("keyID");
    openapiFields.add("isCompromised");
    openapiFields.add("symmetricKey");
    openapiFields.add("keyLengthBits");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("keyID");
    openapiRequiredFields.add("keyLengthBits");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MacSecretKeyResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MacSecretKeyResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MacSecretKeyResponse is not found in the empty JSON string", MacSecretKeyResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MacSecretKeyResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("schemas") != null && !jsonObj.get("schemas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemas` to be an array in the JSON string but got `%s`", jsonObj.get("schemas").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("macAlgorithmName") != null && !jsonObj.get("macAlgorithmName").isJsonNull()) && !jsonObj.get("macAlgorithmName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `macAlgorithmName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("macAlgorithmName").toString()));
      }
      if (!jsonObj.get("keyID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyID").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("symmetricKey") != null && !jsonObj.get("symmetricKey").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `symmetricKey` to be an array in the JSON string but got `%s`", jsonObj.get("symmetricKey").toString()));
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
       if (!MacSecretKeyResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MacSecretKeyResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MacSecretKeyResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MacSecretKeyResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<MacSecretKeyResponse>() {
           @Override
           public void write(JsonWriter out, MacSecretKeyResponse value) throws IOException {
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
           public MacSecretKeyResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MacSecretKeyResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MacSecretKeyResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MacSecretKeyResponse
  * @throws IOException if the JSON string is invalid with respect to MacSecretKeyResponse
  */
  public static MacSecretKeyResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MacSecretKeyResponse.class);
  }

 /**
  * Convert an instance of MacSecretKeyResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

