package fr.wotoyandi.backend.route;

import fr.wotoyandi.backend.BackendRunner;
import org.apache.logging.log4j.ThreadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.Response;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

public abstract class AbstractRoute {
    private static final Logger LOG = LoggerFactory.getLogger(BackendRunner.class);
    protected static String urlApi;

    private static final String SCEAU_ERROR_MSG = "Erreur de scellement";
    private static final String USER_ID = "user_id";
    private static final String USER_NAME = "user_name";

    static {
        //TODO system set properties here
    }

    protected Invocation.Builder getClientBusinessApi(String uri) throws UnknownHostException, Exception{
        LOG.info("uri "+uri);
        return getClientBusinessApi(uri, Collections.emptyMap());
    }
    protected void throwExceptionIfError(Response response){
        throwExceptionIfError(response, "the service is currently unvailable");
    }
    protected void throwExceptionIfError(Response response, String errorMessage){
        if (response == null || response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL){
            String errorCause = response == null ? "respoonse is null" : "HTTP reponse status code is "+response.getStatus();
            LOG.error(errorMessage + "; Cause: " + errorCause);
            throw new WebApplicationException(errorMessage, Response.Status.SERVICE_UNAVAILABLE);
        }
    }
    protected Invocation.Builder getClientBusinessApi(String uri, Map<String, Object> queryparams){
        String routeBusinessApi = urlApi + uri;
        LOG.info("BusinessAPi Endpoint Build = "+routeBusinessApi);
        System.out.println("route Api "+ ThreadContext.get("REQUEST-ID"));
        WebTarget webTarget = ClientBuilder.newClient().target(routeBusinessApi);
        for (Entry<String, Object> queryParam: queryparams.entrySet()){
            webTarget = webTarget.queryParam(queryParam.getKey(), queryParam.getValue());
        }


        final MultivaluedHashMap<String, Object> headers = new MultivaluedHashMap<>();

        headers.putSingle(USER_ID, ThreadContext.get("USER-ID"));
        headers.putSingle(USER_NAME, "USER-NAME");
        ///More things here

        try{
            /*
            Tokengenerator instance = new Tokengenerator();
            String token = instance.getAccesToken();
            headers.putSingle(USER_NAME, token);
            //More
            */

        }
        catch (Exception e){
            LOG.info(SCEAU_ERROR_MSG);
            System.out.println("Erreur sceau");
        }
        return webTarget.request(MediaType.APPLICATION_JSON_TYPE).headers(headers);
    }

    protected void putQueryParam(Map<String, Object> map, String key, Object value){
        if(value != null)
            map.put(key, value);
    }

}
