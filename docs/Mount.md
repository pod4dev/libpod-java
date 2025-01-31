

# Mount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bindOptions** | [**BindOptions**](BindOptions.md) |  |  [optional] |
|**clusterOptions** | **Object** |  |  [optional] |
|**consistency** | **String** |  |  [optional] |
|**readOnly** | **Boolean** |  |  [optional] |
|**source** | **String** | Source specifies the name of the mount. Depending on mount type, this may be a volume name or a host path, or even ignored. Source is not supported for tmpfs (must be an empty value) |  [optional] |
|**target** | **String** |  |  [optional] |
|**tmpfsOptions** | [**TmpfsOptions**](TmpfsOptions.md) |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**volumeOptions** | [**VolumeOptions**](VolumeOptions.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


