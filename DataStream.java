
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataStream implements Iterator {
    private int position = 0;
    private int size = 5;

    public static Iterator stream(String foo, String bar){
        return new DataStream();
    }

    @Override
    public boolean hasNext() {
        position++;
        return (position < size);
    }

    @Override
    public Row next() {
        return new Row("row");
    }

    @Override
    public void remove() {
    }

}
