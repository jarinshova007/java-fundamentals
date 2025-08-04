import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input

        String Name = "Jarin";
        String _name = "Jarin";
        char _hashtag = '#';

        System.out.print("age: " );
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("name: ");
        String name = sc.nextLine();

        System.out.print("weight(float): " );
        float weight = sc.nextFloat();
        sc.nextLine();

        System.out.print("ampersand: " );
        char ampersand = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("hashtag: " );
        String hashtag = sc.nextLine();

        Double pi = Math.PI;
        float _pi = 3.14f;
        int _age = 21;
        
        System.out.println("\n---output---");
        System.out.println("age: " + age);
        System.out.println("_age: " + _age);
        System.out.println("Name: " + Name);
        System.out.println("name: " + name);
        System.out.println("_name: " +_name);
        System.out.println("pi: " + pi);
        System.out.println("_pi: " + _pi);
        System.out.printf("weight: %.2f\n", weight); // will print 2 digit after decimel point
        System.out.println("hashtag: " + hashtag);
        System.out.println("_hashtag: " + _hashtag);
        System.out.println("_ampersand: " + ampersand);

        sc.close();

    }
}
