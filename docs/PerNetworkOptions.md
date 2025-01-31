

# PerNetworkOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aliases** | **List&lt;String&gt;** | Aliases contains a list of names which the dns server should resolve to this container. Should only be set when DNSEnabled is true on the Network. If aliases are set but there is no dns support for this network the network interface implementation should ignore this and NOT error. Optional. |  [optional] |
|**interfaceName** | **String** | InterfaceName for this container. Required in the backend. Optional in the frontend. Will be filled with ethX (where X is a integer) when empty. |  [optional] |
|**staticIps** | **List&lt;String&gt;** | StaticIPs for this container. Optional. |  [optional] |
|**staticMac** | **String** | StaticMac for this container. Optional. |  [optional] |


## Implemented Interfaces

* Serializable


