

# ContainerUpdateRequest

Container update

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blkioDeviceReadBps** | [**List&lt;ThrottleDevice&gt;**](ThrottleDevice.md) |  |  [optional] |
|**blkioDeviceReadIOps** | [**List&lt;ThrottleDevice&gt;**](ThrottleDevice.md) |  |  [optional] |
|**blkioDeviceWriteBps** | [**List&lt;ThrottleDevice&gt;**](ThrottleDevice.md) |  |  [optional] |
|**blkioDeviceWriteIOps** | [**List&lt;ThrottleDevice&gt;**](ThrottleDevice.md) |  |  [optional] |
|**blkioWeight** | **Integer** |  |  [optional] |
|**blkioWeightDevice** | [**List&lt;WeightDevice&gt;**](WeightDevice.md) |  |  [optional] |
|**cgroupParent** | **String** | Applicable to UNIX platforms |  [optional] |
|**cpuCount** | **Long** | Applicable to Windows |  [optional] |
|**cpuPercent** | **Long** |  |  [optional] |
|**cpuPeriod** | **Long** |  |  [optional] |
|**cpuQuota** | **Long** |  |  [optional] |
|**cpuRealtimePeriod** | **Long** |  |  [optional] |
|**cpuRealtimeRuntime** | **Long** |  |  [optional] |
|**cpuShares** | **Long** | Applicable to all platforms |  [optional] |
|**cpusetCpus** | **String** |  |  [optional] |
|**cpusetMems** | **String** |  |  [optional] |
|**deviceCgroupRules** | **List&lt;String&gt;** |  |  [optional] |
|**deviceRequests** | [**List&lt;DeviceRequest&gt;**](DeviceRequest.md) |  |  [optional] |
|**devices** | [**List&lt;DeviceMapping&gt;**](DeviceMapping.md) |  |  [optional] |
|**ioMaximumBandwidth** | **Integer** |  |  [optional] |
|**ioMaximumIOps** | **Integer** |  |  [optional] |
|**kernelMemory** | **Long** | KernelMemory specifies the kernel memory limit (in bytes) for the container. Deprecated: kernel 5.4 deprecated kmem.limit_in_bytes. |  [optional] |
|**kernelMemoryTCP** | **Long** |  |  [optional] |
|**memory** | **Long** |  |  [optional] |
|**memoryReservation** | **Long** |  |  [optional] |
|**memorySwap** | **Long** |  |  [optional] |
|**memorySwappiness** | **Long** |  |  [optional] |
|**nanoCpus** | **Long** |  |  [optional] |
|**oomKillDisable** | **Boolean** |  |  [optional] |
|**pidsLimit** | **Long** |  |  [optional] |
|**restartPolicy** | [**RestartPolicy**](RestartPolicy.md) |  |  [optional] |
|**ulimits** | [**List&lt;Ulimit&gt;**](Ulimit.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


