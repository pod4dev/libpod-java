

# HealthCheckResults

HealthCheckResults describes the results/logs from a healthcheck

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**failingStreak** | **Long** | FailingStreak is the number of consecutive failed healthchecks |  [optional] |
|**log** | [**List&lt;HealthCheckLog&gt;**](HealthCheckLog.md) | Log describes healthcheck attempts and results |  [optional] |
|**status** | **String** | Status starting, healthy or unhealthy |  [optional] |


## Implemented Interfaces

* Serializable


