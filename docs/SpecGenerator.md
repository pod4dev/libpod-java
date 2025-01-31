

# SpecGenerator

SpecGenerator creates an OCI spec and Libpod configuration options to create a container based on the given configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**networks** | [**Map&lt;String, PerNetworkOptions&gt;**](PerNetworkOptions.md) | Map of networks names or ids that the container should join. You can request additional settings for each network, you can set network aliases, static ips, static mac address  and the network interface name for this container on the specific network. If the map is empty and the bridge network mode is set the container will be joined to the default network. Optional. |  [optional] |
|**annotations** | **Map&lt;String, String&gt;** | Annotations are key-value options passed into the container runtime that can be used to trigger special behavior. Optional. |  [optional] |
|**apparmorProfile** | **String** | ApparmorProfile is the name of the Apparmor profile the container will use. Optional. |  [optional] |
|**baseHostsFile** | **String** | BaseHostsFile is the path to a hosts file, the entries from this file are added to the containers hosts file. As special value \&quot;image\&quot; is allowed which uses the /etc/hosts file from within the image and \&quot;none\&quot; which uses no base file at all. If it is empty we should default to the base_hosts_file configuration in containers.conf. Optional. |  [optional] |
|**capAdd** | **List&lt;String&gt;** | CapAdd are capabilities which will be added to the container. Conflicts with Privileged. Optional. |  [optional] |
|**capDrop** | **List&lt;String&gt;** | CapDrop are capabilities which will be removed from the container. Conflicts with Privileged. Optional. |  [optional] |
|**cgroupParent** | **String** | CgroupParent is the container&#39;s Cgroup parent. If not set, the default for the current cgroup driver will be used. Optional. |  [optional] |
|**cgroupns** | [**Namespace**](Namespace.md) |  |  [optional] |
|**cgroupsMode** | **String** | CgroupsMode sets a policy for how cgroups will be created for the container, including the ability to disable creation entirely. Optional. |  [optional] |
|**chrootDirectories** | **List&lt;String&gt;** | ChrootDirs is an additional set of directories that need to be treated as root directories. Standard bind mounts will be mounted into paths relative to these directories. Optional. |  [optional] |
|**cniNetworks** | **List&lt;String&gt;** | CNINetworks is a list of CNI networks to join the container to. If this list is empty, the default CNI network will be joined instead. If at least one entry is present, we will not join the default network (unless it is part of this list). Only available if NetNS is set to bridge. Optional. Deprecated: as of podman 4.0 use \&quot;Networks\&quot; instead. |  [optional] |
|**command** | **List&lt;String&gt;** | Command is the container&#39;s command. If not given and Image is specified, this will be populated by the image&#39;s configuration. Optional. |  [optional] |
|**conmonPidFile** | **String** | ConmonPidFile is a path at which a PID file for Conmon will be placed. If not given, a default location will be used. Optional. |  [optional] |
|**containerCreateCommand** | **List&lt;String&gt;** | ContainerCreateCommand is the command that was used to create this container. This will be shown in the output of Inspect() on the container, and may also be used by some tools that wish to recreate the container (e.g. &#x60;podman generate systemd --new&#x60;). Optional. |  [optional] |
|**createWorkingDir** | **Boolean** | Create the working directory if it doesn&#39;t exist. If unset, it doesn&#39;t create it. Optional. |  [optional] |
|**dependencyContainers** | **List&lt;String&gt;** | DependencyContainers is an array of containers this container depends on. Dependency containers must be started before this container. Dependencies can be specified by name or full/partial ID. Optional. |  [optional] |
|**deviceCgroupRule** | [**List&lt;LinuxDeviceCgroup&gt;**](LinuxDeviceCgroup.md) | DeviceCgroupRule are device cgroup rules that allow containers to use additional types of devices. |  [optional] |
|**devices** | [**List&lt;LinuxDevice&gt;**](LinuxDevice.md) | Devices are devices that will be added to the container. Optional. |  [optional] |
|**devicesFrom** | **List&lt;String&gt;** | DevicesFrom specifies that this container will mount the device(s) from other container(s). Optional. |  [optional] |
|**dnsOption** | **List&lt;String&gt;** | DNSOptions is a set of DNS options that will be used in the container&#39;s resolv.conf, replacing the host&#39;s DNS options which are used by default. Conflicts with UseImageResolvConf. Optional. |  [optional] |
|**dnsSearch** | **List&lt;String&gt;** | DNSSearch is a set of DNS search domains that will be used in the container&#39;s resolv.conf, replacing the host&#39;s DNS search domains which are used by default. Conflicts with UseImageResolvConf. Optional. |  [optional] |
|**dnsServer** | **List&lt;String&gt;** | DNSServers is a set of DNS servers that will be used in the container&#39;s resolv.conf, replacing the host&#39;s DNS Servers which are used by default. Conflicts with UseImageResolvConf. Optional. |  [optional] |
|**entrypoint** | **List&lt;String&gt;** | Entrypoint is the container&#39;s entrypoint. If not given and Image is specified, this will be populated by the image&#39;s configuration. Optional. |  [optional] |
|**env** | **Map&lt;String, String&gt;** | Env is a set of environment variables that will be set in the container. Optional. |  [optional] |
|**envHost** | **Boolean** | EnvHost indicates that the host environment should be added to container Optional. |  [optional] |
|**envmerge** | **List&lt;String&gt;** | EnvMerge takes the specified environment variables from image and preprocess them before injecting them into the container. Optional. |  [optional] |
|**expose** | **Object** | Expose is a number of ports that will be forwarded to the container if PublishExposedPorts is set. Expose is a map of uint16 (port number) to a string representing protocol i.e map[uint16]string. Allowed protocols are \&quot;tcp\&quot;, \&quot;udp\&quot;, and \&quot;sctp\&quot;, or some combination of the three separated by commas. If protocol is set to \&quot;\&quot; we will assume TCP. Only available if NetNS is set to Bridge or Slirp, and PublishExposedPorts is set. Optional. |  [optional] |
|**groupEntry** | **String** | GroupEntry specifies an arbitrary string to append to the container&#39;s /etc/group file. Optional. |  [optional] |
|**groups** | **List&lt;String&gt;** | Groups are a list of supplemental groups the container&#39;s user will be granted access to. Optional. |  [optional] |
|**healthCheckOnFailureAction** | **Long** | HealthCheckOnFailureAction defines how Podman reacts when a container&#39;s health status turns unhealthy. |  [optional] |
|**healthLogDestination** | **String** | HealthLogDestination defines the destination where the log is stored |  [optional] |
|**healthMaxLogCount** | **Integer** | HealthMaxLogCount is maximum number of attempts in the HealthCheck log file. (&#39;0&#39; value means an infinite number of attempts in the log file) |  [optional] |
|**healthMaxLogSize** | **Integer** | HealthMaxLogSize is the maximum length in characters of stored HealthCheck log (\&quot;0\&quot; value means an infinite log length) |  [optional] |
|**healthconfig** | [**Schema2HealthConfig**](Schema2HealthConfig.md) |  |  [optional] |
|**hostDeviceList** | [**List&lt;LinuxDevice&gt;**](LinuxDevice.md) | HostDeviceList is used to recreate the mounted device on inherited containers |  [optional] |
|**hostadd** | **List&lt;String&gt;** | HostAdd is a set of hosts which will be added to the container&#39;s etc/hosts file. Conflicts with UseImageHosts. Optional. |  [optional] |
|**hostname** | **String** | Hostname is the container&#39;s hostname. If not set, the hostname will not be modified (if UtsNS is not private) or will be set to the container ID (if UtsNS is private). Conflicts with UtsNS if UtsNS is not set to private. Optional. |  [optional] |
|**hostusers** | **List&lt;String&gt;** | HostUsers is a list of host usernames or UIDs to add to the container etc/passwd file |  [optional] |
|**httpproxy** | **Boolean** | EnvHTTPProxy indicates that the http host proxy environment variables should be added to container Optional. |  [optional] |
|**idmappings** | [**IDMappingOptions**](IDMappingOptions.md) |  |  [optional] |
|**image** | **String** | Image is the image the container will be based on. The image will be used as the container&#39;s root filesystem, and its environment vars, volumes, and other configuration will be applied to the container. Conflicts with Rootfs. At least one of Image or Rootfs must be specified. |  [optional] |
|**imageArch** | **String** | ImageArch is the user-specified image architecture. Used to select a different variant from a manifest list. Optional. |  [optional] |
|**imageOs** | **String** | ImageOS is the user-specified OS of the image. Used to select a different variant from a manifest list. Optional. |  [optional] |
|**imageVariant** | **String** | ImageVariant is the user-specified image variant. Used to select a different variant from a manifest list. Optional. |  [optional] |
|**imageVolumeMode** | **String** | ImageVolumeMode indicates how image volumes will be created. Supported modes are \&quot;ignore\&quot; (do not create), \&quot;tmpfs\&quot; (create as tmpfs), and \&quot;anonymous\&quot; (create as anonymous volumes). The default if unset is anonymous. Optional. |  [optional] |
|**imageVolumes** | [**List&lt;ImageVolume&gt;**](ImageVolume.md) | Image volumes bind-mount a container-image mount into the container. Optional. |  [optional] |
|**init** | **Boolean** | Init specifies that an init binary will be mounted into the container, and will be used as PID1. Optional. |  [optional] |
|**initContainerType** | **String** | InitContainerType describes if this container is an init container and if so, what type: always or once. Optional. |  [optional] |
|**initPath** | **String** | InitPath specifies the path to the init binary that will be added if Init is specified above. If not specified, the default set in the Libpod config will be used. Ignored if Init above is not set. Optional. |  [optional] |
|**intelRdt** | [**LinuxIntelRdt**](LinuxIntelRdt.md) |  |  [optional] |
|**ipcns** | [**Namespace**](Namespace.md) |  |  [optional] |
|**labelNested** | **Boolean** | LabelNested indicates whether or not the container is allowed to run fully nested containers including SELinux labelling. Optional. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Labels are key-value pairs that are used to add metadata to containers. Optional. |  [optional] |
|**logConfiguration** | [**LogConfigLibpod**](LogConfigLibpod.md) |  |  [optional] |
|**managePassword** | **Boolean** | Passwd is a container run option that determines if we are validating users/groups before running the container |  [optional] |
|**mask** | **List&lt;String&gt;** | Mask is the path we want to mask in the container. This masks the paths given in addition to the default list. Optional |  [optional] |
|**mounts** | [**List&lt;Mount&gt;**](Mount.md) | Mounts are mounts that will be added to the container. These will supersede Image Volumes and VolumesFrom volumes where there are conflicts. Optional. |  [optional] |
|**name** | **String** | Name is the name the container will be given. If no name is provided, one will be randomly generated. Optional. |  [optional] |
|**netns** | [**Namespace**](Namespace.md) |  |  [optional] |
|**networkOptions** | **Map&lt;String, List&lt;String&gt;&gt;** | NetworkOptions are additional options for each network Optional. |  [optional] |
|**noNewPrivileges** | **Boolean** | NoNewPrivileges is whether the container will set the no new privileges flag on create, which disables gaining additional privileges (e.g. via setuid) in the container. Optional. |  [optional] |
|**ociRuntime** | **String** | OCIRuntime is the name of the OCI runtime that will be used to create the container. If not specified, the default will be used. Optional. |  [optional] |
|**oomScoreAdj** | **Long** | OOMScoreAdj adjusts the score used by the OOM killer to determine processes to kill for the container&#39;s process. Optional. |  [optional] |
|**overlayVolumes** | [**List&lt;OverlayVolume&gt;**](OverlayVolume.md) | Overlay volumes are named volumes that will be added to the container. Optional. |  [optional] |
|**passwdEntry** | **String** | PasswdEntry specifies an arbitrary string to append to the container&#39;s /etc/passwd file. Optional. |  [optional] |
|**personality** | [**LinuxPersonality**](LinuxPersonality.md) |  |  [optional] |
|**pidns** | [**Namespace**](Namespace.md) |  |  [optional] |
|**pod** | **String** | Pod is the ID of the pod the container will join. Optional. |  [optional] |
|**portmappings** | [**List&lt;PortMapping&gt;**](PortMapping.md) | PortBindings is a set of ports to map into the container. Only available if NetNS is set to bridge, slirp, or pasta. Optional. |  [optional] |
|**privileged** | **Boolean** | Privileged is whether the container is privileged. Privileged does the following: Adds all devices on the system to the container. Adds all capabilities to the container. Disables Seccomp, SELinux, and Apparmor confinement. (Though SELinux can be manually re-enabled). TODO: this conflicts with things. TODO: this does more. Optional. |  [optional] |
|**procfsOpts** | **List&lt;String&gt;** | ProcOpts are the options used for the proc mount. |  [optional] |
|**publishImagePorts** | **Boolean** | PublishExposedPorts will publish ports specified in the image to random unused ports (guaranteed to be above 1024) on the host. This is based on ports set in Expose below, and any ports specified by the Image (if one is given). Only available if NetNS is set to Bridge or Slirp. Optional. |  [optional] |
|**rLimits** | [**List&lt;POSIXRlimit&gt;**](POSIXRlimit.md) | Rlimits are POSIX rlimits to apply to the container. Optional. |  [optional] |
|**rawImageName** | **String** | RawImageName is the user-specified and unprocessed input referring to a local or a remote image. Optional, but strongly encouraged to be set if Image is set. |  [optional] |
|**readOnlyFilesystem** | **Boolean** | ReadOnlyFilesystem indicates that everything will be mounted as read-only. Optional. |  [optional] |
|**readWriteTmpfs** | **Boolean** | ReadWriteTmpfs indicates that when running with a ReadOnlyFilesystem mount temporary file systems. Optional. |  [optional] |
|**remove** | **Boolean** | Remove indicates if the container should be removed once it has been started and exits. Optional. |  [optional] |
|**removeImage** | **Boolean** | RemoveImage indicates that the container should remove the image it was created from after it exits. Only allowed if Remove is set to true and Image, not Rootfs, is in use. Optional. |  [optional] |
|**resourceLimits** | [**LinuxResources**](LinuxResources.md) |  |  [optional] |
|**restartPolicy** | **String** | RestartPolicy is the container&#39;s restart policy - an action which will be taken when the container exits. If not given, the default policy, which does nothing, will be used. Optional. |  [optional] |
|**restartTries** | **Integer** | RestartRetries is the number of attempts that will be made to restart the container. Only available when RestartPolicy is set to \&quot;on-failure\&quot;. Optional. |  [optional] |
|**rootfs** | **String** | Rootfs is the path to a directory that will be used as the container&#39;s root filesystem. No modification will be made to the directory, it will be directly mounted into the container as root. Conflicts with Image. At least one of Image or Rootfs must be specified. |  [optional] |
|**rootfsMapping** | **String** | RootfsMapping specifies if there are UID/GID mappings to apply to the rootfs. Optional. |  [optional] |
|**rootfsOverlay** | **Boolean** | RootfsOverlay tells if rootfs is actually an overlay on top of base path. Optional. |  [optional] |
|**rootfsPropagation** | **String** | RootfsPropagation is the rootfs propagation mode for the container. If not set, the default of rslave will be used. Optional. |  [optional] |
|**sdnotifyMode** | **String** | Determine how to handle the NOTIFY_SOCKET - do we participate or pass it through \&quot;container\&quot; - let the OCI runtime deal with it, advertise conmon&#39;s MAINPID \&quot;conmon-only\&quot; - advertise conmon&#39;s MAINPID, send READY when started, don&#39;t pass to OCI \&quot;ignore\&quot; - unset NOTIFY_SOCKET Optional. |  [optional] |
|**seccompPolicy** | **String** | SeccompPolicy determines which seccomp profile gets applied the container. valid values: empty,default,image |  [optional] |
|**seccompProfilePath** | **String** | SeccompProfilePath is the path to a JSON file containing the container&#39;s Seccomp profile. If not specified, no Seccomp profile will be used. Optional. |  [optional] |
|**secretEnv** | **Map&lt;String, String&gt;** | EnvSecrets are secrets that will be set as environment variables Optional. |  [optional] |
|**secrets** | [**List&lt;Secret&gt;**](Secret.md) | Secrets are the secrets that will be added to the container Optional. |  [optional] |
|**selinuxOpts** | **List&lt;String&gt;** | SelinuxProcessLabel is the process label the container will use. If SELinux is enabled and this is not specified, a label will be automatically generated if not specified. Optional. |  [optional] |
|**shmSize** | **Long** | ShmSize is the size of the tmpfs to mount in at /dev/shm, in bytes. Conflicts with ShmSize if IpcNS is not private. Optional. |  [optional] |
|**shmSizeSystemd** | **Long** | ShmSizeSystemd is the size of systemd-specific tmpfs mounts specifically /run, /run/lock, /var/log/journal and /tmp. Optional |  [optional] |
|**startupHealthConfig** | [**StartupHealthCheck**](StartupHealthCheck.md) |  |  [optional] |
|**stdin** | **Boolean** | Stdin is whether the container will keep its STDIN open. Optional. |  [optional] |
|**stopSignal** | **Long** | It implements the [os.Signal] interface. |  [optional] |
|**stopTimeout** | **Integer** | StopTimeout is a timeout between the container&#39;s stop signal being sent and SIGKILL being sent. If not provided, the default will be used. If 0 is used, stop signal will not be sent, and SIGKILL will be sent instead. Optional. |  [optional] |
|**storageOpts** | **Map&lt;String, String&gt;** | StorageOpts is the container&#39;s storage options Optional. |  [optional] |
|**sysctl** | **Map&lt;String, String&gt;** | Sysctl sets kernel parameters for the container |  [optional] |
|**systemd** | **String** | Systemd is whether the container will be started in systemd mode. Valid options are \&quot;true\&quot;, \&quot;false\&quot;, and \&quot;always\&quot;. \&quot;true\&quot; enables this mode only if the binary run in the container is sbin/init or systemd. \&quot;always\&quot; unconditionally enables systemd mode. \&quot;false\&quot; unconditionally disables systemd mode. If enabled, mounts and stop signal will be modified. If set to \&quot;always\&quot; or set to \&quot;true\&quot; and conditionally triggered, conflicts with StopSignal. If not specified, \&quot;false\&quot; will be assumed. Optional. |  [optional] |
|**terminal** | **Boolean** | Terminal is whether the container will create a PTY. Optional. |  [optional] |
|**throttleReadBpsDevice** | [**Map&lt;String, LinuxThrottleDevice&gt;**](LinuxThrottleDevice.md) | IO read rate limit per cgroup per device, bytes per second |  [optional] |
|**throttleReadIOPSDevice** | [**Map&lt;String, LinuxThrottleDevice&gt;**](LinuxThrottleDevice.md) | IO read rate limit per cgroup per device, IO per second |  [optional] |
|**throttleWriteBpsDevice** | [**Map&lt;String, LinuxThrottleDevice&gt;**](LinuxThrottleDevice.md) | IO write rate limit per cgroup per device, bytes per second |  [optional] |
|**throttleWriteIOPSDevice** | [**Map&lt;String, LinuxThrottleDevice&gt;**](LinuxThrottleDevice.md) | IO write rate limit per cgroup per device, IO per second |  [optional] |
|**timeout** | **Integer** | Timeout is a maximum time in seconds the container will run before main process is sent SIGKILL. If 0 is used, signal will not be sent. Container can run indefinitely if they do not stop after the default termination signal. Optional. |  [optional] |
|**timezone** | **String** | Timezone is the timezone inside the container. Local means it has the same timezone as the host machine Optional. |  [optional] |
|**umask** | **String** | Umask is the umask the init process of the container will be run with. |  [optional] |
|**unified** | **Map&lt;String, String&gt;** | CgroupConf are key-value options passed into the container runtime that are used to configure cgroup v2. Optional. |  [optional] |
|**unmask** | **List&lt;String&gt;** | Unmask a path in the container. Some paths are masked by default, preventing them from being accessed within the container; this undoes that masking. If ALL is passed, all paths will be unmasked. Optional. |  [optional] |
|**unsetenv** | **List&lt;String&gt;** | UnsetEnv unsets the specified default environment variables from the image or from built-in or containers.conf Optional. |  [optional] |
|**unsetenvall** | **Boolean** | UnsetEnvAll unsetall default environment variables from the image or from built-in or containers.conf UnsetEnvAll unsets all default environment variables from the image or from built-in Optional. |  [optional] |
|**useImageHosts** | **Boolean** | UseImageHosts indicates that /etc/hosts should not be managed by Podman, and instead sourced from the image. Conflicts with HostAdd. Optional. |  [optional] |
|**useImageResolveConf** | **Boolean** | UseImageResolvConf indicates that resolv.conf should not be managed by Podman, but instead sourced from the image. Conflicts with DNSServer, DNSSearch, DNSOption. Optional. |  [optional] |
|**user** | **String** | User is the user the container will be run as. Can be given as a UID or a username; if a username, it will be resolved within the container, using the container&#39;s /etc/passwd. If unset, the container will be run as root. Optional. |  [optional] |
|**userns** | [**Namespace**](Namespace.md) |  |  [optional] |
|**utsns** | [**Namespace**](Namespace.md) |  |  [optional] |
|**_volatile** | **Boolean** | Volatile specifies whether the container storage can be optimized at the cost of not syncing all the dirty files in memory. Optional. |  [optional] |
|**volumes** | [**List&lt;NamedVolume&gt;**](NamedVolume.md) | Volumes are named volumes that will be added to the container. These will supersede Image Volumes and VolumesFrom volumes where there are conflicts. Optional. |  [optional] |
|**volumesFrom** | **List&lt;String&gt;** | VolumesFrom is a set of containers whose volumes will be added to this container. The name or ID of the container must be provided, and may optionally be followed by a : and then one or more comma-separated options. Valid options are &#39;ro&#39;, &#39;rw&#39;, and &#39;z&#39;. Options will be used for all volumes sourced from the container. Optional. |  [optional] |
|**weightDevice** | [**Map&lt;String, LinuxWeightDevice&gt;**](LinuxWeightDevice.md) | Weight per cgroup per device, can override BlkioWeight |  [optional] |
|**workDir** | **String** | WorkDir is the container&#39;s working directory. If unset, the default, /, will be used. Optional. |  [optional] |


## Implemented Interfaces

* Serializable


