

# PodResourceConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cpuPeriod** | **Integer** | CPU period of the cpuset, determined by --cpus |  [optional] |
|**cpuQuota** | **Long** | CPU quota of the cpuset, determined by --cpus |  [optional] |
|**resourceLimits** | [**LinuxResources**](LinuxResources.md) |  |  [optional] |
|**throttleReadBpsDevice** | [**Map&lt;String, LinuxThrottleDevice&gt;**](LinuxThrottleDevice.md) | ThrottleReadBpsDevice contains the rate at which the devices in the pod can be read from/accessed |  [optional] |


## Implemented Interfaces

* Serializable


