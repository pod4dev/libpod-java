

# UpdateContainerDevicesLimits


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blkIOWeightDevice** | [**List&lt;WeightDevice&gt;**](WeightDevice.md) | Block IO weight (relative device weight) in the form: &#x60;&#x60;&#x60;[{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Weight\&quot;: weight}]&#x60;&#x60;&#x60; |  [optional] |
|**deviceReadBPs** | [**List&lt;ThrottleDevice&gt;**](ThrottleDevice.md) | Limit read rate (bytes per second) from a device, in the form: &#x60;&#x60;&#x60;[{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Rate\&quot;: rate}]&#x60;&#x60;&#x60; |  [optional] |
|**deviceReadIOPs** | [**List&lt;ThrottleDevice&gt;**](ThrottleDevice.md) | Limit read rate (IO per second) from a device, in the form: &#x60;&#x60;&#x60;[{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Rate\&quot;: rate}]&#x60;&#x60;&#x60; |  [optional] |
|**deviceWriteBPs** | [**List&lt;ThrottleDevice&gt;**](ThrottleDevice.md) | Limit write rate (bytes per second) to a device, in the form: &#x60;&#x60;&#x60;[{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Rate\&quot;: rate}]&#x60;&#x60;&#x60; |  [optional] |
|**deviceWriteIOPs** | [**List&lt;ThrottleDevice&gt;**](ThrottleDevice.md) | Limit write rate (IO per second) to a device, in the form: &#x60;&#x60;&#x60;[{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Rate\&quot;: rate}]&#x60;&#x60;&#x60; |  [optional] |


## Implemented Interfaces

* Serializable


