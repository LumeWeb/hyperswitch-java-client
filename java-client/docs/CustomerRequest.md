

# CustomerRequest

The customer details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantReferenceId** | **String** | The merchant identifier for the customer object. |  [optional] |
|**name** | **String** | The customer&#39;s name |  |
|**email** | **String** | The customer&#39;s email address |  |
|**phone** | **String** | The customer&#39;s phone number |  [optional] |
|**description** | **String** | An arbitrary string that you can attach to a customer object. |  [optional] |
|**phoneCountryCode** | **String** | The country code for the customer phone number |  [optional] |
|**defaultBillingAddress** | [**AddressDetails**](AddressDetails.md) |  |  [optional] |
|**defaultShippingAddress** | [**AddressDetails**](AddressDetails.md) |  |  [optional] |
|**metadata** | **Object** | You can specify up to 50 keys, with key names up to 40 characters long and values up to 500 characters long. Metadata is useful for storing additional, structured information on an object. |  [optional] |



