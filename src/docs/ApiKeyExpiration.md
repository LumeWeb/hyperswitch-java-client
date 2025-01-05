

# ApiKeyExpiration

## oneOf schemas
* [OffsetDateTime](OffsetDateTime.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.ApiKeyExpiration;
import com.lumeweb.hyperswitch.model.OffsetDateTime;
import com.lumeweb.hyperswitch.model.String;

public class Example {
    public static void main(String[] args) {
        ApiKeyExpiration exampleApiKeyExpiration = new ApiKeyExpiration();

        // create a new OffsetDateTime
        OffsetDateTime exampleOffsetDateTime = new OffsetDateTime();
        // set ApiKeyExpiration to OffsetDateTime
        exampleApiKeyExpiration.setActualInstance(exampleOffsetDateTime);
        // to get back the OffsetDateTime set earlier
        OffsetDateTime testOffsetDateTime = (OffsetDateTime) exampleApiKeyExpiration.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set ApiKeyExpiration to String
        exampleApiKeyExpiration.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleApiKeyExpiration.getActualInstance();
    }
}
```


