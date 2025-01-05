

# PaymentsConfirmIntentRequest

Request for Payment Intent Confirm

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**returnUrl** | **String** | The URL to which you want the user to be redirected after the completion of the payment operation If this url is not passed, the url configured in the business profile will be used |  [optional] |
|**paymentMethodData** | [**PaymentMethodDataRequest**](PaymentMethodDataRequest.md) |  |  |
|**paymentMethodType** | **PaymentMethod** |  |  |
|**paymentMethodSubtype** | **PaymentMethodType** |  |  |
|**shipping** | [**Address**](Address.md) |  |  [optional] |
|**customerAcceptance** | [**CustomerAcceptance**](CustomerAcceptance.md) |  |  [optional] |
|**browserInfo** | [**BrowserInformation**](BrowserInformation.md) |  |  [optional] |



