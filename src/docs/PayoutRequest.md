

# PayoutRequest

## oneOf schemas
* [PayoutRequestOneOf](PayoutRequestOneOf.md)
* [PayoutRequestOneOf1](PayoutRequestOneOf1.md)
* [PayoutRequestOneOf2](PayoutRequestOneOf2.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.PayoutRequest;
import com.hyperswitch.model.PayoutRequestOneOf;
import com.hyperswitch.model.PayoutRequestOneOf1;
import com.hyperswitch.model.PayoutRequestOneOf2;

public class Example {
    public static void main(String[] args) {
        PayoutRequest examplePayoutRequest = new PayoutRequest();

        // create a new PayoutRequestOneOf
        PayoutRequestOneOf examplePayoutRequestOneOf = new PayoutRequestOneOf();
        // set PayoutRequest to PayoutRequestOneOf
        examplePayoutRequest.setActualInstance(examplePayoutRequestOneOf);
        // to get back the PayoutRequestOneOf set earlier
        PayoutRequestOneOf testPayoutRequestOneOf = (PayoutRequestOneOf) examplePayoutRequest.getActualInstance();

        // create a new PayoutRequestOneOf1
        PayoutRequestOneOf1 examplePayoutRequestOneOf1 = new PayoutRequestOneOf1();
        // set PayoutRequest to PayoutRequestOneOf1
        examplePayoutRequest.setActualInstance(examplePayoutRequestOneOf1);
        // to get back the PayoutRequestOneOf1 set earlier
        PayoutRequestOneOf1 testPayoutRequestOneOf1 = (PayoutRequestOneOf1) examplePayoutRequest.getActualInstance();

        // create a new PayoutRequestOneOf2
        PayoutRequestOneOf2 examplePayoutRequestOneOf2 = new PayoutRequestOneOf2();
        // set PayoutRequest to PayoutRequestOneOf2
        examplePayoutRequest.setActualInstance(examplePayoutRequestOneOf2);
        // to get back the PayoutRequestOneOf2 set earlier
        PayoutRequestOneOf2 testPayoutRequestOneOf2 = (PayoutRequestOneOf2) examplePayoutRequest.getActualInstance();
    }
}
```


