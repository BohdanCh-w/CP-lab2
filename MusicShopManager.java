import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;

public class MusicShopManager {

    
    public ArrayList<MusicInstrument> findMusicInstrumentByType(ArrayList<MusicInstrument> instruments, MusicInstrument.instrumentType type) {
        ArrayList<MusicInstrument> ret = new ArrayList<MusicInstrument>();
        for (MusicInstrument instrument : instruments) {
            switch (type) {
                case BRASS:
                    if (instrument instanceof BrassInstrument) {
                        ret.add(instrument);
                    }
                    break;
                case STRINGS:
                    if (instrument instanceof StringsInstrument) {
                        ret.add(instrument);
                    }
                    break;
                case PERCUSSION:
                    if (instrument instanceof PercussionInstrument) {
                        ret.add(instrument);
                    }
                    break;
            
                default:
                    break;
            }
        }
        return ret;
    }

    public ArrayList<MusicInstrument> FindMusicInstrumentByType(ArrayList<MusicInstrument> instruments, Class<?> cls) {
        ArrayList<MusicInstrument> ret = new ArrayList<MusicInstrument>();
        for (MusicInstrument instrument : instruments) {
            if (instrument.getClass().isAssignableFrom(cls)) {
                ret.add(instrument);
            }
        }
        return ret;
    }

    public ArrayList<MusicInstrument> FindMusicInstrumentForBand(ArrayList<MusicInstrument> instruments) {
        ArrayList<MusicInstrument> ret = new ArrayList<MusicInstrument>();
        ArrayList<Class <?>> band = new ArrayList<Class<?>>(
            Arrays.asList(Guitar.class, Drum.class, Trumpet.class)
        );

        for (MusicInstrument instrument : instruments) {
            if(band.contains(instrument.getClass())) {
                ret.add(instrument);
            }
        }
        return ret;
    }

    public static class CodeComparator implements Comparator<MusicInstrument> {
        @Override
        public int compare(MusicInstrument a, MusicInstrument b) {
            return a.getCode().compareTo(b.getCode());
        }
    }

    public class ProducerComparator implements Comparator<MusicInstrument> {
        @Override
        public int compare(MusicInstrument a, MusicInstrument b) {
            return a.getProduser().compareTo(b.getProduser());
        }
    }

    public ArrayList<MusicInstrument> SortCode(ArrayList<MusicInstrument> instruments, boolean reverse) {
        ArrayList<MusicInstrument> ret = new ArrayList<MusicInstrument>(instruments);
        ret.sort(new CodeComparator());
        if (reverse) {
            Collections.reverse(ret);
        }
        return ret;
    }    

    public ArrayList<MusicInstrument> SortProducer(ArrayList<MusicInstrument> instruments, boolean reverse) {
        ArrayList<MusicInstrument> ret = new ArrayList<MusicInstrument>(instruments);
        ret.sort(new ProducerComparator());
        if (reverse) {
            Collections.reverse(ret);
        }
        return ret;
    }

    public ArrayList<MusicInstrument> sortByPrice(ArrayList<MusicInstrument> list, boolean reverse) {
        ArrayList<MusicInstrument> copy = new ArrayList<MusicInstrument>(list);
        copy.sort(new Comparator<>() {
            @Override
            public int compare(MusicInstrument a, MusicInstrument b) {
                int res = Float.compare(a.getPrice(), b.getPrice());
                return reverse ? -res : res;
            }
        });
        return copy;
    }

    public ArrayList<MusicInstrument> sortByWeight(ArrayList<MusicInstrument> list, boolean reverse) {
        ArrayList<MusicInstrument> copy = new ArrayList<MusicInstrument>(list);
        copy.sort((a, b) -> {
            int res = Float.compare(a.getWeight(), b.getWeight());
            return reverse ? -res : res;
        });
        return copy;
    }
}