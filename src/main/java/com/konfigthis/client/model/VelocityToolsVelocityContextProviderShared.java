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
import com.konfigthis.client.model.EnumvelocityContextProviderObjectScopeProp;
import com.konfigthis.client.model.EnumvelocityToolsVelocityContextProviderSchemaUrn;
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
 * VelocityToolsVelocityContextProviderShared
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VelocityToolsVelocityContextProviderShared {
  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumvelocityToolsVelocityContextProviderSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_TOOL = "requestTool";
  @SerializedName(SERIALIZED_NAME_REQUEST_TOOL)
  private List<String> requestTool = null;

  public static final String SERIALIZED_NAME_SESSION_TOOL = "sessionTool";
  @SerializedName(SERIALIZED_NAME_SESSION_TOOL)
  private List<String> sessionTool = null;

  public static final String SERIALIZED_NAME_APPLICATION_TOOL = "applicationTool";
  @SerializedName(SERIALIZED_NAME_APPLICATION_TOOL)
  private List<String> applicationTool = null;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_OBJECT_SCOPE = "objectScope";
  @SerializedName(SERIALIZED_NAME_OBJECT_SCOPE)
  private EnumvelocityContextProviderObjectScopeProp objectScope;

  public static final String SERIALIZED_NAME_INCLUDED_VIEW = "includedView";
  @SerializedName(SERIALIZED_NAME_INCLUDED_VIEW)
  private List<String> includedView = null;

  public static final String SERIALIZED_NAME_EXCLUDED_VIEW = "excludedView";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_VIEW)
  private List<String> excludedView = null;

  public static final String SERIALIZED_NAME_RESPONSE_HEADER = "responseHeader";
  @SerializedName(SERIALIZED_NAME_RESPONSE_HEADER)
  private List<String> responseHeader = null;

  public VelocityToolsVelocityContextProviderShared() {
  }

  public VelocityToolsVelocityContextProviderShared schemas(List<EnumvelocityToolsVelocityContextProviderSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public VelocityToolsVelocityContextProviderShared addSchemasItem(EnumvelocityToolsVelocityContextProviderSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumvelocityToolsVelocityContextProviderSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumvelocityToolsVelocityContextProviderSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public VelocityToolsVelocityContextProviderShared requestTool(List<String> requestTool) {
    
    
    
    
    this.requestTool = requestTool;
    return this;
  }

  public VelocityToolsVelocityContextProviderShared addRequestToolItem(String requestToolItem) {
    if (this.requestTool == null) {
      this.requestTool = new ArrayList<>();
    }
    this.requestTool.add(requestToolItem);
    return this;
  }

   /**
   * The fully-qualified name of a Velocity Tool class that will be initialized for each request. May optionally include a path to a properties file used to configure this tool separated from the class name by a semi-colon (;). The path may absolute or relative to the server root.
   * @return requestTool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The fully-qualified name of a Velocity Tool class that will be initialized for each request. May optionally include a path to a properties file used to configure this tool separated from the class name by a semi-colon (;). The path may absolute or relative to the server root.")

  public List<String> getRequestTool() {
    return requestTool;
  }


  public void setRequestTool(List<String> requestTool) {
    
    
    
    this.requestTool = requestTool;
  }


  public VelocityToolsVelocityContextProviderShared sessionTool(List<String> sessionTool) {
    
    
    
    
    this.sessionTool = sessionTool;
    return this;
  }

  public VelocityToolsVelocityContextProviderShared addSessionToolItem(String sessionToolItem) {
    if (this.sessionTool == null) {
      this.sessionTool = new ArrayList<>();
    }
    this.sessionTool.add(sessionToolItem);
    return this;
  }

   /**
   * The fully-qualified name of a Velocity Tool class that will be initialized for each session. May optionally include a path to a properties file used to configure this tool separated from the class name by a semi-colon (;). The path may absolute or relative to the server root.
   * @return sessionTool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The fully-qualified name of a Velocity Tool class that will be initialized for each session. May optionally include a path to a properties file used to configure this tool separated from the class name by a semi-colon (;). The path may absolute or relative to the server root.")

  public List<String> getSessionTool() {
    return sessionTool;
  }


  public void setSessionTool(List<String> sessionTool) {
    
    
    
    this.sessionTool = sessionTool;
  }


  public VelocityToolsVelocityContextProviderShared applicationTool(List<String> applicationTool) {
    
    
    
    
    this.applicationTool = applicationTool;
    return this;
  }

  public VelocityToolsVelocityContextProviderShared addApplicationToolItem(String applicationToolItem) {
    if (this.applicationTool == null) {
      this.applicationTool = new ArrayList<>();
    }
    this.applicationTool.add(applicationToolItem);
    return this;
  }

   /**
   * The fully-qualified name of a Velocity Tool class that will be initialized once for the life of the server. May optionally include a path to a properties file used to configure this tool separated from the class name by a semi-colon (;). The path may absolute or relative to the server root.
   * @return applicationTool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The fully-qualified name of a Velocity Tool class that will be initialized once for the life of the server. May optionally include a path to a properties file used to configure this tool separated from the class name by a semi-colon (;). The path may absolute or relative to the server root.")

  public List<String> getApplicationTool() {
    return applicationTool;
  }


  public void setApplicationTool(List<String> applicationTool) {
    
    
    
    this.applicationTool = applicationTool;
  }


  public VelocityToolsVelocityContextProviderShared enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether this Velocity Context Provider is enabled. If set to &#39;false&#39; this Velocity Context Provider will not contribute context content for any requests.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether this Velocity Context Provider is enabled. If set to 'false' this Velocity Context Provider will not contribute context content for any requests.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public VelocityToolsVelocityContextProviderShared objectScope(EnumvelocityContextProviderObjectScopeProp objectScope) {
    
    
    
    
    this.objectScope = objectScope;
    return this;
  }

   /**
   * Get objectScope
   * @return objectScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumvelocityContextProviderObjectScopeProp getObjectScope() {
    return objectScope;
  }


  public void setObjectScope(EnumvelocityContextProviderObjectScopeProp objectScope) {
    
    
    
    this.objectScope = objectScope;
  }


  public VelocityToolsVelocityContextProviderShared includedView(List<String> includedView) {
    
    
    
    
    this.includedView = includedView;
    return this;
  }

  public VelocityToolsVelocityContextProviderShared addIncludedViewItem(String includedViewItem) {
    if (this.includedView == null) {
      this.includedView = new ArrayList<>();
    }
    this.includedView.add(includedViewItem);
    return this;
  }

   /**
   * The name of a view for which this Velocity Context Provider will contribute content.
   * @return includedView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a view for which this Velocity Context Provider will contribute content.")

  public List<String> getIncludedView() {
    return includedView;
  }


  public void setIncludedView(List<String> includedView) {
    
    
    
    this.includedView = includedView;
  }


  public VelocityToolsVelocityContextProviderShared excludedView(List<String> excludedView) {
    
    
    
    
    this.excludedView = excludedView;
    return this;
  }

  public VelocityToolsVelocityContextProviderShared addExcludedViewItem(String excludedViewItem) {
    if (this.excludedView == null) {
      this.excludedView = new ArrayList<>();
    }
    this.excludedView.add(excludedViewItem);
    return this;
  }

   /**
   * The name of a view for which this Velocity Context Provider will not contribute content.
   * @return excludedView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a view for which this Velocity Context Provider will not contribute content.")

  public List<String> getExcludedView() {
    return excludedView;
  }


  public void setExcludedView(List<String> excludedView) {
    
    
    
    this.excludedView = excludedView;
  }


  public VelocityToolsVelocityContextProviderShared responseHeader(List<String> responseHeader) {
    
    
    
    
    this.responseHeader = responseHeader;
    return this;
  }

  public VelocityToolsVelocityContextProviderShared addResponseHeaderItem(String responseHeaderItem) {
    if (this.responseHeader == null) {
      this.responseHeader = new ArrayList<>();
    }
    this.responseHeader.add(responseHeaderItem);
    return this;
  }

   /**
   * Specifies HTTP header fields and values added to response headers for template page requests to which this Velocity Context Provider contributes content.
   * @return responseHeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies HTTP header fields and values added to response headers for template page requests to which this Velocity Context Provider contributes content.")

  public List<String> getResponseHeader() {
    return responseHeader;
  }


  public void setResponseHeader(List<String> responseHeader) {
    
    
    
    this.responseHeader = responseHeader;
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
   * @return the VelocityToolsVelocityContextProviderShared instance itself
   */
  public VelocityToolsVelocityContextProviderShared putAdditionalProperty(String key, Object value) {
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
    VelocityToolsVelocityContextProviderShared velocityToolsVelocityContextProviderShared = (VelocityToolsVelocityContextProviderShared) o;
    return Objects.equals(this.schemas, velocityToolsVelocityContextProviderShared.schemas) &&
        Objects.equals(this.requestTool, velocityToolsVelocityContextProviderShared.requestTool) &&
        Objects.equals(this.sessionTool, velocityToolsVelocityContextProviderShared.sessionTool) &&
        Objects.equals(this.applicationTool, velocityToolsVelocityContextProviderShared.applicationTool) &&
        Objects.equals(this.enabled, velocityToolsVelocityContextProviderShared.enabled) &&
        Objects.equals(this.objectScope, velocityToolsVelocityContextProviderShared.objectScope) &&
        Objects.equals(this.includedView, velocityToolsVelocityContextProviderShared.includedView) &&
        Objects.equals(this.excludedView, velocityToolsVelocityContextProviderShared.excludedView) &&
        Objects.equals(this.responseHeader, velocityToolsVelocityContextProviderShared.responseHeader)&&
        Objects.equals(this.additionalProperties, velocityToolsVelocityContextProviderShared.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, requestTool, sessionTool, applicationTool, enabled, objectScope, includedView, excludedView, responseHeader, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VelocityToolsVelocityContextProviderShared {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    requestTool: ").append(toIndentedString(requestTool)).append("\n");
    sb.append("    sessionTool: ").append(toIndentedString(sessionTool)).append("\n");
    sb.append("    applicationTool: ").append(toIndentedString(applicationTool)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    objectScope: ").append(toIndentedString(objectScope)).append("\n");
    sb.append("    includedView: ").append(toIndentedString(includedView)).append("\n");
    sb.append("    excludedView: ").append(toIndentedString(excludedView)).append("\n");
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
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
    openapiFields.add("schemas");
    openapiFields.add("requestTool");
    openapiFields.add("sessionTool");
    openapiFields.add("applicationTool");
    openapiFields.add("enabled");
    openapiFields.add("objectScope");
    openapiFields.add("includedView");
    openapiFields.add("excludedView");
    openapiFields.add("responseHeader");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemas");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VelocityToolsVelocityContextProviderShared
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VelocityToolsVelocityContextProviderShared.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VelocityToolsVelocityContextProviderShared is not found in the empty JSON string", VelocityToolsVelocityContextProviderShared.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VelocityToolsVelocityContextProviderShared.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("schemas") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("schemas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemas` to be an array in the JSON string but got `%s`", jsonObj.get("schemas").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("requestTool") != null && !jsonObj.get("requestTool").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestTool` to be an array in the JSON string but got `%s`", jsonObj.get("requestTool").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sessionTool") != null && !jsonObj.get("sessionTool").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sessionTool` to be an array in the JSON string but got `%s`", jsonObj.get("sessionTool").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("applicationTool") != null && !jsonObj.get("applicationTool").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicationTool` to be an array in the JSON string but got `%s`", jsonObj.get("applicationTool").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("includedView") != null && !jsonObj.get("includedView").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includedView` to be an array in the JSON string but got `%s`", jsonObj.get("includedView").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("excludedView") != null && !jsonObj.get("excludedView").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludedView` to be an array in the JSON string but got `%s`", jsonObj.get("excludedView").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("responseHeader") != null && !jsonObj.get("responseHeader").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseHeader` to be an array in the JSON string but got `%s`", jsonObj.get("responseHeader").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VelocityToolsVelocityContextProviderShared.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VelocityToolsVelocityContextProviderShared' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VelocityToolsVelocityContextProviderShared> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VelocityToolsVelocityContextProviderShared.class));

       return (TypeAdapter<T>) new TypeAdapter<VelocityToolsVelocityContextProviderShared>() {
           @Override
           public void write(JsonWriter out, VelocityToolsVelocityContextProviderShared value) throws IOException {
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
           public VelocityToolsVelocityContextProviderShared read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VelocityToolsVelocityContextProviderShared instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VelocityToolsVelocityContextProviderShared given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VelocityToolsVelocityContextProviderShared
  * @throws IOException if the JSON string is invalid with respect to VelocityToolsVelocityContextProviderShared
  */
  public static VelocityToolsVelocityContextProviderShared fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VelocityToolsVelocityContextProviderShared.class);
  }

 /**
  * Convert an instance of VelocityToolsVelocityContextProviderShared to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

