package fi.kajstrom.datastructuresalgorithms.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class City {
    private String name;
    private Map<City, Integer> routes = new HashMap<>();

    public City(String name) {
        this.name = name;
    }

    public void addRoute(City city, Integer price) {
        routes.put(city, price);
    }

    /**
     * Dijskstra algorithm.
     */
    public Map<City, CheapestRoute> cheapestRoutes(List<City> toCities)
    {
        Map<City, CheapestRoute> routesFromCity = new HashMap<>();

        routesFromCity.put(this, new CheapestRoute(0, this));

        toCities.forEach((city) -> {
            routesFromCity.put(city, new CheapestRoute(Integer.MAX_VALUE, null));
        });

        List<City> visitedCities = new ArrayList<>();

        City currentCity = this;

        while (currentCity != null) {
            visitedCities.add(currentCity);

            for (Map.Entry<City, Integer> entry : currentCity.routes.entrySet()) {
                City city = entry.getKey();
                Integer price = entry.getValue();

                if (routesFromCity.get(city).getPrice() > (price + routesFromCity.get(currentCity).getPrice())) {
                    routesFromCity.put(city, new CheapestRoute(price + routesFromCity.get(currentCity).getPrice(), city));
                }
            };

            currentCity = null;

            Integer cheapestRouteFromCurrentCity = Integer.MAX_VALUE;

            for (Map.Entry<City, CheapestRoute> entry : routesFromCity.entrySet()) {
                City city = entry.getKey();
                CheapestRoute route = entry.getValue();

                if (route.getPrice() < cheapestRouteFromCurrentCity && !visitedCities.contains(city)) {
                    cheapestRouteFromCurrentCity = route.getPrice();
                    currentCity = city;
                }
            }
        }

        return routesFromCity;
    }
}
