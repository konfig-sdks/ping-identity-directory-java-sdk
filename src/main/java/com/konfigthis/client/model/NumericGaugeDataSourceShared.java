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
import com.konfigthis.client.model.EnumgaugeDataSourceDataOrientationProp;
import com.konfigthis.client.model.EnumgaugeDataSourceStatisticTypeProp;
import com.konfigthis.client.model.EnumnumericGaugeDataSourceSchemaUrn;
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
 * NumericGaugeDataSourceShared
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class NumericGaugeDataSourceShared {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumnumericGaugeDataSourceSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATA_ORIENTATION = "dataOrientation";
  @SerializedName(SERIALIZED_NAME_DATA_ORIENTATION)
  private EnumgaugeDataSourceDataOrientationProp dataOrientation;

  public static final String SERIALIZED_NAME_STATISTIC_TYPE = "statisticType";
  @SerializedName(SERIALIZED_NAME_STATISTIC_TYPE)
  private EnumgaugeDataSourceStatisticTypeProp statisticType;

  public static final String SERIALIZED_NAME_DIVIDE_VALUE_BY = "divideValueBy";
  @SerializedName(SERIALIZED_NAME_DIVIDE_VALUE_BY)
  private Double divideValueBy;

  public static final String SERIALIZED_NAME_DIVIDE_VALUE_BY_ATTRIBUTE = "divideValueByAttribute";
  @SerializedName(SERIALIZED_NAME_DIVIDE_VALUE_BY_ATTRIBUTE)
  private String divideValueByAttribute;

  public static final String SERIALIZED_NAME_DIVIDE_VALUE_BY_COUNTER_ATTRIBUTE = "divideValueByCounterAttribute";
  @SerializedName(SERIALIZED_NAME_DIVIDE_VALUE_BY_COUNTER_ATTRIBUTE)
  private String divideValueByCounterAttribute;

  public static final String SERIALIZED_NAME_ADDITIONAL_TEXT = "additionalText";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_TEXT)
  private String additionalText;

  public static final String SERIALIZED_NAME_MONITOR_OBJECTCLASS = "monitorObjectclass";
  @SerializedName(SERIALIZED_NAME_MONITOR_OBJECTCLASS)
  private String monitorObjectclass;

  public static final String SERIALIZED_NAME_MONITOR_ATTRIBUTE = "monitorAttribute";
  @SerializedName(SERIALIZED_NAME_MONITOR_ATTRIBUTE)
  private String monitorAttribute;

  public static final String SERIALIZED_NAME_INCLUDE_FILTER = "includeFilter";
  @SerializedName(SERIALIZED_NAME_INCLUDE_FILTER)
  private String includeFilter;

  public static final String SERIALIZED_NAME_RESOURCE_ATTRIBUTE = "resourceAttribute";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ATTRIBUTE)
  private String resourceAttribute;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resourceType";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public static final String SERIALIZED_NAME_MINIMUM_UPDATE_INTERVAL = "minimumUpdateInterval";
  @SerializedName(SERIALIZED_NAME_MINIMUM_UPDATE_INTERVAL)
  private String minimumUpdateInterval;

  public NumericGaugeDataSourceShared() {
  }

  public NumericGaugeDataSourceShared description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Gauge Data Source
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Gauge Data Source")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public NumericGaugeDataSourceShared schemas(List<EnumnumericGaugeDataSourceSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public NumericGaugeDataSourceShared addSchemasItem(EnumnumericGaugeDataSourceSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumnumericGaugeDataSourceSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumnumericGaugeDataSourceSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public NumericGaugeDataSourceShared dataOrientation(EnumgaugeDataSourceDataOrientationProp dataOrientation) {
    
    
    
    
    this.dataOrientation = dataOrientation;
    return this;
  }

   /**
   * Get dataOrientation
   * @return dataOrientation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumgaugeDataSourceDataOrientationProp getDataOrientation() {
    return dataOrientation;
  }


  public void setDataOrientation(EnumgaugeDataSourceDataOrientationProp dataOrientation) {
    
    
    
    this.dataOrientation = dataOrientation;
  }


  public NumericGaugeDataSourceShared statisticType(EnumgaugeDataSourceStatisticTypeProp statisticType) {
    
    
    
    
    this.statisticType = statisticType;
    return this;
  }

   /**
   * Get statisticType
   * @return statisticType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumgaugeDataSourceStatisticTypeProp getStatisticType() {
    return statisticType;
  }


  public void setStatisticType(EnumgaugeDataSourceStatisticTypeProp statisticType) {
    
    
    
    this.statisticType = statisticType;
  }


  public NumericGaugeDataSourceShared divideValueBy(Double divideValueBy) {
    
    
    
    
    this.divideValueBy = divideValueBy;
    return this;
  }

  public NumericGaugeDataSourceShared divideValueBy(Integer divideValueBy) {
    
    
    
    
    this.divideValueBy = divideValueBy.doubleValue();
    return this;
  }

   /**
   * An optional floating point value that can be used to scale the resulting value.
   * @return divideValueBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional floating point value that can be used to scale the resulting value.")

  public Double getDivideValueBy() {
    return divideValueBy;
  }


  public void setDivideValueBy(Double divideValueBy) {
    
    
    
    this.divideValueBy = divideValueBy;
  }


  public NumericGaugeDataSourceShared divideValueByAttribute(String divideValueByAttribute) {
    
    
    
    
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


  public NumericGaugeDataSourceShared divideValueByCounterAttribute(String divideValueByCounterAttribute) {
    
    
    
    
    this.divideValueByCounterAttribute = divideValueByCounterAttribute;
    return this;
  }

   /**
   * An optional property that can scale the resulting value by another attribute whose value represents a counter in the monitored entry.
   * @return divideValueByCounterAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional property that can scale the resulting value by another attribute whose value represents a counter in the monitored entry.")

  public String getDivideValueByCounterAttribute() {
    return divideValueByCounterAttribute;
  }


  public void setDivideValueByCounterAttribute(String divideValueByCounterAttribute) {
    
    
    
    this.divideValueByCounterAttribute = divideValueByCounterAttribute;
  }


  public NumericGaugeDataSourceShared additionalText(String additionalText) {
    
    
    
    
    this.additionalText = additionalText;
    return this;
  }

   /**
   * Additional information about the source of this data that is added to alerts sent as a result of gauges that use this Gauge Data Source.
   * @return additionalText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional information about the source of this data that is added to alerts sent as a result of gauges that use this Gauge Data Source.")

  public String getAdditionalText() {
    return additionalText;
  }


  public void setAdditionalText(String additionalText) {
    
    
    
    this.additionalText = additionalText;
  }


  public NumericGaugeDataSourceShared monitorObjectclass(String monitorObjectclass) {
    
    
    
    
    this.monitorObjectclass = monitorObjectclass;
    return this;
  }

   /**
   * The object class name of the monitor entries to examine for generating gauge data.
   * @return monitorObjectclass
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The object class name of the monitor entries to examine for generating gauge data.")

  public String getMonitorObjectclass() {
    return monitorObjectclass;
  }


  public void setMonitorObjectclass(String monitorObjectclass) {
    
    
    
    this.monitorObjectclass = monitorObjectclass;
  }


  public NumericGaugeDataSourceShared monitorAttribute(String monitorAttribute) {
    
    
    
    
    this.monitorAttribute = monitorAttribute;
    return this;
  }

   /**
   * Specifies the attribute on the monitor entries from which to derive the current gauge value.
   * @return monitorAttribute
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the attribute on the monitor entries from which to derive the current gauge value.")

  public String getMonitorAttribute() {
    return monitorAttribute;
  }


  public void setMonitorAttribute(String monitorAttribute) {
    
    
    
    this.monitorAttribute = monitorAttribute;
  }


  public NumericGaugeDataSourceShared includeFilter(String includeFilter) {
    
    
    
    
    this.includeFilter = includeFilter;
    return this;
  }

   /**
   * An optional LDAP filter that can be used restrict which monitor entries are used to compute output.
   * @return includeFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional LDAP filter that can be used restrict which monitor entries are used to compute output.")

  public String getIncludeFilter() {
    return includeFilter;
  }


  public void setIncludeFilter(String includeFilter) {
    
    
    
    this.includeFilter = includeFilter;
  }


  public NumericGaugeDataSourceShared resourceAttribute(String resourceAttribute) {
    
    
    
    
    this.resourceAttribute = resourceAttribute;
    return this;
  }

   /**
   * Specifies the attribute whose value is used to identify the specific resource being monitored (e.g. device name).
   * @return resourceAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the attribute whose value is used to identify the specific resource being monitored (e.g. device name).")

  public String getResourceAttribute() {
    return resourceAttribute;
  }


  public void setResourceAttribute(String resourceAttribute) {
    
    
    
    this.resourceAttribute = resourceAttribute;
  }


  public NumericGaugeDataSourceShared resourceType(String resourceType) {
    
    
    
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * A string indicating the type of resource being monitored.
   * @return resourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string indicating the type of resource being monitored.")

  public String getResourceType() {
    return resourceType;
  }


  public void setResourceType(String resourceType) {
    
    
    
    this.resourceType = resourceType;
  }


  public NumericGaugeDataSourceShared minimumUpdateInterval(String minimumUpdateInterval) {
    
    
    
    
    this.minimumUpdateInterval = minimumUpdateInterval;
    return this;
  }

   /**
   * The minimum frequency with which gauges using this Gauge Data Source can be configured for update. In order to prevent undesirable side effects, some Gauge Data Sources may use this property to impose a higher bound on the update frequency of gauges.
   * @return minimumUpdateInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum frequency with which gauges using this Gauge Data Source can be configured for update. In order to prevent undesirable side effects, some Gauge Data Sources may use this property to impose a higher bound on the update frequency of gauges.")

  public String getMinimumUpdateInterval() {
    return minimumUpdateInterval;
  }


  public void setMinimumUpdateInterval(String minimumUpdateInterval) {
    
    
    
    this.minimumUpdateInterval = minimumUpdateInterval;
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
   * @return the NumericGaugeDataSourceShared instance itself
   */
  public NumericGaugeDataSourceShared putAdditionalProperty(String key, Object value) {
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
    NumericGaugeDataSourceShared numericGaugeDataSourceShared = (NumericGaugeDataSourceShared) o;
    return Objects.equals(this.description, numericGaugeDataSourceShared.description) &&
        Objects.equals(this.schemas, numericGaugeDataSourceShared.schemas) &&
        Objects.equals(this.dataOrientation, numericGaugeDataSourceShared.dataOrientation) &&
        Objects.equals(this.statisticType, numericGaugeDataSourceShared.statisticType) &&
        Objects.equals(this.divideValueBy, numericGaugeDataSourceShared.divideValueBy) &&
        Objects.equals(this.divideValueByAttribute, numericGaugeDataSourceShared.divideValueByAttribute) &&
        Objects.equals(this.divideValueByCounterAttribute, numericGaugeDataSourceShared.divideValueByCounterAttribute) &&
        Objects.equals(this.additionalText, numericGaugeDataSourceShared.additionalText) &&
        Objects.equals(this.monitorObjectclass, numericGaugeDataSourceShared.monitorObjectclass) &&
        Objects.equals(this.monitorAttribute, numericGaugeDataSourceShared.monitorAttribute) &&
        Objects.equals(this.includeFilter, numericGaugeDataSourceShared.includeFilter) &&
        Objects.equals(this.resourceAttribute, numericGaugeDataSourceShared.resourceAttribute) &&
        Objects.equals(this.resourceType, numericGaugeDataSourceShared.resourceType) &&
        Objects.equals(this.minimumUpdateInterval, numericGaugeDataSourceShared.minimumUpdateInterval)&&
        Objects.equals(this.additionalProperties, numericGaugeDataSourceShared.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, dataOrientation, statisticType, divideValueBy, divideValueByAttribute, divideValueByCounterAttribute, additionalText, monitorObjectclass, monitorAttribute, includeFilter, resourceAttribute, resourceType, minimumUpdateInterval, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumericGaugeDataSourceShared {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    dataOrientation: ").append(toIndentedString(dataOrientation)).append("\n");
    sb.append("    statisticType: ").append(toIndentedString(statisticType)).append("\n");
    sb.append("    divideValueBy: ").append(toIndentedString(divideValueBy)).append("\n");
    sb.append("    divideValueByAttribute: ").append(toIndentedString(divideValueByAttribute)).append("\n");
    sb.append("    divideValueByCounterAttribute: ").append(toIndentedString(divideValueByCounterAttribute)).append("\n");
    sb.append("    additionalText: ").append(toIndentedString(additionalText)).append("\n");
    sb.append("    monitorObjectclass: ").append(toIndentedString(monitorObjectclass)).append("\n");
    sb.append("    monitorAttribute: ").append(toIndentedString(monitorAttribute)).append("\n");
    sb.append("    includeFilter: ").append(toIndentedString(includeFilter)).append("\n");
    sb.append("    resourceAttribute: ").append(toIndentedString(resourceAttribute)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    minimumUpdateInterval: ").append(toIndentedString(minimumUpdateInterval)).append("\n");
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
    openapiFields.add("dataOrientation");
    openapiFields.add("statisticType");
    openapiFields.add("divideValueBy");
    openapiFields.add("divideValueByAttribute");
    openapiFields.add("divideValueByCounterAttribute");
    openapiFields.add("additionalText");
    openapiFields.add("monitorObjectclass");
    openapiFields.add("monitorAttribute");
    openapiFields.add("includeFilter");
    openapiFields.add("resourceAttribute");
    openapiFields.add("resourceType");
    openapiFields.add("minimumUpdateInterval");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("monitorObjectclass");
    openapiRequiredFields.add("monitorAttribute");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NumericGaugeDataSourceShared
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NumericGaugeDataSourceShared.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NumericGaugeDataSourceShared is not found in the empty JSON string", NumericGaugeDataSourceShared.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NumericGaugeDataSourceShared.openapiRequiredFields) {
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
      if ((jsonObj.get("divideValueByAttribute") != null && !jsonObj.get("divideValueByAttribute").isJsonNull()) && !jsonObj.get("divideValueByAttribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `divideValueByAttribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("divideValueByAttribute").toString()));
      }
      if ((jsonObj.get("divideValueByCounterAttribute") != null && !jsonObj.get("divideValueByCounterAttribute").isJsonNull()) && !jsonObj.get("divideValueByCounterAttribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `divideValueByCounterAttribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("divideValueByCounterAttribute").toString()));
      }
      if ((jsonObj.get("additionalText") != null && !jsonObj.get("additionalText").isJsonNull()) && !jsonObj.get("additionalText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additionalText").toString()));
      }
      if (!jsonObj.get("monitorObjectclass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `monitorObjectclass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("monitorObjectclass").toString()));
      }
      if (!jsonObj.get("monitorAttribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `monitorAttribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("monitorAttribute").toString()));
      }
      if ((jsonObj.get("includeFilter") != null && !jsonObj.get("includeFilter").isJsonNull()) && !jsonObj.get("includeFilter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `includeFilter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("includeFilter").toString()));
      }
      if ((jsonObj.get("resourceAttribute") != null && !jsonObj.get("resourceAttribute").isJsonNull()) && !jsonObj.get("resourceAttribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceAttribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceAttribute").toString()));
      }
      if ((jsonObj.get("resourceType") != null && !jsonObj.get("resourceType").isJsonNull()) && !jsonObj.get("resourceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceType").toString()));
      }
      if ((jsonObj.get("minimumUpdateInterval") != null && !jsonObj.get("minimumUpdateInterval").isJsonNull()) && !jsonObj.get("minimumUpdateInterval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minimumUpdateInterval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minimumUpdateInterval").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NumericGaugeDataSourceShared.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NumericGaugeDataSourceShared' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NumericGaugeDataSourceShared> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NumericGaugeDataSourceShared.class));

       return (TypeAdapter<T>) new TypeAdapter<NumericGaugeDataSourceShared>() {
           @Override
           public void write(JsonWriter out, NumericGaugeDataSourceShared value) throws IOException {
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
           public NumericGaugeDataSourceShared read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NumericGaugeDataSourceShared instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of NumericGaugeDataSourceShared given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NumericGaugeDataSourceShared
  * @throws IOException if the JSON string is invalid with respect to NumericGaugeDataSourceShared
  */
  public static NumericGaugeDataSourceShared fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NumericGaugeDataSourceShared.class);
  }

 /**
  * Convert an instance of NumericGaugeDataSourceShared to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

