

# PaymentsIntentResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Global Payment Id for the payment |  |
|**status** | **IntentStatus** |  |  |
|**amountDetails** | [**AmountDetailsResponse**](AmountDetailsResponse.md) |  |  |
|**clientSecret** | **String** | It&#39;s a token used for client side verification. |  |
|**merchantReferenceId** | **String** | Unique identifier for the payment. This ensures idempotency for multiple payments that have been done by a single merchant. |  [optional] |
|**routingAlgorithmId** | **String** | The routing algorithm id to be used for the payment |  [optional] |
|**captureMethod** | **CaptureMethod** |  |  |
|**authenticationType** | **AuthenticationType** |  |  |
|**billing** | [**Address**](Address.md) |  |  [optional] |
|**shipping** | [**Address**](Address.md) |  |  [optional] |
|**customerId** | **String** | The identifier for the customer |  [optional] |
|**customerPresent** | **PresenceOfCustomerDuringPayment** |  |  |
|**description** | **String** | A description for the payment |  [optional] |
|**returnUrl** | **String** | The URL to which you want the user to be redirected after the completion of the payment operation |  [optional] |
|**setupFutureUsage** | **FutureUsage** |  |  |
|**applyMitExemption** | **MitExemptionRequest** |  |  |
|**statementDescriptor** | **String** | For non-card charges, you can use this value as the complete description that appears on your customers’ statements. Must contain at least one letter, maximum 22 characters. |  [optional] |
|**orderDetails** | [**List&lt;OrderDetailsWithAmount&gt;**](OrderDetailsWithAmount.md) | Use this object to capture the details about the different products for which the payment is being made. The sum of amount across different products here should be equal to the overall payment amount |  [optional] |
|**allowedPaymentMethodTypes** | **List&lt;PaymentMethodType&gt;** | Use this parameter to restrict the Payment Method Types to show for a given PaymentIntent |  [optional] |
|**metadata** | **Object** | Metadata is useful for storing additional, unstructured information on an object. |  [optional] |
|**connectorMetadata** | [**ConnectorMetadata**](ConnectorMetadata.md) |  |  [optional] |
|**featureMetadata** | [**FeatureMetadata**](FeatureMetadata.md) |  |  [optional] |
|**paymentLinkEnabled** | **EnablePaymentLinkRequest** |  |  |
|**paymentLinkConfig** | [**PaymentLinkConfigRequest**](PaymentLinkConfigRequest.md) |  |  [optional] |
|**requestIncrementalAuthorization** | **RequestIncrementalAuthorization** |  |  |
|**expiresOn** | **OffsetDateTime** | Will be used to expire client secret after certain amount of time to be supplied in seconds |  |
|**frmMetadata** | **Object** | Additional data related to some frm(Fraud Risk Management) connectors |  [optional] |
|**requestExternalThreeDsAuthentication** | **External3dsAuthenticationRequest** |  |  |



