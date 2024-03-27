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
import com.konfigthis.client.model.EnumexternalServerJdbcDriverTypeProp;
import com.konfigthis.client.model.EnumexternalServerTransactionIsolationLevelProp;
import com.konfigthis.client.model.EnumjdbcExternalServerSchemaUrn;
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
 * AddJdbcExternalServerRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddJdbcExternalServerRequest {
  public static final String SERIALIZED_NAME_SERVER_NAME = "serverName";
  @SerializedName(SERIALIZED_NAME_SERVER_NAME)
  private String serverName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumjdbcExternalServerSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_JDBC_DRIVER_TYPE = "jdbcDriverType";
  @SerializedName(SERIALIZED_NAME_JDBC_DRIVER_TYPE)
  private EnumexternalServerJdbcDriverTypeProp jdbcDriverType;

  public static final String SERIALIZED_NAME_JDBC_DRIVER_U_R_L = "jdbcDriverURL";
  @SerializedName(SERIALIZED_NAME_JDBC_DRIVER_U_R_L)
  private String jdbcDriverURL;

  public static final String SERIALIZED_NAME_DATABASE_NAME = "databaseName";
  @SerializedName(SERIALIZED_NAME_DATABASE_NAME)
  private String databaseName;

  public static final String SERIALIZED_NAME_SERVER_HOST_NAME = "serverHostName";
  @SerializedName(SERIALIZED_NAME_SERVER_HOST_NAME)
  private String serverHostName;

  public static final String SERIALIZED_NAME_SERVER_PORT = "serverPort";
  @SerializedName(SERIALIZED_NAME_SERVER_PORT)
  private Integer serverPort;

  public static final String SERIALIZED_NAME_USER_NAME = "userName";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PASSPHRASE_PROVIDER = "passphraseProvider";
  @SerializedName(SERIALIZED_NAME_PASSPHRASE_PROVIDER)
  private String passphraseProvider;

  public static final String SERIALIZED_NAME_VALIDATION_QUERY = "validationQuery";
  @SerializedName(SERIALIZED_NAME_VALIDATION_QUERY)
  private String validationQuery;

  public static final String SERIALIZED_NAME_VALIDATION_QUERY_TIMEOUT = "validationQueryTimeout";
  @SerializedName(SERIALIZED_NAME_VALIDATION_QUERY_TIMEOUT)
  private String validationQueryTimeout;

  public static final String SERIALIZED_NAME_JDBC_CONNECTION_PROPERTIES = "jdbcConnectionProperties";
  @SerializedName(SERIALIZED_NAME_JDBC_CONNECTION_PROPERTIES)
  private List<String> jdbcConnectionProperties = null;

  public static final String SERIALIZED_NAME_TRANSACTION_ISOLATION_LEVEL = "transactionIsolationLevel";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ISOLATION_LEVEL)
  private EnumexternalServerTransactionIsolationLevelProp transactionIsolationLevel;

  public AddJdbcExternalServerRequest() {
  }

  public AddJdbcExternalServerRequest serverName(String serverName) {
    
    
    
    
    this.serverName = serverName;
    return this;
  }

   /**
   * Name of the new External Server
   * @return serverName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the new External Server")

  public String getServerName() {
    return serverName;
  }


  public void setServerName(String serverName) {
    
    
    
    this.serverName = serverName;
  }


  public AddJdbcExternalServerRequest description(String description) {
    
    
    
    
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


  public AddJdbcExternalServerRequest schemas(List<EnumjdbcExternalServerSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddJdbcExternalServerRequest addSchemasItem(EnumjdbcExternalServerSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumjdbcExternalServerSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumjdbcExternalServerSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddJdbcExternalServerRequest jdbcDriverType(EnumexternalServerJdbcDriverTypeProp jdbcDriverType) {
    
    
    
    
    this.jdbcDriverType = jdbcDriverType;
    return this;
  }

   /**
   * Get jdbcDriverType
   * @return jdbcDriverType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EnumexternalServerJdbcDriverTypeProp getJdbcDriverType() {
    return jdbcDriverType;
  }


  public void setJdbcDriverType(EnumexternalServerJdbcDriverTypeProp jdbcDriverType) {
    
    
    
    this.jdbcDriverType = jdbcDriverType;
  }


  public AddJdbcExternalServerRequest jdbcDriverURL(String jdbcDriverURL) {
    
    
    
    
    this.jdbcDriverURL = jdbcDriverURL;
    return this;
  }

   /**
   * Specify the complete JDBC URL which will be used instead of the automatic URL format. You must select type &#39;other&#39; for the jdbc-driver-type.
   * @return jdbcDriverURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify the complete JDBC URL which will be used instead of the automatic URL format. You must select type 'other' for the jdbc-driver-type.")

  public String getJdbcDriverURL() {
    return jdbcDriverURL;
  }


  public void setJdbcDriverURL(String jdbcDriverURL) {
    
    
    
    this.jdbcDriverURL = jdbcDriverURL;
  }


  public AddJdbcExternalServerRequest databaseName(String databaseName) {
    
    
    
    
    this.databaseName = databaseName;
    return this;
  }

   /**
   * Specifies which database to connect to. This is ignored if jdbc-driver-url is specified.
   * @return databaseName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies which database to connect to. This is ignored if jdbc-driver-url is specified.")

  public String getDatabaseName() {
    return databaseName;
  }


  public void setDatabaseName(String databaseName) {
    
    
    
    this.databaseName = databaseName;
  }


  public AddJdbcExternalServerRequest serverHostName(String serverHostName) {
    
    
    
    
    this.serverHostName = serverHostName;
    return this;
  }

   /**
   * The host name of the database server. This is ignored if jdbc-driver-url is specified.
   * @return serverHostName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The host name of the database server. This is ignored if jdbc-driver-url is specified.")

  public String getServerHostName() {
    return serverHostName;
  }


  public void setServerHostName(String serverHostName) {
    
    
    
    this.serverHostName = serverHostName;
  }


  public AddJdbcExternalServerRequest serverPort(Integer serverPort) {
    
    
    
    
    this.serverPort = serverPort;
    return this;
  }

   /**
   * The port number where the database server listens for requests. This is ignored if jdbc-driver-url is specified
   * @return serverPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The port number where the database server listens for requests. This is ignored if jdbc-driver-url is specified")

  public Integer getServerPort() {
    return serverPort;
  }


  public void setServerPort(Integer serverPort) {
    
    
    
    this.serverPort = serverPort;
  }


  public AddJdbcExternalServerRequest userName(String userName) {
    
    
    
    
    this.userName = userName;
    return this;
  }

   /**
   * The name of the login account to use when connecting to the database server.
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the login account to use when connecting to the database server.")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    
    
    
    this.userName = userName;
  }


  public AddJdbcExternalServerRequest password(String password) {
    
    
    
    
    this.password = password;
    return this;
  }

   /**
   * The login password for the specified user name.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The login password for the specified user name.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    
    
    
    this.password = password;
  }


  public AddJdbcExternalServerRequest passphraseProvider(String passphraseProvider) {
    
    
    
    
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


  public AddJdbcExternalServerRequest validationQuery(String validationQuery) {
    
    
    
    
    this.validationQuery = validationQuery;
    return this;
  }

   /**
   * The SQL query that will be used to validate connections to the database before making them available to the Directory Server.
   * @return validationQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The SQL query that will be used to validate connections to the database before making them available to the Directory Server.")

  public String getValidationQuery() {
    return validationQuery;
  }


  public void setValidationQuery(String validationQuery) {
    
    
    
    this.validationQuery = validationQuery;
  }


  public AddJdbcExternalServerRequest validationQueryTimeout(String validationQueryTimeout) {
    
    
    
    
    this.validationQueryTimeout = validationQueryTimeout;
    return this;
  }

   /**
   * Specifies the amount of time to wait for a response from the database when executing the validation query, if one is set. If the timeout is exceeded, the Directory Server will drop the connection and obtain a new one. A value of zero indicates no timeout.
   * @return validationQueryTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the amount of time to wait for a response from the database when executing the validation query, if one is set. If the timeout is exceeded, the Directory Server will drop the connection and obtain a new one. A value of zero indicates no timeout.")

  public String getValidationQueryTimeout() {
    return validationQueryTimeout;
  }


  public void setValidationQueryTimeout(String validationQueryTimeout) {
    
    
    
    this.validationQueryTimeout = validationQueryTimeout;
  }


  public AddJdbcExternalServerRequest jdbcConnectionProperties(List<String> jdbcConnectionProperties) {
    
    
    
    
    this.jdbcConnectionProperties = jdbcConnectionProperties;
    return this;
  }

  public AddJdbcExternalServerRequest addJdbcConnectionPropertiesItem(String jdbcConnectionPropertiesItem) {
    if (this.jdbcConnectionProperties == null) {
      this.jdbcConnectionProperties = new ArrayList<>();
    }
    this.jdbcConnectionProperties.add(jdbcConnectionPropertiesItem);
    return this;
  }

   /**
   * Specifies the connection properties for the JDBC datasource.
   * @return jdbcConnectionProperties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the connection properties for the JDBC datasource.")

  public List<String> getJdbcConnectionProperties() {
    return jdbcConnectionProperties;
  }


  public void setJdbcConnectionProperties(List<String> jdbcConnectionProperties) {
    
    
    
    this.jdbcConnectionProperties = jdbcConnectionProperties;
  }


  public AddJdbcExternalServerRequest transactionIsolationLevel(EnumexternalServerTransactionIsolationLevelProp transactionIsolationLevel) {
    
    
    
    
    this.transactionIsolationLevel = transactionIsolationLevel;
    return this;
  }

   /**
   * Get transactionIsolationLevel
   * @return transactionIsolationLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumexternalServerTransactionIsolationLevelProp getTransactionIsolationLevel() {
    return transactionIsolationLevel;
  }


  public void setTransactionIsolationLevel(EnumexternalServerTransactionIsolationLevelProp transactionIsolationLevel) {
    
    
    
    this.transactionIsolationLevel = transactionIsolationLevel;
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
   * @return the AddJdbcExternalServerRequest instance itself
   */
  public AddJdbcExternalServerRequest putAdditionalProperty(String key, Object value) {
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
    AddJdbcExternalServerRequest addJdbcExternalServerRequest = (AddJdbcExternalServerRequest) o;
    return Objects.equals(this.serverName, addJdbcExternalServerRequest.serverName) &&
        Objects.equals(this.description, addJdbcExternalServerRequest.description) &&
        Objects.equals(this.schemas, addJdbcExternalServerRequest.schemas) &&
        Objects.equals(this.jdbcDriverType, addJdbcExternalServerRequest.jdbcDriverType) &&
        Objects.equals(this.jdbcDriverURL, addJdbcExternalServerRequest.jdbcDriverURL) &&
        Objects.equals(this.databaseName, addJdbcExternalServerRequest.databaseName) &&
        Objects.equals(this.serverHostName, addJdbcExternalServerRequest.serverHostName) &&
        Objects.equals(this.serverPort, addJdbcExternalServerRequest.serverPort) &&
        Objects.equals(this.userName, addJdbcExternalServerRequest.userName) &&
        Objects.equals(this.password, addJdbcExternalServerRequest.password) &&
        Objects.equals(this.passphraseProvider, addJdbcExternalServerRequest.passphraseProvider) &&
        Objects.equals(this.validationQuery, addJdbcExternalServerRequest.validationQuery) &&
        Objects.equals(this.validationQueryTimeout, addJdbcExternalServerRequest.validationQueryTimeout) &&
        Objects.equals(this.jdbcConnectionProperties, addJdbcExternalServerRequest.jdbcConnectionProperties) &&
        Objects.equals(this.transactionIsolationLevel, addJdbcExternalServerRequest.transactionIsolationLevel)&&
        Objects.equals(this.additionalProperties, addJdbcExternalServerRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverName, description, schemas, jdbcDriverType, jdbcDriverURL, databaseName, serverHostName, serverPort, userName, password, passphraseProvider, validationQuery, validationQueryTimeout, jdbcConnectionProperties, transactionIsolationLevel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddJdbcExternalServerRequest {\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    jdbcDriverType: ").append(toIndentedString(jdbcDriverType)).append("\n");
    sb.append("    jdbcDriverURL: ").append(toIndentedString(jdbcDriverURL)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    serverHostName: ").append(toIndentedString(serverHostName)).append("\n");
    sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passphraseProvider: ").append(toIndentedString(passphraseProvider)).append("\n");
    sb.append("    validationQuery: ").append(toIndentedString(validationQuery)).append("\n");
    sb.append("    validationQueryTimeout: ").append(toIndentedString(validationQueryTimeout)).append("\n");
    sb.append("    jdbcConnectionProperties: ").append(toIndentedString(jdbcConnectionProperties)).append("\n");
    sb.append("    transactionIsolationLevel: ").append(toIndentedString(transactionIsolationLevel)).append("\n");
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
    openapiFields.add("serverName");
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("jdbcDriverType");
    openapiFields.add("jdbcDriverURL");
    openapiFields.add("databaseName");
    openapiFields.add("serverHostName");
    openapiFields.add("serverPort");
    openapiFields.add("userName");
    openapiFields.add("password");
    openapiFields.add("passphraseProvider");
    openapiFields.add("validationQuery");
    openapiFields.add("validationQueryTimeout");
    openapiFields.add("jdbcConnectionProperties");
    openapiFields.add("transactionIsolationLevel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("serverName");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("jdbcDriverType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddJdbcExternalServerRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddJdbcExternalServerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddJdbcExternalServerRequest is not found in the empty JSON string", AddJdbcExternalServerRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddJdbcExternalServerRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("serverName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverName").toString()));
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
      if ((jsonObj.get("jdbcDriverURL") != null && !jsonObj.get("jdbcDriverURL").isJsonNull()) && !jsonObj.get("jdbcDriverURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jdbcDriverURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jdbcDriverURL").toString()));
      }
      if ((jsonObj.get("databaseName") != null && !jsonObj.get("databaseName").isJsonNull()) && !jsonObj.get("databaseName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `databaseName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("databaseName").toString()));
      }
      if ((jsonObj.get("serverHostName") != null && !jsonObj.get("serverHostName").isJsonNull()) && !jsonObj.get("serverHostName").isJsonPrimitive()) {
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
      if ((jsonObj.get("validationQuery") != null && !jsonObj.get("validationQuery").isJsonNull()) && !jsonObj.get("validationQuery").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validationQuery` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validationQuery").toString()));
      }
      if ((jsonObj.get("validationQueryTimeout") != null && !jsonObj.get("validationQueryTimeout").isJsonNull()) && !jsonObj.get("validationQueryTimeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validationQueryTimeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validationQueryTimeout").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("jdbcConnectionProperties") != null && !jsonObj.get("jdbcConnectionProperties").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `jdbcConnectionProperties` to be an array in the JSON string but got `%s`", jsonObj.get("jdbcConnectionProperties").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddJdbcExternalServerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddJdbcExternalServerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddJdbcExternalServerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddJdbcExternalServerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddJdbcExternalServerRequest>() {
           @Override
           public void write(JsonWriter out, AddJdbcExternalServerRequest value) throws IOException {
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
           public AddJdbcExternalServerRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddJdbcExternalServerRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddJdbcExternalServerRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddJdbcExternalServerRequest
  * @throws IOException if the JSON string is invalid with respect to AddJdbcExternalServerRequest
  */
  public static AddJdbcExternalServerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddJdbcExternalServerRequest.class);
  }

 /**
  * Convert an instance of AddJdbcExternalServerRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

