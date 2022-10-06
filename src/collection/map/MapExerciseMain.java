package collection.map;

import java.util.Map;

public class MapExerciseMain {
    public static void main(String[] args) {
        MapExercise mapExercise = new MapExercise();

        mapExercise.setMap();

        for (Map.Entry mp : mapExercise.getMap().entrySet()) {
            System.out.println(mp.getKey() + " " + mp.getValue());
        }
    }
}
