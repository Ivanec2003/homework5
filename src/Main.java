import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //comparing objects and returning bigger object
        String firstObject = "Hi";
        String secondObject = "Guys";
        System.out.println(compare(secondObject, firstObject));

        int firstObject2 = 113;
        int secondObject2 = 125;
        System.out.println(compare(firstObject2, secondObject2));

        double firstObject3 = 113.56;
        double secondObject3 = 120.33;
        System.out.println(compare(firstObject3, secondObject3));

        //returning unique elements
        System.out.println("------------------------");
        Integer[] array = {1,2,3,4,4,6,6,8,8,10};
        System.out.println(numberUniqueElements(array));
        String[] array2 = {"Vlad", "Max", "Vlad", "John", "Max", "Kyril"};
        System.out.println(numberUniqueElements(array2));

        //Searching object in array
        System.out.println("Search in array(int)");
        SearchObject searchObject = new SearchObject();
        searchObject.search(array, 4);
        System.out.print("Search in array(string)");
        searchObject.search(array2, "Max");

        //Media
        System.out.println("------------------------");
        Media video1 = new Video("Java№1", "100Mb", "10:30");
        Media video2 = new Video("Java№2", "125Mb", "16:25");
        Media video3 = new Video("Java№3", "90Mb", "8:45");
        video1.displayInfo();
        video2.displayInfo();
        video3.displayInfo();

        Media audio1 = new Audio("Music№1", "5Mb", "3:45");
        Media audio2 = new Audio("Music№2", "4.45Mb", "4:15");
        Media audio3 = new Audio("Music№3", "6.23Mb", "6:48");
        audio1.displayInfo();
        audio2.displayInfo();
        audio3.displayInfo();

        Media image1 = new Image("Image№1","10Kb", "200 * 50");
        Media image2 = new Image("Image№2","5Kb", "50 * 50");
        Media image3 = new Image("Image№3","25Kb", "320 * 80");
        image1.displayInfo();
        image2.displayInfo();
        image3.displayInfo();

        //Shape
        System.out.println("------------------------");
        Triangle triangle = new Triangle(15, 6, 7, 4);
        Circle circle = new Circle(10.5);
        Rectangle rectangle = new Rectangle(10.5, 5.4);
        triangle.calculateArea();
        circle.calculateArea();
        rectangle.calculateArea();
        triangle.calculatePerimeter();
        circle.calculatePerimeter();
        rectangle.calculatePerimeter();
    }
    public static <T extends Comparable<T>> T compare(T firstObject, T secondObject) {
        return firstObject.compareTo(secondObject) >= 0 ? firstObject : secondObject;
    }
    public static <T> int numberUniqueElements(T[] array){
        Set<T> set = new HashSet<>();
        for (T element : array){
            set.add(element);
        }
        return set.size();
    }
}