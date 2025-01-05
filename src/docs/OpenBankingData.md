

# OpenBankingData

## oneOf schemas
* [OpenBankingDataOneOf](OpenBankingDataOneOf.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.OpenBankingData;
import com.hyperswitch.model.OpenBankingDataOneOf;

public class Example {
    public static void main(String[] args) {
        OpenBankingData exampleOpenBankingData = new OpenBankingData();

        // create a new OpenBankingDataOneOf
        OpenBankingDataOneOf exampleOpenBankingDataOneOf = new OpenBankingDataOneOf();
        // set OpenBankingData to OpenBankingDataOneOf
        exampleOpenBankingData.setActualInstance(exampleOpenBankingDataOneOf);
        // to get back the OpenBankingDataOneOf set earlier
        OpenBankingDataOneOf testOpenBankingDataOneOf = (OpenBankingDataOneOf) exampleOpenBankingData.getActualInstance();
    }
}
```


