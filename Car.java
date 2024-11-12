import java.util.Objects;


public class Car {
    private String vin;
    private String description;

    // Constructor with two parameters
    public Car(String vin, String description) {
        this.vin = vin;
        this.description = description;
    }

    // Getter for vin
    public String getVin() {
        return vin;
    }

    // Setter for vin
    public void setVin(String vin) {
        this.vin = vin;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    // Override equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(vin, car.vin) &&
               Objects.equals(description, car.description);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
    	System.out.println("hascode function");
       // return vin.hashCode();
        return Objects.hash(vin, description);
    }
}