import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.*;


public class ListTests implements StringChecker{
    public boolean checkString(String s){
        if(s.equals("er")){
            return true;
        }
        return false;
    }

    @Test
    public void testfilter() {
        List<String> input = new ArrayList<String>();
        StringChecker sc = new StringChecker() {
            checkString(String s);
        };
        input.add("Lammer");
        input.add("what");
        List<String> expected = new ArrayList<String>();
        expected.add("Lammer");
        List<String> output = ListExamples.filter(input, sc);
        org.hamcrest.MatcherAssert.assertThat(output, is(expected));
    }
}
