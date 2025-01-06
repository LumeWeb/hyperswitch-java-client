package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.PollResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface PollApi extends ApiClient.Api {


  /**
   * Poll - Retrieve Poll Status
   * 
   * @param pollId The identifier for poll (required)
   * @return PollResponse
   */
  @RequestLine("GET /poll/status/{pollId}")
  @Headers({
    "Accept: application/json",
  })
  PollResponse retrievePollStatus(@Param("pollId") String pollId);

  /**
   * Poll - Retrieve Poll Status
   * Similar to <code>retrievePollStatus</code> but it also returns the http response headers .
   * 
   * @param pollId The identifier for poll (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /poll/status/{pollId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PollResponse> retrievePollStatusWithHttpInfo(@Param("pollId") String pollId);


}
