

# ContainerHealthCheckConfig

ContainerHealthCheckConfig describes a container healthcheck with attributes like command, retries, interval, start period, and timeout.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**healthCheckOnFailureAction** | **Long** | HealthCheckOnFailureAction defines how Podman reacts when a container&#39;s health status turns unhealthy. |  [optional] |
|**healthLogDestination** | **String** | HealthLogDestination defines the destination where the log is stored. TODO (6.0): In next major release convert it to pointer and use omitempty |  [optional] |
|**healthMaxLogCount** | **Integer** | HealthMaxLogCount is maximum number of attempts in the HealthCheck log file. (&#39;0&#39; value means an infinite number of attempts in the log file). TODO (6.0): In next major release convert it to pointer and use omitempty |  [optional] |
|**healthMaxLogSize** | **Integer** | HealthMaxLogSize is the maximum length in characters of stored HealthCheck log (\&quot;0\&quot; value means an infinite log length). TODO (6.0): In next major release convert it to pointer and use omitempty |  [optional] |
|**healthconfig** | [**Schema2HealthConfig**](Schema2HealthConfig.md) |  |  [optional] |
|**startupHealthConfig** | [**StartupHealthCheck**](StartupHealthCheck.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


