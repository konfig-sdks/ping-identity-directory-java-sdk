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
import com.konfigthis.client.model.EnumbackendWritabilityModeProp;
import com.konfigthis.client.model.EnumcustomBackendSchemaUrn;
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
 * CustomBackendResponseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CustomBackendResponseAllOf {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumcustomBackendSchemaUrn> schemas = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BACKEND_I_D = "backendID";
  @SerializedName(SERIALIZED_NAME_BACKEND_I_D)
  private String backendID;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_BASE_D_N = "baseDN";
  @SerializedName(SERIALIZED_NAME_BASE_D_N)
  private List<String> baseDN = null;

  public static final String SERIALIZED_NAME_WRITABILITY_MODE = "writabilityMode";
  @SerializedName(SERIALIZED_NAME_WRITABILITY_MODE)
  private EnumbackendWritabilityModeProp writabilityMode;

  public static final String SERIALIZED_NAME_SET_DEGRADED_ALERT_WHEN_DISABLED = "setDegradedAlertWhenDisabled";
  @SerializedName(SERIALIZED_NAME_SET_DEGRADED_ALERT_WHEN_DISABLED)
  private Boolean setDegradedAlertWhenDisabled;

  public static final String SERIALIZED_NAME_RETURN_UNAVAILABLE_WHEN_DISABLED = "returnUnavailableWhenDisabled";
  @SerializedName(SERIALIZED_NAME_RETURN_UNAVAILABLE_WHEN_DISABLED)
  private Boolean returnUnavailableWhenDisabled;

  public static final String SERIALIZED_NAME_BACKUP_FILE_PERMISSIONS = "backupFilePermissions";
  @SerializedName(SERIALIZED_NAME_BACKUP_FILE_PERMISSIONS)
  private String backupFilePermissions;

  public static final String SERIALIZED_NAME_NOTIFICATION_MANAGER = "notificationManager";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_MANAGER)
  private String notificationManager;

  public CustomBackendResponseAllOf() {
  }

  public CustomBackendResponseAllOf description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Backend
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Backend")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public CustomBackendResponseAllOf schemas(List<EnumcustomBackendSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public CustomBackendResponseAllOf addSchemasItem(EnumcustomBackendSchemaUrn schemasItem) {
    if (this.schemas == null) {
      this.schemas = new ArrayList<>();
    }
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumcustomBackendSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumcustomBackendSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public CustomBackendResponseAllOf id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Backend
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Backend")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public CustomBackendResponseAllOf backendID(String backendID) {
    
    
    
    
    this.backendID = backendID;
    return this;
  }

   /**
   * Specifies a name to identify the associated backend.
   * @return backendID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a name to identify the associated backend.")

  public String getBackendID() {
    return backendID;
  }


  public void setBackendID(String backendID) {
    
    
    
    this.backendID = backendID;
  }


  public CustomBackendResponseAllOf enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the backend is enabled in the server.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the backend is enabled in the server.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public CustomBackendResponseAllOf baseDN(List<String> baseDN) {
    
    
    
    
    this.baseDN = baseDN;
    return this;
  }

  public CustomBackendResponseAllOf addBaseDNItem(String baseDNItem) {
    if (this.baseDN == null) {
      this.baseDN = new ArrayList<>();
    }
    this.baseDN.add(baseDNItem);
    return this;
  }

   /**
   * Specifies the base DN(s) for the data that the backend handles.
   * @return baseDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the base DN(s) for the data that the backend handles.")

  public List<String> getBaseDN() {
    return baseDN;
  }


  public void setBaseDN(List<String> baseDN) {
    
    
    
    this.baseDN = baseDN;
  }


  public CustomBackendResponseAllOf writabilityMode(EnumbackendWritabilityModeProp writabilityMode) {
    
    
    
    
    this.writabilityMode = writabilityMode;
    return this;
  }

   /**
   * Get writabilityMode
   * @return writabilityMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumbackendWritabilityModeProp getWritabilityMode() {
    return writabilityMode;
  }


  public void setWritabilityMode(EnumbackendWritabilityModeProp writabilityMode) {
    
    
    
    this.writabilityMode = writabilityMode;
  }


  public CustomBackendResponseAllOf setDegradedAlertWhenDisabled(Boolean setDegradedAlertWhenDisabled) {
    
    
    
    
    this.setDegradedAlertWhenDisabled = setDegradedAlertWhenDisabled;
    return this;
  }

   /**
   * Determines whether the Directory Server enters a DEGRADED state (and sends a corresponding alert) when this Backend is disabled.
   * @return setDegradedAlertWhenDisabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether the Directory Server enters a DEGRADED state (and sends a corresponding alert) when this Backend is disabled.")

  public Boolean getSetDegradedAlertWhenDisabled() {
    return setDegradedAlertWhenDisabled;
  }


  public void setSetDegradedAlertWhenDisabled(Boolean setDegradedAlertWhenDisabled) {
    
    
    
    this.setDegradedAlertWhenDisabled = setDegradedAlertWhenDisabled;
  }


  public CustomBackendResponseAllOf returnUnavailableWhenDisabled(Boolean returnUnavailableWhenDisabled) {
    
    
    
    
    this.returnUnavailableWhenDisabled = returnUnavailableWhenDisabled;
    return this;
  }

   /**
   * Determines whether any LDAP operation that would use this Backend is to return UNAVAILABLE when this Backend is disabled.
   * @return returnUnavailableWhenDisabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether any LDAP operation that would use this Backend is to return UNAVAILABLE when this Backend is disabled.")

  public Boolean getReturnUnavailableWhenDisabled() {
    return returnUnavailableWhenDisabled;
  }


  public void setReturnUnavailableWhenDisabled(Boolean returnUnavailableWhenDisabled) {
    
    
    
    this.returnUnavailableWhenDisabled = returnUnavailableWhenDisabled;
  }


  public CustomBackendResponseAllOf backupFilePermissions(String backupFilePermissions) {
    
    
    
    
    this.backupFilePermissions = backupFilePermissions;
    return this;
  }

   /**
   * Specifies the permissions that should be applied to files and directories created by a backup of the backend.
   * @return backupFilePermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the permissions that should be applied to files and directories created by a backup of the backend.")

  public String getBackupFilePermissions() {
    return backupFilePermissions;
  }


  public void setBackupFilePermissions(String backupFilePermissions) {
    
    
    
    this.backupFilePermissions = backupFilePermissions;
  }


  public CustomBackendResponseAllOf notificationManager(String notificationManager) {
    
    
    
    
    this.notificationManager = notificationManager;
    return this;
  }

   /**
   * Specifies a notification manager for changes resulting from operations processed through this Backend
   * @return notificationManager
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a notification manager for changes resulting from operations processed through this Backend")

  public String getNotificationManager() {
    return notificationManager;
  }


  public void setNotificationManager(String notificationManager) {
    
    
    
    this.notificationManager = notificationManager;
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
   * @return the CustomBackendResponseAllOf instance itself
   */
  public CustomBackendResponseAllOf putAdditionalProperty(String key, Object value) {
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
    CustomBackendResponseAllOf customBackendResponseAllOf = (CustomBackendResponseAllOf) o;
    return Objects.equals(this.description, customBackendResponseAllOf.description) &&
        Objects.equals(this.schemas, customBackendResponseAllOf.schemas) &&
        Objects.equals(this.id, customBackendResponseAllOf.id) &&
        Objects.equals(this.backendID, customBackendResponseAllOf.backendID) &&
        Objects.equals(this.enabled, customBackendResponseAllOf.enabled) &&
        Objects.equals(this.baseDN, customBackendResponseAllOf.baseDN) &&
        Objects.equals(this.writabilityMode, customBackendResponseAllOf.writabilityMode) &&
        Objects.equals(this.setDegradedAlertWhenDisabled, customBackendResponseAllOf.setDegradedAlertWhenDisabled) &&
        Objects.equals(this.returnUnavailableWhenDisabled, customBackendResponseAllOf.returnUnavailableWhenDisabled) &&
        Objects.equals(this.backupFilePermissions, customBackendResponseAllOf.backupFilePermissions) &&
        Objects.equals(this.notificationManager, customBackendResponseAllOf.notificationManager)&&
        Objects.equals(this.additionalProperties, customBackendResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, id, backendID, enabled, baseDN, writabilityMode, setDegradedAlertWhenDisabled, returnUnavailableWhenDisabled, backupFilePermissions, notificationManager, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomBackendResponseAllOf {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    backendID: ").append(toIndentedString(backendID)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    baseDN: ").append(toIndentedString(baseDN)).append("\n");
    sb.append("    writabilityMode: ").append(toIndentedString(writabilityMode)).append("\n");
    sb.append("    setDegradedAlertWhenDisabled: ").append(toIndentedString(setDegradedAlertWhenDisabled)).append("\n");
    sb.append("    returnUnavailableWhenDisabled: ").append(toIndentedString(returnUnavailableWhenDisabled)).append("\n");
    sb.append("    backupFilePermissions: ").append(toIndentedString(backupFilePermissions)).append("\n");
    sb.append("    notificationManager: ").append(toIndentedString(notificationManager)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("id");
    openapiFields.add("backendID");
    openapiFields.add("enabled");
    openapiFields.add("baseDN");
    openapiFields.add("writabilityMode");
    openapiFields.add("setDegradedAlertWhenDisabled");
    openapiFields.add("returnUnavailableWhenDisabled");
    openapiFields.add("backupFilePermissions");
    openapiFields.add("notificationManager");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomBackendResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomBackendResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomBackendResponseAllOf is not found in the empty JSON string", CustomBackendResponseAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("schemas") != null && !jsonObj.get("schemas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemas` to be an array in the JSON string but got `%s`", jsonObj.get("schemas").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("backendID") != null && !jsonObj.get("backendID").isJsonNull()) && !jsonObj.get("backendID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backendID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backendID").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("baseDN") != null && !jsonObj.get("baseDN").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseDN` to be an array in the JSON string but got `%s`", jsonObj.get("baseDN").toString()));
      }
      if ((jsonObj.get("backupFilePermissions") != null && !jsonObj.get("backupFilePermissions").isJsonNull()) && !jsonObj.get("backupFilePermissions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backupFilePermissions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backupFilePermissions").toString()));
      }
      if ((jsonObj.get("notificationManager") != null && !jsonObj.get("notificationManager").isJsonNull()) && !jsonObj.get("notificationManager").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notificationManager` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notificationManager").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomBackendResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomBackendResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomBackendResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomBackendResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomBackendResponseAllOf>() {
           @Override
           public void write(JsonWriter out, CustomBackendResponseAllOf value) throws IOException {
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
           public CustomBackendResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CustomBackendResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CustomBackendResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomBackendResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to CustomBackendResponseAllOf
  */
  public static CustomBackendResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomBackendResponseAllOf.class);
  }

 /**
  * Convert an instance of CustomBackendResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

