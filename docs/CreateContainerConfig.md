

# CreateContainerConfig

CreateContainerConfig used when compatible endpoint creates a container

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**argsEscaped** | **Boolean** |  |  [optional] |
|**attachStderr** | **Boolean** |  |  [optional] |
|**attachStdin** | **Boolean** |  |  [optional] |
|**attachStdout** | **Boolean** |  |  [optional] |
|**cmd** | **List&lt;String&gt;** | We need to override the json decoder to accept both options. |  [optional] |
|**domainname** | **String** |  |  [optional] |
|**entrypoint** | **List&lt;String&gt;** | We need to override the json decoder to accept both options. |  [optional] |
|**env** | **List&lt;String&gt;** |  |  [optional] |
|**envMerge** | **List&lt;String&gt;** |  |  [optional] |
|**exposedPorts** | **Map&lt;String, Object&gt;** | PortSet is a collection of structs indexed by Port |  [optional] |
|**healthcheck** | [**HealthcheckConfig**](HealthcheckConfig.md) |  |  [optional] |
|**hostConfig** | [**HostConfig**](HostConfig.md) |  |  [optional] |
|**hostname** | **String** |  |  [optional] |
|**image** | **String** |  |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**macAddress** | **String** | Mac Address of the container.  Deprecated: this field is deprecated since API v1.44. Use EndpointSettings.MacAddress instead. |  [optional] |
|**name** | **String** |  |  [optional] |
|**networkDisabled** | **Boolean** |  |  [optional] |
|**networkingConfig** | [**NetworkingConfig**](NetworkingConfig.md) |  |  [optional] |
|**onBuild** | **List&lt;String&gt;** |  |  [optional] |
|**openStdin** | **Boolean** |  |  [optional] |
|**shell** | **List&lt;String&gt;** | We need to override the json decoder to accept both options. |  [optional] |
|**stdinOnce** | **Boolean** |  |  [optional] |
|**stopSignal** | **String** |  |  [optional] |
|**stopTimeout** | **Long** |  |  [optional] |
|**tty** | **Boolean** |  |  [optional] |
|**unsetEnv** | **List&lt;String&gt;** |  |  [optional] |
|**unsetEnvAll** | **Boolean** |  |  [optional] |
|**user** | **String** |  |  [optional] |
|**volumes** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**workingDir** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


