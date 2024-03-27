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
import com.konfigthis.client.model.EnumpasswordStorageSchemeDigestAlgorithmProp;
import com.konfigthis.client.model.Enumpbkdf2PasswordStorageSchemeSchemaUrn;
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
 * Pbkdf2PasswordStorageSchemeResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Pbkdf2PasswordStorageSchemeResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<Enumpbkdf2PasswordStorageSchemeSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_DIGEST_ALGORITHM = "digestAlgorithm";
  @SerializedName(SERIALIZED_NAME_DIGEST_ALGORITHM)
  private EnumpasswordStorageSchemeDigestAlgorithmProp digestAlgorithm;

  public static final String SERIALIZED_NAME_ITERATION_COUNT = "iterationCount";
  @SerializedName(SERIALIZED_NAME_ITERATION_COUNT)
  private Integer iterationCount;

  public static final String SERIALIZED_NAME_SALT_LENGTH_BYTES = "saltLengthBytes";
  @SerializedName(SERIALIZED_NAME_SALT_LENGTH_BYTES)
  private Integer saltLengthBytes;

  public static final String SERIALIZED_NAME_DERIVED_KEY_LENGTH_BYTES = "derivedKeyLengthBytes";
  @SerializedName(SERIALIZED_NAME_DERIVED_KEY_LENGTH_BYTES)
  private Integer derivedKeyLengthBytes;

  public static final String SERIALIZED_NAME_MAX_PASSWORD_LENGTH = "maxPasswordLength";
  @SerializedName(SERIALIZED_NAME_MAX_PASSWORD_LENGTH)
  private Integer maxPasswordLength;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public Pbkdf2PasswordStorageSchemeResponse() {
  }

  public Pbkdf2PasswordStorageSchemeResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Password Storage Scheme
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the Password Storage Scheme")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public Pbkdf2PasswordStorageSchemeResponse description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Password Storage Scheme
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Password Storage Scheme")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public Pbkdf2PasswordStorageSchemeResponse schemas(List<Enumpbkdf2PasswordStorageSchemeSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public Pbkdf2PasswordStorageSchemeResponse addSchemasItem(Enumpbkdf2PasswordStorageSchemeSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Enumpbkdf2PasswordStorageSchemeSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<Enumpbkdf2PasswordStorageSchemeSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public Pbkdf2PasswordStorageSchemeResponse digestAlgorithm(EnumpasswordStorageSchemeDigestAlgorithmProp digestAlgorithm) {
    
    
    
    
    this.digestAlgorithm = digestAlgorithm;
    return this;
  }

   /**
   * Get digestAlgorithm
   * @return digestAlgorithm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumpasswordStorageSchemeDigestAlgorithmProp getDigestAlgorithm() {
    return digestAlgorithm;
  }


  public void setDigestAlgorithm(EnumpasswordStorageSchemeDigestAlgorithmProp digestAlgorithm) {
    
    
    
    this.digestAlgorithm = digestAlgorithm;
  }


  public Pbkdf2PasswordStorageSchemeResponse iterationCount(Integer iterationCount) {
    
    
    
    
    this.iterationCount = iterationCount;
    return this;
  }

   /**
   * Specifies the number of iterations to use when encoding passwords. The value must be greater than or equal to 1000.
   * @return iterationCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the number of iterations to use when encoding passwords. The value must be greater than or equal to 1000.")

  public Integer getIterationCount() {
    return iterationCount;
  }


  public void setIterationCount(Integer iterationCount) {
    
    
    
    this.iterationCount = iterationCount;
  }


  public Pbkdf2PasswordStorageSchemeResponse saltLengthBytes(Integer saltLengthBytes) {
    
    
    
    
    this.saltLengthBytes = saltLengthBytes;
    return this;
  }

   /**
   * Specifies the number of bytes to use for the generated salt. The value must be greater than or equal to 8.
   * @return saltLengthBytes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the number of bytes to use for the generated salt. The value must be greater than or equal to 8.")

  public Integer getSaltLengthBytes() {
    return saltLengthBytes;
  }


  public void setSaltLengthBytes(Integer saltLengthBytes) {
    
    
    
    this.saltLengthBytes = saltLengthBytes;
  }


  public Pbkdf2PasswordStorageSchemeResponse derivedKeyLengthBytes(Integer derivedKeyLengthBytes) {
    
    
    
    
    this.derivedKeyLengthBytes = derivedKeyLengthBytes;
    return this;
  }

   /**
   * Specifies the number of bytes to use for the derived key. The value must be greater than or equal to 8.
   * @return derivedKeyLengthBytes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the number of bytes to use for the derived key. The value must be greater than or equal to 8.")

  public Integer getDerivedKeyLengthBytes() {
    return derivedKeyLengthBytes;
  }


  public void setDerivedKeyLengthBytes(Integer derivedKeyLengthBytes) {
    
    
    
    this.derivedKeyLengthBytes = derivedKeyLengthBytes;
  }


  public Pbkdf2PasswordStorageSchemeResponse maxPasswordLength(Integer maxPasswordLength) {
    
    
    
    
    this.maxPasswordLength = maxPasswordLength;
    return this;
  }

   /**
   * Specifies the maximum allowed length, in bytes, for passwords encoded with this scheme, which can help mitigate denial of service attacks from clients that attempt to bind with very long passwords.
   * @return maxPasswordLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the maximum allowed length, in bytes, for passwords encoded with this scheme, which can help mitigate denial of service attacks from clients that attempt to bind with very long passwords.")

  public Integer getMaxPasswordLength() {
    return maxPasswordLength;
  }


  public void setMaxPasswordLength(Integer maxPasswordLength) {
    
    
    
    this.maxPasswordLength = maxPasswordLength;
  }


  public Pbkdf2PasswordStorageSchemeResponse enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the Password Storage Scheme is enabled for use.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether the Password Storage Scheme is enabled for use.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public Pbkdf2PasswordStorageSchemeResponse meta(MetaMeta meta) {
    
    
    
    
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


  public Pbkdf2PasswordStorageSchemeResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the Pbkdf2PasswordStorageSchemeResponse instance itself
   */
  public Pbkdf2PasswordStorageSchemeResponse putAdditionalProperty(String key, Object value) {
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
    Pbkdf2PasswordStorageSchemeResponse pbkdf2PasswordStorageSchemeResponse = (Pbkdf2PasswordStorageSchemeResponse) o;
    return Objects.equals(this.id, pbkdf2PasswordStorageSchemeResponse.id) &&
        Objects.equals(this.description, pbkdf2PasswordStorageSchemeResponse.description) &&
        Objects.equals(this.schemas, pbkdf2PasswordStorageSchemeResponse.schemas) &&
        Objects.equals(this.digestAlgorithm, pbkdf2PasswordStorageSchemeResponse.digestAlgorithm) &&
        Objects.equals(this.iterationCount, pbkdf2PasswordStorageSchemeResponse.iterationCount) &&
        Objects.equals(this.saltLengthBytes, pbkdf2PasswordStorageSchemeResponse.saltLengthBytes) &&
        Objects.equals(this.derivedKeyLengthBytes, pbkdf2PasswordStorageSchemeResponse.derivedKeyLengthBytes) &&
        Objects.equals(this.maxPasswordLength, pbkdf2PasswordStorageSchemeResponse.maxPasswordLength) &&
        Objects.equals(this.enabled, pbkdf2PasswordStorageSchemeResponse.enabled) &&
        Objects.equals(this.meta, pbkdf2PasswordStorageSchemeResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, pbkdf2PasswordStorageSchemeResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, pbkdf2PasswordStorageSchemeResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, schemas, digestAlgorithm, iterationCount, saltLengthBytes, derivedKeyLengthBytes, maxPasswordLength, enabled, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pbkdf2PasswordStorageSchemeResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    digestAlgorithm: ").append(toIndentedString(digestAlgorithm)).append("\n");
    sb.append("    iterationCount: ").append(toIndentedString(iterationCount)).append("\n");
    sb.append("    saltLengthBytes: ").append(toIndentedString(saltLengthBytes)).append("\n");
    sb.append("    derivedKeyLengthBytes: ").append(toIndentedString(derivedKeyLengthBytes)).append("\n");
    sb.append("    maxPasswordLength: ").append(toIndentedString(maxPasswordLength)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("digestAlgorithm");
    openapiFields.add("iterationCount");
    openapiFields.add("saltLengthBytes");
    openapiFields.add("derivedKeyLengthBytes");
    openapiFields.add("maxPasswordLength");
    openapiFields.add("enabled");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("iterationCount");
    openapiRequiredFields.add("saltLengthBytes");
    openapiRequiredFields.add("derivedKeyLengthBytes");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Pbkdf2PasswordStorageSchemeResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Pbkdf2PasswordStorageSchemeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Pbkdf2PasswordStorageSchemeResponse is not found in the empty JSON string", Pbkdf2PasswordStorageSchemeResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Pbkdf2PasswordStorageSchemeResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
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
       if (!Pbkdf2PasswordStorageSchemeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Pbkdf2PasswordStorageSchemeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Pbkdf2PasswordStorageSchemeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Pbkdf2PasswordStorageSchemeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Pbkdf2PasswordStorageSchemeResponse>() {
           @Override
           public void write(JsonWriter out, Pbkdf2PasswordStorageSchemeResponse value) throws IOException {
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
           public Pbkdf2PasswordStorageSchemeResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Pbkdf2PasswordStorageSchemeResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Pbkdf2PasswordStorageSchemeResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Pbkdf2PasswordStorageSchemeResponse
  * @throws IOException if the JSON string is invalid with respect to Pbkdf2PasswordStorageSchemeResponse
  */
  public static Pbkdf2PasswordStorageSchemeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Pbkdf2PasswordStorageSchemeResponse.class);
  }

 /**
  * Convert an instance of Pbkdf2PasswordStorageSchemeResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

