

# Summary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**containers** | **Long** | Number of containers using this image. Includes both stopped and running containers.  This size is not calculated by default, and depends on which API endpoint is used. &#x60;-1&#x60; indicates that the value has not been set / calculated. |  |
|**created** | **Long** | Date and time at which the image was created as a Unix timestamp (number of seconds since EPOCH). |  |
|**id** | **String** | ID is the content-addressable ID of an image.  This identifier is a content-addressable digest calculated from the image&#39;s configuration (which includes the digests of layers used by the image).  Note that this digest differs from the &#x60;RepoDigests&#x60; below, which holds digests of image manifests that reference the image. |  |
|**labels** | **Map&lt;String, String&gt;** | User-defined key/value metadata. |  |
|**parentId** | **String** | ID of the parent image.  Depending on how the image was created, this field may be empty and is only set for images that were built/created locally. This field is empty if the image was pulled from an image registry. |  |
|**repoDigests** | **List&lt;String&gt;** | List of content-addressable digests of locally available image manifests that the image is referenced from. Multiple manifests can refer to the same image.  These digests are usually only available if the image was either pulled from a registry, or if the image was pushed to a registry, which is when the manifest is generated and its digest calculated. |  |
|**repoTags** | **List&lt;String&gt;** | List of image names/tags in the local image cache that reference this image.  Multiple image tags can refer to the same image, and this list may be empty if no tags reference the image, in which case the image is \&quot;untagged\&quot;, in which case it can still be referenced by its ID. |  |
|**sharedSize** | **Long** | Total size of image layers that are shared between this image and other images.  This size is not calculated by default. &#x60;-1&#x60; indicates that the value has not been set / calculated. |  |
|**size** | **Long** | Total size of the image including all layers it is composed of. |  |
|**manifests** | [**List&lt;ManifestSummary&gt;**](ManifestSummary.md) | Manifests is a list of image manifests available in this image.  It provides a more detailed view of the platform-specific image manifests or other image-attached data like build attestations.  WARNING: This is experimental and may change at any time without any backward compatibility. |  [optional] |
|**virtualSize** | **Long** | Total size of the image including all layers it is composed of.  Deprecated: this field is omitted in API v1.44, but kept for backward compatibility. Use Size instead. |  [optional] |


## Implemented Interfaces

* Serializable


