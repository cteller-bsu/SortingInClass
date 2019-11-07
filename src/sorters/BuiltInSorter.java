package sorters;

import java.util.Collections;
import java.util.List;

public class BuiltInSorter implements NumberSorter {
    @Override
    public void sort(List<Integer> items) {
        Collections.sort(items);
    }
}