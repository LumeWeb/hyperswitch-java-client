

# AdditionalPayoutMethodData

Masked payout method details for storing in db

## oneOf schemas
* [AdditionalPayoutMethodDataOneOf](AdditionalPayoutMethodDataOneOf.md)
* [AdditionalPayoutMethodDataOneOf1](AdditionalPayoutMethodDataOneOf1.md)
* [AdditionalPayoutMethodDataOneOf2](AdditionalPayoutMethodDataOneOf2.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.AdditionalPayoutMethodData;
import com.lumeweb.hyperswitch.model.AdditionalPayoutMethodDataOneOf;
import com.lumeweb.hyperswitch.model.AdditionalPayoutMethodDataOneOf1;
import com.lumeweb.hyperswitch.model.AdditionalPayoutMethodDataOneOf2;

public class Example {
    public static void main(String[] args) {
        AdditionalPayoutMethodData exampleAdditionalPayoutMethodData = new AdditionalPayoutMethodData();

        // create a new AdditionalPayoutMethodDataOneOf
        AdditionalPayoutMethodDataOneOf exampleAdditionalPayoutMethodDataOneOf = new AdditionalPayoutMethodDataOneOf();
        // set AdditionalPayoutMethodData to AdditionalPayoutMethodDataOneOf
        exampleAdditionalPayoutMethodData.setActualInstance(exampleAdditionalPayoutMethodDataOneOf);
        // to get back the AdditionalPayoutMethodDataOneOf set earlier
        AdditionalPayoutMethodDataOneOf testAdditionalPayoutMethodDataOneOf = (AdditionalPayoutMethodDataOneOf) exampleAdditionalPayoutMethodData.getActualInstance();

        // create a new AdditionalPayoutMethodDataOneOf1
        AdditionalPayoutMethodDataOneOf1 exampleAdditionalPayoutMethodDataOneOf1 = new AdditionalPayoutMethodDataOneOf1();
        // set AdditionalPayoutMethodData to AdditionalPayoutMethodDataOneOf1
        exampleAdditionalPayoutMethodData.setActualInstance(exampleAdditionalPayoutMethodDataOneOf1);
        // to get back the AdditionalPayoutMethodDataOneOf1 set earlier
        AdditionalPayoutMethodDataOneOf1 testAdditionalPayoutMethodDataOneOf1 = (AdditionalPayoutMethodDataOneOf1) exampleAdditionalPayoutMethodData.getActualInstance();

        // create a new AdditionalPayoutMethodDataOneOf2
        AdditionalPayoutMethodDataOneOf2 exampleAdditionalPayoutMethodDataOneOf2 = new AdditionalPayoutMethodDataOneOf2();
        // set AdditionalPayoutMethodData to AdditionalPayoutMethodDataOneOf2
        exampleAdditionalPayoutMethodData.setActualInstance(exampleAdditionalPayoutMethodDataOneOf2);
        // to get back the AdditionalPayoutMethodDataOneOf2 set earlier
        AdditionalPayoutMethodDataOneOf2 testAdditionalPayoutMethodDataOneOf2 = (AdditionalPayoutMethodDataOneOf2) exampleAdditionalPayoutMethodData.getActualInstance();
    }
}
```


