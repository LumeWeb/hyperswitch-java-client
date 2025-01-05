

# RealTimePaymentData

## oneOf schemas
* [RealTimePaymentDataOneOf](RealTimePaymentDataOneOf.md)
* [RealTimePaymentDataOneOf1](RealTimePaymentDataOneOf1.md)
* [RealTimePaymentDataOneOf2](RealTimePaymentDataOneOf2.md)
* [RealTimePaymentDataOneOf3](RealTimePaymentDataOneOf3.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.RealTimePaymentData;
import com.lumeweb.hyperswitch.model.RealTimePaymentDataOneOf;
import com.lumeweb.hyperswitch.model.RealTimePaymentDataOneOf1;
import com.lumeweb.hyperswitch.model.RealTimePaymentDataOneOf2;
import com.lumeweb.hyperswitch.model.RealTimePaymentDataOneOf3;

public class Example {
    public static void main(String[] args) {
        RealTimePaymentData exampleRealTimePaymentData = new RealTimePaymentData();

        // create a new RealTimePaymentDataOneOf
        RealTimePaymentDataOneOf exampleRealTimePaymentDataOneOf = new RealTimePaymentDataOneOf();
        // set RealTimePaymentData to RealTimePaymentDataOneOf
        exampleRealTimePaymentData.setActualInstance(exampleRealTimePaymentDataOneOf);
        // to get back the RealTimePaymentDataOneOf set earlier
        RealTimePaymentDataOneOf testRealTimePaymentDataOneOf = (RealTimePaymentDataOneOf) exampleRealTimePaymentData.getActualInstance();

        // create a new RealTimePaymentDataOneOf1
        RealTimePaymentDataOneOf1 exampleRealTimePaymentDataOneOf1 = new RealTimePaymentDataOneOf1();
        // set RealTimePaymentData to RealTimePaymentDataOneOf1
        exampleRealTimePaymentData.setActualInstance(exampleRealTimePaymentDataOneOf1);
        // to get back the RealTimePaymentDataOneOf1 set earlier
        RealTimePaymentDataOneOf1 testRealTimePaymentDataOneOf1 = (RealTimePaymentDataOneOf1) exampleRealTimePaymentData.getActualInstance();

        // create a new RealTimePaymentDataOneOf2
        RealTimePaymentDataOneOf2 exampleRealTimePaymentDataOneOf2 = new RealTimePaymentDataOneOf2();
        // set RealTimePaymentData to RealTimePaymentDataOneOf2
        exampleRealTimePaymentData.setActualInstance(exampleRealTimePaymentDataOneOf2);
        // to get back the RealTimePaymentDataOneOf2 set earlier
        RealTimePaymentDataOneOf2 testRealTimePaymentDataOneOf2 = (RealTimePaymentDataOneOf2) exampleRealTimePaymentData.getActualInstance();

        // create a new RealTimePaymentDataOneOf3
        RealTimePaymentDataOneOf3 exampleRealTimePaymentDataOneOf3 = new RealTimePaymentDataOneOf3();
        // set RealTimePaymentData to RealTimePaymentDataOneOf3
        exampleRealTimePaymentData.setActualInstance(exampleRealTimePaymentDataOneOf3);
        // to get back the RealTimePaymentDataOneOf3 set earlier
        RealTimePaymentDataOneOf3 testRealTimePaymentDataOneOf3 = (RealTimePaymentDataOneOf3) exampleRealTimePaymentData.getActualInstance();
    }
}
```


