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
import com.konfigthis.client.model.MetaUrnPingidentitySchemasConfigurationMessages20RequiredActionsInner;
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
 * MetaUrnPingidentitySchemasConfigurationMessages20
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MetaUrnPingidentitySchemasConfigurationMessages20 {
  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private List<String> notifications = null;

  public static final String SERIALIZED_NAME_REQUIRED_ACTIONS = "requiredActions";
  @SerializedName(SERIALIZED_NAME_REQUIRED_ACTIONS)
  private List<MetaUrnPingidentitySchemasConfigurationMessages20RequiredActionsInner> requiredActions = null;

  public MetaUrnPingidentitySchemasConfigurationMessages20() {
  }

  public MetaUrnPingidentitySchemasConfigurationMessages20 notifications(List<String> notifications) {
    
    
    
    
    this.notifications = notifications;
    return this;
  }

  public MetaUrnPingidentitySchemasConfigurationMessages20 addNotificationsItem(String notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNotifications() {
    return notifications;
  }


  public void setNotifications(List<String> notifications) {
    
    
    
    this.notifications = notifications;
  }


  public MetaUrnPingidentitySchemasConfigurationMessages20 requiredActions(List<MetaUrnPingidentitySchemasConfigurationMessages20RequiredActionsInner> requiredActions) {
    
    
    
    
    this.requiredActions = requiredActions;
    return this;
  }

  public MetaUrnPingidentitySchemasConfigurationMessages20 addRequiredActionsItem(MetaUrnPingidentitySchemasConfigurationMessages20RequiredActionsInner requiredActionsItem) {
    if (this.requiredActions == null) {
      this.requiredActions = new ArrayList<>();
    }
    this.requiredActions.add(requiredActionsItem);
    return this;
  }

   /**
   * Get requiredActions
   * @return requiredActions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MetaUrnPingidentitySchemasConfigurationMessages20RequiredActionsInner> getRequiredActions() {
    return requiredActions;
  }


  public void setRequiredActions(List<MetaUrnPingidentitySchemasConfigurationMessages20RequiredActionsInner> requiredActions) {
    
    
    
    this.requiredActions = requiredActions;
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
   * @return the MetaUrnPingidentitySchemasConfigurationMessages20 instance itself
   */
  public MetaUrnPingidentitySchemasConfigurationMessages20 putAdditionalProperty(String key, Object value) {
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
    MetaUrnPingidentitySchemasConfigurationMessages20 metaUrnPingidentitySchemasConfigurationMessages20 = (MetaUrnPingidentitySchemasConfigurationMessages20) o;
    return Objects.equals(this.notifications, metaUrnPingidentitySchemasConfigurationMessages20.notifications) &&
        Objects.equals(this.requiredActions, metaUrnPingidentitySchemasConfigurationMessages20.requiredActions)&&
        Objects.equals(this.additionalProperties, metaUrnPingidentitySchemasConfigurationMessages20.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifications, requiredActions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaUrnPingidentitySchemasConfigurationMessages20 {\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    requiredActions: ").append(toIndentedString(requiredActions)).append("\n");
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
    openapiFields.add("notifications");
    openapiFields.add("requiredActions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MetaUrnPingidentitySchemasConfigurationMessages20
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MetaUrnPingidentitySchemasConfigurationMessages20.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetaUrnPingidentitySchemasConfigurationMessages20 is not found in the empty JSON string", MetaUrnPingidentitySchemasConfigurationMessages20.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("notifications") != null && !jsonObj.get("notifications").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `notifications` to be an array in the JSON string but got `%s`", jsonObj.get("notifications").toString()));
      }
      if (jsonObj.get("requiredActions") != null && !jsonObj.get("requiredActions").isJsonNull()) {
        JsonArray jsonArrayrequiredActions = jsonObj.getAsJsonArray("requiredActions");
        if (jsonArrayrequiredActions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("requiredActions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `requiredActions` to be an array in the JSON string but got `%s`", jsonObj.get("requiredActions").toString()));
          }

          // validate the optional field `requiredActions` (array)
          for (int i = 0; i < jsonArrayrequiredActions.size(); i++) {
            MetaUrnPingidentitySchemasConfigurationMessages20RequiredActionsInner.validateJsonObject(jsonArrayrequiredActions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetaUrnPingidentitySchemasConfigurationMessages20.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetaUrnPingidentitySchemasConfigurationMessages20' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetaUrnPingidentitySchemasConfigurationMessages20> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetaUrnPingidentitySchemasConfigurationMessages20.class));

       return (TypeAdapter<T>) new TypeAdapter<MetaUrnPingidentitySchemasConfigurationMessages20>() {
           @Override
           public void write(JsonWriter out, MetaUrnPingidentitySchemasConfigurationMessages20 value) throws IOException {
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
           public MetaUrnPingidentitySchemasConfigurationMessages20 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MetaUrnPingidentitySchemasConfigurationMessages20 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MetaUrnPingidentitySchemasConfigurationMessages20 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MetaUrnPingidentitySchemasConfigurationMessages20
  * @throws IOException if the JSON string is invalid with respect to MetaUrnPingidentitySchemasConfigurationMessages20
  */
  public static MetaUrnPingidentitySchemasConfigurationMessages20 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetaUrnPingidentitySchemasConfigurationMessages20.class);
  }

 /**
  * Convert an instance of MetaUrnPingidentitySchemasConfigurationMessages20 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

