package com.chap08;

public class GenericMain {
    public static void main(String[] args) {
        GenericClass<String> stringInstance = new GenericClass<>();
        stringInstance.setData("안녕, 제네릭!");
        String data = stringInstance.getData();
        System.out.println(data);

        GenericClass<Integer> intInstance = new GenericClass<>();
        intInstance.setData(123);
        Integer int_data = intInstance.getData();
        System.out.println(int_data);

        GenericClass<Custom> customInstance = new GenericClass<>();
        customInstance.setData(new Custom());
        Custom c = customInstance.getData();
        System.out.println(c);

        GenericClass<Object> objInstance = new GenericClass<>();
        objInstance.setData(10);
        objInstance.setData("Hello");
        String a = (String) objInstance.getData(); // String이면 받기!!
        System.out.println(a);
    }
}
