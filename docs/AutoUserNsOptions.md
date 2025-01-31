

# AutoUserNsOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalGIDMappings** | [**List&lt;IDMap&gt;**](IDMap.md) | AdditionalGIDMappings specified additional GID mappings to include in the generated user namespace. |  [optional] |
|**additionalUIDMappings** | [**List&lt;IDMap&gt;**](IDMap.md) | AdditionalUIDMappings specified additional UID mappings to include in the generated user namespace. |  [optional] |
|**groupFile** | **String** | GroupFile to use if the container uses a volume. |  [optional] |
|**initialSize** | **Integer** | InitialSize defines the minimum size for the user namespace. The created user namespace will have at least this size. |  [optional] |
|**passwdFile** | **String** | PasswdFile to use if the container uses a volume. |  [optional] |
|**size** | **Integer** | Size defines the size for the user namespace.  If it is set to a value bigger than 0, the user namespace will have exactly this size. If it is not set, some heuristics will be used to find its size. |  [optional] |


## Implemented Interfaces

* Serializable


