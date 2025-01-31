

# InspectContainerData

InspectContainerData provides a detailed record of a container's configuration and state as viewed by Libpod. Large portions of this structure are defined such that the output is compatible with `docker inspect` JSON, but additional fields have been added as required to share information not in the original output.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appArmorProfile** | **String** |  |  [optional] |
|**args** | **List&lt;String&gt;** |  |  [optional] |
|**boundingCaps** | **List&lt;String&gt;** |  |  [optional] |
|**config** | [**InspectContainerConfig**](InspectContainerConfig.md) |  |  [optional] |
|**conmonPidFile** | **String** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] |
|**dependencies** | **List&lt;String&gt;** |  |  [optional] |
|**driver** | **String** |  |  [optional] |
|**effectiveCaps** | **List&lt;String&gt;** |  |  [optional] |
|**execIDs** | **List&lt;String&gt;** |  |  [optional] |
|**graphDriver** | [**DriverData**](DriverData.md) |  |  [optional] |
|**hostConfig** | [**InspectContainerHostConfig**](InspectContainerHostConfig.md) |  |  [optional] |
|**hostnamePath** | **String** |  |  [optional] |
|**hostsPath** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**image** | **String** |  |  [optional] |
|**imageDigest** | **String** |  |  [optional] |
|**imageName** | **String** |  |  [optional] |
|**isInfra** | **Boolean** |  |  [optional] |
|**isService** | **Boolean** |  |  [optional] |
|**kubeExitCodePropagation** | **String** |  |  [optional] |
|**mountLabel** | **String** |  |  [optional] |
|**mounts** | [**List&lt;InspectMount&gt;**](InspectMount.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**namespace** | **String** |  |  [optional] |
|**networkSettings** | [**InspectNetworkSettings**](InspectNetworkSettings.md) |  |  [optional] |
|**ocIConfigPath** | **String** |  |  [optional] |
|**ocIRuntime** | **String** |  |  [optional] |
|**path** | **String** |  |  [optional] |
|**pidFile** | **String** |  |  [optional] |
|**pod** | **String** |  |  [optional] |
|**processLabel** | **String** |  |  [optional] |
|**resolvConfPath** | **String** |  |  [optional] |
|**restartCount** | **Integer** |  |  [optional] |
|**rootfs** | **String** |  |  [optional] |
|**sizeRootFs** | **Long** |  |  [optional] |
|**sizeRw** | **Long** |  |  [optional] |
|**state** | [**InspectContainerState**](InspectContainerState.md) |  |  [optional] |
|**staticDir** | **String** |  |  [optional] |
|**lockNumber** | **Integer** |  |  [optional] |


## Implemented Interfaces

* Serializable


