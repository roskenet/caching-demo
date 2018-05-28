package demo.caching;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CachingDemoApplicationTests {

    @Autowired
    private CarCache carCache;

    @Test
    public void checkCache() {

        // We call carCache multiple times... It should print only two LOG lines!

        String firstResult = carCache.getCar("BMW");
        String secondResult = carCache.getCar("BMW");
        String thirdResult = carCache.getCar("BMW");
        
        String fourthResult = carCache.getCar("Mercedes");
        String fifthResult = carCache.getCar("Mercedes");

        // Of course it should be the same:
        assertThat(firstResult, is(secondResult));
        assertThat(secondResult, is(thirdResult));
        
        assertThat(fourthResult, is(fifthResult));

        // but the code in the method got only called twice!!!
        assertThat(carCache.getTimesCalledInternally(), is(2));

    }

}
