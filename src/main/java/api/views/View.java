package api.views;

import com.google.gson.Gson;

public class View {
    
    // Gson- Para transformar los datos a JSON
    private static Gson gson = new Gson();

    public static String show(Object data) {
        String json = gson.toJson(data); // Con este metodo convertimos el objeto en JSON
        return json;
    }
}
