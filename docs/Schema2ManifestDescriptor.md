

# Schema2ManifestDescriptor

This is publicly visible as c/image/manifest.Schema2ManifestDescriptor.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**digest** | **String** | The following is an example of the contents of Digest types:  sha256:7173b809ca12ec5dee4506cd86be934c4596dd234ee82c0662eac04a8c2c71dc  This allows to abstract the digest behind this type and work only in those terms. |  [optional] |
|**mediaType** | **String** |  |  [optional] |
|**platform** | [**Schema2PlatformSpec**](Schema2PlatformSpec.md) |  |  [optional] |
|**size** | **Long** |  |  [optional] |
|**urls** | **List&lt;String&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


