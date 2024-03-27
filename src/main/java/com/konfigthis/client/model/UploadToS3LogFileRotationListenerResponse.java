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
import com.konfigthis.client.model.EnumuploadToS3LogFileRotationListenerSchemaUrn;
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
 * UploadToS3LogFileRotationListenerResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UploadToS3LogFileRotationListenerResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumuploadToS3LogFileRotationListenerSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_AWS_EXTERNAL_SERVER = "awsExternalServer";
  @SerializedName(SERIALIZED_NAME_AWS_EXTERNAL_SERVER)
  private String awsExternalServer;

  public static final String SERIALIZED_NAME_S3_BUCKET_NAME = "s3BucketName";
  @SerializedName(SERIALIZED_NAME_S3_BUCKET_NAME)
  private String s3BucketName;

  public static final String SERIALIZED_NAME_TARGET_THROUGHPUT_IN_MEGABITS_PER_SECOND = "targetThroughputInMegabitsPerSecond";
  @SerializedName(SERIALIZED_NAME_TARGET_THROUGHPUT_IN_MEGABITS_PER_SECOND)
  private Integer targetThroughputInMegabitsPerSecond;

  public static final String SERIALIZED_NAME_MAXIMUM_CONCURRENT_TRANSFER_CONNECTIONS = "maximumConcurrentTransferConnections";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_CONCURRENT_TRANSFER_CONNECTIONS)
  private Integer maximumConcurrentTransferConnections;

  public static final String SERIALIZED_NAME_MAXIMUM_FILE_COUNT_TO_RETAIN = "maximumFileCountToRetain";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_FILE_COUNT_TO_RETAIN)
  private Integer maximumFileCountToRetain;

  public static final String SERIALIZED_NAME_MAXIMUM_FILE_AGE_TO_RETAIN = "maximumFileAgeToRetain";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_FILE_AGE_TO_RETAIN)
  private String maximumFileAgeToRetain;

  public static final String SERIALIZED_NAME_FILE_RETENTION_PATTERN = "fileRetentionPattern";
  @SerializedName(SERIALIZED_NAME_FILE_RETENTION_PATTERN)
  private String fileRetentionPattern;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public UploadToS3LogFileRotationListenerResponse() {
  }

  public UploadToS3LogFileRotationListenerResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Log File Rotation Listener
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the Log File Rotation Listener")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public UploadToS3LogFileRotationListenerResponse description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Log File Rotation Listener
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Log File Rotation Listener")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public UploadToS3LogFileRotationListenerResponse schemas(List<EnumuploadToS3LogFileRotationListenerSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public UploadToS3LogFileRotationListenerResponse addSchemasItem(EnumuploadToS3LogFileRotationListenerSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumuploadToS3LogFileRotationListenerSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumuploadToS3LogFileRotationListenerSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public UploadToS3LogFileRotationListenerResponse awsExternalServer(String awsExternalServer) {
    
    
    
    
    this.awsExternalServer = awsExternalServer;
    return this;
  }

   /**
   * The external server with information to use when interacting with the AWS S3 service.
   * @return awsExternalServer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The external server with information to use when interacting with the AWS S3 service.")

  public String getAwsExternalServer() {
    return awsExternalServer;
  }


  public void setAwsExternalServer(String awsExternalServer) {
    
    
    
    this.awsExternalServer = awsExternalServer;
  }


  public UploadToS3LogFileRotationListenerResponse s3BucketName(String s3BucketName) {
    
    
    
    
    this.s3BucketName = s3BucketName;
    return this;
  }

   /**
   * The name of the S3 bucket into which rotated log files should be copied.
   * @return s3BucketName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the S3 bucket into which rotated log files should be copied.")

  public String getS3BucketName() {
    return s3BucketName;
  }


  public void setS3BucketName(String s3BucketName) {
    
    
    
    this.s3BucketName = s3BucketName;
  }


  public UploadToS3LogFileRotationListenerResponse targetThroughputInMegabitsPerSecond(Integer targetThroughputInMegabitsPerSecond) {
    
    
    
    
    this.targetThroughputInMegabitsPerSecond = targetThroughputInMegabitsPerSecond;
    return this;
  }

   /**
   * The target throughput to attempt to achieve for data transfers to or from S3, in megabits per second.
   * @return targetThroughputInMegabitsPerSecond
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The target throughput to attempt to achieve for data transfers to or from S3, in megabits per second.")

  public Integer getTargetThroughputInMegabitsPerSecond() {
    return targetThroughputInMegabitsPerSecond;
  }


  public void setTargetThroughputInMegabitsPerSecond(Integer targetThroughputInMegabitsPerSecond) {
    
    
    
    this.targetThroughputInMegabitsPerSecond = targetThroughputInMegabitsPerSecond;
  }


  public UploadToS3LogFileRotationListenerResponse maximumConcurrentTransferConnections(Integer maximumConcurrentTransferConnections) {
    
    
    
    
    this.maximumConcurrentTransferConnections = maximumConcurrentTransferConnections;
    return this;
  }

   /**
   * The maximum number of concurrent connections that may be used when transferring data to or from S3.
   * @return maximumConcurrentTransferConnections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of concurrent connections that may be used when transferring data to or from S3.")

  public Integer getMaximumConcurrentTransferConnections() {
    return maximumConcurrentTransferConnections;
  }


  public void setMaximumConcurrentTransferConnections(Integer maximumConcurrentTransferConnections) {
    
    
    
    this.maximumConcurrentTransferConnections = maximumConcurrentTransferConnections;
  }


  public UploadToS3LogFileRotationListenerResponse maximumFileCountToRetain(Integer maximumFileCountToRetain) {
    
    
    
    
    this.maximumFileCountToRetain = maximumFileCountToRetain;
    return this;
  }

   /**
   * The maximum number of existing files matching the file retention pattern that should be retained in the S3 bucket after successfully uploading a newly rotated file.
   * @return maximumFileCountToRetain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of existing files matching the file retention pattern that should be retained in the S3 bucket after successfully uploading a newly rotated file.")

  public Integer getMaximumFileCountToRetain() {
    return maximumFileCountToRetain;
  }


  public void setMaximumFileCountToRetain(Integer maximumFileCountToRetain) {
    
    
    
    this.maximumFileCountToRetain = maximumFileCountToRetain;
  }


  public UploadToS3LogFileRotationListenerResponse maximumFileAgeToRetain(String maximumFileAgeToRetain) {
    
    
    
    
    this.maximumFileAgeToRetain = maximumFileAgeToRetain;
    return this;
  }

   /**
   * The maximum length of time to retain files matching the file retention pattern that should be retained in the S3 bucket after successfully uploading a newly rotated file.
   * @return maximumFileAgeToRetain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum length of time to retain files matching the file retention pattern that should be retained in the S3 bucket after successfully uploading a newly rotated file.")

  public String getMaximumFileAgeToRetain() {
    return maximumFileAgeToRetain;
  }


  public void setMaximumFileAgeToRetain(String maximumFileAgeToRetain) {
    
    
    
    this.maximumFileAgeToRetain = maximumFileAgeToRetain;
  }


  public UploadToS3LogFileRotationListenerResponse fileRetentionPattern(String fileRetentionPattern) {
    
    
    
    
    this.fileRetentionPattern = fileRetentionPattern;
    return this;
  }

   /**
   * A regular expression pattern that will be used to identify which files are candidates for automatic removal based on the maximum-file-count-to-retain and maximum-file-age-to-retain properties. By default, all files in the bucket will be eligible for removal by retention processing.
   * @return fileRetentionPattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A regular expression pattern that will be used to identify which files are candidates for automatic removal based on the maximum-file-count-to-retain and maximum-file-age-to-retain properties. By default, all files in the bucket will be eligible for removal by retention processing.")

  public String getFileRetentionPattern() {
    return fileRetentionPattern;
  }


  public void setFileRetentionPattern(String fileRetentionPattern) {
    
    
    
    this.fileRetentionPattern = fileRetentionPattern;
  }


  public UploadToS3LogFileRotationListenerResponse enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the Log File Rotation Listener is enabled for use.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether the Log File Rotation Listener is enabled for use.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public UploadToS3LogFileRotationListenerResponse meta(MetaMeta meta) {
    
    
    
    
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


  public UploadToS3LogFileRotationListenerResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the UploadToS3LogFileRotationListenerResponse instance itself
   */
  public UploadToS3LogFileRotationListenerResponse putAdditionalProperty(String key, Object value) {
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
    UploadToS3LogFileRotationListenerResponse uploadToS3LogFileRotationListenerResponse = (UploadToS3LogFileRotationListenerResponse) o;
    return Objects.equals(this.id, uploadToS3LogFileRotationListenerResponse.id) &&
        Objects.equals(this.description, uploadToS3LogFileRotationListenerResponse.description) &&
        Objects.equals(this.schemas, uploadToS3LogFileRotationListenerResponse.schemas) &&
        Objects.equals(this.awsExternalServer, uploadToS3LogFileRotationListenerResponse.awsExternalServer) &&
        Objects.equals(this.s3BucketName, uploadToS3LogFileRotationListenerResponse.s3BucketName) &&
        Objects.equals(this.targetThroughputInMegabitsPerSecond, uploadToS3LogFileRotationListenerResponse.targetThroughputInMegabitsPerSecond) &&
        Objects.equals(this.maximumConcurrentTransferConnections, uploadToS3LogFileRotationListenerResponse.maximumConcurrentTransferConnections) &&
        Objects.equals(this.maximumFileCountToRetain, uploadToS3LogFileRotationListenerResponse.maximumFileCountToRetain) &&
        Objects.equals(this.maximumFileAgeToRetain, uploadToS3LogFileRotationListenerResponse.maximumFileAgeToRetain) &&
        Objects.equals(this.fileRetentionPattern, uploadToS3LogFileRotationListenerResponse.fileRetentionPattern) &&
        Objects.equals(this.enabled, uploadToS3LogFileRotationListenerResponse.enabled) &&
        Objects.equals(this.meta, uploadToS3LogFileRotationListenerResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, uploadToS3LogFileRotationListenerResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, uploadToS3LogFileRotationListenerResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, schemas, awsExternalServer, s3BucketName, targetThroughputInMegabitsPerSecond, maximumConcurrentTransferConnections, maximumFileCountToRetain, maximumFileAgeToRetain, fileRetentionPattern, enabled, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadToS3LogFileRotationListenerResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    awsExternalServer: ").append(toIndentedString(awsExternalServer)).append("\n");
    sb.append("    s3BucketName: ").append(toIndentedString(s3BucketName)).append("\n");
    sb.append("    targetThroughputInMegabitsPerSecond: ").append(toIndentedString(targetThroughputInMegabitsPerSecond)).append("\n");
    sb.append("    maximumConcurrentTransferConnections: ").append(toIndentedString(maximumConcurrentTransferConnections)).append("\n");
    sb.append("    maximumFileCountToRetain: ").append(toIndentedString(maximumFileCountToRetain)).append("\n");
    sb.append("    maximumFileAgeToRetain: ").append(toIndentedString(maximumFileAgeToRetain)).append("\n");
    sb.append("    fileRetentionPattern: ").append(toIndentedString(fileRetentionPattern)).append("\n");
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
    openapiFields.add("s3BucketName");
    openapiFields.add("targetThroughputInMegabitsPerSecond");
    openapiFields.add("maximumConcurrentTransferConnections");
    openapiFields.add("maximumFileCountToRetain");
    openapiFields.add("maximumFileAgeToRetain");
    openapiFields.add("fileRetentionPattern");
    openapiFields.add("enabled");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("awsExternalServer");
    openapiRequiredFields.add("s3BucketName");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UploadToS3LogFileRotationListenerResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UploadToS3LogFileRotationListenerResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UploadToS3LogFileRotationListenerResponse is not found in the empty JSON string", UploadToS3LogFileRotationListenerResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UploadToS3LogFileRotationListenerResponse.openapiRequiredFields) {
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
      if (!jsonObj.get("s3BucketName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `s3BucketName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("s3BucketName").toString()));
      }
      if ((jsonObj.get("maximumFileAgeToRetain") != null && !jsonObj.get("maximumFileAgeToRetain").isJsonNull()) && !jsonObj.get("maximumFileAgeToRetain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maximumFileAgeToRetain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maximumFileAgeToRetain").toString()));
      }
      if ((jsonObj.get("fileRetentionPattern") != null && !jsonObj.get("fileRetentionPattern").isJsonNull()) && !jsonObj.get("fileRetentionPattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileRetentionPattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileRetentionPattern").toString()));
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
       if (!UploadToS3LogFileRotationListenerResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadToS3LogFileRotationListenerResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadToS3LogFileRotationListenerResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadToS3LogFileRotationListenerResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadToS3LogFileRotationListenerResponse>() {
           @Override
           public void write(JsonWriter out, UploadToS3LogFileRotationListenerResponse value) throws IOException {
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
           public UploadToS3LogFileRotationListenerResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UploadToS3LogFileRotationListenerResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UploadToS3LogFileRotationListenerResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UploadToS3LogFileRotationListenerResponse
  * @throws IOException if the JSON string is invalid with respect to UploadToS3LogFileRotationListenerResponse
  */
  public static UploadToS3LogFileRotationListenerResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadToS3LogFileRotationListenerResponse.class);
  }

 /**
  * Convert an instance of UploadToS3LogFileRotationListenerResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

