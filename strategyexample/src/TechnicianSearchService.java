// Contexto: Servicio de búsqueda de técnicos
import java.util.List;

public class TechnicianSearchService {
    private ISortingStrategy strategy;

    public void setStrategy(ISortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void displayTechnicians(List<Technician> technicians) {
        if (strategy == null) {
            System.out.println("❌ No se ha definido una estrategia de ordenamiento.");
            return;
        }
        strategy.sort(technicians);
        System.out.println("🔎 Resultados ordenados:");
        technicians.forEach(t -> System.out.println(" - " + t));
    }
}