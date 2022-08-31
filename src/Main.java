import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    private static List<Person> generateClients() {
        List<Person> clients = new LinkedList<>();
        clients.add(new Person("Jonathan", "Joestar", 3));
        clients.add(new Person("Robert", "Speedwagon", 8));
        clients.add(new Person("Erina", "Pendleton", 2));
        clients.add(new Person("Dio", "Brando", 4));
        clients.add(new Person("Jotaro", "Kujo", 1));
        return clients;
    }

    public static void main(String[] args) {
        Queue<Person> queue = (Queue<Person>) generateClients();

        while (!queue.isEmpty()){
            Person person = queue.poll();
            System.out.println(person.firstName + " " + person.lastName + " прокатился/лась на аттракционе");
            person.ticketsCount--;
            if (person.ticketsCount > 0){
                queue.offer(person);
            }
        }

    }
}
