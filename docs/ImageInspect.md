

# ImageInspect


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**architecture** | **String** | Architecture is the hardware CPU architecture that the image runs on. |  [optional] |
|**author** | **String** | Author is the name of the author that was specified when committing the image, or as specified through MAINTAINER (deprecated) in the Dockerfile. |  [optional] |
|**comment** | **String** | Comment is an optional message that can be set when committing or importing the image. |  [optional] |
|**config** | [**Config**](Config.md) |  |  [optional] |
|**container** | **String** | Container is for backwards compat but is basically unused |  [optional] |
|**containerConfig** | [**Config**](Config.md) |  |  [optional] |
|**created** | **String** | Created is the date and time at which the image was created, formatted in RFC 3339 nano-seconds (time.RFC3339Nano).  This information is only available if present in the image, and omitted otherwise. |  [optional] |
|**descriptor** | [**Descriptor**](Descriptor.md) |  |  [optional] |
|**dockerVersion** | **String** | DockerVersion is the version of Docker that was used to build the image.  Depending on how the image was created, this field may be empty. |  [optional] |
|**graphDriver** | [**DriverData**](DriverData.md) |  |  [optional] |
|**id** | **String** | ID is the content-addressable ID of an image.  This identifier is a content-addressable digest calculated from the image&#39;s configuration (which includes the digests of layers used by the image).  Note that this digest differs from the &#x60;RepoDigests&#x60; below, which holds digests of image manifests that reference the image. |  [optional] |
|**manifests** | [**List&lt;ManifestSummary&gt;**](ManifestSummary.md) | Manifests is a list of image manifests available in this image. It provides a more detailed view of the platform-specific image manifests or other image-attached data like build attestations.  Only available if the daemon provides a multi-platform image store, the client requests manifests AND does not request a specific platform.  WARNING: This is experimental and may change at any time without any backward compatibility. |  [optional] |
|**metadata** | [**Metadata**](Metadata.md) |  |  [optional] |
|**os** | **String** | OS is the Operating System the image is built to run on. |  [optional] |
|**osVersion** | **String** | OsVersion is the version of the Operating System the image is built to run on (especially for Windows). |  [optional] |
|**parent** | **String** | Parent is the ID of the parent image.  Depending on how the image was created, this field may be empty and is only set for images that were built/created locally. This field is empty if the image was pulled from an image registry. |  [optional] |
|**repoDigests** | **List&lt;String&gt;** | RepoDigests is a list of content-addressable digests of locally available image manifests that the image is referenced from. Multiple manifests can refer to the same image.  These digests are usually only available if the image was either pulled from a registry, or if the image was pushed to a registry, which is when the manifest is generated and its digest calculated. |  [optional] |
|**repoTags** | **List&lt;String&gt;** | RepoTags is a list of image names/tags in the local image cache that reference this image.  Multiple image tags can refer to the same image, and this list may be empty if no tags reference the image, in which case the image is \&quot;untagged\&quot;, in which case it can still be referenced by its ID. |  [optional] |
|**rootFS** | [**RootFS**](RootFS.md) |  |  [optional] |
|**size** | **Long** | Size is the total size of the image including all layers it is composed of. |  [optional] |
|**variant** | **String** | Variant is the CPU architecture variant (presently ARM-only). |  [optional] |
|**virtualSize** | **Long** | VirtualSize is the total size of the image including all layers it is composed of.  Deprecated: this field is omitted in API v1.44, but kept for backward compatibility. Use Size instead. |  [optional] |


## Implemented Interfaces

* Serializable


