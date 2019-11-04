/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naomii
 */
public class MovableAdapterImpl implements MovableAdapter {
    private Movable luxuryCars;
     
    public MovableAdapterImpl(Movable moveable){
        luxuryCars=moveable;
    }
    // standard constructors
 
    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }
     
    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
    
}

