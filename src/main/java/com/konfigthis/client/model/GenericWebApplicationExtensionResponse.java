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
import com.konfigthis.client.model.EnumgenericWebApplicationExtensionSchemaUrn;
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
 * GenericWebApplicationExtensionResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GenericWebApplicationExtensionResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumgenericWebApplicationExtensionSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_BASE_CONTEXT_PATH = "baseContextPath";
  @SerializedName(SERIALIZED_NAME_BASE_CONTEXT_PATH)
  private String baseContextPath;

  public static final String SERIALIZED_NAME_WAR_FILE = "warFile";
  @SerializedName(SERIALIZED_NAME_WAR_FILE)
  private String warFile;

  public static final String SERIALIZED_NAME_DOCUMENT_ROOT_DIRECTORY = "documentRootDirectory";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ROOT_DIRECTORY)
  private String documentRootDirectory;

  public static final String SERIALIZED_NAME_DEPLOYMENT_DESCRIPTOR_FILE = "deploymentDescriptorFile";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_DESCRIPTOR_FILE)
  private String deploymentDescriptorFile;

  public static final String SERIALIZED_NAME_TEMPORARY_DIRECTORY = "temporaryDirectory";
  @SerializedName(SERIALIZED_NAME_TEMPORARY_DIRECTORY)
  private String temporaryDirectory;

  public static final String SERIALIZED_NAME_INIT_PARAMETER = "initParameter";
  @SerializedName(SERIALIZED_NAME_INIT_PARAMETER)
  private List<String> initParameter = null;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public GenericWebApplicationExtensionResponse() {
  }

  public GenericWebApplicationExtensionResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Web Application Extension
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the Web Application Extension")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public GenericWebApplicationExtensionResponse description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Web Application Extension
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Web Application Extension")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public GenericWebApplicationExtensionResponse schemas(List<EnumgenericWebApplicationExtensionSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public GenericWebApplicationExtensionResponse addSchemasItem(EnumgenericWebApplicationExtensionSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumgenericWebApplicationExtensionSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumgenericWebApplicationExtensionSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public GenericWebApplicationExtensionResponse baseContextPath(String baseContextPath) {
    
    
    
    
    this.baseContextPath = baseContextPath;
    return this;
  }

   /**
   * Specifies the base context path that should be used by HTTP clients to reference content. The value must start with a forward slash and at least one additional character and must represent a valid HTTP context path.
   * @return baseContextPath
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the base context path that should be used by HTTP clients to reference content. The value must start with a forward slash and at least one additional character and must represent a valid HTTP context path.")

  public String getBaseContextPath() {
    return baseContextPath;
  }


  public void setBaseContextPath(String baseContextPath) {
    
    
    
    this.baseContextPath = baseContextPath;
  }


  public GenericWebApplicationExtensionResponse warFile(String warFile) {
    
    
    
    
    this.warFile = warFile;
    return this;
  }

   /**
   * Specifies the path to a standard web application archive (WAR) file.
   * @return warFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the path to a standard web application archive (WAR) file.")

  public String getWarFile() {
    return warFile;
  }


  public void setWarFile(String warFile) {
    
    
    
    this.warFile = warFile;
  }


  public GenericWebApplicationExtensionResponse documentRootDirectory(String documentRootDirectory) {
    
    
    
    
    this.documentRootDirectory = documentRootDirectory;
    return this;
  }

   /**
   * Specifies the path to the directory on the local filesystem containing the files to be served by this Web Application Extension. The path must exist, and it must be a directory.
   * @return documentRootDirectory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the path to the directory on the local filesystem containing the files to be served by this Web Application Extension. The path must exist, and it must be a directory.")

  public String getDocumentRootDirectory() {
    return documentRootDirectory;
  }


  public void setDocumentRootDirectory(String documentRootDirectory) {
    
    
    
    this.documentRootDirectory = documentRootDirectory;
  }


  public GenericWebApplicationExtensionResponse deploymentDescriptorFile(String deploymentDescriptorFile) {
    
    
    
    
    this.deploymentDescriptorFile = deploymentDescriptorFile;
    return this;
  }

   /**
   * Specifies the path to the deployment descriptor file when used with document-root-directory.
   * @return deploymentDescriptorFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the path to the deployment descriptor file when used with document-root-directory.")

  public String getDeploymentDescriptorFile() {
    return deploymentDescriptorFile;
  }


  public void setDeploymentDescriptorFile(String deploymentDescriptorFile) {
    
    
    
    this.deploymentDescriptorFile = deploymentDescriptorFile;
  }


  public GenericWebApplicationExtensionResponse temporaryDirectory(String temporaryDirectory) {
    
    
    
    
    this.temporaryDirectory = temporaryDirectory;
    return this;
  }

   /**
   * Specifies the path to the directory that may be used to store temporary files such as extracted WAR files and compiled JSP files.
   * @return temporaryDirectory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the path to the directory that may be used to store temporary files such as extracted WAR files and compiled JSP files.")

  public String getTemporaryDirectory() {
    return temporaryDirectory;
  }


  public void setTemporaryDirectory(String temporaryDirectory) {
    
    
    
    this.temporaryDirectory = temporaryDirectory;
  }


  public GenericWebApplicationExtensionResponse initParameter(List<String> initParameter) {
    
    
    
    
    this.initParameter = initParameter;
    return this;
  }

  public GenericWebApplicationExtensionResponse addInitParameterItem(String initParameterItem) {
    if (this.initParameter == null) {
      this.initParameter = new ArrayList<>();
    }
    this.initParameter.add(initParameterItem);
    return this;
  }

   /**
   * Specifies an initialization parameter to pass into the web application during startup.
   * @return initParameter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an initialization parameter to pass into the web application during startup.")

  public List<String> getInitParameter() {
    return initParameter;
  }


  public void setInitParameter(List<String> initParameter) {
    
    
    
    this.initParameter = initParameter;
  }


  public GenericWebApplicationExtensionResponse meta(MetaMeta meta) {
    
    
    
    
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


  public GenericWebApplicationExtensionResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the GenericWebApplicationExtensionResponse instance itself
   */
  public GenericWebApplicationExtensionResponse putAdditionalProperty(String key, Object value) {
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
    GenericWebApplicationExtensionResponse genericWebApplicationExtensionResponse = (GenericWebApplicationExtensionResponse) o;
    return Objects.equals(this.id, genericWebApplicationExtensionResponse.id) &&
        Objects.equals(this.description, genericWebApplicationExtensionResponse.description) &&
        Objects.equals(this.schemas, genericWebApplicationExtensionResponse.schemas) &&
        Objects.equals(this.baseContextPath, genericWebApplicationExtensionResponse.baseContextPath) &&
        Objects.equals(this.warFile, genericWebApplicationExtensionResponse.warFile) &&
        Objects.equals(this.documentRootDirectory, genericWebApplicationExtensionResponse.documentRootDirectory) &&
        Objects.equals(this.deploymentDescriptorFile, genericWebApplicationExtensionResponse.deploymentDescriptorFile) &&
        Objects.equals(this.temporaryDirectory, genericWebApplicationExtensionResponse.temporaryDirectory) &&
        Objects.equals(this.initParameter, genericWebApplicationExtensionResponse.initParameter) &&
        Objects.equals(this.meta, genericWebApplicationExtensionResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, genericWebApplicationExtensionResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, genericWebApplicationExtensionResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, schemas, baseContextPath, warFile, documentRootDirectory, deploymentDescriptorFile, temporaryDirectory, initParameter, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericWebApplicationExtensionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    baseContextPath: ").append(toIndentedString(baseContextPath)).append("\n");
    sb.append("    warFile: ").append(toIndentedString(warFile)).append("\n");
    sb.append("    documentRootDirectory: ").append(toIndentedString(documentRootDirectory)).append("\n");
    sb.append("    deploymentDescriptorFile: ").append(toIndentedString(deploymentDescriptorFile)).append("\n");
    sb.append("    temporaryDirectory: ").append(toIndentedString(temporaryDirectory)).append("\n");
    sb.append("    initParameter: ").append(toIndentedString(initParameter)).append("\n");
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
    openapiFields.add("baseContextPath");
    openapiFields.add("warFile");
    openapiFields.add("documentRootDirectory");
    openapiFields.add("deploymentDescriptorFile");
    openapiFields.add("temporaryDirectory");
    openapiFields.add("initParameter");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("baseContextPath");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GenericWebApplicationExtensionResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GenericWebApplicationExtensionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenericWebApplicationExtensionResponse is not found in the empty JSON string", GenericWebApplicationExtensionResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GenericWebApplicationExtensionResponse.openapiRequiredFields) {
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
      if (!jsonObj.get("baseContextPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseContextPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseContextPath").toString()));
      }
      if ((jsonObj.get("warFile") != null && !jsonObj.get("warFile").isJsonNull()) && !jsonObj.get("warFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warFile").toString()));
      }
      if ((jsonObj.get("documentRootDirectory") != null && !jsonObj.get("documentRootDirectory").isJsonNull()) && !jsonObj.get("documentRootDirectory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentRootDirectory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentRootDirectory").toString()));
      }
      if ((jsonObj.get("deploymentDescriptorFile") != null && !jsonObj.get("deploymentDescriptorFile").isJsonNull()) && !jsonObj.get("deploymentDescriptorFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deploymentDescriptorFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deploymentDescriptorFile").toString()));
      }
      if ((jsonObj.get("temporaryDirectory") != null && !jsonObj.get("temporaryDirectory").isJsonNull()) && !jsonObj.get("temporaryDirectory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `temporaryDirectory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("temporaryDirectory").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("initParameter") != null && !jsonObj.get("initParameter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `initParameter` to be an array in the JSON string but got `%s`", jsonObj.get("initParameter").toString()));
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
       if (!GenericWebApplicationExtensionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenericWebApplicationExtensionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenericWebApplicationExtensionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenericWebApplicationExtensionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GenericWebApplicationExtensionResponse>() {
           @Override
           public void write(JsonWriter out, GenericWebApplicationExtensionResponse value) throws IOException {
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
           public GenericWebApplicationExtensionResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GenericWebApplicationExtensionResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GenericWebApplicationExtensionResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenericWebApplicationExtensionResponse
  * @throws IOException if the JSON string is invalid with respect to GenericWebApplicationExtensionResponse
  */
  public static GenericWebApplicationExtensionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenericWebApplicationExtensionResponse.class);
  }

 /**
  * Convert an instance of GenericWebApplicationExtensionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

