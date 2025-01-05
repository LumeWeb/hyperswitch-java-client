

# LinkedRoutingConfigRetrieveResponse

## oneOf schemas
* [List<RoutingDictionaryRecord>](List<RoutingDictionaryRecord>.md)
* [RoutingRetrieveResponse](RoutingRetrieveResponse.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.LinkedRoutingConfigRetrieveResponse;
import com.hyperswitch.model.List<RoutingDictionaryRecord>;
import com.hyperswitch.model.RoutingRetrieveResponse;

public class Example {
    public static void main(String[] args) {
        LinkedRoutingConfigRetrieveResponse exampleLinkedRoutingConfigRetrieveResponse = new LinkedRoutingConfigRetrieveResponse();

        // create a new List<RoutingDictionaryRecord>
        List<RoutingDictionaryRecord> exampleList<RoutingDictionaryRecord> = new List<RoutingDictionaryRecord>();
        // set LinkedRoutingConfigRetrieveResponse to List<RoutingDictionaryRecord>
        exampleLinkedRoutingConfigRetrieveResponse.setActualInstance(exampleList<RoutingDictionaryRecord>);
        // to get back the List<RoutingDictionaryRecord> set earlier
        List<RoutingDictionaryRecord> testList<RoutingDictionaryRecord> = (List<RoutingDictionaryRecord>) exampleLinkedRoutingConfigRetrieveResponse.getActualInstance();

        // create a new RoutingRetrieveResponse
        RoutingRetrieveResponse exampleRoutingRetrieveResponse = new RoutingRetrieveResponse();
        // set LinkedRoutingConfigRetrieveResponse to RoutingRetrieveResponse
        exampleLinkedRoutingConfigRetrieveResponse.setActualInstance(exampleRoutingRetrieveResponse);
        // to get back the RoutingRetrieveResponse set earlier
        RoutingRetrieveResponse testRoutingRetrieveResponse = (RoutingRetrieveResponse) exampleLinkedRoutingConfigRetrieveResponse.getActualInstance();
    }
}
```


