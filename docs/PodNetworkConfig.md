

# PodNetworkConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**networks** | [**Map&lt;String, PerNetworkOptions&gt;**](PerNetworkOptions.md) | Map of networks names to ids the container should join to. You can request additional settings for each network, you can set network aliases, static ips, static mac address  and the network interface name for this container on the specific network. If the map is empty and the bridge network mode is set the container will be joined to the default network. |  [optional] |
|**cniNetworks** | **List&lt;String&gt;** | CNINetworks is a list of CNI networks to join the container to. If this list is empty, the default CNI network will be joined instead. If at least one entry is present, we will not join the default network (unless it is part of this list). Only available if NetNS is set to bridge. Optional. Deprecated: as of podman 4.0 use \&quot;Networks\&quot; instead. |  [optional] |
|**dnsOption** | **List&lt;String&gt;** | DNSOption is a set of DNS options that will be used in the infra container&#39;s resolv.conf, which will, by default, be shared with all containers in the pod. Conflicts with NoInfra&#x3D;true. Optional. |  [optional] |
|**dnsSearch** | **List&lt;String&gt;** | DNSSearch is a set of DNS search domains that will be used in the infra container&#39;s resolv.conf, which will, by default, be shared with all containers in the pod. If not provided, DNS search domains from the host&#39;s resolv.conf will be used. Conflicts with NoInfra&#x3D;true. Optional. |  [optional] |
|**dnsServer** | **List&lt;String&gt;** | DNSServer is a set of DNS servers that will be used in the infra container&#39;s resolv.conf, which will, by default, be shared with all containers in the pod. If not provided, the host&#39;s DNS servers will be used, unless the only server set is a localhost address. As the container cannot connect to the host&#39;s localhost, a default server will instead be set. Conflicts with NoInfra&#x3D;true. Optional. |  [optional] |
|**hostadd** | **List&lt;String&gt;** | HostAdd is a set of hosts that will be added to the infra container&#39;s etc/hosts that will, by default, be shared with all containers in the pod. Conflicts with NoInfra&#x3D;true and NoManageHosts. Optional. |  [optional] |
|**netns** | [**Namespace**](Namespace.md) |  |  [optional] |
|**networkOptions** | **Map&lt;String, List&lt;String&gt;&gt;** | NetworkOptions are additional options for each network Optional. |  [optional] |
|**noManageHosts** | **Boolean** | NoManageHosts indicates that /etc/hosts should not be managed by the pod. Instead, each container will create a separate /etc/hosts as they would if not in a pod. Conflicts with HostAdd. |  [optional] |
|**noManageResolvConf** | **Boolean** | NoManageResolvConf indicates that /etc/resolv.conf should not be managed by the pod. Instead, each container will create and manage a separate resolv.conf as if they had not joined a pod. Conflicts with NoInfra&#x3D;true and DNSServer, DNSSearch, DNSOption. Optional. |  [optional] |
|**portmappings** | [**List&lt;PortMapping&gt;**](PortMapping.md) | PortMappings is a set of ports to map into the infra container. As, by default, containers share their network with the infra container, this will forward the ports to the entire pod. Only available if NetNS is set to Bridge, Slirp, or Pasta. Optional. |  [optional] |


## Implemented Interfaces

* Serializable


