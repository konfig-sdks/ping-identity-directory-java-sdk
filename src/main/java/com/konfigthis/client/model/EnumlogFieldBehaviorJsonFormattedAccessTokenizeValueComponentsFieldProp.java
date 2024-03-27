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
 * The log fields whose values will include tokenized components.
 */
@JsonAdapter(EnumlogFieldBehaviorJsonFormattedAccessTokenizeValueComponentsFieldProp.Adapter.class)public enum EnumlogFieldBehaviorJsonFormattedAccessTokenizeValueComponentsFieldProp {
  
  ABANDON_MESSAGE_ID("abandon-message-id"),
  
  ADD_ATTRIBUTES("add-attributes"),
  
  ADD_ENTRY_DN("add-entry-dn"),
  
  ADD_UNDELETE_FROM_DN("add-undelete-from-dn"),
  
  ADDITIONAL_INFO("additional-info"),
  
  ADMINISTRATIVE_OPERATION("administrative-operation"),
  
  ASSURED_REPLICATION_REQUIREMENTS("assured-replication-requirements"),
  
  ASSURED_REPLICATION_REQUIREMENTS_ALTERED_BY_REQUEST_CONTROL("assured-replication-requirements-altered-by-request-control"),
  
  ASSURED_REPLICATION_REQUIREMENTS_LOCAL_ASSURANCE_LEVEL("assured-replication-requirements-local-assurance-level"),
  
  ASSURED_REPLICATION_REQUIREMENTS_REMOTE_ASSURANCE_LEVEL("assured-replication-requirements-remote-assurance-level"),
  
  ASSURED_REPLICATION_REQUIREMENTS_RESPONSE_DELAYED_BY_ASSURANCE("assured-replication-requirements-response-delayed-by-assurance"),
  
  ASSURED_REPLICATION_REQUIREMENTS_ASSURANCE_TIMEOUT_MILLIS("assured-replication-requirements-assurance-timeout-millis"),
  
  AUTHORIZATION_DN("authorization-dn"),
  
  AUTO_AUTHENTICATED_AS("auto-authenticated-as"),
  
  BIND_ACCESS_TOKEN_ORIGINAL_AUTHENTICATION_TYPE("bind-access-token-original-authentication-type"),
  
  BIND_AUTHENTICATION_DN("bind-authentication-dn"),
  
  BIND_AUTHENTICATION_FAILURE_REASON("bind-authentication-failure-reason"),
  
  BIND_AUTHENTICATION_FAILURE_REASON_ID("bind-authentication-failure-reason-id"),
  
  BIND_AUTHENTICATION_FAILURE_REASON_MESSAGE("bind-authentication-failure-reason-message"),
  
  BIND_AUTHENTICATION_FAILURE_REASON_NAME("bind-authentication-failure-reason-name"),
  
  BIND_AUTHENTICATION_TYPE("bind-authentication-type"),
  
  BIND_AUTHORIZATION_DN("bind-authorization-dn"),
  
  BIND_DN("bind-dn"),
  
  BIND_PROTOCOL_VERSION("bind-protocol-version"),
  
  BIND_RETIRED_PASSWORD_USED("bind-retired-password-used"),
  
  BIND_SASL_MECHANISM("bind-sasl-mechanism"),
  
  CHANGE_TO_SOFT_DELETED_ENTRY("change-to-soft-deleted-entry"),
  
  CIPHER("cipher"),
  
  CLIENT_CONNECTION_POLICY("client-connection-policy"),
  
  COLLECT_SUPPORT_DATA_COMMENT("collect-support-data-comment"),
  
  COLLECT_SUPPORT_DATA_ENCRYPTED("collect-support-data-encrypted"),
  
  COLLECT_SUPPORT_DATA_INCLUDE_BINARY_FILES("collect-support-data-include-binary-files"),
  
  COLLECT_SUPPORT_DATA_INCLUDE_EXPENSIVE_DATA("collect-support-data-include-expensive-data"),
  
  COLLECT_SUPPORT_DATA_INCLUDE_EXTENSION_SOURCE("collect-support-data-include-extension-source"),
  
  COLLECT_SUPPORT_DATA_INCLUDE_REPLICATION_STATE_DUMP("collect-support-data-include-replication-state-dump"),
  
  COLLECT_SUPPORT_DATA_JSTACK_COUNT("collect-support-data-jstack-count"),
  
  COLLECT_SUPPORT_DATA_LOG_DURATION("collect-support-data-log-duration"),
  
  COLLECT_SUPPORT_DATA_LOG_FILE_HEAD_COLLECTION_SIZE_KB("collect-support-data-log-file-head-collection-size-kb"),
  
  COLLECT_SUPPORT_DATA_LOG_FILE_TAIL_COLLECTION_SIZE_KB("collect-support-data-log-file-tail-collection-size-kb"),
  
  COLLECT_SUPPORT_DATA_LOG_TIME_WINDOW("collect-support-data-log-time-window"),
  
  COLLECT_SUPPORT_DATA_REPORT_COUNT("collect-support-data-report-count"),
  
  COLLECT_SUPPORT_DATA_REPORT_INTERVAL_SECONDS("collect-support-data-report-interval-seconds"),
  
  COLLECT_SUPPORT_DATA_SECURITY_LEVEL("collect-support-data-security-level"),
  
  COLLECT_SUPPORT_DATA_USE_SEQUENTIAL_MODE("collect-support-data-use-sequential-mode"),
  
  COMPARE_ASSERTION_VALUE("compare-assertion-value"),
  
  COMPARE_ATTRIBUTE_NAME("compare-attribute-name"),
  
  COMPARE_ENTRY_DN("compare-entry-dn"),
  
  CONNECT_FROM_ADDRESS("connect-from-address"),
  
  CONNECT_FROM_PORT("connect-from-port"),
  
  CONNECT_TO_ADDRESS("connect-to-address"),
  
  CONNECT_TO_PORT("connect-to-port"),
  
  CONNECTION_ID("connection-id"),
  
  DELETE_ENTRY_DN("delete-entry-dn"),
  
  DELETE_SOFT_DELETED_ENTRY_DN("delete-soft-deleted-entry-dn"),
  
  DELIVER_OTP_AUTHENTICATION_ID("deliver-otp-authentication-id"),
  
  DELIVER_OTP_PREFERRED_DELIVERY_MECHANISMS("deliver-otp-preferred-delivery-mechanisms"),
  
  DELIVER_PASSWORD_RESET_TOKEN_DN("deliver-password-reset-token-dn"),
  
  DELIVER_PASSWORD_RESET_TOKEN_PREFERRED_DELIVERY_MECHANISMS("deliver-password-reset-token-preferred-delivery-mechanisms"),
  
  DELIVER_PASSWORD_RESET_TOKEN_SUCCESSFUL_DELIVERY_MECHANISM("deliver-password-reset-token-successful-delivery-mechanism"),
  
  DELIVER_PASSWORD_RESET_TOKEN_UNSUCCESSFUL_DELIVERY_MECHANISMS("deliver-password-reset-token-unsuccessful-delivery-mechanisms"),
  
  DIAGNOSTIC_MESSAGE("diagnostic-message"),
  
  DISCONNECT_MESSAGE("disconnect-message"),
  
  DISCONNECT_REASON("disconnect-reason"),
  
  ENTRY_REBALANCING_ADMIN_ACTION_MESSAGE("entry-rebalancing-admin-action-message"),
  
  ENTRY_REBALANCING_BASE_DN("entry-rebalancing-base-dn"),
  
  ENTRY_REBALANCING_ENTRIES_ADDED_TO_TARGET("entry-rebalancing-entries-added-to-target"),
  
  ENTRY_REBALANCING_ENTRIES_DELETED_FROM_SOURCE("entry-rebalancing-entries-deleted-from-source"),
  
  ENTRY_REBALANCING_ENTRIES_READ_FROM_SOURCE("entry-rebalancing-entries-read-from-source"),
  
  ENTRY_REBALANCING_ERROR_MESSAGE("entry-rebalancing-error-message"),
  
  ENTRY_REBALANCING_OPERATION_ID("entry-rebalancing-operation-id"),
  
  ENTRY_REBALANCING_SIZE_LIMIT("entry-rebalancing-size-limit"),
  
  ENTRY_REBALANCING_SOURCE_BACKEND_SET("entry-rebalancing-source-backend-set"),
  
  ENTRY_REBALANCING_SOURCE_SERVER("entry-rebalancing-source-server"),
  
  ENTRY_REBALANCING_SOURCE_SERVER_ADDRESS("entry-rebalancing-source-server-address"),
  
  ENTRY_REBALANCING_SOURCE_SERVER_ALTERED("entry-rebalancing-source-server-altered"),
  
  ENTRY_REBALANCING_SOURCE_SERVER_PORT("entry-rebalancing-source-server-port"),
  
  ENTRY_REBALANCING_TARGET_BACKEND_SET("entry-rebalancing-target-backend-set"),
  
  ENTRY_REBALANCING_TARGET_SERVER("entry-rebalancing-target-server"),
  
  ENTRY_REBALANCING_TARGET_SERVER_ADDRESS("entry-rebalancing-target-server-address"),
  
  ENTRY_REBALANCING_TARGET_SERVER_ALTERED("entry-rebalancing-target-server-altered"),
  
  ENTRY_REBALANCING_TARGET_SERVER_PORT("entry-rebalancing-target-server-port"),
  
  EXPORT_REVERSIBLE_PASSWORDS_BACKEND_ID("export-reversible-passwords-backend-id"),
  
  EXPORT_REVERSIBLE_PASSWORDS_ENCRYPTION_SETTINGS_DEFINITION_ID("export-reversible-passwords-encryption-settings-definition-id"),
  
  EXPORT_REVERSIBLE_PASSWORDS_ENTRIES_EXCLUDED_NOT_MATCHING_FILTER("export-reversible-passwords-entries-excluded-not-matching-filter"),
  
  EXPORT_REVERSIBLE_PASSWORDS_ENTRIES_EXCLUDED_WITHOUT_PASSWORDS("export-reversible-passwords-entries-excluded-without-passwords"),
  
  EXPORT_REVERSIBLE_PASSWORDS_ENTRIES_EXPORTED_WITH_NON_REVERSIBLE_PASSWORDS("export-reversible-passwords-entries-exported-with-non-reversible-passwords"),
  
  EXPORT_REVERSIBLE_PASSWORDS_ENTRIES_EXPORTED_WITH_REVERSIBLE_PASSWORDS("export-reversible-passwords-entries-exported-with-reversible-passwords"),
  
  EXPORT_REVERSIBLE_PASSWORDS_ENTRIES_EXPORTED_WITHOUT_PASSWORDS("export-reversible-passwords-entries-exported-without-passwords"),
  
  EXPORT_REVERSIBLE_PASSWORDS_EXPORT_NON_REVERSIBLE_PASSWORDS("export-reversible-passwords-export-non-reversible-passwords"),
  
  EXPORT_REVERSIBLE_PASSWORDS_EXPORT_ONLY_ENTRIES_WITH_PASSWORDS("export-reversible-passwords-export-only-entries-with-passwords"),
  
  EXPORT_REVERSIBLE_PASSWORDS_FILTER("export-reversible-passwords-filter"),
  
  EXPORT_REVERSIBLE_PASSWORDS_INCLUDE_VIRTUAL_ATTRIBUTES("export-reversible-passwords-include-virtual-attributes"),
  
  EXPORT_REVERSIBLE_PASSWORDS_OUTPUT_FILE("export-reversible-passwords-output-file"),
  
  EXPORT_REVERSIBLE_PASSWORDS_TOTAL_ENTRIES_EXAMINED("export-reversible-passwords-total-entries-examined"),
  
  EXPORT_REVERSIBLE_PASSWORDS_TOTAL_ENTRIES_EXCLUDED("export-reversible-passwords-total-entries-excluded"),
  
  EXPORT_REVERSIBLE_PASSWORDS_TOTAL_ENTRIES_EXPORTED("export-reversible-passwords-total-entries-exported"),
  
  EXTENDED_REQUEST_OID("extended-request-oid"),
  
  EXTENDED_REQUEST_TYPE("extended-request-type"),
  
  EXTENDED_RESPONSE_OID("extended-response-oid"),
  
  EXTENDED_RESPONSE_TYPE("extended-response-type"),
  
  EXTERNALLY_PROCESSED_BIND_AUTHENTICATION_ID("externally-processed-bind-authentication-id"),
  
  EXTERNALLY_PROCESSED_BIND_AUTH_FAILURE_REASON("externally-processed-bind-auth-failure-reason"),
  
  EXTERNALLY_PROCESSED_BIND_END_CLIENT_IP_ADDRESS("externally-processed-bind-end-client-ip-address"),
  
  EXTERNALLY_PROCESSED_BIND_EXTERNAL_MECHANISM_NAME("externally-processed-bind-external-mechanism-name"),
  
  EXTERNALLY_PROCESSED_BIND_WAS_PASSWORD_BASED("externally-processed-bind-was-password-based"),
  
  EXTERNALLY_PROCESSED_BIND_WAS_SECURE("externally-processed-bind-was-secure"),
  
  EXTERNALLY_PROCESSED_BIND_WAS_SUCCESSFUL("externally-processed-bind-was-successful"),
  
  GENERATE_PASSWORD_NUM_PASSWORDS("generate-password-num-passwords"),
  
  GENERATE_PASSWORD_MAX_VALIDATION_ATTEMPTS("generate-password-max-validation-attempts"),
  
  GENERATE_PASSWORD_PASSWORD_GENERATOR("generate-password-password-generator"),
  
  GENERATE_PASSWORD_PASSWORD_POLICY("generate-password-password-policy"),
  
  GET_SUPPORTED_OTP_DELIVERY_MECHANISMS_DN("get-supported-otp-delivery-mechanisms-dn"),
  
  GSSAPI_BIND_QOP("gssapi-bind-qop"),
  
  GSSAPI_BIND_REQUESTED_AUTHENTICATION_ID("gssapi-bind-requested-authentication-id"),
  
  GSSAPI_BIND_REQUESTED_AUTHORIZATION_ID("gssapi-bind-requested-authorization-id"),
  
  INDEXES_WITH_KEYS_ACCESSED_EXCEEDING_ENTRY_LIMIT("indexes-with-keys-accessed-exceeding-entry-limit"),
  
  INDEXES_WITH_KEYS_ACCESSED_NEAR_ENTRY_LIMIT("indexes-with-keys-accessed-near-entry-limit"),
  
  INSTANCE_NAME("instance-name"),
  
  INTER_SERVER_BIND_CONNECTION_PRIVILEGES("inter-server-bind-connection-privileges"),
  
  INTER_SERVER_BIND_CONNECTION_PURPOSE("inter-server-bind-connection-purpose"),
  
  INTER_SERVER_BIND_SOURCE_CERTIFICATE_SUBJECT("inter-server-bind-source-certificate-subject"),
  
  INTER_SERVER_CONTROL_FORWARDED_CLIENT_CONNECTION_POLICY("inter-server-control-forwarded-client-connection-policy"),
  
  INTER_SERVER_REQUEST_CONTROLS("inter-server-request-controls"),
  
  INTER_SERVER_REQUEST_CONTROLS_COMPONENT_NAME("inter-server-request-controls-component-name"),
  
  INTER_SERVER_REQUEST_CONTROLS_OPERATION_PURPOSE("inter-server-request-controls-operation-purpose"),
  
  INTER_SERVER_REQUEST_CONTROLS_PROPERTIES("inter-server-request-controls-properties"),
  
  INTER_SERVER_REQUEST_CONTROLS_PROPERTIES_NAME("inter-server-request-controls-properties-name"),
  
  INTER_SERVER_REQUEST_CONTROLS_PROPERTIES_VALUE("inter-server-request-controls-properties-value"),
  
  INTERMEDIATE_CLIENT_REQUEST_CONTROL("intermediate-client-request-control"),
  
  INTERMEDIATE_CLIENT_REQUEST_CONTROL_CLIENT_IDENTITY("intermediate-client-request-control-client-identity"),
  
  INTERMEDIATE_CLIENT_REQUEST_CONTROL_CLIENT_NAME("intermediate-client-request-control-client-name"),
  
  INTERMEDIATE_CLIENT_REQUEST_CONTROL_DOWNSTREAM_CLIENT_ADDRESS("intermediate-client-request-control-downstream-client-address"),
  
  INTERMEDIATE_CLIENT_REQUEST_CONTROL_DOWNSTREAM_CLIENT_SECURE("intermediate-client-request-control-downstream-client-secure"),
  
  INTERMEDIATE_CLIENT_REQUEST_CONTROL_DOWNSTREAM_REQUEST("intermediate-client-request-control-downstream-request"),
  
  INTERMEDIATE_CLIENT_REQUEST_CONTROL_REQUEST_ID("intermediate-client-request-control-request-id"),
  
  INTERMEDIATE_CLIENT_REQUEST_CONTROL_SESSION_ID("intermediate-client-request-control-session-id"),
  
  INTERMEDIATE_CLIENT_RESPONSE_CONTROL("intermediate-client-response-control"),
  
  INTERMEDIATE_CLIENT_RESPONSE_CONTROL_RESPONSE_ID("intermediate-client-response-control-response-id"),
  
  INTERMEDIATE_CLIENT_RESPONSE_CONTROL_SERVER_NAME("intermediate-client-response-control-server-name"),
  
  INTERMEDIATE_CLIENT_RESPONSE_CONTROL_SESSION_ID("intermediate-client-response-control-session-id"),
  
  INTERMEDIATE_CLIENT_RESPONSE_CONTROL_UPSTREAM_RESPONSE("intermediate-client-response-control-upstream-response"),
  
  INTERMEDIATE_CLIENT_RESPONSE_CONTROL_UPSTREAM_SERVER_ADDRESS("intermediate-client-response-control-upstream-server-address"),
  
  INTERMEDIATE_CLIENT_RESPONSE_CONTROL_UPSTREAM_SERVER_SECURE("intermediate-client-response-control-upstream-server-secure"),
  
  INTERMEDIATE_RESPONSE_NAME("intermediate-response-name"),
  
  INTERMEDIATE_RESPONSE_OID("intermediate-response-oid"),
  
  INTERMEDIATE_RESPONSE_VALUE("intermediate-response-value"),
  
  INTERMEDIATE_RESPONSES_RETURNED("intermediate-responses-returned"),
  
  LDAP_CLIENT_DECODE_ERROR_MESSAGE("ldap-client-decode-error-message"),
  
  LOCAL_ASSURANCE_SATISFIED("local-assurance-satisfied"),
  
  LOG_TYPE("log-type"),
  
  MATCHED_DN("matched-dn"),
  
  MESSAGE_ID("message-id"),
  
  MESSAGE_TYPE("message-type"),
  
  MISSING_PRIVILEGES("missing-privileges"),
  
  MODDN_DELETE_OLD_RDN("moddn-delete-old-rdn"),
  
  MODDN_ENTRY_DN("moddn-entry-dn"),
  
  MODDN_NEW_RDN("moddn-new-rdn"),
  
  MODDN_NEW_SUPERIOR_DN("moddn-new-superior-dn"),
  
  MODIFY_ATTRIBUTES("modify-attributes"),
  
  MODIFY_ENTRY_DN("modify-entry-dn"),
  
  MULTI_UPDATE_CONNECTION_ID("multi-update-connection-id"),
  
  MULTI_UPDATE_FIRST_FAILED_OPERATION("multi-update-first-failed-operation"),
  
  MULTI_UPDATE_FIRST_FAILED_OPERATION_ERROR_MESSAGE("multi-update-first-failed-operation-error-message"),
  
  MULTI_UPDATE_FIRST_FAILED_OPERATION_RESULT_CODE("multi-update-first-failed-operation-result-code"),
  
  MULTI_UPDATE_OPERATION_ID("multi-update-operation-id"),
  
  NON_CRITICAL_JSON_FORMATTED_REQUEST_CONTROL_DECODE_ERRORS("non-critical-json-formatted-request-control-decode-errors"),
  
  NON_CRITICAL_REQUEST_CONTROLS_IGNORED_DUE_TO_ACL("non-critical-request-controls-ignored-due-to-acl"),
  
  OAUTHBEARER_BIND_ACCESS_TOKEN_CLIENT_ID("oauthbearer-bind-access-token-client-id"),
  
  OAUTHBEARER_BIND_ACCESS_TOKEN_EXPIRATION_TIME("oauthbearer-bind-access-token-expiration-time"),
  
  OAUTHBEARER_BIND_ACCESS_TOKEN_IDENTIFIER("oauthbearer-bind-access-token-identifier"),
  
  OAUTHBEARER_BIND_ACCESS_TOKEN_IDENTITY_MAPPER("oauthbearer-bind-access-token-identity-mapper"),
  
  OAUTHBEARER_BIND_ACCESS_TOKEN_IS_ACTIVE("oauthbearer-bind-access-token-is-active"),
  
  OAUTHBEARER_BIND_ACCESS_TOKEN_ISSUED_AT("oauthbearer-bind-access-token-issued-at"),
  
  OAUTHBEARER_BIND_ACCESS_TOKEN_ISSUER("oauthbearer-bind-access-token-issuer"),
  
  OAUTHBEARER_BIND_ACCESS_TOKEN_NOT_BEFORE("oauthbearer-bind-access-token-not-before"),
  
  OAUTHBEARER_BIND_ACCESS_TOKEN_OWNER("oauthbearer-bind-access-token-owner"),
  
  OAUTHBEARER_BIND_ACCESS_TOKEN_SCOPE("oauthbearer-bind-access-token-scope"),
  
  OAUTHBEARER_BIND_ACCESS_TOKEN_SUBJECT("oauthbearer-bind-access-token-subject"),
  
  OAUTHBEARER_BIND_ACCESS_TOKEN_TYPE("oauthbearer-bind-access-token-type"),
  
  OAUTHBEARER_BIND_ACCESS_TOKEN_USERNAME("oauthbearer-bind-access-token-username"),
  
  OAUTHBEARER_BIND_ACCESS_TOKEN_VALIDATOR("oauthbearer-bind-access-token-validator"),
  
  OAUTHBEARER_BIND_AUTHORIZATION_ERROR_CODE("oauthbearer-bind-authorization-error-code"),
  
  OAUTHBEARER_BIND_AUTHORIZATION_ID("oauthbearer-bind-authorization-id"),
  
  OAUTHBEARER_BIND_ID_TOKEN_CLIENT_ID("oauthbearer-bind-id-token-client-id"),
  
  OAUTHBEARER_BIND_ID_TOKEN_EXPIRATION_TIME("oauthbearer-bind-id-token-expiration-time"),
  
  OAUTHBEARER_BIND_ID_TOKEN_IDENTIFIER("oauthbearer-bind-id-token-identifier"),
  
  OAUTHBEARER_BIND_ID_TOKEN_IDENTITY_MAPPER("oauthbearer-bind-id-token-identity-mapper"),
  
  OAUTHBEARER_BIND_ID_TOKEN_IS_ACTIVE("oauthbearer-bind-id-token-is-active"),
  
  OAUTHBEARER_BIND_ID_TOKEN_ISSUED_AT("oauthbearer-bind-id-token-issued-at"),
  
  OAUTHBEARER_BIND_ID_TOKEN_ISSUER("oauthbearer-bind-id-token-issuer"),
  
  OAUTHBEARER_BIND_ID_TOKEN_NOT_BEFORE("oauthbearer-bind-id-token-not-before"),
  
  OAUTHBEARER_BIND_ID_TOKEN_OWNER("oauthbearer-bind-id-token-owner"),
  
  OAUTHBEARER_BIND_ID_TOKEN_SUBJECT("oauthbearer-bind-id-token-subject"),
  
  OAUTHBEARER_BIND_ID_TOKEN_TYPE("oauthbearer-bind-id-token-type"),
  
  OAUTHBEARER_BIND_ID_TOKEN_USERNAME("oauthbearer-bind-id-token-username"),
  
  OAUTHBEARER_BIND_ID_TOKEN_VALIDATOR("oauthbearer-bind-id-token-validator"),
  
  OPERATION_ID("operation-id"),
  
  OPERATION_OAUTH_SCOPES("operation-oauth-scopes"),
  
  OPERATION_PURPOSE("operation-purpose"),
  
  OPERATION_PURPOSE_APPLICATION_NAME("operation-purpose-application-name"),
  
  OPERATION_PURPOSE_APPLICATION_VERSION("operation-purpose-application-version"),
  
  OPERATION_PURPOSE_CODE_LOCATION("operation-purpose-code-location"),
  
  OPERATION_PURPOSE_REQUEST_PURPOSE("operation-purpose-request-purpose"),
  
  OPERATION_TYPE("operation-type"),
  
  ORIGIN("origin"),
  
  ORIGIN_DETAILS("origin-details"),
  
  ORIGIN_DETAILS_NAME("origin-details-name"),
  
  ORIGIN_DETAILS_VALUE("origin-details-value"),
  
  PASS_THROUGH_AUTHENTICATION_MAPPED_DN("pass-through-authentication-mapped-dn"),
  
  PASS_THROUGH_AUTHENTICATION_SUCCEEDED("pass-through-authentication-succeeded"),
  
  PASS_THROUGH_AUTHENTICATION_UPDATED_LOCAL_PASSWORD("pass-through-authentication-updated-local-password"),
  
  PASSWORD_MODIFY_GRACE_LOGIN_USED("password-modify-grace-login-used"),
  
  PASSWORD_MODIFY_TARGET_ENTRY("password-modify-target-entry"),
  
  PASSWORD_MODIFY_USED_PASSWORD_RESET_TOKEN("password-modify-used-password-reset-token"),
  
  PASSWORD_POLICY_STATE_ENTRY_DN("password-policy-state-entry-dn"),
  
  PASSWORD_UPDATE_BEHAVIOR_ALLOW_PRE_ENCODED_PASSWORD("password-update-behavior-allow-pre-encoded-password"),
  
  PASSWORD_UPDATE_BEHAVIOR_IGNORE_MINIMUM_PASSWORD_AGE("password-update-behavior-ignore-minimum-password-age"),
  
  PASSWORD_UPDATE_BEHAVIOR_IGNORE_PASSWORD_HISTORY("password-update-behavior-ignore-password-history"),
  
  PASSWORD_UPDATE_BEHAVIOR_IS_SELF_CHANGE("password-update-behavior-is-self-change"),
  
  PASSWORD_UPDATE_BEHAVIOR_MUST_CHANGE_PASSWORD("password-update-behavior-must-change-password"),
  
  PASSWORD_UPDATE_BEHAVIOR_PASSWORD_STORAGE_SCHEME("password-update-behavior-password-storage-scheme"),
  
  PASSWORD_UPDATE_BEHAVIOR_SKIP_PASSWORD_VALIDATION("password-update-behavior-skip-password-validation"),
  
  PEER_CERTIFICATE_CHAIN("peer-certificate-chain"),
  
  PEER_CERTIFICATE_CHAIN_CERTIFICATE_BYTES("peer-certificate-chain-certificate-bytes"),
  
  PEER_CERTIFICATE_CHAIN_CERTIFICATE_STRING("peer-certificate-chain-certificate-string"),
  
  PEER_CERTIFICATE_CHAIN_CERTIFICATE_TYPE("peer-certificate-chain-certificate-type"),
  
  PEER_CERTIFICATE_CHAIN_ISSUER_SUBJECT_DN("peer-certificate-chain-issuer-subject-dn"),
  
  PEER_CERTIFICATE_CHAIN_NOT_AFTER("peer-certificate-chain-not-after"),
  
  PEER_CERTIFICATE_CHAIN_NOT_BEFORE("peer-certificate-chain-not-before"),
  
  PEER_CERTIFICATE_CHAIN_SERIAL_NUMBER("peer-certificate-chain-serial-number"),
  
  PEER_CERTIFICATE_CHAIN_SIGNATURE_ALGORITHM("peer-certificate-chain-signature-algorithm"),
  
  PEER_CERTIFICATE_CHAIN_SIGNATURE_BYTES("peer-certificate-chain-signature-bytes"),
  
  PEER_CERTIFICATE_CHAIN_SUBJECT_DN("peer-certificate-chain-subject-dn"),
  
  PING_ONE_PASS_THROUGH_AUTHENTICATION_AUTH_FAILURE_REASON("ping-one-pass-through-authentication-auth-failure-reason"),
  
  PING_ONE_PASS_THROUGH_AUTHENTICATION_MAPPED_ID("ping-one-pass-through-authentication-mapped-id"),
  
  PING_ONE_PASS_THROUGH_AUTHENTICATION_UPDATED_LOCAL_USER_PASSWORD("ping-one-pass-through-authentication-updated-local-user-password"),
  
  PLUGGABLE_PASS_THROUGH_AUTHENTICATION_FAILURE_REASON("pluggable-pass-through-authentication-failure-reason"),
  
  PLUGGABLE_PASS_THROUGH_AUTHENTICATION_MAPPED_USER_IDENTIFIER("pluggable-pass-through-authentication-mapped-user-identifier"),
  
  PLUGGABLE_PASS_THROUGH_AUTHENTICATION_RESULT_CODE("pluggable-pass-through-authentication-result-code"),
  
  PLUGGABLE_PASS_THROUGH_AUTHENTICATION_UPDATED_LOCAL_USER_PASSWORD("pluggable-pass-through-authentication-updated-local-user-password"),
  
  PRE_AUTHORIZATION_USED_PRIVILEGES("pre-authorization-used-privileges"),
  
  PROCESSING_TIME_MILLIS("processing-time-millis"),
  
  PRODUCT_NAME("product-name"),
  
  PROTOCOL("protocol"),
  
  REFERRAL_URLS("referral-urls"),
  
  REMOTE_ASSURANCE_SATISFIED("remote-assurance-satisfied"),
  
  REPLACE_CERTIFICATE_CERTIFICATE_DECODE_ERROR("replace-certificate-certificate-decode-error"),
  
  REPLACE_CERTIFICATE_CERTIFICATE_SOURCE("replace-certificate-certificate-source"),
  
  REPLACE_CERTIFICATE_KEY_STORE_ERROR("replace-certificate-key-store-error"),
  
  REPLACE_CERTIFICATE_KEY_STORE_PATH("replace-certificate-key-store-path"),
  
  REPLACE_CERTIFICATE_PRIVATE_KEY_DECODE_ERROR("replace-certificate-private-key-decode-error"),
  
  REPLACE_CERTIFICATE_REQUEST_DECODE_ERROR("replace-certificate-request-decode-error"),
  
  REPLACE_CERTIFICATE_TOOL_ERROR("replace-certificate-tool-error"),
  
  REPLICATION_CHANGE_ID("replication-change-id"),
  
  REQUEST_CONTROL_OIDS("request-control-oids"),
  
  REQUESTER_DN("requester-dn"),
  
  REQUESTER_IP_ADDRESS("requester-ip-address"),
  
  RESPONSE_CONTROL_OIDS("response-control-oids"),
  
  RESULT_CODE_NAME("result-code-name"),
  
  RESULT_CODE_VALUE("result-code-value"),
  
  SEARCH_BASE_DN("search-base-dn"),
  
  SEARCH_DEREF_POLICY("search-deref-policy"),
  
  SEARCH_ENTRIES_RETURNED("search-entries-returned"),
  
  SEARCH_FILTER("search-filter"),
  
  SEARCH_INDEXED("search-indexed"),
  
  SEARCH_REQUESTED_ATTRIBUTES("search-requested-attributes"),
  
  SEARCH_RESULT_ENTRY_DN("search-result-entry-dn"),
  
  SEARCH_RESULT_ENTRY_ATTRIBUTES("search-result-entry-attributes"),
  
  SEARCH_SCOPE_NAME("search-scope-name"),
  
  SEARCH_SCOPE_VALUE("search-scope-value"),
  
  SEARCH_SIZE_LIMIT("search-size-limit"),
  
  SEARCH_TIME_LIMIT_SECONDS("search-time-limit-seconds"),
  
  SEARCH_TYPES_ONLY("search-types-only"),
  
  SECURITY_NEGOTIATION_PROPERTIES("security-negotiation-properties"),
  
  SECURITY_NEGOTIATION_PROPERTIES_NAME("security-negotiation-properties-name"),
  
  SECURITY_NEGOTIATION_PROPERTIES_VALUE("security-negotiation-properties-value"),
  
  SERVER_ASSURANCE_RESULTS("server-assurance-results"),
  
  SERVER_ASSURANCE_RESULTS_REPLICA_ID("server-assurance-results-replica-id"),
  
  SERVER_ASSURANCE_RESULTS_REPLICATION_SERVER_ID("server-assurance-results-replication-server-id"),
  
  SERVER_ASSURANCE_RESULTS_RESULT_CODE("server-assurance-results-result-code"),
  
  SERVERS_ACCESSED("servers-accessed"),
  
  SINGLE_USE_TOKEN_SUCCESSFUL_DELIVERY_MECHANISM("single-use-token-successful-delivery-mechanism"),
  
  SINGLE_USE_TOKEN_TOKEN_ID("single-use-token-token-id"),
  
  SINGLE_USE_TOKEN_UNSUCCESSFUL_DELIVERY_MECHANISMS("single-use-token-unsuccessful-delivery-mechanisms"),
  
  SINGLE_USE_TOKEN_USER_DN("single-use-token-user-dn"),
  
  STARTUP_ID("startup-id"),
  
  TARGET_HOST("target-host"),
  
  TARGET_PORT("target-port"),
  
  TARGET_PROTOCOL("target-protocol"),
  
  THREAD_ID("thread-id"),
  
  TIMESTAMP("timestamp"),
  
  TOTP_SHARED_SECRET_AUTHENTICATION_ID("totp-shared-secret-authentication-id"),
  
  TOTP_SHARED_SECRET_STATIC_PASSWORD_PROVIDED("totp-shared-secret-static-password-provided"),
  
  TRIGGERED_BY_CONNECTION_ID("triggered-by-connection-id"),
  
  TRIGGERED_BY_OPERATION_ID("triggered-by-operation-id"),
  
  UNCACHED_DATA_ACCESSED("uncached-data-accessed"),
  
  UNIQUENESS_REQUEST_CONTROL("uniqueness-request-control"),
  
  USED_PRIVILEGES("used-privileges"),
  
  USING_ADMIN_SESSION_WORKER_THREAD("using-admin-session-worker-thread"),
  
  WORK_QUEUE_WAIT_TIME_MILLIS("work-queue-wait-time-millis"),
  
  YUBIKEY_OTP_BIND_AUTHENTICATION_ID("yubikey-otp-bind-authentication-id"),
  
  YUBIKEY_OTP_BIND_AUTHORIZATION_ID("yubikey-otp-bind-authorization-id"),
  
  YUBIKEY_OTP_DEVICE_AUTHENTICATION_ID("yubikey-otp-device-authentication-id"),
  
  YUBIKEY_OTP_DEVICE_STATIC_PASSWORD_PROVIDED("yubikey-otp-device-static-password-provided"),
  
  YUBIKEY_OTP_DEVICE_YUBIKEY_PUBLIC_ID("yubikey-otp-device-yubikey-public-id");

  private String value;

  EnumlogFieldBehaviorJsonFormattedAccessTokenizeValueComponentsFieldProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumlogFieldBehaviorJsonFormattedAccessTokenizeValueComponentsFieldProp fromValue(String value) {
    for (EnumlogFieldBehaviorJsonFormattedAccessTokenizeValueComponentsFieldProp b : EnumlogFieldBehaviorJsonFormattedAccessTokenizeValueComponentsFieldProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumlogFieldBehaviorJsonFormattedAccessTokenizeValueComponentsFieldProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumlogFieldBehaviorJsonFormattedAccessTokenizeValueComponentsFieldProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumlogFieldBehaviorJsonFormattedAccessTokenizeValueComponentsFieldProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumlogFieldBehaviorJsonFormattedAccessTokenizeValueComponentsFieldProp.fromValue(value);
    }
  }
}

