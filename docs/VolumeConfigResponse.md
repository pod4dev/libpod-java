

# VolumeConfigResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**anonymous** | **Boolean** | Anonymous indicates that the volume was created as an anonymous volume for a specific container, and will be removed when any container using it is removed. |  [optional] |
|**createdAt** | **OffsetDateTime** | CreatedAt is the date and time the volume was created at. This is not stored for older Libpod volumes; if so, it will be omitted. |  [optional] |
|**driver** | **String** | Driver is the driver used to create the volume. If set to \&quot;local\&quot; or \&quot;\&quot;, the Local driver (Podman built-in code) is used to service the volume; otherwise, a volume plugin with the given name is used to mount and manage the volume. |  [optional] |
|**GID** | **Long** | GID is the GID that the volume was created with. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Labels includes the volume&#39;s configured labels, key:value pairs that can be passed during volume creation to provide information for third party tools. |  [optional] |
|**lockNumber** | **Integer** | LockNumber is the number of the volume&#39;s Libpod lock. |  [optional] |
|**mountCount** | **Integer** | MountCount is the number of times this volume has been mounted. |  [optional] |
|**mountpoint** | **String** | Mountpoint is the path on the host where the volume is mounted. |  [optional] |
|**name** | **String** | Name is the name of the volume. |  [optional] |
|**needsChown** | **Boolean** | NeedsChown indicates that the next time the volume is mounted into a container, the container will chown the volume to the container process UID/GID. |  [optional] |
|**needsCopyUp** | **Boolean** | NeedsCopyUp indicates that the next time the volume is mounted into |  [optional] |
|**options** | **Map&lt;String, String&gt;** | Options is a set of options that were used when creating the volume. For the Local driver, these are mount options that will be used to determine how a local filesystem is mounted; they are handled as parameters to Mount in a manner described in the volume create manpage. For non-local drivers, these are passed as-is to the volume plugin. |  [optional] |
|**scope** | **String** | Scope is unused and provided solely for Docker compatibility. It is unconditionally set to \&quot;local\&quot;. |  [optional] |
|**status** | **Map&lt;String, Object&gt;** | Status is used to return information on the volume&#39;s current state, if the volume was created using a volume plugin (uses a Driver that is not the local driver). Status is provided to us by an external program, so no guarantees are made about its format or contents. Further, it is an optional field, so it may not be set even in cases where a volume plugin is in use. |  [optional] |
|**storageID** | **String** | StorageID is the ID of the container backing the volume in c/storage. Only used with Image Volumes. |  [optional] |
|**timeout** | **Integer** | Timeout is the specified driver timeout if given |  [optional] |
|**UID** | **Long** | UID is the UID that the volume was created with. |  [optional] |


## Implemented Interfaces

* Serializable


