package fr.fanto.monsterindustries.gsonUtils;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.io.IOException;

public class LocationTypeAdapter extends TypeAdapter<Location> {

    private MapSerializationManager mapManager;



    @Override
    public void write(JsonWriter writer, Location location) throws IOException {
        writer.beginObject();
        writer.name("world").value(location.getWorld().getName());
        writer.name("x").value(location.getX());
        writer.name("y").value(location.getY());
        writer.name("z").value(location.getZ());
        writer.name("yaw").value(location.getYaw());
        writer.name("pitch").value(location.getPitch());
        writer.endObject();
    }

    @Override
    public Location read(JsonReader reader) throws IOException {
        reader.beginObject();
        String name = "ERROR";
        double x = -1;
        double y = -1;
        double z = -1;
        float yaw = -1;
        float pitch = -1;


        while (reader.hasNext()) {
            switch (reader.nextName()) {
                case "world":
                    name = reader.nextString();
                    break;
                case "x":
                    x = reader.nextDouble();
                    break;
                case "y":
                    y = reader.nextDouble();
                    break;
                case "z":
                    z = reader.nextDouble();
                    break;
                case "yaw":
                    yaw = (float) reader.nextDouble();
                    break;
                case "pitch":
                    pitch = (float) reader.nextDouble();
                    break;
                default:
                    reader.skipValue();
                    break;

            }
        }
        reader.endObject();

        return new Location(Bukkit.getWorld(name), x, y, z, yaw, pitch);
    }
}
