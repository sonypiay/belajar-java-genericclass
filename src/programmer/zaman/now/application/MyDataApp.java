package programmer.zaman.now.application;

import programmer.zaman.now.generic.MyData;

public class MyDataApp {
    public static void main(String[] args) {
        MyData<String> myDataString = new MyData<String>("Sony Darmawan");
        MyData<Integer> myDataInteger = new MyData<Integer>(10);

        System.out.println(myDataString.getData());
        System.out.println(myDataInteger.getData());
    }
}
