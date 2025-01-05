

# PayoutListFilterConstraints


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startTime** | **OffsetDateTime** | The start time to filter payments list or to get list of filters. To get list of filters start time is needed to be passed |  |
|**endTime** | **OffsetDateTime** | The end time to filter payments list or to get list of filters. If not passed the default time is now |  [optional] |
|**payoutId** | **String** | The identifier for payout |  [optional] |
|**profileId** | **String** | The identifier for business profile |  [optional] |
|**customerId** | **String** | The identifier for customer |  [optional] |
|**limit** | **Integer** | The limit on the number of objects. The default limit is 10 and max limit is 20 |  [optional] |
|**offset** | **Integer** | The starting point within a list of objects |  [optional] |
|**connector** | **List&lt;PayoutConnectors&gt;** | The list of connectors to filter payouts list |  [optional] |
|**currency** | **Currency** |  |  |
|**status** | **List&lt;PayoutStatus&gt;** | The list of payout status to filter payouts list |  [optional] |
|**payoutMethod** | **List&lt;PayoutType&gt;** | The list of payout methods to filter payouts list |  [optional] |
|**entityType** | **PayoutEntityType** |  |  |



