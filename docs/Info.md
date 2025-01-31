

# Info

Info contains information about the Volume as a whole as provided by the CSI storage plugin.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessibleTopology** | [**List&lt;Topology&gt;**](Topology.md) | AccessibleTopology is the topology this volume is actually accessible from. |  [optional] |
|**capacityBytes** | **Long** | CapacityBytes is the capacity of the volume in bytes. A value of 0 indicates that the capacity is unknown. |  [optional] |
|**volumeContext** | **Map&lt;String, String&gt;** | VolumeContext is the context originating from the CSI storage plugin when the Volume is created. |  [optional] |
|**volumeID** | **String** | VolumeID is the ID of the Volume as seen by the CSI storage plugin. This is distinct from the Volume&#39;s Swarm ID, which is the ID used by all of the Docker Engine to refer to the Volume. If this field is blank, then the Volume has not been successfully created yet. |  [optional] |


## Implemented Interfaces

* Serializable


