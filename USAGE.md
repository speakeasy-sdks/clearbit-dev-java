<!-- Start SDK Example Usage -->
```java
package hello.world;

import clearbit_dev.person_v2.SDK;

import clearbit_dev.person_v2.models.operations.FindRequest;
import clearbit_dev.person_v2.models.operations.FindResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            FindRequest req = new FindRequest() {{
                company = "Medhurst - Rau";
                companyDomain = "quibusdam";
                email = "Ryan.Little62@yahoo.com";
                facebook = "deserunt";
                familyName = "suscipit";
                givenName = "iure";
                ipAddress = "magnam";
                linkedin = "debitis";
                location = "ipsa";
                twitter = "delectus";
                webhookUrl = "tempora";
            }}            

            FindResponse res = sdk.find(req);

            if (res.person.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->