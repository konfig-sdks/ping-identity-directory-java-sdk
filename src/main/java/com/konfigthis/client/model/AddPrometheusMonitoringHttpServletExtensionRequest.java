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
import com.konfigthis.client.model.EnumprometheusMonitoringHttpServletExtensionSchemaUrn;
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
 * AddPrometheusMonitoringHttpServletExtensionRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddPrometheusMonitoringHttpServletExtensionRequest {
  public static final String SERIALIZED_NAME_EXTENSION_NAME = "extensionName";
  @SerializedName(SERIALIZED_NAME_EXTENSION_NAME)
  private String extensionName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumprometheusMonitoringHttpServletExtensionSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_BASE_CONTEXT_PATH = "baseContextPath";
  @SerializedName(SERIALIZED_NAME_BASE_CONTEXT_PATH)
  private String baseContextPath;

  public static final String SERIALIZED_NAME_INCLUDE_INSTANCE_NAME_LABEL = "includeInstanceNameLabel";
  @SerializedName(SERIALIZED_NAME_INCLUDE_INSTANCE_NAME_LABEL)
  private Boolean includeInstanceNameLabel;

  public static final String SERIALIZED_NAME_INCLUDE_PRODUCT_NAME_LABEL = "includeProductNameLabel";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PRODUCT_NAME_LABEL)
  private Boolean includeProductNameLabel;

  public static final String SERIALIZED_NAME_INCLUDE_LOCATION_NAME_LABEL = "includeLocationNameLabel";
  @SerializedName(SERIALIZED_NAME_INCLUDE_LOCATION_NAME_LABEL)
  private Boolean includeLocationNameLabel;

  public static final String SERIALIZED_NAME_ALWAYS_INCLUDE_MONITOR_ENTRY_NAME_LABEL = "alwaysIncludeMonitorEntryNameLabel";
  @SerializedName(SERIALIZED_NAME_ALWAYS_INCLUDE_MONITOR_ENTRY_NAME_LABEL)
  private Boolean alwaysIncludeMonitorEntryNameLabel;

  public static final String SERIALIZED_NAME_INCLUDE_MONITOR_OBJECT_CLASS_NAME_LABEL = "includeMonitorObjectClassNameLabel";
  @SerializedName(SERIALIZED_NAME_INCLUDE_MONITOR_OBJECT_CLASS_NAME_LABEL)
  private Boolean includeMonitorObjectClassNameLabel;

  public static final String SERIALIZED_NAME_INCLUDE_MONITOR_ATTRIBUTE_NAME_LABEL = "includeMonitorAttributeNameLabel";
  @SerializedName(SERIALIZED_NAME_INCLUDE_MONITOR_ATTRIBUTE_NAME_LABEL)
  private Boolean includeMonitorAttributeNameLabel;

  public static final String SERIALIZED_NAME_LABEL_NAME_VALUE_PAIR = "labelNameValuePair";
  @SerializedName(SERIALIZED_NAME_LABEL_NAME_VALUE_PAIR)
  private List<String> labelNameValuePair = null;

  public static final String SERIALIZED_NAME_CROSS_ORIGIN_POLICY = "crossOriginPolicy";
  @SerializedName(SERIALIZED_NAME_CROSS_ORIGIN_POLICY)
  private String crossOriginPolicy;

  public static final String SERIALIZED_NAME_RESPONSE_HEADER = "responseHeader";
  @SerializedName(SERIALIZED_NAME_RESPONSE_HEADER)
  private List<String> responseHeader = null;

  public static final String SERIALIZED_NAME_CORRELATION_I_D_RESPONSE_HEADER = "correlationIDResponseHeader";
  @SerializedName(SERIALIZED_NAME_CORRELATION_I_D_RESPONSE_HEADER)
  private String correlationIDResponseHeader;

  public AddPrometheusMonitoringHttpServletExtensionRequest() {
  }

  public AddPrometheusMonitoringHttpServletExtensionRequest extensionName(String extensionName) {
    
    
    
    
    this.extensionName = extensionName;
    return this;
  }

   /**
   * Name of the new HTTP Servlet Extension
   * @return extensionName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the new HTTP Servlet Extension")

  public String getExtensionName() {
    return extensionName;
  }


  public void setExtensionName(String extensionName) {
    
    
    
    this.extensionName = extensionName;
  }


  public AddPrometheusMonitoringHttpServletExtensionRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this HTTP Servlet Extension
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this HTTP Servlet Extension")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AddPrometheusMonitoringHttpServletExtensionRequest schemas(List<EnumprometheusMonitoringHttpServletExtensionSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddPrometheusMonitoringHttpServletExtensionRequest addSchemasItem(EnumprometheusMonitoringHttpServletExtensionSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumprometheusMonitoringHttpServletExtensionSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumprometheusMonitoringHttpServletExtensionSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddPrometheusMonitoringHttpServletExtensionRequest baseContextPath(String baseContextPath) {
    
    
    
    
    this.baseContextPath = baseContextPath;
    return this;
  }

   /**
   * Specifies the base context path that HTTP clients should use to access this servlet. The value must start with a forward slash and must represent a valid HTTP context path.
   * @return baseContextPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the base context path that HTTP clients should use to access this servlet. The value must start with a forward slash and must represent a valid HTTP context path.")

  public String getBaseContextPath() {
    return baseContextPath;
  }


  public void setBaseContextPath(String baseContextPath) {
    
    
    
    this.baseContextPath = baseContextPath;
  }


  public AddPrometheusMonitoringHttpServletExtensionRequest includeInstanceNameLabel(Boolean includeInstanceNameLabel) {
    
    
    
    
    this.includeInstanceNameLabel = includeInstanceNameLabel;
    return this;
  }

   /**
   * Indicates whether generated metrics should include an \&quot;instance\&quot; label whose value is the instance name for this Directory Server instance.
   * @return includeInstanceNameLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether generated metrics should include an \"instance\" label whose value is the instance name for this Directory Server instance.")

  public Boolean getIncludeInstanceNameLabel() {
    return includeInstanceNameLabel;
  }


  public void setIncludeInstanceNameLabel(Boolean includeInstanceNameLabel) {
    
    
    
    this.includeInstanceNameLabel = includeInstanceNameLabel;
  }


  public AddPrometheusMonitoringHttpServletExtensionRequest includeProductNameLabel(Boolean includeProductNameLabel) {
    
    
    
    
    this.includeProductNameLabel = includeProductNameLabel;
    return this;
  }

   /**
   * Indicates whether generated metrics should include a \&quot;product\&quot; label whose value is the product name for this Directory Server instance.
   * @return includeProductNameLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether generated metrics should include a \"product\" label whose value is the product name for this Directory Server instance.")

  public Boolean getIncludeProductNameLabel() {
    return includeProductNameLabel;
  }


  public void setIncludeProductNameLabel(Boolean includeProductNameLabel) {
    
    
    
    this.includeProductNameLabel = includeProductNameLabel;
  }


  public AddPrometheusMonitoringHttpServletExtensionRequest includeLocationNameLabel(Boolean includeLocationNameLabel) {
    
    
    
    
    this.includeLocationNameLabel = includeLocationNameLabel;
    return this;
  }

   /**
   * Indicates whether generated metrics should include a \&quot;location\&quot; label whose value is the location name for this Directory Server instance.
   * @return includeLocationNameLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether generated metrics should include a \"location\" label whose value is the location name for this Directory Server instance.")

  public Boolean getIncludeLocationNameLabel() {
    return includeLocationNameLabel;
  }


  public void setIncludeLocationNameLabel(Boolean includeLocationNameLabel) {
    
    
    
    this.includeLocationNameLabel = includeLocationNameLabel;
  }


  public AddPrometheusMonitoringHttpServletExtensionRequest alwaysIncludeMonitorEntryNameLabel(Boolean alwaysIncludeMonitorEntryNameLabel) {
    
    
    
    
    this.alwaysIncludeMonitorEntryNameLabel = alwaysIncludeMonitorEntryNameLabel;
    return this;
  }

   /**
   * Indicates whether generated metrics should always include a \&quot;monitor_entry\&quot; label whose value is the name of the monitor entry from which the metric was obtained.
   * @return alwaysIncludeMonitorEntryNameLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether generated metrics should always include a \"monitor_entry\" label whose value is the name of the monitor entry from which the metric was obtained.")

  public Boolean getAlwaysIncludeMonitorEntryNameLabel() {
    return alwaysIncludeMonitorEntryNameLabel;
  }


  public void setAlwaysIncludeMonitorEntryNameLabel(Boolean alwaysIncludeMonitorEntryNameLabel) {
    
    
    
    this.alwaysIncludeMonitorEntryNameLabel = alwaysIncludeMonitorEntryNameLabel;
  }


  public AddPrometheusMonitoringHttpServletExtensionRequest includeMonitorObjectClassNameLabel(Boolean includeMonitorObjectClassNameLabel) {
    
    
    
    
    this.includeMonitorObjectClassNameLabel = includeMonitorObjectClassNameLabel;
    return this;
  }

   /**
   * Indicates whether generated metrics should include a \&quot;monitor_object_class\&quot; label whose value is the name of the object class for the monitor entry from which the metric was obtained.
   * @return includeMonitorObjectClassNameLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether generated metrics should include a \"monitor_object_class\" label whose value is the name of the object class for the monitor entry from which the metric was obtained.")

  public Boolean getIncludeMonitorObjectClassNameLabel() {
    return includeMonitorObjectClassNameLabel;
  }


  public void setIncludeMonitorObjectClassNameLabel(Boolean includeMonitorObjectClassNameLabel) {
    
    
    
    this.includeMonitorObjectClassNameLabel = includeMonitorObjectClassNameLabel;
  }


  public AddPrometheusMonitoringHttpServletExtensionRequest includeMonitorAttributeNameLabel(Boolean includeMonitorAttributeNameLabel) {
    
    
    
    
    this.includeMonitorAttributeNameLabel = includeMonitorAttributeNameLabel;
    return this;
  }

   /**
   * Indicates whether generated metrics should include a \&quot;monitor_attribute\&quot; label whose value is the name of the monitor attribute from which the metric was obtained.
   * @return includeMonitorAttributeNameLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether generated metrics should include a \"monitor_attribute\" label whose value is the name of the monitor attribute from which the metric was obtained.")

  public Boolean getIncludeMonitorAttributeNameLabel() {
    return includeMonitorAttributeNameLabel;
  }


  public void setIncludeMonitorAttributeNameLabel(Boolean includeMonitorAttributeNameLabel) {
    
    
    
    this.includeMonitorAttributeNameLabel = includeMonitorAttributeNameLabel;
  }


  public AddPrometheusMonitoringHttpServletExtensionRequest labelNameValuePair(List<String> labelNameValuePair) {
    
    
    
    
    this.labelNameValuePair = labelNameValuePair;
    return this;
  }

  public AddPrometheusMonitoringHttpServletExtensionRequest addLabelNameValuePairItem(String labelNameValuePairItem) {
    if (this.labelNameValuePair == null) {
      this.labelNameValuePair = new ArrayList<>();
    }
    this.labelNameValuePair.add(labelNameValuePairItem);
    return this;
  }

   /**
   * A set of name-value pairs for labels that should be included in all metrics exposed by this Directory Server instance.
   * @return labelNameValuePair
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A set of name-value pairs for labels that should be included in all metrics exposed by this Directory Server instance.")

  public List<String> getLabelNameValuePair() {
    return labelNameValuePair;
  }


  public void setLabelNameValuePair(List<String> labelNameValuePair) {
    
    
    
    this.labelNameValuePair = labelNameValuePair;
  }


  public AddPrometheusMonitoringHttpServletExtensionRequest crossOriginPolicy(String crossOriginPolicy) {
    
    
    
    
    this.crossOriginPolicy = crossOriginPolicy;
    return this;
  }

   /**
   * The cross-origin request policy to use for the HTTP Servlet Extension.
   * @return crossOriginPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cross-origin request policy to use for the HTTP Servlet Extension.")

  public String getCrossOriginPolicy() {
    return crossOriginPolicy;
  }


  public void setCrossOriginPolicy(String crossOriginPolicy) {
    
    
    
    this.crossOriginPolicy = crossOriginPolicy;
  }


  public AddPrometheusMonitoringHttpServletExtensionRequest responseHeader(List<String> responseHeader) {
    
    
    
    
    this.responseHeader = responseHeader;
    return this;
  }

  public AddPrometheusMonitoringHttpServletExtensionRequest addResponseHeaderItem(String responseHeaderItem) {
    if (this.responseHeader == null) {
      this.responseHeader = new ArrayList<>();
    }
    this.responseHeader.add(responseHeaderItem);
    return this;
  }

   /**
   * Specifies HTTP header fields and values added to response headers for all requests.
   * @return responseHeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies HTTP header fields and values added to response headers for all requests.")

  public List<String> getResponseHeader() {
    return responseHeader;
  }


  public void setResponseHeader(List<String> responseHeader) {
    
    
    
    this.responseHeader = responseHeader;
  }


  public AddPrometheusMonitoringHttpServletExtensionRequest correlationIDResponseHeader(String correlationIDResponseHeader) {
    
    
    
    
    this.correlationIDResponseHeader = correlationIDResponseHeader;
    return this;
  }

   /**
   * Specifies the name of the HTTP response header that will contain a correlation ID value. Example values are \&quot;Correlation-Id\&quot;, \&quot;X-Amzn-Trace-Id\&quot;, and \&quot;X-Request-Id\&quot;.
   * @return correlationIDResponseHeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the name of the HTTP response header that will contain a correlation ID value. Example values are \"Correlation-Id\", \"X-Amzn-Trace-Id\", and \"X-Request-Id\".")

  public String getCorrelationIDResponseHeader() {
    return correlationIDResponseHeader;
  }


  public void setCorrelationIDResponseHeader(String correlationIDResponseHeader) {
    
    
    
    this.correlationIDResponseHeader = correlationIDResponseHeader;
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
   * @return the AddPrometheusMonitoringHttpServletExtensionRequest instance itself
   */
  public AddPrometheusMonitoringHttpServletExtensionRequest putAdditionalProperty(String key, Object value) {
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
    AddPrometheusMonitoringHttpServletExtensionRequest addPrometheusMonitoringHttpServletExtensionRequest = (AddPrometheusMonitoringHttpServletExtensionRequest) o;
    return Objects.equals(this.extensionName, addPrometheusMonitoringHttpServletExtensionRequest.extensionName) &&
        Objects.equals(this.description, addPrometheusMonitoringHttpServletExtensionRequest.description) &&
        Objects.equals(this.schemas, addPrometheusMonitoringHttpServletExtensionRequest.schemas) &&
        Objects.equals(this.baseContextPath, addPrometheusMonitoringHttpServletExtensionRequest.baseContextPath) &&
        Objects.equals(this.includeInstanceNameLabel, addPrometheusMonitoringHttpServletExtensionRequest.includeInstanceNameLabel) &&
        Objects.equals(this.includeProductNameLabel, addPrometheusMonitoringHttpServletExtensionRequest.includeProductNameLabel) &&
        Objects.equals(this.includeLocationNameLabel, addPrometheusMonitoringHttpServletExtensionRequest.includeLocationNameLabel) &&
        Objects.equals(this.alwaysIncludeMonitorEntryNameLabel, addPrometheusMonitoringHttpServletExtensionRequest.alwaysIncludeMonitorEntryNameLabel) &&
        Objects.equals(this.includeMonitorObjectClassNameLabel, addPrometheusMonitoringHttpServletExtensionRequest.includeMonitorObjectClassNameLabel) &&
        Objects.equals(this.includeMonitorAttributeNameLabel, addPrometheusMonitoringHttpServletExtensionRequest.includeMonitorAttributeNameLabel) &&
        Objects.equals(this.labelNameValuePair, addPrometheusMonitoringHttpServletExtensionRequest.labelNameValuePair) &&
        Objects.equals(this.crossOriginPolicy, addPrometheusMonitoringHttpServletExtensionRequest.crossOriginPolicy) &&
        Objects.equals(this.responseHeader, addPrometheusMonitoringHttpServletExtensionRequest.responseHeader) &&
        Objects.equals(this.correlationIDResponseHeader, addPrometheusMonitoringHttpServletExtensionRequest.correlationIDResponseHeader)&&
        Objects.equals(this.additionalProperties, addPrometheusMonitoringHttpServletExtensionRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensionName, description, schemas, baseContextPath, includeInstanceNameLabel, includeProductNameLabel, includeLocationNameLabel, alwaysIncludeMonitorEntryNameLabel, includeMonitorObjectClassNameLabel, includeMonitorAttributeNameLabel, labelNameValuePair, crossOriginPolicy, responseHeader, correlationIDResponseHeader, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddPrometheusMonitoringHttpServletExtensionRequest {\n");
    sb.append("    extensionName: ").append(toIndentedString(extensionName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    baseContextPath: ").append(toIndentedString(baseContextPath)).append("\n");
    sb.append("    includeInstanceNameLabel: ").append(toIndentedString(includeInstanceNameLabel)).append("\n");
    sb.append("    includeProductNameLabel: ").append(toIndentedString(includeProductNameLabel)).append("\n");
    sb.append("    includeLocationNameLabel: ").append(toIndentedString(includeLocationNameLabel)).append("\n");
    sb.append("    alwaysIncludeMonitorEntryNameLabel: ").append(toIndentedString(alwaysIncludeMonitorEntryNameLabel)).append("\n");
    sb.append("    includeMonitorObjectClassNameLabel: ").append(toIndentedString(includeMonitorObjectClassNameLabel)).append("\n");
    sb.append("    includeMonitorAttributeNameLabel: ").append(toIndentedString(includeMonitorAttributeNameLabel)).append("\n");
    sb.append("    labelNameValuePair: ").append(toIndentedString(labelNameValuePair)).append("\n");
    sb.append("    crossOriginPolicy: ").append(toIndentedString(crossOriginPolicy)).append("\n");
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    correlationIDResponseHeader: ").append(toIndentedString(correlationIDResponseHeader)).append("\n");
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
    openapiFields.add("extensionName");
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("baseContextPath");
    openapiFields.add("includeInstanceNameLabel");
    openapiFields.add("includeProductNameLabel");
    openapiFields.add("includeLocationNameLabel");
    openapiFields.add("alwaysIncludeMonitorEntryNameLabel");
    openapiFields.add("includeMonitorObjectClassNameLabel");
    openapiFields.add("includeMonitorAttributeNameLabel");
    openapiFields.add("labelNameValuePair");
    openapiFields.add("crossOriginPolicy");
    openapiFields.add("responseHeader");
    openapiFields.add("correlationIDResponseHeader");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("extensionName");
    openapiRequiredFields.add("schemas");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddPrometheusMonitoringHttpServletExtensionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddPrometheusMonitoringHttpServletExtensionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddPrometheusMonitoringHttpServletExtensionRequest is not found in the empty JSON string", AddPrometheusMonitoringHttpServletExtensionRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddPrometheusMonitoringHttpServletExtensionRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("extensionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extensionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extensionName").toString()));
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
      if ((jsonObj.get("baseContextPath") != null && !jsonObj.get("baseContextPath").isJsonNull()) && !jsonObj.get("baseContextPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseContextPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseContextPath").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("labelNameValuePair") != null && !jsonObj.get("labelNameValuePair").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `labelNameValuePair` to be an array in the JSON string but got `%s`", jsonObj.get("labelNameValuePair").toString()));
      }
      if ((jsonObj.get("crossOriginPolicy") != null && !jsonObj.get("crossOriginPolicy").isJsonNull()) && !jsonObj.get("crossOriginPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crossOriginPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crossOriginPolicy").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("responseHeader") != null && !jsonObj.get("responseHeader").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseHeader` to be an array in the JSON string but got `%s`", jsonObj.get("responseHeader").toString()));
      }
      if ((jsonObj.get("correlationIDResponseHeader") != null && !jsonObj.get("correlationIDResponseHeader").isJsonNull()) && !jsonObj.get("correlationIDResponseHeader").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `correlationIDResponseHeader` to be a primitive type in the JSON string but got `%s`", jsonObj.get("correlationIDResponseHeader").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddPrometheusMonitoringHttpServletExtensionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddPrometheusMonitoringHttpServletExtensionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddPrometheusMonitoringHttpServletExtensionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddPrometheusMonitoringHttpServletExtensionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddPrometheusMonitoringHttpServletExtensionRequest>() {
           @Override
           public void write(JsonWriter out, AddPrometheusMonitoringHttpServletExtensionRequest value) throws IOException {
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
           public AddPrometheusMonitoringHttpServletExtensionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddPrometheusMonitoringHttpServletExtensionRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddPrometheusMonitoringHttpServletExtensionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddPrometheusMonitoringHttpServletExtensionRequest
  * @throws IOException if the JSON string is invalid with respect to AddPrometheusMonitoringHttpServletExtensionRequest
  */
  public static AddPrometheusMonitoringHttpServletExtensionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddPrometheusMonitoringHttpServletExtensionRequest.class);
  }

 /**
  * Convert an instance of AddPrometheusMonitoringHttpServletExtensionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

