package com.sky.context;
/**
 * Context Holder using the strategy pattern
 */
public class BaseContext {

    //1. Default to our ThreadLocal implementation
    private static UserContextStrategy strategy = new ThreadLocalUserContextStrategy();

    //2. Allow swapping the strategy at runtime
    public static void setStrategy(UserContextStrategy customStrategy) throws IllegalAccessException {
        if (customStrategy == null) {
            throw new IllegalAccessException("Strategy cannot be null");
        }
        BaseContext.strategy = customStrategy;
    }

    public static void setCurrentId(Long id) {
        strategy.setCurrentId(id);
    }

    public static Long getCurrentId() {
        return strategy.getCurrentId();
    }

    public static void removeCurrentId() {
        strategy.removeCurrentId();
    }

}
