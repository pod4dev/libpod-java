

# UpdateHealthCheckConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
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
|**noHealthcheck** | **Boolean** | Disable healthchecks on container. |  [optional] |


## Implemented Interfaces

* Serializable


