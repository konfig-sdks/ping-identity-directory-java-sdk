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
 * Specifies the names of the alert types that should not be added to the backend. This can be used to suppress high volume alerts that might trigger hitting the max-alerts limit sooner than desired. Disabled alert types will not be sent out over persistent searches on this backend.
 */
@JsonAdapter(EnumbackendDisabledAlertTypeProp.Adapter.class)public enum EnumbackendDisabledAlertTypeProp {
  
  ACCESS_CONTROL_CHANGE("access-control-change"),
  
  ACCESS_CONTROL_DISABLED("access-control-disabled"),
  
  ACCESS_CONTROL_ENABLED("access-control-enabled"),
  
  ACCESS_CONTROL_PARSE_FAILURE("access-control-parse-failure"),
  
  ACCESS_LOG_CRITERIA_MATCHED("access-log-criteria-matched"),
  
  ALARM_CLEARED("alarm-cleared"),
  
  ALARM_CRITICAL("alarm-critical"),
  
  ALARM_MAJOR("alarm-major"),
  
  ALARM_MINOR("alarm-minor"),
  
  ALARM_WARNING("alarm-warning"),
  
  AMAZON_S3_CREATE_BUCKET_FAILED("amazon-s3-create-bucket-failed"),
  
  AMAZON_S3_DOWNLOAD_FILE_FAILED("amazon-s3-download-file-failed"),
  
  AMAZON_S3_REMOVE_BUCKET_FAILED("amazon-s3-remove-bucket-failed"),
  
  AMAZON_S3_REMOVE_FILE_FAILED("amazon-s3-remove-file-failed"),
  
  AMAZON_S3_UPLOAD_FILE_FAILED("amazon-s3-upload-file-failed"),
  
  BACKEND_DISABLED("backend-disabled"),
  
  BACKEND_INITIALIZATION_FAILED("backend-initialization-failed"),
  
  BACKUP_FAILED("backup-failed"),
  
  CANNOT_ACQUIRE_SHARED_BACKEND_LOCK("cannot-acquire-shared-backend-lock"),
  
  CANNOT_COPY_SCHEMA_FILES("cannot-copy-schema-files"),
  
  CANNOT_DECODE_ENTRY("cannot-decode-entry"),
  
  CANNOT_FIND_RECURRING_TASK("cannot-find-recurring-task"),
  
  CANNOT_REGISTER_BACKEND("cannot-register-backend"),
  
  CANNOT_RELEASE_SHARED_BACKEND_LOCK("cannot-release-shared-backend-lock"),
  
  CANNOT_RENAME_CURRENT_TASK_FILE("cannot-rename-current-task-file"),
  
  CANNOT_RENAME_NEW_TASK_FILE("cannot-rename-new-task-file"),
  
  CANNOT_RESTORE_BACKUP("cannot-restore-backup"),
  
  CANNOT_SCHEDULE_RECURRING_TASK_ITERATION("cannot-schedule-recurring-task-iteration"),
  
  CANNOT_WRITE_CONFIGURATION("cannot-write-configuration"),
  
  CANNOT_WRITE_NEW_SCHEMA_FILES("cannot-write-new-schema-files"),
  
  CANNOT_WRITE_SERVER_STATE_FILE("cannot-write-server-state-file"),
  
  CANNOT_WRITE_TASK_BACKING_FILE("cannot-write-task-backing-file"),
  
  CONFIG_CHANGE("config-change"),
  
  CONSOLE_LOGGER_WITHOUT_NO_DETACH("console-logger-without-no-detach"),
  
  CRYPTO_MANAGER_ERROR("crypto-manager-error"),
  
  CONTINUOUS_GARBAGE_COLLECTION_DETECTED("continuous-garbage-collection-detected"),
  
  DEADLOCK_DETECTED("deadlock-detected"),
  
  DEBUG_LOGGING_ENABLED("debug-logging-enabled"),
  
  DELEGATED_ADMIN_CONFIGURATION_ERRORS("delegated-admin-configuration-errors"),
  
  DUPLICATE_ALERTS_SUPPRESSED("duplicate-alerts-suppressed"),
  
  DUPLICATE_ERROR_ALERTS_SUPPRESSED("duplicate-error-alerts-suppressed"),
  
  DUPLICATE_FATAL_ALERTS_SUPPRESSED("duplicate-fatal-alerts-suppressed"),
  
  DUPLICATE_INFO_ALERTS_SUPPRESSED("duplicate-info-alerts-suppressed"),
  
  DUPLICATE_WARNING_ALERTS_SUPPRESSED("duplicate-warning-alerts-suppressed"),
  
  EMBEDDED_POSTGRESQL_UNAVAILABLE("embedded-postgresql-unavailable"),
  
  ENCRYPTION_SETTINGS_DATABASE_ACCESS_RESTORED("encryption-settings-database-access-restored"),
  
  ENCRYPTION_SETTINGS_DATABASE_INACCESSIBLE("encryption-settings-database-inaccessible"),
  
  ENCRYPTION_SETTINGS_DATABASE_PROLONGED_OUTAGE("encryption-settings-database-prolonged-outage"),
  
  ENTERING_LOCKDOWN_MODE("entering-lockdown-mode"),
  
  ENTRY_REFERENCES_REMOVED_ATTRIBUTE_TYPE("entry-references-removed-attribute-type"),
  
  EXEC_TASK_LAUNCHING_COMMAND("exec-task-launching-command"),
  
  EXPLODED_INDEX_BACKGROUND_DELETE_CLEANUP_FAILED("exploded-index-background-delete-cleanup-failed"),
  
  EXPLODED_INDEX_BACKGROUND_DELETE_FAILED("exploded-index-background-delete-failed"),
  
  EXTERNAL_CONFIG_FILE_EDIT_HANDLED("external-config-file-edit-handled"),
  
  EXTERNAL_CONFIG_FILE_EDIT_LOST("external-config-file-edit-lost"),
  
  EXTERNAL_SERVER_INITIALIZATION_FAILED("external-server-initialization-failed"),
  
  FAILED_TO_APPLY_MIRRORED_CONFIGURATION("failed-to-apply-mirrored-configuration"),
  
  FILE_RETENTION_TASK_DELETE_FAILURE("file-retention-task-delete-failure"),
  
  FORCE_GC_COMPLETE("force-gc-complete"),
  
  FORCE_GC_STARTING("force-gc-starting"),
  
  GLOBAL_INDEX_INSUFFICIENT_DISK_SPACE_ERROR("global-index-insufficient-disk-space-error"),
  
  GLOBAL_INDEX_PERSISTENCE_ERROR("global-index-persistence-error"),
  
  GLOBAL_INDEX_READ_ERROR("global-index-read-error"),
  
  GLOBAL_REFERENTIAL_INTEGRITY_UPDATE_FAILURE("global-referential-integrity-update-failure"),
  
  GLOBALLY_UNIQUE_ATTRIBUTE_CONFLICT("globally-unique-attribute-conflict"),
  
  HEALTH_CHECK_AVAILABLE_TO_DEGRADED("health-check-available-to-degraded"),
  
  HEALTH_CHECK_AVAILABLE_TO_UNAVAILABLE("health-check-available-to-unavailable"),
  
  HEALTH_CHECK_DEGRADED_TO_AVAILABLE("health-check-degraded-to-available"),
  
  HEALTH_CHECK_DEGRADED_TO_UNAVAILABLE("health-check-degraded-to-unavailable"),
  
  HEALTH_CHECK_UNAVAILABLE_TO_AVAILABLE("health-check-unavailable-to-available"),
  
  HEALTH_CHECK_UNAVAILABLE_TO_DEGRADED("health-check-unavailable-to-degraded"),
  
  HTTP_CONNECTION_HANDLER_DUPLICATE_CONTEXT_PATH("http-connection-handler-duplicate-context-path"),
  
  HTTP_CONNECTION_HANDLER_DUPLICATE_SERVLET_EXTENSION("http-connection-handler-duplicate-servlet-extension"),
  
  INDEX_CORRUPT("index-corrupt"),
  
  INDEX_DEGRADED("index-degraded"),
  
  INDEX_REBUILD_COMPLETED("index-rebuild-completed"),
  
  INDEX_REBUILD_IN_PROGRESS("index-rebuild-in-progress"),
  
  INSECURE_ACCESS_TOKEN_VALIDATOR_ENABLED("insecure-access-token-validator-enabled"),
  
  INVALID_PRIVILEGE("invalid-privilege"),
  
  JE_BACKGROUND_SYNC_FAILED("je-background-sync-failed"),
  
  JE_CLEANER_DISABLED("je-cleaner-disabled"),
  
  JE_DAEMON_THREAD_EXCEPTION("je-daemon-thread-exception"),
  
  JE_ENVIRONMENT_NOT_CLOSED_CLEANLY("je-environment-not-closed-cleanly"),
  
  JE_RECOVERY_REQUIRED("je-recovery-required"),
  
  JVM_MISCONFIGURATION("jvm-misconfiguration"),
  
  LARGE_ATTRIBUTE_UPDATE_FAILURE("large-attribute-update-failure"),
  
  LBA_NO_AVAILABLE_SERVERS("lba-no-available-servers"),
  
  LDAP_CONNECTION_HANDLER_CANNOT_LISTEN("ldap-connection-handler-cannot-listen"),
  
  LDAP_CONNECTION_HANDLER_CONSECUTIVE_FAILURES("ldap-connection-handler-consecutive-failures"),
  
  LDAP_CONNECTION_HANDLER_UNCAUGHT_ERROR("ldap-connection-handler-uncaught-error"),
  
  LDIF_BACKEND_CANNOT_WRITE("ldif-backend-cannot-write"),
  
  LDIF_CONNECTION_HANDLER_PARSE_ERROR("ldif-connection-handler-parse-error"),
  
  LDIF_CONNECTION_HANDLER_IO_ERROR("ldif-connection-handler-io-error"),
  
  LEAVING_LOCKDOWN_MODE("leaving-lockdown-mode"),
  
  LOG_FILE_ROTATION_LISTENER_INVOKE_ERROR("log-file-rotation-listener-invoke-error"),
  
  LOG_FILE_ROTATION_LISTENER_PROCESSING_TAKES_TOO_LONG("log-file-rotation-listener-processing-takes-too-long"),
  
  LOGGING_ERROR("logging-error"),
  
  LOW_DISK_SPACE_ERROR("low-disk-space-error"),
  
  LOW_DISK_SPACE_WARNING("low-disk-space-warning"),
  
  MIRRORED_SUBTREE_MANAGER_FORCED_AS_MASTER_ERROR("mirrored-subtree-manager-forced-as-master-error"),
  
  MIRRORED_SUBTREE_MANAGER_FORCED_AS_MASTER_WARNING("mirrored-subtree-manager-forced-as-master-warning"),
  
  MIRRORED_SUBTREE_MANAGER_NO_MASTER_FOUND("mirrored-subtree-manager-no-master-found"),
  
  MIRRORED_SUBTREE_SERVER_NOT_IN_TOPOLOGY("mirrored-subtree-server-not-in-topology"),
  
  MIRRORED_SUBTREE_MANAGER_OPERATION_ERROR("mirrored-subtree-manager-operation-error"),
  
  MIRRORED_SUBTREE_MANAGER_FAILED_OUTBOUND_CONNECTION("mirrored-subtree-manager-failed-outbound-connection"),
  
  MIRRORED_SUBTREE_MANAGER_CONNECTION_ASYMMETRY("mirrored-subtree-manager-connection-asymmetry"),
  
  MISSING_SCHEMA_ELEMENTS_REFERENCED_BY_BACKEND("missing-schema-elements-referenced-by-backend"),
  
  MONITORING_ENDPOINT_UNABLE_TO_CONNECT("monitoring-endpoint-unable-to-connect"),
  
  NO_ENABLED_ALERT_HANDLERS("no-enabled-alert-handlers"),
  
  OFFLINE_CONFIG_CHANGE_DETECTED("offline-config-change-detected"),
  
  OUT_OF_DISK_SPACE_ERROR("out-of-disk-space-error"),
  
  PDP_UNAVAILABLE("pdp-unavailable"),
  
  PDP_TRUST_FRAMEWORK_VERSION_DEPRECATED("pdp-trust-framework-version-deprecated"),
  
  PROXY_ENTRY_BALANCING_OPERATION_FAILURE("proxy-entry-balancing-operation-failure"),
  
  PROXY_ENTRY_BALANCING_ERROR_MULTIPLE_OPERATIONS_SUCCEEDED("proxy-entry-balancing-error-multiple-operations-succeeded"),
  
  PROXY_ENTRY_REBALANCING_ADMIN_ACTION_REQUIRED("proxy-entry-rebalancing-admin-action-required"),
  
  REPLICATION_BACKLOGGED("replication-backlogged"),
  
  REPLICATION_METADATA_DECODE_FAILURE("replication-metadata-decode-failure"),
  
  REPLICATION_MISSING_CHANGES("replication-missing-changes"),
  
  REPLICATION_MONITOR_DATA_UNAVAILABLE("replication-monitor-data-unavailable"),
  
  REPLICATION_PLUGIN_MESSAGE_SERIALIZATION_FAILURE("replication-plugin-message-serialization-failure"),
  
  REPLICATION_SERVER_CHANGELOG_FAILURE("replication-server-changelog-failure"),
  
  REPLICATION_SERVER_LISTEN_FAILURE("replication-server-listen-failure"),
  
  REPLICATION_UNRESOLVED_CONFLICT("replication-unresolved-conflict"),
  
  REPLICATION_UNSENT_CHANGES("replication-unsent-changes"),
  
  REPLICATION_REPLAY_FAILED("replication-replay-failed"),
  
  RESTART_REQUIRED("restart-required"),
  
  SCHEMA_CHECKING_DISABLED("schema-checking-disabled"),
  
  SCIM_LOOKTHROUGH_LIMIT_EXCEEDED("scim-lookthrough-limit-exceeded"),
  
  RESTRICTED_SUBTREE_ACCESSIBILITY("restricted-subtree-accessibility"),
  
  SERVER_SHUTTING_DOWN("server-shutting-down"),
  
  SERVER_STARTING("server-starting"),
  
  SERVER_STARTED("server-started"),
  
  SUBTREE_DELETE_INTERRUPTED("subtree-delete-interrupted"),
  
  SYNC_RESOURCE_CONNECTION_ERROR("sync-resource-connection-error"),
  
  SYNC_RESOURCE_OPERATION_ERROR("sync-resource-operation-error"),
  
  SYNC_PIPE_INITIALIZATION_ERROR("sync-pipe-initialization-error"),
  
  SYNC_PIPE_BACKLOG_ABOVE_THRESHOLD("sync-pipe-backlog-above-threshold"),
  
  SYNC_PIPE_BACKLOG_BELOW_THRESHOLD("sync-pipe-backlog-below-threshold"),
  
  SYSTEM_NANOTIME_STOPPED("system-nanotime-stopped"),
  
  SYSTEM_CURRENT_TIME_SHIFTED("system-current-time-shifted"),
  
  TASK_STARTED("task-started"),
  
  TASK_COMPLETED("task-completed"),
  
  TASK_FAILED("task-failed"),
  
  THIRD_PARTY_EXTENSION_EXCEPTION("third-party-extension-exception"),
  
  THREAD_EXIT_HOLDING_LOCK("thread-exit-holding-lock"),
  
  THRESHOLD_WARNING_ENTRY("threshold-warning-entry"),
  
  THRESHOLD_WARNING_EXIT("threshold-warning-exit"),
  
  THRESHOLD_CRITICAL_ENTRY("threshold-critical-entry"),
  
  THRESHOLD_CRITICAL_EXIT("threshold-critical-exit"),
  
  TOPOLOGY_REGISTRY_SECRET_KEY_DELETED("topology-registry-secret-key-deleted"),
  
  UNCAUGHT_EXCEPTION("uncaught-exception"),
  
  UNINDEXED_INTERNAL_SEARCH("unindexed-internal-search"),
  
  UNIQUE_ATTRIBUTE_SYNC_CONFLICT("unique-attribute-sync-conflict"),
  
  UNIQUE_ATTRIBUTE_SYNC_ERROR("unique-attribute-sync-error"),
  
  UNIQUENESS_CONTROL_POST_COMMIT_CONFLICT("uniqueness-control-post-commit-conflict"),
  
  UNLICENSED_PRODUCT("unlicensed-product"),
  
  UNRECOGNIZED_ALERT_TYPE("unrecognized-alert-type"),
  
  USER_DEFINED_ERROR("user-defined-error"),
  
  USER_DEFINED_FATAL("user-defined-fatal"),
  
  USER_DEFINED_INFO("user-defined-info"),
  
  USER_DEFINED_WARNING("user-defined-warning"),
  
  WORKER_THREAD_CAUGHT_ERROR("worker-thread-caught-error"),
  
  WORK_QUEUE_BACKLOGGED("work-queue-backlogged"),
  
  WORK_QUEUE_FULL("work-queue-full"),
  
  WORK_QUEUE_NO_THREADS_REMAINING("work-queue-no-threads-remaining"),
  
  SERVER_JVM_PAUSED("server-jvm-paused"),
  
  SENSITIVE_TRACE_DATA_LOGGED_WARNING("sensitive-trace-data-logged-warning"),
  
  REPLICATION_GENERATION_ID_MISMATCH("replication-generation-id-mismatch"),
  
  ACCOUNT_TEMPORARILY_LOCKED_ACCOUNT_STATUS_NOTIFICATION("account-temporarily-locked-account-status-notification"),
  
  ACCOUNT_PERMANENTLY_LOCKED_ACCOUNT_STATUS_NOTIFICATION("account-permanently-locked-account-status-notification"),
  
  ACCOUNT_UNLOCKED_ACCOUNT_STATUS_NOTIFICATION("account-unlocked-account-status-notification"),
  
  ACCOUNT_IDLE_LOCKED_ACCOUNT_STATUS_NOTIFICATION("account-idle-locked-account-status-notification"),
  
  ACCOUNT_RESET_LOCKED_ACCOUNT_STATUS_NOTIFICATION("account-reset-locked-account-status-notification"),
  
  ACCOUNT_DISABLED_ACCOUNT_STATUS_NOTIFICATION("account-disabled-account-status-notification"),
  
  ACCOUNT_ENABLED_ACCOUNT_STATUS_NOTIFICATION("account-enabled-account-status-notification"),
  
  ACCOUNT_NOT_YET_ACTIVE_ACCOUNT_STATUS_NOTIFICATION("account-not-yet-active-account-status-notification"),
  
  ACCOUNT_EXPIRED_ACCOUNT_STATUS_NOTIFICATION("account-expired-account-status-notification"),
  
  PASSWORD_EXPIRED_ACCOUNT_STATUS_NOTIFICATION("password-expired-account-status-notification"),
  
  PASSWORD_EXPIRING_ACCOUNT_STATUS_NOTIFICATION("password-expiring-account-status-notification"),
  
  PASSWORD_RESET_ACCOUNT_STATUS_NOTIFICATION("password-reset-account-status-notification"),
  
  PASSWORD_CHANGED_ACCOUNT_STATUS_NOTIFICATION("password-changed-account-status-notification"),
  
  ACCOUNT_AUTHENTICATED_ACCOUNT_STATUS_NOTIFICATION("account-authenticated-account-status-notification"),
  
  ACCOUNT_CREATED_ACCOUNT_STATUS_NOTIFICATION("account-created-account-status-notification"),
  
  ACCOUNT_DELETED_ACCOUNT_STATUS_NOTIFICATION("account-deleted-account-status-notification"),
  
  ACCOUNT_UPDATED_ACCOUNT_STATUS_NOTIFICATION("account-updated-account-status-notification"),
  
  BIND_PASSWORD_FAILED_VALIDATION_ACCOUNT_STATUS_NOTIFICATION("bind-password-failed-validation-account-status-notification"),
  
  MUST_CHANGE_PASSWORD_ACCOUNT_STATUS_NOTIFICATION("must-change-password-account-status-notification"),
  
  PRIVILEGE_ASSIGNED("privilege-assigned"),
  
  INSECURE_REQUEST_REJECTED("insecure-request-rejected"),
  
  INCREMENTAL_BACKUPS_DEPRECATED("incremental-backups-deprecated"),
  
  REPLACE_CERTIFICATE_SUCCEEDED("replace-certificate-succeeded"),
  
  REPLACE_CERTIFICATE_FAILED("replace-certificate-failed"),
  
  REPLICATION_MISSING_CHANGES_RISK("replication-missing-changes-risk"),
  
  REPLICATION_NOT_PURGING_OBSOLETE_REPLICAS("replication-not-purging-obsolete-replicas"),
  
  REPLICATION_MISSING_CHANGES_ACTION("replication-missing-changes-action");

  private String value;

  EnumbackendDisabledAlertTypeProp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumbackendDisabledAlertTypeProp fromValue(String value) {
    for (EnumbackendDisabledAlertTypeProp b : EnumbackendDisabledAlertTypeProp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumbackendDisabledAlertTypeProp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumbackendDisabledAlertTypeProp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumbackendDisabledAlertTypeProp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumbackendDisabledAlertTypeProp.fromValue(value);
    }
  }
}

