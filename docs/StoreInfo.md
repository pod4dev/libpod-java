

# StoreInfo

StoreInfo describes the container storage and its attributes

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**configFile** | **String** |  |  [optional] |
|**containerStore** | [**ContainerStore**](ContainerStore.md) |  |  [optional] |
|**graphDriverName** | **String** |  |  [optional] |
|**graphOptions** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**graphRoot** | **String** |  |  [optional] |
|**graphRootAllocated** | **Integer** | GraphRootAllocated is how much space the graphroot has in bytes |  [optional] |
|**graphRootUsed** | **Integer** | GraphRootUsed is how much of graphroot is used in bytes |  [optional] |
|**graphStatus** | **Map&lt;String, String&gt;** |  |  [optional] |
|**imageCopyTmpDir** | **String** |  |  [optional] |
|**imageStore** | [**ImageStore**](ImageStore.md) |  |  [optional] |
|**runRoot** | **String** |  |  [optional] |
|**transientStore** | **Boolean** |  |  [optional] |
|**volumePath** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


