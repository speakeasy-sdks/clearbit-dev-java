/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package clearbit_dev.person_v2.models.operations;

import java.net.http.HttpResponse;

public class FindResponse {
    
    public String contentType;
    public FindResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful lookup, person encoded in the response body
     */
    
    public clearbit_dev.person_v2.models.shared.Person person;
    public FindResponse withPerson(clearbit_dev.person_v2.models.shared.Person person) {
        this.person = person;
        return this;
    }
    
    
    public Integer statusCode;
    public FindResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public FindResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}