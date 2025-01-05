

# RefundResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Global Refund Id for the refund |  |
|**paymentId** | **String** | The payment id against which refund is initiated |  |
|**merchantReferenceId** | **String** | Unique Identifier for the Refund. This is to ensure idempotency for multiple partial refunds initiated against the same payment. |  [optional] |
|**amount** | **Long** | The refund amount |  |
|**currency** | **Currency** |  |  |
|**status** | **RefundStatus** |  |  |
|**reason** | **String** | An arbitrary string attached to the object |  [optional] |
|**metadata** | **Object** | Metadata is useful for storing additional, unstructured information on an object |  [optional] |
|**errorDetails** | [**RefundErrorDetails**](RefundErrorDetails.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | The timestamp at which refund is created |  |
|**updatedAt** | **OffsetDateTime** | The timestamp at which refund is updated |  |
|**connector** | **Connector** |  |  |
|**profileId** | **String** | The id of business profile for this refund |  |
|**merchantConnectorId** | **String** | The merchant_connector_id of the processor through which this payment went through |  |
|**connectorRefundReferenceId** | **String** | The reference id of the connector for the refund |  [optional] |



