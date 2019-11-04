/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorydemo;

/**
 *
 * @author fa16-bse-141
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String ShapeType){
    if(ShapeType.equalsIgnoreCase("Circle")){
    return new Circle();
    }else if(ShapeType.equalsIgnoreCase("Square")){
    
    return new Square();}
    else if(ShapeType.equalsIgnoreCase("Rectangle")){
    return new Rectangle();
    }
    else return null;
    }
    @Override
    public Color getColor(String ColorType){
    return null;
    }
}
