

# PayoutListConstraints


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startTime** | **OffsetDateTime** | The start time to filter payments list or to get list of filters. To get list of filters start time is needed to be passed |  |
|**endTime** | **OffsetDateTime** | The end time to filter payments list or to get list of filters. If not passed the default time is now |  [optional] |
|**customerId** | **String** | The identifier for customer |  [optional] |
|**startingAfter** | **String** | A cursor for use in pagination, fetch the next list after some object |  [optional] |
|**endingBefore** | **String** | A cursor for use in pagination, fetch the previous list before some object |  [optional] |
|**limit** | **Integer** | limit on the number of objects to return |  [optional] |
|**created** | **OffsetDateTime** | The time at which payout is created |  [optional] |



