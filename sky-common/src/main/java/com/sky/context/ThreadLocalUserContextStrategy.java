package com.sky.context;

/**
 * ThreadLocal-based implementation of the UserContextStrategy interface.
 */
public class ThreadLocalUserContextStrategy implements UserContextStrategy {

    //Safely encapsulate, outside class cannot access this object directly
    private static final ThreadLocal<Long> threadLocal = new ThreadLocal<>();
    @Override
    public void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    @Override
    public Long getCurrentId() {
        return threadLocal.get();
    }

    @Override
    public void removeCurrentId() {
        threadLocal.remove();
    }
}
