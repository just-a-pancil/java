class A {

void callme() {

System.out.println("Вызван callme метод класса А");

}

}

class B extends A {

void callme() {

System.out.println("Вызван callme метод класса В");

}

}

class Dispatch {

public static void main(String args[]) {

A a = new B();

a.callme();

}

}