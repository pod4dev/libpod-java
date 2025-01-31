

# PublishStatus

PublishStatus represents the status of the volume as published to an individual node

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nodeID** | **String** | NodeID is the ID of the swarm node this Volume is published to. |  [optional] |
|**publishContext** | **Map&lt;String, String&gt;** | PublishContext is the PublishContext returned by the CSI plugin when a volume is published. |  [optional] |
|**state** | **String** | PublishState represents the state of a Volume as it pertains to its use on a particular Node. |  [optional] |


## Implemented Interfaces

* Serializable


