

# PaymentMethodResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | Unique identifier for a merchant |  |
|**customerId** | **String** | The unique identifier of the customer. |  [optional] |
|**paymentMethodId** | **String** | The unique identifier of the Payment method |  |
|**paymentMethod** | **PaymentMethod** |  |  |
|**paymentMethodType** | **PaymentMethodType** |  |  [optional] |
|**card** | [**CardDetailFromLocker**](CardDetailFromLocker.md) |  |  [optional] |
|**recurringEnabled** | **Boolean** | Indicates whether the payment method is eligible for recurring payments |  |
|**installmentPaymentEnabled** | **Boolean** | Indicates whether the payment method is eligible for installment payments |  |
|**paymentExperience** | **List&lt;PaymentExperience&gt;** | Type of payment experience enabled with the connector |  [optional] |
|**metadata** | **Object** | You can specify up to 50 keys, with key names up to 40 characters long and values up to 500 characters long. Metadata is useful for storing additional, structured information on an object. |  [optional] |
|**created** | **OffsetDateTime** | A timestamp (ISO 8601 code) that determines when the customer was created |  [optional] |
|**bankTransfer** | [**Bank**](Bank.md) |  |  [optional] |
|**lastUsedAt** | **OffsetDateTime** |  |  [optional] |
|**clientSecret** | **String** | For Client based calls |  [optional] |



