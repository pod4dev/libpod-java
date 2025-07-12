

# ArtifactVolume

ArtifactVolume is a volume based on a artifact. The artifact blobs will be bind mounted directly as files and must always be read only.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destination** | **String** | Destination is the absolute path of the mount in the container. If path is a file in the container, then the artifact must consist of a single blob. Otherwise if it is a directory or does not exists all artifact blobs will be mounted into this path as files. As name the \&quot;org.opencontainers.image.title\&quot; will be used if available otherwise the digest is used as name. |  [optional] |
|**digest** | **String** | Digest can be used to filter a single blob from a multi blob artifact by the given digest. When this option is set the file name in the container defaults to the digest even when the title annotation exist. Optional. Conflicts with Title. |  [optional] |
|**source** | **String** | Source is the name or digest of the artifact that should be mounted |  [optional] |
|**title** | **String** | Title can be used for multi blob artifacts to only mount the one specific blob that matches the \&quot;org.opencontainers.image.title\&quot; annotation. Optional. Conflicts with Digest. |  [optional] |


## Implemented Interfaces

* Serializable


