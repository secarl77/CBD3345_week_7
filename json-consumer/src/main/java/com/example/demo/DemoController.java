
package com.example.demo;

import c0917329.utils.JsonHelper;

public class DemoController {
    public static void main(String[] args) {
        String json = JsonHelper.toJson("¡Hola desde json-consumer!");
        System.out.println(json);
    }
}
