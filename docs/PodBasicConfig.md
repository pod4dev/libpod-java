

# PodBasicConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exitPolicy** | **String** | ExitPolicy determines the pod&#39;s exit and stop behaviour. |  [optional] |
|**hostname** | **String** | Hostname is the pod&#39;s hostname. If not set, the name of the pod will be used (if a name was not provided here, the name auto-generated for the pod will be used). This will be used by the infra container and all containers in the pod as long as the UTS namespace is shared. Optional. |  [optional] |
|**infraCommand** | **List&lt;String&gt;** | InfraCommand sets the command that will be used to start the infra container. If not set, the default set in the Libpod configuration file will be used. Conflicts with NoInfra&#x3D;true. Optional. |  [optional] |
|**infraConmonPidFile** | **String** | InfraConmonPidFile is a custom path to store the infra container&#39;s conmon PID. |  [optional] |
|**infraImage** | **String** | InfraImage is the image that will be used for the infra container. If not set, the default set in the Libpod configuration file will be used. Conflicts with NoInfra&#x3D;true. Optional. |  [optional] |
|**infraName** | **String** | InfraName is the name that will be used for the infra container. If not set, the default set in the Libpod configuration file will be used. Conflicts with NoInfra&#x3D;true. Optional. |  [optional] |
|**ipcns** | [**Namespace**](Namespace.md) |  |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Labels are key-value pairs that are used to add metadata to pods. Optional. |  [optional] |
|**name** | **String** | Name is the name of the pod. If not provided, a name will be generated when the pod is created. Optional. |  [optional] |
|**noInfra** | **Boolean** | NoInfra tells the pod not to create an infra container. If this is done, many networking-related options will become unavailable. Conflicts with setting any options in PodNetworkConfig, and the InfraCommand and InfraImages in this struct. Optional. |  [optional] |
|**pidns** | [**Namespace**](Namespace.md) |  |  [optional] |
|**podCreateCommand** | **List&lt;String&gt;** |  |  [optional] |
|**podDevices** | **List&lt;String&gt;** | Devices contains user specified Devices to be added to the Pod |  [optional] |
|**restartPolicy** | **String** | RestartPolicy is the pod&#39;s restart policy - an action which will be taken when one or all the containers in the pod exits. If not given, the default policy will be set to Always, which restarts the containers in the pod when they exit indefinitely. Optional. |  [optional] |
|**restartTries** | **Integer** | RestartRetries is the number of attempts that will be made to restart the container. Only available when RestartPolicy is set to \&quot;on-failure\&quot;. Optional. |  [optional] |
|**shareParent** | **Boolean** | PodCreateCommand is the command used to create this pod. This will be shown in the output of Inspect() on the pod, and may also be used by some tools that wish to recreate the pod (e.g. &#x60;podman generate systemd --new&#x60;). Optional. ShareParent determines if all containers in the pod will share the pod&#39;s cgroup as the cgroup parent |  [optional] |
|**sharedNamespaces** | **List&lt;String&gt;** | SharedNamespaces instructs the pod to share a set of namespaces. Shared namespaces will be joined (by default) by every container which joins the pod. If not set and NoInfra is false, the pod will set a default set of namespaces to share. Conflicts with NoInfra&#x3D;true. Optional. |  [optional] |
|**sysctl** | **Map&lt;String, String&gt;** | Sysctl sets kernel parameters for the pod |  [optional] |
|**userns** | [**Namespace**](Namespace.md) |  |  [optional] |
|**utsns** | [**Namespace**](Namespace.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


