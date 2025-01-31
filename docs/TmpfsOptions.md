

# TmpfsOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | **Integer** | The bits have the same definition on all systems, so that information about files can be moved from one system to another portably. Not all bits apply to all systems. The only required bit is [ModeDir] for directories. |  [optional] |
|**options** | **List&lt;List&lt;String&gt;&gt;** | Options to be passed to the tmpfs mount. An array of arrays. Flag options should be provided as 1-length arrays. Other types should be provided as 2-length arrays, where the first item is the key and the second the value. |  [optional] |
|**sizeBytes** | **Long** | Size sets the size of the tmpfs, in bytes.  This will be converted to an operating system specific value depending on the host. For example, on linux, it will be converted to use a &#39;k&#39;, &#39;m&#39; or &#39;g&#39; syntax. BSD, though not widely supported with docker, uses a straight byte value.  Percentages are not supported. |  [optional] |


## Implemented Interfaces

* Serializable


