

# LinuxHugepageLimit

Default to reservation limits if supported. Otherwise fallback to page fault limits.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**limit** | **Integer** | Limit is the limit of \&quot;hugepagesize\&quot; hugetlb reservations (if supported) or usage. |  [optional] |
|**pageSize** | **String** | Pagesize is the hugepage size. Format: \&quot;&lt;size&gt;&lt;unit-prefix&gt;B&#39; (e.g. 64KB, 2MB, 1GB, etc.). |  [optional] |


## Implemented Interfaces

* Serializable


