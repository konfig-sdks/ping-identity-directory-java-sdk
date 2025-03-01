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
import com.konfigthis.client.model.EnumfileBasedPolicyDecisionLogPublisherSchemaUrn;
import com.konfigthis.client.model.EnumlogPublisherCompressionMechanismProp;
import com.konfigthis.client.model.EnumlogPublisherLoggingErrorBehaviorProp;
import com.konfigthis.client.model.EnumlogPublisherPolicyMessageTypeProp;
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
 * FileBasedPolicyDecisionLogPublisherResponseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FileBasedPolicyDecisionLogPublisherResponseAllOf {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumfileBasedPolicyDecisionLogPublisherSchemaUrn> schemas = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ASYNCHRONOUS = "asynchronous";
  @SerializedName(SERIALIZED_NAME_ASYNCHRONOUS)
  private Boolean asynchronous;

  public static final String SERIALIZED_NAME_QUEUE_SIZE = "queueSize";
  @SerializedName(SERIALIZED_NAME_QUEUE_SIZE)
  private Integer queueSize;

  public static final String SERIALIZED_NAME_BUFFER_SIZE = "bufferSize";
  @SerializedName(SERIALIZED_NAME_BUFFER_SIZE)
  private String bufferSize;

  public static final String SERIALIZED_NAME_TIME_INTERVAL = "timeInterval";
  @SerializedName(SERIALIZED_NAME_TIME_INTERVAL)
  private String timeInterval;

  public static final String SERIALIZED_NAME_LOG_FILE = "logFile";
  @SerializedName(SERIALIZED_NAME_LOG_FILE)
  private String logFile;

  public static final String SERIALIZED_NAME_LOG_FILE_PERMISSIONS = "logFilePermissions";
  @SerializedName(SERIALIZED_NAME_LOG_FILE_PERMISSIONS)
  private String logFilePermissions;

  public static final String SERIALIZED_NAME_ROTATION_POLICY = "rotationPolicy";
  @SerializedName(SERIALIZED_NAME_ROTATION_POLICY)
  private List<String> rotationPolicy = null;

  public static final String SERIALIZED_NAME_ROTATION_LISTENER = "rotationListener";
  @SerializedName(SERIALIZED_NAME_ROTATION_LISTENER)
  private List<String> rotationListener = null;

  public static final String SERIALIZED_NAME_RETENTION_POLICY = "retentionPolicy";
  @SerializedName(SERIALIZED_NAME_RETENTION_POLICY)
  private List<String> retentionPolicy = null;

  public static final String SERIALIZED_NAME_COMPRESSION_MECHANISM = "compressionMechanism";
  @SerializedName(SERIALIZED_NAME_COMPRESSION_MECHANISM)
  private EnumlogPublisherCompressionMechanismProp compressionMechanism;

  public static final String SERIALIZED_NAME_SIGN_LOG = "signLog";
  @SerializedName(SERIALIZED_NAME_SIGN_LOG)
  private Boolean signLog;

  public static final String SERIALIZED_NAME_ENCRYPT_LOG = "encryptLog";
  @SerializedName(SERIALIZED_NAME_ENCRYPT_LOG)
  private Boolean encryptLog;

  public static final String SERIALIZED_NAME_ENCRYPTION_SETTINGS_DEFINITION_I_D = "encryptionSettingsDefinitionID";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_SETTINGS_DEFINITION_I_D)
  private String encryptionSettingsDefinitionID;

  public static final String SERIALIZED_NAME_APPEND = "append";
  @SerializedName(SERIALIZED_NAME_APPEND)
  private Boolean append;

  public static final String SERIALIZED_NAME_INCLUDE_P_D_P_RESPONSE = "includePDPResponse";
  @SerializedName(SERIALIZED_NAME_INCLUDE_P_D_P_RESPONSE)
  private Boolean includePDPResponse;

  public static final String SERIALIZED_NAME_POLICY_MESSAGE_TYPE = "policyMessageType";
  @SerializedName(SERIALIZED_NAME_POLICY_MESSAGE_TYPE)
  private List<EnumlogPublisherPolicyMessageTypeProp> policyMessageType = null;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_LOGGING_ERROR_BEHAVIOR = "loggingErrorBehavior";
  @SerializedName(SERIALIZED_NAME_LOGGING_ERROR_BEHAVIOR)
  private EnumlogPublisherLoggingErrorBehaviorProp loggingErrorBehavior;

  public FileBasedPolicyDecisionLogPublisherResponseAllOf() {
  }

  public FileBasedPolicyDecisionLogPublisherResponseAllOf description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Log Publisher
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Log Publisher")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf schemas(List<EnumfileBasedPolicyDecisionLogPublisherSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public FileBasedPolicyDecisionLogPublisherResponseAllOf addSchemasItem(EnumfileBasedPolicyDecisionLogPublisherSchemaUrn schemasItem) {
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

  public List<EnumfileBasedPolicyDecisionLogPublisherSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumfileBasedPolicyDecisionLogPublisherSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Log Publisher
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Log Publisher")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf asynchronous(Boolean asynchronous) {
    
    
    
    
    this.asynchronous = asynchronous;
    return this;
  }

   /**
   * Indicates whether the File Based Policy Decision Log Publisher will publish records asynchronously.
   * @return asynchronous
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the File Based Policy Decision Log Publisher will publish records asynchronously.")

  public Boolean getAsynchronous() {
    return asynchronous;
  }


  public void setAsynchronous(Boolean asynchronous) {
    
    
    
    this.asynchronous = asynchronous;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf queueSize(Integer queueSize) {
    
    
    
    
    this.queueSize = queueSize;
    return this;
  }

   /**
   * The maximum number of log records that can be stored in the asynchronous queue.
   * @return queueSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of log records that can be stored in the asynchronous queue.")

  public Integer getQueueSize() {
    return queueSize;
  }


  public void setQueueSize(Integer queueSize) {
    
    
    
    this.queueSize = queueSize;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf bufferSize(String bufferSize) {
    
    
    
    
    this.bufferSize = bufferSize;
    return this;
  }

   /**
   * Specifies the log file buffer size.
   * @return bufferSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the log file buffer size.")

  public String getBufferSize() {
    return bufferSize;
  }


  public void setBufferSize(String bufferSize) {
    
    
    
    this.bufferSize = bufferSize;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf timeInterval(String timeInterval) {
    
    
    
    
    this.timeInterval = timeInterval;
    return this;
  }

   /**
   * Specifies the interval at which to check whether the log files need to be rotated.
   * @return timeInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the interval at which to check whether the log files need to be rotated.")

  public String getTimeInterval() {
    return timeInterval;
  }


  public void setTimeInterval(String timeInterval) {
    
    
    
    this.timeInterval = timeInterval;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf logFile(String logFile) {
    
    
    
    
    this.logFile = logFile;
    return this;
  }

   /**
   * The file name to use for the log files generated by the File Based Policy Decision Log Publisher. The path to the file can be specified either as relative to the server root or as an absolute path.
   * @return logFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The file name to use for the log files generated by the File Based Policy Decision Log Publisher. The path to the file can be specified either as relative to the server root or as an absolute path.")

  public String getLogFile() {
    return logFile;
  }


  public void setLogFile(String logFile) {
    
    
    
    this.logFile = logFile;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf logFilePermissions(String logFilePermissions) {
    
    
    
    
    this.logFilePermissions = logFilePermissions;
    return this;
  }

   /**
   * The UNIX permissions of the log files created by this File Based Policy Decision Log Publisher.
   * @return logFilePermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UNIX permissions of the log files created by this File Based Policy Decision Log Publisher.")

  public String getLogFilePermissions() {
    return logFilePermissions;
  }


  public void setLogFilePermissions(String logFilePermissions) {
    
    
    
    this.logFilePermissions = logFilePermissions;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf rotationPolicy(List<String> rotationPolicy) {
    
    
    
    
    this.rotationPolicy = rotationPolicy;
    return this;
  }

  public FileBasedPolicyDecisionLogPublisherResponseAllOf addRotationPolicyItem(String rotationPolicyItem) {
    if (this.rotationPolicy == null) {
      this.rotationPolicy = new ArrayList<>();
    }
    this.rotationPolicy.add(rotationPolicyItem);
    return this;
  }

   /**
   * The rotation policy to use for the File Based Policy Decision Log Publisher .
   * @return rotationPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rotation policy to use for the File Based Policy Decision Log Publisher .")

  public List<String> getRotationPolicy() {
    return rotationPolicy;
  }


  public void setRotationPolicy(List<String> rotationPolicy) {
    
    
    
    this.rotationPolicy = rotationPolicy;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf rotationListener(List<String> rotationListener) {
    
    
    
    
    this.rotationListener = rotationListener;
    return this;
  }

  public FileBasedPolicyDecisionLogPublisherResponseAllOf addRotationListenerItem(String rotationListenerItem) {
    if (this.rotationListener == null) {
      this.rotationListener = new ArrayList<>();
    }
    this.rotationListener.add(rotationListenerItem);
    return this;
  }

   /**
   * A listener that should be notified whenever a log file is rotated out of service.
   * @return rotationListener
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A listener that should be notified whenever a log file is rotated out of service.")

  public List<String> getRotationListener() {
    return rotationListener;
  }


  public void setRotationListener(List<String> rotationListener) {
    
    
    
    this.rotationListener = rotationListener;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf retentionPolicy(List<String> retentionPolicy) {
    
    
    
    
    this.retentionPolicy = retentionPolicy;
    return this;
  }

  public FileBasedPolicyDecisionLogPublisherResponseAllOf addRetentionPolicyItem(String retentionPolicyItem) {
    if (this.retentionPolicy == null) {
      this.retentionPolicy = new ArrayList<>();
    }
    this.retentionPolicy.add(retentionPolicyItem);
    return this;
  }

   /**
   * The retention policy to use for the File Based Policy Decision Log Publisher .
   * @return retentionPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The retention policy to use for the File Based Policy Decision Log Publisher .")

  public List<String> getRetentionPolicy() {
    return retentionPolicy;
  }


  public void setRetentionPolicy(List<String> retentionPolicy) {
    
    
    
    this.retentionPolicy = retentionPolicy;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf compressionMechanism(EnumlogPublisherCompressionMechanismProp compressionMechanism) {
    
    
    
    
    this.compressionMechanism = compressionMechanism;
    return this;
  }

   /**
   * Get compressionMechanism
   * @return compressionMechanism
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumlogPublisherCompressionMechanismProp getCompressionMechanism() {
    return compressionMechanism;
  }


  public void setCompressionMechanism(EnumlogPublisherCompressionMechanismProp compressionMechanism) {
    
    
    
    this.compressionMechanism = compressionMechanism;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf signLog(Boolean signLog) {
    
    
    
    
    this.signLog = signLog;
    return this;
  }

   /**
   * Indicates whether the log should be cryptographically signed so that the log content cannot be altered in an undetectable manner.
   * @return signLog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the log should be cryptographically signed so that the log content cannot be altered in an undetectable manner.")

  public Boolean getSignLog() {
    return signLog;
  }


  public void setSignLog(Boolean signLog) {
    
    
    
    this.signLog = signLog;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf encryptLog(Boolean encryptLog) {
    
    
    
    
    this.encryptLog = encryptLog;
    return this;
  }

   /**
   * Indicates whether log files should be encrypted so that their content is not available to unauthorized users.
   * @return encryptLog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether log files should be encrypted so that their content is not available to unauthorized users.")

  public Boolean getEncryptLog() {
    return encryptLog;
  }


  public void setEncryptLog(Boolean encryptLog) {
    
    
    
    this.encryptLog = encryptLog;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf encryptionSettingsDefinitionID(String encryptionSettingsDefinitionID) {
    
    
    
    
    this.encryptionSettingsDefinitionID = encryptionSettingsDefinitionID;
    return this;
  }

   /**
   * Specifies the ID of the encryption settings definition that should be used to encrypt the data. If this is not provided, the server&#39;s preferred encryption settings definition will be used. The \&quot;encryption-settings list\&quot; command can be used to obtain a list of the encryption settings definitions available in the server.
   * @return encryptionSettingsDefinitionID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the ID of the encryption settings definition that should be used to encrypt the data. If this is not provided, the server's preferred encryption settings definition will be used. The \"encryption-settings list\" command can be used to obtain a list of the encryption settings definitions available in the server.")

  public String getEncryptionSettingsDefinitionID() {
    return encryptionSettingsDefinitionID;
  }


  public void setEncryptionSettingsDefinitionID(String encryptionSettingsDefinitionID) {
    
    
    
    this.encryptionSettingsDefinitionID = encryptionSettingsDefinitionID;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf append(Boolean append) {
    
    
    
    
    this.append = append;
    return this;
  }

   /**
   * Specifies whether to append to existing log files.
   * @return append
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether to append to existing log files.")

  public Boolean getAppend() {
    return append;
  }


  public void setAppend(Boolean append) {
    
    
    
    this.append = append;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf includePDPResponse(Boolean includePDPResponse) {
    
    
    
    
    this.includePDPResponse = includePDPResponse;
    return this;
  }

   /**
   * Indicates whether policy decision messages recorded by this log publisher will include the full response returned by the PDP.
   * @return includePDPResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether policy decision messages recorded by this log publisher will include the full response returned by the PDP.")

  public Boolean getIncludePDPResponse() {
    return includePDPResponse;
  }


  public void setIncludePDPResponse(Boolean includePDPResponse) {
    
    
    
    this.includePDPResponse = includePDPResponse;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf policyMessageType(List<EnumlogPublisherPolicyMessageTypeProp> policyMessageType) {
    
    
    
    
    this.policyMessageType = policyMessageType;
    return this;
  }

  public FileBasedPolicyDecisionLogPublisherResponseAllOf addPolicyMessageTypeItem(EnumlogPublisherPolicyMessageTypeProp policyMessageTypeItem) {
    if (this.policyMessageType == null) {
      this.policyMessageType = new ArrayList<>();
    }
    this.policyMessageType.add(policyMessageTypeItem);
    return this;
  }

   /**
   * Get policyMessageType
   * @return policyMessageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumlogPublisherPolicyMessageTypeProp> getPolicyMessageType() {
    return policyMessageType;
  }


  public void setPolicyMessageType(List<EnumlogPublisherPolicyMessageTypeProp> policyMessageType) {
    
    
    
    this.policyMessageType = policyMessageType;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the Log Publisher is enabled for use.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the Log Publisher is enabled for use.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public FileBasedPolicyDecisionLogPublisherResponseAllOf loggingErrorBehavior(EnumlogPublisherLoggingErrorBehaviorProp loggingErrorBehavior) {
    
    
    
    
    this.loggingErrorBehavior = loggingErrorBehavior;
    return this;
  }

   /**
   * Get loggingErrorBehavior
   * @return loggingErrorBehavior
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumlogPublisherLoggingErrorBehaviorProp getLoggingErrorBehavior() {
    return loggingErrorBehavior;
  }


  public void setLoggingErrorBehavior(EnumlogPublisherLoggingErrorBehaviorProp loggingErrorBehavior) {
    
    
    
    this.loggingErrorBehavior = loggingErrorBehavior;
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
   * @return the FileBasedPolicyDecisionLogPublisherResponseAllOf instance itself
   */
  public FileBasedPolicyDecisionLogPublisherResponseAllOf putAdditionalProperty(String key, Object value) {
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
    FileBasedPolicyDecisionLogPublisherResponseAllOf fileBasedPolicyDecisionLogPublisherResponseAllOf = (FileBasedPolicyDecisionLogPublisherResponseAllOf) o;
    return Objects.equals(this.description, fileBasedPolicyDecisionLogPublisherResponseAllOf.description) &&
        Objects.equals(this.schemas, fileBasedPolicyDecisionLogPublisherResponseAllOf.schemas) &&
        Objects.equals(this.id, fileBasedPolicyDecisionLogPublisherResponseAllOf.id) &&
        Objects.equals(this.asynchronous, fileBasedPolicyDecisionLogPublisherResponseAllOf.asynchronous) &&
        Objects.equals(this.queueSize, fileBasedPolicyDecisionLogPublisherResponseAllOf.queueSize) &&
        Objects.equals(this.bufferSize, fileBasedPolicyDecisionLogPublisherResponseAllOf.bufferSize) &&
        Objects.equals(this.timeInterval, fileBasedPolicyDecisionLogPublisherResponseAllOf.timeInterval) &&
        Objects.equals(this.logFile, fileBasedPolicyDecisionLogPublisherResponseAllOf.logFile) &&
        Objects.equals(this.logFilePermissions, fileBasedPolicyDecisionLogPublisherResponseAllOf.logFilePermissions) &&
        Objects.equals(this.rotationPolicy, fileBasedPolicyDecisionLogPublisherResponseAllOf.rotationPolicy) &&
        Objects.equals(this.rotationListener, fileBasedPolicyDecisionLogPublisherResponseAllOf.rotationListener) &&
        Objects.equals(this.retentionPolicy, fileBasedPolicyDecisionLogPublisherResponseAllOf.retentionPolicy) &&
        Objects.equals(this.compressionMechanism, fileBasedPolicyDecisionLogPublisherResponseAllOf.compressionMechanism) &&
        Objects.equals(this.signLog, fileBasedPolicyDecisionLogPublisherResponseAllOf.signLog) &&
        Objects.equals(this.encryptLog, fileBasedPolicyDecisionLogPublisherResponseAllOf.encryptLog) &&
        Objects.equals(this.encryptionSettingsDefinitionID, fileBasedPolicyDecisionLogPublisherResponseAllOf.encryptionSettingsDefinitionID) &&
        Objects.equals(this.append, fileBasedPolicyDecisionLogPublisherResponseAllOf.append) &&
        Objects.equals(this.includePDPResponse, fileBasedPolicyDecisionLogPublisherResponseAllOf.includePDPResponse) &&
        Objects.equals(this.policyMessageType, fileBasedPolicyDecisionLogPublisherResponseAllOf.policyMessageType) &&
        Objects.equals(this.enabled, fileBasedPolicyDecisionLogPublisherResponseAllOf.enabled) &&
        Objects.equals(this.loggingErrorBehavior, fileBasedPolicyDecisionLogPublisherResponseAllOf.loggingErrorBehavior)&&
        Objects.equals(this.additionalProperties, fileBasedPolicyDecisionLogPublisherResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, id, asynchronous, queueSize, bufferSize, timeInterval, logFile, logFilePermissions, rotationPolicy, rotationListener, retentionPolicy, compressionMechanism, signLog, encryptLog, encryptionSettingsDefinitionID, append, includePDPResponse, policyMessageType, enabled, loggingErrorBehavior, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileBasedPolicyDecisionLogPublisherResponseAllOf {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    asynchronous: ").append(toIndentedString(asynchronous)).append("\n");
    sb.append("    queueSize: ").append(toIndentedString(queueSize)).append("\n");
    sb.append("    bufferSize: ").append(toIndentedString(bufferSize)).append("\n");
    sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
    sb.append("    logFile: ").append(toIndentedString(logFile)).append("\n");
    sb.append("    logFilePermissions: ").append(toIndentedString(logFilePermissions)).append("\n");
    sb.append("    rotationPolicy: ").append(toIndentedString(rotationPolicy)).append("\n");
    sb.append("    rotationListener: ").append(toIndentedString(rotationListener)).append("\n");
    sb.append("    retentionPolicy: ").append(toIndentedString(retentionPolicy)).append("\n");
    sb.append("    compressionMechanism: ").append(toIndentedString(compressionMechanism)).append("\n");
    sb.append("    signLog: ").append(toIndentedString(signLog)).append("\n");
    sb.append("    encryptLog: ").append(toIndentedString(encryptLog)).append("\n");
    sb.append("    encryptionSettingsDefinitionID: ").append(toIndentedString(encryptionSettingsDefinitionID)).append("\n");
    sb.append("    append: ").append(toIndentedString(append)).append("\n");
    sb.append("    includePDPResponse: ").append(toIndentedString(includePDPResponse)).append("\n");
    sb.append("    policyMessageType: ").append(toIndentedString(policyMessageType)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    loggingErrorBehavior: ").append(toIndentedString(loggingErrorBehavior)).append("\n");
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
    openapiFields.add("asynchronous");
    openapiFields.add("queueSize");
    openapiFields.add("bufferSize");
    openapiFields.add("timeInterval");
    openapiFields.add("logFile");
    openapiFields.add("logFilePermissions");
    openapiFields.add("rotationPolicy");
    openapiFields.add("rotationListener");
    openapiFields.add("retentionPolicy");
    openapiFields.add("compressionMechanism");
    openapiFields.add("signLog");
    openapiFields.add("encryptLog");
    openapiFields.add("encryptionSettingsDefinitionID");
    openapiFields.add("append");
    openapiFields.add("includePDPResponse");
    openapiFields.add("policyMessageType");
    openapiFields.add("enabled");
    openapiFields.add("loggingErrorBehavior");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FileBasedPolicyDecisionLogPublisherResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FileBasedPolicyDecisionLogPublisherResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FileBasedPolicyDecisionLogPublisherResponseAllOf is not found in the empty JSON string", FileBasedPolicyDecisionLogPublisherResponseAllOf.openapiRequiredFields.toString()));
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
      if ((jsonObj.get("bufferSize") != null && !jsonObj.get("bufferSize").isJsonNull()) && !jsonObj.get("bufferSize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bufferSize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bufferSize").toString()));
      }
      if ((jsonObj.get("timeInterval") != null && !jsonObj.get("timeInterval").isJsonNull()) && !jsonObj.get("timeInterval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeInterval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeInterval").toString()));
      }
      if ((jsonObj.get("logFile") != null && !jsonObj.get("logFile").isJsonNull()) && !jsonObj.get("logFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logFile").toString()));
      }
      if ((jsonObj.get("logFilePermissions") != null && !jsonObj.get("logFilePermissions").isJsonNull()) && !jsonObj.get("logFilePermissions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logFilePermissions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logFilePermissions").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rotationPolicy") != null && !jsonObj.get("rotationPolicy").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rotationPolicy` to be an array in the JSON string but got `%s`", jsonObj.get("rotationPolicy").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rotationListener") != null && !jsonObj.get("rotationListener").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rotationListener` to be an array in the JSON string but got `%s`", jsonObj.get("rotationListener").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("retentionPolicy") != null && !jsonObj.get("retentionPolicy").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `retentionPolicy` to be an array in the JSON string but got `%s`", jsonObj.get("retentionPolicy").toString()));
      }
      if ((jsonObj.get("encryptionSettingsDefinitionID") != null && !jsonObj.get("encryptionSettingsDefinitionID").isJsonNull()) && !jsonObj.get("encryptionSettingsDefinitionID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encryptionSettingsDefinitionID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encryptionSettingsDefinitionID").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("policyMessageType") != null && !jsonObj.get("policyMessageType").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `policyMessageType` to be an array in the JSON string but got `%s`", jsonObj.get("policyMessageType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileBasedPolicyDecisionLogPublisherResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileBasedPolicyDecisionLogPublisherResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileBasedPolicyDecisionLogPublisherResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileBasedPolicyDecisionLogPublisherResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<FileBasedPolicyDecisionLogPublisherResponseAllOf>() {
           @Override
           public void write(JsonWriter out, FileBasedPolicyDecisionLogPublisherResponseAllOf value) throws IOException {
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
           public FileBasedPolicyDecisionLogPublisherResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FileBasedPolicyDecisionLogPublisherResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FileBasedPolicyDecisionLogPublisherResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileBasedPolicyDecisionLogPublisherResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to FileBasedPolicyDecisionLogPublisherResponseAllOf
  */
  public static FileBasedPolicyDecisionLogPublisherResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileBasedPolicyDecisionLogPublisherResponseAllOf.class);
  }

 /**
  * Convert an instance of FileBasedPolicyDecisionLogPublisherResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

