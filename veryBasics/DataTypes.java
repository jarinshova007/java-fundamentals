import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input
        System.out.print("age:" );
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("name: ");
        String name = sc.nextLine();

        System.out.print("weight(float):" );
        float weight = sc.nextFloat();
        sc.nextLine();


        System.out.print("hashtag:" );
        String hashtag = sc.nextLine();

        String _name = "Jarin";
        String _hashtag = '#';
        Double pi = Math.PI;
        float _pi = 3.14f;
        int _age = 21;
        
        System.out.println("---output---");
        System.out.println(age);
        System.out.println(_age);
        System.out.println(name);
        System.out.println(_name);
        System.out.println(pi);
        System.out.println(_pi);
        System.out.println(weight);
        System.out.println(hashtag);
        System.out.println(_hashtag);

        sc.close();

    }
}
