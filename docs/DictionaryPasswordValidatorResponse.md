

# DictionaryPasswordValidatorResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Password Validator |  |
|**description** | **String** | A description for this Password Validator |  [optional] |
|**schemas** | **List&lt;EnumdictionaryPasswordValidatorSchemaUrn&gt;** |  |  |
|**dictionaryFile** | **String** | Specifies the path to the file containing a list of words that cannot be used as passwords. |  |
|**caseSensitiveValidation** | **Boolean** | Indicates whether this password validator is to treat password characters in a case-sensitive manner. |  |
|**testReversedPassword** | **Boolean** | Indicates whether this password validator is to test the reversed value of the provided password as well as the order in which it was given. |  |
|**ignoreLeadingNonAlphabeticCharacters** | **Boolean** | Indicates whether to ignore any digits, symbols, or other non-alphabetic characters that may appear at the beginning of a proposed password. |  [optional] |
|**ignoreTrailingNonAlphabeticCharacters** | **Boolean** | Indicates whether to ignore any digits, symbols, or other non-alphabetic characters that may appear at the end of a proposed password. |  [optional] |
|**stripDiacriticalMarks** | **Boolean** | Indicates whether to strip characters of any diacritical marks (like accents, cedillas, circumflexes, diaereses, tildes, and umlauts) they may contain. Any characters with a diacritical mark would be replaced with a base version |  [optional] |
|**alternativePasswordCharacterMapping** | **List&lt;String&gt;** | Provides a set of character substitutions that can be applied to the proposed password when checking to see if it is in the provided dictionary. Each mapping should consist of a single character followed by a colon and a list of the alternative characters that may be used in place of that character. |  [optional] |
|**maximumAllowedPercentOfPassword** | **Integer** | The maximum allowed percent of a proposed password that any single dictionary word is allowed to comprise. A value of 100 indicates that a proposed password will only be rejected if the dictionary contains the entire proposed password (after any configured transformations have been applied). |  [optional] |
|**enabled** | **Boolean** | Indicates whether the password validator is enabled for use. |  |
|**validatorRequirementDescription** | **String** | Specifies a message that can be used to describe the requirements imposed by this password validator to end users. If a value is provided for this property, then it will override any description that may have otherwise been generated by the validator. |  [optional] |
|**validatorFailureMessage** | **String** | Specifies a message that may be provided to the end user in the event that a proposed password is rejected by this validator. If a value is provided for this property, then it will override any failure message that may have otherwise been generated by the validator. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |



