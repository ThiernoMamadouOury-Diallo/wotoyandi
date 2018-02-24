package fr.wotoyandi.backend.route;

import fr.wotoyandi.backend.odt.UserOdt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;


@RestController
@RequestMapping(AuthenticationRoute.NAME)
public class AuthenticationRoute extends AbstractRoute{

    public static final String NAME = "/bff";

    private static final Logger LOG = LoggerFactory.getLogger(AuthenticationRoute.class);
    private static final String URI_1 = "/zdv/zccz/qdc",
                                URI_2 = "/zdv/zccz/qdc",
                                URI_3 = "/zdv/zccz/qdc";

    private static final String MSG_1 = "/zdv/zccz/qdc",
                                MSG_2 = "/zdv/zccz/qdc",
                                MSG_3 = "/zdv/zccz/qdc";
    public AuthenticationRoute(){

    }

    @GET
    @Path("/greeting/{name}")
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public List<UserOdt> greeting(@PathVariable("name") String name) {
        Response response = null;
        try {
            response = getClientBusinessApi(URI_1).get();
        }
        catch (Exception e){
            LOG.error(e.getMessage());
            /*throw WebApplicationException(e, Response.Status.SERVICE_UNAVAILABLE);*/
        }
        throwExceptionIfError(response, MSG_1);

        return null;/*new response.readEntity(new GenericType<List<UserOdt>>(){});*/
    }

}
