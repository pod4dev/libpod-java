

# ListContainer

ListContainer describes a container suitable for listing

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoRemove** | **Boolean** | AutoRemove |  [optional] |
|**ciDFile** | **String** | CIDFile specified at creation time. |  [optional] |
|**command** | **List&lt;String&gt;** | Container command |  [optional] |
|**created** | **OffsetDateTime** | Container creation time |  [optional] |
|**createdAt** | **String** | Human-readable container creation time. |  [optional] |
|**exitCode** | **Integer** | If container has exited, the return code from the command |  [optional] |
|**exited** | **Boolean** | If container has exited/stopped |  [optional] |
|**exitedAt** | **Long** | Time container exited |  [optional] |
|**exposedPorts** | **Object** | ExposedPorts contains the ports that are exposed but not forwarded, see Ports for forwarded ports. The key is the port number and the string slice contains the protocols, i.e. \&quot;tcp\&quot;, \&quot;udp\&quot; and \&quot;sctp\&quot;. |  [optional] |
|**id** | **String** | The unique identifier for the container |  [optional] |
|**image** | **String** | Container image |  [optional] |
|**imageID** | **String** | Container image ID |  [optional] |
|**isInfra** | **Boolean** | If this container is a Pod infra container |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Labels for container |  [optional] |
|**mounts** | **List&lt;String&gt;** | User volume mounts |  [optional] |
|**names** | **List&lt;String&gt;** | The names assigned to the container |  [optional] |
|**namespaces** | [**ListContainerNamespaces**](ListContainerNamespaces.md) |  |  [optional] |
|**networks** | **List&lt;String&gt;** | The network names assigned to the container |  [optional] |
|**pid** | **Long** | The process id of the container |  [optional] |
|**pod** | **String** | If the container is part of Pod, the Pod ID. Requires the pod boolean to be set |  [optional] |
|**podName** | **String** | If the container is part of Pod, the Pod name. Requires the pod boolean to be set |  [optional] |
|**ports** | [**List&lt;PortMapping&gt;**](PortMapping.md) | Port mappings |  [optional] |
|**restarts** | **Integer** | Restarts is how many times the container was restarted by its restart policy. This is NOT incremented by normal container restarts (only by restart policy). |  [optional] |
|**size** | [**ContainerSize**](ContainerSize.md) |  |  [optional] |
|**startedAt** | **Long** | Time when container started |  [optional] |
|**state** | **String** | State of container |  [optional] |
|**status** | **String** | Status is a human-readable approximation of a duration for json output |  [optional] |


## Implemented Interfaces

* Serializable


