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
public abstract class AbstractFactory {
   abstract public Shape getShape(String ShapeType);
   abstract public Color getColor(String ColorType);
}
