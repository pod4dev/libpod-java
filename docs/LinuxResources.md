

# LinuxResources

LinuxResources has container runtime resource constraints

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockIO** | [**LinuxBlockIO**](LinuxBlockIO.md) |  |  [optional] |
|**cpu** | [**LinuxCPU**](LinuxCPU.md) |  |  [optional] |
|**devices** | [**List&lt;LinuxDeviceCgroup&gt;**](LinuxDeviceCgroup.md) | Devices configures the device allowlist. |  [optional] |
|**hugepageLimits** | [**List&lt;LinuxHugepageLimit&gt;**](LinuxHugepageLimit.md) | Hugetlb limits (in bytes). Default to reservation limits if supported. |  [optional] |
|**memory** | [**LinuxMemory**](LinuxMemory.md) |  |  [optional] |
|**network** | [**LinuxNetwork**](LinuxNetwork.md) |  |  [optional] |
|**pids** | [**LinuxPids**](LinuxPids.md) |  |  [optional] |
|**rdma** | [**Map&lt;String, LinuxRdma&gt;**](LinuxRdma.md) | Rdma resource restriction configuration. Limits are a set of key value pairs that define RDMA resource limits, where the key is device name and value is resource limits. |  [optional] |
|**unified** | **Map&lt;String, String&gt;** | Unified resources. |  [optional] |


## Implemented Interfaces

* Serializable


