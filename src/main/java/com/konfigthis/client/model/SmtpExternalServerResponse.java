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
import com.konfigthis.client.model.EnumexternalServerSmtpSecurityProp;
import com.konfigthis.client.model.EnumsmtpExternalServerSchemaUrn;
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
 * SmtpExternalServerResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SmtpExternalServerResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumsmtpExternalServerSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_SERVER_HOST_NAME = "serverHostName";
  @SerializedName(SERIALIZED_NAME_SERVER_HOST_NAME)
  private String serverHostName;

  public static final String SERIALIZED_NAME_SERVER_PORT = "serverPort";
  @SerializedName(SERIALIZED_NAME_SERVER_PORT)
  private Integer serverPort;

  public static final String SERIALIZED_NAME_SMTP_SECURITY = "smtpSecurity";
  @SerializedName(SERIALIZED_NAME_SMTP_SECURITY)
  private EnumexternalServerSmtpSecurityProp smtpSecurity;

  public static final String SERIALIZED_NAME_USER_NAME = "userName";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PASSPHRASE_PROVIDER = "passphraseProvider";
  @SerializedName(SERIALIZED_NAME_PASSPHRASE_PROVIDER)
  private String passphraseProvider;

  public static final String SERIALIZED_NAME_SMTP_TIMEOUT = "smtpTimeout";
  @SerializedName(SERIALIZED_NAME_SMTP_TIMEOUT)
  private String smtpTimeout;

  public static final String SERIALIZED_NAME_SMTP_CONNECTION_PROPERTIES = "smtpConnectionProperties";
  @SerializedName(SERIALIZED_NAME_SMTP_CONNECTION_PROPERTIES)
  private List<String> smtpConnectionProperties = null;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public SmtpExternalServerResponse() {
  }

  public SmtpExternalServerResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the External Server
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the External Server")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public SmtpExternalServerResponse description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this External Server
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this External Server")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public SmtpExternalServerResponse schemas(List<EnumsmtpExternalServerSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public SmtpExternalServerResponse addSchemasItem(EnumsmtpExternalServerSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumsmtpExternalServerSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumsmtpExternalServerSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public SmtpExternalServerResponse serverHostName(String serverHostName) {
    
    
    
    
    this.serverHostName = serverHostName;
    return this;
  }

   /**
   * The host name of the smtp server.
   * @return serverHostName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The host name of the smtp server.")

  public String getServerHostName() {
    return serverHostName;
  }


  public void setServerHostName(String serverHostName) {
    
    
    
    this.serverHostName = serverHostName;
  }


  public SmtpExternalServerResponse serverPort(Integer serverPort) {
    
    
    
    
    this.serverPort = serverPort;
    return this;
  }

   /**
   * The port number where the smtp server listens for requests.
   * @return serverPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The port number where the smtp server listens for requests.")

  public Integer getServerPort() {
    return serverPort;
  }


  public void setServerPort(Integer serverPort) {
    
    
    
    this.serverPort = serverPort;
  }


  public SmtpExternalServerResponse smtpSecurity(EnumexternalServerSmtpSecurityProp smtpSecurity) {
    
    
    
    
    this.smtpSecurity = smtpSecurity;
    return this;
  }

   /**
   * Get smtpSecurity
   * @return smtpSecurity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumexternalServerSmtpSecurityProp getSmtpSecurity() {
    return smtpSecurity;
  }


  public void setSmtpSecurity(EnumexternalServerSmtpSecurityProp smtpSecurity) {
    
    
    
    this.smtpSecurity = smtpSecurity;
  }


  public SmtpExternalServerResponse userName(String userName) {
    
    
    
    
    this.userName = userName;
    return this;
  }

   /**
   * The name of the login account to use when connecting to the smtp server. Both username and password must be supplied if this attribute is set.
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the login account to use when connecting to the smtp server. Both username and password must be supplied if this attribute is set.")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    
    
    
    this.userName = userName;
  }


  public SmtpExternalServerResponse password(String password) {
    
    
    
    
    this.password = password;
    return this;
  }

   /**
   * The login password for the specified user name. Both username and password must be supplied if this attribute is set.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The login password for the specified user name. Both username and password must be supplied if this attribute is set.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    
    
    
    this.password = password;
  }


  public SmtpExternalServerResponse passphraseProvider(String passphraseProvider) {
    
    
    
    
    this.passphraseProvider = passphraseProvider;
    return this;
  }

   /**
   * The passphrase provider to use to obtain the login password for the specified user.
   * @return passphraseProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The passphrase provider to use to obtain the login password for the specified user.")

  public String getPassphraseProvider() {
    return passphraseProvider;
  }


  public void setPassphraseProvider(String passphraseProvider) {
    
    
    
    this.passphraseProvider = passphraseProvider;
  }


  public SmtpExternalServerResponse smtpTimeout(String smtpTimeout) {
    
    
    
    
    this.smtpTimeout = smtpTimeout;
    return this;
  }

   /**
   * Specifies the maximum length of time that a connection or attempted connection to a SMTP server may take.
   * @return smtpTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the maximum length of time that a connection or attempted connection to a SMTP server may take.")

  public String getSmtpTimeout() {
    return smtpTimeout;
  }


  public void setSmtpTimeout(String smtpTimeout) {
    
    
    
    this.smtpTimeout = smtpTimeout;
  }


  public SmtpExternalServerResponse smtpConnectionProperties(List<String> smtpConnectionProperties) {
    
    
    
    
    this.smtpConnectionProperties = smtpConnectionProperties;
    return this;
  }

  public SmtpExternalServerResponse addSmtpConnectionPropertiesItem(String smtpConnectionPropertiesItem) {
    if (this.smtpConnectionProperties == null) {
      this.smtpConnectionProperties = new ArrayList<>();
    }
    this.smtpConnectionProperties.add(smtpConnectionPropertiesItem);
    return this;
  }

   /**
   * Specifies the connection properties for the smtp server.
   * @return smtpConnectionProperties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the connection properties for the smtp server.")

  public List<String> getSmtpConnectionProperties() {
    return smtpConnectionProperties;
  }


  public void setSmtpConnectionProperties(List<String> smtpConnectionProperties) {
    
    
    
    this.smtpConnectionProperties = smtpConnectionProperties;
  }


  public SmtpExternalServerResponse meta(MetaMeta meta) {
    
    
    
    
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


  public SmtpExternalServerResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the SmtpExternalServerResponse instance itself
   */
  public SmtpExternalServerResponse putAdditionalProperty(String key, Object value) {
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
    SmtpExternalServerResponse smtpExternalServerResponse = (SmtpExternalServerResponse) o;
    return Objects.equals(this.id, smtpExternalServerResponse.id) &&
        Objects.equals(this.description, smtpExternalServerResponse.description) &&
        Objects.equals(this.schemas, smtpExternalServerResponse.schemas) &&
        Objects.equals(this.serverHostName, smtpExternalServerResponse.serverHostName) &&
        Objects.equals(this.serverPort, smtpExternalServerResponse.serverPort) &&
        Objects.equals(this.smtpSecurity, smtpExternalServerResponse.smtpSecurity) &&
        Objects.equals(this.userName, smtpExternalServerResponse.userName) &&
        Objects.equals(this.password, smtpExternalServerResponse.password) &&
        Objects.equals(this.passphraseProvider, smtpExternalServerResponse.passphraseProvider) &&
        Objects.equals(this.smtpTimeout, smtpExternalServerResponse.smtpTimeout) &&
        Objects.equals(this.smtpConnectionProperties, smtpExternalServerResponse.smtpConnectionProperties) &&
        Objects.equals(this.meta, smtpExternalServerResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, smtpExternalServerResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, smtpExternalServerResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, schemas, serverHostName, serverPort, smtpSecurity, userName, password, passphraseProvider, smtpTimeout, smtpConnectionProperties, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmtpExternalServerResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    serverHostName: ").append(toIndentedString(serverHostName)).append("\n");
    sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
    sb.append("    smtpSecurity: ").append(toIndentedString(smtpSecurity)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passphraseProvider: ").append(toIndentedString(passphraseProvider)).append("\n");
    sb.append("    smtpTimeout: ").append(toIndentedString(smtpTimeout)).append("\n");
    sb.append("    smtpConnectionProperties: ").append(toIndentedString(smtpConnectionProperties)).append("\n");
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
    openapiFields.add("serverHostName");
    openapiFields.add("serverPort");
    openapiFields.add("smtpSecurity");
    openapiFields.add("userName");
    openapiFields.add("password");
    openapiFields.add("passphraseProvider");
    openapiFields.add("smtpTimeout");
    openapiFields.add("smtpConnectionProperties");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("serverHostName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SmtpExternalServerResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SmtpExternalServerResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SmtpExternalServerResponse is not found in the empty JSON string", SmtpExternalServerResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SmtpExternalServerResponse.openapiRequiredFields) {
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
      if (!jsonObj.get("serverHostName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverHostName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverHostName").toString()));
      }
      if ((jsonObj.get("userName") != null && !jsonObj.get("userName").isJsonNull()) && !jsonObj.get("userName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userName").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("passphraseProvider") != null && !jsonObj.get("passphraseProvider").isJsonNull()) && !jsonObj.get("passphraseProvider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passphraseProvider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passphraseProvider").toString()));
      }
      if ((jsonObj.get("smtpTimeout") != null && !jsonObj.get("smtpTimeout").isJsonNull()) && !jsonObj.get("smtpTimeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `smtpTimeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("smtpTimeout").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("smtpConnectionProperties") != null && !jsonObj.get("smtpConnectionProperties").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `smtpConnectionProperties` to be an array in the JSON string but got `%s`", jsonObj.get("smtpConnectionProperties").toString()));
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
       if (!SmtpExternalServerResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SmtpExternalServerResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SmtpExternalServerResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SmtpExternalServerResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SmtpExternalServerResponse>() {
           @Override
           public void write(JsonWriter out, SmtpExternalServerResponse value) throws IOException {
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
           public SmtpExternalServerResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SmtpExternalServerResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SmtpExternalServerResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SmtpExternalServerResponse
  * @throws IOException if the JSON string is invalid with respect to SmtpExternalServerResponse
  */
  public static SmtpExternalServerResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SmtpExternalServerResponse.class);
  }

 /**
  * Convert an instance of SmtpExternalServerResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

