import java.util.ArrayList;
import MusicInstrument.*;
import MusicInstrument.Brass.*;
import MusicInstrument.Percussion.*;
import MusicInstrument.Strings.*;
import java.util.List;
import java.util.Arrays;

public class TestShopManager {
    private static ArrayList<MusicInstrument> getTestList() {
        ArrayList<MusicInstrument> ret = new ArrayList<MusicInstrument>(Arrays.asList(
            new Horn("H-284", "Sony", 7.95, 3.7, false, 'C'),
            new Trumpet("T-624", "Trumpy", 44.65, 2.7, true, "style-1"),
            new Cymbal("C-435", "Sara", 21.95, 2.8, 440),
            new Drum("D-342", "Sony", 31.4, 23.1, 5),
            new Guitar("G-512", "Infinite", 220.0, 6.8, 6, "style-a"),
            new Violin("V-942", "Sara", 572, 3.1, 4, "hourse")
        ));
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

    public static boolean TestFindMusicInstrumentForBand() {
        ArrayList<MusicInstrument> testList = getTestList();
        MusicShopManager manager = new MusicShopManager();
        
        var ret1 = manager.FindMusicInstrumentForBand(testList);
        ArrayList<MusicInstrument> exp1 = new ArrayList<MusicInstrument>(Arrays.asList(
            new Trumpet("T-624", "Trumpy", 44.65, 2.7, true, "style-1"),
            new Drum("D-342", "Sony", 31.4, 23.1, 5),
            new Guitar("G-512", "Infinite", 220.0, 6.8, 6, "style-a")
        ));

        return ret1.equals(exp1);
    }

    public static boolean TestSortCode() {
        ArrayList<MusicInstrument> testList = getTestList();
        MusicShopManager manager = new MusicShopManager();
        
        var ret1 = manager.SortCode(testList, false);
        ArrayList<MusicInstrument> exp1 = new ArrayList<MusicInstrument>(Arrays.asList(
            new Cymbal("C-435", "Sara", 21.95, 2.8, 440),
            new Drum("D-342", "Sony", 31.4, 23.1, 5),
            new Guitar("G-512", "Infinite", 220.0, 6.8, 6, "style-a"),
            new Horn("H-284", "Sony", 7.95, 3.7, false, 'C'),
            new Trumpet("T-624", "Trumpy", 44.65, 2.7, true, "style-1"),
            new Violin("V-942", "Sara", 572, 3.1, 4, "hourse")
        ));

        return ret1.equals(exp1);
    }

    public static boolean TestSortProducer() {
        ArrayList<MusicInstrument> testList = getTestList();
        MusicShopManager manager = new MusicShopManager();
        
        var ret1 = manager.SortProducer(testList, true);
        ArrayList<MusicInstrument> exp1 = new ArrayList<MusicInstrument>(Arrays.asList(
            new Trumpet("T-624", "Trumpy", 44.65, 2.7, true, "style-1"),
            new Drum("D-342", "Sony", 31.4, 23.1, 5),
            new Horn("H-284", "Sony", 7.95, 3.7, false, 'C'),
            new Violin("V-942", "Sara", 572, 3.1, 4, "hourse"),
            new Cymbal("C-435", "Sara", 21.95, 2.8, 440),
            new Guitar("G-512", "Infinite", 220.0, 6.8, 6, "style-a")
        ));

        return ret1.equals(exp1);
    }

    public static boolean TestSortPrice() {
        ArrayList<MusicInstrument> testList = getTestList();
        MusicShopManager manager = new MusicShopManager();
        
        var ret1 = manager.sortByPrice(testList, true);
        ArrayList<MusicInstrument> exp1 = new ArrayList<MusicInstrument>(Arrays.asList(
            new Violin("V-942", "Sara", 572, 3.1, 4, "hourse"),
            new Guitar("G-512", "Infinite", 220.0, 6.8, 6, "style-a"),
            new Trumpet("T-624", "Trumpy", 44.65, 2.7, true, "style-1"),
            new Drum("D-342", "Sony", 31.4, 23.1, 5),
            new Cymbal("C-435", "Sara", 21.95, 2.8, 440),
            new Horn("H-284", "Sony", 7.95, 3.7, false, 'C')
        ));

        return ret1.equals(exp1);
    }    

    public static boolean TestSortWeight() {
        ArrayList<MusicInstrument> testList = getTestList();
        MusicShopManager manager = new MusicShopManager();
        
        var ret1 = manager.sortByWeight(testList, false);
        ArrayList<MusicInstrument> exp1 = new ArrayList<MusicInstrument>(Arrays.asList(
            new Trumpet("T-624", "Trumpy", 44.65, 2.7, true, "style-1"),
            new Cymbal("C-435", "Sara", 21.95, 2.8, 440),
            new Violin("V-942", "Sara", 572, 3.1, 4, "hourse"),
            new Horn("H-284", "Sony", 7.95, 3.7, false, 'C'),
            new Guitar("G-512", "Infinite", 220.0, 6.8, 6, "style-a"),
            new Drum("D-342", "Sony", 31.4, 23.1, 5)
        ));

        return ret1.equals(exp1);
    }

    public static void main(String[] args) {
        System.out.println(TestFindMusicInstrumentByType());
        System.out.println(TestFindMusicInstrumentForBand());
        System.out.println(TestSortCode());
        System.out.println(TestSortProducer());
        System.out.println(TestSortPrice());
        System.out.println(TestSortWeight());
    }
}
