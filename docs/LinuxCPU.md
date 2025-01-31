

# LinuxCPU

LinuxCPU for Linux cgroup 'cpu' resource management

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**burst** | **Integer** | CPU hardcap burst limit (in usecs). Allowed accumulated cpu time additionally for burst in a given period. |  [optional] |
|**cpus** | **String** | CPUs to use within the cpuset. Default is to use any CPU available. |  [optional] |
|**idle** | **Long** | cgroups are configured with minimum weight, 0: default behavior, 1: SCHED_IDLE. |  [optional] |
|**mems** | **String** | List of memory nodes in the cpuset. Default is to use any available memory node. |  [optional] |
|**period** | **Integer** | CPU period to be used for hardcapping (in usecs). |  [optional] |
|**quota** | **Long** | CPU hardcap limit (in usecs). Allowed cpu time in a given period. |  [optional] |
|**realtimePeriod** | **Integer** | CPU period to be used for realtime scheduling (in usecs). |  [optional] |
|**realtimeRuntime** | **Long** | How much time realtime scheduling may use (in usecs). |  [optional] |
|**shares** | **Integer** | CPU shares (relative weight (ratio) vs. other cgroups with cpu shares). |  [optional] |


## Implemented Interfaces

* Serializable


