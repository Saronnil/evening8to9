import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streamwithobjects {
    public static void main(String[] args) {
        List<Employees> Listofemployees = new ArrayList<Employees>();
        Listofemployees.add(new Employees("Sukhbir", 43452,30000,"IT"));
        Listofemployees.add(new Employees("Ronnil",43453,20000,"HR"));
        Listofemployees.add(new Employees("Sara",43454,70000,"Dev"));
        Listofemployees.add(new Employees("Vitthal",43455,80000,"Admin"));
        Listofemployees.add(new Employees("Sangita",43456,10000,"Admin"));

Predicate <Employees> p1 = new Predicate<Employees>() {
    @Override
    public boolean test(Employees employees) {
        return employees.salary()>50000;
    }
};

        Consumer <Employees> c1 = new Consumer<Employees>() {
            @Override
            public void accept(Employees employees) {
                System.out.println(employees.name() +"----" + employees.dept() +"-----" + employees.salary());
            }
        };

        Listofemployees.stream().filter(p1).forEach(c1);
        System.out.println("---------------------------------------------------------------------------");

       // MaptoDouble is a intermediate operation , convert stream of objects to streams of double .

        Listofemployees.stream().mapToDouble(e-> e.salary()).filter(s -> s<40000).map(s-> s+s*0.1).forEach(salary -> System.out.println(salary));
        System.out.println("---------------------------------------------------------------------------");

        Listofemployees.stream().filter(e -> e.salary()> 50000).forEach( e-> System.out.println(e.name()));
// print the number of employees present in each department

       Map<String,Long> groupingdata = Listofemployees.stream().collect(Collectors.groupingBy(s->s.dept(),Collectors.counting()));
        System.out.println(groupingdata);

        System.out.println("---------------------------------------------------------------------------");

        Listofemployees.stream().filter(e -> e.salary() > 70000 && e.dept().equals("Admin")).forEach(e -> System.out.println(e.name()));

        // Statistics related to salary

        System.out.println(Listofemployees.stream().collect(Collectors.summarizingDouble(e->e.salary())));

        System.out.println(Listofemployees.stream().collect(Collectors.summarizingDouble(e -> e.salary())).getMax());

        System.out.println(Listofemployees.stream().collect(Collectors.summarizingDouble(e ->e.salary())));

        // double the salary whose dept is HR
        Listofemployees.stream().filter(e -> e.dept().equalsIgnoreCase("HR")).forEach(e-> System.out.println(e.name()+"-----"+ e.salary()*2));
// partition the employee based on salary

        Map <Boolean,List<Employees>> collect= Listofemployees.stream().collect(Collectors.partitioningBy(e-> e.salary()>50000));
        System.out.println(collect);


    }
}
