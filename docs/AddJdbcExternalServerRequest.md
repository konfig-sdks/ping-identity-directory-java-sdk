

# AddJdbcExternalServerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**serverName** | **String** | Name of the new External Server |  |
|**description** | **String** | A description for this External Server |  [optional] |
|**schemas** | **List&lt;EnumjdbcExternalServerSchemaUrn&gt;** |  |  |
|**jdbcDriverType** | **EnumexternalServerJdbcDriverTypeProp** |  |  |
|**jdbcDriverURL** | **String** | Specify the complete JDBC URL which will be used instead of the automatic URL format. You must select type &#39;other&#39; for the jdbc-driver-type. |  [optional] |
|**databaseName** | **String** | Specifies which database to connect to. This is ignored if jdbc-driver-url is specified. |  [optional] |
|**serverHostName** | **String** | The host name of the database server. This is ignored if jdbc-driver-url is specified. |  [optional] |
|**serverPort** | **Integer** | The port number where the database server listens for requests. This is ignored if jdbc-driver-url is specified |  [optional] |
|**userName** | **String** | The name of the login account to use when connecting to the database server. |  [optional] |
|**password** | **String** | The login password for the specified user name. |  [optional] |
|**passphraseProvider** | **String** | The passphrase provider to use to obtain the login password for the specified user. |  [optional] |
|**validationQuery** | **String** | The SQL query that will be used to validate connections to the database before making them available to the Directory Server. |  [optional] |
|**validationQueryTimeout** | **String** | Specifies the amount of time to wait for a response from the database when executing the validation query, if one is set. If the timeout is exceeded, the Directory Server will drop the connection and obtain a new one. A value of zero indicates no timeout. |  [optional] |
|**jdbcConnectionProperties** | **List&lt;String&gt;** | Specifies the connection properties for the JDBC datasource. |  [optional] |
|**transactionIsolationLevel** | **EnumexternalServerTransactionIsolationLevelProp** |  |  [optional] |



