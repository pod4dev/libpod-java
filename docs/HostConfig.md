

# HostConfig

Here, \"non-portable\" means \"dependent of the host we are running on\". Portable information *should* appear in Config.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**annotations** | **Map&lt;String, String&gt;** |  |  [optional] |
|**autoRemove** | **Boolean** |  |  [optional] |
|**binds** | **List&lt;String&gt;** | Applicable to all platforms |  [optional] |
|**blkioDeviceReadBps** | [**List&lt;ThrottleDevice&gt;**](ThrottleDevice.md) |  |  [optional] |
|**blkioDeviceReadIOps** | [**List&lt;ThrottleDevice&gt;**](ThrottleDevice.md) |  |  [optional] |
|**blkioDeviceWriteBps** | [**List&lt;ThrottleDevice&gt;**](ThrottleDevice.md) |  |  [optional] |
|**blkioDeviceWriteIOps** | [**List&lt;ThrottleDevice&gt;**](ThrottleDevice.md) |  |  [optional] |
|**blkioWeight** | **Integer** |  |  [optional] |
|**blkioWeightDevice** | [**List&lt;WeightDevice&gt;**](WeightDevice.md) |  |  [optional] |
|**capAdd** | **List&lt;String&gt;** | We need to override the json decoder to accept both options. |  [optional] |
|**capDrop** | **List&lt;String&gt;** | We need to override the json decoder to accept both options. |  [optional] |
|**cgroup** | **String** |  |  [optional] |
|**cgroupParent** | **String** | Applicable to UNIX platforms |  [optional] |
|**cgroupnsMode** | **String** | CgroupnsMode represents the cgroup namespace mode of the container |  [optional] |
|**consoleSize** | **List&lt;Integer&gt;** |  |  [optional] |
|**containerIDFile** | **String** |  |  [optional] |
|**cpuCount** | **Long** | Applicable to Windows |  [optional] |
|**cpuPercent** | **Long** |  |  [optional] |
|**cpuPeriod** | **Long** |  |  [optional] |
|**cpuQuota** | **Long** |  |  [optional] |
|**cpuRealtimePeriod** | **Long** |  |  [optional] |
|**cpuRealtimeRuntime** | **Long** |  |  [optional] |
|**cpuShares** | **Long** | Applicable to all platforms |  [optional] |
|**cpusetCpus** | **String** |  |  [optional] |
|**cpusetMems** | **String** |  |  [optional] |
|**deviceCgroupRules** | **List&lt;String&gt;** |  |  [optional] |
|**deviceRequests** | [**List&lt;DeviceRequest&gt;**](DeviceRequest.md) |  |  [optional] |
|**devices** | [**List&lt;DeviceMapping&gt;**](DeviceMapping.md) |  |  [optional] |
|**dns** | **List&lt;String&gt;** |  |  [optional] |
|**dnsOptions** | **List&lt;String&gt;** |  |  [optional] |
|**dnsSearch** | **List&lt;String&gt;** |  |  [optional] |
|**extraHosts** | **List&lt;String&gt;** |  |  [optional] |
|**groupAdd** | **List&lt;String&gt;** |  |  [optional] |
|**ioMaximumBandwidth** | **Integer** |  |  [optional] |
|**ioMaximumIOps** | **Integer** |  |  [optional] |
|**init** | **Boolean** | Run a custom init inside the container, if null, use the daemon&#39;s configured settings |  [optional] |
|**ipcMode** | **String** |  |  [optional] |
|**isolation** | **String** | Isolation represents the isolation technology of a container. The supported values are platform specific |  [optional] |
|**kernelMemory** | **Long** | KernelMemory specifies the kernel memory limit (in bytes) for the container. Deprecated: kernel 5.4 deprecated kmem.limit_in_bytes. |  [optional] |
|**kernelMemoryTCP** | **Long** |  |  [optional] |
|**links** | **List&lt;String&gt;** |  |  [optional] |
|**logConfig** | [**LogConfig**](LogConfig.md) |  |  [optional] |
|**maskedPaths** | **List&lt;String&gt;** | MaskedPaths is the list of paths to be masked inside the container (this overrides the default set of paths) |  [optional] |
|**memory** | **Long** |  |  [optional] |
|**memoryReservation** | **Long** |  |  [optional] |
|**memorySwap** | **Long** |  |  [optional] |
|**memorySwappiness** | **Long** |  |  [optional] |
|**mounts** | [**List&lt;Mount&gt;**](Mount.md) | Mounts specs used by the container |  [optional] |
|**nanoCpus** | **Long** |  |  [optional] |
|**networkMode** | **String** |  |  [optional] |
|**oomKillDisable** | **Boolean** |  |  [optional] |
|**oomScoreAdj** | **Long** |  |  [optional] |
|**pidMode** | **String** |  |  [optional] |
|**pidsLimit** | **Long** |  |  [optional] |
|**portBindings** | **Map&lt;String, List&lt;@Valid PortBinding&gt;&gt;** | PortMap is a collection of PortBinding indexed by Port |  [optional] |
|**privileged** | **Boolean** |  |  [optional] |
|**publishAllPorts** | **Boolean** |  |  [optional] |
|**readonlyPaths** | **List&lt;String&gt;** | ReadonlyPaths is the list of paths to be set as read-only inside the container (this overrides the default set of paths) |  [optional] |
|**readonlyRootfs** | **Boolean** |  |  [optional] |
|**restartPolicy** | [**RestartPolicy**](RestartPolicy.md) |  |  [optional] |
|**runtime** | **String** |  |  [optional] |
|**securityOpt** | **List&lt;String&gt;** |  |  [optional] |
|**shmSize** | **Long** |  |  [optional] |
|**storageOpt** | **Map&lt;String, String&gt;** |  |  [optional] |
|**sysctls** | **Map&lt;String, String&gt;** |  |  [optional] |
|**tmpfs** | **Map&lt;String, String&gt;** |  |  [optional] |
|**utSMode** | **String** |  |  [optional] |
|**ulimits** | [**List&lt;Ulimit&gt;**](Ulimit.md) |  |  [optional] |
|**usernsMode** | **String** |  |  [optional] |
|**volumeDriver** | **String** |  |  [optional] |
|**volumesFrom** | **List&lt;String&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


