

# PaymentsConfirmIntentResponse

Response for Payment Intent Confirm

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the payment. This ensures idempotency for multiple payments that have been done by a single merchant. |  |
|**status** | **IntentStatus** |  |  |
|**amount** | [**ConfirmIntentAmountDetailsResponse**](ConfirmIntentAmountDetailsResponse.md) |  |  |
|**connector** | **String** | The connector used for the payment |  |
|**clientSecret** | **String** | It&#39;s a token used for client side verification. |  |
|**created** | **OffsetDateTime** | Time when the payment was created |  |
|**paymentMethodData** | [**PaymentMethodDataResponseWithBilling**](PaymentMethodDataResponseWithBilling.md) |  |  [optional] |
|**paymentMethodType** | **PaymentMethod** |  |  |
|**paymentMethodSubtype** | **PaymentMethodType** |  |  |
|**nextAction** | [**NextActionData**](NextActionData.md) |  |  [optional] |
|**connectorTransactionId** | **String** | A unique identifier for a payment provided by the connector |  [optional] |
|**connectorReferenceId** | **String** | reference(Identifier) to the payment at connector side |  [optional] |
|**merchantConnectorId** | **String** | Identifier of the connector ( merchant connector account ) which was chosen to make the payment |  |
|**browserInfo** | [**BrowserInformation**](BrowserInformation.md) |  |  [optional] |
|**error** | [**ErrorDetails**](ErrorDetails.md) |  |  [optional] |



