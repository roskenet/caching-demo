package demo.caching;

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
    public String getCar(String name) {

        // Here we call 42 different microservices and databases!
        
        LOG.info("Call to external Service!");
        timesCalled++;
        
        return name;
    }

    @Override
    public int getTimesCalled() {
        return timesCalled;
    }
}
