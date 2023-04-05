package collection;
import java.util.ArrayList;
import java.util.List;
public class ColectiaMea {
public ColectiaMea() {
    boolean automobilPrezent;
    List<String> bmw = new ArrayList<>();
    bmw.add("7 Series");
    bmw.add("5 Series");
    bmw.add("3 Series");
    bmw.remove("3 Series");

    if (bmw.contains("3 Series")) {
        automobilPrezent = true;
    } else {
        automobilPrezent = false;
    }


    System.out.println(automobilPrezent);


    }
}
