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
import com.konfigthis.client.model.EnumldapServerInstanceListenerSchemaUrn;
import com.konfigthis.client.model.EnumserverInstanceListenerLdapConnectionSecurityProp;
import com.konfigthis.client.model.EnumserverInstanceListenerPurposeProp;
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
 * LdapServerInstanceListenerResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LdapServerInstanceListenerResponse {
  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumldapServerInstanceListenerSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SERVER_L_D_A_P_PORT = "serverLDAPPort";
  @SerializedName(SERIALIZED_NAME_SERVER_L_D_A_P_PORT)
  private Integer serverLDAPPort;

  public static final String SERIALIZED_NAME_CONNECTION_SECURITY = "connectionSecurity";
  @SerializedName(SERIALIZED_NAME_CONNECTION_SECURITY)
  private EnumserverInstanceListenerLdapConnectionSecurityProp connectionSecurity;

  public static final String SERIALIZED_NAME_LISTENER_CERTIFICATE = "listenerCertificate";
  @SerializedName(SERIALIZED_NAME_LISTENER_CERTIFICATE)
  private String listenerCertificate;

  public static final String SERIALIZED_NAME_PURPOSE = "purpose";
  @SerializedName(SERIALIZED_NAME_PURPOSE)
  private List<EnumserverInstanceListenerPurposeProp> purpose = null;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public LdapServerInstanceListenerResponse() {
  }

  public LdapServerInstanceListenerResponse schemas(List<EnumldapServerInstanceListenerSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public LdapServerInstanceListenerResponse addSchemasItem(EnumldapServerInstanceListenerSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumldapServerInstanceListenerSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumldapServerInstanceListenerSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public LdapServerInstanceListenerResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Server Instance Listener
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the Server Instance Listener")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public LdapServerInstanceListenerResponse serverLDAPPort(Integer serverLDAPPort) {
    
    
    
    
    this.serverLDAPPort = serverLDAPPort;
    return this;
  }

   /**
   * The TCP port number on which the LDAP server is listening.
   * @return serverLDAPPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The TCP port number on which the LDAP server is listening.")

  public Integer getServerLDAPPort() {
    return serverLDAPPort;
  }


  public void setServerLDAPPort(Integer serverLDAPPort) {
    
    
    
    this.serverLDAPPort = serverLDAPPort;
  }


  public LdapServerInstanceListenerResponse connectionSecurity(EnumserverInstanceListenerLdapConnectionSecurityProp connectionSecurity) {
    
    
    
    
    this.connectionSecurity = connectionSecurity;
    return this;
  }

   /**
   * Get connectionSecurity
   * @return connectionSecurity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumserverInstanceListenerLdapConnectionSecurityProp getConnectionSecurity() {
    return connectionSecurity;
  }


  public void setConnectionSecurity(EnumserverInstanceListenerLdapConnectionSecurityProp connectionSecurity) {
    
    
    
    this.connectionSecurity = connectionSecurity;
  }


  public LdapServerInstanceListenerResponse listenerCertificate(String listenerCertificate) {
    
    
    
    
    this.listenerCertificate = listenerCertificate;
    return this;
  }

   /**
   * The public component of the certificate that the listener is expected to present to clients. When establishing a connection to this server, only the certificate(s) listed here will be trusted.
   * @return listenerCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The public component of the certificate that the listener is expected to present to clients. When establishing a connection to this server, only the certificate(s) listed here will be trusted.")

  public String getListenerCertificate() {
    return listenerCertificate;
  }


  public void setListenerCertificate(String listenerCertificate) {
    
    
    
    this.listenerCertificate = listenerCertificate;
  }


  public LdapServerInstanceListenerResponse purpose(List<EnumserverInstanceListenerPurposeProp> purpose) {
    
    
    
    
    this.purpose = purpose;
    return this;
  }

  public LdapServerInstanceListenerResponse addPurposeItem(EnumserverInstanceListenerPurposeProp purposeItem) {
    if (this.purpose == null) {
      this.purpose = new ArrayList<>();
    }
    this.purpose.add(purposeItem);
    return this;
  }

   /**
   * Get purpose
   * @return purpose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumserverInstanceListenerPurposeProp> getPurpose() {
    return purpose;
  }


  public void setPurpose(List<EnumserverInstanceListenerPurposeProp> purpose) {
    
    
    
    this.purpose = purpose;
  }


  public LdapServerInstanceListenerResponse meta(MetaMeta meta) {
    
    
    
    
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


  public LdapServerInstanceListenerResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the LdapServerInstanceListenerResponse instance itself
   */
  public LdapServerInstanceListenerResponse putAdditionalProperty(String key, Object value) {
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
    LdapServerInstanceListenerResponse ldapServerInstanceListenerResponse = (LdapServerInstanceListenerResponse) o;
    return Objects.equals(this.schemas, ldapServerInstanceListenerResponse.schemas) &&
        Objects.equals(this.id, ldapServerInstanceListenerResponse.id) &&
        Objects.equals(this.serverLDAPPort, ldapServerInstanceListenerResponse.serverLDAPPort) &&
        Objects.equals(this.connectionSecurity, ldapServerInstanceListenerResponse.connectionSecurity) &&
        Objects.equals(this.listenerCertificate, ldapServerInstanceListenerResponse.listenerCertificate) &&
        Objects.equals(this.purpose, ldapServerInstanceListenerResponse.purpose) &&
        Objects.equals(this.meta, ldapServerInstanceListenerResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, ldapServerInstanceListenerResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, ldapServerInstanceListenerResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, id, serverLDAPPort, connectionSecurity, listenerCertificate, purpose, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LdapServerInstanceListenerResponse {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serverLDAPPort: ").append(toIndentedString(serverLDAPPort)).append("\n");
    sb.append("    connectionSecurity: ").append(toIndentedString(connectionSecurity)).append("\n");
    sb.append("    listenerCertificate: ").append(toIndentedString(listenerCertificate)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
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
    openapiFields.add("schemas");
    openapiFields.add("id");
    openapiFields.add("serverLDAPPort");
    openapiFields.add("connectionSecurity");
    openapiFields.add("listenerCertificate");
    openapiFields.add("purpose");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LdapServerInstanceListenerResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LdapServerInstanceListenerResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LdapServerInstanceListenerResponse is not found in the empty JSON string", LdapServerInstanceListenerResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LdapServerInstanceListenerResponse.openapiRequiredFields) {
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
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("listenerCertificate") != null && !jsonObj.get("listenerCertificate").isJsonNull()) && !jsonObj.get("listenerCertificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `listenerCertificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("listenerCertificate").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("purpose") != null && !jsonObj.get("purpose").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `purpose` to be an array in the JSON string but got `%s`", jsonObj.get("purpose").toString()));
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
       if (!LdapServerInstanceListenerResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LdapServerInstanceListenerResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LdapServerInstanceListenerResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LdapServerInstanceListenerResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<LdapServerInstanceListenerResponse>() {
           @Override
           public void write(JsonWriter out, LdapServerInstanceListenerResponse value) throws IOException {
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
           public LdapServerInstanceListenerResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LdapServerInstanceListenerResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LdapServerInstanceListenerResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LdapServerInstanceListenerResponse
  * @throws IOException if the JSON string is invalid with respect to LdapServerInstanceListenerResponse
  */
  public static LdapServerInstanceListenerResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LdapServerInstanceListenerResponse.class);
  }

 /**
  * Convert an instance of LdapServerInstanceListenerResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

