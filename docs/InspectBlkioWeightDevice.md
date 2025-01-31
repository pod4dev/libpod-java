

# InspectBlkioWeightDevice

InspectBlkioWeightDevice holds information about the relative weight of an individual device node. Weights are used in the I/O scheduler to give relative priority to some accesses.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**path** | **String** | Path is the path to the device this applies to. |  [optional] |
|**weight** | **Integer** | Weight is the relative weight the scheduler will use when scheduling I/O. |  [optional] |


## Implemented Interfaces

* Serializable


