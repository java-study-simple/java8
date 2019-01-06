import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void add() {
        // given
       Calculator calculator = new Calculator();

       // when
       int result = calculator.add(1,2);

       // then
        assertThat(result).isEqualTo(3);

    }


    @Test
    public void join() {
        String[] values = new String[]{"1","2"};


        String result = String.join(",", values);
        assertThat(result).isEqualTo("1");
    }

}