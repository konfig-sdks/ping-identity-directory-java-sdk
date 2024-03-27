

# KafkaClusterExternalServerResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this External Server |  [optional] |
|**schemas** | **List&lt;EnumkafkaClusterExternalServerSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the External Server |  [optional] |
|**bootstrapServer** | **List&lt;String&gt;** | List of Kafka brokers to use for this Kafka Cluster External Server, following the host:port format. |  [optional] |
|**producerProperty** | **List&lt;String&gt;** | Specifies extra properties to use when constructing the KafkaProducer for sending messages. |  [optional] |
|**useSSL** | **Boolean** | If enabled, the Kafka Cluster External Server will use SSL to encrypt communication with the Kafka brokers. |  [optional] |
|**trustManagerProvider** | **String** | Specifies the file-based trust manager that should be used with the Kafka Cluster External Server for connecting to the Kafka cluster over SSL. |  [optional] |
|**keyManagerProvider** | **String** | Specifies the file-based key manager that should be used with the Kafka Cluster External Server for connecting to the Kafka cluster over SSL. |  [optional] |



