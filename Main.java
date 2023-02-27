
    
import java.util.*; 
 importjava.util.Map.Entry; 
  
 class Main { 
     public static void main(String[] args) { 
         Scanner sc = new Scanner(System.in); 
         Random r = new Random(); 
         int count[] = { 0, 0, 0, 0, 0 }; 
         String teams[] = { "team1", "team2", "team3", "team4", "team5" }; 
         for (int i = 0; i < teams.length; i++) { 
             System.out.println("day " + (i + 1) + " Matches"); 
             for (int j = 0; j < teams.length / 2; j++) { 
                 int t1 = (i + j) % (teams.length - 1); 
                 int t2 = (teams.length - 1 - j + i) % (teams.length - 1); 
                 if (j == 0) { 
                     t2 = teams.length - 1; 
                 } 
                 System.out.println(teams[t1] + " VS " + teams[t2]); 
                 System.out.println("Enter 0 if team " + teams[i] + " won else 1"); 
                 int n = r.nextInt(2); 
                 if (n == 0) { 
                     count[i] = count[i] + 1; 
                     System.out.println(teams[i] + " won"); 
                 } else { 
                     count[j] = count[j] + 1; 
                     System.out.println(teams[j] + " won"); 
                 } 
  
             } 
         } 
         for (int i = 0; i <= 4; i++) { 
             System.out.println(teams[i] + " won " + count[i] + " matches"); 
         } 
         HashMap<String, Integer> semi = new HashMap<>(); 
         for (int i = 0; i <= 4; i++) { 
             semi.put(teams[i], count[i]); 
         } 
         System.out.println(semi); 
         ArrayList<Integer> list = new ArrayList<>(); 
  
         LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>(); 
  
         for (Map.Entry<String, Integer> entry : semi.entrySet()) { 
             list.add(entry.getValue()); 
         } 
         Collections.sort(list); 
         for (int num : list) { 
             for (Entry<String, Integer> entry : semi.entrySet()) { 
                 if (entry.getValue().equals(num)) { 
                     sortedMap.put(entry.getKey(), num); 
                 } 
             } 
         } 
         System.out.println(sortedMap); 
         System.out.println(sortedMap.entrySet()); 
         Set<Entry<String, Integer>> sam = sortedMap.entrySet(); 
         System.out.println(sam.toArray()[3] + " VS " + sam.toArray()[4]); 
  
     } 
 }
