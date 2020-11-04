package com.airbnb.lottie.utils;

public class MeanCalculator {
    private int n;
    private float sum;

    public void add(float f2) {
        float f3 = this.sum + f2;
        this.sum = f3;
        int i = this.n + 1;
        this.n = i;
        if (i == Integer.MAX_VALUE) {
            this.sum = f3 / 2.0f;
            this.n = i / 2;
        }
    }

    public float getMean() {
        int i = this.n;
        if (i == 0) {
            return 0.0f;
        }
        return this.sum / ((float) i);
    }
}
