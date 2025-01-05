

# GsmUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connector** | **String** | The connector through which payment has gone through |  |
|**flow** | **String** | The flow in which the code and message occurred for a connector |  |
|**subFlow** | **String** | The sub_flow in which the code and message occurred  for a connector |  |
|**code** | **String** | code received from the connector |  |
|**message** | **String** | message received from the connector |  |
|**status** | **String** | status provided by the router |  [optional] |
|**routerError** | **String** | optional error provided by the router |  [optional] |
|**decision** | **GsmDecision** |  |  [optional] |
|**stepUpPossible** | **Boolean** | indicates if step_up retry is possible |  [optional] |
|**unifiedCode** | **String** | error code unified across the connectors |  [optional] |
|**unifiedMessage** | **String** | error message unified across the connectors |  [optional] |



