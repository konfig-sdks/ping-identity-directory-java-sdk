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
import com.konfigthis.client.model.EnumthirdPartyPassThroughAuthenticationHandlerSchemaUrn;
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
 * ThirdPartyPassThroughAuthenticationHandlerResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ThirdPartyPassThroughAuthenticationHandlerResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumthirdPartyPassThroughAuthenticationHandlerSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXTENSION_CLASS = "extensionClass";
  @SerializedName(SERIALIZED_NAME_EXTENSION_CLASS)
  private String extensionClass;

  public static final String SERIALIZED_NAME_EXTENSION_ARGUMENT = "extensionArgument";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ARGUMENT)
  private List<String> extensionArgument = null;

  public static final String SERIALIZED_NAME_INCLUDED_LOCAL_ENTRY_BASE_D_N = "includedLocalEntryBaseDN";
  @SerializedName(SERIALIZED_NAME_INCLUDED_LOCAL_ENTRY_BASE_D_N)
  private List<String> includedLocalEntryBaseDN = null;

  public static final String SERIALIZED_NAME_CONNECTION_CRITERIA = "connectionCriteria";
  @SerializedName(SERIALIZED_NAME_CONNECTION_CRITERIA)
  private String connectionCriteria;

  public static final String SERIALIZED_NAME_REQUEST_CRITERIA = "requestCriteria";
  @SerializedName(SERIALIZED_NAME_REQUEST_CRITERIA)
  private String requestCriteria;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public ThirdPartyPassThroughAuthenticationHandlerResponse() {
  }

  public ThirdPartyPassThroughAuthenticationHandlerResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Pass Through Authentication Handler
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the Pass Through Authentication Handler")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ThirdPartyPassThroughAuthenticationHandlerResponse description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Pass Through Authentication Handler
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Pass Through Authentication Handler")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ThirdPartyPassThroughAuthenticationHandlerResponse schemas(List<EnumthirdPartyPassThroughAuthenticationHandlerSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public ThirdPartyPassThroughAuthenticationHandlerResponse addSchemasItem(EnumthirdPartyPassThroughAuthenticationHandlerSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumthirdPartyPassThroughAuthenticationHandlerSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumthirdPartyPassThroughAuthenticationHandlerSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public ThirdPartyPassThroughAuthenticationHandlerResponse extensionClass(String extensionClass) {
    
    
    
    
    this.extensionClass = extensionClass;
    return this;
  }

   /**
   * The fully-qualified name of the Java class providing the logic for the Third Party Pass Through Authentication Handler.
   * @return extensionClass
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The fully-qualified name of the Java class providing the logic for the Third Party Pass Through Authentication Handler.")

  public String getExtensionClass() {
    return extensionClass;
  }


  public void setExtensionClass(String extensionClass) {
    
    
    
    this.extensionClass = extensionClass;
  }


  public ThirdPartyPassThroughAuthenticationHandlerResponse extensionArgument(List<String> extensionArgument) {
    
    
    
    
    this.extensionArgument = extensionArgument;
    return this;
  }

  public ThirdPartyPassThroughAuthenticationHandlerResponse addExtensionArgumentItem(String extensionArgumentItem) {
    if (this.extensionArgument == null) {
      this.extensionArgument = new ArrayList<>();
    }
    this.extensionArgument.add(extensionArgumentItem);
    return this;
  }

   /**
   * The set of arguments used to customize the behavior for the Third Party Pass Through Authentication Handler. Each configuration property should be given in the form &#39;name&#x3D;value&#39;.
   * @return extensionArgument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The set of arguments used to customize the behavior for the Third Party Pass Through Authentication Handler. Each configuration property should be given in the form 'name=value'.")

  public List<String> getExtensionArgument() {
    return extensionArgument;
  }


  public void setExtensionArgument(List<String> extensionArgument) {
    
    
    
    this.extensionArgument = extensionArgument;
  }


  public ThirdPartyPassThroughAuthenticationHandlerResponse includedLocalEntryBaseDN(List<String> includedLocalEntryBaseDN) {
    
    
    
    
    this.includedLocalEntryBaseDN = includedLocalEntryBaseDN;
    return this;
  }

  public ThirdPartyPassThroughAuthenticationHandlerResponse addIncludedLocalEntryBaseDNItem(String includedLocalEntryBaseDNItem) {
    if (this.includedLocalEntryBaseDN == null) {
      this.includedLocalEntryBaseDN = new ArrayList<>();
    }
    this.includedLocalEntryBaseDN.add(includedLocalEntryBaseDNItem);
    return this;
  }

   /**
   * The base DNs for the local users whose authentication attempts may be passed through to the external authentication service.
   * @return includedLocalEntryBaseDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The base DNs for the local users whose authentication attempts may be passed through to the external authentication service.")

  public List<String> getIncludedLocalEntryBaseDN() {
    return includedLocalEntryBaseDN;
  }


  public void setIncludedLocalEntryBaseDN(List<String> includedLocalEntryBaseDN) {
    
    
    
    this.includedLocalEntryBaseDN = includedLocalEntryBaseDN;
  }


  public ThirdPartyPassThroughAuthenticationHandlerResponse connectionCriteria(String connectionCriteria) {
    
    
    
    
    this.connectionCriteria = connectionCriteria;
    return this;
  }

   /**
   * A reference to connection criteria that will be used to indicate which bind requests should be passed through to the external authentication service.
   * @return connectionCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to connection criteria that will be used to indicate which bind requests should be passed through to the external authentication service.")

  public String getConnectionCriteria() {
    return connectionCriteria;
  }


  public void setConnectionCriteria(String connectionCriteria) {
    
    
    
    this.connectionCriteria = connectionCriteria;
  }


  public ThirdPartyPassThroughAuthenticationHandlerResponse requestCriteria(String requestCriteria) {
    
    
    
    
    this.requestCriteria = requestCriteria;
    return this;
  }

   /**
   * A reference to request criteria that will be used to indicate which bind requests should be passed through to the external authentication service.
   * @return requestCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to request criteria that will be used to indicate which bind requests should be passed through to the external authentication service.")

  public String getRequestCriteria() {
    return requestCriteria;
  }


  public void setRequestCriteria(String requestCriteria) {
    
    
    
    this.requestCriteria = requestCriteria;
  }


  public ThirdPartyPassThroughAuthenticationHandlerResponse meta(MetaMeta meta) {
    
    
    
    
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


  public ThirdPartyPassThroughAuthenticationHandlerResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the ThirdPartyPassThroughAuthenticationHandlerResponse instance itself
   */
  public ThirdPartyPassThroughAuthenticationHandlerResponse putAdditionalProperty(String key, Object value) {
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
    ThirdPartyPassThroughAuthenticationHandlerResponse thirdPartyPassThroughAuthenticationHandlerResponse = (ThirdPartyPassThroughAuthenticationHandlerResponse) o;
    return Objects.equals(this.id, thirdPartyPassThroughAuthenticationHandlerResponse.id) &&
        Objects.equals(this.description, thirdPartyPassThroughAuthenticationHandlerResponse.description) &&
        Objects.equals(this.schemas, thirdPartyPassThroughAuthenticationHandlerResponse.schemas) &&
        Objects.equals(this.extensionClass, thirdPartyPassThroughAuthenticationHandlerResponse.extensionClass) &&
        Objects.equals(this.extensionArgument, thirdPartyPassThroughAuthenticationHandlerResponse.extensionArgument) &&
        Objects.equals(this.includedLocalEntryBaseDN, thirdPartyPassThroughAuthenticationHandlerResponse.includedLocalEntryBaseDN) &&
        Objects.equals(this.connectionCriteria, thirdPartyPassThroughAuthenticationHandlerResponse.connectionCriteria) &&
        Objects.equals(this.requestCriteria, thirdPartyPassThroughAuthenticationHandlerResponse.requestCriteria) &&
        Objects.equals(this.meta, thirdPartyPassThroughAuthenticationHandlerResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, thirdPartyPassThroughAuthenticationHandlerResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, thirdPartyPassThroughAuthenticationHandlerResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, schemas, extensionClass, extensionArgument, includedLocalEntryBaseDN, connectionCriteria, requestCriteria, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyPassThroughAuthenticationHandlerResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    extensionClass: ").append(toIndentedString(extensionClass)).append("\n");
    sb.append("    extensionArgument: ").append(toIndentedString(extensionArgument)).append("\n");
    sb.append("    includedLocalEntryBaseDN: ").append(toIndentedString(includedLocalEntryBaseDN)).append("\n");
    sb.append("    connectionCriteria: ").append(toIndentedString(connectionCriteria)).append("\n");
    sb.append("    requestCriteria: ").append(toIndentedString(requestCriteria)).append("\n");
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
    openapiFields.add("extensionClass");
    openapiFields.add("extensionArgument");
    openapiFields.add("includedLocalEntryBaseDN");
    openapiFields.add("connectionCriteria");
    openapiFields.add("requestCriteria");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("extensionClass");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThirdPartyPassThroughAuthenticationHandlerResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ThirdPartyPassThroughAuthenticationHandlerResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThirdPartyPassThroughAuthenticationHandlerResponse is not found in the empty JSON string", ThirdPartyPassThroughAuthenticationHandlerResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ThirdPartyPassThroughAuthenticationHandlerResponse.openapiRequiredFields) {
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
      if (!jsonObj.get("extensionClass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extensionClass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extensionClass").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("extensionArgument") != null && !jsonObj.get("extensionArgument").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `extensionArgument` to be an array in the JSON string but got `%s`", jsonObj.get("extensionArgument").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("includedLocalEntryBaseDN") != null && !jsonObj.get("includedLocalEntryBaseDN").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includedLocalEntryBaseDN` to be an array in the JSON string but got `%s`", jsonObj.get("includedLocalEntryBaseDN").toString()));
      }
      if ((jsonObj.get("connectionCriteria") != null && !jsonObj.get("connectionCriteria").isJsonNull()) && !jsonObj.get("connectionCriteria").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connectionCriteria` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connectionCriteria").toString()));
      }
      if ((jsonObj.get("requestCriteria") != null && !jsonObj.get("requestCriteria").isJsonNull()) && !jsonObj.get("requestCriteria").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestCriteria` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestCriteria").toString()));
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
       if (!ThirdPartyPassThroughAuthenticationHandlerResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThirdPartyPassThroughAuthenticationHandlerResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThirdPartyPassThroughAuthenticationHandlerResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThirdPartyPassThroughAuthenticationHandlerResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ThirdPartyPassThroughAuthenticationHandlerResponse>() {
           @Override
           public void write(JsonWriter out, ThirdPartyPassThroughAuthenticationHandlerResponse value) throws IOException {
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
           public ThirdPartyPassThroughAuthenticationHandlerResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ThirdPartyPassThroughAuthenticationHandlerResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ThirdPartyPassThroughAuthenticationHandlerResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ThirdPartyPassThroughAuthenticationHandlerResponse
  * @throws IOException if the JSON string is invalid with respect to ThirdPartyPassThroughAuthenticationHandlerResponse
  */
  public static ThirdPartyPassThroughAuthenticationHandlerResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThirdPartyPassThroughAuthenticationHandlerResponse.class);
  }

 /**
  * Convert an instance of ThirdPartyPassThroughAuthenticationHandlerResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

