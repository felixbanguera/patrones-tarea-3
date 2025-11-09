import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Strategy Example!");
        List<Technician> technicians = new ArrayList<>();
        technicians.add(new Technician("Carlos", 4.8, 3.2, 15));
        technicians.add(new Technician("Andrea", 4.6, 1.5, 10));
        technicians.add(new Technician("Luis", 4.9, 5.0, 30));

        TechnicianSearchService searchService = new TechnicianSearchService();

        System.out.println("\n=== Estrategia: Reputación ===");
        searchService.setStrategy(new ReputationSortingStrategy());
        searchService.displayTechnicians(technicians);

        System.out.println("\n=== Estrategia: Distancia ===");
        searchService.setStrategy(new DistanceSortingStrategy());
        searchService.displayTechnicians(technicians);
    }
}

