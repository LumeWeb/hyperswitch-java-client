

# ConnectorSelection

## oneOf schemas
* [ConnectorSelectionOneOf](ConnectorSelectionOneOf.md)
* [ConnectorSelectionOneOf1](ConnectorSelectionOneOf1.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.ConnectorSelection;
import com.hyperswitch.model.ConnectorSelectionOneOf;
import com.hyperswitch.model.ConnectorSelectionOneOf1;

public class Example {
    public static void main(String[] args) {
        ConnectorSelection exampleConnectorSelection = new ConnectorSelection();

        // create a new ConnectorSelectionOneOf
        ConnectorSelectionOneOf exampleConnectorSelectionOneOf = new ConnectorSelectionOneOf();
        // set ConnectorSelection to ConnectorSelectionOneOf
        exampleConnectorSelection.setActualInstance(exampleConnectorSelectionOneOf);
        // to get back the ConnectorSelectionOneOf set earlier
        ConnectorSelectionOneOf testConnectorSelectionOneOf = (ConnectorSelectionOneOf) exampleConnectorSelection.getActualInstance();

        // create a new ConnectorSelectionOneOf1
        ConnectorSelectionOneOf1 exampleConnectorSelectionOneOf1 = new ConnectorSelectionOneOf1();
        // set ConnectorSelection to ConnectorSelectionOneOf1
        exampleConnectorSelection.setActualInstance(exampleConnectorSelectionOneOf1);
        // to get back the ConnectorSelectionOneOf1 set earlier
        ConnectorSelectionOneOf1 testConnectorSelectionOneOf1 = (ConnectorSelectionOneOf1) exampleConnectorSelection.getActualInstance();
    }
}
```


