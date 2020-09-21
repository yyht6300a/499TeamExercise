import java.util.ArrayList;

public class StringSorterAsc {


        public static void ContentSortAsc(ArrayList<Msg> list) {
            int q=0;
            for (int i = 0; i < list.size(); i++) {
                int idxMin = i;
                for (int scan = i + 1; scan < list.size(); scan++) {

                    if (list.get(idxMin).getContent().compareTo(list.get(scan).getContent() )>0){
                        idxMin = scan;
                    }


                    Msg a = list.get(i);
                    list.set(i, list.get(idxMin));
                    list.set(idxMin, a);
                }
            }
        }
}

