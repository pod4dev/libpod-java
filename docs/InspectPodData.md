

# InspectPodData

InspectPodData contains detailed information on a pod's configuration and state. It is used as the output of Inspect on pods.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cgroupParent** | **String** | CgroupParent is the parent of the pod&#39;s Cgroup. |  [optional] |
|**cgroupPath** | **String** | CgroupPath is the path to the pod&#39;s Cgroup. |  [optional] |
|**containers** | [**List&lt;InspectPodContainerInfo&gt;**](InspectPodContainerInfo.md) | Containers gives a brief summary of all containers in the pod and their current status. |  [optional] |
|**createCgroup** | **Boolean** | CreateCgroup is whether this pod will create its own Cgroup to group containers under. |  [optional] |
|**createCommand** | **List&lt;String&gt;** | CreateCommand is the full command plus arguments of the process the container has been created with. |  [optional] |
|**createInfra** | **Boolean** | CreateInfra is whether this pod will create an infra container to share namespaces. |  [optional] |
|**created** | **OffsetDateTime** | Created is the time when the pod was created. |  [optional] |
|**exitPolicy** | **String** | ExitPolicy of the pod. |  [optional] |
|**hostname** | **String** | Hostname is the hostname that the pod will set. |  [optional] |
|**id** | **String** | ID is the ID of the pod. |  [optional] |
|**infraConfig** | [**InspectPodInfraConfig**](InspectPodInfraConfig.md) |  |  [optional] |
|**infraContainerID** | **String** | InfraContainerID is the ID of the pod&#39;s infra container, if one is present. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Labels is a set of key-value labels that have been applied to the pod. |  [optional] |
|**lockNumber** | **Integer** | Number of the pod&#39;s Libpod lock. |  [optional] |
|**name** | **String** | Name is the name of the pod. |  [optional] |
|**namespace** | **String** | Namespace is the Libpod namespace the pod is placed in. |  [optional] |
|**numContainers** | **Integer** | NumContainers is the number of containers in the pod, including the infra container. |  [optional] |
|**restartPolicy** | **String** | RestartPolicy of the pod. |  [optional] |
|**sharedNamespaces** | **List&lt;String&gt;** | SharedNamespaces contains a list of namespaces that will be shared by containers within the pod. Can only be set if CreateInfra is true. |  [optional] |
|**state** | **String** | State represents the current state of the pod. |  [optional] |
|**blkioWeight** | **Integer** | BlkioWeight contains the blkio weight limit for the pod |  [optional] |
|**blkioWeightDevice** | [**List&lt;InspectBlkioWeightDevice&gt;**](InspectBlkioWeightDevice.md) | BlkioWeightDevice contains the blkio weight device limits for the pod |  [optional] |
|**cpuPeriod** | **Integer** | CPUPeriod contains the CPU period of the pod |  [optional] |
|**cpuQuota** | **Long** | CPUQuota contains the CPU quota of the pod |  [optional] |
|**cpuShares** | **Integer** | CPUShares contains the cpu shares for the pod |  [optional] |
|**cpusetCpus** | **String** | CPUSetCPUs contains linux specific CPU data for the pod |  [optional] |
|**cpusetMems** | **String** | CPUSetMems contains linux specific CPU data for the pod |  [optional] |
|**deviceReadBps** | [**List&lt;InspectBlkioThrottleDevice&gt;**](InspectBlkioThrottleDevice.md) | BlkioDeviceReadBps contains the Read/Access limit for the pod&#39;s devices |  [optional] |
|**deviceWriteBps** | [**List&lt;InspectBlkioThrottleDevice&gt;**](InspectBlkioThrottleDevice.md) | BlkioDeviceReadBps contains the Read/Access limit for the pod&#39;s devices |  [optional] |
|**devices** | [**List&lt;InspectDevice&gt;**](InspectDevice.md) | Devices contains the specified host devices |  [optional] |
|**memoryLimit** | **Integer** | MemoryLimit contains the specified cgroup memory limit for the pod |  [optional] |
|**memorySwap** | **Integer** | MemorySwap contains the specified memory swap limit for the pod |  [optional] |
|**mounts** | [**List&lt;InspectMount&gt;**](InspectMount.md) | Mounts contains volume related information for the pod |  [optional] |
|**securityOpt** | **List&lt;String&gt;** | SecurityOpt contains the specified security labels and related SELinux information |  [optional] |
|**volumesFrom** | **List&lt;String&gt;** | VolumesFrom contains the containers that the pod inherits mounts from |  [optional] |


## Implemented Interfaces

* Serializable


