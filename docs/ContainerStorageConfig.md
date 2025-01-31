

# ContainerStorageConfig

ContainerStorageConfig contains information on the storage configuration of a container.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chrootDirectories** | **List&lt;String&gt;** | ChrootDirs is an additional set of directories that need to be treated as root directories. Standard bind mounts will be mounted into paths relative to these directories. Optional. |  [optional] |
|**createWorkingDir** | **Boolean** | Create the working directory if it doesn&#39;t exist. If unset, it doesn&#39;t create it. Optional. |  [optional] |
|**deviceCgroupRule** | [**List&lt;LinuxDeviceCgroup&gt;**](LinuxDeviceCgroup.md) | DeviceCgroupRule are device cgroup rules that allow containers to use additional types of devices. |  [optional] |
|**devices** | [**List&lt;LinuxDevice&gt;**](LinuxDevice.md) | Devices are devices that will be added to the container. Optional. |  [optional] |
|**devicesFrom** | **List&lt;String&gt;** | DevicesFrom specifies that this container will mount the device(s) from other container(s). Optional. |  [optional] |
|**hostDeviceList** | [**List&lt;LinuxDevice&gt;**](LinuxDevice.md) | HostDeviceList is used to recreate the mounted device on inherited containers |  [optional] |
|**image** | **String** | Image is the image the container will be based on. The image will be used as the container&#39;s root filesystem, and its environment vars, volumes, and other configuration will be applied to the container. Conflicts with Rootfs. At least one of Image or Rootfs must be specified. |  [optional] |
|**imageArch** | **String** | ImageArch is the user-specified image architecture. Used to select a different variant from a manifest list. Optional. |  [optional] |
|**imageOs** | **String** | ImageOS is the user-specified OS of the image. Used to select a different variant from a manifest list. Optional. |  [optional] |
|**imageVariant** | **String** | ImageVariant is the user-specified image variant. Used to select a different variant from a manifest list. Optional. |  [optional] |
|**imageVolumeMode** | **String** | ImageVolumeMode indicates how image volumes will be created. Supported modes are \&quot;ignore\&quot; (do not create), \&quot;tmpfs\&quot; (create as tmpfs), and \&quot;anonymous\&quot; (create as anonymous volumes). The default if unset is anonymous. Optional. |  [optional] |
|**imageVolumes** | [**List&lt;ImageVolume&gt;**](ImageVolume.md) | Image volumes bind-mount a container-image mount into the container. Optional. |  [optional] |
|**init** | **Boolean** | Init specifies that an init binary will be mounted into the container, and will be used as PID1. Optional. |  [optional] |
|**initPath** | **String** | InitPath specifies the path to the init binary that will be added if Init is specified above. If not specified, the default set in the Libpod config will be used. Ignored if Init above is not set. Optional. |  [optional] |
|**ipcns** | [**Namespace**](Namespace.md) |  |  [optional] |
|**mounts** | [**List&lt;Mount&gt;**](Mount.md) | Mounts are mounts that will be added to the container. These will supersede Image Volumes and VolumesFrom volumes where there are conflicts. Optional. |  [optional] |
|**overlayVolumes** | [**List&lt;OverlayVolume&gt;**](OverlayVolume.md) | Overlay volumes are named volumes that will be added to the container. Optional. |  [optional] |
|**rawImageName** | **String** | RawImageName is the user-specified and unprocessed input referring to a local or a remote image. Optional, but strongly encouraged to be set if Image is set. |  [optional] |
|**rootfs** | **String** | Rootfs is the path to a directory that will be used as the container&#39;s root filesystem. No modification will be made to the directory, it will be directly mounted into the container as root. Conflicts with Image. At least one of Image or Rootfs must be specified. |  [optional] |
|**rootfsMapping** | **String** | RootfsMapping specifies if there are UID/GID mappings to apply to the rootfs. Optional. |  [optional] |
|**rootfsOverlay** | **Boolean** | RootfsOverlay tells if rootfs is actually an overlay on top of base path. Optional. |  [optional] |
|**rootfsPropagation** | **String** | RootfsPropagation is the rootfs propagation mode for the container. If not set, the default of rslave will be used. Optional. |  [optional] |
|**secrets** | [**List&lt;Secret&gt;**](Secret.md) | Secrets are the secrets that will be added to the container Optional. |  [optional] |
|**shmSize** | **Long** | ShmSize is the size of the tmpfs to mount in at /dev/shm, in bytes. Conflicts with ShmSize if IpcNS is not private. Optional. |  [optional] |
|**shmSizeSystemd** | **Long** | ShmSizeSystemd is the size of systemd-specific tmpfs mounts specifically /run, /run/lock, /var/log/journal and /tmp. Optional |  [optional] |
|**storageOpts** | **Map&lt;String, String&gt;** | StorageOpts is the container&#39;s storage options Optional. |  [optional] |
|**_volatile** | **Boolean** | Volatile specifies whether the container storage can be optimized at the cost of not syncing all the dirty files in memory. Optional. |  [optional] |
|**volumes** | [**List&lt;NamedVolume&gt;**](NamedVolume.md) | Volumes are named volumes that will be added to the container. These will supersede Image Volumes and VolumesFrom volumes where there are conflicts. Optional. |  [optional] |
|**volumesFrom** | **List&lt;String&gt;** | VolumesFrom is a set of containers whose volumes will be added to this container. The name or ID of the container must be provided, and may optionally be followed by a : and then one or more comma-separated options. Valid options are &#39;ro&#39;, &#39;rw&#39;, and &#39;z&#39;. Options will be used for all volumes sourced from the container. Optional. |  [optional] |
|**workDir** | **String** | WorkDir is the container&#39;s working directory. If unset, the default, /, will be used. Optional. |  [optional] |


## Implemented Interfaces

* Serializable


