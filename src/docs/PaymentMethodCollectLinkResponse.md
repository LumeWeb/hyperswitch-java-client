

# PaymentMethodCollectLinkResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**logo** | **String** | Merchant&#39;s display logo |  [optional] |
|**merchantName** | **String** | Custom merchant name for the link |  [optional] |
|**theme** | **String** | Primary color to be used in the form represented in hex format |  [optional] |
|**pmCollectLinkId** | **String** | The unique identifier for the collect link. |  |
|**customerId** | **String** | The unique identifier of the customer. |  |
|**expiry** | **OffsetDateTime** | Time when this link will be expired in ISO8601 format |  |
|**link** | **String** | URL to the form&#39;s link generated for collecting payment method details. |  |
|**returnUrl** | **String** | Redirect to this URL post completion |  [optional] |
|**enabledPaymentMethods** | [**List&lt;EnabledPaymentMethod&gt;**](EnabledPaymentMethod.md) | List of payment methods shown on collect UI |  [optional] |



