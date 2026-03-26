package com.sky.context;

/**
 * Strategy interface for managing the current user's ID
 */
public interface UserContextStrategy {

    void setCurrentId(Long id);

    Long getCurrentId();

    void removeCurrentId();
}
