/*
package com.example.demo;

import c0917329.utils.JsonHelper;

public class DemoController {
    public static void main(String[] args) {
        String json = JsonHelper.toJson("¡Hola desde json-consumer!");
        System.out.println(json);
    }
}
*/
package com.example.demo;

import c0917329.utils.JsonHelper;

public class DemoController {
    public static void main(String[] args) {
        String result = JsonHelper.toJson(new Person("Carlos", 47));
        System.out.println(result);
    }

    static class Person {
        public String name;
        public int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}

