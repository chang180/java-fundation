package com.neweb.chapter13.unit60;

import java.util.ArrayList;
import java.util.List;

public interface DataHelp {
    default List<String[]> getData() {
        List<String[]> dataList = new ArrayList<String[]>();
        String[] row1 = new String[] {"1", "Kevin", "50"};
        String[] row2 = new String[] {"2", "Mary", "60"};
        String[] row3 = new String[] {"3", "John", "70"};
        dataList.add(row1);
        dataList.add(row2);
        dataList.add(row3);

        return dataList;
    }
}
