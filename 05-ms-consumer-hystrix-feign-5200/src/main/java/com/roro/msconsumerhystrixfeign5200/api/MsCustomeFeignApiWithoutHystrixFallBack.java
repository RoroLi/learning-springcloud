package com.roro.msconsumerhystrixfeign5200.api;

/**
 */
public class MsCustomeFeignApiWithoutHystrixFallBack implements MsCustomeFeignApiWithoutHystrix{



    @Override
    public String call(String userId) {
        System.out.println("MsCustomeFeignApiWithoutHystrix里配置了MsCustomeFeignApiWithoutHystrixConfg");
        System.out.println("表示局部关闭了MsCustomeFeignApiWithoutHystrix的服务降级");
        System.out.println("所以调用MsCustomeFeignApiWithoutHystrix不会触发com.roro.msconsumerhystrixfeign5200.api.MsCustomeFeignApiWithoutHystrixFallBack.call");
        return "com.roro.msconsumerhystrixfeign5200.api.MsCustomeFeignApiWithoutHystrixFallBack.call";
    }
}
