

# DisputeResponsePaymentsRetrieve


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**disputeId** | **String** | The identifier for dispute |  |
|**disputeStage** | **DisputeStage** |  |  |
|**disputeStatus** | **DisputeStatus** |  |  |
|**connectorStatus** | **String** | Status of the dispute sent by connector |  |
|**connectorDisputeId** | **String** | Dispute id sent by connector |  |
|**connectorReason** | **String** | Reason of dispute sent by connector |  [optional] |
|**connectorReasonCode** | **String** | Reason code of dispute sent by connector |  [optional] |
|**challengeRequiredBy** | **OffsetDateTime** | Evidence deadline of dispute sent by connector |  [optional] |
|**connectorCreatedAt** | **OffsetDateTime** | Dispute created time sent by connector |  [optional] |
|**connectorUpdatedAt** | **OffsetDateTime** | Dispute updated time sent by connector |  [optional] |
|**createdAt** | **OffsetDateTime** | Time at which dispute is received |  |



