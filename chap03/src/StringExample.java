public class StringExample {
    public static void main(String[] args) {
        String greeting = "안녕하세요";
        System.out.println(greeting); //안녕하세요

        String name = new String("Java 사용자");
        System.out.println(name); // Java 사용자

        char[] charArray = {'J','a', 'v', 'a', ' ', '프', '로', '그', '래', '머'};
        String programmer = new String(charArray);
        System.out.println(programmer); // Java 프로그래머

        String fullName = "Kim" + " " + "Young";
        System.out.println(fullName); // Kim Young

        StringBuilder sb = new StringBuilder();
        sb.append("문자열 ").append("생성 ").append("예제");
        String result = sb.toString();
        System.out.println(result); // 문자열 생성 예제
    }
}
