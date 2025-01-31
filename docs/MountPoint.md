

# MountPoint

This is used for reporting the mountpoints in use by a container.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destination** | **String** | Destination is the path relative to the container root (&#x60;/&#x60;) where the Source is mounted inside the container. |  [optional] |
|**driver** | **String** | Driver is the volume driver used to create the volume (if it is a volume). |  [optional] |
|**mode** | **String** | Mode is a comma separated list of options supplied by the user when creating the bind/volume mount.  The default is platform-specific (&#x60;\&quot;z\&quot;&#x60; on Linux, empty on Windows). |  [optional] |
|**name** | **String** | Name is the name reference to the underlying data defined by &#x60;Source&#x60; e.g., the volume name. |  [optional] |
|**propagation** | **String** |  |  [optional] |
|**RW** | **Boolean** | RW indicates whether the mount is mounted writable (read-write). |  [optional] |
|**source** | **String** | Source is the source location of the mount.  For volumes, this contains the storage location of the volume (within &#x60;/var/lib/docker/volumes/&#x60;). For bind-mounts, and &#x60;npipe&#x60;, this contains the source (host) part of the bind-mount. For &#x60;tmpfs&#x60; mount points, this field is empty. |  [optional] |
|**type** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


