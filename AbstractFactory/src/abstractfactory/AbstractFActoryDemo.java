/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author fa16-bse-141
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractFactory abs=FactoryProducer.getFactory("Shape");
        Shape s1=abs.getShape("Circle");
        s1.draw();
        
        Shape s2=abs.getShape("Square");
        s2.draw();
        
        Shape s3=abs.getShape("Rectangle");
        s3.draw();
        AbstractFactory abs1=FactoryProducer.getFactory("Color");
        Color c1=abs1.getColor("Red");
        c1.fill();
        
        Color c2=abs1.getColor("Green");
        c2.fill();
        
        Color c3=abs1.getColor("Blue");
        c3.fill();
        
        
    }
    
}
