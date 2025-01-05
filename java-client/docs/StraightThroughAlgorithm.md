

# StraightThroughAlgorithm

## oneOf schemas
* [Priority](Priority.md)
* [Single](Single.md)
* [VolumeSplit](VolumeSplit.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.StraightThroughAlgorithm;
import com.lumeweb.hyperswitch.model.Priority;
import com.lumeweb.hyperswitch.model.Single;
import com.lumeweb.hyperswitch.model.VolumeSplit;

public class Example {
    public static void main(String[] args) {
        StraightThroughAlgorithm exampleStraightThroughAlgorithm = new StraightThroughAlgorithm();

        // create a new Priority
        Priority examplePriority = new Priority();
        // set StraightThroughAlgorithm to Priority
        exampleStraightThroughAlgorithm.setActualInstance(examplePriority);
        // to get back the Priority set earlier
        Priority testPriority = (Priority) exampleStraightThroughAlgorithm.getActualInstance();

        // create a new Single
        Single exampleSingle = new Single();
        // set StraightThroughAlgorithm to Single
        exampleStraightThroughAlgorithm.setActualInstance(exampleSingle);
        // to get back the Single set earlier
        Single testSingle = (Single) exampleStraightThroughAlgorithm.getActualInstance();

        // create a new VolumeSplit
        VolumeSplit exampleVolumeSplit = new VolumeSplit();
        // set StraightThroughAlgorithm to VolumeSplit
        exampleStraightThroughAlgorithm.setActualInstance(exampleVolumeSplit);
        // to get back the VolumeSplit set earlier
        VolumeSplit testVolumeSplit = (VolumeSplit) exampleStraightThroughAlgorithm.getActualInstance();
    }
}
```


