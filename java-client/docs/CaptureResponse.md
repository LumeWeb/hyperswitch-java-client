

# CaptureResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**captureId** | **String** | Unique identifier for the capture |  |
|**status** | **CaptureStatus** |  |  |
|**amount** | **Long** | The capture amount. Amount for the payment in lowest denomination of the currency. (i.e) in cents for USD denomination, in paisa for INR denomination etc., |  |
|**currency** | **Currency** |  |  [optional] |
|**connector** | **String** | The connector used for the payment |  |
|**authorizedAttemptId** | **String** | Unique identifier for the parent attempt on which this capture is made |  |
|**connectorCaptureId** | **String** | A unique identifier for this capture provided by the connector |  [optional] |
|**captureSequence** | **Integer** | Sequence number of this capture, in the series of captures made for the parent attempt |  |
|**errorMessage** | **String** | If there was an error while calling the connector the error message is received here |  [optional] |
|**errorCode** | **String** | If there was an error while calling the connectors the code is received here |  [optional] |
|**errorReason** | **String** | If there was an error while calling the connectors the reason is received here |  [optional] |
|**referenceId** | **String** | Reference to the capture at connector side |  [optional] |



