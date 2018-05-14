package fi.kajstrom.datastructuresalgorithms.graphs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    void testWriteNetwork_WhenCalled_WritesEntireNetwork() {
        Person person = new Person("Jim");
        Person person1 = new Person("John");
        Person person2 = new Person("Jane");
        Person person3 = new Person("Jill");

        person.addFriend(person1);
        person1.addFriend(person2);
        person2.addFriend(person3);

        StringBuilder builder = new StringBuilder();
        person.writeNetwork(builder);

        String network = builder.toString();

        assertTrue(network.contains("Jim"));
        assertTrue(network.contains("John"));
        assertTrue(network.contains("Jane"));
        assertTrue(network.contains("Jill"));
    }
}
