

# RuleConnectorSelection

Represents a rule  ```text rule_name: [stripe, adyen, checkout] { payment.method = card { payment.method.cardtype = (credit, debit) { payment.method.network = (amex, rupay, diners) }  payment.method.cardtype = credit } } ```

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**connectorSelection** | [**ConnectorSelection**](ConnectorSelection.md) |  |  |
|**statements** | [**List&lt;IfStatement&gt;**](IfStatement.md) |  |  |



