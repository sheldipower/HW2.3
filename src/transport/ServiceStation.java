package transport;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> transportsQueue = new LinkedList<Transport>();
    private List<Transport> carList;
    private List<Mechanic> mechanics;

    public void addCarToQueue(Transport transport) {
        if (transport.needGoDiagnostic()) {
            transportsQueue.offer(transport);
            System.out.println(transport.getBrand() + "" + transport.getModel() + "добавлен в очередь");
        } else {
            System.out.println("Автобус" + transport.getBrand() + "" + transport.getModel() + "не должны проходить диагностику");
        }
    }

    public void runCheckUp() {
        Transport transport = transportsQueue.poll();
        System.out.println("Провели техосмотр транспорта " + transport);
    }
}
