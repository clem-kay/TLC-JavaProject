package com.clem;

public interface HasLevel {
    public enum Level {
        FIRST,SECOND,THIRD,FOURTH;
    }
    public Level getlevel();
}
