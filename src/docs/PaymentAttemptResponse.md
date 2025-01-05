

# PaymentAttemptResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attemptId** | **String** | Unique identifier for the attempt |  |
|**status** | **AttemptStatus** |  |  |
|**amount** | **Long** | The payment attempt amount. Amount for the payment in lowest denomination of the currency. (i.e) in cents for USD denomination, in paisa for INR denomination etc., |  |
|**currency** | **Currency** |  |  [optional] |
|**connector** | **String** | The connector used for the payment |  [optional] |
|**errorMessage** | **String** | If there was an error while calling the connector, the error message is received here |  [optional] |
|**paymentMethod** | **PaymentMethod** |  |  [optional] |
|**connectorTransactionId** | **String** | A unique identifier for a payment provided by the connector |  [optional] |
|**captureMethod** | **CaptureMethod** |  |  [optional] |
|**authenticationType** | **AuthenticationType** |  |  [optional] |
|**createdAt** | **OffsetDateTime** | Time at which the payment attempt was created |  |
|**modifiedAt** | **OffsetDateTime** | Time at which the payment attempt was last modified |  |
|**cancellationReason** | **String** | If the payment was cancelled the reason will be provided here |  [optional] |
|**mandateId** | **String** | A unique identifier to link the payment to a mandate, can be use instead of payment_method_data |  [optional] |
|**errorCode** | **String** | If there was an error while calling the connectors the error code is received here |  [optional] |
|**paymentToken** | **String** | Provide a reference to a stored payment method |  [optional] |
|**connectorMetadata** | **Object** | Additional data related to some connectors |  [optional] |
|**paymentExperience** | **PaymentExperience** |  |  [optional] |
|**paymentMethodType** | **PaymentMethodType** |  |  [optional] |
|**referenceId** | **String** | Reference to the payment at connector side |  [optional] |
|**unifiedCode** | **String** | (This field is not live yet)Error code unified across the connectors is received here if there was an error while calling connector |  [optional] |
|**unifiedMessage** | **String** | (This field is not live yet)Error message unified across the connectors is received here if there was an error while calling connector |  [optional] |
|**clientSource** | **String** | Value passed in X-CLIENT-SOURCE header during payments confirm request by the client |  [optional] |
|**clientVersion** | **String** | Value passed in X-CLIENT-VERSION header during payments confirm request by the client |  [optional] |



