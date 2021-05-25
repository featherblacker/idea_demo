/*
 * Copyright (c) 2021
 * @Author: Qiguang Chu
 * @Email: chuqiguang@sina.com
 * @LastModified:2021-05-26T05:32
 */

public class ComputeFactory {

    private static final Add add = new Add();
    private static final Minus minus = new Minus();

    public static Computable getCompute(char symbol) {
        switch (symbol) {
            case '+':
                return add;
            case '-':
                return minus;
            default:
                throw new IllegalArgumentException();
        }
    }
}
