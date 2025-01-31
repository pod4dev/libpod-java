

# InspectAdditionalNetwork

InspectAdditionalNetwork holds information about non-default networks the container has been connected to. As with InspectNetworkSettings, many fields are unused and maintained only for compatibility with Docker.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalMACAddresses** | **List&lt;String&gt;** | AdditionalMacAddresses is a set of additional MAC Addresses beyond the first. CNI may configure more than one interface for a single network, which can cause this. |  [optional] |
|**aliases** | **List&lt;String&gt;** | Aliases are any network aliases the container has in this network. |  [optional] |
|**driverOpts** | **Map&lt;String, String&gt;** | DriverOpts is presently unused and maintained exclusively for compatibility. |  [optional] |
|**endpointID** | **String** | EndpointID is unused, maintained exclusively for compatibility. |  [optional] |
|**gateway** | **String** | Gateway is the IP address of the gateway this network will use. |  [optional] |
|**globalIPv6Address** | **String** | GlobalIPv6Address is the global-scope IPv6 Address for this network. |  [optional] |
|**globalIPv6PrefixLen** | **Long** | GlobalIPv6PrefixLen is the length of the subnet mask of this network. |  [optional] |
|**ipAMConfig** | **Map&lt;String, String&gt;** | IPAMConfig is presently unused and maintained exclusively for compatibility. |  [optional] |
|**ipAddress** | **String** | IPAddress is the IP address for this network. |  [optional] |
|**ipPrefixLen** | **Long** | IPPrefixLen is the length of the subnet mask of this network. |  [optional] |
|**ipv6Gateway** | **String** | IPv6Gateway is the IPv6 gateway this network will use. |  [optional] |
|**links** | **List&lt;String&gt;** | Links is presently unused and maintained exclusively for compatibility. |  [optional] |
|**macAddress** | **String** | MacAddress is the MAC address for the interface in this network. |  [optional] |
|**networkID** | **String** | Name of the network we&#39;re connecting to. |  [optional] |
|**secondaryIPAddresses** | [**List&lt;Address&gt;**](Address.md) | SecondaryIPAddresses is a list of extra IP Addresses that the container has been assigned in this network. |  [optional] |
|**secondaryIPv6Addresses** | [**List&lt;Address&gt;**](Address.md) | SecondaryIPv6Addresses is a list of extra IPv6 Addresses that the container has been assigned in this network. |  [optional] |


## Implemented Interfaces

* Serializable


