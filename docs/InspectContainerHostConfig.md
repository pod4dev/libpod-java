

# InspectContainerHostConfig

nolint:revive,stylecheck // Field names are fixed for compatibility and cannot be changed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**annotations** | **Map&lt;String, String&gt;** | Annotations are provided to the runtime when the container is started. |  [optional] |
|**autoRemove** | **Boolean** | AutoRemove is whether the container will be automatically removed on exiting. It is not handled directly within libpod and is stored in an annotation. |  [optional] |
|**autoRemoveImage** | **Boolean** | AutoRemoveImage is whether the container&#39;s image will be automatically removed on exiting. It is not handled directly within libpod and is stored in an annotation. |  [optional] |
|**binds** | **List&lt;String&gt;** | Binds contains an array of user-added mounts. Both volume mounts and named volumes are included. Tmpfs mounts are NOT included. In &#39;docker inspect&#39; this is separated into &#39;Binds&#39; and &#39;Mounts&#39; based on how a mount was added. We do not make this distinction and do not include a Mounts field in inspect. Format: &lt;src&gt;:&lt;destination&gt;[:&lt;comma-separated options&gt;] |  [optional] |
|**blkioDeviceReadBps** | [**List&lt;InspectBlkioThrottleDevice&gt;**](InspectBlkioThrottleDevice.md) | BlkioDeviceReadBps is an array of I/O throttle parameters for individual device nodes. This specifically sets read rate cap in bytes per second for device nodes. As with BlkioWeightDevice, we pull the path from /sys/dev, and we don&#39;t guarantee the path will be identical to the original (though the node will be). |  [optional] |
|**blkioDeviceReadIOps** | [**List&lt;InspectBlkioThrottleDevice&gt;**](InspectBlkioThrottleDevice.md) | BlkioDeviceReadIOps is an array of I/O throttle parameters for individual device nodes. This specifically sets the read rate cap in iops per second for device nodes. As with BlkioWeightDevice, we pull the path from /sys/dev, and we don&#39;t guarantee the path will be identical to the original (though the node will be). |  [optional] |
|**blkioDeviceWriteBps** | [**List&lt;InspectBlkioThrottleDevice&gt;**](InspectBlkioThrottleDevice.md) | BlkioDeviceWriteBps is an array of I/O throttle parameters for individual device nodes. this specifically sets write rate cap in bytes per second for device nodes. as with BlkioWeightDevice, we pull the path from /sys/dev, and we don&#39;t guarantee the path will be identical to the original (though the node will be). |  [optional] |
|**blkioDeviceWriteIOps** | [**List&lt;InspectBlkioThrottleDevice&gt;**](InspectBlkioThrottleDevice.md) | BlkioDeviceWriteIOps is an array of I/O throttle parameters for individual device nodes. This specifically sets the write rate cap in iops per second for device nodes. As with BlkioWeightDevice, we pull the path from /sys/dev, and we don&#39;t guarantee the path will be identical to the original (though the node will be). |  [optional] |
|**blkioWeight** | **Integer** | BlkioWeight indicates the I/O resources allocated to the container. It is a relative weight in the scheduler for assigning I/O time versus other Cgroups. |  [optional] |
|**blkioWeightDevice** | [**List&lt;InspectBlkioWeightDevice&gt;**](InspectBlkioWeightDevice.md) | BlkioWeightDevice is an array of I/O resource priorities for individual device nodes. Unfortunately, the spec only stores the device&#39;s Major/Minor numbers and not the path, which is used here. Fortunately, the kernel provides an interface for retrieving the path of a given node by major:minor at /sys/dev/. However, the exact path in use may not be what was used in the original CLI invocation - though it is guaranteed that the device node will be the same, and using the given path will be functionally identical. |  [optional] |
|**capAdd** | **List&lt;String&gt;** | CapAdd is a list of capabilities added to the container. It is not directly stored by Libpod, and instead computed from the capabilities listed in the container&#39;s spec, compared against a set of default capabilities. |  [optional] |
|**capDrop** | **List&lt;String&gt;** | CapDrop is a list of capabilities removed from the container. It is not directly stored by libpod, and instead computed from the capabilities listed in the container&#39;s spec, compared against a set of default capabilities. |  [optional] |
|**cgroup** | **String** | Cgroup contains the container&#39;s cgroup. It is presently not populated. TODO. |  [optional] |
|**cgroupConf** | **Map&lt;String, String&gt;** | CgroupConf is the configuration for cgroup v2. |  [optional] |
|**cgroupManager** | **String** | CgroupManager is the cgroup manager used by the container. At present, allowed values are either \&quot;cgroupfs\&quot; or \&quot;systemd\&quot;. |  [optional] |
|**cgroupMode** | **String** | CgroupMode is the configuration of the container&#39;s cgroup namespace. Populated as follows: private - a cgroup namespace has been created host - No cgroup namespace created container:&lt;id&gt; - Using another container&#39;s cgroup namespace ns:&lt;path&gt; - A path to a cgroup namespace has been specified |  [optional] |
|**cgroupParent** | **String** | CgroupParent is the Cgroup parent of the container. Only set if not default. |  [optional] |
|**cgroups** | **String** | Cgroups contains the container&#39;s Cgroup mode. Allowed values are \&quot;default\&quot; (container is creating Cgroups) and \&quot;disabled\&quot; (container is not creating Cgroups). This is Libpod-specific and not included in &#x60;docker inspect&#x60;. |  [optional] |
|**consoleSize** | **List&lt;Integer&gt;** | ConsoleSize is an array of 2 integers showing the size of the container&#39;s console. It is only set if the container is creating a terminal. TODO. |  [optional] |
|**containerIDFile** | **String** | ContainerIDFile is a file created during container creation to hold the ID of the created container. This is not handled within libpod and is stored in an annotation. |  [optional] |
|**cpuCount** | **Integer** | CpuCount is Windows-only and not presently implemented. |  [optional] |
|**cpuPercent** | **Integer** | CpuPercent is Windows-only and not presently implemented. |  [optional] |
|**cpuPeriod** | **Integer** | CpuPeriod is the length of a CPU period in microseconds. It relates directly to CpuQuota. |  [optional] |
|**cpuQuota** | **Long** | CpuPeriod is the amount of time (in microseconds) that a container can use the CPU in every CpuPeriod. |  [optional] |
|**cpuRealtimePeriod** | **Integer** | CpuRealtimePeriod is the length of time (in microseconds) of the CPU realtime period. If set to 0, no time will be allocated to realtime tasks. |  [optional] |
|**cpuRealtimeRuntime** | **Long** | CpuRealtimeRuntime is the length of time (in microseconds) allocated for realtime tasks within every CpuRealtimePeriod. |  [optional] |
|**cpuShares** | **Integer** | CpuShares indicates the CPU resources allocated to the container. It is a relative weight in the scheduler for assigning CPU time versus other Cgroups. |  [optional] |
|**cpusetCpus** | **String** | CpusetCpus is the set of CPUs that the container will execute on. Formatted as &#x60;0-3&#x60; or &#x60;0,2&#x60;. Default (if unset) is all CPUs. |  [optional] |
|**cpusetMems** | **String** | CpusetMems is the set of memory nodes the container will use. Formatted as &#x60;0-3&#x60; or &#x60;0,2&#x60;. Default (if unset) is all memory nodes. |  [optional] |
|**devices** | [**List&lt;InspectDevice&gt;**](InspectDevice.md) | Devices is a list of device nodes that will be added to the container. These are stored in the OCI spec only as type, major, minor while we display the host path. We convert this with /sys/dev, but we cannot guarantee that the host path will be identical - only that the actual device will be. |  [optional] |
|**diskQuota** | **Integer** | DiskQuota is the maximum amount of disk space the container may use (in bytes). Presently not populated. TODO. |  [optional] |
|**dns** | **List&lt;String&gt;** | Dns is a list of DNS nameservers that will be added to the container&#39;s resolv.conf |  [optional] |
|**dnsOptions** | **List&lt;String&gt;** | DnsOptions is a list of DNS options that will be set in the container&#39;s resolv.conf |  [optional] |
|**dnsSearch** | **List&lt;String&gt;** | DnsSearch is a list of DNS search domains that will be set in the container&#39;s resolv.conf |  [optional] |
|**extraHosts** | **List&lt;String&gt;** | ExtraHosts contains hosts that will be added to the container&#39;s etc/hosts. |  [optional] |
|**groupAdd** | **List&lt;String&gt;** | GroupAdd contains groups that the user inside the container will be added to. |  [optional] |
|**idMappings** | [**InspectIDMappings**](InspectIDMappings.md) |  |  [optional] |
|**ioMaximumBandwidth** | **Integer** | IOMaximumBandwidth is Windows-only and not presently implemented. |  [optional] |
|**ioMaximumIOps** | **Integer** | IOMaximumIOps is Windows-only and not presently implemented. |  [optional] |
|**init** | **Boolean** | Init indicates whether the container has an init mounted into it. |  [optional] |
|**intelRdtClosID** | **String** | IntelRdtClosID defines the Intel RDT CAT Class Of Service (COS) that all processes of the container should run in. |  [optional] |
|**ipcMode** | **String** | IpcMode represents the configuration of the container&#39;s IPC namespace. Populated as follows: \&quot;\&quot; (empty string) - Default, an IPC namespace will be created host - No IPC namespace created container:&lt;id&gt; - Using another container&#39;s IPC namespace ns:&lt;path&gt; - A path to an IPC namespace has been specified |  [optional] |
|**isolation** | **String** | Isolation is presently unused and provided solely for Docker compatibility. |  [optional] |
|**kernelMemory** | **Long** | KernelMemory is the maximum amount of memory the kernel will devote to the container. |  [optional] |
|**links** | **List&lt;String&gt;** | Links is unused, and provided purely for Docker compatibility. |  [optional] |
|**logConfig** | [**InspectLogConfig**](InspectLogConfig.md) |  |  [optional] |
|**memory** | **Long** | Memory indicates the memory resources allocated to the container. This is the limit (in bytes) of RAM the container may use. |  [optional] |
|**memoryReservation** | **Long** | MemoryReservation is the reservation (soft limit) of memory available to the container. Soft limits are warnings only and can be exceeded. |  [optional] |
|**memorySwap** | **Long** | MemorySwap is the total limit for all memory available to the container, including swap. 0 indicates that there is no limit to the amount of memory available. |  [optional] |
|**memorySwappiness** | **Long** | MemorySwappiness is the willingness of the kernel to page container memory to swap. It is an integer from 0 to 100, with low numbers being more likely to be put into swap. 1, the default, will not set swappiness and use the system defaults. |  [optional] |
|**nanoCpus** | **Long** | NanoCpus indicates number of CPUs allocated to the container. It is an integer where one full CPU is indicated by 1000000000 (one billion). Thus, 2.5 CPUs (fractional portions of CPUs are allowed) would be 2500000000 (2.5 billion). In &#39;docker inspect&#39; this is set exclusively of two further options in the output (CpuPeriod and CpuQuota) which are both used to implement this functionality. We can&#39;t distinguish here, so if CpuQuota is set to the default of 100000, we will set both CpuQuota, CpuPeriod, and NanoCpus. If CpuQuota is not the default, we will not set NanoCpus. |  [optional] |
|**networkMode** | **String** | NetworkMode is the configuration of the container&#39;s network namespace. Populated as follows: default - A network namespace is being created and configured via CNI none - A network namespace is being created, not configured via CNI host - No network namespace created container:&lt;id&gt; - Using another container&#39;s network namespace ns:&lt;path&gt; - A path to a network namespace has been specified |  [optional] |
|**oomKillDisable** | **Boolean** | OomKillDisable indicates whether the kernel OOM killer is disabled for the container. |  [optional] |
|**oomScoreAdj** | **Long** | OOMScoreAdj is an adjustment that will be made to the container&#39;s OOM score. |  [optional] |
|**pidMode** | **String** | PidMode represents the configuration of the container&#39;s PID namespace. Populated as follows: \&quot;\&quot; (empty string) - Default, a PID namespace will be created host - No PID namespace created container:&lt;id&gt; - Using another container&#39;s PID namespace ns:&lt;path&gt; - A path to a PID namespace has been specified |  [optional] |
|**pidsLimit** | **Long** | PidsLimit is the maximum number of PIDs that may be created within the container. 0, the default, indicates no limit. |  [optional] |
|**portBindings** | **Map&lt;String, List&lt;@Valid InspectHostPort&gt;&gt;** | PortBindings contains the container&#39;s port bindings. It is formatted as map[string][]InspectHostPort. The string key here is formatted as &lt;integer port number&gt;/&lt;protocol&gt; and represents the container port. A single container port may be bound to multiple host ports (on different IPs). |  [optional] |
|**privileged** | **Boolean** | Privileged indicates whether the container is running with elevated privileges. This has a very specific meaning in the Docker sense, so it&#39;s very difficult to decode from the spec and config, and so is stored as an annotation. |  [optional] |
|**publishAllPorts** | **Boolean** | PublishAllPorts indicates whether image ports are being published. This is not directly stored in libpod and is saved as an annotation. |  [optional] |
|**readonlyRootfs** | **Boolean** | ReadonlyRootfs is whether the container will be mounted read-only. |  [optional] |
|**restartPolicy** | [**InspectRestartPolicy**](InspectRestartPolicy.md) |  |  [optional] |
|**runtime** | **String** | Runtime is provided purely for Docker compatibility. It is set unconditionally to \&quot;oci\&quot; as Podman does not presently support non-OCI runtimes. |  [optional] |
|**securityOpt** | **List&lt;String&gt;** | SecurityOpt is a list of security-related options that are set in the container. |  [optional] |
|**shmSize** | **Long** |  |  [optional] |
|**tmpfs** | **Map&lt;String, String&gt;** | Tmpfs is a list of tmpfs filesystems that will be mounted into the container. It is a map of destination path to options for the mount. |  [optional] |
|**utSMode** | **String** | UTSMode represents the configuration of the container&#39;s UID namespace. Populated as follows: \&quot;\&quot; (empty string) - Default, a UTS namespace will be created host - no UTS namespace created container:&lt;id&gt; - Using another container&#39;s UTS namespace ns:&lt;path&gt; - A path to a UTS namespace has been specified |  [optional] |
|**ulimits** | [**List&lt;InspectUlimit&gt;**](InspectUlimit.md) | Ulimits is a set of ulimits that will be set within the container. |  [optional] |
|**usernsMode** | **String** | UsernsMode represents the configuration of the container&#39;s user namespace. When running rootless, a user namespace is created outside of libpod to allow some privileged operations. This will not be reflected here. Populated as follows: \&quot;\&quot; (empty string) - No user namespace will be created private - The container will be run in a user namespace container:&lt;id&gt; - Using another container&#39;s user namespace ns:&lt;path&gt; - A path to a user namespace has been specified TODO Rootless has an additional &#39;keep-id&#39; option, presently not reflected here. |  [optional] |
|**volumeDriver** | **String** | VolumeDriver is presently unused and is retained for Docker compatibility. |  [optional] |
|**volumesFrom** | **List&lt;String&gt;** | VolumesFrom is a list of containers which this container uses volumes from. This is not handled directly within libpod and is stored in an annotation. It is formatted as an array of container names and IDs. |  [optional] |


## Implemented Interfaces

* Serializable


