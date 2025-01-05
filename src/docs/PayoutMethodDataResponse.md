

# PayoutMethodDataResponse

The payout method information for response

## oneOf schemas
* [PayoutMethodDataResponseOneOf](PayoutMethodDataResponseOneOf.md)
* [PayoutMethodDataResponseOneOf1](PayoutMethodDataResponseOneOf1.md)
* [PayoutMethodDataResponseOneOf2](PayoutMethodDataResponseOneOf2.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.PayoutMethodDataResponse;
import com.lumeweb.hyperswitch.model.PayoutMethodDataResponseOneOf;
import com.lumeweb.hyperswitch.model.PayoutMethodDataResponseOneOf1;
import com.lumeweb.hyperswitch.model.PayoutMethodDataResponseOneOf2;

public class Example {
    public static void main(String[] args) {
        PayoutMethodDataResponse examplePayoutMethodDataResponse = new PayoutMethodDataResponse();

        // create a new PayoutMethodDataResponseOneOf
        PayoutMethodDataResponseOneOf examplePayoutMethodDataResponseOneOf = new PayoutMethodDataResponseOneOf();
        // set PayoutMethodDataResponse to PayoutMethodDataResponseOneOf
        examplePayoutMethodDataResponse.setActualInstance(examplePayoutMethodDataResponseOneOf);
        // to get back the PayoutMethodDataResponseOneOf set earlier
        PayoutMethodDataResponseOneOf testPayoutMethodDataResponseOneOf = (PayoutMethodDataResponseOneOf) examplePayoutMethodDataResponse.getActualInstance();

        // create a new PayoutMethodDataResponseOneOf1
        PayoutMethodDataResponseOneOf1 examplePayoutMethodDataResponseOneOf1 = new PayoutMethodDataResponseOneOf1();
        // set PayoutMethodDataResponse to PayoutMethodDataResponseOneOf1
        examplePayoutMethodDataResponse.setActualInstance(examplePayoutMethodDataResponseOneOf1);
        // to get back the PayoutMethodDataResponseOneOf1 set earlier
        PayoutMethodDataResponseOneOf1 testPayoutMethodDataResponseOneOf1 = (PayoutMethodDataResponseOneOf1) examplePayoutMethodDataResponse.getActualInstance();

        // create a new PayoutMethodDataResponseOneOf2
        PayoutMethodDataResponseOneOf2 examplePayoutMethodDataResponseOneOf2 = new PayoutMethodDataResponseOneOf2();
        // set PayoutMethodDataResponse to PayoutMethodDataResponseOneOf2
        examplePayoutMethodDataResponse.setActualInstance(examplePayoutMethodDataResponseOneOf2);
        // to get back the PayoutMethodDataResponseOneOf2 set earlier
        PayoutMethodDataResponseOneOf2 testPayoutMethodDataResponseOneOf2 = (PayoutMethodDataResponseOneOf2) examplePayoutMethodDataResponse.getActualInstance();
    }
}
```


