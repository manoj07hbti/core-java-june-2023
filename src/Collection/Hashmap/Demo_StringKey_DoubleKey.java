package Collection.Hashmap;

import java.util.HashMap;
import java.util.List;

public class Demo_StringKey_DoubleKey {

    public void CreateList(){

        HashMap<String,Double>map=new HashMap<>();
        map.put("employee Sunil salary",879.09);
        map.put("employee Aman salary",8765.90);
        map.put("employee Garv salary",342.98);
        map.put("employee Jack salary",4324.8);
        map.put("employee Jill salary",32123.76);
        map.put("employee Ashok salary",8765.98);
        map.put("employee Suraj salary",66545.90);
        map.put("employee Gourav salary",7654.9);
        map.put("employee Dev salary",8870.65);
        map.put("employee Vaibhav salary",8797.09);

        System.out.println("employee salary with name:"+map);

        System.out.println(map.get("employee Sunil salary"));
        System.out.println(map.get("employee Aman salary"));
        System.out.println(map.get("employee Garv salary"));
        System.out.println(map.get("employee Jack salary"));
        System.out.println(map.get("employee Jill salary"));
        System.out.println(map.get("employee Ashok salary"));
        System.out.println(map.get("employee Suraj salary"));
        System.out.println(map.get("employee Gourav salary"));
        System.out.println(map.get("employee Dev salary"));
        System.out.println(map.get("employee Vaibhav salary"));

    }

    public static void main(String[] args) {
        Demo_StringKey_DoubleKey obj=new Demo_StringKey_DoubleKey();
        obj.CreateList();
    }






    }

