import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> courses = new LinkedHashMap<>();

        String[] data = scanner.nextLine().split(" : ");
        while(!data[0].equals("end")) {
            String module = data[0];
            String name = data[1];
            if(courses.containsKey(module)) {
                courses.get(module).add(name);
            }else {
                courses.put(module,new ArrayList<>());
                courses.get(module).add(name);
            }
            data = scanner.nextLine().split(" : ");
        }
        for (int i = 0; i < courses.size() ; i++) {
            System.out.printf("%s: %d%n",courses,courses.size());
            courses.forEach((key,value) -> System.out.printf("-- %s",value));
            }
        }
    }