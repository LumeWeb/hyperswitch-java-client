

# RefundsCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentId** | **String** | The payment id against which refund is initiated |  |
|**merchantReferenceId** | **String** | Unique Identifier for the Refund. This is to ensure idempotency for multiple partial refunds initiated against the same payment. |  [optional] |
|**amount** | **Long** | Total amount for which the refund is to be initiated. Amount for the payment in lowest denomination of the currency. (i.e) in cents for USD denomination, in paisa for INR denomination etc., If not provided, this will default to the amount_captured of the payment |  [optional] |
|**reason** | **String** | Reason for the refund. Often useful for displaying to users and your customer support executive. |  [optional] |
|**refundType** | **RefundType** |  |  [optional] |
|**metadata** | **Object** | Metadata is useful for storing additional, unstructured information on an object. |  [optional] |



