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
import com.konfigthis.client.model.EnumpluginDatetimeFormatProp;
import com.konfigthis.client.model.EnumpluginPurgeBehaviorProp;
import com.konfigthis.client.model.EnumpurgeExpiredDataPluginSchemaUrn;
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
 * PurgeExpiredDataPluginShared
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PurgeExpiredDataPluginShared {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumpurgeExpiredDataPluginSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATETIME_ATTRIBUTE = "datetimeAttribute";
  @SerializedName(SERIALIZED_NAME_DATETIME_ATTRIBUTE)
  private String datetimeAttribute;

  public static final String SERIALIZED_NAME_DATETIME_J_S_O_N_FIELD = "datetimeJSONField";
  @SerializedName(SERIALIZED_NAME_DATETIME_J_S_O_N_FIELD)
  private String datetimeJSONField;

  public static final String SERIALIZED_NAME_DATETIME_FORMAT = "datetimeFormat";
  @SerializedName(SERIALIZED_NAME_DATETIME_FORMAT)
  private EnumpluginDatetimeFormatProp datetimeFormat;

  public static final String SERIALIZED_NAME_CUSTOM_DATETIME_FORMAT = "customDatetimeFormat";
  @SerializedName(SERIALIZED_NAME_CUSTOM_DATETIME_FORMAT)
  private String customDatetimeFormat;

  public static final String SERIALIZED_NAME_CUSTOM_TIMEZONE = "customTimezone";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TIMEZONE)
  private String customTimezone;

  public static final String SERIALIZED_NAME_EXPIRATION_OFFSET = "expirationOffset";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_OFFSET)
  private String expirationOffset;

  public static final String SERIALIZED_NAME_PURGE_BEHAVIOR = "purgeBehavior";
  @SerializedName(SERIALIZED_NAME_PURGE_BEHAVIOR)
  private EnumpluginPurgeBehaviorProp purgeBehavior;

  public static final String SERIALIZED_NAME_BASE_D_N = "baseDN";
  @SerializedName(SERIALIZED_NAME_BASE_D_N)
  private String baseDN;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_POLLING_INTERVAL = "pollingInterval";
  @SerializedName(SERIALIZED_NAME_POLLING_INTERVAL)
  private String pollingInterval;

  public static final String SERIALIZED_NAME_MAX_UPDATES_PER_SECOND = "maxUpdatesPerSecond";
  @SerializedName(SERIALIZED_NAME_MAX_UPDATES_PER_SECOND)
  private Integer maxUpdatesPerSecond;

  public static final String SERIALIZED_NAME_PEER_SERVER_PRIORITY_INDEX = "peerServerPriorityIndex";
  @SerializedName(SERIALIZED_NAME_PEER_SERVER_PRIORITY_INDEX)
  private Integer peerServerPriorityIndex;

  public static final String SERIALIZED_NAME_NUM_DELETE_THREADS = "numDeleteThreads";
  @SerializedName(SERIALIZED_NAME_NUM_DELETE_THREADS)
  private Integer numDeleteThreads;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public PurgeExpiredDataPluginShared() {
  }

  public PurgeExpiredDataPluginShared description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Plugin
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Plugin")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public PurgeExpiredDataPluginShared schemas(List<EnumpurgeExpiredDataPluginSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public PurgeExpiredDataPluginShared addSchemasItem(EnumpurgeExpiredDataPluginSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumpurgeExpiredDataPluginSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumpurgeExpiredDataPluginSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public PurgeExpiredDataPluginShared datetimeAttribute(String datetimeAttribute) {
    
    
    
    
    this.datetimeAttribute = datetimeAttribute;
    return this;
  }

   /**
   * The LDAP attribute that determines when data should be deleted. This could store the expiration time, or it could store the creation time and the expiration-offset property specifies the duration before data is deleted.
   * @return datetimeAttribute
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The LDAP attribute that determines when data should be deleted. This could store the expiration time, or it could store the creation time and the expiration-offset property specifies the duration before data is deleted.")

  public String getDatetimeAttribute() {
    return datetimeAttribute;
  }


  public void setDatetimeAttribute(String datetimeAttribute) {
    
    
    
    this.datetimeAttribute = datetimeAttribute;
  }


  public PurgeExpiredDataPluginShared datetimeJSONField(String datetimeJSONField) {
    
    
    
    
    this.datetimeJSONField = datetimeJSONField;
    return this;
  }

   /**
   * The top-level JSON field within the configured datetime-attribute that determines when data should be deleted. This could store the expiration time, or it could store the creation time and the expiration-offset property specifies the duration before data is deleted.
   * @return datetimeJSONField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The top-level JSON field within the configured datetime-attribute that determines when data should be deleted. This could store the expiration time, or it could store the creation time and the expiration-offset property specifies the duration before data is deleted.")

  public String getDatetimeJSONField() {
    return datetimeJSONField;
  }


  public void setDatetimeJSONField(String datetimeJSONField) {
    
    
    
    this.datetimeJSONField = datetimeJSONField;
  }


  public PurgeExpiredDataPluginShared datetimeFormat(EnumpluginDatetimeFormatProp datetimeFormat) {
    
    
    
    
    this.datetimeFormat = datetimeFormat;
    return this;
  }

   /**
   * Get datetimeFormat
   * @return datetimeFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumpluginDatetimeFormatProp getDatetimeFormat() {
    return datetimeFormat;
  }


  public void setDatetimeFormat(EnumpluginDatetimeFormatProp datetimeFormat) {
    
    
    
    this.datetimeFormat = datetimeFormat;
  }


  public PurgeExpiredDataPluginShared customDatetimeFormat(String customDatetimeFormat) {
    
    
    
    
    this.customDatetimeFormat = customDatetimeFormat;
    return this;
  }

   /**
   * When the datetime-format property is configured with a value of \&quot;custom\&quot;, this specifies the format (using a string compatible with the java.text.SimpleDateFormat class) that will be used to search for expired data.
   * @return customDatetimeFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the datetime-format property is configured with a value of \"custom\", this specifies the format (using a string compatible with the java.text.SimpleDateFormat class) that will be used to search for expired data.")

  public String getCustomDatetimeFormat() {
    return customDatetimeFormat;
  }


  public void setCustomDatetimeFormat(String customDatetimeFormat) {
    
    
    
    this.customDatetimeFormat = customDatetimeFormat;
  }


  public PurgeExpiredDataPluginShared customTimezone(String customTimezone) {
    
    
    
    
    this.customTimezone = customTimezone;
    return this;
  }

   /**
   * Specifies the time zone to use when generating a date string using the configured custom-datetime-format value. The provided value must be accepted by java.util.TimeZone.getTimeZone.
   * @return customTimezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the time zone to use when generating a date string using the configured custom-datetime-format value. The provided value must be accepted by java.util.TimeZone.getTimeZone.")

  public String getCustomTimezone() {
    return customTimezone;
  }


  public void setCustomTimezone(String customTimezone) {
    
    
    
    this.customTimezone = customTimezone;
  }


  public PurgeExpiredDataPluginShared expirationOffset(String expirationOffset) {
    
    
    
    
    this.expirationOffset = expirationOffset;
    return this;
  }

   /**
   * The duration to wait after the value specified in datetime-attribute (and optionally datetime-json-field) before purging the data.
   * @return expirationOffset
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The duration to wait after the value specified in datetime-attribute (and optionally datetime-json-field) before purging the data.")

  public String getExpirationOffset() {
    return expirationOffset;
  }


  public void setExpirationOffset(String expirationOffset) {
    
    
    
    this.expirationOffset = expirationOffset;
  }


  public PurgeExpiredDataPluginShared purgeBehavior(EnumpluginPurgeBehaviorProp purgeBehavior) {
    
    
    
    
    this.purgeBehavior = purgeBehavior;
    return this;
  }

   /**
   * Get purgeBehavior
   * @return purgeBehavior
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumpluginPurgeBehaviorProp getPurgeBehavior() {
    return purgeBehavior;
  }


  public void setPurgeBehavior(EnumpluginPurgeBehaviorProp purgeBehavior) {
    
    
    
    this.purgeBehavior = purgeBehavior;
  }


  public PurgeExpiredDataPluginShared baseDN(String baseDN) {
    
    
    
    
    this.baseDN = baseDN;
    return this;
  }

   /**
   * Only entries located within the subtree specified by this base DN are eligible for purging.
   * @return baseDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only entries located within the subtree specified by this base DN are eligible for purging.")

  public String getBaseDN() {
    return baseDN;
  }


  public void setBaseDN(String baseDN) {
    
    
    
    this.baseDN = baseDN;
  }


  public PurgeExpiredDataPluginShared filter(String filter) {
    
    
    
    
    this.filter = filter;
    return this;
  }

   /**
   * Only entries that match this LDAP filter will be eligible for having data purged.
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only entries that match this LDAP filter will be eligible for having data purged.")

  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    
    
    
    this.filter = filter;
  }


  public PurgeExpiredDataPluginShared pollingInterval(String pollingInterval) {
    
    
    
    
    this.pollingInterval = pollingInterval;
    return this;
  }

   /**
   * This specifies how often the plugin should check for expired data. It also controls the offset of peer servers (see the peer-server-priority-index for more information).
   * @return pollingInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This specifies how often the plugin should check for expired data. It also controls the offset of peer servers (see the peer-server-priority-index for more information).")

  public String getPollingInterval() {
    return pollingInterval;
  }


  public void setPollingInterval(String pollingInterval) {
    
    
    
    this.pollingInterval = pollingInterval;
  }


  public PurgeExpiredDataPluginShared maxUpdatesPerSecond(Integer maxUpdatesPerSecond) {
    
    
    
    
    this.maxUpdatesPerSecond = maxUpdatesPerSecond;
    return this;
  }

   /**
   * This setting smooths out the performance impact on the server by throttling the purging to the specified maximum number of updates per second. To avoid a large backlog, this value should be set comfortably above the average rate that expired data is generated. When purge-behavior is set to subtree-delete-entries, then deletion of the entire subtree is considered a single update for the purposes of throttling.
   * @return maxUpdatesPerSecond
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This setting smooths out the performance impact on the server by throttling the purging to the specified maximum number of updates per second. To avoid a large backlog, this value should be set comfortably above the average rate that expired data is generated. When purge-behavior is set to subtree-delete-entries, then deletion of the entire subtree is considered a single update for the purposes of throttling.")

  public Integer getMaxUpdatesPerSecond() {
    return maxUpdatesPerSecond;
  }


  public void setMaxUpdatesPerSecond(Integer maxUpdatesPerSecond) {
    
    
    
    this.maxUpdatesPerSecond = maxUpdatesPerSecond;
  }


  public PurgeExpiredDataPluginShared peerServerPriorityIndex(Integer peerServerPriorityIndex) {
    
    
    
    
    this.peerServerPriorityIndex = peerServerPriorityIndex;
    return this;
  }

   /**
   * In a replicated environment, this determines the order in which peer servers should attempt to purge data.
   * @return peerServerPriorityIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "In a replicated environment, this determines the order in which peer servers should attempt to purge data.")

  public Integer getPeerServerPriorityIndex() {
    return peerServerPriorityIndex;
  }


  public void setPeerServerPriorityIndex(Integer peerServerPriorityIndex) {
    
    
    
    this.peerServerPriorityIndex = peerServerPriorityIndex;
  }


  public PurgeExpiredDataPluginShared numDeleteThreads(Integer numDeleteThreads) {
    
    
    
    
    this.numDeleteThreads = numDeleteThreads;
    return this;
  }

   /**
   * The number of threads used to delete expired entries.
   * @return numDeleteThreads
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of threads used to delete expired entries.")

  public Integer getNumDeleteThreads() {
    return numDeleteThreads;
  }


  public void setNumDeleteThreads(Integer numDeleteThreads) {
    
    
    
    this.numDeleteThreads = numDeleteThreads;
  }


  public PurgeExpiredDataPluginShared enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the plug-in is enabled for use.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether the plug-in is enabled for use.")

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
   * @return the PurgeExpiredDataPluginShared instance itself
   */
  public PurgeExpiredDataPluginShared putAdditionalProperty(String key, Object value) {
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
    PurgeExpiredDataPluginShared purgeExpiredDataPluginShared = (PurgeExpiredDataPluginShared) o;
    return Objects.equals(this.description, purgeExpiredDataPluginShared.description) &&
        Objects.equals(this.schemas, purgeExpiredDataPluginShared.schemas) &&
        Objects.equals(this.datetimeAttribute, purgeExpiredDataPluginShared.datetimeAttribute) &&
        Objects.equals(this.datetimeJSONField, purgeExpiredDataPluginShared.datetimeJSONField) &&
        Objects.equals(this.datetimeFormat, purgeExpiredDataPluginShared.datetimeFormat) &&
        Objects.equals(this.customDatetimeFormat, purgeExpiredDataPluginShared.customDatetimeFormat) &&
        Objects.equals(this.customTimezone, purgeExpiredDataPluginShared.customTimezone) &&
        Objects.equals(this.expirationOffset, purgeExpiredDataPluginShared.expirationOffset) &&
        Objects.equals(this.purgeBehavior, purgeExpiredDataPluginShared.purgeBehavior) &&
        Objects.equals(this.baseDN, purgeExpiredDataPluginShared.baseDN) &&
        Objects.equals(this.filter, purgeExpiredDataPluginShared.filter) &&
        Objects.equals(this.pollingInterval, purgeExpiredDataPluginShared.pollingInterval) &&
        Objects.equals(this.maxUpdatesPerSecond, purgeExpiredDataPluginShared.maxUpdatesPerSecond) &&
        Objects.equals(this.peerServerPriorityIndex, purgeExpiredDataPluginShared.peerServerPriorityIndex) &&
        Objects.equals(this.numDeleteThreads, purgeExpiredDataPluginShared.numDeleteThreads) &&
        Objects.equals(this.enabled, purgeExpiredDataPluginShared.enabled)&&
        Objects.equals(this.additionalProperties, purgeExpiredDataPluginShared.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, datetimeAttribute, datetimeJSONField, datetimeFormat, customDatetimeFormat, customTimezone, expirationOffset, purgeBehavior, baseDN, filter, pollingInterval, maxUpdatesPerSecond, peerServerPriorityIndex, numDeleteThreads, enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurgeExpiredDataPluginShared {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    datetimeAttribute: ").append(toIndentedString(datetimeAttribute)).append("\n");
    sb.append("    datetimeJSONField: ").append(toIndentedString(datetimeJSONField)).append("\n");
    sb.append("    datetimeFormat: ").append(toIndentedString(datetimeFormat)).append("\n");
    sb.append("    customDatetimeFormat: ").append(toIndentedString(customDatetimeFormat)).append("\n");
    sb.append("    customTimezone: ").append(toIndentedString(customTimezone)).append("\n");
    sb.append("    expirationOffset: ").append(toIndentedString(expirationOffset)).append("\n");
    sb.append("    purgeBehavior: ").append(toIndentedString(purgeBehavior)).append("\n");
    sb.append("    baseDN: ").append(toIndentedString(baseDN)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    pollingInterval: ").append(toIndentedString(pollingInterval)).append("\n");
    sb.append("    maxUpdatesPerSecond: ").append(toIndentedString(maxUpdatesPerSecond)).append("\n");
    sb.append("    peerServerPriorityIndex: ").append(toIndentedString(peerServerPriorityIndex)).append("\n");
    sb.append("    numDeleteThreads: ").append(toIndentedString(numDeleteThreads)).append("\n");
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
    openapiFields.add("datetimeAttribute");
    openapiFields.add("datetimeJSONField");
    openapiFields.add("datetimeFormat");
    openapiFields.add("customDatetimeFormat");
    openapiFields.add("customTimezone");
    openapiFields.add("expirationOffset");
    openapiFields.add("purgeBehavior");
    openapiFields.add("baseDN");
    openapiFields.add("filter");
    openapiFields.add("pollingInterval");
    openapiFields.add("maxUpdatesPerSecond");
    openapiFields.add("peerServerPriorityIndex");
    openapiFields.add("numDeleteThreads");
    openapiFields.add("enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("datetimeAttribute");
    openapiRequiredFields.add("expirationOffset");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PurgeExpiredDataPluginShared
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PurgeExpiredDataPluginShared.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PurgeExpiredDataPluginShared is not found in the empty JSON string", PurgeExpiredDataPluginShared.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PurgeExpiredDataPluginShared.openapiRequiredFields) {
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
      if (!jsonObj.get("datetimeAttribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datetimeAttribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datetimeAttribute").toString()));
      }
      if ((jsonObj.get("datetimeJSONField") != null && !jsonObj.get("datetimeJSONField").isJsonNull()) && !jsonObj.get("datetimeJSONField").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datetimeJSONField` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datetimeJSONField").toString()));
      }
      if ((jsonObj.get("customDatetimeFormat") != null && !jsonObj.get("customDatetimeFormat").isJsonNull()) && !jsonObj.get("customDatetimeFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customDatetimeFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customDatetimeFormat").toString()));
      }
      if ((jsonObj.get("customTimezone") != null && !jsonObj.get("customTimezone").isJsonNull()) && !jsonObj.get("customTimezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customTimezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customTimezone").toString()));
      }
      if (!jsonObj.get("expirationOffset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expirationOffset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expirationOffset").toString()));
      }
      if ((jsonObj.get("baseDN") != null && !jsonObj.get("baseDN").isJsonNull()) && !jsonObj.get("baseDN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseDN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseDN").toString()));
      }
      if ((jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      if ((jsonObj.get("pollingInterval") != null && !jsonObj.get("pollingInterval").isJsonNull()) && !jsonObj.get("pollingInterval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pollingInterval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pollingInterval").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PurgeExpiredDataPluginShared.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PurgeExpiredDataPluginShared' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PurgeExpiredDataPluginShared> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PurgeExpiredDataPluginShared.class));

       return (TypeAdapter<T>) new TypeAdapter<PurgeExpiredDataPluginShared>() {
           @Override
           public void write(JsonWriter out, PurgeExpiredDataPluginShared value) throws IOException {
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
           public PurgeExpiredDataPluginShared read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PurgeExpiredDataPluginShared instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PurgeExpiredDataPluginShared given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PurgeExpiredDataPluginShared
  * @throws IOException if the JSON string is invalid with respect to PurgeExpiredDataPluginShared
  */
  public static PurgeExpiredDataPluginShared fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PurgeExpiredDataPluginShared.class);
  }

 /**
  * Convert an instance of PurgeExpiredDataPluginShared to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

