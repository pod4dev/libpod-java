

# InspectContainerState

InspectContainerState provides a detailed record of a container's current state. It is returned as part of InspectContainerData. As with InspectContainerData, many portions of this struct are matched to Docker, but here we see more fields that are unused (nonsensical in the context of Libpod).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cgroupPath** | **String** |  |  [optional] |
|**checkpointLog** | **String** |  |  [optional] |
|**checkpointPath** | **String** |  |  [optional] |
|**checkpointed** | **Boolean** |  |  [optional] |
|**checkpointedAt** | **OffsetDateTime** |  |  [optional] |
|**conmonPid** | **Long** |  |  [optional] |
|**dead** | **Boolean** |  |  [optional] |
|**error** | **String** |  |  [optional] |
|**exitCode** | **Integer** |  |  [optional] |
|**finishedAt** | **OffsetDateTime** |  |  [optional] |
|**health** | [**HealthCheckResults**](HealthCheckResults.md) |  |  [optional] |
|**ooMKilled** | **Boolean** |  |  [optional] |
|**ociVersion** | **String** |  |  [optional] |
|**paused** | **Boolean** |  |  [optional] |
|**pid** | **Long** |  |  [optional] |
|**restarting** | **Boolean** |  |  [optional] |
|**restoreLog** | **String** |  |  [optional] |
|**restored** | **Boolean** |  |  [optional] |
|**restoredAt** | **OffsetDateTime** |  |  [optional] |
|**running** | **Boolean** |  |  [optional] |
|**startedAt** | **OffsetDateTime** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**stoppedByUser** | **Boolean** |  |  [optional] |


## Implemented Interfaces

* Serializable


