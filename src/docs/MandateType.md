

# MandateType

## oneOf schemas
* [MandateTypeOneOf](MandateTypeOneOf.md)
* [MandateTypeOneOf1](MandateTypeOneOf1.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.MandateType;
import com.lumeweb.hyperswitch.model.MandateTypeOneOf;
import com.lumeweb.hyperswitch.model.MandateTypeOneOf1;

public class Example {
    public static void main(String[] args) {
        MandateType exampleMandateType = new MandateType();

        // create a new MandateTypeOneOf
        MandateTypeOneOf exampleMandateTypeOneOf = new MandateTypeOneOf();
        // set MandateType to MandateTypeOneOf
        exampleMandateType.setActualInstance(exampleMandateTypeOneOf);
        // to get back the MandateTypeOneOf set earlier
        MandateTypeOneOf testMandateTypeOneOf = (MandateTypeOneOf) exampleMandateType.getActualInstance();

        // create a new MandateTypeOneOf1
        MandateTypeOneOf1 exampleMandateTypeOneOf1 = new MandateTypeOneOf1();
        // set MandateType to MandateTypeOneOf1
        exampleMandateType.setActualInstance(exampleMandateTypeOneOf1);
        // to get back the MandateTypeOneOf1 set earlier
        MandateTypeOneOf1 testMandateTypeOneOf1 = (MandateTypeOneOf1) exampleMandateType.getActualInstance();
    }
}
```


