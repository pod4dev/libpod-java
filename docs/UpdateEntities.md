

# UpdateEntities

UpdateEntities used to wrap the oci resource spec in a swagger model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blkIOWeightDevice** | [**List&lt;WeightDevice&gt;**](WeightDevice.md) | Block IO weight (relative device weight) in the form: &#x60;&#x60;&#x60;[{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Weight\&quot;: weight}]&#x60;&#x60;&#x60; |  [optional] |
|**deviceReadBPs** | [**List&lt;ThrottleDevice&gt;**](ThrottleDevice.md) | Limit read rate (bytes per second) from a device, in the form: &#x60;&#x60;&#x60;[{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Rate\&quot;: rate}]&#x60;&#x60;&#x60; |  [optional] |
|**deviceReadIOPs** | [**List&lt;ThrottleDevice&gt;**](ThrottleDevice.md) | Limit read rate (IO per second) from a device, in the form: &#x60;&#x60;&#x60;[{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Rate\&quot;: rate}]&#x60;&#x60;&#x60; |  [optional] |
|**deviceWriteBPs** | [**List&lt;ThrottleDevice&gt;**](ThrottleDevice.md) | Limit write rate (bytes per second) to a device, in the form: &#x60;&#x60;&#x60;[{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Rate\&quot;: rate}]&#x60;&#x60;&#x60; |  [optional] |
|**deviceWriteIOPs** | [**List&lt;ThrottleDevice&gt;**](ThrottleDevice.md) | Limit write rate (IO per second) to a device, in the form: &#x60;&#x60;&#x60;[{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Rate\&quot;: rate}]&#x60;&#x60;&#x60; |  [optional] |
|**env** | **List&lt;String&gt;** |  |  [optional] |
|**unsetEnv** | **List&lt;String&gt;** |  |  [optional] |
|**blockIO** | [**LinuxBlockIO**](LinuxBlockIO.md) |  |  [optional] |
|**cpu** | [**LinuxCPU**](LinuxCPU.md) |  |  [optional] |
|**devices** | [**List&lt;LinuxDeviceCgroup&gt;**](LinuxDeviceCgroup.md) | Devices configures the device allowlist. |  [optional] |
|**healthCmd** | **String** | HealthCmd set a healthcheck command for the container. (&#39;none&#39; disables the existing healthcheck) |  [optional] |
|**healthInterval** | **String** | HealthInterval set an interval for the healthcheck. (a value of disable results in no automatic timer setup) Changing this setting resets timer. |  [optional] |
|**healthLogDestination** | **String** | HealthLogDestination set the destination of the HealthCheck log. Directory path, local or events_logger (local use container state file) Warning: Changing this setting may cause the loss of previous logs! |  [optional] |
|**healthMaxLogCount** | **Integer** | HealthMaxLogCount set maximum number of attempts in the HealthCheck log file. (&#39;0&#39; value means an infinite number of attempts in the log file) |  [optional] |
|**healthMaxLogSize** | **Integer** | HealthMaxLogSize set maximum length in characters of stored HealthCheck log. (&#39;0&#39; value means an infinite log length) |  [optional] |
|**healthOnFailure** | **String** | HealthOnFailure set the action to take once the container turns unhealthy. |  [optional] |
|**healthRetries** | **Integer** | HealthRetries set the number of retries allowed before a healthcheck is considered to be unhealthy. |  [optional] |
|**healthStartPeriod** | **String** | HealthStartPeriod set the initialization time needed for a container to bootstrap. |  [optional] |
|**healthStartupCmd** | **String** | HealthStartupCmd set a startup healthcheck command for the container. |  [optional] |
|**healthStartupInterval** | **String** | HealthStartupInterval set an interval for the startup healthcheck. Changing this setting resets the timer, depending on the state of the container. |  [optional] |
|**healthStartupRetries** | **Integer** | HealthStartupRetries set the maximum number of retries before the startup healthcheck will restart the container. |  [optional] |
|**healthStartupSuccess** | **Integer** | HealthStartupSuccess set the number of consecutive successes before the startup healthcheck is marked as successful and the normal healthcheck begins (0 indicates any success will start the regular healthcheck) |  [optional] |
|**healthStartupTimeout** | **String** | HealthStartupTimeout set the maximum amount of time that the startup healthcheck may take before it is considered failed. |  [optional] |
|**healthTimeout** | **String** | HealthTimeout set the maximum time allowed to complete the healthcheck before an interval is considered failed. |  [optional] |
|**hugepageLimits** | [**List&lt;LinuxHugepageLimit&gt;**](LinuxHugepageLimit.md) | Hugetlb limits (in bytes). Default to reservation limits if supported. |  [optional] |
|**memory** | [**LinuxMemory**](LinuxMemory.md) |  |  [optional] |
|**network** | [**LinuxNetwork**](LinuxNetwork.md) |  |  [optional] |
|**noHealthcheck** | **Boolean** | Disable healthchecks on container. |  [optional] |
|**pids** | [**LinuxPids**](LinuxPids.md) |  |  [optional] |
|**rdma** | [**Map&lt;String, LinuxRdma&gt;**](LinuxRdma.md) | Rdma resource restriction configuration. Limits are a set of key value pairs that define RDMA resource limits, where the key is device name and value is resource limits. |  [optional] |
|**unified** | **Map&lt;String, String&gt;** | Unified resources. |  [optional] |


## Implemented Interfaces

* Serializable


