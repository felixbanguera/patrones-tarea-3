// Observador concreto: notifica al cliente
public class CustomerNotificationSubscriber implements IRequestSubscriber {
    @Override
    public void update(ServiceRequest request) {
        System.out.println("📢 Notificando al cliente: el estado de la solicitud cambió a '" + request.getState() + "'.");
    }
}