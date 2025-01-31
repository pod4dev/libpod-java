

# PodCreateOptions

The JSON tags below are made to match the respective field in ContainerCreateOptions for the purpose of mapping.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cgroupParent** | **String** |  |  [optional] |
|**containerCommand** | **String** |  |  [optional] |
|**containerConmonPidfile** | **String** |  |  [optional] |
|**containerName** | **String** |  |  [optional] |
|**cpus** | **Double** |  |  [optional] |
|**cpusetCpus** | **String** |  |  [optional] |
|**createCommand** | **List&lt;String&gt;** |  |  [optional] |
|**deviceReadBps** | **List&lt;String&gt;** |  |  [optional] |
|**devices** | **List&lt;String&gt;** |  |  [optional] |
|**exitPolicy** | **String** |  |  [optional] |
|**hostname** | **String** |  |  [optional] |
|**infra** | **Boolean** |  |  [optional] |
|**infraImage** | **String** |  |  [optional] |
|**ipc** | **String** |  |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**net** | [**NetOptions**](NetOptions.md) |  |  [optional] |
|**pid** | **String** |  |  [optional] |
|**restart** | **String** |  |  [optional] |
|**securityOpt** | **List&lt;String&gt;** |  |  [optional] |
|**share** | **List&lt;String&gt;** |  |  [optional] |
|**shareParent** | **Boolean** |  |  [optional] |
|**sysctl** | **List&lt;String&gt;** |  |  [optional] |
|**uts** | **String** |  |  [optional] |
|**volume** | **List&lt;String&gt;** |  |  [optional] |
|**volumesFrom** | **List&lt;String&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


