

# ContainerJSON

ContainerJSON is newly used struct along with MountPoint

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appArmorProfile** | **String** |  |  [optional] |
|**args** | **List&lt;String&gt;** |  |  [optional] |
|**config** | [**Config**](Config.md) |  |  [optional] |
|**created** | **String** |  |  [optional] |
|**driver** | **String** |  |  [optional] |
|**execIDs** | **List&lt;String&gt;** |  |  [optional] |
|**graphDriver** | [**GraphDriverData**](GraphDriverData.md) |  |  [optional] |
|**hostConfig** | [**HostConfig**](HostConfig.md) |  |  [optional] |
|**hostnamePath** | **String** |  |  [optional] |
|**hostsPath** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**image** | **String** |  |  [optional] |
|**logPath** | **String** |  |  [optional] |
|**mountLabel** | **String** |  |  [optional] |
|**mounts** | [**List&lt;MountPoint&gt;**](MountPoint.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**networkSettings** | [**NetworkSettings**](NetworkSettings.md) |  |  [optional] |
|**node** | [**ContainerNode**](ContainerNode.md) |  |  [optional] |
|**path** | **String** |  |  [optional] |
|**platform** | **String** |  |  [optional] |
|**processLabel** | **String** |  |  [optional] |
|**resolvConfPath** | **String** |  |  [optional] |
|**restartCount** | **Long** |  |  [optional] |
|**sizeRootFs** | **Long** |  |  [optional] |
|**sizeRw** | **Long** |  |  [optional] |
|**state** | [**ContainerState**](ContainerState.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


