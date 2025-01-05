

# BusinessPaymentLinkConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**theme** | **String** | custom theme for the payment link |  [optional] |
|**logo** | **String** | merchant display logo |  [optional] |
|**sellerName** | **String** | Custom merchant name for payment link |  [optional] |
|**sdkLayout** | **String** | Custom layout for sdk |  [optional] |
|**displaySdkOnly** | **Boolean** | Display only the sdk for payment link |  [optional] |
|**enabledSavedPaymentMethod** | **Boolean** | Enable saved payment method option for payment link |  [optional] |
|**transactionDetails** | [**List&lt;PaymentLinkTransactionDetails&gt;**](PaymentLinkTransactionDetails.md) | Dynamic details related to merchant to be rendered in payment link |  [optional] |
|**domainName** | **String** | Custom domain name to be used for hosting the link in your own domain |  [optional] |
|**businessSpecificConfigs** | [**Map&lt;String, PaymentLinkConfigRequest&gt;**](PaymentLinkConfigRequest.md) | list of configs for multi theme setup |  [optional] |
|**allowedDomains** | **Set&lt;String&gt;** | A list of allowed domains (glob patterns) where this link can be embedded / opened from |  [optional] |



