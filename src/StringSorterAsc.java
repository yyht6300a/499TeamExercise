import java.util.ArrayList;

public class StringSorterAsc {


        public static void ContentSortAsc(ArrayList<Msg> list) {

            for (int i = 0; i < list.size(); i++) {
                int idxMin = i;
                for (int scan = i + 1; scan < list.size(); scan++) {
                    if ((byte)list.get(idxMin).getContent().charAt(0)-(byte)(list.get(scan).getContent().charAt(0)) > 0) {
                        idxMin = scan;
                    }
                    else if((byte)list.get(idxMin).getContent().charAt(0)-(byte)(list.get(scan).getContent().charAt(0)) == 0){
                            if ((byte)list.get(idxMin).getContent().charAt(1)-(byte)(list.get(scan).getContent().charAt(1)) > 0) {
                                    idxMin = scan;
                            }
                    }
                    else if((byte)list.get(idxMin).getContent().charAt(1)-(byte)(list.get(scan).getContent().charAt(1)) == 0){
                            if ((byte)list.get(idxMin).getContent().charAt(2)-(byte)(list.get(scan).getContent().charAt(2)) > 0) {
                                    idxMin = scan;
                            }
                    }
                    
                    Msg a = list.get(i);
                    list.set(i, list.get(idxMin));
                    list.set(idxMin, a);
                }
            }
        }
}

