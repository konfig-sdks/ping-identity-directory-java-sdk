

# AddRecurringTaskChainRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chainName** | **String** | Name of the new Recurring Task Chain |  |
|**description** | **String** | A description for this Recurring Task Chain |  [optional] |
|**schemas** | **List&lt;EnumrecurringTaskChainSchemaUrn&gt;** |  |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Recurring Task Chain is enabled for use. Recurring Task Chains that are disabled will not have any new instances scheduled, but instances that are already scheduled will be preserved. Those instances may be manually canceled if desired. |  [optional] |
|**recurringTask** | **List&lt;String&gt;** | The set of recurring tasks that make up this chain. At least one value must be provided. If multiple values are given, then the task instances will be invoked in the order in which they are listed. |  |
|**scheduledMonth** | **List&lt;EnumrecurringTaskChainScheduledMonthProp&gt;** |  |  [optional] |
|**scheduledDateSelectionType** | **EnumrecurringTaskChainScheduledDateSelectionTypeProp** |  |  |
|**scheduledDayOfTheWeek** | **List&lt;EnumrecurringTaskChainScheduledDayOfTheWeekProp&gt;** |  |  [optional] |
|**scheduledDayOfTheMonth** | **List&lt;EnumrecurringTaskChainScheduledDayOfTheMonthProp&gt;** |  |  [optional] |
|**scheduledTimeOfDay** | **List&lt;String&gt;** | The time of day at which instances of the Recurring Task Chain should be eligible to start running. Values should be in the format HH:MM (where HH is a two-digit representation of the hour of the day, between 00 and 23, inclusive), and MM is a two-digit representation of the minute of the hour (between 00 and 59, inclusive). Alternately, the value can be in the form *:MM, which indicates that the task should be eligible to start at the specified minute of every hour. At least one value must be provided, but multiple values may be given to indicate multiple start times within the same day. |  |
|**timeZone** | **String** | The time zone that will be used to interpret the scheduled-time-of-day values. If no value is provided, then the JVM&#39;s default time zone will be used. |  [optional] |
|**interruptedByShutdownBehavior** | **EnumrecurringTaskChainInterruptedByShutdownBehaviorProp** |  |  [optional] |
|**serverOfflineAtStartTimeBehavior** | **EnumrecurringTaskChainServerOfflineAtStartTimeBehaviorProp** |  |  [optional] |



