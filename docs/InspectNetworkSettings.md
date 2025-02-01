

# InspectNetworkSettings

InspectNetworkSettings holds information about the network settings of the container. Many fields are maintained only for compatibility with `docker inspect` and are unused within Libpod.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalMACAddresses** | **List&lt;String&gt;** | AdditionalMacAddresses is a set of additional MAC Addresses beyond the first. CNI may configure more than one interface for a single network, which can cause this. |  [optional] |
|**bridge** | **String** |  |  [optional] |
|**endpointID** | **String** | EndpointID is unused, maintained exclusively for compatibility. |  [optional] |
|**gateway** | **String** | Gateway is the IP address of the gateway this network will use. |  [optional] |
|**globalIPv6Address** | **String** | GlobalIPv6Address is the global-scope IPv6 Address for this network. |  [optional] |
|**globalIPv6PrefixLen** | **Long** | GlobalIPv6PrefixLen is the length of the subnet mask of this network. |  [optional] |
|**hairpinMode** | **Boolean** |  |  [optional] |
|**ipAddress** | **String** | IPAddress is the IP address for this network. |  [optional] |
|**ipPrefixLen** | **Long** | IPPrefixLen is the length of the subnet mask of this network. |  [optional] |
|**ipv6Gateway** | **String** | IPv6Gateway is the IPv6 gateway this network will use. |  [optional] |
|**linkLocalIPv6Address** | **String** |  |  [optional] |
|**linkLocalIPv6PrefixLen** | **Long** |  |  [optional] |
|**macAddress** | **String** | MacAddress is the MAC address for the interface in this network. |  [optional] |
|**networks** | [**Map&lt;String, InspectAdditionalNetwork&gt;**](InspectAdditionalNetwork.md) | Networks contains information on non-default networks this container has joined. It is a map of network name to network information. |  [optional] |
|**ports** | **Map&lt;String, List&lt;@Valid InspectHostPort&gt;&gt;** |  |  [optional] |
|**sandboxID** | **String** |  |  [optional] |
|**sandboxKey** | **String** |  |  [optional] |
|**secondaryIPAddresses** | [**List&lt;Address&gt;**](Address.md) | SecondaryIPAddresses is a list of extra IP Addresses that the container has been assigned in this network. |  [optional] |
|**secondaryIPv6Addresses** | [**List&lt;Address&gt;**](Address.md) | SecondaryIPv6Addresses is a list of extra IPv6 Addresses that the container has been assigned in this network. |  [optional] |


## Implemented Interfaces

* Serializable


