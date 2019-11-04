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
public class FactoryProducer {
    public static AbstractFactory getFactory(String Choice){
    if(Choice.equalsIgnoreCase("Shape")){
    return new ShapeFactory();
    }
    else if(Choice.equalsIgnoreCase("Color")){
    return new ColorFactory();
    }
    return null;
    
    
    }
}
