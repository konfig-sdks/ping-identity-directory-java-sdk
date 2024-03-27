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
import com.konfigthis.client.model.EnumtwilioOtpDeliveryMechanismSchemaUrn;
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
 * AddTwilioOtpDeliveryMechanismRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddTwilioOtpDeliveryMechanismRequest {
  public static final String SERIALIZED_NAME_MECHANISM_NAME = "mechanismName";
  @SerializedName(SERIALIZED_NAME_MECHANISM_NAME)
  private String mechanismName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumtwilioOtpDeliveryMechanismSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_HTTP_PROXY_EXTERNAL_SERVER = "httpProxyExternalServer";
  @SerializedName(SERIALIZED_NAME_HTTP_PROXY_EXTERNAL_SERVER)
  private String httpProxyExternalServer;

  public static final String SERIALIZED_NAME_TWILIO_ACCOUNT_S_I_D = "twilioAccountSID";
  @SerializedName(SERIALIZED_NAME_TWILIO_ACCOUNT_S_I_D)
  private String twilioAccountSID;

  public static final String SERIALIZED_NAME_TWILIO_AUTH_TOKEN = "twilioAuthToken";
  @SerializedName(SERIALIZED_NAME_TWILIO_AUTH_TOKEN)
  private String twilioAuthToken;

  public static final String SERIALIZED_NAME_TWILIO_AUTH_TOKEN_PASSPHRASE_PROVIDER = "twilioAuthTokenPassphraseProvider";
  @SerializedName(SERIALIZED_NAME_TWILIO_AUTH_TOKEN_PASSPHRASE_PROVIDER)
  private String twilioAuthTokenPassphraseProvider;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_ATTRIBUTE_TYPE = "phoneNumberAttributeType";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_ATTRIBUTE_TYPE)
  private String phoneNumberAttributeType;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_J_S_O_N_FIELD = "phoneNumberJSONField";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_J_S_O_N_FIELD)
  private String phoneNumberJSONField;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_J_S_O_N_OBJECT_FILTER = "phoneNumberJSONObjectFilter";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_J_S_O_N_OBJECT_FILTER)
  private String phoneNumberJSONObjectFilter;

  public static final String SERIALIZED_NAME_SENDER_PHONE_NUMBER = "senderPhoneNumber";
  @SerializedName(SERIALIZED_NAME_SENDER_PHONE_NUMBER)
  private List<String> senderPhoneNumber = new ArrayList<>();

  public static final String SERIALIZED_NAME_MESSAGE_TEXT_BEFORE_O_T_P = "messageTextBeforeOTP";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TEXT_BEFORE_O_T_P)
  private String messageTextBeforeOTP;

  public static final String SERIALIZED_NAME_MESSAGE_TEXT_AFTER_O_T_P = "messageTextAfterOTP";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TEXT_AFTER_O_T_P)
  private String messageTextAfterOTP;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public AddTwilioOtpDeliveryMechanismRequest() {
  }

  public AddTwilioOtpDeliveryMechanismRequest mechanismName(String mechanismName) {
    
    
    
    
    this.mechanismName = mechanismName;
    return this;
  }

   /**
   * Name of the new OTP Delivery Mechanism
   * @return mechanismName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the new OTP Delivery Mechanism")

  public String getMechanismName() {
    return mechanismName;
  }


  public void setMechanismName(String mechanismName) {
    
    
    
    this.mechanismName = mechanismName;
  }


  public AddTwilioOtpDeliveryMechanismRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this OTP Delivery Mechanism
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this OTP Delivery Mechanism")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AddTwilioOtpDeliveryMechanismRequest schemas(List<EnumtwilioOtpDeliveryMechanismSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddTwilioOtpDeliveryMechanismRequest addSchemasItem(EnumtwilioOtpDeliveryMechanismSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumtwilioOtpDeliveryMechanismSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumtwilioOtpDeliveryMechanismSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddTwilioOtpDeliveryMechanismRequest httpProxyExternalServer(String httpProxyExternalServer) {
    
    
    
    
    this.httpProxyExternalServer = httpProxyExternalServer;
    return this;
  }

   /**
   * A reference to an HTTP proxy server that should be used for requests sent to the Twilio service.
   * @return httpProxyExternalServer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to an HTTP proxy server that should be used for requests sent to the Twilio service.")

  public String getHttpProxyExternalServer() {
    return httpProxyExternalServer;
  }


  public void setHttpProxyExternalServer(String httpProxyExternalServer) {
    
    
    
    this.httpProxyExternalServer = httpProxyExternalServer;
  }


  public AddTwilioOtpDeliveryMechanismRequest twilioAccountSID(String twilioAccountSID) {
    
    
    
    
    this.twilioAccountSID = twilioAccountSID;
    return this;
  }

   /**
   * The unique identifier assigned to the Twilio account that will be used.
   * @return twilioAccountSID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique identifier assigned to the Twilio account that will be used.")

  public String getTwilioAccountSID() {
    return twilioAccountSID;
  }


  public void setTwilioAccountSID(String twilioAccountSID) {
    
    
    
    this.twilioAccountSID = twilioAccountSID;
  }


  public AddTwilioOtpDeliveryMechanismRequest twilioAuthToken(String twilioAuthToken) {
    
    
    
    
    this.twilioAuthToken = twilioAuthToken;
    return this;
  }

   /**
   * The auth token for the Twilio account that will be used.
   * @return twilioAuthToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The auth token for the Twilio account that will be used.")

  public String getTwilioAuthToken() {
    return twilioAuthToken;
  }


  public void setTwilioAuthToken(String twilioAuthToken) {
    
    
    
    this.twilioAuthToken = twilioAuthToken;
  }


  public AddTwilioOtpDeliveryMechanismRequest twilioAuthTokenPassphraseProvider(String twilioAuthTokenPassphraseProvider) {
    
    
    
    
    this.twilioAuthTokenPassphraseProvider = twilioAuthTokenPassphraseProvider;
    return this;
  }

   /**
   * The passphrase provider that may be used to obtain the auth token for the Twilio account that will be used.
   * @return twilioAuthTokenPassphraseProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The passphrase provider that may be used to obtain the auth token for the Twilio account that will be used.")

  public String getTwilioAuthTokenPassphraseProvider() {
    return twilioAuthTokenPassphraseProvider;
  }


  public void setTwilioAuthTokenPassphraseProvider(String twilioAuthTokenPassphraseProvider) {
    
    
    
    this.twilioAuthTokenPassphraseProvider = twilioAuthTokenPassphraseProvider;
  }


  public AddTwilioOtpDeliveryMechanismRequest phoneNumberAttributeType(String phoneNumberAttributeType) {
    
    
    
    
    this.phoneNumberAttributeType = phoneNumberAttributeType;
    return this;
  }

   /**
   * The name or OID of the attribute in the user&#39;s entry that holds the phone number to which the message should be sent.
   * @return phoneNumberAttributeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name or OID of the attribute in the user's entry that holds the phone number to which the message should be sent.")

  public String getPhoneNumberAttributeType() {
    return phoneNumberAttributeType;
  }


  public void setPhoneNumberAttributeType(String phoneNumberAttributeType) {
    
    
    
    this.phoneNumberAttributeType = phoneNumberAttributeType;
  }


  public AddTwilioOtpDeliveryMechanismRequest phoneNumberJSONField(String phoneNumberJSONField) {
    
    
    
    
    this.phoneNumberJSONField = phoneNumberJSONField;
    return this;
  }

   /**
   * The name of the JSON field whose value is the phone number to which the message should be sent. The phone number must be contained in a top-level field whose value is a single string.
   * @return phoneNumberJSONField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the JSON field whose value is the phone number to which the message should be sent. The phone number must be contained in a top-level field whose value is a single string.")

  public String getPhoneNumberJSONField() {
    return phoneNumberJSONField;
  }


  public void setPhoneNumberJSONField(String phoneNumberJSONField) {
    
    
    
    this.phoneNumberJSONField = phoneNumberJSONField;
  }


  public AddTwilioOtpDeliveryMechanismRequest phoneNumberJSONObjectFilter(String phoneNumberJSONObjectFilter) {
    
    
    
    
    this.phoneNumberJSONObjectFilter = phoneNumberJSONObjectFilter;
    return this;
  }

   /**
   * A JSON object filter that may be used to identify which phone number value to use when sending the message.
   * @return phoneNumberJSONObjectFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON object filter that may be used to identify which phone number value to use when sending the message.")

  public String getPhoneNumberJSONObjectFilter() {
    return phoneNumberJSONObjectFilter;
  }


  public void setPhoneNumberJSONObjectFilter(String phoneNumberJSONObjectFilter) {
    
    
    
    this.phoneNumberJSONObjectFilter = phoneNumberJSONObjectFilter;
  }


  public AddTwilioOtpDeliveryMechanismRequest senderPhoneNumber(List<String> senderPhoneNumber) {
    
    
    
    
    this.senderPhoneNumber = senderPhoneNumber;
    return this;
  }

  public AddTwilioOtpDeliveryMechanismRequest addSenderPhoneNumberItem(String senderPhoneNumberItem) {
    this.senderPhoneNumber.add(senderPhoneNumberItem);
    return this;
  }

   /**
   * The outgoing phone number to use for the messages. Values must be phone numbers you have obtained for use with your Twilio account.
   * @return senderPhoneNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The outgoing phone number to use for the messages. Values must be phone numbers you have obtained for use with your Twilio account.")

  public List<String> getSenderPhoneNumber() {
    return senderPhoneNumber;
  }


  public void setSenderPhoneNumber(List<String> senderPhoneNumber) {
    
    
    
    this.senderPhoneNumber = senderPhoneNumber;
  }


  public AddTwilioOtpDeliveryMechanismRequest messageTextBeforeOTP(String messageTextBeforeOTP) {
    
    
    
    
    this.messageTextBeforeOTP = messageTextBeforeOTP;
    return this;
  }

   /**
   * Any text that should appear in the message before the one-time password value.
   * @return messageTextBeforeOTP
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Any text that should appear in the message before the one-time password value.")

  public String getMessageTextBeforeOTP() {
    return messageTextBeforeOTP;
  }


  public void setMessageTextBeforeOTP(String messageTextBeforeOTP) {
    
    
    
    this.messageTextBeforeOTP = messageTextBeforeOTP;
  }


  public AddTwilioOtpDeliveryMechanismRequest messageTextAfterOTP(String messageTextAfterOTP) {
    
    
    
    
    this.messageTextAfterOTP = messageTextAfterOTP;
    return this;
  }

   /**
   * Any text that should appear in the message after the one-time password value.
   * @return messageTextAfterOTP
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Any text that should appear in the message after the one-time password value.")

  public String getMessageTextAfterOTP() {
    return messageTextAfterOTP;
  }


  public void setMessageTextAfterOTP(String messageTextAfterOTP) {
    
    
    
    this.messageTextAfterOTP = messageTextAfterOTP;
  }


  public AddTwilioOtpDeliveryMechanismRequest enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether this OTP Delivery Mechanism is enabled for use in the server.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether this OTP Delivery Mechanism is enabled for use in the server.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
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
   * @return the AddTwilioOtpDeliveryMechanismRequest instance itself
   */
  public AddTwilioOtpDeliveryMechanismRequest putAdditionalProperty(String key, Object value) {
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
    AddTwilioOtpDeliveryMechanismRequest addTwilioOtpDeliveryMechanismRequest = (AddTwilioOtpDeliveryMechanismRequest) o;
    return Objects.equals(this.mechanismName, addTwilioOtpDeliveryMechanismRequest.mechanismName) &&
        Objects.equals(this.description, addTwilioOtpDeliveryMechanismRequest.description) &&
        Objects.equals(this.schemas, addTwilioOtpDeliveryMechanismRequest.schemas) &&
        Objects.equals(this.httpProxyExternalServer, addTwilioOtpDeliveryMechanismRequest.httpProxyExternalServer) &&
        Objects.equals(this.twilioAccountSID, addTwilioOtpDeliveryMechanismRequest.twilioAccountSID) &&
        Objects.equals(this.twilioAuthToken, addTwilioOtpDeliveryMechanismRequest.twilioAuthToken) &&
        Objects.equals(this.twilioAuthTokenPassphraseProvider, addTwilioOtpDeliveryMechanismRequest.twilioAuthTokenPassphraseProvider) &&
        Objects.equals(this.phoneNumberAttributeType, addTwilioOtpDeliveryMechanismRequest.phoneNumberAttributeType) &&
        Objects.equals(this.phoneNumberJSONField, addTwilioOtpDeliveryMechanismRequest.phoneNumberJSONField) &&
        Objects.equals(this.phoneNumberJSONObjectFilter, addTwilioOtpDeliveryMechanismRequest.phoneNumberJSONObjectFilter) &&
        Objects.equals(this.senderPhoneNumber, addTwilioOtpDeliveryMechanismRequest.senderPhoneNumber) &&
        Objects.equals(this.messageTextBeforeOTP, addTwilioOtpDeliveryMechanismRequest.messageTextBeforeOTP) &&
        Objects.equals(this.messageTextAfterOTP, addTwilioOtpDeliveryMechanismRequest.messageTextAfterOTP) &&
        Objects.equals(this.enabled, addTwilioOtpDeliveryMechanismRequest.enabled)&&
        Objects.equals(this.additionalProperties, addTwilioOtpDeliveryMechanismRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mechanismName, description, schemas, httpProxyExternalServer, twilioAccountSID, twilioAuthToken, twilioAuthTokenPassphraseProvider, phoneNumberAttributeType, phoneNumberJSONField, phoneNumberJSONObjectFilter, senderPhoneNumber, messageTextBeforeOTP, messageTextAfterOTP, enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddTwilioOtpDeliveryMechanismRequest {\n");
    sb.append("    mechanismName: ").append(toIndentedString(mechanismName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    httpProxyExternalServer: ").append(toIndentedString(httpProxyExternalServer)).append("\n");
    sb.append("    twilioAccountSID: ").append(toIndentedString(twilioAccountSID)).append("\n");
    sb.append("    twilioAuthToken: ").append(toIndentedString(twilioAuthToken)).append("\n");
    sb.append("    twilioAuthTokenPassphraseProvider: ").append(toIndentedString(twilioAuthTokenPassphraseProvider)).append("\n");
    sb.append("    phoneNumberAttributeType: ").append(toIndentedString(phoneNumberAttributeType)).append("\n");
    sb.append("    phoneNumberJSONField: ").append(toIndentedString(phoneNumberJSONField)).append("\n");
    sb.append("    phoneNumberJSONObjectFilter: ").append(toIndentedString(phoneNumberJSONObjectFilter)).append("\n");
    sb.append("    senderPhoneNumber: ").append(toIndentedString(senderPhoneNumber)).append("\n");
    sb.append("    messageTextBeforeOTP: ").append(toIndentedString(messageTextBeforeOTP)).append("\n");
    sb.append("    messageTextAfterOTP: ").append(toIndentedString(messageTextAfterOTP)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
    openapiFields.add("mechanismName");
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("httpProxyExternalServer");
    openapiFields.add("twilioAccountSID");
    openapiFields.add("twilioAuthToken");
    openapiFields.add("twilioAuthTokenPassphraseProvider");
    openapiFields.add("phoneNumberAttributeType");
    openapiFields.add("phoneNumberJSONField");
    openapiFields.add("phoneNumberJSONObjectFilter");
    openapiFields.add("senderPhoneNumber");
    openapiFields.add("messageTextBeforeOTP");
    openapiFields.add("messageTextAfterOTP");
    openapiFields.add("enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("mechanismName");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("twilioAccountSID");
    openapiRequiredFields.add("senderPhoneNumber");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddTwilioOtpDeliveryMechanismRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddTwilioOtpDeliveryMechanismRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddTwilioOtpDeliveryMechanismRequest is not found in the empty JSON string", AddTwilioOtpDeliveryMechanismRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddTwilioOtpDeliveryMechanismRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("mechanismName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mechanismName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mechanismName").toString()));
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
      if ((jsonObj.get("httpProxyExternalServer") != null && !jsonObj.get("httpProxyExternalServer").isJsonNull()) && !jsonObj.get("httpProxyExternalServer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `httpProxyExternalServer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("httpProxyExternalServer").toString()));
      }
      if (!jsonObj.get("twilioAccountSID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twilioAccountSID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twilioAccountSID").toString()));
      }
      if ((jsonObj.get("twilioAuthToken") != null && !jsonObj.get("twilioAuthToken").isJsonNull()) && !jsonObj.get("twilioAuthToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twilioAuthToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twilioAuthToken").toString()));
      }
      if ((jsonObj.get("twilioAuthTokenPassphraseProvider") != null && !jsonObj.get("twilioAuthTokenPassphraseProvider").isJsonNull()) && !jsonObj.get("twilioAuthTokenPassphraseProvider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twilioAuthTokenPassphraseProvider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twilioAuthTokenPassphraseProvider").toString()));
      }
      if ((jsonObj.get("phoneNumberAttributeType") != null && !jsonObj.get("phoneNumberAttributeType").isJsonNull()) && !jsonObj.get("phoneNumberAttributeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumberAttributeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumberAttributeType").toString()));
      }
      if ((jsonObj.get("phoneNumberJSONField") != null && !jsonObj.get("phoneNumberJSONField").isJsonNull()) && !jsonObj.get("phoneNumberJSONField").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumberJSONField` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumberJSONField").toString()));
      }
      if ((jsonObj.get("phoneNumberJSONObjectFilter") != null && !jsonObj.get("phoneNumberJSONObjectFilter").isJsonNull()) && !jsonObj.get("phoneNumberJSONObjectFilter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumberJSONObjectFilter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumberJSONObjectFilter").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("senderPhoneNumber") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("senderPhoneNumber").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `senderPhoneNumber` to be an array in the JSON string but got `%s`", jsonObj.get("senderPhoneNumber").toString()));
      }
      if ((jsonObj.get("messageTextBeforeOTP") != null && !jsonObj.get("messageTextBeforeOTP").isJsonNull()) && !jsonObj.get("messageTextBeforeOTP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageTextBeforeOTP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageTextBeforeOTP").toString()));
      }
      if ((jsonObj.get("messageTextAfterOTP") != null && !jsonObj.get("messageTextAfterOTP").isJsonNull()) && !jsonObj.get("messageTextAfterOTP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageTextAfterOTP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageTextAfterOTP").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddTwilioOtpDeliveryMechanismRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddTwilioOtpDeliveryMechanismRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddTwilioOtpDeliveryMechanismRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddTwilioOtpDeliveryMechanismRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddTwilioOtpDeliveryMechanismRequest>() {
           @Override
           public void write(JsonWriter out, AddTwilioOtpDeliveryMechanismRequest value) throws IOException {
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
           public AddTwilioOtpDeliveryMechanismRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddTwilioOtpDeliveryMechanismRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddTwilioOtpDeliveryMechanismRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddTwilioOtpDeliveryMechanismRequest
  * @throws IOException if the JSON string is invalid with respect to AddTwilioOtpDeliveryMechanismRequest
  */
  public static AddTwilioOtpDeliveryMechanismRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddTwilioOtpDeliveryMechanismRequest.class);
  }

 /**
  * Convert an instance of AddTwilioOtpDeliveryMechanismRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

