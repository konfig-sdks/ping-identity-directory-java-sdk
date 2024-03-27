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
import com.konfigthis.client.model.EnumthirdPartyAccessTokenValidatorSchemaUrn;
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
 * AddThirdPartyAccessTokenValidatorRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddThirdPartyAccessTokenValidatorRequest {
  public static final String SERIALIZED_NAME_VALIDATOR_NAME = "validatorName";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_NAME)
  private String validatorName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumthirdPartyAccessTokenValidatorSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXTENSION_CLASS = "extensionClass";
  @SerializedName(SERIALIZED_NAME_EXTENSION_CLASS)
  private String extensionClass;

  public static final String SERIALIZED_NAME_EXTENSION_ARGUMENT = "extensionArgument";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ARGUMENT)
  private List<String> extensionArgument = null;

  public static final String SERIALIZED_NAME_IDENTITY_MAPPER = "identityMapper";
  @SerializedName(SERIALIZED_NAME_IDENTITY_MAPPER)
  private String identityMapper;

  public static final String SERIALIZED_NAME_SUBJECT_CLAIM_NAME = "subjectClaimName";
  @SerializedName(SERIALIZED_NAME_SUBJECT_CLAIM_NAME)
  private String subjectClaimName;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_EVALUATION_ORDER_INDEX = "evaluationOrderIndex";
  @SerializedName(SERIALIZED_NAME_EVALUATION_ORDER_INDEX)
  private Integer evaluationOrderIndex;

  public AddThirdPartyAccessTokenValidatorRequest() {
  }

  public AddThirdPartyAccessTokenValidatorRequest validatorName(String validatorName) {
    
    
    
    
    this.validatorName = validatorName;
    return this;
  }

   /**
   * Name of the new Access Token Validator
   * @return validatorName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the new Access Token Validator")

  public String getValidatorName() {
    return validatorName;
  }


  public void setValidatorName(String validatorName) {
    
    
    
    this.validatorName = validatorName;
  }


  public AddThirdPartyAccessTokenValidatorRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Access Token Validator
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Access Token Validator")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AddThirdPartyAccessTokenValidatorRequest schemas(List<EnumthirdPartyAccessTokenValidatorSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddThirdPartyAccessTokenValidatorRequest addSchemasItem(EnumthirdPartyAccessTokenValidatorSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumthirdPartyAccessTokenValidatorSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumthirdPartyAccessTokenValidatorSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddThirdPartyAccessTokenValidatorRequest extensionClass(String extensionClass) {
    
    
    
    
    this.extensionClass = extensionClass;
    return this;
  }

   /**
   * The fully-qualified name of the Java class providing the logic for the Third Party Access Token Validator.
   * @return extensionClass
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The fully-qualified name of the Java class providing the logic for the Third Party Access Token Validator.")

  public String getExtensionClass() {
    return extensionClass;
  }


  public void setExtensionClass(String extensionClass) {
    
    
    
    this.extensionClass = extensionClass;
  }


  public AddThirdPartyAccessTokenValidatorRequest extensionArgument(List<String> extensionArgument) {
    
    
    
    
    this.extensionArgument = extensionArgument;
    return this;
  }

  public AddThirdPartyAccessTokenValidatorRequest addExtensionArgumentItem(String extensionArgumentItem) {
    if (this.extensionArgument == null) {
      this.extensionArgument = new ArrayList<>();
    }
    this.extensionArgument.add(extensionArgumentItem);
    return this;
  }

   /**
   * The set of arguments used to customize the behavior for the Third Party Access Token Validator. Each configuration property should be given in the form &#39;name&#x3D;value&#39;.
   * @return extensionArgument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The set of arguments used to customize the behavior for the Third Party Access Token Validator. Each configuration property should be given in the form 'name=value'.")

  public List<String> getExtensionArgument() {
    return extensionArgument;
  }


  public void setExtensionArgument(List<String> extensionArgument) {
    
    
    
    this.extensionArgument = extensionArgument;
  }


  public AddThirdPartyAccessTokenValidatorRequest identityMapper(String identityMapper) {
    
    
    
    
    this.identityMapper = identityMapper;
    return this;
  }

   /**
   * Specifies the name of the Identity Mapper that should be used for associating user entries with Bearer token subject names. The claim name from which to obtain the subject (i.e. the currently logged-in user) may be configured using the subject-claim-name property.
   * @return identityMapper
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the name of the Identity Mapper that should be used for associating user entries with Bearer token subject names. The claim name from which to obtain the subject (i.e. the currently logged-in user) may be configured using the subject-claim-name property.")

  public String getIdentityMapper() {
    return identityMapper;
  }


  public void setIdentityMapper(String identityMapper) {
    
    
    
    this.identityMapper = identityMapper;
  }


  public AddThirdPartyAccessTokenValidatorRequest subjectClaimName(String subjectClaimName) {
    
    
    
    
    this.subjectClaimName = subjectClaimName;
    return this;
  }

   /**
   * The name of the token claim that contains the subject, i.e. the logged-in user in an access token. This property goes hand-in-hand with the identity-mapper property and tells the Identity Mapper which field to use to look up the user entry on the server.
   * @return subjectClaimName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the token claim that contains the subject, i.e. the logged-in user in an access token. This property goes hand-in-hand with the identity-mapper property and tells the Identity Mapper which field to use to look up the user entry on the server.")

  public String getSubjectClaimName() {
    return subjectClaimName;
  }


  public void setSubjectClaimName(String subjectClaimName) {
    
    
    
    this.subjectClaimName = subjectClaimName;
  }


  public AddThirdPartyAccessTokenValidatorRequest enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether this Access Token Validator is enabled for use in Directory Server.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether this Access Token Validator is enabled for use in Directory Server.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public AddThirdPartyAccessTokenValidatorRequest evaluationOrderIndex(Integer evaluationOrderIndex) {
    
    
    
    
    this.evaluationOrderIndex = evaluationOrderIndex;
    return this;
  }

   /**
   * When multiple Access Token Validators are defined for a single Directory Server, this property determines the evaluation order for determining the correct validator class for an access token received by the Directory Server. Values of this property must be unique among all Access Token Validators defined within Directory Server but not necessarily contiguous. Access Token Validators with a smaller value will be evaluated first to determine if they are able to validate the access token.
   * @return evaluationOrderIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "When multiple Access Token Validators are defined for a single Directory Server, this property determines the evaluation order for determining the correct validator class for an access token received by the Directory Server. Values of this property must be unique among all Access Token Validators defined within Directory Server but not necessarily contiguous. Access Token Validators with a smaller value will be evaluated first to determine if they are able to validate the access token.")

  public Integer getEvaluationOrderIndex() {
    return evaluationOrderIndex;
  }


  public void setEvaluationOrderIndex(Integer evaluationOrderIndex) {
    
    
    
    this.evaluationOrderIndex = evaluationOrderIndex;
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
   * @return the AddThirdPartyAccessTokenValidatorRequest instance itself
   */
  public AddThirdPartyAccessTokenValidatorRequest putAdditionalProperty(String key, Object value) {
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
    AddThirdPartyAccessTokenValidatorRequest addThirdPartyAccessTokenValidatorRequest = (AddThirdPartyAccessTokenValidatorRequest) o;
    return Objects.equals(this.validatorName, addThirdPartyAccessTokenValidatorRequest.validatorName) &&
        Objects.equals(this.description, addThirdPartyAccessTokenValidatorRequest.description) &&
        Objects.equals(this.schemas, addThirdPartyAccessTokenValidatorRequest.schemas) &&
        Objects.equals(this.extensionClass, addThirdPartyAccessTokenValidatorRequest.extensionClass) &&
        Objects.equals(this.extensionArgument, addThirdPartyAccessTokenValidatorRequest.extensionArgument) &&
        Objects.equals(this.identityMapper, addThirdPartyAccessTokenValidatorRequest.identityMapper) &&
        Objects.equals(this.subjectClaimName, addThirdPartyAccessTokenValidatorRequest.subjectClaimName) &&
        Objects.equals(this.enabled, addThirdPartyAccessTokenValidatorRequest.enabled) &&
        Objects.equals(this.evaluationOrderIndex, addThirdPartyAccessTokenValidatorRequest.evaluationOrderIndex)&&
        Objects.equals(this.additionalProperties, addThirdPartyAccessTokenValidatorRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validatorName, description, schemas, extensionClass, extensionArgument, identityMapper, subjectClaimName, enabled, evaluationOrderIndex, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddThirdPartyAccessTokenValidatorRequest {\n");
    sb.append("    validatorName: ").append(toIndentedString(validatorName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    extensionClass: ").append(toIndentedString(extensionClass)).append("\n");
    sb.append("    extensionArgument: ").append(toIndentedString(extensionArgument)).append("\n");
    sb.append("    identityMapper: ").append(toIndentedString(identityMapper)).append("\n");
    sb.append("    subjectClaimName: ").append(toIndentedString(subjectClaimName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    evaluationOrderIndex: ").append(toIndentedString(evaluationOrderIndex)).append("\n");
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
    openapiFields.add("extensionClass");
    openapiFields.add("extensionArgument");
    openapiFields.add("identityMapper");
    openapiFields.add("subjectClaimName");
    openapiFields.add("enabled");
    openapiFields.add("evaluationOrderIndex");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("validatorName");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("extensionClass");
    openapiRequiredFields.add("enabled");
    openapiRequiredFields.add("evaluationOrderIndex");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddThirdPartyAccessTokenValidatorRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddThirdPartyAccessTokenValidatorRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddThirdPartyAccessTokenValidatorRequest is not found in the empty JSON string", AddThirdPartyAccessTokenValidatorRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddThirdPartyAccessTokenValidatorRequest.openapiRequiredFields) {
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
      if (!jsonObj.get("extensionClass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extensionClass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extensionClass").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("extensionArgument") != null && !jsonObj.get("extensionArgument").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `extensionArgument` to be an array in the JSON string but got `%s`", jsonObj.get("extensionArgument").toString()));
      }
      if ((jsonObj.get("identityMapper") != null && !jsonObj.get("identityMapper").isJsonNull()) && !jsonObj.get("identityMapper").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identityMapper` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identityMapper").toString()));
      }
      if ((jsonObj.get("subjectClaimName") != null && !jsonObj.get("subjectClaimName").isJsonNull()) && !jsonObj.get("subjectClaimName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subjectClaimName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subjectClaimName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddThirdPartyAccessTokenValidatorRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddThirdPartyAccessTokenValidatorRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddThirdPartyAccessTokenValidatorRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddThirdPartyAccessTokenValidatorRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddThirdPartyAccessTokenValidatorRequest>() {
           @Override
           public void write(JsonWriter out, AddThirdPartyAccessTokenValidatorRequest value) throws IOException {
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
           public AddThirdPartyAccessTokenValidatorRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddThirdPartyAccessTokenValidatorRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddThirdPartyAccessTokenValidatorRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddThirdPartyAccessTokenValidatorRequest
  * @throws IOException if the JSON string is invalid with respect to AddThirdPartyAccessTokenValidatorRequest
  */
  public static AddThirdPartyAccessTokenValidatorRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddThirdPartyAccessTokenValidatorRequest.class);
  }

 /**
  * Convert an instance of AddThirdPartyAccessTokenValidatorRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

