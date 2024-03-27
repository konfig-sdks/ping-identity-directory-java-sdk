

# EncryptionSettingsDatabaseAccessibilityMonitorProviderShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Monitor Provider |  [optional] |
|**schemas** | **List&lt;EnumencryptionSettingsDatabaseAccessibilityMonitorProviderSchemaUrn&gt;** |  |  |
|**checkFrequency** | **String** | The frequency with which this monitor provider should confirm the ability to access the server&#39;s encryption settings database. |  [optional] |
|**prolongedOutageDuration** | **String** | The minimum length of time that an outage should persist before it is considered a prolonged outage. If an outage lasts at least as long as this duration, then the server will take the action indicated by the prolonged-outage-behavior property. |  [optional] |
|**prolongedOutageBehavior** | **EnummonitorProviderProlongedOutageBehaviorProp** |  |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Monitor Provider is enabled for use. |  |



