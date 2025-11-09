// Observador concreto: notifica al técnico
public class TechnicianNotificationSubscriber implements IRequestSubscriber {
    @Override
    public void update(ServiceRequest request) {
        System.out.println("🔧 Notificando al técnico: la solicitud está ahora '" + request.getState() + "'.");
    }
}