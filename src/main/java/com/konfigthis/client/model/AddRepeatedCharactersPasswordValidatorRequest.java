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
import com.konfigthis.client.model.EnumrepeatedCharactersPasswordValidatorSchemaUrn;
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
 * AddRepeatedCharactersPasswordValidatorRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddRepeatedCharactersPasswordValidatorRequest {
  public static final String SERIALIZED_NAME_VALIDATOR_NAME = "validatorName";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_NAME)
  private String validatorName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumrepeatedCharactersPasswordValidatorSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_MAX_CONSECUTIVE_LENGTH = "maxConsecutiveLength";
  @SerializedName(SERIALIZED_NAME_MAX_CONSECUTIVE_LENGTH)
  private Integer maxConsecutiveLength;

  public static final String SERIALIZED_NAME_CASE_SENSITIVE_VALIDATION = "caseSensitiveValidation";
  @SerializedName(SERIALIZED_NAME_CASE_SENSITIVE_VALIDATION)
  private Boolean caseSensitiveValidation;

  public static final String SERIALIZED_NAME_CHARACTER_SET = "characterSet";
  @SerializedName(SERIALIZED_NAME_CHARACTER_SET)
  private List<String> characterSet = null;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_VALIDATOR_REQUIREMENT_DESCRIPTION = "validatorRequirementDescription";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_REQUIREMENT_DESCRIPTION)
  private String validatorRequirementDescription;

  public static final String SERIALIZED_NAME_VALIDATOR_FAILURE_MESSAGE = "validatorFailureMessage";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_FAILURE_MESSAGE)
  private String validatorFailureMessage;

  public AddRepeatedCharactersPasswordValidatorRequest() {
  }

  public AddRepeatedCharactersPasswordValidatorRequest validatorName(String validatorName) {
    
    
    
    
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


  public AddRepeatedCharactersPasswordValidatorRequest description(String description) {
    
    
    
    
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


  public AddRepeatedCharactersPasswordValidatorRequest schemas(List<EnumrepeatedCharactersPasswordValidatorSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddRepeatedCharactersPasswordValidatorRequest addSchemasItem(EnumrepeatedCharactersPasswordValidatorSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumrepeatedCharactersPasswordValidatorSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumrepeatedCharactersPasswordValidatorSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddRepeatedCharactersPasswordValidatorRequest maxConsecutiveLength(Integer maxConsecutiveLength) {
    
    
    
    
    this.maxConsecutiveLength = maxConsecutiveLength;
    return this;
  }

   /**
   * Specifies the maximum number of times that any character can appear consecutively in a password value.
   * @return maxConsecutiveLength
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the maximum number of times that any character can appear consecutively in a password value.")

  public Integer getMaxConsecutiveLength() {
    return maxConsecutiveLength;
  }


  public void setMaxConsecutiveLength(Integer maxConsecutiveLength) {
    
    
    
    this.maxConsecutiveLength = maxConsecutiveLength;
  }


  public AddRepeatedCharactersPasswordValidatorRequest caseSensitiveValidation(Boolean caseSensitiveValidation) {
    
    
    
    
    this.caseSensitiveValidation = caseSensitiveValidation;
    return this;
  }

   /**
   * Indicates whether this password validator should treat password characters in a case-sensitive manner.
   * @return caseSensitiveValidation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether this password validator should treat password characters in a case-sensitive manner.")

  public Boolean getCaseSensitiveValidation() {
    return caseSensitiveValidation;
  }


  public void setCaseSensitiveValidation(Boolean caseSensitiveValidation) {
    
    
    
    this.caseSensitiveValidation = caseSensitiveValidation;
  }


  public AddRepeatedCharactersPasswordValidatorRequest characterSet(List<String> characterSet) {
    
    
    
    
    this.characterSet = characterSet;
    return this;
  }

  public AddRepeatedCharactersPasswordValidatorRequest addCharacterSetItem(String characterSetItem) {
    if (this.characterSet == null) {
      this.characterSet = new ArrayList<>();
    }
    this.characterSet.add(characterSetItem);
    return this;
  }

   /**
   * Specifies a set of characters that should be considered equivalent for the purpose of this password validator. This can be used, for example, to ensure that passwords contain no more than three consecutive digits.
   * @return characterSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a set of characters that should be considered equivalent for the purpose of this password validator. This can be used, for example, to ensure that passwords contain no more than three consecutive digits.")

  public List<String> getCharacterSet() {
    return characterSet;
  }


  public void setCharacterSet(List<String> characterSet) {
    
    
    
    this.characterSet = characterSet;
  }


  public AddRepeatedCharactersPasswordValidatorRequest enabled(Boolean enabled) {
    
    
    
    
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


  public AddRepeatedCharactersPasswordValidatorRequest validatorRequirementDescription(String validatorRequirementDescription) {
    
    
    
    
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


  public AddRepeatedCharactersPasswordValidatorRequest validatorFailureMessage(String validatorFailureMessage) {
    
    
    
    
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
   * @return the AddRepeatedCharactersPasswordValidatorRequest instance itself
   */
  public AddRepeatedCharactersPasswordValidatorRequest putAdditionalProperty(String key, Object value) {
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
    AddRepeatedCharactersPasswordValidatorRequest addRepeatedCharactersPasswordValidatorRequest = (AddRepeatedCharactersPasswordValidatorRequest) o;
    return Objects.equals(this.validatorName, addRepeatedCharactersPasswordValidatorRequest.validatorName) &&
        Objects.equals(this.description, addRepeatedCharactersPasswordValidatorRequest.description) &&
        Objects.equals(this.schemas, addRepeatedCharactersPasswordValidatorRequest.schemas) &&
        Objects.equals(this.maxConsecutiveLength, addRepeatedCharactersPasswordValidatorRequest.maxConsecutiveLength) &&
        Objects.equals(this.caseSensitiveValidation, addRepeatedCharactersPasswordValidatorRequest.caseSensitiveValidation) &&
        Objects.equals(this.characterSet, addRepeatedCharactersPasswordValidatorRequest.characterSet) &&
        Objects.equals(this.enabled, addRepeatedCharactersPasswordValidatorRequest.enabled) &&
        Objects.equals(this.validatorRequirementDescription, addRepeatedCharactersPasswordValidatorRequest.validatorRequirementDescription) &&
        Objects.equals(this.validatorFailureMessage, addRepeatedCharactersPasswordValidatorRequest.validatorFailureMessage)&&
        Objects.equals(this.additionalProperties, addRepeatedCharactersPasswordValidatorRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validatorName, description, schemas, maxConsecutiveLength, caseSensitiveValidation, characterSet, enabled, validatorRequirementDescription, validatorFailureMessage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddRepeatedCharactersPasswordValidatorRequest {\n");
    sb.append("    validatorName: ").append(toIndentedString(validatorName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    maxConsecutiveLength: ").append(toIndentedString(maxConsecutiveLength)).append("\n");
    sb.append("    caseSensitiveValidation: ").append(toIndentedString(caseSensitiveValidation)).append("\n");
    sb.append("    characterSet: ").append(toIndentedString(characterSet)).append("\n");
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
    openapiFields.add("maxConsecutiveLength");
    openapiFields.add("caseSensitiveValidation");
    openapiFields.add("characterSet");
    openapiFields.add("enabled");
    openapiFields.add("validatorRequirementDescription");
    openapiFields.add("validatorFailureMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("validatorName");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("maxConsecutiveLength");
    openapiRequiredFields.add("caseSensitiveValidation");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddRepeatedCharactersPasswordValidatorRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddRepeatedCharactersPasswordValidatorRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddRepeatedCharactersPasswordValidatorRequest is not found in the empty JSON string", AddRepeatedCharactersPasswordValidatorRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddRepeatedCharactersPasswordValidatorRequest.openapiRequiredFields) {
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("characterSet") != null && !jsonObj.get("characterSet").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `characterSet` to be an array in the JSON string but got `%s`", jsonObj.get("characterSet").toString()));
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
       if (!AddRepeatedCharactersPasswordValidatorRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddRepeatedCharactersPasswordValidatorRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddRepeatedCharactersPasswordValidatorRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddRepeatedCharactersPasswordValidatorRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddRepeatedCharactersPasswordValidatorRequest>() {
           @Override
           public void write(JsonWriter out, AddRepeatedCharactersPasswordValidatorRequest value) throws IOException {
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
           public AddRepeatedCharactersPasswordValidatorRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddRepeatedCharactersPasswordValidatorRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddRepeatedCharactersPasswordValidatorRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddRepeatedCharactersPasswordValidatorRequest
  * @throws IOException if the JSON string is invalid with respect to AddRepeatedCharactersPasswordValidatorRequest
  */
  public static AddRepeatedCharactersPasswordValidatorRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddRepeatedCharactersPasswordValidatorRequest.class);
  }

 /**
  * Convert an instance of AddRepeatedCharactersPasswordValidatorRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

