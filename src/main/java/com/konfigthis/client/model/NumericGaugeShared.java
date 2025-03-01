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
import com.konfigthis.client.model.EnumgaugeAlertLevelProp;
import com.konfigthis.client.model.EnumgaugeOverrideSeverityProp;
import com.konfigthis.client.model.EnumgaugeServerDegradedSeverityLevelProp;
import com.konfigthis.client.model.EnumgaugeServerUnavailableSeverityLevelProp;
import com.konfigthis.client.model.EnumnumericGaugeSchemaUrn;
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
 * NumericGaugeShared
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class NumericGaugeShared {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumnumericGaugeSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_GAUGE_DATA_SOURCE = "gaugeDataSource";
  @SerializedName(SERIALIZED_NAME_GAUGE_DATA_SOURCE)
  private String gaugeDataSource;

  public static final String SERIALIZED_NAME_CRITICAL_VALUE = "criticalValue";
  @SerializedName(SERIALIZED_NAME_CRITICAL_VALUE)
  private Double criticalValue;

  public static final String SERIALIZED_NAME_CRITICAL_EXIT_VALUE = "criticalExitValue";
  @SerializedName(SERIALIZED_NAME_CRITICAL_EXIT_VALUE)
  private Double criticalExitValue;

  public static final String SERIALIZED_NAME_MAJOR_VALUE = "majorValue";
  @SerializedName(SERIALIZED_NAME_MAJOR_VALUE)
  private Double majorValue;

  public static final String SERIALIZED_NAME_MAJOR_EXIT_VALUE = "majorExitValue";
  @SerializedName(SERIALIZED_NAME_MAJOR_EXIT_VALUE)
  private Double majorExitValue;

  public static final String SERIALIZED_NAME_MINOR_VALUE = "minorValue";
  @SerializedName(SERIALIZED_NAME_MINOR_VALUE)
  private Double minorValue;

  public static final String SERIALIZED_NAME_MINOR_EXIT_VALUE = "minorExitValue";
  @SerializedName(SERIALIZED_NAME_MINOR_EXIT_VALUE)
  private Double minorExitValue;

  public static final String SERIALIZED_NAME_WARNING_VALUE = "warningValue";
  @SerializedName(SERIALIZED_NAME_WARNING_VALUE)
  private Double warningValue;

  public static final String SERIALIZED_NAME_WARNING_EXIT_VALUE = "warningExitValue";
  @SerializedName(SERIALIZED_NAME_WARNING_EXIT_VALUE)
  private Double warningExitValue;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_OVERRIDE_SEVERITY = "overrideSeverity";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_SEVERITY)
  private EnumgaugeOverrideSeverityProp overrideSeverity;

  public static final String SERIALIZED_NAME_ALERT_LEVEL = "alertLevel";
  @SerializedName(SERIALIZED_NAME_ALERT_LEVEL)
  private EnumgaugeAlertLevelProp alertLevel;

  public static final String SERIALIZED_NAME_UPDATE_INTERVAL = "updateInterval";
  @SerializedName(SERIALIZED_NAME_UPDATE_INTERVAL)
  private String updateInterval;

  public static final String SERIALIZED_NAME_SAMPLES_PER_UPDATE_INTERVAL = "samplesPerUpdateInterval";
  @SerializedName(SERIALIZED_NAME_SAMPLES_PER_UPDATE_INTERVAL)
  private Integer samplesPerUpdateInterval;

  public static final String SERIALIZED_NAME_INCLUDE_RESOURCE = "includeResource";
  @SerializedName(SERIALIZED_NAME_INCLUDE_RESOURCE)
  private List<String> includeResource = null;

  public static final String SERIALIZED_NAME_EXCLUDE_RESOURCE = "excludeResource";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_RESOURCE)
  private List<String> excludeResource = null;

  public static final String SERIALIZED_NAME_SERVER_UNAVAILABLE_SEVERITY_LEVEL = "serverUnavailableSeverityLevel";
  @SerializedName(SERIALIZED_NAME_SERVER_UNAVAILABLE_SEVERITY_LEVEL)
  private EnumgaugeServerUnavailableSeverityLevelProp serverUnavailableSeverityLevel;

  public static final String SERIALIZED_NAME_SERVER_DEGRADED_SEVERITY_LEVEL = "serverDegradedSeverityLevel";
  @SerializedName(SERIALIZED_NAME_SERVER_DEGRADED_SEVERITY_LEVEL)
  private EnumgaugeServerDegradedSeverityLevelProp serverDegradedSeverityLevel;

  public NumericGaugeShared() {
  }

  public NumericGaugeShared description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Gauge
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Gauge")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public NumericGaugeShared schemas(List<EnumnumericGaugeSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public NumericGaugeShared addSchemasItem(EnumnumericGaugeSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumnumericGaugeSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumnumericGaugeSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public NumericGaugeShared gaugeDataSource(String gaugeDataSource) {
    
    
    
    
    this.gaugeDataSource = gaugeDataSource;
    return this;
  }

   /**
   * Specifies the source of data to use in determining this gauge&#39;s current severity.
   * @return gaugeDataSource
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the source of data to use in determining this gauge's current severity.")

  public String getGaugeDataSource() {
    return gaugeDataSource;
  }


  public void setGaugeDataSource(String gaugeDataSource) {
    
    
    
    this.gaugeDataSource = gaugeDataSource;
  }


  public NumericGaugeShared criticalValue(Double criticalValue) {
    
    
    
    
    this.criticalValue = criticalValue;
    return this;
  }

  public NumericGaugeShared criticalValue(Integer criticalValue) {
    
    
    
    
    this.criticalValue = criticalValue.doubleValue();
    return this;
  }

   /**
   * A value that is used to determine whether the current monitored value indicates this gauge&#39;s severity should be &#39;critical&#39;.
   * @return criticalValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A value that is used to determine whether the current monitored value indicates this gauge's severity should be 'critical'.")

  public Double getCriticalValue() {
    return criticalValue;
  }


  public void setCriticalValue(Double criticalValue) {
    
    
    
    this.criticalValue = criticalValue;
  }


  public NumericGaugeShared criticalExitValue(Double criticalExitValue) {
    
    
    
    
    this.criticalExitValue = criticalExitValue;
    return this;
  }

  public NumericGaugeShared criticalExitValue(Integer criticalExitValue) {
    
    
    
    
    this.criticalExitValue = criticalExitValue.doubleValue();
    return this;
  }

   /**
   * A value that is used to determine whether the current monitored value indicates this gauge&#39;s severity should no longer be &#39;critical&#39;.
   * @return criticalExitValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A value that is used to determine whether the current monitored value indicates this gauge's severity should no longer be 'critical'.")

  public Double getCriticalExitValue() {
    return criticalExitValue;
  }


  public void setCriticalExitValue(Double criticalExitValue) {
    
    
    
    this.criticalExitValue = criticalExitValue;
  }


  public NumericGaugeShared majorValue(Double majorValue) {
    
    
    
    
    this.majorValue = majorValue;
    return this;
  }

  public NumericGaugeShared majorValue(Integer majorValue) {
    
    
    
    
    this.majorValue = majorValue.doubleValue();
    return this;
  }

   /**
   * A value that is used to determine whether the current monitored value indicates this gauge&#39;s severity should be &#39;major&#39;.
   * @return majorValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A value that is used to determine whether the current monitored value indicates this gauge's severity should be 'major'.")

  public Double getMajorValue() {
    return majorValue;
  }


  public void setMajorValue(Double majorValue) {
    
    
    
    this.majorValue = majorValue;
  }


  public NumericGaugeShared majorExitValue(Double majorExitValue) {
    
    
    
    
    this.majorExitValue = majorExitValue;
    return this;
  }

  public NumericGaugeShared majorExitValue(Integer majorExitValue) {
    
    
    
    
    this.majorExitValue = majorExitValue.doubleValue();
    return this;
  }

   /**
   * A value that is used to determine whether the current monitored value indicates this gauge&#39;s severity should no longer be &#39;major&#39;.
   * @return majorExitValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A value that is used to determine whether the current monitored value indicates this gauge's severity should no longer be 'major'.")

  public Double getMajorExitValue() {
    return majorExitValue;
  }


  public void setMajorExitValue(Double majorExitValue) {
    
    
    
    this.majorExitValue = majorExitValue;
  }


  public NumericGaugeShared minorValue(Double minorValue) {
    
    
    
    
    this.minorValue = minorValue;
    return this;
  }

  public NumericGaugeShared minorValue(Integer minorValue) {
    
    
    
    
    this.minorValue = minorValue.doubleValue();
    return this;
  }

   /**
   * A value that is used to determine whether the current monitored value indicates this gauge&#39;s severity should be &#39;minor&#39;.
   * @return minorValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A value that is used to determine whether the current monitored value indicates this gauge's severity should be 'minor'.")

  public Double getMinorValue() {
    return minorValue;
  }


  public void setMinorValue(Double minorValue) {
    
    
    
    this.minorValue = minorValue;
  }


  public NumericGaugeShared minorExitValue(Double minorExitValue) {
    
    
    
    
    this.minorExitValue = minorExitValue;
    return this;
  }

  public NumericGaugeShared minorExitValue(Integer minorExitValue) {
    
    
    
    
    this.minorExitValue = minorExitValue.doubleValue();
    return this;
  }

   /**
   * A value that is used to determine whether the current monitored value indicates this gauge&#39;s severity should no longer be &#39;minor&#39;.
   * @return minorExitValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A value that is used to determine whether the current monitored value indicates this gauge's severity should no longer be 'minor'.")

  public Double getMinorExitValue() {
    return minorExitValue;
  }


  public void setMinorExitValue(Double minorExitValue) {
    
    
    
    this.minorExitValue = minorExitValue;
  }


  public NumericGaugeShared warningValue(Double warningValue) {
    
    
    
    
    this.warningValue = warningValue;
    return this;
  }

  public NumericGaugeShared warningValue(Integer warningValue) {
    
    
    
    
    this.warningValue = warningValue.doubleValue();
    return this;
  }

   /**
   * A value that is used to determine whether the current monitored value indicates this gauge&#39;s severity should be &#39;warning&#39;.
   * @return warningValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A value that is used to determine whether the current monitored value indicates this gauge's severity should be 'warning'.")

  public Double getWarningValue() {
    return warningValue;
  }


  public void setWarningValue(Double warningValue) {
    
    
    
    this.warningValue = warningValue;
  }


  public NumericGaugeShared warningExitValue(Double warningExitValue) {
    
    
    
    
    this.warningExitValue = warningExitValue;
    return this;
  }

  public NumericGaugeShared warningExitValue(Integer warningExitValue) {
    
    
    
    
    this.warningExitValue = warningExitValue.doubleValue();
    return this;
  }

   /**
   * A value that is used to determine whether the current monitored value indicates this gauge&#39;s severity should no longer be &#39;warning&#39;.
   * @return warningExitValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A value that is used to determine whether the current monitored value indicates this gauge's severity should no longer be 'warning'.")

  public Double getWarningExitValue() {
    return warningExitValue;
  }


  public void setWarningExitValue(Double warningExitValue) {
    
    
    
    this.warningExitValue = warningExitValue;
  }


  public NumericGaugeShared enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether this Gauge is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether this Gauge is enabled.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public NumericGaugeShared overrideSeverity(EnumgaugeOverrideSeverityProp overrideSeverity) {
    
    
    
    
    this.overrideSeverity = overrideSeverity;
    return this;
  }

   /**
   * Get overrideSeverity
   * @return overrideSeverity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumgaugeOverrideSeverityProp getOverrideSeverity() {
    return overrideSeverity;
  }


  public void setOverrideSeverity(EnumgaugeOverrideSeverityProp overrideSeverity) {
    
    
    
    this.overrideSeverity = overrideSeverity;
  }


  public NumericGaugeShared alertLevel(EnumgaugeAlertLevelProp alertLevel) {
    
    
    
    
    this.alertLevel = alertLevel;
    return this;
  }

   /**
   * Get alertLevel
   * @return alertLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumgaugeAlertLevelProp getAlertLevel() {
    return alertLevel;
  }


  public void setAlertLevel(EnumgaugeAlertLevelProp alertLevel) {
    
    
    
    this.alertLevel = alertLevel;
  }


  public NumericGaugeShared updateInterval(String updateInterval) {
    
    
    
    
    this.updateInterval = updateInterval;
    return this;
  }

   /**
   * The frequency with which this Gauge is updated.
   * @return updateInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The frequency with which this Gauge is updated.")

  public String getUpdateInterval() {
    return updateInterval;
  }


  public void setUpdateInterval(String updateInterval) {
    
    
    
    this.updateInterval = updateInterval;
  }


  public NumericGaugeShared samplesPerUpdateInterval(Integer samplesPerUpdateInterval) {
    
    
    
    
    this.samplesPerUpdateInterval = samplesPerUpdateInterval;
    return this;
  }

   /**
   * Indicates the number of times the monitor data source value will be collected during the update interval.
   * @return samplesPerUpdateInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the number of times the monitor data source value will be collected during the update interval.")

  public Integer getSamplesPerUpdateInterval() {
    return samplesPerUpdateInterval;
  }


  public void setSamplesPerUpdateInterval(Integer samplesPerUpdateInterval) {
    
    
    
    this.samplesPerUpdateInterval = samplesPerUpdateInterval;
  }


  public NumericGaugeShared includeResource(List<String> includeResource) {
    
    
    
    
    this.includeResource = includeResource;
    return this;
  }

  public NumericGaugeShared addIncludeResourceItem(String includeResourceItem) {
    if (this.includeResource == null) {
      this.includeResource = new ArrayList<>();
    }
    this.includeResource.add(includeResourceItem);
    return this;
  }

   /**
   * Specifies set of resources to be monitored.
   * @return includeResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies set of resources to be monitored.")

  public List<String> getIncludeResource() {
    return includeResource;
  }


  public void setIncludeResource(List<String> includeResource) {
    
    
    
    this.includeResource = includeResource;
  }


  public NumericGaugeShared excludeResource(List<String> excludeResource) {
    
    
    
    
    this.excludeResource = excludeResource;
    return this;
  }

  public NumericGaugeShared addExcludeResourceItem(String excludeResourceItem) {
    if (this.excludeResource == null) {
      this.excludeResource = new ArrayList<>();
    }
    this.excludeResource.add(excludeResourceItem);
    return this;
  }

   /**
   * Specifies resources to exclude from being monitored.
   * @return excludeResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies resources to exclude from being monitored.")

  public List<String> getExcludeResource() {
    return excludeResource;
  }


  public void setExcludeResource(List<String> excludeResource) {
    
    
    
    this.excludeResource = excludeResource;
  }


  public NumericGaugeShared serverUnavailableSeverityLevel(EnumgaugeServerUnavailableSeverityLevelProp serverUnavailableSeverityLevel) {
    
    
    
    
    this.serverUnavailableSeverityLevel = serverUnavailableSeverityLevel;
    return this;
  }

   /**
   * Get serverUnavailableSeverityLevel
   * @return serverUnavailableSeverityLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumgaugeServerUnavailableSeverityLevelProp getServerUnavailableSeverityLevel() {
    return serverUnavailableSeverityLevel;
  }


  public void setServerUnavailableSeverityLevel(EnumgaugeServerUnavailableSeverityLevelProp serverUnavailableSeverityLevel) {
    
    
    
    this.serverUnavailableSeverityLevel = serverUnavailableSeverityLevel;
  }


  public NumericGaugeShared serverDegradedSeverityLevel(EnumgaugeServerDegradedSeverityLevelProp serverDegradedSeverityLevel) {
    
    
    
    
    this.serverDegradedSeverityLevel = serverDegradedSeverityLevel;
    return this;
  }

   /**
   * Get serverDegradedSeverityLevel
   * @return serverDegradedSeverityLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumgaugeServerDegradedSeverityLevelProp getServerDegradedSeverityLevel() {
    return serverDegradedSeverityLevel;
  }


  public void setServerDegradedSeverityLevel(EnumgaugeServerDegradedSeverityLevelProp serverDegradedSeverityLevel) {
    
    
    
    this.serverDegradedSeverityLevel = serverDegradedSeverityLevel;
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
   * @return the NumericGaugeShared instance itself
   */
  public NumericGaugeShared putAdditionalProperty(String key, Object value) {
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
    NumericGaugeShared numericGaugeShared = (NumericGaugeShared) o;
    return Objects.equals(this.description, numericGaugeShared.description) &&
        Objects.equals(this.schemas, numericGaugeShared.schemas) &&
        Objects.equals(this.gaugeDataSource, numericGaugeShared.gaugeDataSource) &&
        Objects.equals(this.criticalValue, numericGaugeShared.criticalValue) &&
        Objects.equals(this.criticalExitValue, numericGaugeShared.criticalExitValue) &&
        Objects.equals(this.majorValue, numericGaugeShared.majorValue) &&
        Objects.equals(this.majorExitValue, numericGaugeShared.majorExitValue) &&
        Objects.equals(this.minorValue, numericGaugeShared.minorValue) &&
        Objects.equals(this.minorExitValue, numericGaugeShared.minorExitValue) &&
        Objects.equals(this.warningValue, numericGaugeShared.warningValue) &&
        Objects.equals(this.warningExitValue, numericGaugeShared.warningExitValue) &&
        Objects.equals(this.enabled, numericGaugeShared.enabled) &&
        Objects.equals(this.overrideSeverity, numericGaugeShared.overrideSeverity) &&
        Objects.equals(this.alertLevel, numericGaugeShared.alertLevel) &&
        Objects.equals(this.updateInterval, numericGaugeShared.updateInterval) &&
        Objects.equals(this.samplesPerUpdateInterval, numericGaugeShared.samplesPerUpdateInterval) &&
        Objects.equals(this.includeResource, numericGaugeShared.includeResource) &&
        Objects.equals(this.excludeResource, numericGaugeShared.excludeResource) &&
        Objects.equals(this.serverUnavailableSeverityLevel, numericGaugeShared.serverUnavailableSeverityLevel) &&
        Objects.equals(this.serverDegradedSeverityLevel, numericGaugeShared.serverDegradedSeverityLevel)&&
        Objects.equals(this.additionalProperties, numericGaugeShared.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, gaugeDataSource, criticalValue, criticalExitValue, majorValue, majorExitValue, minorValue, minorExitValue, warningValue, warningExitValue, enabled, overrideSeverity, alertLevel, updateInterval, samplesPerUpdateInterval, includeResource, excludeResource, serverUnavailableSeverityLevel, serverDegradedSeverityLevel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumericGaugeShared {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    gaugeDataSource: ").append(toIndentedString(gaugeDataSource)).append("\n");
    sb.append("    criticalValue: ").append(toIndentedString(criticalValue)).append("\n");
    sb.append("    criticalExitValue: ").append(toIndentedString(criticalExitValue)).append("\n");
    sb.append("    majorValue: ").append(toIndentedString(majorValue)).append("\n");
    sb.append("    majorExitValue: ").append(toIndentedString(majorExitValue)).append("\n");
    sb.append("    minorValue: ").append(toIndentedString(minorValue)).append("\n");
    sb.append("    minorExitValue: ").append(toIndentedString(minorExitValue)).append("\n");
    sb.append("    warningValue: ").append(toIndentedString(warningValue)).append("\n");
    sb.append("    warningExitValue: ").append(toIndentedString(warningExitValue)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    overrideSeverity: ").append(toIndentedString(overrideSeverity)).append("\n");
    sb.append("    alertLevel: ").append(toIndentedString(alertLevel)).append("\n");
    sb.append("    updateInterval: ").append(toIndentedString(updateInterval)).append("\n");
    sb.append("    samplesPerUpdateInterval: ").append(toIndentedString(samplesPerUpdateInterval)).append("\n");
    sb.append("    includeResource: ").append(toIndentedString(includeResource)).append("\n");
    sb.append("    excludeResource: ").append(toIndentedString(excludeResource)).append("\n");
    sb.append("    serverUnavailableSeverityLevel: ").append(toIndentedString(serverUnavailableSeverityLevel)).append("\n");
    sb.append("    serverDegradedSeverityLevel: ").append(toIndentedString(serverDegradedSeverityLevel)).append("\n");
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
    openapiFields.add("gaugeDataSource");
    openapiFields.add("criticalValue");
    openapiFields.add("criticalExitValue");
    openapiFields.add("majorValue");
    openapiFields.add("majorExitValue");
    openapiFields.add("minorValue");
    openapiFields.add("minorExitValue");
    openapiFields.add("warningValue");
    openapiFields.add("warningExitValue");
    openapiFields.add("enabled");
    openapiFields.add("overrideSeverity");
    openapiFields.add("alertLevel");
    openapiFields.add("updateInterval");
    openapiFields.add("samplesPerUpdateInterval");
    openapiFields.add("includeResource");
    openapiFields.add("excludeResource");
    openapiFields.add("serverUnavailableSeverityLevel");
    openapiFields.add("serverDegradedSeverityLevel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("gaugeDataSource");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NumericGaugeShared
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NumericGaugeShared.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NumericGaugeShared is not found in the empty JSON string", NumericGaugeShared.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NumericGaugeShared.openapiRequiredFields) {
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
      if (!jsonObj.get("gaugeDataSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gaugeDataSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gaugeDataSource").toString()));
      }
      if ((jsonObj.get("updateInterval") != null && !jsonObj.get("updateInterval").isJsonNull()) && !jsonObj.get("updateInterval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateInterval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateInterval").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("includeResource") != null && !jsonObj.get("includeResource").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includeResource` to be an array in the JSON string but got `%s`", jsonObj.get("includeResource").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("excludeResource") != null && !jsonObj.get("excludeResource").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludeResource` to be an array in the JSON string but got `%s`", jsonObj.get("excludeResource").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NumericGaugeShared.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NumericGaugeShared' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NumericGaugeShared> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NumericGaugeShared.class));

       return (TypeAdapter<T>) new TypeAdapter<NumericGaugeShared>() {
           @Override
           public void write(JsonWriter out, NumericGaugeShared value) throws IOException {
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
           public NumericGaugeShared read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NumericGaugeShared instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of NumericGaugeShared given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NumericGaugeShared
  * @throws IOException if the JSON string is invalid with respect to NumericGaugeShared
  */
  public static NumericGaugeShared fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NumericGaugeShared.class);
  }

 /**
  * Convert an instance of NumericGaugeShared to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

