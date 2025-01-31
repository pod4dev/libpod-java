

# Descriptor

This structure provides `application/vnd.oci.descriptor.v1+json` mediatype when marshalled to JSON.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**annotations** | **Map&lt;String, String&gt;** | Annotations contains arbitrary metadata relating to the targeted content. |  [optional] |
|**artifactType** | **String** | ArtifactType is the IANA media type of this artifact. |  [optional] |
|**data** | **List&lt;Integer&gt;** | Data is an embedding of the targeted content. This is encoded as a base64 string when marshalled to JSON (automatically, by encoding/json). If present, Data can be used directly to avoid fetching the targeted content. |  [optional] |
|**digest** | **String** | The following is an example of the contents of Digest types:  sha256:7173b809ca12ec5dee4506cd86be934c4596dd234ee82c0662eac04a8c2c71dc  This allows to abstract the digest behind this type and work only in those terms. |  [optional] |
|**mediaType** | **String** | MediaType is the media type of the object this schema refers to. |  [optional] |
|**platform** | [**Platform**](Platform.md) |  |  [optional] |
|**size** | **Long** | Size specifies the size in bytes of the blob. |  [optional] |
|**urls** | **List&lt;String&gt;** | URLs specifies a list of URLs from which this object MAY be downloaded |  [optional] |


## Implemented Interfaces

* Serializable


