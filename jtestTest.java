import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class jtestTest {

    jtest ben =new jtest("ben",6,true);
    @Test
    public void ewals() throws Exception {
        assertEquals("ben",ben.getPerson());

    }

    @Test
    public void equals() throws Exception {
        assertNotEquals(7,ben.getAge());
    }

    @Test
    public void notnull() throws Exception {
        assertNotNull(ben.getAge());
    }

    @Test
    public void same() throws Exception {
        assertSame(true,ben.isSame_i_am());

    }

    @Test
    public void that() throws Exception {
        assertThat(ben.getAge(),is(notNullValue()));
    }


}

