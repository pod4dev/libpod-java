

# NetworkSettings

NetworkSettings exposes the network settings in the api

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bridge** | **String** |  |  [optional] |
|**endpointID** | **String** |  |  [optional] |
|**gateway** | **String** |  |  [optional] |
|**globalIPv6Address** | **String** |  |  [optional] |
|**globalIPv6PrefixLen** | **Long** |  |  [optional] |
|**hairpinMode** | **Boolean** | HairpinMode specifies if hairpin NAT should be enabled on the virtual interface  Deprecated: This field is never set and will be removed in a future release. |  [optional] |
|**ipAddress** | **String** |  |  [optional] |
|**ipPrefixLen** | **Long** |  |  [optional] |
|**ipv6Gateway** | **String** |  |  [optional] |
|**linkLocalIPv6Address** | **String** | LinkLocalIPv6Address is an IPv6 unicast address using the link-local prefix  Deprecated: This field is never set and will be removed in a future release. |  [optional] |
|**linkLocalIPv6PrefixLen** | **Long** | LinkLocalIPv6PrefixLen is the prefix length of an IPv6 unicast address  Deprecated: This field is never set and will be removed in a future release. |  [optional] |
|**macAddress** | **String** |  |  [optional] |
|**networks** | [**Map&lt;String, EndpointSettings&gt;**](EndpointSettings.md) |  |  [optional] |
|**ports** | **Map&lt;String, List&lt;@Valid PortBinding&gt;&gt;** | PortMap is a collection of PortBinding indexed by Port |  [optional] |
|**sandboxID** | **String** |  |  [optional] |
|**sandboxKey** | **String** |  |  [optional] |
|**secondaryIPAddresses** | [**List&lt;Address&gt;**](Address.md) |  |  [optional] |
|**secondaryIPv6Addresses** | [**List&lt;Address&gt;**](Address.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


