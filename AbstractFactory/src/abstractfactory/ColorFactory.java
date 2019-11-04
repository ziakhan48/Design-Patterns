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
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String ColorT){
    if(ColorT.equalsIgnoreCase("Red")){
    return new Red();
    }
    else if(ColorT.equalsIgnoreCase("Green")){
    return new Green();
    }
    else if(ColorT.equalsIgnoreCase("Blue")){
    return new Blue();
    }
    else return null;
    }
    @Override
    public Shape getShape(String ColorType){
    return null;
    }
}
