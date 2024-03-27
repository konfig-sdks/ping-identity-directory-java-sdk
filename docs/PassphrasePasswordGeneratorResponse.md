

# PassphrasePasswordGeneratorResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Password Generator |  |
|**description** | **String** | A description for this Password Generator |  [optional] |
|**schemas** | **List&lt;EnumpassphrasePasswordGeneratorSchemaUrn&gt;** |  |  |
|**dictionaryFile** | **String** | The path to the dictionary file that will be used to obtain the words for use in generated passwords. |  |
|**minimumPasswordCharacters** | **Integer** | The minimum number of characters that generated passwords will be required to have. |  [optional] |
|**minimumPasswordWords** | **Integer** | The minimum number of words that must be concatenated in the course of generating a password. |  [optional] |
|**capitalizeWords** | **Boolean** | Indicates whether to capitalize each word used in the generated password. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Password Generator is enabled for use. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |



