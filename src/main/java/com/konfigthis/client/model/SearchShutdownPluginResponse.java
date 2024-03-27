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
import com.konfigthis.client.model.EnumpluginScopeProp;
import com.konfigthis.client.model.EnumsearchShutdownPluginSchemaUrn;
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
 * SearchShutdownPluginResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SearchShutdownPluginResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumsearchShutdownPluginSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_BASE_D_N = "baseDN";
  @SerializedName(SERIALIZED_NAME_BASE_D_N)
  private String baseDN;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private EnumpluginScopeProp scope;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_INCLUDE_ATTRIBUTE = "includeAttribute";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ATTRIBUTE)
  private List<String> includeAttribute = null;

  public static final String SERIALIZED_NAME_OUTPUT_FILE = "outputFile";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FILE)
  private String outputFile;

  public static final String SERIALIZED_NAME_PREVIOUS_FILE_EXTENSION = "previousFileExtension";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_FILE_EXTENSION)
  private String previousFileExtension;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public SearchShutdownPluginResponse() {
  }

  public SearchShutdownPluginResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Plugin
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the Plugin")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public SearchShutdownPluginResponse description(String description) {
    
    
    
    
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


  public SearchShutdownPluginResponse schemas(List<EnumsearchShutdownPluginSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public SearchShutdownPluginResponse addSchemasItem(EnumsearchShutdownPluginSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumsearchShutdownPluginSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumsearchShutdownPluginSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public SearchShutdownPluginResponse baseDN(String baseDN) {
    
    
    
    
    this.baseDN = baseDN;
    return this;
  }

   /**
   * The base DN to use for the search.
   * @return baseDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The base DN to use for the search.")

  public String getBaseDN() {
    return baseDN;
  }


  public void setBaseDN(String baseDN) {
    
    
    
    this.baseDN = baseDN;
  }


  public SearchShutdownPluginResponse scope(EnumpluginScopeProp scope) {
    
    
    
    
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EnumpluginScopeProp getScope() {
    return scope;
  }


  public void setScope(EnumpluginScopeProp scope) {
    
    
    
    this.scope = scope;
  }


  public SearchShutdownPluginResponse filter(String filter) {
    
    
    
    
    this.filter = filter;
    return this;
  }

   /**
   * The filter to use for the search.
   * @return filter
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The filter to use for the search.")

  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    
    
    
    this.filter = filter;
  }


  public SearchShutdownPluginResponse includeAttribute(List<String> includeAttribute) {
    
    
    
    
    this.includeAttribute = includeAttribute;
    return this;
  }

  public SearchShutdownPluginResponse addIncludeAttributeItem(String includeAttributeItem) {
    if (this.includeAttribute == null) {
      this.includeAttribute = new ArrayList<>();
    }
    this.includeAttribute.add(includeAttributeItem);
    return this;
  }

   /**
   * The name of an attribute that should be included in the results. This may include any token which is allowed as a requested attribute in search requests, including the name of an attribute, an asterisk (to indicate all user attributes), a plus sign (to indicate all operational attributes), an object class name preceded with an at symbol (to indicate all attributes associated with that object class), an attribute name preceded by a caret (to indicate that attribute should be excluded), or an object class name preceded by a caret and an at symbol (to indicate that all attributes associated with that object class should be excluded).
   * @return includeAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of an attribute that should be included in the results. This may include any token which is allowed as a requested attribute in search requests, including the name of an attribute, an asterisk (to indicate all user attributes), a plus sign (to indicate all operational attributes), an object class name preceded with an at symbol (to indicate all attributes associated with that object class), an attribute name preceded by a caret (to indicate that attribute should be excluded), or an object class name preceded by a caret and an at symbol (to indicate that all attributes associated with that object class should be excluded).")

  public List<String> getIncludeAttribute() {
    return includeAttribute;
  }


  public void setIncludeAttribute(List<String> includeAttribute) {
    
    
    
    this.includeAttribute = includeAttribute;
  }


  public SearchShutdownPluginResponse outputFile(String outputFile) {
    
    
    
    
    this.outputFile = outputFile;
    return this;
  }

   /**
   * The path of an LDIF file that should be created with the results of the search.
   * @return outputFile
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The path of an LDIF file that should be created with the results of the search.")

  public String getOutputFile() {
    return outputFile;
  }


  public void setOutputFile(String outputFile) {
    
    
    
    this.outputFile = outputFile;
  }


  public SearchShutdownPluginResponse previousFileExtension(String previousFileExtension) {
    
    
    
    
    this.previousFileExtension = previousFileExtension;
    return this;
  }

   /**
   * An extension that should be appended to the name of an existing output file rather than deleting it. If a file already exists with the full previous file name, then it will be deleted before the current file is renamed to become the previous file.
   * @return previousFileExtension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An extension that should be appended to the name of an existing output file rather than deleting it. If a file already exists with the full previous file name, then it will be deleted before the current file is renamed to become the previous file.")

  public String getPreviousFileExtension() {
    return previousFileExtension;
  }


  public void setPreviousFileExtension(String previousFileExtension) {
    
    
    
    this.previousFileExtension = previousFileExtension;
  }


  public SearchShutdownPluginResponse enabled(Boolean enabled) {
    
    
    
    
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


  public SearchShutdownPluginResponse meta(MetaMeta meta) {
    
    
    
    
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


  public SearchShutdownPluginResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the SearchShutdownPluginResponse instance itself
   */
  public SearchShutdownPluginResponse putAdditionalProperty(String key, Object value) {
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
    SearchShutdownPluginResponse searchShutdownPluginResponse = (SearchShutdownPluginResponse) o;
    return Objects.equals(this.id, searchShutdownPluginResponse.id) &&
        Objects.equals(this.description, searchShutdownPluginResponse.description) &&
        Objects.equals(this.schemas, searchShutdownPluginResponse.schemas) &&
        Objects.equals(this.baseDN, searchShutdownPluginResponse.baseDN) &&
        Objects.equals(this.scope, searchShutdownPluginResponse.scope) &&
        Objects.equals(this.filter, searchShutdownPluginResponse.filter) &&
        Objects.equals(this.includeAttribute, searchShutdownPluginResponse.includeAttribute) &&
        Objects.equals(this.outputFile, searchShutdownPluginResponse.outputFile) &&
        Objects.equals(this.previousFileExtension, searchShutdownPluginResponse.previousFileExtension) &&
        Objects.equals(this.enabled, searchShutdownPluginResponse.enabled) &&
        Objects.equals(this.meta, searchShutdownPluginResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, searchShutdownPluginResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, searchShutdownPluginResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, schemas, baseDN, scope, filter, includeAttribute, outputFile, previousFileExtension, enabled, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchShutdownPluginResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    baseDN: ").append(toIndentedString(baseDN)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    includeAttribute: ").append(toIndentedString(includeAttribute)).append("\n");
    sb.append("    outputFile: ").append(toIndentedString(outputFile)).append("\n");
    sb.append("    previousFileExtension: ").append(toIndentedString(previousFileExtension)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
    openapiFields.add("baseDN");
    openapiFields.add("scope");
    openapiFields.add("filter");
    openapiFields.add("includeAttribute");
    openapiFields.add("outputFile");
    openapiFields.add("previousFileExtension");
    openapiFields.add("enabled");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("scope");
    openapiRequiredFields.add("filter");
    openapiRequiredFields.add("outputFile");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchShutdownPluginResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchShutdownPluginResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchShutdownPluginResponse is not found in the empty JSON string", SearchShutdownPluginResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchShutdownPluginResponse.openapiRequiredFields) {
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
      if ((jsonObj.get("baseDN") != null && !jsonObj.get("baseDN").isJsonNull()) && !jsonObj.get("baseDN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseDN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseDN").toString()));
      }
      if (!jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("includeAttribute") != null && !jsonObj.get("includeAttribute").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includeAttribute` to be an array in the JSON string but got `%s`", jsonObj.get("includeAttribute").toString()));
      }
      if (!jsonObj.get("outputFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outputFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outputFile").toString()));
      }
      if ((jsonObj.get("previousFileExtension") != null && !jsonObj.get("previousFileExtension").isJsonNull()) && !jsonObj.get("previousFileExtension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previousFileExtension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previousFileExtension").toString()));
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
       if (!SearchShutdownPluginResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchShutdownPluginResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchShutdownPluginResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchShutdownPluginResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchShutdownPluginResponse>() {
           @Override
           public void write(JsonWriter out, SearchShutdownPluginResponse value) throws IOException {
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
           public SearchShutdownPluginResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SearchShutdownPluginResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SearchShutdownPluginResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchShutdownPluginResponse
  * @throws IOException if the JSON string is invalid with respect to SearchShutdownPluginResponse
  */
  public static SearchShutdownPluginResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchShutdownPluginResponse.class);
  }

 /**
  * Convert an instance of SearchShutdownPluginResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

