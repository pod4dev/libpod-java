

# PodStorageConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**imageVolumes** | [**List&lt;ImageVolume&gt;**](ImageVolume.md) | Image volumes bind-mount a container-image mount into the pod&#39;s infra container. Optional. |  [optional] |
|**mounts** | [**List&lt;Mount&gt;**](Mount.md) | Mounts are mounts that will be added to the pod. These will supersede Image Volumes and VolumesFrom volumes where there are conflicts. Optional. |  [optional] |
|**overlayVolumes** | [**List&lt;OverlayVolume&gt;**](OverlayVolume.md) | Overlay volumes are named volumes that will be added to the pod. Optional. |  [optional] |
|**shmSize** | **Long** | ShmSize is the size of the tmpfs to mount in at /dev/shm, in bytes. Conflicts with ShmSize if IpcNS is not private. Optional. |  [optional] |
|**shmSizeSystemd** | **Long** | ShmSizeSystemd is the size of systemd-specific tmpfs mounts specifically /run, /run/lock, /var/log/journal and /tmp. Optional |  [optional] |
|**volumes** | [**List&lt;NamedVolume&gt;**](NamedVolume.md) | Volumes are named volumes that will be added to the pod. These will supersede Image Volumes and VolumesFrom  volumes where there are conflicts. Optional. |  [optional] |
|**volumesFrom** | **List&lt;String&gt;** | VolumesFrom is a set of containers whose volumes will be added to this pod. The name or ID of the container must be provided, and may optionally be followed by a : and then one or more comma-separated options. Valid options are &#39;ro&#39;, &#39;rw&#39;, and &#39;z&#39;. Options will be used for all volumes sourced from the container. |  [optional] |


## Implemented Interfaces

* Serializable


