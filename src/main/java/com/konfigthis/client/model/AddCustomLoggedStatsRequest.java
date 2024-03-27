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
import com.konfigthis.client.model.EnumcustomLoggedStatsSchemaUrn;
import com.konfigthis.client.model.EnumcustomLoggedStatsStatisticTypeProp;
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
 * AddCustomLoggedStatsRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddCustomLoggedStatsRequest {
  public static final String SERIALIZED_NAME_STATS_NAME = "statsName";
  @SerializedName(SERIALIZED_NAME_STATS_NAME)
  private String statsName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumcustomLoggedStatsSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_MONITOR_OBJECTCLASS = "monitorObjectclass";
  @SerializedName(SERIALIZED_NAME_MONITOR_OBJECTCLASS)
  private String monitorObjectclass;

  public static final String SERIALIZED_NAME_INCLUDE_FILTER = "includeFilter";
  @SerializedName(SERIALIZED_NAME_INCLUDE_FILTER)
  private String includeFilter;

  public static final String SERIALIZED_NAME_ATTRIBUTE_TO_LOG = "attributeToLog";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_TO_LOG)
  private List<String> attributeToLog = new ArrayList<>();

  public static final String SERIALIZED_NAME_COLUMN_NAME = "columnName";
  @SerializedName(SERIALIZED_NAME_COLUMN_NAME)
  private List<String> columnName = null;

  public static final String SERIALIZED_NAME_STATISTIC_TYPE = "statisticType";
  @SerializedName(SERIALIZED_NAME_STATISTIC_TYPE)
  private List<EnumcustomLoggedStatsStatisticTypeProp> statisticType = new ArrayList<>();

  public static final String SERIALIZED_NAME_HEADER_PREFIX = "headerPrefix";
  @SerializedName(SERIALIZED_NAME_HEADER_PREFIX)
  private String headerPrefix;

  public static final String SERIALIZED_NAME_HEADER_PREFIX_ATTRIBUTE = "headerPrefixAttribute";
  @SerializedName(SERIALIZED_NAME_HEADER_PREFIX_ATTRIBUTE)
  private String headerPrefixAttribute;

  public static final String SERIALIZED_NAME_REGEX_PATTERN = "regexPattern";
  @SerializedName(SERIALIZED_NAME_REGEX_PATTERN)
  private String regexPattern;

  public static final String SERIALIZED_NAME_REGEX_REPLACEMENT = "regexReplacement";
  @SerializedName(SERIALIZED_NAME_REGEX_REPLACEMENT)
  private String regexReplacement;

  public static final String SERIALIZED_NAME_DIVIDE_VALUE_BY = "divideValueBy";
  @SerializedName(SERIALIZED_NAME_DIVIDE_VALUE_BY)
  private String divideValueBy;

  public static final String SERIALIZED_NAME_DIVIDE_VALUE_BY_ATTRIBUTE = "divideValueByAttribute";
  @SerializedName(SERIALIZED_NAME_DIVIDE_VALUE_BY_ATTRIBUTE)
  private String divideValueByAttribute;

  public static final String SERIALIZED_NAME_DECIMAL_FORMAT = "decimalFormat";
  @SerializedName(SERIALIZED_NAME_DECIMAL_FORMAT)
  private String decimalFormat;

  public static final String SERIALIZED_NAME_NON_ZERO_IMPLIES_NOT_IDLE = "nonZeroImpliesNotIdle";
  @SerializedName(SERIALIZED_NAME_NON_ZERO_IMPLIES_NOT_IDLE)
  private Boolean nonZeroImpliesNotIdle;

  public AddCustomLoggedStatsRequest() {
  }

  public AddCustomLoggedStatsRequest statsName(String statsName) {
    
    
    
    
    this.statsName = statsName;
    return this;
  }

   /**
   * Name of the new Custom Logged Stats
   * @return statsName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the new Custom Logged Stats")

  public String getStatsName() {
    return statsName;
  }


  public void setStatsName(String statsName) {
    
    
    
    this.statsName = statsName;
  }


  public AddCustomLoggedStatsRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Custom Logged Stats
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Custom Logged Stats")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AddCustomLoggedStatsRequest schemas(List<EnumcustomLoggedStatsSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddCustomLoggedStatsRequest addSchemasItem(EnumcustomLoggedStatsSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumcustomLoggedStatsSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumcustomLoggedStatsSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddCustomLoggedStatsRequest enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the Custom Logged Stats object is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the Custom Logged Stats object is enabled.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public AddCustomLoggedStatsRequest monitorObjectclass(String monitorObjectclass) {
    
    
    
    
    this.monitorObjectclass = monitorObjectclass;
    return this;
  }

   /**
   * The objectclass name of the monitor entries to examine for generating these statistics.
   * @return monitorObjectclass
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The objectclass name of the monitor entries to examine for generating these statistics.")

  public String getMonitorObjectclass() {
    return monitorObjectclass;
  }


  public void setMonitorObjectclass(String monitorObjectclass) {
    
    
    
    this.monitorObjectclass = monitorObjectclass;
  }


  public AddCustomLoggedStatsRequest includeFilter(String includeFilter) {
    
    
    
    
    this.includeFilter = includeFilter;
    return this;
  }

   /**
   * An optional LDAP filter that can be used restrict which monitor entries are used to produce the output.
   * @return includeFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional LDAP filter that can be used restrict which monitor entries are used to produce the output.")

  public String getIncludeFilter() {
    return includeFilter;
  }


  public void setIncludeFilter(String includeFilter) {
    
    
    
    this.includeFilter = includeFilter;
  }


  public AddCustomLoggedStatsRequest attributeToLog(List<String> attributeToLog) {
    
    
    
    
    this.attributeToLog = attributeToLog;
    return this;
  }

  public AddCustomLoggedStatsRequest addAttributeToLogItem(String attributeToLogItem) {
    this.attributeToLog.add(attributeToLogItem);
    return this;
  }

   /**
   * Specifies the attributes on the monitor entries that should be included in the output.
   * @return attributeToLog
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the attributes on the monitor entries that should be included in the output.")

  public List<String> getAttributeToLog() {
    return attributeToLog;
  }


  public void setAttributeToLog(List<String> attributeToLog) {
    
    
    
    this.attributeToLog = attributeToLog;
  }


  public AddCustomLoggedStatsRequest columnName(List<String> columnName) {
    
    
    
    
    this.columnName = columnName;
    return this;
  }

  public AddCustomLoggedStatsRequest addColumnNameItem(String columnNameItem) {
    if (this.columnName == null) {
      this.columnName = new ArrayList<>();
    }
    this.columnName.add(columnNameItem);
    return this;
  }

   /**
   * Optionally, specifies an explicit name for each column header instead of having these names automatically generated from the monitored attribute name.
   * @return columnName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optionally, specifies an explicit name for each column header instead of having these names automatically generated from the monitored attribute name.")

  public List<String> getColumnName() {
    return columnName;
  }


  public void setColumnName(List<String> columnName) {
    
    
    
    this.columnName = columnName;
  }


  public AddCustomLoggedStatsRequest statisticType(List<EnumcustomLoggedStatsStatisticTypeProp> statisticType) {
    
    
    
    
    this.statisticType = statisticType;
    return this;
  }

  public AddCustomLoggedStatsRequest addStatisticTypeItem(EnumcustomLoggedStatsStatisticTypeProp statisticTypeItem) {
    this.statisticType.add(statisticTypeItem);
    return this;
  }

   /**
   * Get statisticType
   * @return statisticType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumcustomLoggedStatsStatisticTypeProp> getStatisticType() {
    return statisticType;
  }


  public void setStatisticType(List<EnumcustomLoggedStatsStatisticTypeProp> statisticType) {
    
    
    
    this.statisticType = statisticType;
  }


  public AddCustomLoggedStatsRequest headerPrefix(String headerPrefix) {
    
    
    
    
    this.headerPrefix = headerPrefix;
    return this;
  }

   /**
   * An optional prefix that is included in the header before the column name.
   * @return headerPrefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional prefix that is included in the header before the column name.")

  public String getHeaderPrefix() {
    return headerPrefix;
  }


  public void setHeaderPrefix(String headerPrefix) {
    
    
    
    this.headerPrefix = headerPrefix;
  }


  public AddCustomLoggedStatsRequest headerPrefixAttribute(String headerPrefixAttribute) {
    
    
    
    
    this.headerPrefixAttribute = headerPrefixAttribute;
    return this;
  }

   /**
   * An optional attribute from the monitor entry that is included as a prefix before the column name in the column header.
   * @return headerPrefixAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional attribute from the monitor entry that is included as a prefix before the column name in the column header.")

  public String getHeaderPrefixAttribute() {
    return headerPrefixAttribute;
  }


  public void setHeaderPrefixAttribute(String headerPrefixAttribute) {
    
    
    
    this.headerPrefixAttribute = headerPrefixAttribute;
  }


  public AddCustomLoggedStatsRequest regexPattern(String regexPattern) {
    
    
    
    
    this.regexPattern = regexPattern;
    return this;
  }

   /**
   * An optional regular expression pattern, that when used in conjunction with regex-replacement, can alter the value of the attribute being monitored.
   * @return regexPattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional regular expression pattern, that when used in conjunction with regex-replacement, can alter the value of the attribute being monitored.")

  public String getRegexPattern() {
    return regexPattern;
  }


  public void setRegexPattern(String regexPattern) {
    
    
    
    this.regexPattern = regexPattern;
  }


  public AddCustomLoggedStatsRequest regexReplacement(String regexReplacement) {
    
    
    
    
    this.regexReplacement = regexReplacement;
    return this;
  }

   /**
   * An optional regular expression replacement value, that when used in conjunction with regex-pattern, can alter the value of the attribute being monitored.
   * @return regexReplacement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional regular expression replacement value, that when used in conjunction with regex-pattern, can alter the value of the attribute being monitored.")

  public String getRegexReplacement() {
    return regexReplacement;
  }


  public void setRegexReplacement(String regexReplacement) {
    
    
    
    this.regexReplacement = regexReplacement;
  }


  public AddCustomLoggedStatsRequest divideValueBy(String divideValueBy) {
    
    
    
    
    this.divideValueBy = divideValueBy;
    return this;
  }

   /**
   * An optional floating point value that can be used to scale the resulting value.
   * @return divideValueBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional floating point value that can be used to scale the resulting value.")

  public String getDivideValueBy() {
    return divideValueBy;
  }


  public void setDivideValueBy(String divideValueBy) {
    
    
    
    this.divideValueBy = divideValueBy;
  }


  public AddCustomLoggedStatsRequest divideValueByAttribute(String divideValueByAttribute) {
    
    
    
    
    this.divideValueByAttribute = divideValueByAttribute;
    return this;
  }

   /**
   * An optional property that can scale the resulting value by another attribute in the monitored entry.
   * @return divideValueByAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional property that can scale the resulting value by another attribute in the monitored entry.")

  public String getDivideValueByAttribute() {
    return divideValueByAttribute;
  }


  public void setDivideValueByAttribute(String divideValueByAttribute) {
    
    
    
    this.divideValueByAttribute = divideValueByAttribute;
  }


  public AddCustomLoggedStatsRequest decimalFormat(String decimalFormat) {
    
    
    
    
    this.decimalFormat = decimalFormat;
    return this;
  }

   /**
   * This provides a way to format the monitored attribute value in the output to control the precision for instance.
   * @return decimalFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This provides a way to format the monitored attribute value in the output to control the precision for instance.")

  public String getDecimalFormat() {
    return decimalFormat;
  }


  public void setDecimalFormat(String decimalFormat) {
    
    
    
    this.decimalFormat = decimalFormat;
  }


  public AddCustomLoggedStatsRequest nonZeroImpliesNotIdle(Boolean nonZeroImpliesNotIdle) {
    
    
    
    
    this.nonZeroImpliesNotIdle = nonZeroImpliesNotIdle;
    return this;
  }

   /**
   * If this property is set to true, then the value of any of the monitored attributes here can contribute to whether an interval is considered \&quot;idle\&quot; by the Periodic Stats Logger.
   * @return nonZeroImpliesNotIdle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If this property is set to true, then the value of any of the monitored attributes here can contribute to whether an interval is considered \"idle\" by the Periodic Stats Logger.")

  public Boolean getNonZeroImpliesNotIdle() {
    return nonZeroImpliesNotIdle;
  }


  public void setNonZeroImpliesNotIdle(Boolean nonZeroImpliesNotIdle) {
    
    
    
    this.nonZeroImpliesNotIdle = nonZeroImpliesNotIdle;
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
   * @return the AddCustomLoggedStatsRequest instance itself
   */
  public AddCustomLoggedStatsRequest putAdditionalProperty(String key, Object value) {
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
    AddCustomLoggedStatsRequest addCustomLoggedStatsRequest = (AddCustomLoggedStatsRequest) o;
    return Objects.equals(this.statsName, addCustomLoggedStatsRequest.statsName) &&
        Objects.equals(this.description, addCustomLoggedStatsRequest.description) &&
        Objects.equals(this.schemas, addCustomLoggedStatsRequest.schemas) &&
        Objects.equals(this.enabled, addCustomLoggedStatsRequest.enabled) &&
        Objects.equals(this.monitorObjectclass, addCustomLoggedStatsRequest.monitorObjectclass) &&
        Objects.equals(this.includeFilter, addCustomLoggedStatsRequest.includeFilter) &&
        Objects.equals(this.attributeToLog, addCustomLoggedStatsRequest.attributeToLog) &&
        Objects.equals(this.columnName, addCustomLoggedStatsRequest.columnName) &&
        Objects.equals(this.statisticType, addCustomLoggedStatsRequest.statisticType) &&
        Objects.equals(this.headerPrefix, addCustomLoggedStatsRequest.headerPrefix) &&
        Objects.equals(this.headerPrefixAttribute, addCustomLoggedStatsRequest.headerPrefixAttribute) &&
        Objects.equals(this.regexPattern, addCustomLoggedStatsRequest.regexPattern) &&
        Objects.equals(this.regexReplacement, addCustomLoggedStatsRequest.regexReplacement) &&
        Objects.equals(this.divideValueBy, addCustomLoggedStatsRequest.divideValueBy) &&
        Objects.equals(this.divideValueByAttribute, addCustomLoggedStatsRequest.divideValueByAttribute) &&
        Objects.equals(this.decimalFormat, addCustomLoggedStatsRequest.decimalFormat) &&
        Objects.equals(this.nonZeroImpliesNotIdle, addCustomLoggedStatsRequest.nonZeroImpliesNotIdle)&&
        Objects.equals(this.additionalProperties, addCustomLoggedStatsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statsName, description, schemas, enabled, monitorObjectclass, includeFilter, attributeToLog, columnName, statisticType, headerPrefix, headerPrefixAttribute, regexPattern, regexReplacement, divideValueBy, divideValueByAttribute, decimalFormat, nonZeroImpliesNotIdle, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCustomLoggedStatsRequest {\n");
    sb.append("    statsName: ").append(toIndentedString(statsName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    monitorObjectclass: ").append(toIndentedString(monitorObjectclass)).append("\n");
    sb.append("    includeFilter: ").append(toIndentedString(includeFilter)).append("\n");
    sb.append("    attributeToLog: ").append(toIndentedString(attributeToLog)).append("\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    statisticType: ").append(toIndentedString(statisticType)).append("\n");
    sb.append("    headerPrefix: ").append(toIndentedString(headerPrefix)).append("\n");
    sb.append("    headerPrefixAttribute: ").append(toIndentedString(headerPrefixAttribute)).append("\n");
    sb.append("    regexPattern: ").append(toIndentedString(regexPattern)).append("\n");
    sb.append("    regexReplacement: ").append(toIndentedString(regexReplacement)).append("\n");
    sb.append("    divideValueBy: ").append(toIndentedString(divideValueBy)).append("\n");
    sb.append("    divideValueByAttribute: ").append(toIndentedString(divideValueByAttribute)).append("\n");
    sb.append("    decimalFormat: ").append(toIndentedString(decimalFormat)).append("\n");
    sb.append("    nonZeroImpliesNotIdle: ").append(toIndentedString(nonZeroImpliesNotIdle)).append("\n");
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
    openapiFields.add("statsName");
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("enabled");
    openapiFields.add("monitorObjectclass");
    openapiFields.add("includeFilter");
    openapiFields.add("attributeToLog");
    openapiFields.add("columnName");
    openapiFields.add("statisticType");
    openapiFields.add("headerPrefix");
    openapiFields.add("headerPrefixAttribute");
    openapiFields.add("regexPattern");
    openapiFields.add("regexReplacement");
    openapiFields.add("divideValueBy");
    openapiFields.add("divideValueByAttribute");
    openapiFields.add("decimalFormat");
    openapiFields.add("nonZeroImpliesNotIdle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("statsName");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("monitorObjectclass");
    openapiRequiredFields.add("attributeToLog");
    openapiRequiredFields.add("statisticType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddCustomLoggedStatsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddCustomLoggedStatsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddCustomLoggedStatsRequest is not found in the empty JSON string", AddCustomLoggedStatsRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddCustomLoggedStatsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("statsName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statsName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statsName").toString()));
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
      if (!jsonObj.get("monitorObjectclass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `monitorObjectclass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("monitorObjectclass").toString()));
      }
      if ((jsonObj.get("includeFilter") != null && !jsonObj.get("includeFilter").isJsonNull()) && !jsonObj.get("includeFilter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `includeFilter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("includeFilter").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("attributeToLog") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("attributeToLog").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeToLog` to be an array in the JSON string but got `%s`", jsonObj.get("attributeToLog").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("columnName") != null && !jsonObj.get("columnName").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `columnName` to be an array in the JSON string but got `%s`", jsonObj.get("columnName").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("statisticType") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("statisticType").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `statisticType` to be an array in the JSON string but got `%s`", jsonObj.get("statisticType").toString()));
      }
      if ((jsonObj.get("headerPrefix") != null && !jsonObj.get("headerPrefix").isJsonNull()) && !jsonObj.get("headerPrefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `headerPrefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("headerPrefix").toString()));
      }
      if ((jsonObj.get("headerPrefixAttribute") != null && !jsonObj.get("headerPrefixAttribute").isJsonNull()) && !jsonObj.get("headerPrefixAttribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `headerPrefixAttribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("headerPrefixAttribute").toString()));
      }
      if ((jsonObj.get("regexPattern") != null && !jsonObj.get("regexPattern").isJsonNull()) && !jsonObj.get("regexPattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regexPattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regexPattern").toString()));
      }
      if ((jsonObj.get("regexReplacement") != null && !jsonObj.get("regexReplacement").isJsonNull()) && !jsonObj.get("regexReplacement").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regexReplacement` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regexReplacement").toString()));
      }
      if ((jsonObj.get("divideValueBy") != null && !jsonObj.get("divideValueBy").isJsonNull()) && !jsonObj.get("divideValueBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `divideValueBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("divideValueBy").toString()));
      }
      if ((jsonObj.get("divideValueByAttribute") != null && !jsonObj.get("divideValueByAttribute").isJsonNull()) && !jsonObj.get("divideValueByAttribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `divideValueByAttribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("divideValueByAttribute").toString()));
      }
      if ((jsonObj.get("decimalFormat") != null && !jsonObj.get("decimalFormat").isJsonNull()) && !jsonObj.get("decimalFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `decimalFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("decimalFormat").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddCustomLoggedStatsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddCustomLoggedStatsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddCustomLoggedStatsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddCustomLoggedStatsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddCustomLoggedStatsRequest>() {
           @Override
           public void write(JsonWriter out, AddCustomLoggedStatsRequest value) throws IOException {
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
           public AddCustomLoggedStatsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddCustomLoggedStatsRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddCustomLoggedStatsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddCustomLoggedStatsRequest
  * @throws IOException if the JSON string is invalid with respect to AddCustomLoggedStatsRequest
  */
  public static AddCustomLoggedStatsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddCustomLoggedStatsRequest.class);
  }

 /**
  * Convert an instance of AddCustomLoggedStatsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

