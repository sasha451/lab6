import java.util.List;

public class Extractor {
    public int getValueAtPosEndMinusOffset(List<Integer> list,int offset)throws IndexOutOfBoundsException{
        return list.get(list.size()-offset-1);
    }
}
