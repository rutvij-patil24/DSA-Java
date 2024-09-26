// Here is a list of commonly used functions in Java's HashMap, 
// along with an example involving Formula 1 drivers and teams:

// 1. put(K key, V value): Inserts a key-value pair into the HashMap.
// Key: The driver’s name.
// Value: The team.
// 2. get(Object key): Returns the value (team) associated with the specified key (driver).
// 3. remove(Object key): Removes the key-value pair with the specified key from the HashMap.
// 4. containsKey(Object key): Checks if the HashMap contains the specified key.
// 5. containsValue(Object value): Checks if the HashMap contains the specified value.
// 6. keySet(): Returns a Set view of the keys (drivers).
// 7. values(): Returns a Collection view of the values (teams).
// 8. entrySet(): Returns a Set view of the key-value pairs (driver-team pairs).
// 9. size(): Returns the number of key-value pairs in the HashMap.
// 10. clear(): Removes all key-value pairs from the HashMap.


import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry;

public class hashMapExample {
    public static void main(String[] args) {
        // Create a HashMap where driver names are keys and team names are values
        HashMap<String, String> driversAndTeams = new HashMap<>();
        
        // 1. put(): Add some drivers and their teams
        driversAndTeams.put("Lewis Hamilton", "Mercedes");
        driversAndTeams.put("Max Verstappen", "Red Bull");
        driversAndTeams.put("Charles Leclerc", "Ferrari");
        driversAndTeams.put("Lando Norris", "McLaren");
        
        // 2. get(): Get a driver’s team
        System.out.println("Lewis Hamilton's team: " + driversAndTeams.get("Lewis Hamilton"));  // Output: Mercedes
        
        // 3. remove(): Remove a driver from the map
        driversAndTeams.remove("Lando Norris");
        System.out.println("After removing Lando Norris: " + driversAndTeams);
        
        // 4. containsKey(): Check if a driver exists
        System.out.println("Is Max Verstappen in the map? " + driversAndTeams.containsKey("Max Verstappen"));  // Output: true
        
        // 5. containsValue(): Check if a team exists
        System.out.println("Does Ferrari have a driver? " + driversAndTeams.containsValue("Ferrari"));  // Output: true
        
        // 6. keySet(): Get all driver names
        Set<String> drivers = driversAndTeams.keySet();
        System.out.println("Drivers: " + drivers);
        
        // 7. values(): Get all team names
        Collection<String> teams = driversAndTeams.values();
        System.out.println("Teams: " + teams);
        
        // 8. entrySet(): Get all key-value pairs (drivers and teams)
        Set<Entry<String, String>> entries = driversAndTeams.entrySet();
        System.out.println("Driver-Team pairs: " + entries);
        
        // 9. size(): Get the number of entries
        System.out.println("Number of drivers: " + driversAndTeams.size());
        
        // 10. clear(): Remove all entries
        driversAndTeams.clear();
        System.out.println("After clearing: " + driversAndTeams);  // Output: {}
    }
}
