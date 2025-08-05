import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input
        // String type
        String name = "Jarin Shova";
        String Name = "Mitu";
        
        System.out.print("_name: ");
        String _name = sc.nextLine();
        
        String hashtag = "#neverLoseHope";
        System.out.print("_hashtag: ");
        String _hashtag = sc.nextLine();

        // character type
        char c = 77; // ASCII value of M
        char hash = '#';
        System.out.print("_hash: ");
        char _hash = sc.next().charAt(0);
        sc.nextLine();

        // integer type
        int age = 21;
        System.out.print("_age: ");
        int _age = sc.nextInt();
        sc.nextLine();

        // float type
        float pi = 3.14f;
        float weight = 41.220f;
        System.out.print("_weight: ");
        float _weight = sc.nextFloat();
        sc.nextLine();

        // double type
        double height = 152.4; // in cm
        System.out.print("_height: ");
        double _height = sc.nextDouble();
        sc.nextLine();
        double PI = Math.PI;

        // output
        System.out.println("---output---");
        System.out.println("name: " + name);
        System.out.println("Name: " + Name);
        System.out.println("_name: " + _name);
        System.out.println("hashtag: " + hashtag);
        System.out.println("_hashtag: " + _hashtag);
        System.out.println("c: " + c);
        System.out.println("hash: " + hash);
        System.out.println("_hash: " + _hash);
        System.out.println("age: " + age);
        System.out.println("_age: " + _age);
        System.out.println("pi: " + pi);
        System.out.println("weight: " + weight);
        System.out.println("_weight: " + _weight);
        System.out.println("height: " + height); 
        System.out.println("_height: " + _height);
        System.out.printf("PI: %.2f\n", PI); // takes two digit after decimal point

        sc.close();

    }
}
