

# NetOptions

NetOptions reflect the shared network options between pods and containers

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dnsOption** | **List&lt;String&gt;** |  |  [optional] |
|**dnsSearch** | **List&lt;String&gt;** |  |  [optional] |
|**dnsServer** | **List&lt;String&gt;** |  |  [optional] |
|**hostadd** | **List&lt;String&gt;** |  |  [optional] |
|**netns** | [**Namespace**](Namespace.md) |  |  [optional] |
|**networkAlias** | **List&lt;String&gt;** |  |  [optional] |
|**networkOptions** | **Map&lt;String, List&lt;String&gt;&gt;** | NetworkOptions are additional options for each network |  [optional] |
|**networks** | [**Map&lt;String, PerNetworkOptions&gt;**](PerNetworkOptions.md) |  |  [optional] |
|**noManageHosts** | **Boolean** |  |  [optional] |
|**noManageResolvConf** | **Boolean** |  |  [optional] |
|**portmappings** | [**List&lt;PortMapping&gt;**](PortMapping.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


