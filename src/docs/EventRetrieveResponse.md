

# EventRetrieveResponse

The response body for retrieving an event.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The identifier for the Event. |  |
|**merchantId** | **String** | The identifier for the Merchant Account. |  |
|**profileId** | **String** | The identifier for the Business Profile. |  |
|**objectId** | **String** | The identifier for the object (Payment Intent ID, Refund ID, etc.) |  |
|**eventType** | **EventType** |  |  |
|**eventClass** | **EventClass** |  |  |
|**isDeliverySuccessful** | **Boolean** | Indicates whether the webhook delivery attempt was successful. |  |
|**initialAttemptId** | **String** | The identifier for the initial delivery attempt. This will be the same as &#x60;event_id&#x60; for the initial delivery attempt. |  |
|**created** | **OffsetDateTime** | Time at which the event was created. |  |
|**request** | [**OutgoingWebhookRequestContent**](OutgoingWebhookRequestContent.md) |  |  |
|**response** | [**OutgoingWebhookResponseContent**](OutgoingWebhookResponseContent.md) |  |  |
|**deliveryAttempt** | **WebhookDeliveryAttempt** |  |  [optional] |



