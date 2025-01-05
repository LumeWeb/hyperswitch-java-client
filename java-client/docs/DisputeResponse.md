

# DisputeResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**disputeId** | **String** | The identifier for dispute |  |
|**paymentId** | **String** | The identifier for payment_intent |  |
|**attemptId** | **String** | The identifier for payment_attempt |  |
|**amount** | **String** | The dispute amount |  |
|**currency** | **String** | The three-letter ISO currency code |  |
|**disputeStage** | **DisputeStage** |  |  |
|**disputeStatus** | **DisputeStatus** |  |  |
|**connector** | **String** | connector to which dispute is associated with |  |
|**connectorStatus** | **String** | Status of the dispute sent by connector |  |
|**connectorDisputeId** | **String** | Dispute id sent by connector |  |
|**connectorReason** | **String** | Reason of dispute sent by connector |  [optional] |
|**connectorReasonCode** | **String** | Reason code of dispute sent by connector |  [optional] |
|**challengeRequiredBy** | **OffsetDateTime** | Evidence deadline of dispute sent by connector |  [optional] |
|**connectorCreatedAt** | **OffsetDateTime** | Dispute created time sent by connector |  [optional] |
|**connectorUpdatedAt** | **OffsetDateTime** | Dispute updated time sent by connector |  [optional] |
|**createdAt** | **OffsetDateTime** | Time at which dispute is received |  |
|**profileId** | **String** | The &#x60;profile_id&#x60; associated with the dispute |  [optional] |
|**merchantConnectorId** | **String** | The &#x60;merchant_connector_id&#x60; of the connector / processor through which the dispute was processed |  [optional] |



