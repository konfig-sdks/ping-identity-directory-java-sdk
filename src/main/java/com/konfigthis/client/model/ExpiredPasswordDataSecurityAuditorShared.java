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
import com.konfigthis.client.model.EnumdataSecurityAuditorAuditSeverityProp;
import com.konfigthis.client.model.EnumexpiredPasswordDataSecurityAuditorSchemaUrn;
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
 * ExpiredPasswordDataSecurityAuditorShared
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ExpiredPasswordDataSecurityAuditorShared {
  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumexpiredPasswordDataSecurityAuditorSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_REPORT_FILE = "reportFile";
  @SerializedName(SERIALIZED_NAME_REPORT_FILE)
  private String reportFile;

  public static final String SERIALIZED_NAME_INCLUDE_ATTRIBUTE = "includeAttribute";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ATTRIBUTE)
  private List<String> includeAttribute = null;

  public static final String SERIALIZED_NAME_PASSWORD_EVALUATION_AGE = "passwordEvaluationAge";
  @SerializedName(SERIALIZED_NAME_PASSWORD_EVALUATION_AGE)
  private String passwordEvaluationAge;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_AUDIT_BACKEND = "auditBackend";
  @SerializedName(SERIALIZED_NAME_AUDIT_BACKEND)
  private List<String> auditBackend = null;

  public static final String SERIALIZED_NAME_AUDIT_SEVERITY = "auditSeverity";
  @SerializedName(SERIALIZED_NAME_AUDIT_SEVERITY)
  private EnumdataSecurityAuditorAuditSeverityProp auditSeverity;

  public ExpiredPasswordDataSecurityAuditorShared() {
  }

  public ExpiredPasswordDataSecurityAuditorShared schemas(List<EnumexpiredPasswordDataSecurityAuditorSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public ExpiredPasswordDataSecurityAuditorShared addSchemasItem(EnumexpiredPasswordDataSecurityAuditorSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumexpiredPasswordDataSecurityAuditorSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumexpiredPasswordDataSecurityAuditorSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public ExpiredPasswordDataSecurityAuditorShared reportFile(String reportFile) {
    
    
    
    
    this.reportFile = reportFile;
    return this;
  }

   /**
   * Specifies the name of the detailed report file.
   * @return reportFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the name of the detailed report file.")

  public String getReportFile() {
    return reportFile;
  }


  public void setReportFile(String reportFile) {
    
    
    
    this.reportFile = reportFile;
  }


  public ExpiredPasswordDataSecurityAuditorShared includeAttribute(List<String> includeAttribute) {
    
    
    
    
    this.includeAttribute = includeAttribute;
    return this;
  }

  public ExpiredPasswordDataSecurityAuditorShared addIncludeAttributeItem(String includeAttributeItem) {
    if (this.includeAttribute == null) {
      this.includeAttribute = new ArrayList<>();
    }
    this.includeAttribute.add(includeAttributeItem);
    return this;
  }

   /**
   * Specifies the attributes from the audited entries that should be included detailed reports. By default, no attributes are included.
   * @return includeAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the attributes from the audited entries that should be included detailed reports. By default, no attributes are included.")

  public List<String> getIncludeAttribute() {
    return includeAttribute;
  }


  public void setIncludeAttribute(List<String> includeAttribute) {
    
    
    
    this.includeAttribute = includeAttribute;
  }


  public ExpiredPasswordDataSecurityAuditorShared passwordEvaluationAge(String passwordEvaluationAge) {
    
    
    
    
    this.passwordEvaluationAge = passwordEvaluationAge;
    return this;
  }

   /**
   * If set, the auditor will report all users with passwords older than the specified value even if password expiration is not enabled.
   * @return passwordEvaluationAge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, the auditor will report all users with passwords older than the specified value even if password expiration is not enabled.")

  public String getPasswordEvaluationAge() {
    return passwordEvaluationAge;
  }


  public void setPasswordEvaluationAge(String passwordEvaluationAge) {
    
    
    
    this.passwordEvaluationAge = passwordEvaluationAge;
  }


  public ExpiredPasswordDataSecurityAuditorShared enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the Data Security Auditor is enabled for use.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the Data Security Auditor is enabled for use.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public ExpiredPasswordDataSecurityAuditorShared auditBackend(List<String> auditBackend) {
    
    
    
    
    this.auditBackend = auditBackend;
    return this;
  }

  public ExpiredPasswordDataSecurityAuditorShared addAuditBackendItem(String auditBackendItem) {
    if (this.auditBackend == null) {
      this.auditBackend = new ArrayList<>();
    }
    this.auditBackend.add(auditBackendItem);
    return this;
  }

   /**
   * Specifies which backends the data security auditor may be applied to. By default, the data security auditors will audit entries in all backend types that support data auditing (Local DB, LDIF, and Config File Handler).
   * @return auditBackend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies which backends the data security auditor may be applied to. By default, the data security auditors will audit entries in all backend types that support data auditing (Local DB, LDIF, and Config File Handler).")

  public List<String> getAuditBackend() {
    return auditBackend;
  }


  public void setAuditBackend(List<String> auditBackend) {
    
    
    
    this.auditBackend = auditBackend;
  }


  public ExpiredPasswordDataSecurityAuditorShared auditSeverity(EnumdataSecurityAuditorAuditSeverityProp auditSeverity) {
    
    
    
    
    this.auditSeverity = auditSeverity;
    return this;
  }

   /**
   * Get auditSeverity
   * @return auditSeverity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumdataSecurityAuditorAuditSeverityProp getAuditSeverity() {
    return auditSeverity;
  }


  public void setAuditSeverity(EnumdataSecurityAuditorAuditSeverityProp auditSeverity) {
    
    
    
    this.auditSeverity = auditSeverity;
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
   * @return the ExpiredPasswordDataSecurityAuditorShared instance itself
   */
  public ExpiredPasswordDataSecurityAuditorShared putAdditionalProperty(String key, Object value) {
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
    ExpiredPasswordDataSecurityAuditorShared expiredPasswordDataSecurityAuditorShared = (ExpiredPasswordDataSecurityAuditorShared) o;
    return Objects.equals(this.schemas, expiredPasswordDataSecurityAuditorShared.schemas) &&
        Objects.equals(this.reportFile, expiredPasswordDataSecurityAuditorShared.reportFile) &&
        Objects.equals(this.includeAttribute, expiredPasswordDataSecurityAuditorShared.includeAttribute) &&
        Objects.equals(this.passwordEvaluationAge, expiredPasswordDataSecurityAuditorShared.passwordEvaluationAge) &&
        Objects.equals(this.enabled, expiredPasswordDataSecurityAuditorShared.enabled) &&
        Objects.equals(this.auditBackend, expiredPasswordDataSecurityAuditorShared.auditBackend) &&
        Objects.equals(this.auditSeverity, expiredPasswordDataSecurityAuditorShared.auditSeverity)&&
        Objects.equals(this.additionalProperties, expiredPasswordDataSecurityAuditorShared.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, reportFile, includeAttribute, passwordEvaluationAge, enabled, auditBackend, auditSeverity, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpiredPasswordDataSecurityAuditorShared {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    reportFile: ").append(toIndentedString(reportFile)).append("\n");
    sb.append("    includeAttribute: ").append(toIndentedString(includeAttribute)).append("\n");
    sb.append("    passwordEvaluationAge: ").append(toIndentedString(passwordEvaluationAge)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    auditBackend: ").append(toIndentedString(auditBackend)).append("\n");
    sb.append("    auditSeverity: ").append(toIndentedString(auditSeverity)).append("\n");
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
    openapiFields.add("reportFile");
    openapiFields.add("includeAttribute");
    openapiFields.add("passwordEvaluationAge");
    openapiFields.add("enabled");
    openapiFields.add("auditBackend");
    openapiFields.add("auditSeverity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemas");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExpiredPasswordDataSecurityAuditorShared
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExpiredPasswordDataSecurityAuditorShared.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExpiredPasswordDataSecurityAuditorShared is not found in the empty JSON string", ExpiredPasswordDataSecurityAuditorShared.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExpiredPasswordDataSecurityAuditorShared.openapiRequiredFields) {
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
      if ((jsonObj.get("reportFile") != null && !jsonObj.get("reportFile").isJsonNull()) && !jsonObj.get("reportFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportFile").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("includeAttribute") != null && !jsonObj.get("includeAttribute").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includeAttribute` to be an array in the JSON string but got `%s`", jsonObj.get("includeAttribute").toString()));
      }
      if ((jsonObj.get("passwordEvaluationAge") != null && !jsonObj.get("passwordEvaluationAge").isJsonNull()) && !jsonObj.get("passwordEvaluationAge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passwordEvaluationAge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passwordEvaluationAge").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("auditBackend") != null && !jsonObj.get("auditBackend").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `auditBackend` to be an array in the JSON string but got `%s`", jsonObj.get("auditBackend").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExpiredPasswordDataSecurityAuditorShared.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExpiredPasswordDataSecurityAuditorShared' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExpiredPasswordDataSecurityAuditorShared> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExpiredPasswordDataSecurityAuditorShared.class));

       return (TypeAdapter<T>) new TypeAdapter<ExpiredPasswordDataSecurityAuditorShared>() {
           @Override
           public void write(JsonWriter out, ExpiredPasswordDataSecurityAuditorShared value) throws IOException {
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
           public ExpiredPasswordDataSecurityAuditorShared read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExpiredPasswordDataSecurityAuditorShared instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExpiredPasswordDataSecurityAuditorShared given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExpiredPasswordDataSecurityAuditorShared
  * @throws IOException if the JSON string is invalid with respect to ExpiredPasswordDataSecurityAuditorShared
  */
  public static ExpiredPasswordDataSecurityAuditorShared fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExpiredPasswordDataSecurityAuditorShared.class);
  }

 /**
  * Convert an instance of ExpiredPasswordDataSecurityAuditorShared to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

