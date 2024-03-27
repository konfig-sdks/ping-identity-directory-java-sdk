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
import com.konfigthis.client.model.Enumargon2idPasswordStorageSchemeSchemaUrn;
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
 * Argon2idPasswordStorageSchemeResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Argon2idPasswordStorageSchemeResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<Enumargon2idPasswordStorageSchemeSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_ITERATION_COUNT = "iterationCount";
  @SerializedName(SERIALIZED_NAME_ITERATION_COUNT)
  private Integer iterationCount;

  public static final String SERIALIZED_NAME_PARALLELISM_FACTOR = "parallelismFactor";
  @SerializedName(SERIALIZED_NAME_PARALLELISM_FACTOR)
  private Integer parallelismFactor;

  public static final String SERIALIZED_NAME_MEMORY_USAGE_KB = "memoryUsageKb";
  @SerializedName(SERIALIZED_NAME_MEMORY_USAGE_KB)
  private Integer memoryUsageKb;

  public static final String SERIALIZED_NAME_SALT_LENGTH_BYTES = "saltLengthBytes";
  @SerializedName(SERIALIZED_NAME_SALT_LENGTH_BYTES)
  private Integer saltLengthBytes;

  public static final String SERIALIZED_NAME_DERIVED_KEY_LENGTH_BYTES = "derivedKeyLengthBytes";
  @SerializedName(SERIALIZED_NAME_DERIVED_KEY_LENGTH_BYTES)
  private Integer derivedKeyLengthBytes;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public Argon2idPasswordStorageSchemeResponse() {
  }

  public Argon2idPasswordStorageSchemeResponse id(String id) {
    
    
    
    
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


  public Argon2idPasswordStorageSchemeResponse description(String description) {
    
    
    
    
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


  public Argon2idPasswordStorageSchemeResponse schemas(List<Enumargon2idPasswordStorageSchemeSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public Argon2idPasswordStorageSchemeResponse addSchemasItem(Enumargon2idPasswordStorageSchemeSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Enumargon2idPasswordStorageSchemeSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<Enumargon2idPasswordStorageSchemeSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public Argon2idPasswordStorageSchemeResponse iterationCount(Integer iterationCount) {
    
    
    
    
    this.iterationCount = iterationCount;
    return this;
  }

   /**
   * The number of rounds of cryptographic processing required in the course of encoding each password.
   * @return iterationCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of rounds of cryptographic processing required in the course of encoding each password.")

  public Integer getIterationCount() {
    return iterationCount;
  }


  public void setIterationCount(Integer iterationCount) {
    
    
    
    this.iterationCount = iterationCount;
  }


  public Argon2idPasswordStorageSchemeResponse parallelismFactor(Integer parallelismFactor) {
    
    
    
    
    this.parallelismFactor = parallelismFactor;
    return this;
  }

   /**
   * The number of concurrent threads that will be used in the course of encoding each password.
   * @return parallelismFactor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of concurrent threads that will be used in the course of encoding each password.")

  public Integer getParallelismFactor() {
    return parallelismFactor;
  }


  public void setParallelismFactor(Integer parallelismFactor) {
    
    
    
    this.parallelismFactor = parallelismFactor;
  }


  public Argon2idPasswordStorageSchemeResponse memoryUsageKb(Integer memoryUsageKb) {
    
    
    
    
    this.memoryUsageKb = memoryUsageKb;
    return this;
  }

   /**
   * The number of kilobytes of memory that must be used in the course of encoding each password.
   * @return memoryUsageKb
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of kilobytes of memory that must be used in the course of encoding each password.")

  public Integer getMemoryUsageKb() {
    return memoryUsageKb;
  }


  public void setMemoryUsageKb(Integer memoryUsageKb) {
    
    
    
    this.memoryUsageKb = memoryUsageKb;
  }


  public Argon2idPasswordStorageSchemeResponse saltLengthBytes(Integer saltLengthBytes) {
    
    
    
    
    this.saltLengthBytes = saltLengthBytes;
    return this;
  }

   /**
   * The number of bytes to use for the generated salt.
   * @return saltLengthBytes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of bytes to use for the generated salt.")

  public Integer getSaltLengthBytes() {
    return saltLengthBytes;
  }


  public void setSaltLengthBytes(Integer saltLengthBytes) {
    
    
    
    this.saltLengthBytes = saltLengthBytes;
  }


  public Argon2idPasswordStorageSchemeResponse derivedKeyLengthBytes(Integer derivedKeyLengthBytes) {
    
    
    
    
    this.derivedKeyLengthBytes = derivedKeyLengthBytes;
    return this;
  }

   /**
   * The number of bytes to use for the derived key. The value must be greater than or equal to 8 and less than or equal to 512.
   * @return derivedKeyLengthBytes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of bytes to use for the derived key. The value must be greater than or equal to 8 and less than or equal to 512.")

  public Integer getDerivedKeyLengthBytes() {
    return derivedKeyLengthBytes;
  }


  public void setDerivedKeyLengthBytes(Integer derivedKeyLengthBytes) {
    
    
    
    this.derivedKeyLengthBytes = derivedKeyLengthBytes;
  }


  public Argon2idPasswordStorageSchemeResponse enabled(Boolean enabled) {
    
    
    
    
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


  public Argon2idPasswordStorageSchemeResponse meta(MetaMeta meta) {
    
    
    
    
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


  public Argon2idPasswordStorageSchemeResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the Argon2idPasswordStorageSchemeResponse instance itself
   */
  public Argon2idPasswordStorageSchemeResponse putAdditionalProperty(String key, Object value) {
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
    Argon2idPasswordStorageSchemeResponse argon2idPasswordStorageSchemeResponse = (Argon2idPasswordStorageSchemeResponse) o;
    return Objects.equals(this.id, argon2idPasswordStorageSchemeResponse.id) &&
        Objects.equals(this.description, argon2idPasswordStorageSchemeResponse.description) &&
        Objects.equals(this.schemas, argon2idPasswordStorageSchemeResponse.schemas) &&
        Objects.equals(this.iterationCount, argon2idPasswordStorageSchemeResponse.iterationCount) &&
        Objects.equals(this.parallelismFactor, argon2idPasswordStorageSchemeResponse.parallelismFactor) &&
        Objects.equals(this.memoryUsageKb, argon2idPasswordStorageSchemeResponse.memoryUsageKb) &&
        Objects.equals(this.saltLengthBytes, argon2idPasswordStorageSchemeResponse.saltLengthBytes) &&
        Objects.equals(this.derivedKeyLengthBytes, argon2idPasswordStorageSchemeResponse.derivedKeyLengthBytes) &&
        Objects.equals(this.enabled, argon2idPasswordStorageSchemeResponse.enabled) &&
        Objects.equals(this.meta, argon2idPasswordStorageSchemeResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, argon2idPasswordStorageSchemeResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, argon2idPasswordStorageSchemeResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, schemas, iterationCount, parallelismFactor, memoryUsageKb, saltLengthBytes, derivedKeyLengthBytes, enabled, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Argon2idPasswordStorageSchemeResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    iterationCount: ").append(toIndentedString(iterationCount)).append("\n");
    sb.append("    parallelismFactor: ").append(toIndentedString(parallelismFactor)).append("\n");
    sb.append("    memoryUsageKb: ").append(toIndentedString(memoryUsageKb)).append("\n");
    sb.append("    saltLengthBytes: ").append(toIndentedString(saltLengthBytes)).append("\n");
    sb.append("    derivedKeyLengthBytes: ").append(toIndentedString(derivedKeyLengthBytes)).append("\n");
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
    openapiFields.add("iterationCount");
    openapiFields.add("parallelismFactor");
    openapiFields.add("memoryUsageKb");
    openapiFields.add("saltLengthBytes");
    openapiFields.add("derivedKeyLengthBytes");
    openapiFields.add("enabled");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("iterationCount");
    openapiRequiredFields.add("parallelismFactor");
    openapiRequiredFields.add("memoryUsageKb");
    openapiRequiredFields.add("saltLengthBytes");
    openapiRequiredFields.add("derivedKeyLengthBytes");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Argon2idPasswordStorageSchemeResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Argon2idPasswordStorageSchemeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Argon2idPasswordStorageSchemeResponse is not found in the empty JSON string", Argon2idPasswordStorageSchemeResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Argon2idPasswordStorageSchemeResponse.openapiRequiredFields) {
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
       if (!Argon2idPasswordStorageSchemeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Argon2idPasswordStorageSchemeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Argon2idPasswordStorageSchemeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Argon2idPasswordStorageSchemeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Argon2idPasswordStorageSchemeResponse>() {
           @Override
           public void write(JsonWriter out, Argon2idPasswordStorageSchemeResponse value) throws IOException {
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
           public Argon2idPasswordStorageSchemeResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Argon2idPasswordStorageSchemeResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Argon2idPasswordStorageSchemeResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Argon2idPasswordStorageSchemeResponse
  * @throws IOException if the JSON string is invalid with respect to Argon2idPasswordStorageSchemeResponse
  */
  public static Argon2idPasswordStorageSchemeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Argon2idPasswordStorageSchemeResponse.class);
  }

 /**
  * Convert an instance of Argon2idPasswordStorageSchemeResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

