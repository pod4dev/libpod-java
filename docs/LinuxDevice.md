

# LinuxDevice

LinuxDevice represents the mknod information for a Linux special device file

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fileMode** | **Integer** | The bits have the same definition on all systems, so that information about files can be moved from one system to another portably. Not all bits apply to all systems. The only required bit is [ModeDir] for directories. |  [optional] |
|**gid** | **Integer** | Gid of the device. |  [optional] |
|**major** | **Long** | Major is the device&#39;s major number. |  [optional] |
|**minor** | **Long** | Minor is the device&#39;s minor number. |  [optional] |
|**path** | **String** | Path to the device. |  [optional] |
|**type** | **String** | Device type, block, char, etc. |  [optional] |
|**uid** | **Integer** | UID of the device. |  [optional] |


## Implemented Interfaces

* Serializable


