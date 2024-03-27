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
import com.konfigthis.client.model.EnumexactMatchIdentityMapperSchemaUrn;
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
 * ExactMatchIdentityMapperResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ExactMatchIdentityMapperResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumexactMatchIdentityMapperSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_MATCH_ATTRIBUTE = "matchAttribute";
  @SerializedName(SERIALIZED_NAME_MATCH_ATTRIBUTE)
  private List<String> matchAttribute = new ArrayList<>();

  public static final String SERIALIZED_NAME_MATCH_BASE_D_N = "matchBaseDN";
  @SerializedName(SERIALIZED_NAME_MATCH_BASE_D_N)
  private List<String> matchBaseDN = null;

  public static final String SERIALIZED_NAME_MATCH_FILTER = "matchFilter";
  @SerializedName(SERIALIZED_NAME_MATCH_FILTER)
  private String matchFilter;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private MetaMeta meta;

  public static final String SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20 = "urn:pingidentity:schemas:configuration:messages:2.0";
  @SerializedName(SERIALIZED_NAME_URN_COLON_PINGIDENTITY_COLON_SCHEMAS_COLON_CONFIGURATION_COLON_MESSAGES_COLON20)
  private MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20;

  public ExactMatchIdentityMapperResponse() {
  }

  public ExactMatchIdentityMapperResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Name of the Identity Mapper
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the Identity Mapper")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ExactMatchIdentityMapperResponse description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Identity Mapper
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Identity Mapper")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ExactMatchIdentityMapperResponse schemas(List<EnumexactMatchIdentityMapperSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public ExactMatchIdentityMapperResponse addSchemasItem(EnumexactMatchIdentityMapperSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumexactMatchIdentityMapperSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumexactMatchIdentityMapperSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public ExactMatchIdentityMapperResponse matchAttribute(List<String> matchAttribute) {
    
    
    
    
    this.matchAttribute = matchAttribute;
    return this;
  }

  public ExactMatchIdentityMapperResponse addMatchAttributeItem(String matchAttributeItem) {
    this.matchAttribute.add(matchAttributeItem);
    return this;
  }

   /**
   * Specifies the attribute whose value should exactly match the ID string provided to this identity mapper.
   * @return matchAttribute
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the attribute whose value should exactly match the ID string provided to this identity mapper.")

  public List<String> getMatchAttribute() {
    return matchAttribute;
  }


  public void setMatchAttribute(List<String> matchAttribute) {
    
    
    
    this.matchAttribute = matchAttribute;
  }


  public ExactMatchIdentityMapperResponse matchBaseDN(List<String> matchBaseDN) {
    
    
    
    
    this.matchBaseDN = matchBaseDN;
    return this;
  }

  public ExactMatchIdentityMapperResponse addMatchBaseDNItem(String matchBaseDNItem) {
    if (this.matchBaseDN == null) {
      this.matchBaseDN = new ArrayList<>();
    }
    this.matchBaseDN.add(matchBaseDNItem);
    return this;
  }

   /**
   * Specifies the set of base DNs below which to search for users.
   * @return matchBaseDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the set of base DNs below which to search for users.")

  public List<String> getMatchBaseDN() {
    return matchBaseDN;
  }


  public void setMatchBaseDN(List<String> matchBaseDN) {
    
    
    
    this.matchBaseDN = matchBaseDN;
  }


  public ExactMatchIdentityMapperResponse matchFilter(String matchFilter) {
    
    
    
    
    this.matchFilter = matchFilter;
    return this;
  }

   /**
   * An optional filter that mapped users must match.
   * @return matchFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional filter that mapped users must match.")

  public String getMatchFilter() {
    return matchFilter;
  }


  public void setMatchFilter(String matchFilter) {
    
    
    
    this.matchFilter = matchFilter;
  }


  public ExactMatchIdentityMapperResponse enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the Identity Mapper is enabled for use.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether the Identity Mapper is enabled for use.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public ExactMatchIdentityMapperResponse meta(MetaMeta meta) {
    
    
    
    
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


  public ExactMatchIdentityMapperResponse urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20(MetaUrnPingidentitySchemasConfigurationMessages20 urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20) {
    
    
    
    
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
   * @return the ExactMatchIdentityMapperResponse instance itself
   */
  public ExactMatchIdentityMapperResponse putAdditionalProperty(String key, Object value) {
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
    ExactMatchIdentityMapperResponse exactMatchIdentityMapperResponse = (ExactMatchIdentityMapperResponse) o;
    return Objects.equals(this.id, exactMatchIdentityMapperResponse.id) &&
        Objects.equals(this.description, exactMatchIdentityMapperResponse.description) &&
        Objects.equals(this.schemas, exactMatchIdentityMapperResponse.schemas) &&
        Objects.equals(this.matchAttribute, exactMatchIdentityMapperResponse.matchAttribute) &&
        Objects.equals(this.matchBaseDN, exactMatchIdentityMapperResponse.matchBaseDN) &&
        Objects.equals(this.matchFilter, exactMatchIdentityMapperResponse.matchFilter) &&
        Objects.equals(this.enabled, exactMatchIdentityMapperResponse.enabled) &&
        Objects.equals(this.meta, exactMatchIdentityMapperResponse.meta) &&
        Objects.equals(this.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, exactMatchIdentityMapperResponse.urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20)&&
        Objects.equals(this.additionalProperties, exactMatchIdentityMapperResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, schemas, matchAttribute, matchBaseDN, matchFilter, enabled, meta, urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExactMatchIdentityMapperResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    matchAttribute: ").append(toIndentedString(matchAttribute)).append("\n");
    sb.append("    matchBaseDN: ").append(toIndentedString(matchBaseDN)).append("\n");
    sb.append("    matchFilter: ").append(toIndentedString(matchFilter)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("matchAttribute");
    openapiFields.add("matchBaseDN");
    openapiFields.add("matchFilter");
    openapiFields.add("enabled");
    openapiFields.add("meta");
    openapiFields.add("urn:pingidentity:schemas:configuration:messages:2.0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("matchAttribute");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExactMatchIdentityMapperResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExactMatchIdentityMapperResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExactMatchIdentityMapperResponse is not found in the empty JSON string", ExactMatchIdentityMapperResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExactMatchIdentityMapperResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
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
      // ensure the required json array is present
      if (jsonObj.get("matchAttribute") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("matchAttribute").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchAttribute` to be an array in the JSON string but got `%s`", jsonObj.get("matchAttribute").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("matchBaseDN") != null && !jsonObj.get("matchBaseDN").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchBaseDN` to be an array in the JSON string but got `%s`", jsonObj.get("matchBaseDN").toString()));
      }
      if ((jsonObj.get("matchFilter") != null && !jsonObj.get("matchFilter").isJsonNull()) && !jsonObj.get("matchFilter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchFilter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matchFilter").toString()));
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
       if (!ExactMatchIdentityMapperResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExactMatchIdentityMapperResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExactMatchIdentityMapperResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExactMatchIdentityMapperResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ExactMatchIdentityMapperResponse>() {
           @Override
           public void write(JsonWriter out, ExactMatchIdentityMapperResponse value) throws IOException {
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
           public ExactMatchIdentityMapperResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExactMatchIdentityMapperResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExactMatchIdentityMapperResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExactMatchIdentityMapperResponse
  * @throws IOException if the JSON string is invalid with respect to ExactMatchIdentityMapperResponse
  */
  public static ExactMatchIdentityMapperResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExactMatchIdentityMapperResponse.class);
  }

 /**
  * Convert an instance of ExactMatchIdentityMapperResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

