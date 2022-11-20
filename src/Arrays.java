import java.util.ArrayList;

public class Arrays {
    int a;
    int b;
    int c;
    public static void main(String[] args) {
        ArrayList<String> firstArray = new ArrayList<>();
        firstArray.add("Нулевой элемент");
        firstArray.add("Первый? элемент");
        firstArray.add(2,"THIRD");
        firstArray.remove(2);
        firstArray.equals(firstArray);
        for (int i = 0 ; i < firstArray.size(); i++){
            System.out.println(firstArray.get(i));
        }
    }
}
