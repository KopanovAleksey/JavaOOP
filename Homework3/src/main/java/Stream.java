import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream  implements Iterable<StudentGroup>,Comparable<Stream> {
    List<StudentGroup> stream = new ArrayList<>();

    public Stream (){
        stream = new ArrayList<>();
    }

    public Stream (ArrayList<StudentGroup> stream){
        this.stream = stream;
    }

    public List<StudentGroup> getStream() {
        return stream;
    }

    public void setStream(List<StudentGroup> stream) {
        this.stream = stream;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(stream) ;
    }


    @Override
    public int compareTo(Stream o) {
        if (!o.getStream().getClass().equals(this.stream.getClass()))return 0;
        if (o.getStream().size() != this.stream.size()) return 0;
//        for (int i = 0; i < (o.getStream().size()); i++){
//            if (!(o.getStream().get(i).equals(this.stream.get(i)))) return 0;
//        }
        return 1;
    }
}
