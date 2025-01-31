

# ImageVolume

ImageVolume is a volume based on a container image.  The container image is first mounted on the host and is then bind-mounted into the container.  An ImageVolume is always mounted read-only.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destination** | **String** | Destination is the absolute path of the mount in the container. |  [optional] |
|**readWrite** | **Boolean** | ReadWrite sets the volume writable. |  [optional] |
|**source** | **String** | Source is the source of the image volume.  The image can be referred to by name and by ID. |  [optional] |
|**subPath** | **String** | SubPath mounts a particular path within the image. If empty, the whole image is mounted. |  [optional] |


## Implemented Interfaces

* Serializable


