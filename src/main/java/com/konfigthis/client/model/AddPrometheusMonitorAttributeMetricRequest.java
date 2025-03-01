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
import com.konfigthis.client.model.EnumprometheusMonitorAttributeMetricMetricTypeProp;
import com.konfigthis.client.model.EnumprometheusMonitorAttributeMetricSchemaUrn;
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
 * AddPrometheusMonitorAttributeMetricRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddPrometheusMonitorAttributeMetricRequest {
  public static final String SERIALIZED_NAME_METRIC_NAME = "metricName";
  @SerializedName(SERIALIZED_NAME_METRIC_NAME)
  private String metricName;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumprometheusMonitorAttributeMetricSchemaUrn> schemas = null;

  public static final String SERIALIZED_NAME_MONITOR_ATTRIBUTE_NAME = "monitorAttributeName";
  @SerializedName(SERIALIZED_NAME_MONITOR_ATTRIBUTE_NAME)
  private String monitorAttributeName;

  public static final String SERIALIZED_NAME_MONITOR_OBJECT_CLASS_NAME = "monitorObjectClassName";
  @SerializedName(SERIALIZED_NAME_MONITOR_OBJECT_CLASS_NAME)
  private String monitorObjectClassName;

  public static final String SERIALIZED_NAME_METRIC_TYPE = "metricType";
  @SerializedName(SERIALIZED_NAME_METRIC_TYPE)
  private EnumprometheusMonitorAttributeMetricMetricTypeProp metricType;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_METRIC_DESCRIPTION = "metricDescription";
  @SerializedName(SERIALIZED_NAME_METRIC_DESCRIPTION)
  private String metricDescription;

  public static final String SERIALIZED_NAME_LABEL_NAME_VALUE_PAIR = "labelNameValuePair";
  @SerializedName(SERIALIZED_NAME_LABEL_NAME_VALUE_PAIR)
  private List<String> labelNameValuePair = null;

  public AddPrometheusMonitorAttributeMetricRequest() {
  }

  public AddPrometheusMonitorAttributeMetricRequest metricName(String metricName) {
    
    
    
    
    this.metricName = metricName;
    return this;
  }

   /**
   * The name that will be used in the metric to be consumed by Prometheus.
   * @return metricName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name that will be used in the metric to be consumed by Prometheus.")

  public String getMetricName() {
    return metricName;
  }


  public void setMetricName(String metricName) {
    
    
    
    this.metricName = metricName;
  }


  public AddPrometheusMonitorAttributeMetricRequest schemas(List<EnumprometheusMonitorAttributeMetricSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddPrometheusMonitorAttributeMetricRequest addSchemasItem(EnumprometheusMonitorAttributeMetricSchemaUrn schemasItem) {
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

  public List<EnumprometheusMonitorAttributeMetricSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumprometheusMonitorAttributeMetricSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddPrometheusMonitorAttributeMetricRequest monitorAttributeName(String monitorAttributeName) {
    
    
    
    
    this.monitorAttributeName = monitorAttributeName;
    return this;
  }

   /**
   * The name of the monitor attribute that contains the numeric value to be published.
   * @return monitorAttributeName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the monitor attribute that contains the numeric value to be published.")

  public String getMonitorAttributeName() {
    return monitorAttributeName;
  }


  public void setMonitorAttributeName(String monitorAttributeName) {
    
    
    
    this.monitorAttributeName = monitorAttributeName;
  }


  public AddPrometheusMonitorAttributeMetricRequest monitorObjectClassName(String monitorObjectClassName) {
    
    
    
    
    this.monitorObjectClassName = monitorObjectClassName;
    return this;
  }

   /**
   * The name of the object class for monitor entries that contain the monitor attribute.
   * @return monitorObjectClassName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the object class for monitor entries that contain the monitor attribute.")

  public String getMonitorObjectClassName() {
    return monitorObjectClassName;
  }


  public void setMonitorObjectClassName(String monitorObjectClassName) {
    
    
    
    this.monitorObjectClassName = monitorObjectClassName;
  }


  public AddPrometheusMonitorAttributeMetricRequest metricType(EnumprometheusMonitorAttributeMetricMetricTypeProp metricType) {
    
    
    
    
    this.metricType = metricType;
    return this;
  }

   /**
   * Get metricType
   * @return metricType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EnumprometheusMonitorAttributeMetricMetricTypeProp getMetricType() {
    return metricType;
  }


  public void setMetricType(EnumprometheusMonitorAttributeMetricMetricTypeProp metricType) {
    
    
    
    this.metricType = metricType;
  }


  public AddPrometheusMonitorAttributeMetricRequest filter(String filter) {
    
    
    
    
    this.filter = filter;
    return this;
  }

   /**
   * A filter that may be used to restrict the set of monitor entries for which the metric should be generated.
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A filter that may be used to restrict the set of monitor entries for which the metric should be generated.")

  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    
    
    
    this.filter = filter;
  }


  public AddPrometheusMonitorAttributeMetricRequest metricDescription(String metricDescription) {
    
    
    
    
    this.metricDescription = metricDescription;
    return this;
  }

   /**
   * A human-readable description that should be published as part of the metric definition.
   * @return metricDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human-readable description that should be published as part of the metric definition.")

  public String getMetricDescription() {
    return metricDescription;
  }


  public void setMetricDescription(String metricDescription) {
    
    
    
    this.metricDescription = metricDescription;
  }


  public AddPrometheusMonitorAttributeMetricRequest labelNameValuePair(List<String> labelNameValuePair) {
    
    
    
    
    this.labelNameValuePair = labelNameValuePair;
    return this;
  }

  public AddPrometheusMonitorAttributeMetricRequest addLabelNameValuePairItem(String labelNameValuePairItem) {
    if (this.labelNameValuePair == null) {
      this.labelNameValuePair = new ArrayList<>();
    }
    this.labelNameValuePair.add(labelNameValuePairItem);
    return this;
  }

   /**
   * A set of name-value pairs for labels that should be included in the published metric for the target attribute.
   * @return labelNameValuePair
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A set of name-value pairs for labels that should be included in the published metric for the target attribute.")

  public List<String> getLabelNameValuePair() {
    return labelNameValuePair;
  }


  public void setLabelNameValuePair(List<String> labelNameValuePair) {
    
    
    
    this.labelNameValuePair = labelNameValuePair;
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
   * @return the AddPrometheusMonitorAttributeMetricRequest instance itself
   */
  public AddPrometheusMonitorAttributeMetricRequest putAdditionalProperty(String key, Object value) {
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
    AddPrometheusMonitorAttributeMetricRequest addPrometheusMonitorAttributeMetricRequest = (AddPrometheusMonitorAttributeMetricRequest) o;
    return Objects.equals(this.metricName, addPrometheusMonitorAttributeMetricRequest.metricName) &&
        Objects.equals(this.schemas, addPrometheusMonitorAttributeMetricRequest.schemas) &&
        Objects.equals(this.monitorAttributeName, addPrometheusMonitorAttributeMetricRequest.monitorAttributeName) &&
        Objects.equals(this.monitorObjectClassName, addPrometheusMonitorAttributeMetricRequest.monitorObjectClassName) &&
        Objects.equals(this.metricType, addPrometheusMonitorAttributeMetricRequest.metricType) &&
        Objects.equals(this.filter, addPrometheusMonitorAttributeMetricRequest.filter) &&
        Objects.equals(this.metricDescription, addPrometheusMonitorAttributeMetricRequest.metricDescription) &&
        Objects.equals(this.labelNameValuePair, addPrometheusMonitorAttributeMetricRequest.labelNameValuePair)&&
        Objects.equals(this.additionalProperties, addPrometheusMonitorAttributeMetricRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricName, schemas, monitorAttributeName, monitorObjectClassName, metricType, filter, metricDescription, labelNameValuePair, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddPrometheusMonitorAttributeMetricRequest {\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    monitorAttributeName: ").append(toIndentedString(monitorAttributeName)).append("\n");
    sb.append("    monitorObjectClassName: ").append(toIndentedString(monitorObjectClassName)).append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    metricDescription: ").append(toIndentedString(metricDescription)).append("\n");
    sb.append("    labelNameValuePair: ").append(toIndentedString(labelNameValuePair)).append("\n");
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
    openapiFields.add("metricName");
    openapiFields.add("schemas");
    openapiFields.add("monitorAttributeName");
    openapiFields.add("monitorObjectClassName");
    openapiFields.add("metricType");
    openapiFields.add("filter");
    openapiFields.add("metricDescription");
    openapiFields.add("labelNameValuePair");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("metricName");
    openapiRequiredFields.add("monitorAttributeName");
    openapiRequiredFields.add("monitorObjectClassName");
    openapiRequiredFields.add("metricType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddPrometheusMonitorAttributeMetricRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddPrometheusMonitorAttributeMetricRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddPrometheusMonitorAttributeMetricRequest is not found in the empty JSON string", AddPrometheusMonitorAttributeMetricRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddPrometheusMonitorAttributeMetricRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("metricName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metricName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metricName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("schemas") != null && !jsonObj.get("schemas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemas` to be an array in the JSON string but got `%s`", jsonObj.get("schemas").toString()));
      }
      if (!jsonObj.get("monitorAttributeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `monitorAttributeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("monitorAttributeName").toString()));
      }
      if (!jsonObj.get("monitorObjectClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `monitorObjectClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("monitorObjectClassName").toString()));
      }
      if ((jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      if ((jsonObj.get("metricDescription") != null && !jsonObj.get("metricDescription").isJsonNull()) && !jsonObj.get("metricDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metricDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metricDescription").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("labelNameValuePair") != null && !jsonObj.get("labelNameValuePair").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `labelNameValuePair` to be an array in the JSON string but got `%s`", jsonObj.get("labelNameValuePair").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddPrometheusMonitorAttributeMetricRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddPrometheusMonitorAttributeMetricRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddPrometheusMonitorAttributeMetricRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddPrometheusMonitorAttributeMetricRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddPrometheusMonitorAttributeMetricRequest>() {
           @Override
           public void write(JsonWriter out, AddPrometheusMonitorAttributeMetricRequest value) throws IOException {
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
           public AddPrometheusMonitorAttributeMetricRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddPrometheusMonitorAttributeMetricRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddPrometheusMonitorAttributeMetricRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddPrometheusMonitorAttributeMetricRequest
  * @throws IOException if the JSON string is invalid with respect to AddPrometheusMonitorAttributeMetricRequest
  */
  public static AddPrometheusMonitorAttributeMetricRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddPrometheusMonitorAttributeMetricRequest.class);
  }

 /**
  * Convert an instance of AddPrometheusMonitorAttributeMetricRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

