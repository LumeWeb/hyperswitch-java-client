

# CustomerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantReferenceId** | **String** | The identifier for the customer object |  |
|**name** | **String** | The customer&#39;s name |  [optional] |
|**email** | **String** | The customer&#39;s email address |  [optional] |
|**phone** | **String** | The customer&#39;s phone number |  [optional] |
|**phoneCountryCode** | **String** | The country code for the customer phone number |  [optional] |
|**description** | **String** | An arbitrary string that you can attach to a customer object. |  [optional] |
|**defaultBillingAddress** | [**AddressDetails**](AddressDetails.md) |  |  [optional] |
|**defaultShippingAddress** | [**AddressDetails**](AddressDetails.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | A timestamp (ISO 8601 code) that determines when the customer was created |  |
|**metadata** | **Object** | You can specify up to 50 keys, with key names up to 40 characters long and values up to 500 characters long. Metadata is useful for storing additional, structured information on an object. |  [optional] |
|**defaultPaymentMethodId** | **String** | The identifier for the default payment method. |  [optional] |
|**id** | **String** | Global id |  |



