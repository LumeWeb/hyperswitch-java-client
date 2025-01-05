

# SessionTokenOneOf4


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sessionTokenData** | [**ApplePaySessionResponse**](ApplePaySessionResponse.md) |  |  [optional] |
|**paymentRequestData** | [**ApplePayPaymentRequest**](ApplePayPaymentRequest.md) |  |  [optional] |
|**connector** | **String** | The session token is w.r.t this connector |  |
|**delayedSessionToken** | **Boolean** | Identifier for the delayed session response |  |
|**sdkNextAction** | [**SdkNextAction**](SdkNextAction.md) |  |  |
|**connectorReferenceId** | **String** | The connector transaction id |  [optional] |
|**connectorSdkPublicKey** | **String** | The public key id is to invoke third party sdk |  [optional] |
|**connectorMerchantId** | **String** | The connector merchant id |  [optional] |
|**walletName** | [**WalletNameEnum**](#WalletNameEnum) |  |  |



## Enum: WalletNameEnum

| Name | Value |
|---- | -----|
| APPLE_PAY | &quot;apple_pay&quot; |



