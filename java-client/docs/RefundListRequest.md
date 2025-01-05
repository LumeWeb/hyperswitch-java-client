

# RefundListRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startTime** | **OffsetDateTime** | The start time to filter payments list or to get list of filters. To get list of filters start time is needed to be passed |  |
|**endTime** | **OffsetDateTime** | The end time to filter payments list or to get list of filters. If not passed the default time is now |  [optional] |
|**paymentId** | **String** | The identifier for the payment |  [optional] |
|**refundId** | **String** | The identifier for the refund |  [optional] |
|**profileId** | **String** | The identifier for business profile |  [optional] |
|**limit** | **Long** | Limit on the number of objects to return |  [optional] |
|**offset** | **Long** | The starting point within a list of objects |  [optional] |
|**amountFilter** | [**AmountFilter**](AmountFilter.md) |  |  [optional] |
|**connector** | **List&lt;String&gt;** | The list of connectors to filter refunds list |  [optional] |
|**merchantConnectorId** | **List&lt;String&gt;** | The list of merchant connector ids to filter the refunds list for selected label |  [optional] |
|**currency** | **List&lt;Currency&gt;** | The list of currencies to filter refunds list |  [optional] |
|**refundStatus** | **List&lt;RefundStatus&gt;** | The list of refund statuses to filter refunds list |  [optional] |



