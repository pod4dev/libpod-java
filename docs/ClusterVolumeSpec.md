

# ClusterVolumeSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessMode** | [**AccessMode**](AccessMode.md) |  |  [optional] |
|**accessibilityRequirements** | [**TopologyRequirement**](TopologyRequirement.md) |  |  [optional] |
|**availability** | **String** |  |  [optional] |
|**capacityRange** | [**CapacityRange**](CapacityRange.md) |  |  [optional] |
|**group** | **String** | Group defines the volume group of this volume. Volumes belonging to the same group can be referred to by group name when creating Services. Referring to a volume by group instructs swarm to treat volumes in that group interchangeably for the purpose of scheduling. Volumes with an empty string for a group technically all belong to the same, emptystring group. |  [optional] |
|**secrets** | [**List&lt;Secret&gt;**](Secret.md) | Secrets defines Swarm Secrets that are passed to the CSI storage plugin when operating on this volume. |  [optional] |


## Implemented Interfaces

* Serializable


