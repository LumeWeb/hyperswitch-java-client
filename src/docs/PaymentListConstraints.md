

# PaymentListConstraints


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | The identifier for customer |  [optional] |
|**startingAfter** | **String** | A cursor for use in pagination, fetch the next list after some object |  [optional] |
|**endingBefore** | **String** | A cursor for use in pagination, fetch the previous list before some object |  [optional] |
|**limit** | **Integer** | limit on the number of objects to return |  [optional] |
|**created** | **OffsetDateTime** | The time at which payment is created |  [optional] |
|**createdLt** | **OffsetDateTime** | Time less than the payment created time |  [optional] |
|**createdGt** | **OffsetDateTime** | Time greater than the payment created time |  [optional] |
|**createdLte** | **OffsetDateTime** | Time less than or equals to the payment created time |  [optional] |
|**createdGte** | **OffsetDateTime** | Time greater than or equals to the payment created time |  [optional] |



