

# PaymentRetrieveBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | The identifier for the Merchant Account. |  [optional] |
|**forceSync** | **Boolean** | Decider to enable or disable the connector call for retrieve request |  [optional] |
|**clientSecret** | **String** | This is a token which expires after 15 minutes, used from the client to authenticate and create sessions from the SDK |  [optional] |
|**expandCaptures** | **Boolean** | If enabled provides list of captures linked to latest attempt |  [optional] |
|**expandAttempts** | **Boolean** | If enabled provides list of attempts linked to payment intent |  [optional] |



