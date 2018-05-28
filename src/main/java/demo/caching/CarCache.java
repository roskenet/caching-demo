package demo.caching;

public interface CarCache {

    String getCar(String name);

    int getTimesCalled();
}
