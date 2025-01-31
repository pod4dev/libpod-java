

# AuthConfig

AuthConfig contains authorization information for connecting to a Registry

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auth** | **String** |  |  [optional] |
|**email** | **String** | Email is an optional value associated with the username. This field is deprecated and will be removed in a later version of docker. |  [optional] |
|**identitytoken** | **String** | IdentityToken is used to authenticate the user and get an access token for the registry. |  [optional] |
|**password** | **String** |  |  [optional] |
|**registrytoken** | **String** | RegistryToken is a bearer token to be sent to a registry |  [optional] |
|**serveraddress** | **String** |  |  [optional] |
|**username** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


