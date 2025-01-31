

# LinuxIntelRdt

LinuxIntelRdt has container runtime resource constraints for Intel RDT CAT and MBA features and flags enabling Intel RDT CMT and MBM features. Intel RDT features are available in Linux 4.14 and newer kernel versions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**closID** | **String** | The identity for RDT Class of Service |  [optional] |
|**enableCMT** | **Boolean** | EnableCMT is the flag to indicate if the Intel RDT CMT is enabled. CMT (Cache Monitoring Technology) supports monitoring of the last-level cache (LLC) occupancy for the container. |  [optional] |
|**enableMBM** | **Boolean** | EnableMBM is the flag to indicate if the Intel RDT MBM is enabled. MBM (Memory Bandwidth Monitoring) supports monitoring of total and local memory bandwidth for the container. |  [optional] |
|**l3CacheSchema** | **String** | The schema for L3 cache id and capacity bitmask (CBM) Format: \&quot;L3:&lt;cache_id0&gt;&#x3D;&lt;cbm0&gt;;&lt;cache_id1&gt;&#x3D;&lt;cbm1&gt;;...\&quot; |  [optional] |
|**memBwSchema** | **String** | The schema of memory bandwidth per L3 cache id Format: \&quot;MB:&lt;cache_id0&gt;&#x3D;bandwidth0;&lt;cache_id1&gt;&#x3D;bandwidth1;...\&quot; The unit of memory bandwidth is specified in \&quot;percentages\&quot; by default, and in \&quot;MBps\&quot; if MBA Software Controller is enabled. |  [optional] |


## Implemented Interfaces

* Serializable


