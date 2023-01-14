package sample;

public class Supermarket {
    private String id;
    private String type;
    private String name;
    private String description;
    private Double price;

    public Supermarket() {
        this.id = "0000";
        this.type = "";
        this.name = "";
        this.description = "";
        this.price = 0.0;
    }

    @Override
    public String toString() {
        return type + " " + name
                + " " + description + " "  + price + "P";
    }

    public Supermarket(String id, String type, String name, String description, double price) {
        this.id = id;

        this.type = type;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}


