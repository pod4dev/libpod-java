

# LogConfigLibpod

LogConfig describes the logging characteristics for a container

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**driver** | **String** | LogDriver is the container&#39;s log driver. Optional. |  [optional] |
|**options** | **Map&lt;String, String&gt;** | A set of options to accompany the log driver. Optional. |  [optional] |
|**path** | **String** | LogPath is the path the container&#39;s logs will be stored at. Only available if LogDriver is set to \&quot;json-file\&quot; or \&quot;k8s-file\&quot;. Optional. |  [optional] |
|**size** | **Long** | Size is the maximum size of the log file Optional. |  [optional] |


## Implemented Interfaces

* Serializable


