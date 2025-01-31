

# LinuxBlockIO

LinuxBlockIO for Linux cgroup 'blkio' resource management

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**leafWeight** | **Integer** | Specifies tasks&#39; weight in the given cgroup while competing with the cgroup&#39;s child cgroups, CFQ scheduler only |  [optional] |
|**throttleReadBpsDevice** | [**List&lt;LinuxThrottleDevice&gt;**](LinuxThrottleDevice.md) | IO read rate limit per cgroup per device, bytes per second |  [optional] |
|**throttleReadIOPSDevice** | [**List&lt;LinuxThrottleDevice&gt;**](LinuxThrottleDevice.md) | IO read rate limit per cgroup per device, IO per second |  [optional] |
|**throttleWriteBpsDevice** | [**List&lt;LinuxThrottleDevice&gt;**](LinuxThrottleDevice.md) | IO write rate limit per cgroup per device, bytes per second |  [optional] |
|**throttleWriteIOPSDevice** | [**List&lt;LinuxThrottleDevice&gt;**](LinuxThrottleDevice.md) | IO write rate limit per cgroup per device, IO per second |  [optional] |
|**weight** | **Integer** | Specifies per cgroup weight |  [optional] |
|**weightDevice** | [**List&lt;LinuxWeightDevice&gt;**](LinuxWeightDevice.md) | Weight per cgroup per device, can override BlkioWeight |  [optional] |


## Implemented Interfaces

* Serializable


