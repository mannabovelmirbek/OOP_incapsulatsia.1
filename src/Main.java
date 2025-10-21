import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       /* Student student1 = new Student();

        System.out.print("Write name: ");
        student1.setName(sc.nextLine());
        System.out.print("Write last name: ");
        student1.setLastname(sc.nextLine());
        System.out.print("Write age: ");
        student1.setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("Write courses: ");
        student1.setCourses(sc.nextLine());

        System.out.println("Name: "+student1.getName());
        System.out.println("Last name: "+student1.getLastname());
        System.out.println("Age: "+student1.getAge());
        System.out.println("Courses: "+student1.getCourses());*/

        House house = new House();
        System.out.print("Write addres : ");
        house.setAddres(sc.nextLine());
        System.out.print("Write number of rooms : ");
        house.setNumberOfRooms(sc.nextInt());
        System.out.print("Write area: ");
        house.setArea(sc.nextDouble());

        System.out.print("Write price: ");

        System.out.println("Resultat: "+house.calculatePrice(sc.nextInt()));

    }
}