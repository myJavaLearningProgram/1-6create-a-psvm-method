package com.github.hcsp;

public class Main {
    public static int a = 0;

    // Create a public static void main(String[] args) method here.
    // 在这里创建一个public static void main(String[] args)方法。
    public static void main(String[] args) {
        System.out.println(f(1));
        System.out.println(f(2));
        System.out.println(f(3));
    }


    public static int f(int x) {
        a = a + x;
        return a;
    }

    public static void a() {
        b();
    }
    public static void b() {
        c();
    }
    public static void c() {
        d();
    }
    public static void d() {

    }
}
