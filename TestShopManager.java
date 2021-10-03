import java.util.ArrayList;
import MusicInstrument.*;
import MusicInstrument.Brass.*;
import MusicInstrument.Percussion.*;
import MusicInstrument.Strings.*;
import java.util.List;
import java.util.Arrays;

public class TestShopManager {
    private static ArrayList<MusicInstrument> getTestList() {
        ArrayList<MusicInstrument> ret = new ArrayList<MusicInstrument>();
        ret.add(new Horn("H-284", "Sony", 7.95, 3.7, false, 'C'));
        ret.add(new Trumpet("T-624", "Trumpy", 44.65, 2.7, true, "style-1"));
        ret.add(new Cymbal("C-435", "Sara", 21.95, 2.8, 440));
        ret.add(new Drum("D-342", "Sony", 31.4, 23.1, 5));
        ret.add(new Guitar("G-512", "Infinite", 220.0, 6.8, 6, "style-a"));
        ret.add(new Violin("V-942", "Sara", 572, 3.1, 4, "hourse"));
        return ret;
    }

    private static void print(List<?> list) {
        for (var el : list) {
            System.out.println(el);
        }
    }

    public static boolean TestFindMusicInstrumentByType() {
        ArrayList<MusicInstrument> testList = getTestList();
        MusicShopManager manager = new MusicShopManager();
        
        var ret1 = manager.FindMusicInstrumentByType(testList, StringsInstrument.class);
        ArrayList<MusicInstrument> exp1 = new ArrayList<MusicInstrument>(Arrays.asList(
            new Guitar("G-512", "Infinite", 220.0, 6.8, 6, "style-a"),
            new Violin("V-942", "Sara", 572, 3.1, 4, "hourse")
        ));

        return ret1.equals(exp1);
    }

    public static void main(String[] args) {
        System.out.println(TestFindMusicInstrumentByType());
    }
}
