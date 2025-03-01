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
import com.konfigthis.client.model.EnumamazonSecretsManagerCipherStreamProviderSchemaUrn;
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
 * AmazonSecretsManagerCipherStreamProviderResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AmazonSecretsManagerCipherStreamProviderResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumamazonSecretsManagerCipherStreamProviderSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_AWS_EXTERNAL_SERVER = "awsExternalServer";
  @SerializedName(SERIALIZED_NAME_AWS_EXTERNAL_SERVER)
  private String awsExternalServer;

  public static final String SERIALIZED_NAME_SECRET_I_D = "secretID";
  @SerializedName(SERIALIZED_NAME_SECRET_I_D)
  private String secretID;

  public static final String SERIALIZED_NAME_SECRET_FIELD_NAME = "secretFieldName";
  @SerializedName(SERIALIZED_NAME_SECRET_FIELD_NAME)
  private String secretFieldName;

  public static final String SERIALIZED_NAME_SECRET_VERSION_I_D = "secretVersionID";
  @SerializedName(SERIALIZED_NAME_SECRET_VERSION_I_D)
  private String secretVersionID;

  public static final String SERIALIZED_NAME_SECRET_VERSION_STAGE = "secretVersionStage";
  @SerializedName(SERIALIZED_NAME_SECRET_VERSION_STAGE)
  private String secretVersionStage;

  public static final String SERIALIZED_NAME_ENCRYPTION_METADATA_FILE = "encryptionMetadataFile";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_METADATA_FILE)
  private String encryptionMetadataFile;

  public static final String SERIALIZED_NAME_ITERATION_COUNT = "iterationCount";
  @SerializedName(SERIALIZED_NAME_ITERATION_COUNT)
  private Integer iterationCount;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public AmazonSecretsManagerCipherStreamProviderResponse() {
  }

  public AmazonSecretsManagerCipherStreamProviderResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Cipher Stream Provider
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the Cipher Stream Provider")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public AmazonSecretsManagerCipherStreamProviderResponse description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Cipher Stream Provider
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Cipher Stream Provider")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AmazonSecretsManagerCipherStreamProviderResponse schemas(List<EnumamazonSecretsManagerCipherStreamProviderSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AmazonSecretsManagerCipherStreamProviderResponse addSchemasItem(EnumamazonSecretsManagerCipherStreamProviderSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumamazonSecretsManagerCipherStreamProviderSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumamazonSecretsManagerCipherStreamProviderSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AmazonSecretsManagerCipherStreamProviderResponse awsExternalServer(String awsExternalServer) {
    
    
    
    
    this.awsExternalServer = awsExternalServer;
    return this;
  }

   /**
   * The external server with information to use when interacting with the AWS Secrets Manager.
   * @return awsExternalServer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The external server with information to use when interacting with the AWS Secrets Manager.")

  public String getAwsExternalServer() {
    return awsExternalServer;
  }


  public void setAwsExternalServer(String awsExternalServer) {
    
    
    
    this.awsExternalServer = awsExternalServer;
  }


  public AmazonSecretsManagerCipherStreamProviderResponse secretID(String secretID) {
    
    
    
    
    this.secretID = secretID;
    return this;
  }

   /**
   * The Amazon Resource Name (ARN) or the user-friendly name of the secret to be retrieved.
   * @return secretID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Amazon Resource Name (ARN) or the user-friendly name of the secret to be retrieved.")

  public String getSecretID() {
    return secretID;
  }


  public void setSecretID(String secretID) {
    
    
    
    this.secretID = secretID;
  }


  public AmazonSecretsManagerCipherStreamProviderResponse secretFieldName(String secretFieldName) {
    
    
    
    
    this.secretFieldName = secretFieldName;
    return this;
  }

   /**
   * The name of the JSON field whose value is the passphrase that will be used to generate the encryption key for protecting the contents of the encryption settings database.
   * @return secretFieldName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the JSON field whose value is the passphrase that will be used to generate the encryption key for protecting the contents of the encryption settings database.")

  public String getSecretFieldName() {
    return secretFieldName;
  }


  public void setSecretFieldName(String secretFieldName) {
    
    
    
    this.secretFieldName = secretFieldName;
  }


  public AmazonSecretsManagerCipherStreamProviderResponse secretVersionID(String secretVersionID) {
    
    
    
    
    this.secretVersionID = secretVersionID;
    return this;
  }

   /**
   * The unique identifier for the version of the secret to be retrieved.
   * @return secretVersionID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier for the version of the secret to be retrieved.")

  public String getSecretVersionID() {
    return secretVersionID;
  }


  public void setSecretVersionID(String secretVersionID) {
    
    
    
    this.secretVersionID = secretVersionID;
  }


  public AmazonSecretsManagerCipherStreamProviderResponse secretVersionStage(String secretVersionStage) {
    
    
    
    
    this.secretVersionStage = secretVersionStage;
    return this;
  }

   /**
   * The staging label for the version of the secret to be retrieved.
   * @return secretVersionStage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The staging label for the version of the secret to be retrieved.")

  public String getSecretVersionStage() {
    return secretVersionStage;
  }


  public void setSecretVersionStage(String secretVersionStage) {
    
    
    
    this.secretVersionStage = secretVersionStage;
  }


  public AmazonSecretsManagerCipherStreamProviderResponse encryptionMetadataFile(String encryptionMetadataFile) {
    
    
    
    
    this.encryptionMetadataFile = encryptionMetadataFile;
    return this;
  }

   /**
   * The path to a file that will hold metadata about the encryption performed by this Amazon Secrets Manager Cipher Stream Provider.
   * @return encryptionMetadataFile
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The path to a file that will hold metadata about the encryption performed by this Amazon Secrets Manager Cipher Stream Provider.")

  public String getEncryptionMetadataFile() {
    return encryptionMetadataFile;
  }


  public void setEncryptionMetadataFile(String encryptionMetadataFile) {
    
    
    
    this.encryptionMetadataFile = encryptionMetadataFile;
  }


  public AmazonSecretsManagerCipherStreamProviderResponse iterationCount(Integer iterationCount) {
    
    
    
    
    this.iterationCount = iterationCount;
    return this;
  }

   /**
   * The PBKDF2 iteration count that will be used when deriving the encryption key used to protect the encryption settings database.
   * @return iterationCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The PBKDF2 iteration count that will be used when deriving the encryption key used to protect the encryption settings database.")

  public Integer getIterationCount() {
    return iterationCount;
  }


  public void setIterationCount(Integer iterationCount) {
    
    
    
    this.iterationCount = iterationCount;
  }


  public AmazonSecretsManagerCipherStreamProviderResponse enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether this Cipher Stream Provider is enabled for use in the Directory Server.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether this Cipher Stream Provider is enabled for use in the Directory Server.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public AmazonSecretsManagerCipherStreamProviderResponse meta(MetaMeta meta) {
    
    
    
    
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


  public AmazonSecretsManagerCipherStreamProviderResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the AmazonSecretsManagerCipherStreamProviderResponse instance itself
   */
  public AmazonSecretsManagerCipherStreamProviderResponse putAdditionalProperty(String key, Object value) {
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
    AmazonSecretsManagerCipherStreamProviderResponse amazonSecretsManagerCipherStreamProviderResponse = (AmazonSecretsManagerCipherStreamProviderResponse) o;
    return Objects.equals(this.id, amazonSecretsManagerCipherStreamProviderResponse.id) &&
        Objects.equals(this.description, amazonSecretsManagerCipherStreamProviderResponse.description) &&
        Objects.equals(this.schemas, amazonSecretsManagerCipherStreamProviderResponse.schemas) &&
        Objects.equals(this.awsExternalServer, amazonSecretsManagerCipherStreamProviderResponse.awsExternalServer) &&
        Objects.equals(this.secretID, amazonSecretsManagerCipherStreamProviderResponse.secretID) &&
        Objects.equals(this.secretFieldName, amazonSecretsManagerCipherStreamProviderResponse.secretFieldName) &&
        Objects.equals(this.secretVersionID, amazonSecretsManagerCipherStreamProviderResponse.secretVersionID) &&
        Objects.equals(this.secretVersionStage, amazonSecretsManagerCipherStreamProviderResponse.secretVersionStage) &&
        Objects.equals(this.encryptionMetadataFile, amazonSecretsManagerCipherStreamProviderResponse.encryptionMetadataFile) &&
        Objects.equals(this.iterationCount, amazonSecretsManagerCipherStreamProviderResponse.iterationCount) &&
        Objects.equals(this.enabled, amazonSecretsManagerCipherStreamProviderResponse.enabled) &&
        Objects.equals(this.meta, amazonSecretsManagerCipherStreamProviderResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, amazonSecretsManagerCipherStreamProviderResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, amazonSecretsManagerCipherStreamProviderResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, schemas, awsExternalServer, secretID, secretFieldName, secretVersionID, secretVersionStage, encryptionMetadataFile, iterationCount, enabled, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmazonSecretsManagerCipherStreamProviderResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    awsExternalServer: ").append(toIndentedString(awsExternalServer)).append("\n");
    sb.append("    secretID: ").append(toIndentedString(secretID)).append("\n");
    sb.append("    secretFieldName: ").append(toIndentedString(secretFieldName)).append("\n");
    sb.append("    secretVersionID: ").append(toIndentedString(secretVersionID)).append("\n");
    sb.append("    secretVersionStage: ").append(toIndentedString(secretVersionStage)).append("\n");
    sb.append("    encryptionMetadataFile: ").append(toIndentedString(encryptionMetadataFile)).append("\n");
    sb.append("    iterationCount: ").append(toIndentedString(iterationCount)).append("\n");
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
    openapiFields.add("awsExternalServer");
    openapiFields.add("secretID");
    openapiFields.add("secretFieldName");
    openapiFields.add("secretVersionID");
    openapiFields.add("secretVersionStage");
    openapiFields.add("encryptionMetadataFile");
    openapiFields.add("iterationCount");
    openapiFields.add("enabled");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("awsExternalServer");
    openapiRequiredFields.add("secretID");
    openapiRequiredFields.add("secretFieldName");
    openapiRequiredFields.add("encryptionMetadataFile");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AmazonSecretsManagerCipherStreamProviderResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AmazonSecretsManagerCipherStreamProviderResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AmazonSecretsManagerCipherStreamProviderResponse is not found in the empty JSON string", AmazonSecretsManagerCipherStreamProviderResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AmazonSecretsManagerCipherStreamProviderResponse.openapiRequiredFields) {
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
      if (!jsonObj.get("awsExternalServer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `awsExternalServer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("awsExternalServer").toString()));
      }
      if (!jsonObj.get("secretID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secretID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secretID").toString()));
      }
      if (!jsonObj.get("secretFieldName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secretFieldName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secretFieldName").toString()));
      }
      if ((jsonObj.get("secretVersionID") != null && !jsonObj.get("secretVersionID").isJsonNull()) && !jsonObj.get("secretVersionID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secretVersionID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secretVersionID").toString()));
      }
      if ((jsonObj.get("secretVersionStage") != null && !jsonObj.get("secretVersionStage").isJsonNull()) && !jsonObj.get("secretVersionStage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secretVersionStage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secretVersionStage").toString()));
      }
      if (!jsonObj.get("encryptionMetadataFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encryptionMetadataFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encryptionMetadataFile").toString()));
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
       if (!AmazonSecretsManagerCipherStreamProviderResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AmazonSecretsManagerCipherStreamProviderResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AmazonSecretsManagerCipherStreamProviderResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AmazonSecretsManagerCipherStreamProviderResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AmazonSecretsManagerCipherStreamProviderResponse>() {
           @Override
           public void write(JsonWriter out, AmazonSecretsManagerCipherStreamProviderResponse value) throws IOException {
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
           public AmazonSecretsManagerCipherStreamProviderResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AmazonSecretsManagerCipherStreamProviderResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AmazonSecretsManagerCipherStreamProviderResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AmazonSecretsManagerCipherStreamProviderResponse
  * @throws IOException if the JSON string is invalid with respect to AmazonSecretsManagerCipherStreamProviderResponse
  */
  public static AmazonSecretsManagerCipherStreamProviderResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AmazonSecretsManagerCipherStreamProviderResponse.class);
  }

 /**
  * Convert an instance of AmazonSecretsManagerCipherStreamProviderResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

