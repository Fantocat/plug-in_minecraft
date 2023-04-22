package fr.fanto.monsterindustries.gsonUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fr.fanto.monsterindustries.gameclass.Map;
import org.bukkit.Location;

public class MapSerializationManager {

    private Gson gson;

    public MapSerializationManager() {
        this.gson = createGson();
    }

    public Gson createGson() {
        return new GsonBuilder()
                .registerTypeAdapter(Location.class, new LocationTypeAdapter())
                .setPrettyPrinting()
                .disableHtmlEscaping()
                .create();
    }

    public String serializeMap(Map map) {
        return this.gson.toJson(map);
    }

    public Map deserializeMap(String json) {
        return this.gson.fromJson(json, Map.class);
    }
}
