package edu.hawaii.its.api.access;

public interface UserContextService {
    public abstract User getCurrentUser();

    public abstract String getCurrentUsername();

    public abstract String getCurrentUhuuid();

    public void setCurrentUhuuid(String uhuuid);
}