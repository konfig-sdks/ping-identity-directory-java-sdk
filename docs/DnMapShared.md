

# DnMapShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this DN Map |  [optional] |
|**schemas** | **List&lt;EnumdnMapSchemaUrn&gt;** |  |  [optional] |
|**fromDNPattern** | **String** | Specifies the DN pattern to match when determining whether this map applies to a specific source DN. If the provided bind DN matches this pattern, then the to-dn-pattern will be used to perform the mapping. If the provided bind DN does not match this pattern, then no mapping will be performed. |  |
|**toDNPattern** | **String** | Specifies a pattern for constructing the DN value using fixed text, DN components matching wild-card values in from-dn-pattern, and attribute values from the source entry. |  |



