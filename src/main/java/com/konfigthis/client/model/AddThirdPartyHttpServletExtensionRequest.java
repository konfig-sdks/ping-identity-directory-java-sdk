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
import com.konfigthis.client.model.EnumthirdPartyHttpServletExtensionSchemaUrn;
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
 * AddThirdPartyHttpServletExtensionRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddThirdPartyHttpServletExtensionRequest {
  public static final String SERIALIZED_NAME_EXTENSION_NAME = "extensionName";
  @SerializedName(SERIALIZED_NAME_EXTENSION_NAME)
  private String extensionName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumthirdPartyHttpServletExtensionSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXTENSION_CLASS = "extensionClass";
  @SerializedName(SERIALIZED_NAME_EXTENSION_CLASS)
  private String extensionClass;

  public static final String SERIALIZED_NAME_EXTENSION_ARGUMENT = "extensionArgument";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ARGUMENT)
  private List<String> extensionArgument = null;

  public static final String SERIALIZED_NAME_CROSS_ORIGIN_POLICY = "crossOriginPolicy";
  @SerializedName(SERIALIZED_NAME_CROSS_ORIGIN_POLICY)
  private String crossOriginPolicy;

  public static final String SERIALIZED_NAME_RESPONSE_HEADER = "responseHeader";
  @SerializedName(SERIALIZED_NAME_RESPONSE_HEADER)
  private List<String> responseHeader = null;

  public static final String SERIALIZED_NAME_CORRELATION_I_D_RESPONSE_HEADER = "correlationIDResponseHeader";
  @SerializedName(SERIALIZED_NAME_CORRELATION_I_D_RESPONSE_HEADER)
  private String correlationIDResponseHeader;

  public AddThirdPartyHttpServletExtensionRequest() {
  }

  public AddThirdPartyHttpServletExtensionRequest extensionName(String extensionName) {
    
    
    
    
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


  public AddThirdPartyHttpServletExtensionRequest description(String description) {
    
    
    
    
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


  public AddThirdPartyHttpServletExtensionRequest schemas(List<EnumthirdPartyHttpServletExtensionSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddThirdPartyHttpServletExtensionRequest addSchemasItem(EnumthirdPartyHttpServletExtensionSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumthirdPartyHttpServletExtensionSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumthirdPartyHttpServletExtensionSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddThirdPartyHttpServletExtensionRequest extensionClass(String extensionClass) {
    
    
    
    
    this.extensionClass = extensionClass;
    return this;
  }

   /**
   * The fully-qualified name of the Java class providing the logic for the Third Party HTTP Servlet Extension.
   * @return extensionClass
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The fully-qualified name of the Java class providing the logic for the Third Party HTTP Servlet Extension.")

  public String getExtensionClass() {
    return extensionClass;
  }


  public void setExtensionClass(String extensionClass) {
    
    
    
    this.extensionClass = extensionClass;
  }


  public AddThirdPartyHttpServletExtensionRequest extensionArgument(List<String> extensionArgument) {
    
    
    
    
    this.extensionArgument = extensionArgument;
    return this;
  }

  public AddThirdPartyHttpServletExtensionRequest addExtensionArgumentItem(String extensionArgumentItem) {
    if (this.extensionArgument == null) {
      this.extensionArgument = new ArrayList<>();
    }
    this.extensionArgument.add(extensionArgumentItem);
    return this;
  }

   /**
   * The set of arguments used to customize the behavior for the Third Party HTTP Servlet Extension. Each configuration property should be given in the form &#39;name&#x3D;value&#39;.
   * @return extensionArgument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The set of arguments used to customize the behavior for the Third Party HTTP Servlet Extension. Each configuration property should be given in the form 'name=value'.")

  public List<String> getExtensionArgument() {
    return extensionArgument;
  }


  public void setExtensionArgument(List<String> extensionArgument) {
    
    
    
    this.extensionArgument = extensionArgument;
  }


  public AddThirdPartyHttpServletExtensionRequest crossOriginPolicy(String crossOriginPolicy) {
    
    
    
    
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


  public AddThirdPartyHttpServletExtensionRequest responseHeader(List<String> responseHeader) {
    
    
    
    
    this.responseHeader = responseHeader;
    return this;
  }

  public AddThirdPartyHttpServletExtensionRequest addResponseHeaderItem(String responseHeaderItem) {
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


  public AddThirdPartyHttpServletExtensionRequest correlationIDResponseHeader(String correlationIDResponseHeader) {
    
    
    
    
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
   * @return the AddThirdPartyHttpServletExtensionRequest instance itself
   */
  public AddThirdPartyHttpServletExtensionRequest putAdditionalProperty(String key, Object value) {
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
    AddThirdPartyHttpServletExtensionRequest addThirdPartyHttpServletExtensionRequest = (AddThirdPartyHttpServletExtensionRequest) o;
    return Objects.equals(this.extensionName, addThirdPartyHttpServletExtensionRequest.extensionName) &&
        Objects.equals(this.description, addThirdPartyHttpServletExtensionRequest.description) &&
        Objects.equals(this.schemas, addThirdPartyHttpServletExtensionRequest.schemas) &&
        Objects.equals(this.extensionClass, addThirdPartyHttpServletExtensionRequest.extensionClass) &&
        Objects.equals(this.extensionArgument, addThirdPartyHttpServletExtensionRequest.extensionArgument) &&
        Objects.equals(this.crossOriginPolicy, addThirdPartyHttpServletExtensionRequest.crossOriginPolicy) &&
        Objects.equals(this.responseHeader, addThirdPartyHttpServletExtensionRequest.responseHeader) &&
        Objects.equals(this.correlationIDResponseHeader, addThirdPartyHttpServletExtensionRequest.correlationIDResponseHeader)&&
        Objects.equals(this.additionalProperties, addThirdPartyHttpServletExtensionRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensionName, description, schemas, extensionClass, extensionArgument, crossOriginPolicy, responseHeader, correlationIDResponseHeader, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddThirdPartyHttpServletExtensionRequest {\n");
    sb.append("    extensionName: ").append(toIndentedString(extensionName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    extensionClass: ").append(toIndentedString(extensionClass)).append("\n");
    sb.append("    extensionArgument: ").append(toIndentedString(extensionArgument)).append("\n");
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
    openapiFields.add("extensionClass");
    openapiFields.add("extensionArgument");
    openapiFields.add("crossOriginPolicy");
    openapiFields.add("responseHeader");
    openapiFields.add("correlationIDResponseHeader");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("extensionName");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("extensionClass");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddThirdPartyHttpServletExtensionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddThirdPartyHttpServletExtensionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddThirdPartyHttpServletExtensionRequest is not found in the empty JSON string", AddThirdPartyHttpServletExtensionRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddThirdPartyHttpServletExtensionRequest.openapiRequiredFields) {
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
      if (!jsonObj.get("extensionClass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extensionClass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extensionClass").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("extensionArgument") != null && !jsonObj.get("extensionArgument").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `extensionArgument` to be an array in the JSON string but got `%s`", jsonObj.get("extensionArgument").toString()));
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
       if (!AddThirdPartyHttpServletExtensionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddThirdPartyHttpServletExtensionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddThirdPartyHttpServletExtensionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddThirdPartyHttpServletExtensionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddThirdPartyHttpServletExtensionRequest>() {
           @Override
           public void write(JsonWriter out, AddThirdPartyHttpServletExtensionRequest value) throws IOException {
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
           public AddThirdPartyHttpServletExtensionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddThirdPartyHttpServletExtensionRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddThirdPartyHttpServletExtensionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddThirdPartyHttpServletExtensionRequest
  * @throws IOException if the JSON string is invalid with respect to AddThirdPartyHttpServletExtensionRequest
  */
  public static AddThirdPartyHttpServletExtensionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddThirdPartyHttpServletExtensionRequest.class);
  }

 /**
  * Convert an instance of AddThirdPartyHttpServletExtensionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

