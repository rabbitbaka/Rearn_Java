import java.util.*;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("Java");
        stringList.add("Python");
        stringList.add(1,"C++");

        stringList.remove("Python"); // 문자열 제거

        String elementAtIndex = stringList.get(0); // 요소 가져오기

        int size = stringList.size(); // 사이즈 가져오기

        System.out.println("인덱스 1의 요소: " + elementAtIndex); // Java
        System.out.println("ArrayList의 크기: " + size); // 2
        System.out.println("ArrayList의 현재 요소들:");
        for (String s : stringList){
            System.out.print(s + " "); //Java C++
        }
    }

}
