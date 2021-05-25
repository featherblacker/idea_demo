/*
 * Copyright (c) 2021
 * @Author: Qiguang Chu
 * @Email: chuqiguang@sina.com
 * @LastModified:2021-05-25T21:21
 */

public class Calculator {
    public int compute(int num1, int num2, char c) {
        Computable compute = ComputeFactory.getCompute(c);
        return compute.compute(num1, num2);
    }
}
