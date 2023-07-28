import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator {
    private final List<StudentGroup> stream;
    private Integer counter;

    public StreamIterator(List<StudentGroup> stream) {
        this.stream = stream;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return this.counter<stream.size();
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) return null;
        counter++;
        return stream.get(counter);
    }
}
