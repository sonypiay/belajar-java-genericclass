package programmer.zaman.now.application;

import programmer.zaman.now.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<>("Sony"));
        print(new MyData<>(100));
        print(new MyData<>(true));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
