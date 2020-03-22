package com.karl.concurrent.chapter03;

/**
 * 描述:  门
 *
 * @author karl
 * @create 2020-03-06 20:17
 */
public class Gate {

    /**
     * 通过门的时候需要记录
     * 通过这个门的总人数
     * 人员的名字
     * 人员的地址
     */

    private int counter = 0;
    private String name = "Nobody";
    private String address = "Nowhere";


    /**
     * 通过门的一个方法
     *
     * @param name    名字
     * @param address 地址
     */
    public void pass(String name, String address) {
        this.address = address;
        this.name = name;
        ++counter;
        verify();
    }

    /**
     * 检查人员是否正常
     */
    private void verify() {


    }


}