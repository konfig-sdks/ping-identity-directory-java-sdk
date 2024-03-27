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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Specifies the operation result code values that should cause the associated connection should be considered defunct. If an operation fails with one of these result codes, then it will be terminated and an attempt will be made to establish a new connection in its place.
 */
@JsonAdapter(EnumexternalServerDefunctConnectionResultCodeProp.Adapter.class)public enum EnumexternalServerDefunctConnectionResultCodeProp {
  
  SUCCESS("success"),
  
  OPERATIONS_ERROR("operations-error"),
  
  PROTOCOL_ERROR("protocol-error"),
  
  TIME_LIMIT_EXCEEDED("time-limit-exceeded"),
  
  SIZE_LIMIT_EXCEEDED("size-limit-exceeded"),
  
  COMPARE_FALSE("compare-false"),
  
  COMPARE_TRUE("compare-true"),
  
  AUTH_METHOD_NOT_SUPPORTED("auth-method-not-supported"),
  
  STRONG_AUTH_REQUIRED("strong-auth-required"),
  
  REFERRAL("referral"),
  
  ADMIN_LIMIT_EXCEEDED("admin-limit-exceeded"),
  
  UNAVAILABLE_CRITICAL_EXTENSION("unavailable-critical-extension"),
  
  CONFIDENTIALITY_REQUIRED("confidentiality-required"),
  
  SASL_BIND_IN_PROGRESS("sasl-bind-in-progress"),
  
  NO_SUCH_ATTRIBUTE("no-such-attribute"),
  
  UNDEFINED_ATTRIBUTE_TYPE("undefined-attribute-type"),
  
  INAPPROPRIATE_MATCHING("inappropriate-matching"),
  
  CONSTRAINT_VIOLATION("constraint-violation"),
  
  ATTRIBUTE_OR_VALUE_EXISTS("attribute-or-value-exists"),
  
  INVALID_ATTRIBUTE_SYNTAX("invalid-attribute-syntax"),
  
  NO_SUCH_OBJECT("no-such-object"),
  
  ALIAS_PROBLEM("alias-problem"),
  
  INVALID_DN_SYNTAX("invalid-dn-syntax"),
  
  ALIAS_DEREFERENCING_PROBLEM("alias-dereferencing-problem"),
  
  INAPPROPRIATE_AUTHENTICATION("inappropriate-authentication"),
  
  INVALID_CREDENTIALS("invalid-credentials"),
  
  INSUFFICIENT_ACCESS_RIGHTS("insufficient-access-rights"),
  
  BUSY("busy"),
  
  UNAVAILABLE("unavailable"),
  
  UNWILLING_TO_PERFORM("unwilling-to-perform"),
  
  LOOP_DETECT("loop-detect"),
  
  SORT_CONTROL_MISSING("sort-control-missing"),
  
  OFFSET_RANGE_ERROR("offset-range-error"),
  
  NAMING_VIOLATION("naming-violation"),
  
  OBJECT_CLASS_VIOLATION("object-class-violation"),
  
  NOT_ALLOWED_ON_NONLEAF("not-allowed-on-nonleaf"),
  
  NOT_ALLOWED_ON_RDN("not-allowed-on-rdn"),
  
  ENTRY_ALREADY_EXISTS("entry-already-exists"),
  
  OBJECT_CLASS_MODS_PROHIBITED("object-class-mods-prohibited"),
  
  AFFECTS_MULTIPLE_DSAS("affects-multiple-dsas"),
  
  VIRTUAL_LIST_VIEW_ERROR("virtual-list-view-error"),
  
  OTHER("other"),
  
  SERVER_DOWN("server-down"),
  
  LOCAL_ERROR("local-error"),
  
  ENCODING_ERROR("encoding-error"),
  
  DECODING_ERROR("decoding-error"),
  
  TIMEOUT("timeout"),
  
  AUTH_UNKNOWN("auth-unknown"),
  
  FILTER_ERROR("filter-error"),
  
  USER_CANCELED("user-canceled"),
  
  PARAM_ERROR("param-error"),
  
  NO_MEMORY("no-memory"),
  
  CONNECT_ERROR("connect-error"),
  
  NOT_SUPPORTED("not-supported"),
  
  CONTROL_NOT_FOUND("control-not-found"),
  
  NO_RESULTS_RETURNED("no-results-returned"),
  
  MORE_RESULTS_TO_RETURN("more-results-to-return"),
  
  CLIENT_LOOP("client-loop"),
  
  REFERRAL_LIMIT_EXCEEDED("referral-limit-exceeded"),
  
  CANCELED("canceled"),
  
  NO_SUCH_OPERATION("no-such-operation"),
  
  TOO_LATE("too-late"),
  
  CANNOT_CANCEL("cannot-cancel"),
  
  ASSERTION_FAILED("assertion-failed"),
  
  AUTHORIZATION_DENIED("authorization-denied"),
  
  NO_OPERATION("no-operation"),
  
  INTERACTIVE_TRANSACTION_ABORTED("interactive-transaction-aborted");

  private String value;

  EnumexternalServerDefunctConnectionResultCodeProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumexternalServerDefunctConnectionResultCodeProp fromValue(String value) {
    for (EnumexternalServerDefunctConnectionResultCodeProp b : EnumexternalServerDefunctConnectionResultCodeProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumexternalServerDefunctConnectionResultCodeProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumexternalServerDefunctConnectionResultCodeProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumexternalServerDefunctConnectionResultCodeProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumexternalServerDefunctConnectionResultCodeProp.fromValue(value);
    }
  }
}

