

# PaymentChargeType

## oneOf schemas
* [PaymentChargeTypeOneOf](PaymentChargeTypeOneOf.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.PaymentChargeType;
import com.hyperswitch.model.PaymentChargeTypeOneOf;

public class Example {
    public static void main(String[] args) {
        PaymentChargeType examplePaymentChargeType = new PaymentChargeType();

        // create a new PaymentChargeTypeOneOf
        PaymentChargeTypeOneOf examplePaymentChargeTypeOneOf = new PaymentChargeTypeOneOf();
        // set PaymentChargeType to PaymentChargeTypeOneOf
        examplePaymentChargeType.setActualInstance(examplePaymentChargeTypeOneOf);
        // to get back the PaymentChargeTypeOneOf set earlier
        PaymentChargeTypeOneOf testPaymentChargeTypeOneOf = (PaymentChargeTypeOneOf) examplePaymentChargeType.getActualInstance();
    }
}
```


