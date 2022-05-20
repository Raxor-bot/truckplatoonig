package truck;

import broker.Fuhrpark;


import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TruckBestand {

    @Inject
    Fuhrpark producer;

    @POST
    public Response send(Truck truck){
        producer.send(truck);

        return Response.accepted().build();
    }
}
