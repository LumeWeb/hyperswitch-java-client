

# PaymentLinkConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**theme** | **String** | custom theme for the payment link |  |
|**logo** | **String** | merchant display logo |  |
|**sellerName** | **String** | Custom merchant name for payment link |  |
|**sdkLayout** | **String** | Custom layout for sdk |  |
|**displaySdkOnly** | **Boolean** | Display only the sdk for payment link |  |
|**enabledSavedPaymentMethod** | **Boolean** | Enable saved payment method option for payment link |  |
|**allowedDomains** | **Set&lt;String&gt;** | A list of allowed domains (glob patterns) where this link can be embedded / opened from |  [optional] |
|**transactionDetails** | [**List&lt;PaymentLinkTransactionDetails&gt;**](PaymentLinkTransactionDetails.md) | Dynamic details related to merchant to be rendered in payment link |  [optional] |



