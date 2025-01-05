

# RoutingAlgorithm

Routing Algorithm kind

## oneOf schemas
* [ConnectorSelectionOneOf](ConnectorSelectionOneOf.md)
* [ConnectorSelectionOneOf1](ConnectorSelectionOneOf1.md)
* [RoutingAlgorithmOneOf](RoutingAlgorithmOneOf.md)
* [RoutingAlgorithmOneOf1](RoutingAlgorithmOneOf1.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.RoutingAlgorithm;
import com.hyperswitch.model.ConnectorSelectionOneOf;
import com.hyperswitch.model.ConnectorSelectionOneOf1;
import com.hyperswitch.model.RoutingAlgorithmOneOf;
import com.hyperswitch.model.RoutingAlgorithmOneOf1;

public class Example {
    public static void main(String[] args) {
        RoutingAlgorithm exampleRoutingAlgorithm = new RoutingAlgorithm();

        // create a new ConnectorSelectionOneOf
        ConnectorSelectionOneOf exampleConnectorSelectionOneOf = new ConnectorSelectionOneOf();
        // set RoutingAlgorithm to ConnectorSelectionOneOf
        exampleRoutingAlgorithm.setActualInstance(exampleConnectorSelectionOneOf);
        // to get back the ConnectorSelectionOneOf set earlier
        ConnectorSelectionOneOf testConnectorSelectionOneOf = (ConnectorSelectionOneOf) exampleRoutingAlgorithm.getActualInstance();

        // create a new ConnectorSelectionOneOf1
        ConnectorSelectionOneOf1 exampleConnectorSelectionOneOf1 = new ConnectorSelectionOneOf1();
        // set RoutingAlgorithm to ConnectorSelectionOneOf1
        exampleRoutingAlgorithm.setActualInstance(exampleConnectorSelectionOneOf1);
        // to get back the ConnectorSelectionOneOf1 set earlier
        ConnectorSelectionOneOf1 testConnectorSelectionOneOf1 = (ConnectorSelectionOneOf1) exampleRoutingAlgorithm.getActualInstance();

        // create a new RoutingAlgorithmOneOf
        RoutingAlgorithmOneOf exampleRoutingAlgorithmOneOf = new RoutingAlgorithmOneOf();
        // set RoutingAlgorithm to RoutingAlgorithmOneOf
        exampleRoutingAlgorithm.setActualInstance(exampleRoutingAlgorithmOneOf);
        // to get back the RoutingAlgorithmOneOf set earlier
        RoutingAlgorithmOneOf testRoutingAlgorithmOneOf = (RoutingAlgorithmOneOf) exampleRoutingAlgorithm.getActualInstance();

        // create a new RoutingAlgorithmOneOf1
        RoutingAlgorithmOneOf1 exampleRoutingAlgorithmOneOf1 = new RoutingAlgorithmOneOf1();
        // set RoutingAlgorithm to RoutingAlgorithmOneOf1
        exampleRoutingAlgorithm.setActualInstance(exampleRoutingAlgorithmOneOf1);
        // to get back the RoutingAlgorithmOneOf1 set earlier
        RoutingAlgorithmOneOf1 testRoutingAlgorithmOneOf1 = (RoutingAlgorithmOneOf1) exampleRoutingAlgorithm.getActualInstance();
    }
}
```


