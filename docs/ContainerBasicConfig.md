

# ContainerBasicConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**annotations** | **Map&lt;String, String&gt;** | Annotations are key-value options passed into the container runtime that can be used to trigger special behavior. Optional. |  [optional] |
|**command** | **List&lt;String&gt;** | Command is the container&#39;s command. If not given and Image is specified, this will be populated by the image&#39;s configuration. Optional. |  [optional] |
|**conmonPidFile** | **String** | ConmonPidFile is a path at which a PID file for Conmon will be placed. If not given, a default location will be used. Optional. |  [optional] |
|**containerCreateCommand** | **List&lt;String&gt;** | ContainerCreateCommand is the command that was used to create this container. This will be shown in the output of Inspect() on the container, and may also be used by some tools that wish to recreate the container (e.g. &#x60;podman generate systemd --new&#x60;). Optional. |  [optional] |
|**dependencyContainers** | **List&lt;String&gt;** | DependencyContainers is an array of containers this container depends on. Dependency containers must be started before this container. Dependencies can be specified by name or full/partial ID. Optional. |  [optional] |
|**entrypoint** | **List&lt;String&gt;** | Entrypoint is the container&#39;s entrypoint. If not given and Image is specified, this will be populated by the image&#39;s configuration. Optional. |  [optional] |
|**env** | **Map&lt;String, String&gt;** | Env is a set of environment variables that will be set in the container. Optional. |  [optional] |
|**envHost** | **Boolean** | EnvHost indicates that the host environment should be added to container Optional. |  [optional] |
|**envmerge** | **List&lt;String&gt;** | EnvMerge takes the specified environment variables from image and preprocess them before injecting them into the container. Optional. |  [optional] |
|**groupEntry** | **String** | GroupEntry specifies an arbitrary string to append to the container&#39;s /etc/group file. Optional. |  [optional] |
|**hostname** | **String** | Hostname is the container&#39;s hostname. If not set, the hostname will not be modified (if UtsNS is not private) or will be set to the container ID (if UtsNS is private). Conflicts with UtsNS if UtsNS is not set to private. Optional. |  [optional] |
|**hostusers** | **List&lt;String&gt;** | HostUsers is a list of host usernames or UIDs to add to the container etc/passwd file |  [optional] |
|**httpproxy** | **Boolean** | EnvHTTPProxy indicates that the http host proxy environment variables should be added to container Optional. |  [optional] |
|**initContainerType** | **String** | InitContainerType describes if this container is an init container and if so, what type: always or once. Optional. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Labels are key-value pairs that are used to add metadata to containers. Optional. |  [optional] |
|**logConfiguration** | [**LogConfigLibpod**](LogConfigLibpod.md) |  |  [optional] |
|**managePassword** | **Boolean** | Passwd is a container run option that determines if we are validating users/groups before running the container |  [optional] |
|**name** | **String** | Name is the name the container will be given. If no name is provided, one will be randomly generated. Optional. |  [optional] |
|**ociRuntime** | **String** | OCIRuntime is the name of the OCI runtime that will be used to create the container. If not specified, the default will be used. Optional. |  [optional] |
|**passwdEntry** | **String** | PasswdEntry specifies an arbitrary string to append to the container&#39;s /etc/passwd file. Optional. |  [optional] |
|**personality** | [**LinuxPersonality**](LinuxPersonality.md) |  |  [optional] |
|**pidns** | [**Namespace**](Namespace.md) |  |  [optional] |
|**pod** | **String** | Pod is the ID of the pod the container will join. Optional. |  [optional] |
|**remove** | **Boolean** | Remove indicates if the container should be removed once it has been started and exits. Optional. |  [optional] |
|**removeImage** | **Boolean** | RemoveImage indicates that the container should remove the image it was created from after it exits. Only allowed if Remove is set to true and Image, not Rootfs, is in use. Optional. |  [optional] |
|**restartPolicy** | **String** | RestartPolicy is the container&#39;s restart policy - an action which will be taken when the container exits. If not given, the default policy, which does nothing, will be used. Optional. |  [optional] |
|**restartTries** | **Integer** | RestartRetries is the number of attempts that will be made to restart the container. Only available when RestartPolicy is set to \&quot;on-failure\&quot;. Optional. |  [optional] |
|**sdnotifyMode** | **String** | Determine how to handle the NOTIFY_SOCKET - do we participate or pass it through \&quot;container\&quot; - let the OCI runtime deal with it, advertise conmon&#39;s MAINPID \&quot;conmon-only\&quot; - advertise conmon&#39;s MAINPID, send READY when started, don&#39;t pass to OCI \&quot;ignore\&quot; - unset NOTIFY_SOCKET Optional. |  [optional] |
|**secretEnv** | **Map&lt;String, String&gt;** | EnvSecrets are secrets that will be set as environment variables Optional. |  [optional] |
|**stdin** | **Boolean** | Stdin is whether the container will keep its STDIN open. Optional. |  [optional] |
|**stopSignal** | **Long** | It implements the [os.Signal] interface. |  [optional] |
|**stopTimeout** | **Integer** | StopTimeout is a timeout between the container&#39;s stop signal being sent and SIGKILL being sent. If not provided, the default will be used. If 0 is used, stop signal will not be sent, and SIGKILL will be sent instead. Optional. |  [optional] |
|**sysctl** | **Map&lt;String, String&gt;** | Sysctl sets kernel parameters for the container |  [optional] |
|**systemd** | **String** | Systemd is whether the container will be started in systemd mode. Valid options are \&quot;true\&quot;, \&quot;false\&quot;, and \&quot;always\&quot;. \&quot;true\&quot; enables this mode only if the binary run in the container is sbin/init or systemd. \&quot;always\&quot; unconditionally enables systemd mode. \&quot;false\&quot; unconditionally disables systemd mode. If enabled, mounts and stop signal will be modified. If set to \&quot;always\&quot; or set to \&quot;true\&quot; and conditionally triggered, conflicts with StopSignal. If not specified, \&quot;false\&quot; will be assumed. Optional. |  [optional] |
|**terminal** | **Boolean** | Terminal is whether the container will create a PTY. Optional. |  [optional] |
|**timeout** | **Integer** | Timeout is a maximum time in seconds the container will run before main process is sent SIGKILL. If 0 is used, signal will not be sent. Container can run indefinitely if they do not stop after the default termination signal. Optional. |  [optional] |
|**timezone** | **String** | Timezone is the timezone inside the container. Local means it has the same timezone as the host machine Optional. |  [optional] |
|**unsetenv** | **List&lt;String&gt;** | UnsetEnv unsets the specified default environment variables from the image or from built-in or containers.conf Optional. |  [optional] |
|**unsetenvall** | **Boolean** | UnsetEnvAll unsetall default environment variables from the image or from built-in or containers.conf UnsetEnvAll unsets all default environment variables from the image or from built-in Optional. |  [optional] |
|**utsns** | [**Namespace**](Namespace.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


