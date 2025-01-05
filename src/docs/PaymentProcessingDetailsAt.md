

# PaymentProcessingDetailsAt

## oneOf schemas
* [PaymentProcessingDetailsAtOneOf](PaymentProcessingDetailsAtOneOf.md)
* [PaymentProcessingDetailsAtOneOf1](PaymentProcessingDetailsAtOneOf1.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.PaymentProcessingDetailsAt;
import com.lumeweb.hyperswitch.model.PaymentProcessingDetailsAtOneOf;
import com.lumeweb.hyperswitch.model.PaymentProcessingDetailsAtOneOf1;

public class Example {
    public static void main(String[] args) {
        PaymentProcessingDetailsAt examplePaymentProcessingDetailsAt = new PaymentProcessingDetailsAt();

        // create a new PaymentProcessingDetailsAtOneOf
        PaymentProcessingDetailsAtOneOf examplePaymentProcessingDetailsAtOneOf = new PaymentProcessingDetailsAtOneOf();
        // set PaymentProcessingDetailsAt to PaymentProcessingDetailsAtOneOf
        examplePaymentProcessingDetailsAt.setActualInstance(examplePaymentProcessingDetailsAtOneOf);
        // to get back the PaymentProcessingDetailsAtOneOf set earlier
        PaymentProcessingDetailsAtOneOf testPaymentProcessingDetailsAtOneOf = (PaymentProcessingDetailsAtOneOf) examplePaymentProcessingDetailsAt.getActualInstance();

        // create a new PaymentProcessingDetailsAtOneOf1
        PaymentProcessingDetailsAtOneOf1 examplePaymentProcessingDetailsAtOneOf1 = new PaymentProcessingDetailsAtOneOf1();
        // set PaymentProcessingDetailsAt to PaymentProcessingDetailsAtOneOf1
        examplePaymentProcessingDetailsAt.setActualInstance(examplePaymentProcessingDetailsAtOneOf1);
        // to get back the PaymentProcessingDetailsAtOneOf1 set earlier
        PaymentProcessingDetailsAtOneOf1 testPaymentProcessingDetailsAtOneOf1 = (PaymentProcessingDetailsAtOneOf1) examplePaymentProcessingDetailsAt.getActualInstance();
    }
}
```


