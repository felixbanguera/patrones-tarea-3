import java.util.List;

// Estrategia concreta: por distancia
public class DistanceSortingStrategy implements ISortingStrategy {
    @Override
    public void sort(List<Technician> technicians) {
        System.out.println("Ordenando técnicos por distancia...");
        technicians.sort((t1, t2) -> Double.compare(t1.getDistanceKm(), t2.getDistanceKm()));
    }
}