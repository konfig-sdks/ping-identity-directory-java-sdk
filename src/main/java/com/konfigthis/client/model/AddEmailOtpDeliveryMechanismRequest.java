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
import com.konfigthis.client.model.EnumemailOtpDeliveryMechanismSchemaUrn;
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
 * AddEmailOtpDeliveryMechanismRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddEmailOtpDeliveryMechanismRequest {
  public static final String SERIALIZED_NAME_MECHANISM_NAME = "mechanismName";
  @SerializedName(SERIALIZED_NAME_MECHANISM_NAME)
  private String mechanismName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumemailOtpDeliveryMechanismSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_ATTRIBUTE_TYPE = "emailAddressAttributeType";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_ATTRIBUTE_TYPE)
  private String emailAddressAttributeType;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_J_S_O_N_FIELD = "emailAddressJSONField";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_J_S_O_N_FIELD)
  private String emailAddressJSONField;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_J_S_O_N_OBJECT_FILTER = "emailAddressJSONObjectFilter";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_J_S_O_N_OBJECT_FILTER)
  private String emailAddressJSONObjectFilter;

  public static final String SERIALIZED_NAME_SENDER_ADDRESS = "senderAddress";
  @SerializedName(SERIALIZED_NAME_SENDER_ADDRESS)
  private String senderAddress;

  public static final String SERIALIZED_NAME_MESSAGE_SUBJECT = "messageSubject";
  @SerializedName(SERIALIZED_NAME_MESSAGE_SUBJECT)
  private String messageSubject;

  public static final String SERIALIZED_NAME_MESSAGE_TEXT_BEFORE_O_T_P = "messageTextBeforeOTP";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TEXT_BEFORE_O_T_P)
  private String messageTextBeforeOTP;

  public static final String SERIALIZED_NAME_MESSAGE_TEXT_AFTER_O_T_P = "messageTextAfterOTP";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TEXT_AFTER_O_T_P)
  private String messageTextAfterOTP;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public AddEmailOtpDeliveryMechanismRequest() {
  }

  public AddEmailOtpDeliveryMechanismRequest mechanismName(String mechanismName) {
    
    
    
    
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


  public AddEmailOtpDeliveryMechanismRequest description(String description) {
    
    
    
    
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


  public AddEmailOtpDeliveryMechanismRequest schemas(List<EnumemailOtpDeliveryMechanismSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddEmailOtpDeliveryMechanismRequest addSchemasItem(EnumemailOtpDeliveryMechanismSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumemailOtpDeliveryMechanismSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumemailOtpDeliveryMechanismSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddEmailOtpDeliveryMechanismRequest emailAddressAttributeType(String emailAddressAttributeType) {
    
    
    
    
    this.emailAddressAttributeType = emailAddressAttributeType;
    return this;
  }

   /**
   * The name or OID of the attribute that holds the email address to which the message should be sent.
   * @return emailAddressAttributeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name or OID of the attribute that holds the email address to which the message should be sent.")

  public String getEmailAddressAttributeType() {
    return emailAddressAttributeType;
  }


  public void setEmailAddressAttributeType(String emailAddressAttributeType) {
    
    
    
    this.emailAddressAttributeType = emailAddressAttributeType;
  }


  public AddEmailOtpDeliveryMechanismRequest emailAddressJSONField(String emailAddressJSONField) {
    
    
    
    
    this.emailAddressJSONField = emailAddressJSONField;
    return this;
  }

   /**
   * The name of the JSON field whose value is the email address to which the message should be sent. The email address must be contained in a top-level field whose value is a single string.
   * @return emailAddressJSONField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the JSON field whose value is the email address to which the message should be sent. The email address must be contained in a top-level field whose value is a single string.")

  public String getEmailAddressJSONField() {
    return emailAddressJSONField;
  }


  public void setEmailAddressJSONField(String emailAddressJSONField) {
    
    
    
    this.emailAddressJSONField = emailAddressJSONField;
  }


  public AddEmailOtpDeliveryMechanismRequest emailAddressJSONObjectFilter(String emailAddressJSONObjectFilter) {
    
    
    
    
    this.emailAddressJSONObjectFilter = emailAddressJSONObjectFilter;
    return this;
  }

   /**
   * A JSON object filter that may be used to identify which email address value to use when sending the message.
   * @return emailAddressJSONObjectFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON object filter that may be used to identify which email address value to use when sending the message.")

  public String getEmailAddressJSONObjectFilter() {
    return emailAddressJSONObjectFilter;
  }


  public void setEmailAddressJSONObjectFilter(String emailAddressJSONObjectFilter) {
    
    
    
    this.emailAddressJSONObjectFilter = emailAddressJSONObjectFilter;
  }


  public AddEmailOtpDeliveryMechanismRequest senderAddress(String senderAddress) {
    
    
    
    
    this.senderAddress = senderAddress;
    return this;
  }

   /**
   * The e-mail address to use as the sender for the one-time password.
   * @return senderAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The e-mail address to use as the sender for the one-time password.")

  public String getSenderAddress() {
    return senderAddress;
  }


  public void setSenderAddress(String senderAddress) {
    
    
    
    this.senderAddress = senderAddress;
  }


  public AddEmailOtpDeliveryMechanismRequest messageSubject(String messageSubject) {
    
    
    
    
    this.messageSubject = messageSubject;
    return this;
  }

   /**
   * The subject to use for the e-mail message.
   * @return messageSubject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subject to use for the e-mail message.")

  public String getMessageSubject() {
    return messageSubject;
  }


  public void setMessageSubject(String messageSubject) {
    
    
    
    this.messageSubject = messageSubject;
  }


  public AddEmailOtpDeliveryMechanismRequest messageTextBeforeOTP(String messageTextBeforeOTP) {
    
    
    
    
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


  public AddEmailOtpDeliveryMechanismRequest messageTextAfterOTP(String messageTextAfterOTP) {
    
    
    
    
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


  public AddEmailOtpDeliveryMechanismRequest enabled(Boolean enabled) {
    
    
    
    
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
   * @return the AddEmailOtpDeliveryMechanismRequest instance itself
   */
  public AddEmailOtpDeliveryMechanismRequest putAdditionalProperty(String key, Object value) {
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
    AddEmailOtpDeliveryMechanismRequest addEmailOtpDeliveryMechanismRequest = (AddEmailOtpDeliveryMechanismRequest) o;
    return Objects.equals(this.mechanismName, addEmailOtpDeliveryMechanismRequest.mechanismName) &&
        Objects.equals(this.description, addEmailOtpDeliveryMechanismRequest.description) &&
        Objects.equals(this.schemas, addEmailOtpDeliveryMechanismRequest.schemas) &&
        Objects.equals(this.emailAddressAttributeType, addEmailOtpDeliveryMechanismRequest.emailAddressAttributeType) &&
        Objects.equals(this.emailAddressJSONField, addEmailOtpDeliveryMechanismRequest.emailAddressJSONField) &&
        Objects.equals(this.emailAddressJSONObjectFilter, addEmailOtpDeliveryMechanismRequest.emailAddressJSONObjectFilter) &&
        Objects.equals(this.senderAddress, addEmailOtpDeliveryMechanismRequest.senderAddress) &&
        Objects.equals(this.messageSubject, addEmailOtpDeliveryMechanismRequest.messageSubject) &&
        Objects.equals(this.messageTextBeforeOTP, addEmailOtpDeliveryMechanismRequest.messageTextBeforeOTP) &&
        Objects.equals(this.messageTextAfterOTP, addEmailOtpDeliveryMechanismRequest.messageTextAfterOTP) &&
        Objects.equals(this.enabled, addEmailOtpDeliveryMechanismRequest.enabled)&&
        Objects.equals(this.additionalProperties, addEmailOtpDeliveryMechanismRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mechanismName, description, schemas, emailAddressAttributeType, emailAddressJSONField, emailAddressJSONObjectFilter, senderAddress, messageSubject, messageTextBeforeOTP, messageTextAfterOTP, enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddEmailOtpDeliveryMechanismRequest {\n");
    sb.append("    mechanismName: ").append(toIndentedString(mechanismName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    emailAddressAttributeType: ").append(toIndentedString(emailAddressAttributeType)).append("\n");
    sb.append("    emailAddressJSONField: ").append(toIndentedString(emailAddressJSONField)).append("\n");
    sb.append("    emailAddressJSONObjectFilter: ").append(toIndentedString(emailAddressJSONObjectFilter)).append("\n");
    sb.append("    senderAddress: ").append(toIndentedString(senderAddress)).append("\n");
    sb.append("    messageSubject: ").append(toIndentedString(messageSubject)).append("\n");
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
    openapiFields.add("emailAddressAttributeType");
    openapiFields.add("emailAddressJSONField");
    openapiFields.add("emailAddressJSONObjectFilter");
    openapiFields.add("senderAddress");
    openapiFields.add("messageSubject");
    openapiFields.add("messageTextBeforeOTP");
    openapiFields.add("messageTextAfterOTP");
    openapiFields.add("enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("mechanismName");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("senderAddress");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddEmailOtpDeliveryMechanismRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddEmailOtpDeliveryMechanismRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddEmailOtpDeliveryMechanismRequest is not found in the empty JSON string", AddEmailOtpDeliveryMechanismRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddEmailOtpDeliveryMechanismRequest.openapiRequiredFields) {
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
      if ((jsonObj.get("emailAddressAttributeType") != null && !jsonObj.get("emailAddressAttributeType").isJsonNull()) && !jsonObj.get("emailAddressAttributeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailAddressAttributeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailAddressAttributeType").toString()));
      }
      if ((jsonObj.get("emailAddressJSONField") != null && !jsonObj.get("emailAddressJSONField").isJsonNull()) && !jsonObj.get("emailAddressJSONField").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailAddressJSONField` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailAddressJSONField").toString()));
      }
      if ((jsonObj.get("emailAddressJSONObjectFilter") != null && !jsonObj.get("emailAddressJSONObjectFilter").isJsonNull()) && !jsonObj.get("emailAddressJSONObjectFilter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailAddressJSONObjectFilter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailAddressJSONObjectFilter").toString()));
      }
      if (!jsonObj.get("senderAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `senderAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("senderAddress").toString()));
      }
      if ((jsonObj.get("messageSubject") != null && !jsonObj.get("messageSubject").isJsonNull()) && !jsonObj.get("messageSubject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageSubject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageSubject").toString()));
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
       if (!AddEmailOtpDeliveryMechanismRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddEmailOtpDeliveryMechanismRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddEmailOtpDeliveryMechanismRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddEmailOtpDeliveryMechanismRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddEmailOtpDeliveryMechanismRequest>() {
           @Override
           public void write(JsonWriter out, AddEmailOtpDeliveryMechanismRequest value) throws IOException {
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
           public AddEmailOtpDeliveryMechanismRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddEmailOtpDeliveryMechanismRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddEmailOtpDeliveryMechanismRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddEmailOtpDeliveryMechanismRequest
  * @throws IOException if the JSON string is invalid with respect to AddEmailOtpDeliveryMechanismRequest
  */
  public static AddEmailOtpDeliveryMechanismRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddEmailOtpDeliveryMechanismRequest.class);
  }

 /**
  * Convert an instance of AddEmailOtpDeliveryMechanismRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

