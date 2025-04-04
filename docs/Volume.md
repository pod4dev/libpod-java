

# Volume

Volume volume

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**driver** | **String** | Name of the volume driver used by the volume. |  |
|**labels** | **Map&lt;String, String&gt;** | User-defined key/value metadata. |  |
|**mountpoint** | **String** | Mount path of the volume on the host. |  |
|**name** | **String** | Name of the volume. |  |
|**options** | **Map&lt;String, String&gt;** | The driver specific options used when creating the volume. |  |
|**scope** | **String** | The level at which the volume exists. Either &#x60;global&#x60; for cluster-wide, or &#x60;local&#x60; for machine level. |  |
|**clusterVolume** | [**ClusterVolume**](ClusterVolume.md) |  |  [optional] |
|**createdAt** | **String** | Date/Time the volume was created. |  [optional] |
|**status** | **Map&lt;String, Object&gt;** | Low-level details about the volume, provided by the volume driver. Details are returned as a map with key/value pairs: &#x60;{\&quot;key\&quot;:\&quot;value\&quot;,\&quot;key2\&quot;:\&quot;value2\&quot;}&#x60;.  The &#x60;Status&#x60; field is optional, and is omitted if the volume driver does not support this feature. |  [optional] |
|**usageData** | [**UsageData**](UsageData.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


