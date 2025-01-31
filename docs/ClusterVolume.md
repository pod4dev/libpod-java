

# ClusterVolume

ClusterVolume contains options and information specific to, and only present on, Swarm CSI cluster volumes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**ID** | **String** | ID is the Swarm ID of the volume. Because cluster volumes are Swarm objects, they have an ID, unlike non-cluster volumes, which only have a Name. This ID can be used to refer to the cluster volume. |  [optional] |
|**info** | [**Info**](Info.md) |  |  [optional] |
|**publishStatus** | [**List&lt;PublishStatus&gt;**](PublishStatus.md) | PublishStatus contains the status of the volume as it pertains to its publishing on Nodes. |  [optional] |
|**spec** | [**ClusterVolumeSpec**](ClusterVolumeSpec.md) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


