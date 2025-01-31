

# HealthcheckConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**interval** | **Long** | A Duration represents the elapsed time between two instants as an int64 nanosecond count. The representation limits the largest representable duration to approximately 290 years. |  [optional] |
|**retries** | **Long** | Retries is the number of consecutive failures needed to consider a container as unhealthy. Zero means inherit. |  [optional] |
|**startInterval** | **Long** | A Duration represents the elapsed time between two instants as an int64 nanosecond count. The representation limits the largest representable duration to approximately 290 years. |  [optional] |
|**startPeriod** | **Long** | A Duration represents the elapsed time between two instants as an int64 nanosecond count. The representation limits the largest representable duration to approximately 290 years. |  [optional] |
|**test** | **List&lt;String&gt;** | Test is the test to perform to check that the container is healthy. An empty slice means to inherit the default. The options are: {} : inherit healthcheck {\&quot;NONE\&quot;} : disable healthcheck {\&quot;CMD\&quot;, args...} : exec arguments directly {\&quot;CMD-SHELL\&quot;, command} : run command with system&#39;s default shell |  [optional] |
|**timeout** | **Long** | A Duration represents the elapsed time between two instants as an int64 nanosecond count. The representation limits the largest representable duration to approximately 290 years. |  [optional] |


## Implemented Interfaces

* Serializable


