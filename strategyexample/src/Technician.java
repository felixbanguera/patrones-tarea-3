// Clase de dominio: Técnico
public class Technician {
    private String name;
    private double rating;
    private double distanceKm;
    private double responseTimeMinutes;

    public Technician(String name, double rating, double distanceKm, double responseTimeMinutes) {
        this.name = name;
        this.rating = rating;
        this.distanceKm = distanceKm;
        this.responseTimeMinutes = responseTimeMinutes;
    }

    public String getName() { return name; }
    public double getRating() { return rating; }
    public double getDistanceKm() { return distanceKm; }
    public double getResponseTimeMinutes() { return responseTimeMinutes; }

    @Override
    public String toString() {
        return name + " [⭐ " + rating + ", 📍 " + distanceKm + " km, ⏱ " + responseTimeMinutes + " min]";
    }
}