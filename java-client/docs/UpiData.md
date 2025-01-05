

# UpiData

## oneOf schemas
* [UpiAdditionalDataOneOf1](UpiAdditionalDataOneOf1.md)
* [UpiDataOneOf](UpiDataOneOf.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.UpiData;
import com.lumeweb.hyperswitch.model.UpiAdditionalDataOneOf1;
import com.lumeweb.hyperswitch.model.UpiDataOneOf;

public class Example {
    public static void main(String[] args) {
        UpiData exampleUpiData = new UpiData();

        // create a new UpiAdditionalDataOneOf1
        UpiAdditionalDataOneOf1 exampleUpiAdditionalDataOneOf1 = new UpiAdditionalDataOneOf1();
        // set UpiData to UpiAdditionalDataOneOf1
        exampleUpiData.setActualInstance(exampleUpiAdditionalDataOneOf1);
        // to get back the UpiAdditionalDataOneOf1 set earlier
        UpiAdditionalDataOneOf1 testUpiAdditionalDataOneOf1 = (UpiAdditionalDataOneOf1) exampleUpiData.getActualInstance();

        // create a new UpiDataOneOf
        UpiDataOneOf exampleUpiDataOneOf = new UpiDataOneOf();
        // set UpiData to UpiDataOneOf
        exampleUpiData.setActualInstance(exampleUpiDataOneOf);
        // to get back the UpiDataOneOf set earlier
        UpiDataOneOf testUpiDataOneOf = (UpiDataOneOf) exampleUpiData.getActualInstance();
    }
}
```


