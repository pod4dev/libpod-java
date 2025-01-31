

# HostInfo

HostInfo describes the libpod host

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**arch** | **String** |  |  [optional] |
|**buildahVersion** | **String** |  |  [optional] |
|**cgroupControllers** | **List&lt;String&gt;** |  |  [optional] |
|**cgroupManager** | **String** |  |  [optional] |
|**cgroupVersion** | **String** |  |  [optional] |
|**conmon** | [**ConmonInfo**](ConmonInfo.md) |  |  [optional] |
|**cpuUtilization** | [**CPUUsage**](CPUUsage.md) |  |  [optional] |
|**cpus** | **Long** |  |  [optional] |
|**databaseBackend** | **String** |  |  [optional] |
|**distribution** | [**DistributionInfo**](DistributionInfo.md) |  |  [optional] |
|**eventLogger** | **String** |  |  [optional] |
|**freeLocks** | **Integer** |  |  [optional] |
|**hostname** | **String** |  |  [optional] |
|**idMappings** | [**IDMappings**](IDMappings.md) |  |  [optional] |
|**kernel** | **String** |  |  [optional] |
|**linkmode** | **String** |  |  [optional] |
|**logDriver** | **String** |  |  [optional] |
|**memFree** | **Long** |  |  [optional] |
|**memTotal** | **Long** |  |  [optional] |
|**networkBackend** | **String** |  |  [optional] |
|**networkBackendInfo** | [**NetworkInfo**](NetworkInfo.md) |  |  [optional] |
|**ociRuntime** | [**OCIRuntimeInfo**](OCIRuntimeInfo.md) |  |  [optional] |
|**os** | **String** |  |  [optional] |
|**pasta** | [**PastaInfo**](PastaInfo.md) |  |  [optional] |
|**remoteSocket** | [**RemoteSocket**](RemoteSocket.md) |  |  [optional] |
|**rootlessNetworkCmd** | **String** | RootlessNetworkCmd returns the default rootless network command (slirp4netns or pasta) |  [optional] |
|**runtimeInfo** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**security** | [**SecurityInfo**](SecurityInfo.md) |  |  [optional] |
|**serviceIsRemote** | **Boolean** | ServiceIsRemote is true when the podman/libpod service is remote to the client |  [optional] |
|**slirp4netns** | [**SlirpInfo**](SlirpInfo.md) |  |  [optional] |
|**swapFree** | **Long** |  |  [optional] |
|**swapTotal** | **Long** |  |  [optional] |
|**uptime** | **String** |  |  [optional] |
|**variant** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


