import java.util.*;

public class Proses {

    private static List<Mhs> listData = new LinkedList<Mhs>();

    public static void addData(Mhs data) {
        listData.add(data);
    }

    public static void editData(Mhs data, int idx) {
        listData.set(idx, data);
    }

    public static void removeData(int idx) {
        listData.remove(idx);
    }

    public static List<Mhs> getListData() {
        return listData;
    }

}