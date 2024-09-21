package programmer.zaman.now.application;

import programmer.zaman.now.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> myDataString = new MyData<>("Sony");
//        doIt(myDataString); error
//        MyData<Object> objectMyData = myDataString; error
        MyData<Object> objectMyData = new MyData<>(1000);
//        MyData<Integer> integerMyData = objectMyData; ini juga error
//        doItInteger(objectMyData); error juga
    }

    public static void doIt(MyData<Object> objectMyData) {
        // do nothing
    }

    public static void doItInteger(MyData<Integer> integerMyData) {
        // do nothing
    }
}
