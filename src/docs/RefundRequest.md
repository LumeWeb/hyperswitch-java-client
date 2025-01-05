

# RefundRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentId** | **String** | The payment id against which refund is to be initiated |  |
|**refundId** | **String** | Unique Identifier for the Refund. This is to ensure idempotency for multiple partial refunds initiated against the same payment. If this is not passed by the merchant, this field shall be auto generated and provided in the API response. It is recommended to generate uuid(v4) as the refund_id. |  [optional] |
|**merchantId** | **String** | The identifier for the Merchant Account |  [optional] |
|**amount** | **Long** | Total amount for which the refund is to be initiated. Amount for the payment in lowest denomination of the currency. (i.e) in cents for USD denomination, in paisa for INR denomination etc., If not provided, this will default to the full payment amount |  [optional] |
|**reason** | **String** | Reason for the refund. Often useful for displaying to users and your customer support executive. In case the payment went through Stripe, this field needs to be passed with one of these enums: &#x60;duplicate&#x60;, &#x60;fraudulent&#x60;, or &#x60;requested_by_customer&#x60; |  [optional] |
|**refundType** | **RefundType** |  |  [optional] |
|**metadata** | **Object** | You can specify up to 50 keys, with key names up to 40 characters long and values up to 500 characters long. Metadata is useful for storing additional, structured information on an object. |  [optional] |
|**merchantConnectorDetails** | [**MerchantConnectorDetailsWrap**](MerchantConnectorDetailsWrap.md) |  |  [optional] |
|**charges** | [**ChargeRefunds**](ChargeRefunds.md) |  |  [optional] |



