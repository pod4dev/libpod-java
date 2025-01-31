

# ContainerState

ContainerState stores container's running state it's part of ContainerJSONBase and will return by \"inspect\" command

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dead** | **Boolean** |  |  [optional] |
|**error** | **String** |  |  [optional] |
|**exitCode** | **Long** |  |  [optional] |
|**finishedAt** | **String** |  |  [optional] |
|**health** | [**Health**](Health.md) |  |  [optional] |
|**ooMKilled** | **Boolean** |  |  [optional] |
|**paused** | **Boolean** |  |  [optional] |
|**pid** | **Long** |  |  [optional] |
|**restarting** | **Boolean** |  |  [optional] |
|**running** | **Boolean** |  |  [optional] |
|**startedAt** | **String** |  |  [optional] |
|**status** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


