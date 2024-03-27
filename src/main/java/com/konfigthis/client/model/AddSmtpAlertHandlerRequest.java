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
import com.konfigthis.client.model.EnumalertHandlerDisabledAlertTypeProp;
import com.konfigthis.client.model.EnumalertHandlerEnabledAlertSeverityProp;
import com.konfigthis.client.model.EnumalertHandlerEnabledAlertTypeProp;
import com.konfigthis.client.model.EnumsmtpAlertHandlerSchemaUrn;
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
 * AddSmtpAlertHandlerRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddSmtpAlertHandlerRequest {
  public static final String SERIALIZED_NAME_HANDLER_NAME = "handlerName";
  @SerializedName(SERIALIZED_NAME_HANDLER_NAME)
  private String handlerName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumsmtpAlertHandlerSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_ASYNCHRONOUS = "asynchronous";
  @SerializedName(SERIALIZED_NAME_ASYNCHRONOUS)
  private Boolean asynchronous;

  public static final String SERIALIZED_NAME_SENDER_ADDRESS = "senderAddress";
  @SerializedName(SERIALIZED_NAME_SENDER_ADDRESS)
  private String senderAddress;

  public static final String SERIALIZED_NAME_RECIPIENT_ADDRESS = "recipientAddress";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ADDRESS)
  private List<String> recipientAddress = new ArrayList<>();

  public static final String SERIALIZED_NAME_MESSAGE_SUBJECT = "messageSubject";
  @SerializedName(SERIALIZED_NAME_MESSAGE_SUBJECT)
  private String messageSubject;

  public static final String SERIALIZED_NAME_MESSAGE_BODY = "messageBody";
  @SerializedName(SERIALIZED_NAME_MESSAGE_BODY)
  private String messageBody;

  public static final String SERIALIZED_NAME_INCLUDE_MONITOR_DATA_FILTER = "includeMonitorDataFilter";
  @SerializedName(SERIALIZED_NAME_INCLUDE_MONITOR_DATA_FILTER)
  private String includeMonitorDataFilter;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_ENABLED_ALERT_SEVERITY = "enabledAlertSeverity";
  @SerializedName(SERIALIZED_NAME_ENABLED_ALERT_SEVERITY)
  private List<EnumalertHandlerEnabledAlertSeverityProp> enabledAlertSeverity = null;

  public static final String SERIALIZED_NAME_ENABLED_ALERT_TYPE = "enabledAlertType";
  @SerializedName(SERIALIZED_NAME_ENABLED_ALERT_TYPE)
  private List<EnumalertHandlerEnabledAlertTypeProp> enabledAlertType = null;

  public static final String SERIALIZED_NAME_DISABLED_ALERT_TYPE = "disabledAlertType";
  @SerializedName(SERIALIZED_NAME_DISABLED_ALERT_TYPE)
  private List<EnumalertHandlerDisabledAlertTypeProp> disabledAlertType = null;

  public AddSmtpAlertHandlerRequest() {
  }

  public AddSmtpAlertHandlerRequest handlerName(String handlerName) {
    
    
    
    
    this.handlerName = handlerName;
    return this;
  }

   /**
   * Name of the new Alert Handler
   * @return handlerName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the new Alert Handler")

  public String getHandlerName() {
    return handlerName;
  }


  public void setHandlerName(String handlerName) {
    
    
    
    this.handlerName = handlerName;
  }


  public AddSmtpAlertHandlerRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Alert Handler
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Alert Handler")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AddSmtpAlertHandlerRequest schemas(List<EnumsmtpAlertHandlerSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddSmtpAlertHandlerRequest addSchemasItem(EnumsmtpAlertHandlerSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumsmtpAlertHandlerSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumsmtpAlertHandlerSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddSmtpAlertHandlerRequest asynchronous(Boolean asynchronous) {
    
    
    
    
    this.asynchronous = asynchronous;
    return this;
  }

   /**
   * Indicates whether the server should attempt to invoke this SMTP Alert Handler in a background thread so that any potentially-expensive processing (e.g., performing network communication to deliver the alert notification) will not delay whatever processing the server was performing when the alert was generated.
   * @return asynchronous
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the server should attempt to invoke this SMTP Alert Handler in a background thread so that any potentially-expensive processing (e.g., performing network communication to deliver the alert notification) will not delay whatever processing the server was performing when the alert was generated.")

  public Boolean getAsynchronous() {
    return asynchronous;
  }


  public void setAsynchronous(Boolean asynchronous) {
    
    
    
    this.asynchronous = asynchronous;
  }


  public AddSmtpAlertHandlerRequest senderAddress(String senderAddress) {
    
    
    
    
    this.senderAddress = senderAddress;
    return this;
  }

   /**
   * Specifies the email address to use as the sender for messages generated by this alert handler.
   * @return senderAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the email address to use as the sender for messages generated by this alert handler.")

  public String getSenderAddress() {
    return senderAddress;
  }


  public void setSenderAddress(String senderAddress) {
    
    
    
    this.senderAddress = senderAddress;
  }


  public AddSmtpAlertHandlerRequest recipientAddress(List<String> recipientAddress) {
    
    
    
    
    this.recipientAddress = recipientAddress;
    return this;
  }

  public AddSmtpAlertHandlerRequest addRecipientAddressItem(String recipientAddressItem) {
    this.recipientAddress.add(recipientAddressItem);
    return this;
  }

   /**
   * Specifies an email address to which the messages should be sent.
   * @return recipientAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an email address to which the messages should be sent.")

  public List<String> getRecipientAddress() {
    return recipientAddress;
  }


  public void setRecipientAddress(List<String> recipientAddress) {
    
    
    
    this.recipientAddress = recipientAddress;
  }


  public AddSmtpAlertHandlerRequest messageSubject(String messageSubject) {
    
    
    
    
    this.messageSubject = messageSubject;
    return this;
  }

   /**
   * Specifies the subject that should be used for email messages generated by this alert handler.
   * @return messageSubject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the subject that should be used for email messages generated by this alert handler.")

  public String getMessageSubject() {
    return messageSubject;
  }


  public void setMessageSubject(String messageSubject) {
    
    
    
    this.messageSubject = messageSubject;
  }


  public AddSmtpAlertHandlerRequest messageBody(String messageBody) {
    
    
    
    
    this.messageBody = messageBody;
    return this;
  }

   /**
   * Specifies the body that should be used for email messages generated by this alert handler.
   * @return messageBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the body that should be used for email messages generated by this alert handler.")

  public String getMessageBody() {
    return messageBody;
  }


  public void setMessageBody(String messageBody) {
    
    
    
    this.messageBody = messageBody;
  }


  public AddSmtpAlertHandlerRequest includeMonitorDataFilter(String includeMonitorDataFilter) {
    
    
    
    
    this.includeMonitorDataFilter = includeMonitorDataFilter;
    return this;
  }

   /**
   * Include monitor entries that match this filter.
   * @return includeMonitorDataFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include monitor entries that match this filter.")

  public String getIncludeMonitorDataFilter() {
    return includeMonitorDataFilter;
  }


  public void setIncludeMonitorDataFilter(String includeMonitorDataFilter) {
    
    
    
    this.includeMonitorDataFilter = includeMonitorDataFilter;
  }


  public AddSmtpAlertHandlerRequest enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the Alert Handler is enabled.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether the Alert Handler is enabled.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public AddSmtpAlertHandlerRequest enabledAlertSeverity(List<EnumalertHandlerEnabledAlertSeverityProp> enabledAlertSeverity) {
    
    
    
    
    this.enabledAlertSeverity = enabledAlertSeverity;
    return this;
  }

  public AddSmtpAlertHandlerRequest addEnabledAlertSeverityItem(EnumalertHandlerEnabledAlertSeverityProp enabledAlertSeverityItem) {
    if (this.enabledAlertSeverity == null) {
      this.enabledAlertSeverity = new ArrayList<>();
    }
    this.enabledAlertSeverity.add(enabledAlertSeverityItem);
    return this;
  }

   /**
   * Get enabledAlertSeverity
   * @return enabledAlertSeverity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumalertHandlerEnabledAlertSeverityProp> getEnabledAlertSeverity() {
    return enabledAlertSeverity;
  }


  public void setEnabledAlertSeverity(List<EnumalertHandlerEnabledAlertSeverityProp> enabledAlertSeverity) {
    
    
    
    this.enabledAlertSeverity = enabledAlertSeverity;
  }


  public AddSmtpAlertHandlerRequest enabledAlertType(List<EnumalertHandlerEnabledAlertTypeProp> enabledAlertType) {
    
    
    
    
    this.enabledAlertType = enabledAlertType;
    return this;
  }

  public AddSmtpAlertHandlerRequest addEnabledAlertTypeItem(EnumalertHandlerEnabledAlertTypeProp enabledAlertTypeItem) {
    if (this.enabledAlertType == null) {
      this.enabledAlertType = new ArrayList<>();
    }
    this.enabledAlertType.add(enabledAlertTypeItem);
    return this;
  }

   /**
   * Get enabledAlertType
   * @return enabledAlertType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumalertHandlerEnabledAlertTypeProp> getEnabledAlertType() {
    return enabledAlertType;
  }


  public void setEnabledAlertType(List<EnumalertHandlerEnabledAlertTypeProp> enabledAlertType) {
    
    
    
    this.enabledAlertType = enabledAlertType;
  }


  public AddSmtpAlertHandlerRequest disabledAlertType(List<EnumalertHandlerDisabledAlertTypeProp> disabledAlertType) {
    
    
    
    
    this.disabledAlertType = disabledAlertType;
    return this;
  }

  public AddSmtpAlertHandlerRequest addDisabledAlertTypeItem(EnumalertHandlerDisabledAlertTypeProp disabledAlertTypeItem) {
    if (this.disabledAlertType == null) {
      this.disabledAlertType = new ArrayList<>();
    }
    this.disabledAlertType.add(disabledAlertTypeItem);
    return this;
  }

   /**
   * Get disabledAlertType
   * @return disabledAlertType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumalertHandlerDisabledAlertTypeProp> getDisabledAlertType() {
    return disabledAlertType;
  }


  public void setDisabledAlertType(List<EnumalertHandlerDisabledAlertTypeProp> disabledAlertType) {
    
    
    
    this.disabledAlertType = disabledAlertType;
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
   * @return the AddSmtpAlertHandlerRequest instance itself
   */
  public AddSmtpAlertHandlerRequest putAdditionalProperty(String key, Object value) {
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
    AddSmtpAlertHandlerRequest addSmtpAlertHandlerRequest = (AddSmtpAlertHandlerRequest) o;
    return Objects.equals(this.handlerName, addSmtpAlertHandlerRequest.handlerName) &&
        Objects.equals(this.description, addSmtpAlertHandlerRequest.description) &&
        Objects.equals(this.schemas, addSmtpAlertHandlerRequest.schemas) &&
        Objects.equals(this.asynchronous, addSmtpAlertHandlerRequest.asynchronous) &&
        Objects.equals(this.senderAddress, addSmtpAlertHandlerRequest.senderAddress) &&
        Objects.equals(this.recipientAddress, addSmtpAlertHandlerRequest.recipientAddress) &&
        Objects.equals(this.messageSubject, addSmtpAlertHandlerRequest.messageSubject) &&
        Objects.equals(this.messageBody, addSmtpAlertHandlerRequest.messageBody) &&
        Objects.equals(this.includeMonitorDataFilter, addSmtpAlertHandlerRequest.includeMonitorDataFilter) &&
        Objects.equals(this.enabled, addSmtpAlertHandlerRequest.enabled) &&
        Objects.equals(this.enabledAlertSeverity, addSmtpAlertHandlerRequest.enabledAlertSeverity) &&
        Objects.equals(this.enabledAlertType, addSmtpAlertHandlerRequest.enabledAlertType) &&
        Objects.equals(this.disabledAlertType, addSmtpAlertHandlerRequest.disabledAlertType)&&
        Objects.equals(this.additionalProperties, addSmtpAlertHandlerRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handlerName, description, schemas, asynchronous, senderAddress, recipientAddress, messageSubject, messageBody, includeMonitorDataFilter, enabled, enabledAlertSeverity, enabledAlertType, disabledAlertType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddSmtpAlertHandlerRequest {\n");
    sb.append("    handlerName: ").append(toIndentedString(handlerName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    asynchronous: ").append(toIndentedString(asynchronous)).append("\n");
    sb.append("    senderAddress: ").append(toIndentedString(senderAddress)).append("\n");
    sb.append("    recipientAddress: ").append(toIndentedString(recipientAddress)).append("\n");
    sb.append("    messageSubject: ").append(toIndentedString(messageSubject)).append("\n");
    sb.append("    messageBody: ").append(toIndentedString(messageBody)).append("\n");
    sb.append("    includeMonitorDataFilter: ").append(toIndentedString(includeMonitorDataFilter)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    enabledAlertSeverity: ").append(toIndentedString(enabledAlertSeverity)).append("\n");
    sb.append("    enabledAlertType: ").append(toIndentedString(enabledAlertType)).append("\n");
    sb.append("    disabledAlertType: ").append(toIndentedString(disabledAlertType)).append("\n");
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
    openapiFields.add("handlerName");
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("asynchronous");
    openapiFields.add("senderAddress");
    openapiFields.add("recipientAddress");
    openapiFields.add("messageSubject");
    openapiFields.add("messageBody");
    openapiFields.add("includeMonitorDataFilter");
    openapiFields.add("enabled");
    openapiFields.add("enabledAlertSeverity");
    openapiFields.add("enabledAlertType");
    openapiFields.add("disabledAlertType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("handlerName");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("senderAddress");
    openapiRequiredFields.add("recipientAddress");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddSmtpAlertHandlerRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddSmtpAlertHandlerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddSmtpAlertHandlerRequest is not found in the empty JSON string", AddSmtpAlertHandlerRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddSmtpAlertHandlerRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("handlerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `handlerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("handlerName").toString()));
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
      if (!jsonObj.get("senderAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `senderAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("senderAddress").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("recipientAddress") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("recipientAddress").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientAddress` to be an array in the JSON string but got `%s`", jsonObj.get("recipientAddress").toString()));
      }
      if ((jsonObj.get("messageSubject") != null && !jsonObj.get("messageSubject").isJsonNull()) && !jsonObj.get("messageSubject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageSubject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageSubject").toString()));
      }
      if ((jsonObj.get("messageBody") != null && !jsonObj.get("messageBody").isJsonNull()) && !jsonObj.get("messageBody").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageBody` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageBody").toString()));
      }
      if ((jsonObj.get("includeMonitorDataFilter") != null && !jsonObj.get("includeMonitorDataFilter").isJsonNull()) && !jsonObj.get("includeMonitorDataFilter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `includeMonitorDataFilter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("includeMonitorDataFilter").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("enabledAlertSeverity") != null && !jsonObj.get("enabledAlertSeverity").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `enabledAlertSeverity` to be an array in the JSON string but got `%s`", jsonObj.get("enabledAlertSeverity").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("enabledAlertType") != null && !jsonObj.get("enabledAlertType").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `enabledAlertType` to be an array in the JSON string but got `%s`", jsonObj.get("enabledAlertType").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("disabledAlertType") != null && !jsonObj.get("disabledAlertType").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `disabledAlertType` to be an array in the JSON string but got `%s`", jsonObj.get("disabledAlertType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddSmtpAlertHandlerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddSmtpAlertHandlerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddSmtpAlertHandlerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddSmtpAlertHandlerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddSmtpAlertHandlerRequest>() {
           @Override
           public void write(JsonWriter out, AddSmtpAlertHandlerRequest value) throws IOException {
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
           public AddSmtpAlertHandlerRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddSmtpAlertHandlerRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddSmtpAlertHandlerRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddSmtpAlertHandlerRequest
  * @throws IOException if the JSON string is invalid with respect to AddSmtpAlertHandlerRequest
  */
  public static AddSmtpAlertHandlerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddSmtpAlertHandlerRequest.class);
  }

 /**
  * Convert an instance of AddSmtpAlertHandlerRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

