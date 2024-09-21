package programmer.zaman.now.application;

import programmer.zaman.now.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> myData = new MyData<>("Sony");
        process(myData);

        MyData<? extends Object> myData1 = myData;
    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());

//        myData.setData(1); ini tidak boleh, karena berbahaya
    }
}
