

# RoutingKind

## oneOf schemas
* [List<RoutingDictionaryRecord>](List<RoutingDictionaryRecord>.md)
* [RoutingDictionary](RoutingDictionary.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.RoutingKind;
import com.hyperswitch.model.List<RoutingDictionaryRecord>;
import com.hyperswitch.model.RoutingDictionary;

public class Example {
    public static void main(String[] args) {
        RoutingKind exampleRoutingKind = new RoutingKind();

        // create a new List<RoutingDictionaryRecord>
        List<RoutingDictionaryRecord> exampleList<RoutingDictionaryRecord> = new List<RoutingDictionaryRecord>();
        // set RoutingKind to List<RoutingDictionaryRecord>
        exampleRoutingKind.setActualInstance(exampleList<RoutingDictionaryRecord>);
        // to get back the List<RoutingDictionaryRecord> set earlier
        List<RoutingDictionaryRecord> testList<RoutingDictionaryRecord> = (List<RoutingDictionaryRecord>) exampleRoutingKind.getActualInstance();

        // create a new RoutingDictionary
        RoutingDictionary exampleRoutingDictionary = new RoutingDictionary();
        // set RoutingKind to RoutingDictionary
        exampleRoutingKind.setActualInstance(exampleRoutingDictionary);
        // to get back the RoutingDictionary set earlier
        RoutingDictionary testRoutingDictionary = (RoutingDictionary) exampleRoutingKind.getActualInstance();
    }
}
```


