

# PayoutMethodData

The payout method information required for carrying out a payout

## oneOf schemas
* [PayoutMethodDataOneOf](PayoutMethodDataOneOf.md)
* [PayoutMethodDataOneOf1](PayoutMethodDataOneOf1.md)
* [PayoutMethodDataOneOf2](PayoutMethodDataOneOf2.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.PayoutMethodData;
import com.lumeweb.hyperswitch.model.PayoutMethodDataOneOf;
import com.lumeweb.hyperswitch.model.PayoutMethodDataOneOf1;
import com.lumeweb.hyperswitch.model.PayoutMethodDataOneOf2;

public class Example {
    public static void main(String[] args) {
        PayoutMethodData examplePayoutMethodData = new PayoutMethodData();

        // create a new PayoutMethodDataOneOf
        PayoutMethodDataOneOf examplePayoutMethodDataOneOf = new PayoutMethodDataOneOf();
        // set PayoutMethodData to PayoutMethodDataOneOf
        examplePayoutMethodData.setActualInstance(examplePayoutMethodDataOneOf);
        // to get back the PayoutMethodDataOneOf set earlier
        PayoutMethodDataOneOf testPayoutMethodDataOneOf = (PayoutMethodDataOneOf) examplePayoutMethodData.getActualInstance();

        // create a new PayoutMethodDataOneOf1
        PayoutMethodDataOneOf1 examplePayoutMethodDataOneOf1 = new PayoutMethodDataOneOf1();
        // set PayoutMethodData to PayoutMethodDataOneOf1
        examplePayoutMethodData.setActualInstance(examplePayoutMethodDataOneOf1);
        // to get back the PayoutMethodDataOneOf1 set earlier
        PayoutMethodDataOneOf1 testPayoutMethodDataOneOf1 = (PayoutMethodDataOneOf1) examplePayoutMethodData.getActualInstance();

        // create a new PayoutMethodDataOneOf2
        PayoutMethodDataOneOf2 examplePayoutMethodDataOneOf2 = new PayoutMethodDataOneOf2();
        // set PayoutMethodData to PayoutMethodDataOneOf2
        examplePayoutMethodData.setActualInstance(examplePayoutMethodDataOneOf2);
        // to get back the PayoutMethodDataOneOf2 set earlier
        PayoutMethodDataOneOf2 testPayoutMethodDataOneOf2 = (PayoutMethodDataOneOf2) examplePayoutMethodData.getActualInstance();
    }
}
```


