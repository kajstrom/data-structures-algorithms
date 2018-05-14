package fi.kajstrom.datastructuresalgorithms.graphs;

import java.nio.Buffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Person {
    private String name;
    private List<Person> friends;
    private boolean visited = false;

    public Person(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
    }

    public void addFriend(Person friend) {
        friends.add(friend);
    }

    /**
     * An example of a breadth-first search on a graph.
     */
    public void writeNetwork(StringBuilder builder) {
        List<Person> toReset = new ArrayList<>();
        toReset.add(this);

        Deque<Person> queue = new ArrayDeque<>();
        queue.add(this);

        while (!queue.isEmpty()) {
            Person currentVertex = queue.pop();

            builder.append(currentVertex.name + "\r\n");

            currentVertex.friends.forEach((Person friend) -> {
                if (!friend.visited) {
                    toReset.add(friend);
                    queue.add(friend);
                    friend.visited = true;
                }
            });
        }

        toReset.forEach((Person p) -> {
            p.visited = false;
        });
    }
}
