package es.usal;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "García", 25, "juan@email.com");

        Gson gson = new Gson();
        String json = gson.toJson(persona);

        System.out.println("Persona en JSON:");
        System.out.println(json);
    }
}