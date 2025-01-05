

# PaymentMethodCreate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentMethod** | **PaymentMethod** |  |  |
|**paymentMethodType** | **PaymentMethodType** |  |  [optional] |
|**paymentMethodIssuer** | **String** | The name of the bank/ provider issuing the payment method to the end user |  [optional] |
|**paymentMethodIssuerCode** | **PaymentMethodIssuerCode** |  |  [optional] |
|**card** | [**CardDetail**](CardDetail.md) |  |  [optional] |
|**metadata** | **Object** | You can specify up to 50 keys, with key names up to 40 characters long and values up to 500 characters long. Metadata is useful for storing additional, structured information on an object. |  [optional] |
|**customerId** | **String** | The unique identifier of the customer. |  [optional] |
|**cardNetwork** | **String** | The card network |  [optional] |
|**bankTransfer** | [**Bank**](Bank.md) |  |  [optional] |
|**wallet** | [**Wallet**](Wallet.md) |  |  [optional] |
|**clientSecret** | **String** | For Client based calls, SDK will use the client_secret in order to call /payment_methods Client secret will be generated whenever a new payment method is created |  [optional] |
|**paymentMethodData** | [**PaymentMethodCreateData**](PaymentMethodCreateData.md) |  |  [optional] |
|**billing** | [**Address**](Address.md) |  |  [optional] |



