

# CustomerPaymentMethod


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentToken** | **String** | Token for payment method in temporary card locker which gets refreshed often |  |
|**paymentMethodId** | **String** | The unique identifier of the customer. |  |
|**customerId** | **String** | The unique identifier of the customer. |  |
|**paymentMethod** | **PaymentMethod** |  |  |
|**paymentMethodType** | **PaymentMethodType** |  |  [optional] |
|**paymentMethodIssuer** | **String** | The name of the bank/ provider issuing the payment method to the end user |  [optional] |
|**paymentMethodIssuerCode** | **PaymentMethodIssuerCode** |  |  [optional] |
|**recurringEnabled** | **Boolean** | Indicates whether the payment method is eligible for recurring payments |  |
|**installmentPaymentEnabled** | **Boolean** | Indicates whether the payment method is eligible for installment payments |  |
|**paymentExperience** | **List&lt;PaymentExperience&gt;** | Type of payment experience enabled with the connector |  [optional] |
|**card** | [**CardDetailFromLocker**](CardDetailFromLocker.md) |  |  [optional] |
|**metadata** | **Object** | You can specify up to 50 keys, with key names up to 40 characters long and values up to 500 characters long. Metadata is useful for storing additional, structured information on an object. |  [optional] |
|**created** | **OffsetDateTime** | A timestamp (ISO 8601 code) that determines when the customer was created |  [optional] |
|**bankTransfer** | [**Bank**](Bank.md) |  |  [optional] |
|**bank** | [**MaskedBankDetails**](MaskedBankDetails.md) |  |  [optional] |
|**surchargeDetails** | [**SurchargeDetailsResponse**](SurchargeDetailsResponse.md) |  |  [optional] |
|**requiresCvv** | **Boolean** | Whether this payment method requires CVV to be collected |  |
|**lastUsedAt** | **OffsetDateTime** | A timestamp (ISO 8601 code) that determines when the payment method was last used |  [optional] |
|**defaultPaymentMethodSet** | **Boolean** | Indicates if the payment method has been set to default or not |  |
|**billing** | [**Address**](Address.md) |  |  [optional] |



