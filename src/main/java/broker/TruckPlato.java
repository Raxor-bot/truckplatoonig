package broker;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;
import truck.Truck;

public class TruckPlato {
    private final Logger logger = Logger.getLogger(TruckPlato.class);

    @Incoming("trucks-in")
    public void receive(Truck truck){
        logger.info(truck.speed + " " + truck.id + " " + truck.stopped);
    }

}
