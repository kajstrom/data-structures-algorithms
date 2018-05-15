package fi.kajstrom.datastructuresalgorithms.graphs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class CityTest {
    @Test
    void testCheapestRoute_WhenCalled_FindsCheapestRoutesToCities() {
        City atlanta = new City("Atlanta");
        City boston = new City("Boston");
        City chicago = new City("Chicago");
        City denver = new City("Denver");
        City elPaso = new City("El Paso");

        atlanta.addRoute(boston, 100);
        atlanta.addRoute(denver, 160);
        boston.addRoute(chicago, 120);
        boston.addRoute(denver, 180);
        chicago.addRoute(elPaso, 80);
        denver.addRoute(chicago, 40);
        denver.addRoute(elPaso, 140);

        List<City> toCities = new ArrayList<>();
        toCities.add(boston);
        toCities.add(chicago);
        toCities.add(denver);
        toCities.add(elPaso);

        Map<City, CheapestRoute> cheapestRoutes = atlanta.cheapestRoutes(toCities);

        assertEquals(100, cheapestRoutes.get(boston).getPrice().intValue());
        assertEquals(200, cheapestRoutes.get(chicago).getPrice().intValue());
        assertEquals(160, cheapestRoutes.get(denver).getPrice().intValue());
        assertEquals(280, cheapestRoutes.get(elPaso).getPrice().intValue());
    }
}
