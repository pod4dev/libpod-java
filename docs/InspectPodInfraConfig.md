

# InspectPodInfraConfig

InspectPodInfraConfig contains the configuration of the pod's infra container.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dnSOption** | **List&lt;String&gt;** | DNSOption is a set of DNS options that will be used by the infra container&#39;s resolv.conf and shared with the remainder of the pod. |  [optional] |
|**dnSSearch** | **List&lt;String&gt;** | DNSSearch is a set of DNS search domains that will be used by the infra container&#39;s resolv.conf and shared with the remainder of the pod. |  [optional] |
|**dnSServer** | **List&lt;String&gt;** | DNSServer is a set of DNS Servers that will be used by the infra container&#39;s resolv.conf and shared with the remainder of the pod. |  [optional] |
|**hostAdd** | **List&lt;String&gt;** | HostAdd adds a number of hosts to the infra container&#39;s resolv.conf which will be shared with the rest of the pod. |  [optional] |
|**hostNetwork** | **Boolean** | HostNetwork is whether the infra container (and thus the whole pod) will use the host&#39;s network and not create a network namespace. |  [optional] |
|**networkOptions** | **Map&lt;String, List&lt;String&gt;&gt;** | NetworkOptions are additional options for each network |  [optional] |
|**networks** | **List&lt;String&gt;** | Networks is a list of networks the pod will join. |  [optional] |
|**noManageHosts** | **Boolean** | NoManageHosts indicates that the pod will not manage /etc/hosts and instead each container will handle their own. |  [optional] |
|**noManageResolvConf** | **Boolean** | NoManageResolvConf indicates that the pod will not manage resolv.conf and instead each container will handle their own. |  [optional] |
|**portBindings** | **Map&lt;String, List&lt;@Valid InspectHostPort&gt;&gt;** | PortBindings are ports that will be forwarded to the infra container and then shared with the pod. |  [optional] |
|**staticIP** | **String** | StaticIP is a static IPv4 that will be assigned to the infra container and then used by the pod. |  [optional] |
|**staticMAC** | **String** | StaticMAC is a static MAC address that will be assigned to the infra container and then used by the pod. |  [optional] |
|**cpuPeriod** | **Integer** | CPUPeriod contains the CPU period of the pod |  [optional] |
|**cpuQuota** | **Long** | CPUQuota contains the CPU quota of the pod |  [optional] |
|**cpusetCpus** | **String** | CPUSetCPUs contains linux specific CPU data for the container |  [optional] |
|**pidNs** | **String** | Pid is the PID namespace mode of the pod&#39;s infra container |  [optional] |
|**userns** | **String** | UserNS is the usernamespace that all the containers in the pod will join. |  [optional] |
|**utsNs** | **String** | UtsNS is the uts namespace that all containers in the pod will join |  [optional] |


## Implemented Interfaces

* Serializable


