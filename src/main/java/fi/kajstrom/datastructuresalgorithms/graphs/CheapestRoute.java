package fi.kajstrom.datastructuresalgorithms.graphs;

public class CheapestRoute {
    private Integer price;
    private City via;

    public CheapestRoute(Integer price, City via) {
        this.price = price;
        this.via = via;
    }

    public Integer getPrice() {
        return price;
    }

    public City getVia() {
        return via;
    }
}
