

# PayoutRetrieveRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payoutId** | **String** | Unique identifier for the payout. This ensures idempotency for multiple payouts that have been done by a single merchant. This field is auto generated and is returned in the API response. |  |
|**forceSync** | **Boolean** | &#x60;force_sync&#x60; with the connector to get payout details (defaults to false) |  [optional] |
|**merchantId** | **String** | The identifier for the Merchant Account. |  [optional] |



