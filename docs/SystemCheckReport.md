

# SystemCheckReport

SystemCheckReport provides a report of what a storage consistency check found, and if we removed anything that was damaged, what we removed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**containers** | **Map&lt;String, List&lt;String&gt;&gt;** |  |  [optional] |
|**errors** | **Boolean** |  |  [optional] |
|**images** | **Map&lt;String, List&lt;String&gt;&gt;** |  |  [optional] |
|**layers** | **Map&lt;String, List&lt;String&gt;&gt;** |  |  [optional] |
|**roImages** | **Map&lt;String, List&lt;String&gt;&gt;** |  |  [optional] |
|**roLayers** | **Map&lt;String, List&lt;String&gt;&gt;** |  |  [optional] |
|**removedContainers** | **Map&lt;String, String&gt;** |  |  [optional] |
|**removedImages** | **Map&lt;String, List&lt;String&gt;&gt;** |  |  [optional] |
|**removedLayers** | **List&lt;String&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


