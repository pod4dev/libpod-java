

# ContainerSecurityConfig

ContainerSecurityConfig is a container's security features, including SELinux, Apparmor, and Seccomp.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apparmorProfile** | **String** | ApparmorProfile is the name of the Apparmor profile the container will use. Optional. |  [optional] |
|**capAdd** | **List&lt;String&gt;** | CapAdd are capabilities which will be added to the container. Conflicts with Privileged. Optional. |  [optional] |
|**capDrop** | **List&lt;String&gt;** | CapDrop are capabilities which will be removed from the container. Conflicts with Privileged. Optional. |  [optional] |
|**groups** | **List&lt;String&gt;** | Groups are a list of supplemental groups the container&#39;s user will be granted access to. Optional. |  [optional] |
|**idmappings** | [**IDMappingOptions**](IDMappingOptions.md) |  |  [optional] |
|**labelNested** | **Boolean** | LabelNested indicates whether or not the container is allowed to run fully nested containers including SELinux labelling. Optional. |  [optional] |
|**mask** | **List&lt;String&gt;** | Mask is the path we want to mask in the container. This masks the paths given in addition to the default list. Optional |  [optional] |
|**noNewPrivileges** | **Boolean** | NoNewPrivileges is whether the container will set the no new privileges flag on create, which disables gaining additional privileges (e.g. via setuid) in the container. Optional. |  [optional] |
|**privileged** | **Boolean** | Privileged is whether the container is privileged. Privileged does the following: Adds all devices on the system to the container. Adds all capabilities to the container. Disables Seccomp, SELinux, and Apparmor confinement. (Though SELinux can be manually re-enabled). TODO: this conflicts with things. TODO: this does more. Optional. |  [optional] |
|**procfsOpts** | **List&lt;String&gt;** | ProcOpts are the options used for the proc mount. |  [optional] |
|**readOnlyFilesystem** | **Boolean** | ReadOnlyFilesystem indicates that everything will be mounted as read-only. Optional. |  [optional] |
|**readWriteTmpfs** | **Boolean** | ReadWriteTmpfs indicates that when running with a ReadOnlyFilesystem mount temporary file systems. Optional. |  [optional] |
|**seccompPolicy** | **String** | SeccompPolicy determines which seccomp profile gets applied the container. valid values: empty,default,image |  [optional] |
|**seccompProfilePath** | **String** | SeccompProfilePath is the path to a JSON file containing the container&#39;s Seccomp profile. If not specified, no Seccomp profile will be used. Optional. |  [optional] |
|**selinuxOpts** | **List&lt;String&gt;** | SelinuxProcessLabel is the process label the container will use. If SELinux is enabled and this is not specified, a label will be automatically generated if not specified. Optional. |  [optional] |
|**umask** | **String** | Umask is the umask the init process of the container will be run with. |  [optional] |
|**unmask** | **List&lt;String&gt;** | Unmask a path in the container. Some paths are masked by default, preventing them from being accessed within the container; this undoes that masking. If ALL is passed, all paths will be unmasked. Optional. |  [optional] |
|**user** | **String** | User is the user the container will be run as. Can be given as a UID or a username; if a username, it will be resolved within the container, using the container&#39;s /etc/passwd. If unset, the container will be run as root. Optional. |  [optional] |
|**userns** | [**Namespace**](Namespace.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


