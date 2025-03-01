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
import com.konfigthis.client.model.EnumdelayRecurringTaskSchemaUrn;
import com.konfigthis.client.model.EnumrecurringTaskTaskReturnStateIfTimeoutIsEncounteredProp;
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
 * AddDelayRecurringTaskRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddDelayRecurringTaskRequest {
  public static final String SERIALIZED_NAME_TASK_NAME = "taskName";
  @SerializedName(SERIALIZED_NAME_TASK_NAME)
  private String taskName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumdelayRecurringTaskSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_SLEEP_DURATION = "sleepDuration";
  @SerializedName(SERIALIZED_NAME_SLEEP_DURATION)
  private String sleepDuration;

  public static final String SERIALIZED_NAME_DURATION_TO_WAIT_FOR_WORK_QUEUE_IDLE = "durationToWaitForWorkQueueIdle";
  @SerializedName(SERIALIZED_NAME_DURATION_TO_WAIT_FOR_WORK_QUEUE_IDLE)
  private String durationToWaitForWorkQueueIdle;

  public static final String SERIALIZED_NAME_LDAP_U_R_L_FOR_SEARCH_EXPECTED_TO_RETURN_ENTRIES = "ldapURLForSearchExpectedToReturnEntries";
  @SerializedName(SERIALIZED_NAME_LDAP_U_R_L_FOR_SEARCH_EXPECTED_TO_RETURN_ENTRIES)
  private List<String> ldapURLForSearchExpectedToReturnEntries = null;

  public static final String SERIALIZED_NAME_SEARCH_INTERVAL = "searchInterval";
  @SerializedName(SERIALIZED_NAME_SEARCH_INTERVAL)
  private String searchInterval;

  public static final String SERIALIZED_NAME_SEARCH_TIME_LIMIT = "searchTimeLimit";
  @SerializedName(SERIALIZED_NAME_SEARCH_TIME_LIMIT)
  private String searchTimeLimit;

  public static final String SERIALIZED_NAME_DURATION_TO_WAIT_FOR_SEARCH_TO_RETURN_ENTRIES = "durationToWaitForSearchToReturnEntries";
  @SerializedName(SERIALIZED_NAME_DURATION_TO_WAIT_FOR_SEARCH_TO_RETURN_ENTRIES)
  private String durationToWaitForSearchToReturnEntries;

  public static final String SERIALIZED_NAME_TASK_RETURN_STATE_IF_TIMEOUT_IS_ENCOUNTERED = "taskReturnStateIfTimeoutIsEncountered";
  @SerializedName(SERIALIZED_NAME_TASK_RETURN_STATE_IF_TIMEOUT_IS_ENCOUNTERED)
  private EnumrecurringTaskTaskReturnStateIfTimeoutIsEncounteredProp taskReturnStateIfTimeoutIsEncountered;

  public static final String SERIALIZED_NAME_CANCEL_ON_TASK_DEPENDENCY_FAILURE = "cancelOnTaskDependencyFailure";
  @SerializedName(SERIALIZED_NAME_CANCEL_ON_TASK_DEPENDENCY_FAILURE)
  private Boolean cancelOnTaskDependencyFailure;

  public static final String SERIALIZED_NAME_EMAIL_ON_START = "emailOnStart";
  @SerializedName(SERIALIZED_NAME_EMAIL_ON_START)
  private List<String> emailOnStart = null;

  public static final String SERIALIZED_NAME_EMAIL_ON_SUCCESS = "emailOnSuccess";
  @SerializedName(SERIALIZED_NAME_EMAIL_ON_SUCCESS)
  private List<String> emailOnSuccess = null;

  public static final String SERIALIZED_NAME_EMAIL_ON_FAILURE = "emailOnFailure";
  @SerializedName(SERIALIZED_NAME_EMAIL_ON_FAILURE)
  private List<String> emailOnFailure = null;

  public static final String SERIALIZED_NAME_ALERT_ON_START = "alertOnStart";
  @SerializedName(SERIALIZED_NAME_ALERT_ON_START)
  private Boolean alertOnStart;

  public static final String SERIALIZED_NAME_ALERT_ON_SUCCESS = "alertOnSuccess";
  @SerializedName(SERIALIZED_NAME_ALERT_ON_SUCCESS)
  private Boolean alertOnSuccess;

  public static final String SERIALIZED_NAME_ALERT_ON_FAILURE = "alertOnFailure";
  @SerializedName(SERIALIZED_NAME_ALERT_ON_FAILURE)
  private Boolean alertOnFailure;

  public AddDelayRecurringTaskRequest() {
  }

  public AddDelayRecurringTaskRequest taskName(String taskName) {
    
    
    
    
    this.taskName = taskName;
    return this;
  }

   /**
   * Name of the new Recurring Task
   * @return taskName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the new Recurring Task")

  public String getTaskName() {
    return taskName;
  }


  public void setTaskName(String taskName) {
    
    
    
    this.taskName = taskName;
  }


  public AddDelayRecurringTaskRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Recurring Task
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Recurring Task")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AddDelayRecurringTaskRequest schemas(List<EnumdelayRecurringTaskSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public AddDelayRecurringTaskRequest addSchemasItem(EnumdelayRecurringTaskSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumdelayRecurringTaskSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumdelayRecurringTaskSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public AddDelayRecurringTaskRequest sleepDuration(String sleepDuration) {
    
    
    
    
    this.sleepDuration = sleepDuration;
    return this;
  }

   /**
   * The length of time to sleep before the task completes.
   * @return sleepDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The length of time to sleep before the task completes.")

  public String getSleepDuration() {
    return sleepDuration;
  }


  public void setSleepDuration(String sleepDuration) {
    
    
    
    this.sleepDuration = sleepDuration;
  }


  public AddDelayRecurringTaskRequest durationToWaitForWorkQueueIdle(String durationToWaitForWorkQueueIdle) {
    
    
    
    
    this.durationToWaitForWorkQueueIdle = durationToWaitForWorkQueueIdle;
    return this;
  }

   /**
   * Indicates that task should wait for up to the specified length of time for the work queue to report that all worker threads are idle and there are no pending operations. Note that this primarily monitors operations that use worker threads, which does not include internal operations (for example, those invoked by extensions), and may not include requests from non-LDAP clients (for example, HTTP-based clients).
   * @return durationToWaitForWorkQueueIdle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates that task should wait for up to the specified length of time for the work queue to report that all worker threads are idle and there are no pending operations. Note that this primarily monitors operations that use worker threads, which does not include internal operations (for example, those invoked by extensions), and may not include requests from non-LDAP clients (for example, HTTP-based clients).")

  public String getDurationToWaitForWorkQueueIdle() {
    return durationToWaitForWorkQueueIdle;
  }


  public void setDurationToWaitForWorkQueueIdle(String durationToWaitForWorkQueueIdle) {
    
    
    
    this.durationToWaitForWorkQueueIdle = durationToWaitForWorkQueueIdle;
  }


  public AddDelayRecurringTaskRequest ldapURLForSearchExpectedToReturnEntries(List<String> ldapURLForSearchExpectedToReturnEntries) {
    
    
    
    
    this.ldapURLForSearchExpectedToReturnEntries = ldapURLForSearchExpectedToReturnEntries;
    return this;
  }

  public AddDelayRecurringTaskRequest addLdapURLForSearchExpectedToReturnEntriesItem(String ldapURLForSearchExpectedToReturnEntriesItem) {
    if (this.ldapURLForSearchExpectedToReturnEntries == null) {
      this.ldapURLForSearchExpectedToReturnEntries = new ArrayList<>();
    }
    this.ldapURLForSearchExpectedToReturnEntries.add(ldapURLForSearchExpectedToReturnEntriesItem);
    return this;
  }

   /**
   * An LDAP URL that provides the criteria for a search request that is expected to return at least one entry. The search will be performed internally, and only the base DN, scope, and filter from the URL will be used; any host, port, or requested attributes included in the URL will be ignored.
   * @return ldapURLForSearchExpectedToReturnEntries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An LDAP URL that provides the criteria for a search request that is expected to return at least one entry. The search will be performed internally, and only the base DN, scope, and filter from the URL will be used; any host, port, or requested attributes included in the URL will be ignored.")

  public List<String> getLdapURLForSearchExpectedToReturnEntries() {
    return ldapURLForSearchExpectedToReturnEntries;
  }


  public void setLdapURLForSearchExpectedToReturnEntries(List<String> ldapURLForSearchExpectedToReturnEntries) {
    
    
    
    this.ldapURLForSearchExpectedToReturnEntries = ldapURLForSearchExpectedToReturnEntries;
  }


  public AddDelayRecurringTaskRequest searchInterval(String searchInterval) {
    
    
    
    
    this.searchInterval = searchInterval;
    return this;
  }

   /**
   * The length of time the server should sleep between searches performed using the criteria from the ldap-url-for-search-expected-to-return-entries property.
   * @return searchInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The length of time the server should sleep between searches performed using the criteria from the ldap-url-for-search-expected-to-return-entries property.")

  public String getSearchInterval() {
    return searchInterval;
  }


  public void setSearchInterval(String searchInterval) {
    
    
    
    this.searchInterval = searchInterval;
  }


  public AddDelayRecurringTaskRequest searchTimeLimit(String searchTimeLimit) {
    
    
    
    
    this.searchTimeLimit = searchTimeLimit;
    return this;
  }

   /**
   * The length of time that the server will wait for a response to each internal search performed using the criteria from the ldap-url-for-search-expected-to-return-entries property.
   * @return searchTimeLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The length of time that the server will wait for a response to each internal search performed using the criteria from the ldap-url-for-search-expected-to-return-entries property.")

  public String getSearchTimeLimit() {
    return searchTimeLimit;
  }


  public void setSearchTimeLimit(String searchTimeLimit) {
    
    
    
    this.searchTimeLimit = searchTimeLimit;
  }


  public AddDelayRecurringTaskRequest durationToWaitForSearchToReturnEntries(String durationToWaitForSearchToReturnEntries) {
    
    
    
    
    this.durationToWaitForSearchToReturnEntries = durationToWaitForSearchToReturnEntries;
    return this;
  }

   /**
   * The maximum length of time that the server will continue to perform internal searches using the criteria from the ldap-url-for-search-expected-to-return-entries property.
   * @return durationToWaitForSearchToReturnEntries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum length of time that the server will continue to perform internal searches using the criteria from the ldap-url-for-search-expected-to-return-entries property.")

  public String getDurationToWaitForSearchToReturnEntries() {
    return durationToWaitForSearchToReturnEntries;
  }


  public void setDurationToWaitForSearchToReturnEntries(String durationToWaitForSearchToReturnEntries) {
    
    
    
    this.durationToWaitForSearchToReturnEntries = durationToWaitForSearchToReturnEntries;
  }


  public AddDelayRecurringTaskRequest taskReturnStateIfTimeoutIsEncountered(EnumrecurringTaskTaskReturnStateIfTimeoutIsEncounteredProp taskReturnStateIfTimeoutIsEncountered) {
    
    
    
    
    this.taskReturnStateIfTimeoutIsEncountered = taskReturnStateIfTimeoutIsEncountered;
    return this;
  }

   /**
   * Get taskReturnStateIfTimeoutIsEncountered
   * @return taskReturnStateIfTimeoutIsEncountered
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumrecurringTaskTaskReturnStateIfTimeoutIsEncounteredProp getTaskReturnStateIfTimeoutIsEncountered() {
    return taskReturnStateIfTimeoutIsEncountered;
  }


  public void setTaskReturnStateIfTimeoutIsEncountered(EnumrecurringTaskTaskReturnStateIfTimeoutIsEncounteredProp taskReturnStateIfTimeoutIsEncountered) {
    
    
    
    this.taskReturnStateIfTimeoutIsEncountered = taskReturnStateIfTimeoutIsEncountered;
  }


  public AddDelayRecurringTaskRequest cancelOnTaskDependencyFailure(Boolean cancelOnTaskDependencyFailure) {
    
    
    
    
    this.cancelOnTaskDependencyFailure = cancelOnTaskDependencyFailure;
    return this;
  }

   /**
   * Indicates whether an instance of this Recurring Task should be canceled if the task immediately before it in the recurring task chain fails to complete successfully (including if it is canceled by an administrator before it starts or while it is running).
   * @return cancelOnTaskDependencyFailure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether an instance of this Recurring Task should be canceled if the task immediately before it in the recurring task chain fails to complete successfully (including if it is canceled by an administrator before it starts or while it is running).")

  public Boolean getCancelOnTaskDependencyFailure() {
    return cancelOnTaskDependencyFailure;
  }


  public void setCancelOnTaskDependencyFailure(Boolean cancelOnTaskDependencyFailure) {
    
    
    
    this.cancelOnTaskDependencyFailure = cancelOnTaskDependencyFailure;
  }


  public AddDelayRecurringTaskRequest emailOnStart(List<String> emailOnStart) {
    
    
    
    
    this.emailOnStart = emailOnStart;
    return this;
  }

  public AddDelayRecurringTaskRequest addEmailOnStartItem(String emailOnStartItem) {
    if (this.emailOnStart == null) {
      this.emailOnStart = new ArrayList<>();
    }
    this.emailOnStart.add(emailOnStartItem);
    return this;
  }

   /**
   * The email addresses to which a message should be sent whenever an instance of this Recurring Task starts running. If this option is used, then at least one smtp-server must be configured in the global configuration.
   * @return emailOnStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email addresses to which a message should be sent whenever an instance of this Recurring Task starts running. If this option is used, then at least one smtp-server must be configured in the global configuration.")

  public List<String> getEmailOnStart() {
    return emailOnStart;
  }


  public void setEmailOnStart(List<String> emailOnStart) {
    
    
    
    this.emailOnStart = emailOnStart;
  }


  public AddDelayRecurringTaskRequest emailOnSuccess(List<String> emailOnSuccess) {
    
    
    
    
    this.emailOnSuccess = emailOnSuccess;
    return this;
  }

  public AddDelayRecurringTaskRequest addEmailOnSuccessItem(String emailOnSuccessItem) {
    if (this.emailOnSuccess == null) {
      this.emailOnSuccess = new ArrayList<>();
    }
    this.emailOnSuccess.add(emailOnSuccessItem);
    return this;
  }

   /**
   * The email addresses to which a message should be sent whenever an instance of this Recurring Task completes successfully. If this option is used, then at least one smtp-server must be configured in the global configuration.
   * @return emailOnSuccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email addresses to which a message should be sent whenever an instance of this Recurring Task completes successfully. If this option is used, then at least one smtp-server must be configured in the global configuration.")

  public List<String> getEmailOnSuccess() {
    return emailOnSuccess;
  }


  public void setEmailOnSuccess(List<String> emailOnSuccess) {
    
    
    
    this.emailOnSuccess = emailOnSuccess;
  }


  public AddDelayRecurringTaskRequest emailOnFailure(List<String> emailOnFailure) {
    
    
    
    
    this.emailOnFailure = emailOnFailure;
    return this;
  }

  public AddDelayRecurringTaskRequest addEmailOnFailureItem(String emailOnFailureItem) {
    if (this.emailOnFailure == null) {
      this.emailOnFailure = new ArrayList<>();
    }
    this.emailOnFailure.add(emailOnFailureItem);
    return this;
  }

   /**
   * The email addresses to which a message should be sent if an instance of this Recurring Task fails to complete successfully. If this option is used, then at least one smtp-server must be configured in the global configuration.
   * @return emailOnFailure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email addresses to which a message should be sent if an instance of this Recurring Task fails to complete successfully. If this option is used, then at least one smtp-server must be configured in the global configuration.")

  public List<String> getEmailOnFailure() {
    return emailOnFailure;
  }


  public void setEmailOnFailure(List<String> emailOnFailure) {
    
    
    
    this.emailOnFailure = emailOnFailure;
  }


  public AddDelayRecurringTaskRequest alertOnStart(Boolean alertOnStart) {
    
    
    
    
    this.alertOnStart = alertOnStart;
    return this;
  }

   /**
   * Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task starts running.
   * @return alertOnStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task starts running.")

  public Boolean getAlertOnStart() {
    return alertOnStart;
  }


  public void setAlertOnStart(Boolean alertOnStart) {
    
    
    
    this.alertOnStart = alertOnStart;
  }


  public AddDelayRecurringTaskRequest alertOnSuccess(Boolean alertOnSuccess) {
    
    
    
    
    this.alertOnSuccess = alertOnSuccess;
    return this;
  }

   /**
   * Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task completes successfully.
   * @return alertOnSuccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task completes successfully.")

  public Boolean getAlertOnSuccess() {
    return alertOnSuccess;
  }


  public void setAlertOnSuccess(Boolean alertOnSuccess) {
    
    
    
    this.alertOnSuccess = alertOnSuccess;
  }


  public AddDelayRecurringTaskRequest alertOnFailure(Boolean alertOnFailure) {
    
    
    
    
    this.alertOnFailure = alertOnFailure;
    return this;
  }

   /**
   * Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task fails to complete successfully.
   * @return alertOnFailure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task fails to complete successfully.")

  public Boolean getAlertOnFailure() {
    return alertOnFailure;
  }


  public void setAlertOnFailure(Boolean alertOnFailure) {
    
    
    
    this.alertOnFailure = alertOnFailure;
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
   * @return the AddDelayRecurringTaskRequest instance itself
   */
  public AddDelayRecurringTaskRequest putAdditionalProperty(String key, Object value) {
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
    AddDelayRecurringTaskRequest addDelayRecurringTaskRequest = (AddDelayRecurringTaskRequest) o;
    return Objects.equals(this.taskName, addDelayRecurringTaskRequest.taskName) &&
        Objects.equals(this.description, addDelayRecurringTaskRequest.description) &&
        Objects.equals(this.schemas, addDelayRecurringTaskRequest.schemas) &&
        Objects.equals(this.sleepDuration, addDelayRecurringTaskRequest.sleepDuration) &&
        Objects.equals(this.durationToWaitForWorkQueueIdle, addDelayRecurringTaskRequest.durationToWaitForWorkQueueIdle) &&
        Objects.equals(this.ldapURLForSearchExpectedToReturnEntries, addDelayRecurringTaskRequest.ldapURLForSearchExpectedToReturnEntries) &&
        Objects.equals(this.searchInterval, addDelayRecurringTaskRequest.searchInterval) &&
        Objects.equals(this.searchTimeLimit, addDelayRecurringTaskRequest.searchTimeLimit) &&
        Objects.equals(this.durationToWaitForSearchToReturnEntries, addDelayRecurringTaskRequest.durationToWaitForSearchToReturnEntries) &&
        Objects.equals(this.taskReturnStateIfTimeoutIsEncountered, addDelayRecurringTaskRequest.taskReturnStateIfTimeoutIsEncountered) &&
        Objects.equals(this.cancelOnTaskDependencyFailure, addDelayRecurringTaskRequest.cancelOnTaskDependencyFailure) &&
        Objects.equals(this.emailOnStart, addDelayRecurringTaskRequest.emailOnStart) &&
        Objects.equals(this.emailOnSuccess, addDelayRecurringTaskRequest.emailOnSuccess) &&
        Objects.equals(this.emailOnFailure, addDelayRecurringTaskRequest.emailOnFailure) &&
        Objects.equals(this.alertOnStart, addDelayRecurringTaskRequest.alertOnStart) &&
        Objects.equals(this.alertOnSuccess, addDelayRecurringTaskRequest.alertOnSuccess) &&
        Objects.equals(this.alertOnFailure, addDelayRecurringTaskRequest.alertOnFailure)&&
        Objects.equals(this.additionalProperties, addDelayRecurringTaskRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskName, description, schemas, sleepDuration, durationToWaitForWorkQueueIdle, ldapURLForSearchExpectedToReturnEntries, searchInterval, searchTimeLimit, durationToWaitForSearchToReturnEntries, taskReturnStateIfTimeoutIsEncountered, cancelOnTaskDependencyFailure, emailOnStart, emailOnSuccess, emailOnFailure, alertOnStart, alertOnSuccess, alertOnFailure, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDelayRecurringTaskRequest {\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    sleepDuration: ").append(toIndentedString(sleepDuration)).append("\n");
    sb.append("    durationToWaitForWorkQueueIdle: ").append(toIndentedString(durationToWaitForWorkQueueIdle)).append("\n");
    sb.append("    ldapURLForSearchExpectedToReturnEntries: ").append(toIndentedString(ldapURLForSearchExpectedToReturnEntries)).append("\n");
    sb.append("    searchInterval: ").append(toIndentedString(searchInterval)).append("\n");
    sb.append("    searchTimeLimit: ").append(toIndentedString(searchTimeLimit)).append("\n");
    sb.append("    durationToWaitForSearchToReturnEntries: ").append(toIndentedString(durationToWaitForSearchToReturnEntries)).append("\n");
    sb.append("    taskReturnStateIfTimeoutIsEncountered: ").append(toIndentedString(taskReturnStateIfTimeoutIsEncountered)).append("\n");
    sb.append("    cancelOnTaskDependencyFailure: ").append(toIndentedString(cancelOnTaskDependencyFailure)).append("\n");
    sb.append("    emailOnStart: ").append(toIndentedString(emailOnStart)).append("\n");
    sb.append("    emailOnSuccess: ").append(toIndentedString(emailOnSuccess)).append("\n");
    sb.append("    emailOnFailure: ").append(toIndentedString(emailOnFailure)).append("\n");
    sb.append("    alertOnStart: ").append(toIndentedString(alertOnStart)).append("\n");
    sb.append("    alertOnSuccess: ").append(toIndentedString(alertOnSuccess)).append("\n");
    sb.append("    alertOnFailure: ").append(toIndentedString(alertOnFailure)).append("\n");
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
    openapiFields.add("taskName");
    openapiFields.add("description");
    openapiFields.add("schemas");
    openapiFields.add("sleepDuration");
    openapiFields.add("durationToWaitForWorkQueueIdle");
    openapiFields.add("ldapURLForSearchExpectedToReturnEntries");
    openapiFields.add("searchInterval");
    openapiFields.add("searchTimeLimit");
    openapiFields.add("durationToWaitForSearchToReturnEntries");
    openapiFields.add("taskReturnStateIfTimeoutIsEncountered");
    openapiFields.add("cancelOnTaskDependencyFailure");
    openapiFields.add("emailOnStart");
    openapiFields.add("emailOnSuccess");
    openapiFields.add("emailOnFailure");
    openapiFields.add("alertOnStart");
    openapiFields.add("alertOnSuccess");
    openapiFields.add("alertOnFailure");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("taskName");
    openapiRequiredFields.add("schemas");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddDelayRecurringTaskRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddDelayRecurringTaskRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddDelayRecurringTaskRequest is not found in the empty JSON string", AddDelayRecurringTaskRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddDelayRecurringTaskRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("taskName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taskName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taskName").toString()));
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
      if ((jsonObj.get("sleepDuration") != null && !jsonObj.get("sleepDuration").isJsonNull()) && !jsonObj.get("sleepDuration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sleepDuration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sleepDuration").toString()));
      }
      if ((jsonObj.get("durationToWaitForWorkQueueIdle") != null && !jsonObj.get("durationToWaitForWorkQueueIdle").isJsonNull()) && !jsonObj.get("durationToWaitForWorkQueueIdle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `durationToWaitForWorkQueueIdle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("durationToWaitForWorkQueueIdle").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ldapURLForSearchExpectedToReturnEntries") != null && !jsonObj.get("ldapURLForSearchExpectedToReturnEntries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldapURLForSearchExpectedToReturnEntries` to be an array in the JSON string but got `%s`", jsonObj.get("ldapURLForSearchExpectedToReturnEntries").toString()));
      }
      if ((jsonObj.get("searchInterval") != null && !jsonObj.get("searchInterval").isJsonNull()) && !jsonObj.get("searchInterval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchInterval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchInterval").toString()));
      }
      if ((jsonObj.get("searchTimeLimit") != null && !jsonObj.get("searchTimeLimit").isJsonNull()) && !jsonObj.get("searchTimeLimit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchTimeLimit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchTimeLimit").toString()));
      }
      if ((jsonObj.get("durationToWaitForSearchToReturnEntries") != null && !jsonObj.get("durationToWaitForSearchToReturnEntries").isJsonNull()) && !jsonObj.get("durationToWaitForSearchToReturnEntries").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `durationToWaitForSearchToReturnEntries` to be a primitive type in the JSON string but got `%s`", jsonObj.get("durationToWaitForSearchToReturnEntries").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("emailOnStart") != null && !jsonObj.get("emailOnStart").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailOnStart` to be an array in the JSON string but got `%s`", jsonObj.get("emailOnStart").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("emailOnSuccess") != null && !jsonObj.get("emailOnSuccess").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailOnSuccess` to be an array in the JSON string but got `%s`", jsonObj.get("emailOnSuccess").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("emailOnFailure") != null && !jsonObj.get("emailOnFailure").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailOnFailure` to be an array in the JSON string but got `%s`", jsonObj.get("emailOnFailure").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddDelayRecurringTaskRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddDelayRecurringTaskRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddDelayRecurringTaskRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddDelayRecurringTaskRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddDelayRecurringTaskRequest>() {
           @Override
           public void write(JsonWriter out, AddDelayRecurringTaskRequest value) throws IOException {
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
           public AddDelayRecurringTaskRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddDelayRecurringTaskRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddDelayRecurringTaskRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddDelayRecurringTaskRequest
  * @throws IOException if the JSON string is invalid with respect to AddDelayRecurringTaskRequest
  */
  public static AddDelayRecurringTaskRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddDelayRecurringTaskRequest.class);
  }

 /**
  * Convert an instance of AddDelayRecurringTaskRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

