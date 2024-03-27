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
import com.konfigthis.client.model.EnumldapPassThroughAuthenticationHandlerSchemaUrn;
import com.konfigthis.client.model.EnumpassThroughAuthenticationHandlerServerAccessModeProp;
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
 * LdapPassThroughAuthenticationHandlerShared
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LdapPassThroughAuthenticationHandlerShared {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<EnumldapPassThroughAuthenticationHandlerSchemaUrn> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private List<String> server = new ArrayList<>();

  public static final String SERIALIZED_NAME_SERVER_ACCESS_MODE = "serverAccessMode";
  @SerializedName(SERIALIZED_NAME_SERVER_ACCESS_MODE)
  private EnumpassThroughAuthenticationHandlerServerAccessModeProp serverAccessMode;

  public static final String SERIALIZED_NAME_DN_MAP = "dnMap";
  @SerializedName(SERIALIZED_NAME_DN_MAP)
  private List<String> dnMap = null;

  public static final String SERIALIZED_NAME_BIND_D_N_PATTERN = "bindDNPattern";
  @SerializedName(SERIALIZED_NAME_BIND_D_N_PATTERN)
  private String bindDNPattern;

  public static final String SERIALIZED_NAME_SEARCH_BASE_D_N = "searchBaseDN";
  @SerializedName(SERIALIZED_NAME_SEARCH_BASE_D_N)
  private String searchBaseDN;

  public static final String SERIALIZED_NAME_SEARCH_FILTER_PATTERN = "searchFilterPattern";
  @SerializedName(SERIALIZED_NAME_SEARCH_FILTER_PATTERN)
  private String searchFilterPattern;

  public static final String SERIALIZED_NAME_INITIAL_CONNECTIONS = "initialConnections";
  @SerializedName(SERIALIZED_NAME_INITIAL_CONNECTIONS)
  private Integer initialConnections;

  public static final String SERIALIZED_NAME_MAX_CONNECTIONS = "maxConnections";
  @SerializedName(SERIALIZED_NAME_MAX_CONNECTIONS)
  private Integer maxConnections;

  public static final String SERIALIZED_NAME_USE_LOCATION = "useLocation";
  @SerializedName(SERIALIZED_NAME_USE_LOCATION)
  private Boolean useLocation;

  public static final String SERIALIZED_NAME_MAXIMUM_ALLOWED_LOCAL_RESPONSE_TIME = "maximumAllowedLocalResponseTime";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_ALLOWED_LOCAL_RESPONSE_TIME)
  private String maximumAllowedLocalResponseTime;

  public static final String SERIALIZED_NAME_MAXIMUM_ALLOWED_NONLOCAL_RESPONSE_TIME = "maximumAllowedNonlocalResponseTime";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_ALLOWED_NONLOCAL_RESPONSE_TIME)
  private String maximumAllowedNonlocalResponseTime;

  public static final String SERIALIZED_NAME_USE_PASSWORD_POLICY_CONTROL = "usePasswordPolicyControl";
  @SerializedName(SERIALIZED_NAME_USE_PASSWORD_POLICY_CONTROL)
  private Boolean usePasswordPolicyControl;

  public static final String SERIALIZED_NAME_INCLUDED_LOCAL_ENTRY_BASE_D_N = "includedLocalEntryBaseDN";
  @SerializedName(SERIALIZED_NAME_INCLUDED_LOCAL_ENTRY_BASE_D_N)
  private List<String> includedLocalEntryBaseDN = null;

  public static final String SERIALIZED_NAME_CONNECTION_CRITERIA = "connectionCriteria";
  @SerializedName(SERIALIZED_NAME_CONNECTION_CRITERIA)
  private String connectionCriteria;

  public static final String SERIALIZED_NAME_REQUEST_CRITERIA = "requestCriteria";
  @SerializedName(SERIALIZED_NAME_REQUEST_CRITERIA)
  private String requestCriteria;

  public LdapPassThroughAuthenticationHandlerShared() {
  }

  public LdapPassThroughAuthenticationHandlerShared description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description for this Pass Through Authentication Handler
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this Pass Through Authentication Handler")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public LdapPassThroughAuthenticationHandlerShared schemas(List<EnumldapPassThroughAuthenticationHandlerSchemaUrn> schemas) {
    
    
    
    
    this.schemas = schemas;
    return this;
  }

  public LdapPassThroughAuthenticationHandlerShared addSchemasItem(EnumldapPassThroughAuthenticationHandlerSchemaUrn schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<EnumldapPassThroughAuthenticationHandlerSchemaUrn> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<EnumldapPassThroughAuthenticationHandlerSchemaUrn> schemas) {
    
    
    
    this.schemas = schemas;
  }


  public LdapPassThroughAuthenticationHandlerShared server(List<String> server) {
    
    
    
    
    this.server = server;
    return this;
  }

  public LdapPassThroughAuthenticationHandlerShared addServerItem(String serverItem) {
    this.server.add(serverItem);
    return this;
  }

   /**
   * Specifies the LDAP external server(s) to which authentication attempts should be forwarded.
   * @return server
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the LDAP external server(s) to which authentication attempts should be forwarded.")

  public List<String> getServer() {
    return server;
  }


  public void setServer(List<String> server) {
    
    
    
    this.server = server;
  }


  public LdapPassThroughAuthenticationHandlerShared serverAccessMode(EnumpassThroughAuthenticationHandlerServerAccessModeProp serverAccessMode) {
    
    
    
    
    this.serverAccessMode = serverAccessMode;
    return this;
  }

   /**
   * Get serverAccessMode
   * @return serverAccessMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumpassThroughAuthenticationHandlerServerAccessModeProp getServerAccessMode() {
    return serverAccessMode;
  }


  public void setServerAccessMode(EnumpassThroughAuthenticationHandlerServerAccessModeProp serverAccessMode) {
    
    
    
    this.serverAccessMode = serverAccessMode;
  }


  public LdapPassThroughAuthenticationHandlerShared dnMap(List<String> dnMap) {
    
    
    
    
    this.dnMap = dnMap;
    return this;
  }

  public LdapPassThroughAuthenticationHandlerShared addDnMapItem(String dnMapItem) {
    if (this.dnMap == null) {
      this.dnMap = new ArrayList<>();
    }
    this.dnMap.add(dnMapItem);
    return this;
  }

   /**
   * Specifies one or more DN mappings that may be used to transform bind DNs before attempting to bind to the external servers.
   * @return dnMap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies one or more DN mappings that may be used to transform bind DNs before attempting to bind to the external servers.")

  public List<String> getDnMap() {
    return dnMap;
  }


  public void setDnMap(List<String> dnMap) {
    
    
    
    this.dnMap = dnMap;
  }


  public LdapPassThroughAuthenticationHandlerShared bindDNPattern(String bindDNPattern) {
    
    
    
    
    this.bindDNPattern = bindDNPattern;
    return this;
  }

   /**
   * A pattern to use to construct the bind DN for the simple bind request to send to the remote server. This may consist of a combination of static text and attribute values and other directives enclosed in curly braces.  For example, the value \&quot;cn&#x3D;{cn},ou&#x3D;People,dc&#x3D;example,dc&#x3D;com\&quot; indicates that the remote bind DN should be constructed from the text \&quot;cn&#x3D;\&quot; followed by the value of the local entry&#39;s cn attribute followed by the text \&quot;ou&#x3D;People,dc&#x3D;example,dc&#x3D;com\&quot;. If an attribute contains the value to use as the bind DN for pass-through authentication, then the pattern may simply be the name of that attribute in curly braces (e.g., if the seeAlso attribute contains the bind DN for the target user, then a bind DN pattern of \&quot;{seeAlso}\&quot; would be appropriate).  Note that a bind DN pattern can be used to construct a bind DN that is not actually a valid LDAP distinguished name. For example, if authentication is being passed through to a Microsoft Active Directory server, then a bind DN pattern could be used to construct a user principal name (UPN) as an alternative to a distinguished name.
   * @return bindDNPattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A pattern to use to construct the bind DN for the simple bind request to send to the remote server. This may consist of a combination of static text and attribute values and other directives enclosed in curly braces.  For example, the value \"cn={cn},ou=People,dc=example,dc=com\" indicates that the remote bind DN should be constructed from the text \"cn=\" followed by the value of the local entry's cn attribute followed by the text \"ou=People,dc=example,dc=com\". If an attribute contains the value to use as the bind DN for pass-through authentication, then the pattern may simply be the name of that attribute in curly braces (e.g., if the seeAlso attribute contains the bind DN for the target user, then a bind DN pattern of \"{seeAlso}\" would be appropriate).  Note that a bind DN pattern can be used to construct a bind DN that is not actually a valid LDAP distinguished name. For example, if authentication is being passed through to a Microsoft Active Directory server, then a bind DN pattern could be used to construct a user principal name (UPN) as an alternative to a distinguished name.")

  public String getBindDNPattern() {
    return bindDNPattern;
  }


  public void setBindDNPattern(String bindDNPattern) {
    
    
    
    this.bindDNPattern = bindDNPattern;
  }


  public LdapPassThroughAuthenticationHandlerShared searchBaseDN(String searchBaseDN) {
    
    
    
    
    this.searchBaseDN = searchBaseDN;
    return this;
  }

   /**
   * The base DN to use when searching for the user entry using a filter constructed from the pattern defined in the search-filter-pattern property. If no base DN is specified, the null DN will be used as the search base DN.
   * @return searchBaseDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The base DN to use when searching for the user entry using a filter constructed from the pattern defined in the search-filter-pattern property. If no base DN is specified, the null DN will be used as the search base DN.")

  public String getSearchBaseDN() {
    return searchBaseDN;
  }


  public void setSearchBaseDN(String searchBaseDN) {
    
    
    
    this.searchBaseDN = searchBaseDN;
  }


  public LdapPassThroughAuthenticationHandlerShared searchFilterPattern(String searchFilterPattern) {
    
    
    
    
    this.searchFilterPattern = searchFilterPattern;
    return this;
  }

   /**
   * A pattern to use to construct a filter to use when searching an external server for the entry of the user as whom to bind. For example, \&quot;(mail&#x3D;{uid:ldapFilterEscape}@example.com)\&quot; would construct a search filter to search for a user whose entry in the local server contains a uid attribute whose value appears before \&quot;@example.com\&quot; in the mail attribute in the external server. Note that the \&quot;ldapFilterEscape\&quot; modifier should almost always be used with attributes specified in the pattern.
   * @return searchFilterPattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A pattern to use to construct a filter to use when searching an external server for the entry of the user as whom to bind. For example, \"(mail={uid:ldapFilterEscape}@example.com)\" would construct a search filter to search for a user whose entry in the local server contains a uid attribute whose value appears before \"@example.com\" in the mail attribute in the external server. Note that the \"ldapFilterEscape\" modifier should almost always be used with attributes specified in the pattern.")

  public String getSearchFilterPattern() {
    return searchFilterPattern;
  }


  public void setSearchFilterPattern(String searchFilterPattern) {
    
    
    
    this.searchFilterPattern = searchFilterPattern;
  }


  public LdapPassThroughAuthenticationHandlerShared initialConnections(Integer initialConnections) {
    
    
    
    
    this.initialConnections = initialConnections;
    return this;
  }

   /**
   * Specifies the initial number of connections to establish to each external server against which authentication may be attempted.
   * @return initialConnections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the initial number of connections to establish to each external server against which authentication may be attempted.")

  public Integer getInitialConnections() {
    return initialConnections;
  }


  public void setInitialConnections(Integer initialConnections) {
    
    
    
    this.initialConnections = initialConnections;
  }


  public LdapPassThroughAuthenticationHandlerShared maxConnections(Integer maxConnections) {
    
    
    
    
    this.maxConnections = maxConnections;
    return this;
  }

   /**
   * Specifies the maximum number of connections to maintain to each external server against which authentication may be attempted. This value must be greater than or equal to the value for the initial-connections property.
   * @return maxConnections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the maximum number of connections to maintain to each external server against which authentication may be attempted. This value must be greater than or equal to the value for the initial-connections property.")

  public Integer getMaxConnections() {
    return maxConnections;
  }


  public void setMaxConnections(Integer maxConnections) {
    
    
    
    this.maxConnections = maxConnections;
  }


  public LdapPassThroughAuthenticationHandlerShared useLocation(Boolean useLocation) {
    
    
    
    
    this.useLocation = useLocation;
    return this;
  }

   /**
   * Indicates whether to take server locations into account when prioritizing the servers to use for pass-through authentication attempts.
   * @return useLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether to take server locations into account when prioritizing the servers to use for pass-through authentication attempts.")

  public Boolean getUseLocation() {
    return useLocation;
  }


  public void setUseLocation(Boolean useLocation) {
    
    
    
    this.useLocation = useLocation;
  }


  public LdapPassThroughAuthenticationHandlerShared maximumAllowedLocalResponseTime(String maximumAllowedLocalResponseTime) {
    
    
    
    
    this.maximumAllowedLocalResponseTime = maximumAllowedLocalResponseTime;
    return this;
  }

   /**
   * The maximum length of time to wait for a response from an external server in the same location as this Directory Server before considering it unavailable.
   * @return maximumAllowedLocalResponseTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum length of time to wait for a response from an external server in the same location as this Directory Server before considering it unavailable.")

  public String getMaximumAllowedLocalResponseTime() {
    return maximumAllowedLocalResponseTime;
  }


  public void setMaximumAllowedLocalResponseTime(String maximumAllowedLocalResponseTime) {
    
    
    
    this.maximumAllowedLocalResponseTime = maximumAllowedLocalResponseTime;
  }


  public LdapPassThroughAuthenticationHandlerShared maximumAllowedNonlocalResponseTime(String maximumAllowedNonlocalResponseTime) {
    
    
    
    
    this.maximumAllowedNonlocalResponseTime = maximumAllowedNonlocalResponseTime;
    return this;
  }

   /**
   * The maximum length of time to wait for a response from an external server in a different location from this Directory Server before considering it unavailable.
   * @return maximumAllowedNonlocalResponseTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum length of time to wait for a response from an external server in a different location from this Directory Server before considering it unavailable.")

  public String getMaximumAllowedNonlocalResponseTime() {
    return maximumAllowedNonlocalResponseTime;
  }


  public void setMaximumAllowedNonlocalResponseTime(String maximumAllowedNonlocalResponseTime) {
    
    
    
    this.maximumAllowedNonlocalResponseTime = maximumAllowedNonlocalResponseTime;
  }


  public LdapPassThroughAuthenticationHandlerShared usePasswordPolicyControl(Boolean usePasswordPolicyControl) {
    
    
    
    
    this.usePasswordPolicyControl = usePasswordPolicyControl;
    return this;
  }

   /**
   * Indicates whether to include the password policy request control (as defined in draft-behera-ldap-password-policy-10) in bind requests sent to the external server.
   * @return usePasswordPolicyControl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether to include the password policy request control (as defined in draft-behera-ldap-password-policy-10) in bind requests sent to the external server.")

  public Boolean getUsePasswordPolicyControl() {
    return usePasswordPolicyControl;
  }


  public void setUsePasswordPolicyControl(Boolean usePasswordPolicyControl) {
    
    
    
    this.usePasswordPolicyControl = usePasswordPolicyControl;
  }


  public LdapPassThroughAuthenticationHandlerShared includedLocalEntryBaseDN(List<String> includedLocalEntryBaseDN) {
    
    
    
    
    this.includedLocalEntryBaseDN = includedLocalEntryBaseDN;
    return this;
  }

  public LdapPassThroughAuthenticationHandlerShared addIncludedLocalEntryBaseDNItem(String includedLocalEntryBaseDNItem) {
    if (this.includedLocalEntryBaseDN == null) {
      this.includedLocalEntryBaseDN = new ArrayList<>();
    }
    this.includedLocalEntryBaseDN.add(includedLocalEntryBaseDNItem);
    return this;
  }

   /**
   * The base DNs for the local users whose authentication attempts may be passed through to the external authentication service.
   * @return includedLocalEntryBaseDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The base DNs for the local users whose authentication attempts may be passed through to the external authentication service.")

  public List<String> getIncludedLocalEntryBaseDN() {
    return includedLocalEntryBaseDN;
  }


  public void setIncludedLocalEntryBaseDN(List<String> includedLocalEntryBaseDN) {
    
    
    
    this.includedLocalEntryBaseDN = includedLocalEntryBaseDN;
  }


  public LdapPassThroughAuthenticationHandlerShared connectionCriteria(String connectionCriteria) {
    
    
    
    
    this.connectionCriteria = connectionCriteria;
    return this;
  }

   /**
   * A reference to connection criteria that will be used to indicate which bind requests should be passed through to the external authentication service.
   * @return connectionCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to connection criteria that will be used to indicate which bind requests should be passed through to the external authentication service.")

  public String getConnectionCriteria() {
    return connectionCriteria;
  }


  public void setConnectionCriteria(String connectionCriteria) {
    
    
    
    this.connectionCriteria = connectionCriteria;
  }


  public LdapPassThroughAuthenticationHandlerShared requestCriteria(String requestCriteria) {
    
    
    
    
    this.requestCriteria = requestCriteria;
    return this;
  }

   /**
   * A reference to request criteria that will be used to indicate which bind requests should be passed through to the external authentication service.
   * @return requestCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to request criteria that will be used to indicate which bind requests should be passed through to the external authentication service.")

  public String getRequestCriteria() {
    return requestCriteria;
  }


  public void setRequestCriteria(String requestCriteria) {
    
    
    
    this.requestCriteria = requestCriteria;
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
   * @return the LdapPassThroughAuthenticationHandlerShared instance itself
   */
  public LdapPassThroughAuthenticationHandlerShared putAdditionalProperty(String key, Object value) {
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
    LdapPassThroughAuthenticationHandlerShared ldapPassThroughAuthenticationHandlerShared = (LdapPassThroughAuthenticationHandlerShared) o;
    return Objects.equals(this.description, ldapPassThroughAuthenticationHandlerShared.description) &&
        Objects.equals(this.schemas, ldapPassThroughAuthenticationHandlerShared.schemas) &&
        Objects.equals(this.server, ldapPassThroughAuthenticationHandlerShared.server) &&
        Objects.equals(this.serverAccessMode, ldapPassThroughAuthenticationHandlerShared.serverAccessMode) &&
        Objects.equals(this.dnMap, ldapPassThroughAuthenticationHandlerShared.dnMap) &&
        Objects.equals(this.bindDNPattern, ldapPassThroughAuthenticationHandlerShared.bindDNPattern) &&
        Objects.equals(this.searchBaseDN, ldapPassThroughAuthenticationHandlerShared.searchBaseDN) &&
        Objects.equals(this.searchFilterPattern, ldapPassThroughAuthenticationHandlerShared.searchFilterPattern) &&
        Objects.equals(this.initialConnections, ldapPassThroughAuthenticationHandlerShared.initialConnections) &&
        Objects.equals(this.maxConnections, ldapPassThroughAuthenticationHandlerShared.maxConnections) &&
        Objects.equals(this.useLocation, ldapPassThroughAuthenticationHandlerShared.useLocation) &&
        Objects.equals(this.maximumAllowedLocalResponseTime, ldapPassThroughAuthenticationHandlerShared.maximumAllowedLocalResponseTime) &&
        Objects.equals(this.maximumAllowedNonlocalResponseTime, ldapPassThroughAuthenticationHandlerShared.maximumAllowedNonlocalResponseTime) &&
        Objects.equals(this.usePasswordPolicyControl, ldapPassThroughAuthenticationHandlerShared.usePasswordPolicyControl) &&
        Objects.equals(this.includedLocalEntryBaseDN, ldapPassThroughAuthenticationHandlerShared.includedLocalEntryBaseDN) &&
        Objects.equals(this.connectionCriteria, ldapPassThroughAuthenticationHandlerShared.connectionCriteria) &&
        Objects.equals(this.requestCriteria, ldapPassThroughAuthenticationHandlerShared.requestCriteria)&&
        Objects.equals(this.additionalProperties, ldapPassThroughAuthenticationHandlerShared.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, schemas, server, serverAccessMode, dnMap, bindDNPattern, searchBaseDN, searchFilterPattern, initialConnections, maxConnections, useLocation, maximumAllowedLocalResponseTime, maximumAllowedNonlocalResponseTime, usePasswordPolicyControl, includedLocalEntryBaseDN, connectionCriteria, requestCriteria, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LdapPassThroughAuthenticationHandlerShared {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    serverAccessMode: ").append(toIndentedString(serverAccessMode)).append("\n");
    sb.append("    dnMap: ").append(toIndentedString(dnMap)).append("\n");
    sb.append("    bindDNPattern: ").append(toIndentedString(bindDNPattern)).append("\n");
    sb.append("    searchBaseDN: ").append(toIndentedString(searchBaseDN)).append("\n");
    sb.append("    searchFilterPattern: ").append(toIndentedString(searchFilterPattern)).append("\n");
    sb.append("    initialConnections: ").append(toIndentedString(initialConnections)).append("\n");
    sb.append("    maxConnections: ").append(toIndentedString(maxConnections)).append("\n");
    sb.append("    useLocation: ").append(toIndentedString(useLocation)).append("\n");
    sb.append("    maximumAllowedLocalResponseTime: ").append(toIndentedString(maximumAllowedLocalResponseTime)).append("\n");
    sb.append("    maximumAllowedNonlocalResponseTime: ").append(toIndentedString(maximumAllowedNonlocalResponseTime)).append("\n");
    sb.append("    usePasswordPolicyControl: ").append(toIndentedString(usePasswordPolicyControl)).append("\n");
    sb.append("    includedLocalEntryBaseDN: ").append(toIndentedString(includedLocalEntryBaseDN)).append("\n");
    sb.append("    connectionCriteria: ").append(toIndentedString(connectionCriteria)).append("\n");
    sb.append("    requestCriteria: ").append(toIndentedString(requestCriteria)).append("\n");
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
    openapiFields.add("server");
    openapiFields.add("serverAccessMode");
    openapiFields.add("dnMap");
    openapiFields.add("bindDNPattern");
    openapiFields.add("searchBaseDN");
    openapiFields.add("searchFilterPattern");
    openapiFields.add("initialConnections");
    openapiFields.add("maxConnections");
    openapiFields.add("useLocation");
    openapiFields.add("maximumAllowedLocalResponseTime");
    openapiFields.add("maximumAllowedNonlocalResponseTime");
    openapiFields.add("usePasswordPolicyControl");
    openapiFields.add("includedLocalEntryBaseDN");
    openapiFields.add("connectionCriteria");
    openapiFields.add("requestCriteria");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("server");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LdapPassThroughAuthenticationHandlerShared
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LdapPassThroughAuthenticationHandlerShared.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LdapPassThroughAuthenticationHandlerShared is not found in the empty JSON string", LdapPassThroughAuthenticationHandlerShared.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LdapPassThroughAuthenticationHandlerShared.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
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
      if (jsonObj.get("server") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("server").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `server` to be an array in the JSON string but got `%s`", jsonObj.get("server").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dnMap") != null && !jsonObj.get("dnMap").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dnMap` to be an array in the JSON string but got `%s`", jsonObj.get("dnMap").toString()));
      }
      if ((jsonObj.get("bindDNPattern") != null && !jsonObj.get("bindDNPattern").isJsonNull()) && !jsonObj.get("bindDNPattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bindDNPattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bindDNPattern").toString()));
      }
      if ((jsonObj.get("searchBaseDN") != null && !jsonObj.get("searchBaseDN").isJsonNull()) && !jsonObj.get("searchBaseDN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchBaseDN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchBaseDN").toString()));
      }
      if ((jsonObj.get("searchFilterPattern") != null && !jsonObj.get("searchFilterPattern").isJsonNull()) && !jsonObj.get("searchFilterPattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchFilterPattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchFilterPattern").toString()));
      }
      if ((jsonObj.get("maximumAllowedLocalResponseTime") != null && !jsonObj.get("maximumAllowedLocalResponseTime").isJsonNull()) && !jsonObj.get("maximumAllowedLocalResponseTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maximumAllowedLocalResponseTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maximumAllowedLocalResponseTime").toString()));
      }
      if ((jsonObj.get("maximumAllowedNonlocalResponseTime") != null && !jsonObj.get("maximumAllowedNonlocalResponseTime").isJsonNull()) && !jsonObj.get("maximumAllowedNonlocalResponseTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maximumAllowedNonlocalResponseTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maximumAllowedNonlocalResponseTime").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("includedLocalEntryBaseDN") != null && !jsonObj.get("includedLocalEntryBaseDN").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includedLocalEntryBaseDN` to be an array in the JSON string but got `%s`", jsonObj.get("includedLocalEntryBaseDN").toString()));
      }
      if ((jsonObj.get("connectionCriteria") != null && !jsonObj.get("connectionCriteria").isJsonNull()) && !jsonObj.get("connectionCriteria").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connectionCriteria` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connectionCriteria").toString()));
      }
      if ((jsonObj.get("requestCriteria") != null && !jsonObj.get("requestCriteria").isJsonNull()) && !jsonObj.get("requestCriteria").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestCriteria` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestCriteria").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LdapPassThroughAuthenticationHandlerShared.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LdapPassThroughAuthenticationHandlerShared' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LdapPassThroughAuthenticationHandlerShared> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LdapPassThroughAuthenticationHandlerShared.class));

       return (TypeAdapter<T>) new TypeAdapter<LdapPassThroughAuthenticationHandlerShared>() {
           @Override
           public void write(JsonWriter out, LdapPassThroughAuthenticationHandlerShared value) throws IOException {
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
           public LdapPassThroughAuthenticationHandlerShared read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LdapPassThroughAuthenticationHandlerShared instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LdapPassThroughAuthenticationHandlerShared given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LdapPassThroughAuthenticationHandlerShared
  * @throws IOException if the JSON string is invalid with respect to LdapPassThroughAuthenticationHandlerShared
  */
  public static LdapPassThroughAuthenticationHandlerShared fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LdapPassThroughAuthenticationHandlerShared.class);
  }

 /**
  * Convert an instance of LdapPassThroughAuthenticationHandlerShared to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

