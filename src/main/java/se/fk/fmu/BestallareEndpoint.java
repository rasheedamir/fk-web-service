package se.fk.fmu;

import lombok.extern.slf4j.Slf4j;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import ws.fk.fmu.admin.eavrop.*;

/**
 * Created by Rasheed on 12/3/14.
 */
@SuppressWarnings("ALL")
@Endpoint
@Slf4j
public class BestallareEndpoint {

    private static final String NAMESPACE_URI = "http://fk.ws/fmu/admin/eavrop";

    /**
     * Handle's fmuVardgivarenhetTilldelningRequest
     * 
     * @return
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "fmuVardgivarenhetTilldelningRequest")
    @ResponsePayload
    public FmuVardgivarenhetTilldelningResponse handleFmuVardgivarenhetTilldelningRequest(@RequestPayload FmuVardgivarenhetTilldelningRequest request) {

        log.info(ReflectionToStringBuilder.toString(request));
        
        ServiceResponseType serviceResponseType = new ServiceResponseType();
        serviceResponseType.setArendeId(request.getArendeId());
        serviceResponseType.setStatusCode(StatusCodeType.OK);
        FmuVardgivarenhetTilldelningResponse fmuVardgivarenhetTilldelningResponse = new FmuVardgivarenhetTilldelningResponse();
        fmuVardgivarenhetTilldelningResponse.setServiceResponse(serviceResponseType);

        return fmuVardgivarenhetTilldelningResponse;
    }

    /**
     * Handle's fmuVardgivarenhetTilldelningRequest
     * 
     * @return
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "fmuStartRequest")
    @ResponsePayload
    public FmuStartResponse handleFmuStartRequest(@RequestPayload FmuStartRequest request) {

        log.info(ReflectionToStringBuilder.toString(request));
        
        ServiceResponseType serviceResponseType = new ServiceResponseType();
        serviceResponseType.setArendeId(request.getArendeId());
        serviceResponseType.setStatusCode(StatusCodeType.OK);
        FmuStartResponse fmuStartResponse = new FmuStartResponse();
        fmuStartResponse.setServiceResponse(serviceResponseType);

        return fmuStartResponse;
    }

    
    /**
     * Handle's begarKompletteringFmuHandlingRequest
     * @param request
     * @return
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "begarKompletteringFmuHandlingRequest")
    @ResponsePayload
    public BegarKompletteringFmuHandlingResponse handleBegarKompletteringFmuHandlingRequest(@RequestPayload BegarKompletteringFmuHandlingRequest request) {

        log.info(ReflectionToStringBuilder.toString(request));
        ServiceResponseType serviceResponseType = new ServiceResponseType();
        serviceResponseType.setArendeId(request.getArendeId());
        serviceResponseType.setStatusCode(StatusCodeType.OK);
        BegarKompletteringFmuHandlingResponse begarKompletteringFmuHandlingResponse = new BegarKompletteringFmuHandlingResponse();
        begarKompletteringFmuHandlingResponse.setServiceResponse(serviceResponseType);

        return begarKompletteringFmuHandlingResponse;
    }

    /**
     * Handle's fmuBokningRequest
     * @param request
     * @return
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "fmuBokningRequest")
    @ResponsePayload
    public FmuBokningResponse handleFmuBokningRequest(@RequestPayload FmuBokningRequest request) {

        log.info(ReflectionToStringBuilder.toString(request));
        ServiceResponseType serviceResponseType = new ServiceResponseType();
        serviceResponseType.setArendeId(request.getArendeId());
        serviceResponseType.setStatusCode(StatusCodeType.OK);
        FmuBokningResponse fmuBokningResponse = new FmuBokningResponse();
        fmuBokningResponse.setServiceResponse(serviceResponseType);

        return null;
    }

    /**
     * Handle's fmuBokningsavvikelseRequest
     * @param request
     * @return
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "fmuBokningsavvikelseRequest")
    @ResponsePayload
    public FmuBokningsavvikelseResponse handleFmuBokningsavvikelseRequest(@RequestPayload FmuBokningsavvikelseRequest request) {

        log.info(ReflectionToStringBuilder.toString(request));
        ServiceResponseType serviceResponseType = new ServiceResponseType();
        serviceResponseType.setArendeId(request.getArendeId());
        serviceResponseType.setStatusCode(StatusCodeType.OK);
        FmuBokningsavvikelseResponse fmuBokningsavvikelseResponse = new FmuBokningsavvikelseResponse();
        fmuBokningsavvikelseResponse.setServiceResponse(serviceResponseType);

        return null;
    }

    /**
     * Handle's fmuIntygSentRequest
     * @param request
     * @return
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "fmuIntygSentRequest")
    @ResponsePayload
    public FmuIntygSentResponse handleFmuIntygSentRequest(@RequestPayload FmuIntygSentRequest request) {

        log.info(ReflectionToStringBuilder.toString(request));
        ServiceResponseType serviceResponseType = new ServiceResponseType();
        serviceResponseType.setArendeId(request.getArendeId());
        serviceResponseType.setStatusCode(StatusCodeType.OK);
        FmuIntygSentResponse fmuIntygSentResponse = new FmuIntygSentResponse();
        fmuIntygSentResponse.setServiceResponse(serviceResponseType);

        return null;
    }
    
}
