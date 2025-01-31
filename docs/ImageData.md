

# ImageData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**annotations** | **Map&lt;String, String&gt;** |  |  [optional] |
|**architecture** | **String** |  |  [optional] |
|**author** | **String** |  |  [optional] |
|**comment** | **String** |  |  [optional] |
|**config** | [**ImageConfig**](ImageConfig.md) |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] |
|**digest** | **String** | The following is an example of the contents of Digest types:  sha256:7173b809ca12ec5dee4506cd86be934c4596dd234ee82c0662eac04a8c2c71dc  This allows to abstract the digest behind this type and work only in those terms. |  [optional] |
|**graphDriver** | [**DriverData**](DriverData.md) |  |  [optional] |
|**healthcheck** | [**Schema2HealthConfig**](Schema2HealthConfig.md) |  |  [optional] |
|**history** | [**List&lt;History&gt;**](History.md) |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**manifestType** | **String** |  |  [optional] |
|**namesHistory** | **List&lt;String&gt;** |  |  [optional] |
|**os** | **String** |  |  [optional] |
|**parent** | **String** |  |  [optional] |
|**repoDigests** | **List&lt;String&gt;** |  |  [optional] |
|**repoTags** | **List&lt;String&gt;** |  |  [optional] |
|**rootFS** | [**RootFS**](RootFS.md) |  |  [optional] |
|**size** | **Long** |  |  [optional] |
|**user** | **String** |  |  [optional] |
|**version** | **String** |  |  [optional] |
|**virtualSize** | **Long** |  |  [optional] |


## Implemented Interfaces

* Serializable


