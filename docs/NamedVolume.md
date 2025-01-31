

# NamedVolume

NamedVolume holds information about a named volume that will be mounted into the container.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dest** | **String** | Destination to mount the named volume within the container. Must be an absolute path. Path will be created if it does not exist. |  [optional] |
|**isAnonymous** | **Boolean** | IsAnonymous sets the named volume as anonymous even if it has a name This is used for emptyDir volumes from a kube yaml |  [optional] |
|**name** | **String** | Name is the name of the named volume to be mounted. May be empty. If empty, a new named volume with a pseudorandomly generated name will be mounted at the given destination. |  [optional] |
|**options** | **List&lt;String&gt;** | Options are options that the named volume will be mounted with. |  [optional] |
|**subPath** | **String** | SubPath stores the sub directory of the named volume to be mounted in the container |  [optional] |


## Implemented Interfaces

* Serializable


