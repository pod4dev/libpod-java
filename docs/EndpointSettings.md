

# EndpointSettings

EndpointSettings stores the network endpoint details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aliases** | **List&lt;String&gt;** |  |  [optional] |
|**dnSNames** | **List&lt;String&gt;** | DNSNames holds all the (non fully qualified) DNS names associated to this endpoint. First entry is used to generate PTR records. |  [optional] |
|**driverOpts** | **Map&lt;String, String&gt;** |  |  [optional] |
|**endpointID** | **String** |  |  [optional] |
|**gateway** | **String** |  |  [optional] |
|**globalIPv6Address** | **String** |  |  [optional] |
|**globalIPv6PrefixLen** | **Long** |  |  [optional] |
|**ipAMConfig** | [**EndpointIPAMConfig**](EndpointIPAMConfig.md) |  |  [optional] |
|**ipAddress** | **String** |  |  [optional] |
|**ipPrefixLen** | **Long** |  |  [optional] |
|**ipv6Gateway** | **String** |  |  [optional] |
|**links** | **List&lt;String&gt;** |  |  [optional] |
|**macAddress** | **String** | MacAddress may be used to specify a MAC address when the container is created. Once the container is running, it becomes operational data (it may contain a generated address). |  [optional] |
|**networkID** | **String** | Operational data |  [optional] |


## Implemented Interfaces

* Serializable


