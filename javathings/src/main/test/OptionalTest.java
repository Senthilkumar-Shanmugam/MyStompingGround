
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

//@RunWith()
public class OptionalTest {

    @Test (expected = NoSuchElementException.class)
    public void WhenCreateEmptyOptional_thenNoSuchElementException() {
        Optional<String> emptyOpt = Optional.empty();
        emptyOpt.get();
    }

    @Test(expected = NullPointerException.class)
    public void whenCreateOfEmptyOptional_thenNullPointerException() {
        Optional<String> opt = Optional.of(null);
    }

    @Test
    public void whenCreateOfNullableOptional_thenOk(){
        String name = "John";
        Optional<String> opt = Optional.ofNullable(name);

        assertEquals("John", opt.get());
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenOrElseThrowWorks_thenCorrect(){
        String nameVal = null;

        //String name = Optional.ofNullable(nameVal).orElse("default");
        //String name = Optional.ofNullable(nameVal).orElseGet( ()-> "defaulu1");
        String name = Optional.ofNullable(nameVal).orElseThrow(IllegalArgumentException::new);
    }

    @Test
    public void givenOptional_whenMapWorks_thenCorrect() {
        List<String> cNames = Arrays.asList("Oracle","Polaris","Accenture","Microsoft");

        Optional<List<String>> namesOpt = Optional.of(cNames);

         int size = namesOpt.map(List::size)
                            .orElse(0);
         assertEquals(4,size);
    }

    @Test
    public void givenOptional_whenMapWorksWithFilter_thenCorrect() {

    }
}
