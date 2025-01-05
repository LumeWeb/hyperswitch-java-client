

# PaymentMethodCreateData

## oneOf schemas
* [PaymentMethodCreateDataOneOf](PaymentMethodCreateDataOneOf.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.PaymentMethodCreateData;
import com.lumeweb.hyperswitch.model.PaymentMethodCreateDataOneOf;

public class Example {
    public static void main(String[] args) {
        PaymentMethodCreateData examplePaymentMethodCreateData = new PaymentMethodCreateData();

        // create a new PaymentMethodCreateDataOneOf
        PaymentMethodCreateDataOneOf examplePaymentMethodCreateDataOneOf = new PaymentMethodCreateDataOneOf();
        // set PaymentMethodCreateData to PaymentMethodCreateDataOneOf
        examplePaymentMethodCreateData.setActualInstance(examplePaymentMethodCreateDataOneOf);
        // to get back the PaymentMethodCreateDataOneOf set earlier
        PaymentMethodCreateDataOneOf testPaymentMethodCreateDataOneOf = (PaymentMethodCreateDataOneOf) examplePaymentMethodCreateData.getActualInstance();
    }
}
```


