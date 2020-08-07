package com.atguigu.day12morningtest;

/**
 * @author Symon
 */

public enum PlayState {
    PLAYING(1),   STOP(2),   PAUSE(3);

    private int value;

    PlayState(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PlayState{" +
                "value=" + value +
                '}';
    }
}
