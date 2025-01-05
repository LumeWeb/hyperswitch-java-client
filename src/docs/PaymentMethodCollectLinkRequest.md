

# PaymentMethodCollectLinkRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**logo** | **String** | Merchant&#39;s display logo |  [optional] |
|**merchantName** | **String** | Custom merchant name for the link |  [optional] |
|**theme** | **String** | Primary color to be used in the form represented in hex format |  [optional] |
|**pmCollectLinkId** | **String** | The unique identifier for the collect link. |  [optional] |
|**customerId** | **String** | The unique identifier of the customer. |  |
|**sessionExpiry** | **Integer** | Will be used to expire client secret after certain amount of time to be supplied in seconds (900) for 15 mins |  [optional] |
|**returnUrl** | **String** | Redirect to this URL post completion |  [optional] |
|**enabledPaymentMethods** | [**List&lt;EnabledPaymentMethod&gt;**](EnabledPaymentMethod.md) | List of payment methods shown on collect UI |  [optional] |



