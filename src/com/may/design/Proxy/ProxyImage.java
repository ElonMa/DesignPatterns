package com.may.design.Proxy;

/**
 * 为其他对象提供一种代理以控制对这个对象的访问。
 */
public class ProxyImage  implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }


}
