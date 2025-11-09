public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Observable Example!");
        ServiceRequest request = new ServiceRequest();

        // Se registran los observadores
        request.attach(new CustomerNotificationSubscriber());
        request.attach(new TechnicianNotificationSubscriber());
        //request.attach(new ReputationModuleObserver());

        // Simulamos cambios de estado
        request.setState("Pendiente");
        request.setState("En progreso");
        request.setState("Completada");
    }
}
