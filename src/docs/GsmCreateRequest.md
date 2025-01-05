

# GsmCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connector** | **Connector** |  |  |
|**flow** | **String** | The flow in which the code and message occurred for a connector |  |
|**subFlow** | **String** | The sub_flow in which the code and message occurred  for a connector |  |
|**code** | **String** | code received from the connector |  |
|**message** | **String** | message received from the connector |  |
|**status** | **String** | status provided by the router |  |
|**routerError** | **String** | optional error provided by the router |  [optional] |
|**decision** | **GsmDecision** |  |  |
|**stepUpPossible** | **Boolean** | indicates if step_up retry is possible |  |
|**unifiedCode** | **String** | error code unified across the connectors |  [optional] |
|**unifiedMessage** | **String** | error message unified across the connectors |  [optional] |



