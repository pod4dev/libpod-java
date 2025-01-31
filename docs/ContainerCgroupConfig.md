

# ContainerCgroupConfig

ContainerCgroupConfig contains configuration information about a container's cgroups.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cgroupParent** | **String** | CgroupParent is the container&#39;s Cgroup parent. If not set, the default for the current cgroup driver will be used. Optional. |  [optional] |
|**cgroupns** | [**Namespace**](Namespace.md) |  |  [optional] |
|**cgroupsMode** | **String** | CgroupsMode sets a policy for how cgroups will be created for the container, including the ability to disable creation entirely. Optional. |  [optional] |


## Implemented Interfaces

* Serializable


