

# PaymentsCaptureRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | The unique identifier for the merchant |  [optional] |
|**amountToCapture** | **Long** | The Amount to be captured/ debited from the user&#39;s payment method. |  |
|**refundUncapturedAmount** | **Boolean** | Decider to refund the uncaptured amount |  [optional] |
|**statementDescriptorSuffix** | **String** | Provides information about a card payment that customers see on their statements. |  [optional] |
|**statementDescriptorPrefix** | **String** | Concatenated with the statement descriptor suffix that’s set on the account to form the complete statement descriptor. |  [optional] |
|**merchantConnectorDetails** | [**MerchantConnectorDetailsWrap**](MerchantConnectorDetailsWrap.md) |  |  [optional] |



