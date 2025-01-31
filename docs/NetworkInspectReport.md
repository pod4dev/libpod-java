

# NetworkInspectReport


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**containers** | [**Map&lt;String, NetworkContainerInfo&gt;**](NetworkContainerInfo.md) |  |  [optional] |
|**created** | **OffsetDateTime** | Created contains the timestamp when this network was created. |  [optional] |
|**dnsEnabled** | **Boolean** | DNSEnabled is whether name resolution is active for container on this Network. Only supported with the bridge driver. |  [optional] |
|**driver** | **String** | Driver for this Network, e.g. bridge, macvlan... |  [optional] |
|**id** | **String** | ID of the Network. |  [optional] |
|**internal** | **Boolean** | Internal is whether the Network should not have external routes to public or other Networks. |  [optional] |
|**ipamOptions** | **Map&lt;String, String&gt;** | IPAMOptions contains options used for the ip assignment. |  [optional] |
|**ipv6Enabled** | **Boolean** | IPv6Enabled if set to true an ipv6 subnet should be created for this net. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Labels is a set of key-value labels that have been applied to the Network. |  [optional] |
|**name** | **String** | Name of the Network. |  [optional] |
|**networkDnsServers** | **List&lt;String&gt;** | List of custom DNS server for podman&#39;s DNS resolver at network level, all the containers attached to this network will consider resolvers configured at network level. |  [optional] |
|**networkInterface** | **String** | NetworkInterface is the network interface name on the host. |  [optional] |
|**options** | **Map&lt;String, String&gt;** | Options is a set of key-value options that have been applied to the Network. |  [optional] |
|**routes** | [**List&lt;Route&gt;**](Route.md) | Routes to use for this network. |  [optional] |
|**subnets** | [**List&lt;Subnet&gt;**](Subnet.md) | Subnets to use for this network. |  [optional] |


## Implemented Interfaces

* Serializable


