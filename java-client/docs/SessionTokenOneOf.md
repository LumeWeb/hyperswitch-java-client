

# SessionTokenOneOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**delayedSessionToken** | **Boolean** | Identifier for the delayed session response |  |
|**connector** | **String** | The name of the connector |  |
|**sdkNextAction** | [**SdkNextAction**](SdkNextAction.md) |  |  |
|**merchantInfo** | [**GpayMerchantInfo**](GpayMerchantInfo.md) |  |  |
|**shippingAddressRequired** | **Boolean** | Is shipping address required |  |
|**emailRequired** | **Boolean** | Is email required |  |
|**shippingAddressParameters** | [**GpayShippingAddressParameters**](GpayShippingAddressParameters.md) |  |  |
|**allowedPaymentMethods** | [**List&lt;GpayAllowedPaymentMethods&gt;**](GpayAllowedPaymentMethods.md) | List of the allowed payment meythods |  |
|**transactionInfo** | [**GpayTransactionInfo**](GpayTransactionInfo.md) |  |  |
|**secrets** | [**SecretInfoToInitiateSdk**](SecretInfoToInitiateSdk.md) |  |  [optional] |
|**walletName** | [**WalletNameEnum**](#WalletNameEnum) |  |  |



## Enum: WalletNameEnum

| Name | Value |
|---- | -----|
| GOOGLE_PAY | &quot;google_pay&quot; |



