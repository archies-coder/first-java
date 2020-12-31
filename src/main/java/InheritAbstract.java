import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;

public class InheritAbstract extends Member {
    @Override
    void doSomething() {
        System.out.println("Abstract Implemented");
    }

    @Override
    boolean isPresent() {
        return false;
    }

    @Override
    String[] getRights() {
        String[] Arr = new String[]{"DELETE", "APPEND"};
        int len = Arr.length;
        Boolean isEmpty = ArrayUtils.isEmpty(Arr);

        ArrayList<String> arr = new ArrayList<String>(len);

        for (int i = 0; i < len; i++) {
            arr.add(Arr[i]);
        }
        arr.add("new Element");
        String[] newArr = new String[arr.size()];
        newArr = arr.toArray(newArr);


        return newArr;
    }

    private enum AVAILABLE_RIGHTS {CREATE, READ, APPEND, DELETE}
}

