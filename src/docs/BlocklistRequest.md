

# BlocklistRequest

## oneOf schemas
* [BlocklistRequestOneOf](BlocklistRequestOneOf.md)
* [BlocklistRequestOneOf1](BlocklistRequestOneOf1.md)
* [BlocklistRequestOneOf2](BlocklistRequestOneOf2.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.BlocklistRequest;
import com.hyperswitch.model.BlocklistRequestOneOf;
import com.hyperswitch.model.BlocklistRequestOneOf1;
import com.hyperswitch.model.BlocklistRequestOneOf2;

public class Example {
    public static void main(String[] args) {
        BlocklistRequest exampleBlocklistRequest = new BlocklistRequest();

        // create a new BlocklistRequestOneOf
        BlocklistRequestOneOf exampleBlocklistRequestOneOf = new BlocklistRequestOneOf();
        // set BlocklistRequest to BlocklistRequestOneOf
        exampleBlocklistRequest.setActualInstance(exampleBlocklistRequestOneOf);
        // to get back the BlocklistRequestOneOf set earlier
        BlocklistRequestOneOf testBlocklistRequestOneOf = (BlocklistRequestOneOf) exampleBlocklistRequest.getActualInstance();

        // create a new BlocklistRequestOneOf1
        BlocklistRequestOneOf1 exampleBlocklistRequestOneOf1 = new BlocklistRequestOneOf1();
        // set BlocklistRequest to BlocklistRequestOneOf1
        exampleBlocklistRequest.setActualInstance(exampleBlocklistRequestOneOf1);
        // to get back the BlocklistRequestOneOf1 set earlier
        BlocklistRequestOneOf1 testBlocklistRequestOneOf1 = (BlocklistRequestOneOf1) exampleBlocklistRequest.getActualInstance();

        // create a new BlocklistRequestOneOf2
        BlocklistRequestOneOf2 exampleBlocklistRequestOneOf2 = new BlocklistRequestOneOf2();
        // set BlocklistRequest to BlocklistRequestOneOf2
        exampleBlocklistRequest.setActualInstance(exampleBlocklistRequestOneOf2);
        // to get back the BlocklistRequestOneOf2 set earlier
        BlocklistRequestOneOf2 testBlocklistRequestOneOf2 = (BlocklistRequestOneOf2) exampleBlocklistRequest.getActualInstance();
    }
}
```


