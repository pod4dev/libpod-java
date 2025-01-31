

# PlayKubeReport


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exitCode** | **Integer** | If set, exit with the specified exit code. |  [optional] |
|**pods** | [**List&lt;PlayKubePod&gt;**](PlayKubePod.md) | Pods - pods created by play kube. |  [optional] |
|**rmReport** | [**List&lt;PodRmReport&gt;**](PodRmReport.md) |  |  [optional] |
|**secretRmReport** | [**List&lt;SecretRmReport&gt;**](SecretRmReport.md) |  |  [optional] |
|**secrets** | [**List&lt;PlaySecret&gt;**](PlaySecret.md) | Secrets - secrets created by play kube |  [optional] |
|**serviceContainerID** | **String** | ServiceContainerID - ID of the service container if one is created |  [optional] |
|**stopReport** | [**List&lt;PodStopReport&gt;**](PodStopReport.md) |  |  [optional] |
|**volumeRmReport** | [**List&lt;VolumeRmReport&gt;**](VolumeRmReport.md) |  |  [optional] |
|**volumes** | [**List&lt;PlayKubeVolume&gt;**](PlayKubeVolume.md) | Volumes - volumes created by play kube. |  [optional] |


## Implemented Interfaces

* Serializable


