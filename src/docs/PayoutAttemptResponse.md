

# PayoutAttemptResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attemptId** | **String** | Unique identifier for the attempt |  |
|**status** | **PayoutStatus** |  |  |
|**amount** | **Long** | The payout attempt amount. Amount for the payout in lowest denomination of the currency. (i.e) in cents for USD denomination, in paisa for INR denomination etc., |  |
|**currency** | **Currency** |  |  [optional] |
|**connector** | **String** | The connector used for the payout |  [optional] |
|**errorCode** | **String** | Connector&#39;s error code in case of failures |  [optional] |
|**errorMessage** | **String** | Connector&#39;s error message in case of failures |  [optional] |
|**paymentMethod** | **PayoutType** |  |  [optional] |
|**payoutMethodType** | **PaymentMethodType** |  |  [optional] |
|**connectorTransactionId** | **String** | A unique identifier for a payout provided by the connector |  [optional] |
|**cancellationReason** | **String** | If the payout was cancelled the reason provided here |  [optional] |
|**unifiedCode** | **String** | (This field is not live yet) Error code unified across the connectors is received here in case of errors while calling the underlying connector |  [optional] |
|**unifiedMessage** | **String** | (This field is not live yet) Error message unified across the connectors is received here in case of errors while calling the underlying connector |  [optional] |



