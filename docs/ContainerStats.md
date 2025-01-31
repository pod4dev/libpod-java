

# ContainerStats

ContainerStats contains the statistics information for a running container

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**avgCPU** | **Double** |  |  [optional] |
|**blockInput** | **Integer** |  |  [optional] |
|**blockOutput** | **Integer** |  |  [optional] |
|**CPU** | **Double** |  |  [optional] |
|**cpUNano** | **Integer** |  |  [optional] |
|**cpUSystemNano** | **Integer** |  |  [optional] |
|**containerID** | **String** |  |  [optional] |
|**duration** | **Integer** |  |  [optional] |
|**memLimit** | **Integer** |  |  [optional] |
|**memPerc** | **Double** |  |  [optional] |
|**memUsage** | **Integer** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**network** | [**Map&lt;String, ContainerNetworkStats&gt;**](ContainerNetworkStats.md) | Map of interface name to network statistics for that interface. |  [optional] |
|**piDs** | **Integer** |  |  [optional] |
|**perCPU** | **List&lt;Integer&gt;** |  |  [optional] |
|**systemNano** | **Integer** |  |  [optional] |
|**upTime** | **Long** | A Duration represents the elapsed time between two instants as an int64 nanosecond count. The representation limits the largest representable duration to approximately 290 years. |  [optional] |


## Implemented Interfaces

* Serializable


