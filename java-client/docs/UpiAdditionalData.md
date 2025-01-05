

# UpiAdditionalData

## oneOf schemas
* [UpiAdditionalDataOneOf](UpiAdditionalDataOneOf.md)
* [UpiAdditionalDataOneOf1](UpiAdditionalDataOneOf1.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.UpiAdditionalData;
import com.lumeweb.hyperswitch.model.UpiAdditionalDataOneOf;
import com.lumeweb.hyperswitch.model.UpiAdditionalDataOneOf1;

public class Example {
    public static void main(String[] args) {
        UpiAdditionalData exampleUpiAdditionalData = new UpiAdditionalData();

        // create a new UpiAdditionalDataOneOf
        UpiAdditionalDataOneOf exampleUpiAdditionalDataOneOf = new UpiAdditionalDataOneOf();
        // set UpiAdditionalData to UpiAdditionalDataOneOf
        exampleUpiAdditionalData.setActualInstance(exampleUpiAdditionalDataOneOf);
        // to get back the UpiAdditionalDataOneOf set earlier
        UpiAdditionalDataOneOf testUpiAdditionalDataOneOf = (UpiAdditionalDataOneOf) exampleUpiAdditionalData.getActualInstance();

        // create a new UpiAdditionalDataOneOf1
        UpiAdditionalDataOneOf1 exampleUpiAdditionalDataOneOf1 = new UpiAdditionalDataOneOf1();
        // set UpiAdditionalData to UpiAdditionalDataOneOf1
        exampleUpiAdditionalData.setActualInstance(exampleUpiAdditionalDataOneOf1);
        // to get back the UpiAdditionalDataOneOf1 set earlier
        UpiAdditionalDataOneOf1 testUpiAdditionalDataOneOf1 = (UpiAdditionalDataOneOf1) exampleUpiAdditionalData.getActualInstance();
    }
}
```


