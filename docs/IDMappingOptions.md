

# IDMappingOptions

IDMappingOptions are used for specifying how ID mapping should be set up for a layer or container.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoUserNs** | **Boolean** |  |  [optional] |
|**autoUserNsOpts** | [**AutoUserNsOptions**](AutoUserNsOptions.md) |  |  [optional] |
|**giDMap** | [**List&lt;IDMap&gt;**](IDMap.md) |  |  [optional] |
|**hostGIDMapping** | **Boolean** |  |  [optional] |
|**hostUIDMapping** | **Boolean** | UIDMap and GIDMap are used for setting up a layer&#39;s root filesystem for use inside of a user namespace where ID mapping is being used. If HostUIDMapping/HostGIDMapping is true, no mapping of the respective type will be used.  Otherwise, if UIDMap and/or GIDMap contain at least one mapping, one or both will be used.  By default, if neither of those conditions apply, if the layer has a parent layer, the parent layer&#39;s mapping will be used, and if it does not have a parent layer, the mapping which was passed to the Store object when it was initialized will be used. |  [optional] |
|**uiDMap** | [**List&lt;IDMap&gt;**](IDMap.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


