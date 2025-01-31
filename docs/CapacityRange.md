

# CapacityRange

CapacityRange describes the minimum and maximum capacity a volume should be created with

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**limitBytes** | **Long** | LimitBytes specifies that a volume must not be bigger than this. The value of 0 indicates an unspecified maximum |  [optional] |
|**requiredBytes** | **Long** | RequiredBytes specifies that a volume must be at least this big. The value of 0 indicates an unspecified minimum. |  [optional] |


## Implemented Interfaces

* Serializable


