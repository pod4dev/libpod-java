

# InspectContainerConfig

InspectContainerConfig holds further data about how a container was initially configured.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**annotations** | **Map&lt;String, String&gt;** | Container annotations |  [optional] |
|**attachStderr** | **Boolean** | Unused, at present |  [optional] |
|**attachStdin** | **Boolean** | Unused, at present |  [optional] |
|**attachStdout** | **Boolean** | Unused, at present |  [optional] |
|**chrootDirs** | **List&lt;String&gt;** | ChrootDirs is an additional set of directories that need to be treated as root directories. Standard bind mounts will be mounted into paths relative to these directories. |  [optional] |
|**cmd** | **List&lt;String&gt;** | Container command |  [optional] |
|**createCommand** | **List&lt;String&gt;** | CreateCommand is the full command plus arguments of the process the container has been created with. |  [optional] |
|**domainname** | **String** | Container domain name - unused at present |  [optional] |
|**entrypoint** | **List&lt;String&gt;** | Container entrypoint |  [optional] |
|**env** | **List&lt;String&gt;** | Container environment variables |  [optional] |
|**exposedPorts** | **Map&lt;String, Object&gt;** | ExposedPorts includes ports the container has exposed. |  [optional] |
|**healthLogDestination** | **String** | HealthLogDestination defines the destination where the log is stored |  [optional] |
|**healthcheck** | [**Schema2HealthConfig**](Schema2HealthConfig.md) |  |  [optional] |
|**healthcheckMaxLogCount** | **Integer** | HealthMaxLogCount is maximum number of attempts in the HealthCheck log file. (&#39;0&#39; value means an infinite number of attempts in the log file) |  [optional] |
|**healthcheckMaxLogSize** | **Integer** | HealthMaxLogSize is the maximum length in characters of stored HealthCheck log (\&quot;0\&quot; value means an infinite log length) |  [optional] |
|**healthcheckOnFailureAction** | **String** | HealthcheckOnFailureAction defines an action to take once the container turns unhealthy. |  [optional] |
|**hostname** | **String** | Container hostname |  [optional] |
|**image** | **String** | Container image |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Container labels |  [optional] |
|**onBuild** | **String** | On-build arguments - presently unused. More of Buildah&#39;s domain. |  [optional] |
|**openStdin** | **Boolean** | Whether the container leaves STDIN open |  [optional] |
|**passwd** | **Boolean** | Passwd determines whether or not podman can add entries to /etc/passwd and /etc/group |  [optional] |
|**secrets** | [**List&lt;InspectSecret&gt;**](InspectSecret.md) | Secrets are the secrets mounted in the container |  [optional] |
|**startupHealthCheck** | [**StartupHealthCheck**](StartupHealthCheck.md) |  |  [optional] |
|**stdinOnce** | **Boolean** | Whether STDIN is only left open once. Presently not supported by Podman, unused. |  [optional] |
|**stopSignal** | **String** | Container stop signal |  [optional] |
|**stopTimeout** | **Integer** | StopTimeout is time before container is stopped when calling stop |  [optional] |
|**systemdMode** | **Boolean** | SystemdMode is whether the container is running in systemd mode. In systemd mode, the container configuration is customized to optimize running systemd in the container. |  [optional] |
|**timeout** | **Integer** | Timeout is time before container is killed by conmon |  [optional] |
|**timezone** | **String** | Timezone is the timezone inside the container. Local means it has the same timezone as the host machine |  [optional] |
|**tty** | **Boolean** | Whether the container creates a TTY |  [optional] |
|**umask** | **String** | Umask is the umask inside the container. |  [optional] |
|**user** | **String** | User the container was launched with |  [optional] |
|**volumes** | **Map&lt;String, Object&gt;** | Unused, at present. I&#39;ve never seen this field populated. |  [optional] |
|**workingDir** | **String** | Container working directory |  [optional] |
|**sdNotifyMode** | **String** | SdNotifyMode is the sd-notify mode of the container. |  [optional] |
|**sdNotifySocket** | **String** | SdNotifySocket is the NOTIFY_SOCKET in use by/configured for the container. |  [optional] |


## Implemented Interfaces

* Serializable


