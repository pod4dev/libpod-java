

# InspectMount

InspectMount provides a record of a single mount in a container. It contains fields for both named and normal volumes. Only user-specified volumes will be included, and tmpfs volumes are not included even if the user specified them.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destination** | **String** | The destination directory for the volume. Specified as a path within the container, as it would be passed into the OCI runtime. |  [optional] |
|**driver** | **String** | The driver used for the named volume. Empty for bind mounts. |  [optional] |
|**mode** | **String** | Contains SELinux :z/:Z mount options. Unclear what, if anything, else goes in here. |  [optional] |
|**name** | **String** | The name of the volume. Empty for bind mounts. |  [optional] |
|**options** | **List&lt;String&gt;** | All remaining mount options. Additional data, not present in the original output. |  [optional] |
|**propagation** | **String** | Mount propagation for the mount. Can be empty if not specified, but is always printed - no omitempty. |  [optional] |
|**RW** | **Boolean** | Whether the volume is read-write |  [optional] |
|**source** | **String** | The source directory for the volume. |  [optional] |
|**subPath** | **String** | SubPath object from the volume. Specified as a path within the source volume to be mounted at the Destination. |  [optional] |
|**type** | **String** | Whether the mount is a volume or bind mount. Allowed values are \&quot;volume\&quot; and \&quot;bind\&quot;. |  [optional] |


## Implemented Interfaces

* Serializable


