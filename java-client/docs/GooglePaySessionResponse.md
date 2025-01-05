

# GooglePaySessionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantInfo** | [**GpayMerchantInfo**](GpayMerchantInfo.md) |  |  |
|**shippingAddressRequired** | **Boolean** | Is shipping address required |  |
|**emailRequired** | **Boolean** | Is email required |  |
|**shippingAddressParameters** | [**GpayShippingAddressParameters**](GpayShippingAddressParameters.md) |  |  |
|**allowedPaymentMethods** | [**List&lt;GpayAllowedPaymentMethods&gt;**](GpayAllowedPaymentMethods.md) | List of the allowed payment meythods |  |
|**transactionInfo** | [**GpayTransactionInfo**](GpayTransactionInfo.md) |  |  |
|**delayedSessionToken** | **Boolean** | Identifier for the delayed session response |  |
|**connector** | **String** | The name of the connector |  |
|**sdkNextAction** | [**SdkNextAction**](SdkNextAction.md) |  |  |
|**secrets** | [**SecretInfoToInitiateSdk**](SecretInfoToInitiateSdk.md) |  |  [optional] |



