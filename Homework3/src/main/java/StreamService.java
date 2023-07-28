import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    private List<Stream> streams;
    public StreamService(){
        streams = new ArrayList<>();
    }

    public StreamService(List<Stream> streams){
        this.streams = streams;
    }

    public List<Stream> getStreams() {
        return streams;
    }

    public void setStreams(List<Stream> streams) {
        this.streams = streams;
    }

    public List<Stream> streamSort(){
        List<Stream> newStreams = new ArrayList<>(streams);
        Collections.sort(streams);
        return newStreams;
    }
}
