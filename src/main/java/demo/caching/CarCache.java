package demo.caching;

public interface CarCache {

    String getCarInLowercase(String name);

    int getTimesCalledInternally();
}
