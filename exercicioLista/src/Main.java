import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registered?");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++){
            System.out.println("Employee #" + (i+1) +":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while(hasId(list, id)){
                System.out.println("Id already taken!");
                id = sc.nextInt();
            }


            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idsalary= sc.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

        if (emp == null){
            System.out.println("This id does not exist!");
        }
        else{
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}