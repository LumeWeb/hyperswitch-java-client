

# ApplePaySessionResponse

## oneOf schemas
* [NoThirdPartySdkSessionResponse](NoThirdPartySdkSessionResponse.md)
* [Object](Object.md)
* [ThirdPartySdkSessionResponse](ThirdPartySdkSessionResponse.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.ApplePaySessionResponse;
import com.lumeweb.hyperswitch.model.NoThirdPartySdkSessionResponse;
import com.lumeweb.hyperswitch.model.Object;
import com.lumeweb.hyperswitch.model.ThirdPartySdkSessionResponse;

public class Example {
    public static void main(String[] args) {
        ApplePaySessionResponse exampleApplePaySessionResponse = new ApplePaySessionResponse();

        // create a new NoThirdPartySdkSessionResponse
        NoThirdPartySdkSessionResponse exampleNoThirdPartySdkSessionResponse = new NoThirdPartySdkSessionResponse();
        // set ApplePaySessionResponse to NoThirdPartySdkSessionResponse
        exampleApplePaySessionResponse.setActualInstance(exampleNoThirdPartySdkSessionResponse);
        // to get back the NoThirdPartySdkSessionResponse set earlier
        NoThirdPartySdkSessionResponse testNoThirdPartySdkSessionResponse = (NoThirdPartySdkSessionResponse) exampleApplePaySessionResponse.getActualInstance();

        // create a new Object
        Object exampleObject = new Object();
        // set ApplePaySessionResponse to Object
        exampleApplePaySessionResponse.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleApplePaySessionResponse.getActualInstance();

        // create a new ThirdPartySdkSessionResponse
        ThirdPartySdkSessionResponse exampleThirdPartySdkSessionResponse = new ThirdPartySdkSessionResponse();
        // set ApplePaySessionResponse to ThirdPartySdkSessionResponse
        exampleApplePaySessionResponse.setActualInstance(exampleThirdPartySdkSessionResponse);
        // to get back the ThirdPartySdkSessionResponse set earlier
        ThirdPartySdkSessionResponse testThirdPartySdkSessionResponse = (ThirdPartySdkSessionResponse) exampleApplePaySessionResponse.getActualInstance();
    }
}
```


