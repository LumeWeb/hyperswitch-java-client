

# ThreeDsMethodData

## oneOf schemas
* [ThreeDsMethodDataOneOf](ThreeDsMethodDataOneOf.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.ThreeDsMethodData;
import com.lumeweb.hyperswitch.model.ThreeDsMethodDataOneOf;

public class Example {
    public static void main(String[] args) {
        ThreeDsMethodData exampleThreeDsMethodData = new ThreeDsMethodData();

        // create a new ThreeDsMethodDataOneOf
        ThreeDsMethodDataOneOf exampleThreeDsMethodDataOneOf = new ThreeDsMethodDataOneOf();
        // set ThreeDsMethodData to ThreeDsMethodDataOneOf
        exampleThreeDsMethodData.setActualInstance(exampleThreeDsMethodDataOneOf);
        // to get back the ThreeDsMethodDataOneOf set earlier
        ThreeDsMethodDataOneOf testThreeDsMethodDataOneOf = (ThreeDsMethodDataOneOf) exampleThreeDsMethodData.getActualInstance();
    }
}
```


