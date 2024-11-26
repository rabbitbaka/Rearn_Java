public class StringCompareExample {
    public static void main(String[] args) {
        String firstString = "Hellow World";
        String secondString = "Hellow World";
        String thirdString = "hellow World";

        int comparisonResult = firstString.compareTo(secondString);
        System.out.println("firstString과 secondString 비교: " + comparisonResult); // 0

        boolean equalsResult = firstString.equals(secondString);
        System.out.println("firstString과 secondString이 같음: " + equalsResult); // true

        comparisonResult = firstString.compareTo(thirdString);
        equalsResult = firstString.equals(thirdString);

        System.out.println("firstString과 thirdString 비교: " + comparisonResult); // -32
        System.out.println("firstString과 thirdString이 같음: " + equalsResult); // false

    }
}
