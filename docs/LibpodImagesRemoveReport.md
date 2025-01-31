

# LibpodImagesRemoveReport

LibpodImagesRemoveReport is the return type for image removal via the rest api.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deleted** | **List&lt;String&gt;** | Deleted images. |  [optional] |
|**errors** | **List&lt;String&gt;** | Image removal requires is to return data and an error. |  [optional] |
|**exitCode** | **Long** | ExitCode describes the exit codes as described in the &#x60;podman rmi&#x60; man page. |  [optional] |
|**untagged** | **List&lt;String&gt;** | Untagged images. Can be longer than Deleted. |  [optional] |


## Implemented Interfaces

* Serializable


