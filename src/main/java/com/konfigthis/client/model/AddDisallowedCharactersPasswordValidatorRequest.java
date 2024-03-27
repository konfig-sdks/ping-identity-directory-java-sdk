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
import com.konfigthis.client.model.EnumdisallowedCharactersPasswordValidatorSchemaUrn;
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
 * AddDisallowedCharactersPasswordValidatorRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddDisallowedCharactersPasswordValidatorRequest {
  public static final String SERIALIZED_NAME_VALIDATOR_NAME = "validatorName";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_NAME)
  private String validatorName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumdisallowedCharactersPasswordValidatorSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_DISALLOWED_CHARACTERS = "disallowedCharacters";
  @SerializedName(SERIALIZED_NAME_DISALLOWED_CHARACTERS)
  private String disallowedCharacters;

  public static final String SERIALIZED_NAME_DISALLOWED_LEADING_CHARACTERS = "disallowedLeadingCharacters";
  @SerializedName(SERIALIZED_NAME_DISALLOWED_LEADING_CHARACTERS)
  private String disallowedLeadingCharacters;

  public static final String SERIALIZED_NAME_DISALLOWED_TRAILING_CHARACTERS = "disallowedTrailingCharacters";
  @SerializedName(SERIALIZED_NAME_DISALLOWED_TRAILING_CHARACTERS)
  private String disallowedTrailingCharacters;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_VALIDATOR_REQUIREMENT_DESCRIPTION = "validatorRequirementDescription";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_REQUIREMENT_DESCRIPTION)
  private String validatorRequirementDescription;

  public static final String SERIALIZED_NAME_VALIDATOR_FAILURE_MESSAGE = "validatorFailureMessage";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_FAILURE_MESSAGE)
  private String validatorFailureMessage;

  public AddDisallowedCharactersPasswordValidatorRequest() {
  }

  public AddDisallowedCharactersPasswordValidatorRequest validatorName(String validatorName) {
    
    
    
    
    this.validatorName = validatorName;
    return this;
  }

   /**
   * Name of the new Password Validator
   * @return validatorName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the new Password Validator")

  public String getValidatorName() {
    return validatorName;
  }


  public void setValidatorName(String validatorName) {
    
    
    
    this.validatorName = validatorName;
  }


  public AddDisallowedCharactersPasswordValidatorRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Password Validator
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Password Validator")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AddDisallowedCharactersPasswordValidatorRequest schemas(List<EnumdisallowedCharactersPasswordValidatorSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddDisallowedCharactersPasswordValidatorRequest addSchemasItem(EnumdisallowedCharactersPasswordValidatorSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumdisallowedCharactersPasswordValidatorSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumdisallowedCharactersPasswordValidatorSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddDisallowedCharactersPasswordValidatorRequest disallowedCharacters(String disallowedCharacters) {
    
    
    
    
    this.disallowedCharacters = disallowedCharacters;
    return this;
  }

   /**
   * A set of characters that will not be allowed anywhere in a password.
   * @return disallowedCharacters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A set of characters that will not be allowed anywhere in a password.")

  public String getDisallowedCharacters() {
    return disallowedCharacters;
  }


  public void setDisallowedCharacters(String disallowedCharacters) {
    
    
    
    this.disallowedCharacters = disallowedCharacters;
  }


  public AddDisallowedCharactersPasswordValidatorRequest disallowedLeadingCharacters(String disallowedLeadingCharacters) {
    
    
    
    
    this.disallowedLeadingCharacters = disallowedLeadingCharacters;
    return this;
  }

   /**
   * A set of characters that will not be allowed as the first character of the password.
   * @return disallowedLeadingCharacters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A set of characters that will not be allowed as the first character of the password.")

  public String getDisallowedLeadingCharacters() {
    return disallowedLeadingCharacters;
  }


  public void setDisallowedLeadingCharacters(String disallowedLeadingCharacters) {
    
    
    
    this.disallowedLeadingCharacters = disallowedLeadingCharacters;
  }


  public AddDisallowedCharactersPasswordValidatorRequest disallowedTrailingCharacters(String disallowedTrailingCharacters) {
    
    
    
    
    this.disallowedTrailingCharacters = disallowedTrailingCharacters;
    return this;
  }

   /**
   * A set of characters that will not be allowed as the last character of the password.
   * @return disallowedTrailingCharacters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A set of characters that will not be allowed as the last character of the password.")

  public String getDisallowedTrailingCharacters() {
    return disallowedTrailingCharacters;
  }


  public void setDisallowedTrailingCharacters(String disallowedTrailingCharacters) {
    
    
    
    this.disallowedTrailingCharacters = disallowedTrailingCharacters;
  }


  public AddDisallowedCharactersPasswordValidatorRequest enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the password validator is enabled for use.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether the password validator is enabled for use.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public AddDisallowedCharactersPasswordValidatorRequest validatorRequirementDescription(String validatorRequirementDescription) {
    
    
    
    
    this.validatorRequirementDescription = validatorRequirementDescription;
    return this;
  }

   /**
   * Specifies a message that can be used to describe the requirements imposed by this password validator to end users. If a value is provided for this property, then it will override any description that may have otherwise been generated by the validator.
   * @return validatorRequirementDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a message that can be used to describe the requirements imposed by this password validator to end users. If a value is provided for this property, then it will override any description that may have otherwise been generated by the validator.")

  public String getValidatorRequirementDescription() {
    return validatorRequirementDescription;
  }


  public void setValidatorRequirementDescription(String validatorRequirementDescription) {
    
    
    
    this.validatorRequirementDescription = validatorRequirementDescription;
  }


  public AddDisallowedCharactersPasswordValidatorRequest validatorFailureMessage(String validatorFailureMessage) {
    
    
    
    
    this.validatorFailureMessage = validatorFailureMessage;
    return this;
  }

   /**
   * Specifies a message that may be provided to the end user in the event that a proposed password is rejected by this validator. If a value is provided for this property, then it will override any failure message that may have otherwise been generated by the validator.
   * @return validatorFailureMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a message that may be provided to the end user in the event that a proposed password is rejected by this validator. If a value is provided for this property, then it will override any failure message that may have otherwise been generated by the validator.")

  public String getValidatorFailureMessage() {
    return validatorFailureMessage;
  }


  public void setValidatorFailureMessage(String validatorFailureMessage) {
    
    
    
    this.validatorFailureMessage = validatorFailureMessage;
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
   * @return the AddDisallowedCharactersPasswordValidatorRequest instance itself
   */
  public AddDisallowedCharactersPasswordValidatorRequest putAdditionalProperty(String key, Object value) {
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
    AddDisallowedCharactersPasswordValidatorRequest addDisallowedCharactersPasswordValidatorRequest = (AddDisallowedCharactersPasswordValidatorRequest) o;
    return Objects.equals(this.validatorName, addDisallowedCharactersPasswordValidatorRequest.validatorName) &&
        Objects.equals(this.description, addDisallowedCharactersPasswordValidatorRequest.description) &&
        Objects.equals(this.schemas, addDisallowedCharactersPasswordValidatorRequest.schemas) &&
        Objects.equals(this.disallowedCharacters, addDisallowedCharactersPasswordValidatorRequest.disallowedCharacters) &&
        Objects.equals(this.disallowedLeadingCharacters, addDisallowedCharactersPasswordValidatorRequest.disallowedLeadingCharacters) &&
        Objects.equals(this.disallowedTrailingCharacters, addDisallowedCharactersPasswordValidatorRequest.disallowedTrailingCharacters) &&
        Objects.equals(this.enabled, addDisallowedCharactersPasswordValidatorRequest.enabled) &&
        Objects.equals(this.validatorRequirementDescription, addDisallowedCharactersPasswordValidatorRequest.validatorRequirementDescription) &&
        Objects.equals(this.validatorFailureMessage, addDisallowedCharactersPasswordValidatorRequest.validatorFailureMessage)&&
        Objects.equals(this.additionalProperties, addDisallowedCharactersPasswordValidatorRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validatorName, description, schemas, disallowedCharacters, disallowedLeadingCharacters, disallowedTrailingCharacters, enabled, validatorRequirementDescription, validatorFailureMessage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDisallowedCharactersPasswordValidatorRequest {\n");
    sb.append("    validatorName: ").append(toIndentedString(validatorName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    disallowedCharacters: ").append(toIndentedString(disallowedCharacters)).append("\n");
    sb.append("    disallowedLeadingCharacters: ").append(toIndentedString(disallowedLeadingCharacters)).append("\n");
    sb.append("    disallowedTrailingCharacters: ").append(toIndentedString(disallowedTrailingCharacters)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    validatorRequirementDescription: ").append(toIndentedString(validatorRequirementDescription)).append("\n");
    sb.append("    validatorFailureMessage: ").append(toIndentedString(validatorFailureMessage)).append("\n");
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
    openapiFields.add("validatorName");
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("disallowedCharacters");
    openapiFields.add("disallowedLeadingCharacters");
    openapiFields.add("disallowedTrailingCharacters");
    openapiFields.add("enabled");
    openapiFields.add("validatorRequirementDescription");
    openapiFields.add("validatorFailureMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("validatorName");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddDisallowedCharactersPasswordValidatorRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddDisallowedCharactersPasswordValidatorRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddDisallowedCharactersPasswordValidatorRequest is not found in the empty JSON string", AddDisallowedCharactersPasswordValidatorRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddDisallowedCharactersPasswordValidatorRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("validatorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validatorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validatorName").toString()));
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
      if ((jsonObj.get("disallowedCharacters") != null && !jsonObj.get("disallowedCharacters").isJsonNull()) && !jsonObj.get("disallowedCharacters").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disallowedCharacters` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disallowedCharacters").toString()));
      }
      if ((jsonObj.get("disallowedLeadingCharacters") != null && !jsonObj.get("disallowedLeadingCharacters").isJsonNull()) && !jsonObj.get("disallowedLeadingCharacters").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disallowedLeadingCharacters` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disallowedLeadingCharacters").toString()));
      }
      if ((jsonObj.get("disallowedTrailingCharacters") != null && !jsonObj.get("disallowedTrailingCharacters").isJsonNull()) && !jsonObj.get("disallowedTrailingCharacters").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disallowedTrailingCharacters` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disallowedTrailingCharacters").toString()));
      }
      if ((jsonObj.get("validatorRequirementDescription") != null && !jsonObj.get("validatorRequirementDescription").isJsonNull()) && !jsonObj.get("validatorRequirementDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validatorRequirementDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validatorRequirementDescription").toString()));
      }
      if ((jsonObj.get("validatorFailureMessage") != null && !jsonObj.get("validatorFailureMessage").isJsonNull()) && !jsonObj.get("validatorFailureMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validatorFailureMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validatorFailureMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddDisallowedCharactersPasswordValidatorRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddDisallowedCharactersPasswordValidatorRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddDisallowedCharactersPasswordValidatorRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddDisallowedCharactersPasswordValidatorRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddDisallowedCharactersPasswordValidatorRequest>() {
           @Override
           public void write(JsonWriter out, AddDisallowedCharactersPasswordValidatorRequest value) throws IOException {
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
           public AddDisallowedCharactersPasswordValidatorRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddDisallowedCharactersPasswordValidatorRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddDisallowedCharactersPasswordValidatorRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddDisallowedCharactersPasswordValidatorRequest
  * @throws IOException if the JSON string is invalid with respect to AddDisallowedCharactersPasswordValidatorRequest
  */
  public static AddDisallowedCharactersPasswordValidatorRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddDisallowedCharactersPasswordValidatorRequest.class);
  }

 /**
  * Convert an instance of AddDisallowedCharactersPasswordValidatorRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

