

# PodSpecGenerator

PodSpecGenerator describes options to create a pod

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**networks** | [**Map&lt;String, PerNetworkOptions&gt;**](PerNetworkOptions.md) | Map of networks names to ids the container should join to. You can request additional settings for each network, you can set network aliases, static ips, static mac address  and the network interface name for this container on the specific network. If the map is empty and the bridge network mode is set the container will be joined to the default network. |  [optional] |
|**cgroupParent** | **String** | CgroupParent is the parent for the Cgroup that the pod will create. This pod cgroup will, in turn, be the default cgroup parent for all containers in the pod. Optional. |  [optional] |
|**cniNetworks** | **List&lt;String&gt;** | CNINetworks is a list of CNI networks to join the container to. If this list is empty, the default CNI network will be joined instead. If at least one entry is present, we will not join the default network (unless it is part of this list). Only available if NetNS is set to bridge. Optional. Deprecated: as of podman 4.0 use \&quot;Networks\&quot; instead. |  [optional] |
|**cpuPeriod** | **Integer** | CPU period of the cpuset, determined by --cpus |  [optional] |
|**cpuQuota** | **Long** | CPU quota of the cpuset, determined by --cpus |  [optional] |
|**dnsOption** | **List&lt;String&gt;** | DNSOption is a set of DNS options that will be used in the infra container&#39;s resolv.conf, which will, by default, be shared with all containers in the pod. Conflicts with NoInfra&#x3D;true. Optional. |  [optional] |
|**dnsSearch** | **List&lt;String&gt;** | DNSSearch is a set of DNS search domains that will be used in the infra container&#39;s resolv.conf, which will, by default, be shared with all containers in the pod. If not provided, DNS search domains from the host&#39;s resolv.conf will be used. Conflicts with NoInfra&#x3D;true. Optional. |  [optional] |
|**dnsServer** | **List&lt;String&gt;** | DNSServer is a set of DNS servers that will be used in the infra container&#39;s resolv.conf, which will, by default, be shared with all containers in the pod. If not provided, the host&#39;s DNS servers will be used, unless the only server set is a localhost address. As the container cannot connect to the host&#39;s localhost, a default server will instead be set. Conflicts with NoInfra&#x3D;true. Optional. |  [optional] |
|**exitPolicy** | **String** | ExitPolicy determines the pod&#39;s exit and stop behaviour. |  [optional] |
|**hostadd** | **List&lt;String&gt;** | HostAdd is a set of hosts that will be added to the infra container&#39;s etc/hosts that will, by default, be shared with all containers in the pod. Conflicts with NoInfra&#x3D;true and NoManageHosts. Optional. |  [optional] |
|**hostname** | **String** | Hostname is the pod&#39;s hostname. If not set, the name of the pod will be used (if a name was not provided here, the name auto-generated for the pod will be used). This will be used by the infra container and all containers in the pod as long as the UTS namespace is shared. Optional. |  [optional] |
|**idmappings** | [**IDMappingOptions**](IDMappingOptions.md) |  |  [optional] |
|**imageVolumes** | [**List&lt;ImageVolume&gt;**](ImageVolume.md) | Image volumes bind-mount a container-image mount into the pod&#39;s infra container. Optional. |  [optional] |
|**infraCommand** | **List&lt;String&gt;** | InfraCommand sets the command that will be used to start the infra container. If not set, the default set in the Libpod configuration file will be used. Conflicts with NoInfra&#x3D;true. Optional. |  [optional] |
|**infraConmonPidFile** | **String** | InfraConmonPidFile is a custom path to store the infra container&#39;s conmon PID. |  [optional] |
|**infraImage** | **String** | InfraImage is the image that will be used for the infra container. If not set, the default set in the Libpod configuration file will be used. Conflicts with NoInfra&#x3D;true. Optional. |  [optional] |
|**infraName** | **String** | InfraName is the name that will be used for the infra container. If not set, the default set in the Libpod configuration file will be used. Conflicts with NoInfra&#x3D;true. Optional. |  [optional] |
|**ipcns** | [**Namespace**](Namespace.md) |  |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Labels are key-value pairs that are used to add metadata to pods. Optional. |  [optional] |
|**mounts** | [**List&lt;Mount&gt;**](Mount.md) | Mounts are mounts that will be added to the pod. These will supersede Image Volumes and VolumesFrom volumes where there are conflicts. Optional. |  [optional] |
|**name** | **String** | Name is the name of the pod. If not provided, a name will be generated when the pod is created. Optional. |  [optional] |
|**netns** | [**Namespace**](Namespace.md) |  |  [optional] |
|**networkOptions** | **Map&lt;String, List&lt;String&gt;&gt;** | NetworkOptions are additional options for each network Optional. |  [optional] |
|**noInfra** | **Boolean** | NoInfra tells the pod not to create an infra container. If this is done, many networking-related options will become unavailable. Conflicts with setting any options in PodNetworkConfig, and the InfraCommand and InfraImages in this struct. Optional. |  [optional] |
|**noManageHosts** | **Boolean** | NoManageHosts indicates that /etc/hosts should not be managed by the pod. Instead, each container will create a separate /etc/hosts as they would if not in a pod. Conflicts with HostAdd. |  [optional] |
|**noManageResolvConf** | **Boolean** | NoManageResolvConf indicates that /etc/resolv.conf should not be managed by the pod. Instead, each container will create and manage a separate resolv.conf as if they had not joined a pod. Conflicts with NoInfra&#x3D;true and DNSServer, DNSSearch, DNSOption. Optional. |  [optional] |
|**overlayVolumes** | [**List&lt;OverlayVolume&gt;**](OverlayVolume.md) | Overlay volumes are named volumes that will be added to the pod. Optional. |  [optional] |
|**pidns** | [**Namespace**](Namespace.md) |  |  [optional] |
|**podCreateCommand** | **List&lt;String&gt;** |  |  [optional] |
|**podDevices** | **List&lt;String&gt;** | Devices contains user specified Devices to be added to the Pod |  [optional] |
|**portmappings** | [**List&lt;PortMapping&gt;**](PortMapping.md) | PortMappings is a set of ports to map into the infra container. As, by default, containers share their network with the infra container, this will forward the ports to the entire pod. Only available if NetNS is set to Bridge, Slirp, or Pasta. Optional. |  [optional] |
|**resourceLimits** | [**LinuxResources**](LinuxResources.md) |  |  [optional] |
|**restartPolicy** | **String** | RestartPolicy is the pod&#39;s restart policy - an action which will be taken when one or all the containers in the pod exits. If not given, the default policy will be set to Always, which restarts the containers in the pod when they exit indefinitely. Optional. |  [optional] |
|**restartTries** | **Integer** | RestartRetries is the number of attempts that will be made to restart the container. Only available when RestartPolicy is set to \&quot;on-failure\&quot;. Optional. |  [optional] |
|**securityOpt** | **List&lt;String&gt;** |  |  [optional] |
|**serviceContainerID** | **String** | The ID of the pod&#39;s service container. |  [optional] |
|**shareParent** | **Boolean** | PodCreateCommand is the command used to create this pod. This will be shown in the output of Inspect() on the pod, and may also be used by some tools that wish to recreate the pod (e.g. &#x60;podman generate systemd --new&#x60;). Optional. ShareParent determines if all containers in the pod will share the pod&#39;s cgroup as the cgroup parent |  [optional] |
|**sharedNamespaces** | **List&lt;String&gt;** | SharedNamespaces instructs the pod to share a set of namespaces. Shared namespaces will be joined (by default) by every container which joins the pod. If not set and NoInfra is false, the pod will set a default set of namespaces to share. Conflicts with NoInfra&#x3D;true. Optional. |  [optional] |
|**shmSize** | **Long** | ShmSize is the size of the tmpfs to mount in at /dev/shm, in bytes. Conflicts with ShmSize if IpcNS is not private. Optional. |  [optional] |
|**shmSizeSystemd** | **Long** | ShmSizeSystemd is the size of systemd-specific tmpfs mounts specifically /run, /run/lock, /var/log/journal and /tmp. Optional |  [optional] |
|**sysctl** | **Map&lt;String, String&gt;** | Sysctl sets kernel parameters for the pod |  [optional] |
|**throttleReadBpsDevice** | [**Map&lt;String, LinuxThrottleDevice&gt;**](LinuxThrottleDevice.md) | ThrottleReadBpsDevice contains the rate at which the devices in the pod can be read from/accessed |  [optional] |
|**userns** | [**Namespace**](Namespace.md) |  |  [optional] |
|**utsns** | [**Namespace**](Namespace.md) |  |  [optional] |
|**volumes** | [**List&lt;NamedVolume&gt;**](NamedVolume.md) | Volumes are named volumes that will be added to the pod. These will supersede Image Volumes and VolumesFrom  volumes where there are conflicts. Optional. |  [optional] |
|**volumesFrom** | **List&lt;String&gt;** | VolumesFrom is a set of containers whose volumes will be added to this pod. The name or ID of the container must be provided, and may optionally be followed by a : and then one or more comma-separated options. Valid options are &#39;ro&#39;, &#39;rw&#39;, and &#39;z&#39;. Options will be used for all volumes sourced from the container. |  [optional] |


## Implemented Interfaces

* Serializable


