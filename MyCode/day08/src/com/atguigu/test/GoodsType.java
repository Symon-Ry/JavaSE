package com.atguigu.test;

/**
 * @author Symon
 * @version 1.0
 * @className GoodsType
 * @description TODO
 * @date 2020/7/31 8:50
 */
public class GoodsType {
    int typeId;
    String typeName;
    int typeLevel;

    public GoodsType(int typeId, String typeName, int typeLevel) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typeLevel = typeLevel;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", typeLevel='" + typeLevel + '\'' +
                '}';
    }
}
