

# OutgoingWebhookResponseContent

The response information (headers, body and status code) received for the webhook sent.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**body** | **String** | The response body received for the webhook sent. |  [optional] |
|**headers** | **List&lt;List&lt;OutgoingWebhookRequestContentHeadersInnerInner&gt;&gt;** | The response headers received for the webhook sent. |  [optional] |
|**statusCode** | **Integer** | The HTTP status code for the webhook sent. |  [optional] |
|**errorMessage** | **String** | Error message in case any error occurred when trying to deliver the webhook. |  [optional] |



