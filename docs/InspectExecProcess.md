

# InspectExecProcess

InspectExecProcess contains information about the process in a given exec session.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**arguments** | **List&lt;String&gt;** | Arguments are the arguments to the entrypoint command of the exec session. |  [optional] |
|**entrypoint** | **String** | Entrypoint is the entrypoint for the exec session (the command that will be executed in the container). |  [optional] |
|**privileged** | **Boolean** | Privileged is whether the exec session will be started with elevated privileges. |  [optional] |
|**tty** | **Boolean** | Tty is whether the exec session created a terminal. |  [optional] |
|**user** | **String** | User is the user the exec session was started as. |  [optional] |


## Implemented Interfaces

* Serializable


