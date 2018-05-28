package demo.caching;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CarCacheImpl implements CarCache {
    private static final Logger LOG = LoggerFactory.getLogger(CarCache.class);
   
    // This is to show, that the value is only incremented one time!
    private int timesCalled;
    
    @Override
    @Cacheable("carCache")
    public String getCarInLowercase(String name) {

        // Here we call 42 different microservices and databases!
        // For the difficult task to translate the name to lowercase.
        
        LOG.info("Call to external Service!");
        timesCalled++;
        
        return name.toLowerCase(Locale.GERMANY);
    }

    @Override
    public int getTimesCalledInternally() {
        return timesCalled;
    }
}
