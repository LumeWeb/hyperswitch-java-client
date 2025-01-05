

# ApplepaySessionTokenResponse


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



