

# SurchargeResponse

## oneOf schemas
* [SurchargeResponseOneOf](SurchargeResponseOneOf.md)
* [SurchargeResponseOneOf1](SurchargeResponseOneOf1.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.SurchargeResponse;
import com.lumeweb.hyperswitch.model.SurchargeResponseOneOf;
import com.lumeweb.hyperswitch.model.SurchargeResponseOneOf1;

public class Example {
    public static void main(String[] args) {
        SurchargeResponse exampleSurchargeResponse = new SurchargeResponse();

        // create a new SurchargeResponseOneOf
        SurchargeResponseOneOf exampleSurchargeResponseOneOf = new SurchargeResponseOneOf();
        // set SurchargeResponse to SurchargeResponseOneOf
        exampleSurchargeResponse.setActualInstance(exampleSurchargeResponseOneOf);
        // to get back the SurchargeResponseOneOf set earlier
        SurchargeResponseOneOf testSurchargeResponseOneOf = (SurchargeResponseOneOf) exampleSurchargeResponse.getActualInstance();

        // create a new SurchargeResponseOneOf1
        SurchargeResponseOneOf1 exampleSurchargeResponseOneOf1 = new SurchargeResponseOneOf1();
        // set SurchargeResponse to SurchargeResponseOneOf1
        exampleSurchargeResponse.setActualInstance(exampleSurchargeResponseOneOf1);
        // to get back the SurchargeResponseOneOf1 set earlier
        SurchargeResponseOneOf1 testSurchargeResponseOneOf1 = (SurchargeResponseOneOf1) exampleSurchargeResponse.getActualInstance();
    }
}
```


