

# LinuxMemory

LinuxMemory for Linux cgroup 'memory' resource management

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**checkBeforeUpdate** | **Boolean** | CheckBeforeUpdate enables checking if a new memory limit is lower than the current usage during update, and if so, rejecting the new limit. |  [optional] |
|**disableOOMKiller** | **Boolean** | DisableOOMKiller disables the OOM killer for out of memory conditions |  [optional] |
|**kernel** | **Long** | Kernel memory limit (in bytes).  Deprecated: kernel-memory limits are not supported in cgroups v2, and were obsoleted in [kernel v5.4]. This field should no longer be used, as it may be ignored by runtimes.  [kernel v5.4]: https://github.com/torvalds/linux/commit/0158115f702b0ba208ab0 |  [optional] |
|**kernelTCP** | **Long** | Kernel memory limit for tcp (in bytes) |  [optional] |
|**limit** | **Long** | Memory limit (in bytes). |  [optional] |
|**reservation** | **Long** | Memory reservation or soft_limit (in bytes). |  [optional] |
|**swap** | **Long** | Total memory limit (memory + swap). |  [optional] |
|**swappiness** | **Integer** | How aggressive the kernel will swap memory pages. |  [optional] |
|**useHierarchy** | **Boolean** | Enables hierarchical memory accounting |  [optional] |


## Implemented Interfaces

* Serializable


