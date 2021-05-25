/*
 * Copyright (c) 2021
 * @Author: Qiguang Chu
 * @Email: chuqiguang@sina.com
 * @LastModified:2021-05-26T05:32
 */

public class ComputeFactory {

    private static final Add add = new Add();
    private static final Minus minus = new Minus();

    public static Computable getCompute(String symbol) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return (Computable) Class.forName(symbol).newInstance();
    }
}
