

# LibpodImageSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**arch** | **String** | Podman extensions |  [optional] |
|**containers** | **Long** |  |  [optional] |
|**created** | **Long** |  |  [optional] |
|**dangling** | **Boolean** |  |  [optional] |
|**digest** | **String** |  |  [optional] |
|**history** | **List&lt;String&gt;** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**isManifestList** | **Boolean** | IsManifestList is a ptr so we can distinguish between a true json empty response and false.  the docker compat side needs to return empty; where as the libpod side needs a value of true or false |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**names** | **List&lt;String&gt;** |  |  [optional] |
|**os** | **String** |  |  [optional] |
|**parentId** | **String** |  |  [optional] |
|**readOnly** | **Boolean** |  |  [optional] |
|**repoDigests** | **List&lt;String&gt;** |  |  [optional] |
|**repoTags** | **List&lt;String&gt;** |  |  [optional] |
|**sharedSize** | **Long** |  |  [optional] |
|**size** | **Long** |  |  [optional] |
|**virtualSize** | **Long** |  |  [optional] |


## Implemented Interfaces

* Serializable


