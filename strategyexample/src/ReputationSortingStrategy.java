import java.util.List;

// Estrategia concreta: por reputación
public class ReputationSortingStrategy implements ISortingStrategy {
    @Override
    public void sort(List<Technician> technicians) {
        System.out.println("Ordenando técnicos por reputación...");
        technicians.sort((t1, t2) -> Double.compare(t2.getRating(), t1.getRating()));
    }
}