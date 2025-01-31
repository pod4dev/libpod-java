

# InspectBlkioThrottleDevice

InspectBlkioThrottleDevice holds information about a speed cap for a device node. This cap applies to a specific operation (read, write, etc) on the given node.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**path** | **String** | Path is the path to the device this applies to. |  [optional] |
|**rate** | **Integer** | Rate is the maximum rate. It is in either bytes per second or iops per second, determined by where it is used - documentation will indicate which is appropriate. |  [optional] |


## Implemented Interfaces

* Serializable


