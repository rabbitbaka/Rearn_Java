public class StringManipulationDemo {
    public static void main(String[] args) {
        String baseString = "Hello";
        String stringTtoConcat = " World";
        String searchString = "lo";

        String concatenatedString = baseString.concat(stringTtoConcat);
        System.out.println(concatenatedString); // Hello World

        int index = concatenatedString.indexOf(searchString);
        System.out.println(index); // 3

        boolean isEmpty = baseString.isEmpty();
        System.out.println(isEmpty); // false

        int length = concatenatedString.length();
        System.out.println(length); // 11
    }
}
