

# AddClientConnectionPolicyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**policyName** | **String** | Name of the new Client Connection Policy |  |
|**description** | **String** | A description for this Client Connection Policy |  [optional] |
|**schemas** | **List&lt;EnumclientConnectionPolicySchemaUrn&gt;** |  |  [optional] |
|**policyID** | **String** | Specifies a name which uniquely identifies this Client Connection Policy in the server. |  |
|**enabled** | **Boolean** | Indicates whether this Client Connection Policy is enabled for use in the server. If a Client Connection Policy is disabled, then no new client connections will be associated with it. |  |
|**evaluationOrderIndex** | **Integer** | Specifies the order in which Client Connection Policy definitions will be evaluated. A Client Connection Policy with a lower index will be evaluated before one with a higher index, and the first Client Connection Policy evaluated which may apply to a client connection will be used for that connection. Each Client Connection Policy must be assigned a unique evaluation order index value. |  |
|**connectionCriteria** | **String** | Specifies a set of connection criteria that must match the associated client connection for it to be associated with this Client Connection Policy. |  [optional] |
|**terminateConnection** | **Boolean** | Indicates whether any client connection for which this Client Connection Policy is selected should be terminated. This makes it possible to define fine-grained criteria for clients that should not be allowed to connect to this Directory Server. |  [optional] |
|**sensitiveAttribute** | **List&lt;String&gt;** | Provides the ability to indicate that some attributes should be considered sensitive and additional protection should be in place when interacting with those attributes. |  [optional] |
|**excludeGlobalSensitiveAttribute** | **List&lt;String&gt;** | Specifies the set of global sensitive attribute definitions that should not apply to this client connection policy. |  [optional] |
|**resultCodeMap** | **String** | Specifies the result code map that should be used for clients associated with this Client Connection Policy. If a value is defined for this property, then it will override any result code map referenced in the global configuration. |  [optional] |
|**includedBackendBaseDN** | **List&lt;String&gt;** | Specifies the set of backend base DNs for which subtree views should be included in this Client Connection Policy. |  [optional] |
|**excludedBackendBaseDN** | **List&lt;String&gt;** | Specifies the set of backend base DNs for which subtree views should be excluded from this Client Connection Policy. |  [optional] |
|**allowedOperation** | **List&lt;EnumclientConnectionPolicyAllowedOperationProp&gt;** |  |  [optional] |
|**requiredOperationRequestCriteria** | **String** | Specifies a request criteria object that will be required to match all requests submitted by clients associated with this Client Connection Policy. If a client submits a request that does not satisfy this request criteria object, then that request will be rejected. |  [optional] |
|**prohibitedOperationRequestCriteria** | **String** | Specifies a request criteria object that must not match any requests submitted by clients associated with this Client Connection Policy. If a client submits a request that satisfies this request criteria object, then that request will be rejected. |  [optional] |
|**allowedRequestControl** | **List&lt;String&gt;** | Specifies the OIDs of the controls that clients associated with this Client Connection Policy will be allowed to include in requests. |  [optional] |
|**deniedRequestControl** | **List&lt;String&gt;** | Specifies the OIDs of the controls that clients associated with this Client Connection Policy will not be allowed to include in requests. |  [optional] |
|**allowedExtendedOperation** | **List&lt;String&gt;** | Specifies the OIDs of the extended operations that clients associated with this Client Connection Policy will be allowed to request. |  [optional] |
|**deniedExtendedOperation** | **List&lt;String&gt;** | Specifies the OIDs of the extended operations that clients associated with this Client Connection Policy will not be allowed to request. |  [optional] |
|**allowedAuthType** | **List&lt;EnumclientConnectionPolicyAllowedAuthTypeProp&gt;** |  |  [optional] |
|**allowedSASLMechanism** | **List&lt;String&gt;** | Specifies the names of the SASL mechanisms that clients associated with this Client Connection Policy will be allowed to request. |  [optional] |
|**deniedSASLMechanism** | **List&lt;String&gt;** | Specifies the names of the SASL mechanisms that clients associated with this Client Connection Policy will not be allowed to request. |  [optional] |
|**allowedFilterType** | **List&lt;EnumclientConnectionPolicyAllowedFilterTypeProp&gt;** |  |  [optional] |
|**allowUnindexedSearches** | **Boolean** | Indicates whether clients will be allowed to request search operations that cannot be efficiently processed using the set of indexes defined in the corresponding backend. Note that even if this is false, some clients may be able to request unindexed searches if the allow-unindexed-searches-with-control property has a value of true and the necessary conditions are satisfied. |  [optional] |
|**allowUnindexedSearchesWithControl** | **Boolean** | Indicates whether clients will be allowed to request search operations that cannot be efficiently processed using the set of indexes defined in the corresponding backend, as long as the search request also includes the permit unindexed search request control and the requester has the unindexed-search-with-control privilege (or that privilege is disabled in the global configuration). |  [optional] |
|**minimumSubstringLength** | **Integer** | Specifies the minimum number of consecutive bytes that must be present in any subInitial, subAny, or subFinal element of a substring filter component (i.e., the minimum number of consecutive bytes between wildcard characters in a substring filter). Any attempt to use a substring search with an element containing fewer than this number of bytes will be rejected. |  [optional] |
|**maximumConcurrentConnections** | **Integer** | Specifies the maximum number of client connections which may be associated with this Client Connection Policy at any given time. |  [optional] |
|**maximumConnectionDuration** | **String** | Specifies the maximum length of time that a connection associated with this Client Connection Policy may be established. Any connection which is associated with this Client Connection Policy and has been established for longer than this period of time may be terminated. |  [optional] |
|**maximumIdleConnectionDuration** | **String** | Specifies the maximum length of time that a connection associated with this Client Connection Policy may remain established after the completion of the last operation processed on that connection. Any new operation requested on the connection will reset this timer. Any connection associated with this Client Connection Policy which has been idle for longer than this length of time may be terminated. |  [optional] |
|**maximumOperationCountPerConnection** | **Integer** | Specifies the maximum number of operations that may be requested by any client connection associated with this Client Connection Policy. If an attempt is made to process more than this number of operations on a client connection, then that connection will be terminated. |  [optional] |
|**maximumConcurrentOperationsPerConnection** | **Integer** | Specifies the maximum number of concurrent operations that can be in progress for any connection. This can help prevent a single client connection from monopolizing server processing resources by sending a large number of concurrent asynchronous requests. A value of zero indicates that no limit will be placed on the number of concurrent requests for a single client. |  [optional] |
|**maximumConcurrentOperationWaitTimeBeforeRejecting** | **String** | Specifies the maximum length of time that the server should wait for an outstanding operation to complete before rejecting a new request received when the maximum number of outstanding operations are already in progress on that connection. If an existing outstanding operation on the connection completes before this time, then the operation will be processed. Otherwise, the operation will be rejected with a \&quot;busy\&quot; result. |  [optional] |
|**maximumConcurrentOperationsPerConnectionExceededBehavior** | **EnumclientConnectionPolicyMaximumConcurrentOperationsPerConnectionExceededBehaviorProp** |  |  [optional] |
|**maximumConnectionOperationRate** | **List&lt;String&gt;** | Specifies the maximum rate at which a client associated with this Client Connection Policy may issue requests to the Directory Server. If any client attempts to request operations at a rate higher than this limit, then the server will exhibit the behavior described in the connection-operation-rate-exceeded-behavior property. |  [optional] |
|**connectionOperationRateExceededBehavior** | **EnumclientConnectionPolicyConnectionOperationRateExceededBehaviorProp** |  |  [optional] |
|**maximumPolicyOperationRate** | **List&lt;String&gt;** | Specifies the maximum rate at which all clients associated with this Client Connection Policy, as a collective set, may issue requests to the Directory Server. If this limit is exceeded, then the server will exhibit the behavior described in the policy-operation-rate-exceeded-behavior property. |  [optional] |
|**policyOperationRateExceededBehavior** | **EnumclientConnectionPolicyPolicyOperationRateExceededBehaviorProp** |  |  [optional] |
|**maximumSearchSizeLimit** | **Integer** | Specifies the maximum number of entries that may be returned for a search performed by a client associated with this Client Connection Policy. |  [optional] |
|**maximumSearchTimeLimit** | **String** | Specifies the maximum length of time that the server should spend processing search operations requested by clients associated with this Client Connection Policy. |  [optional] |
|**maximumSearchLookthroughLimit** | **Integer** | Specifies the maximum number of entries that may be examined by a backend in the course of processing a search requested by clients associated with this Client Connection Policy. |  [optional] |
|**maximumLDAPJoinSizeLimit** | **Integer** | Specifies the maximum number of entries that may be joined with any single search result entry for a search request performed by a client associated with this Client Connection Policy. |  [optional] |
|**maximumSortSizeLimitWithoutVLVIndex** | **Integer** | Specifies the maximum number of entries that the server will attempt to sort without the benefit of a VLV index. A value of zero indicates that no limit should be enforced. |  [optional] |



