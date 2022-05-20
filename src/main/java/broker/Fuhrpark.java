package broker;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import truck.Truck;

import javax.inject.Inject;

public class Fuhrpark {
    @Inject
    @Channel("trucks-out")
    Emitter<Truck> emitter;

    public void send(Truck truck){
        emitter.send(truck);
    }
}
