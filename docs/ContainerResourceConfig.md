

# ContainerResourceConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**intelRdt** | [**LinuxIntelRdt**](LinuxIntelRdt.md) |  |  [optional] |
|**oomScoreAdj** | **Long** | OOMScoreAdj adjusts the score used by the OOM killer to determine processes to kill for the container&#39;s process. Optional. |  [optional] |
|**rLimits** | [**List&lt;POSIXRlimit&gt;**](POSIXRlimit.md) | Rlimits are POSIX rlimits to apply to the container. Optional. |  [optional] |
|**resourceLimits** | [**LinuxResources**](LinuxResources.md) |  |  [optional] |
|**throttleReadBpsDevice** | [**Map&lt;String, LinuxThrottleDevice&gt;**](LinuxThrottleDevice.md) | IO read rate limit per cgroup per device, bytes per second |  [optional] |
|**throttleReadIOPSDevice** | [**Map&lt;String, LinuxThrottleDevice&gt;**](LinuxThrottleDevice.md) | IO read rate limit per cgroup per device, IO per second |  [optional] |
|**throttleWriteBpsDevice** | [**Map&lt;String, LinuxThrottleDevice&gt;**](LinuxThrottleDevice.md) | IO write rate limit per cgroup per device, bytes per second |  [optional] |
|**throttleWriteIOPSDevice** | [**Map&lt;String, LinuxThrottleDevice&gt;**](LinuxThrottleDevice.md) | IO write rate limit per cgroup per device, IO per second |  [optional] |
|**unified** | **Map&lt;String, String&gt;** | CgroupConf are key-value options passed into the container runtime that are used to configure cgroup v2. Optional. |  [optional] |
|**weightDevice** | [**Map&lt;String, LinuxWeightDevice&gt;**](LinuxWeightDevice.md) | Weight per cgroup per device, can override BlkioWeight |  [optional] |


## Implemented Interfaces

* Serializable


