
import static org.junit.Assert.assertEquals;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naomii
 */
 
		
public class test{


    public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
    Movable bugattiVeyron = new BugattiVeyron();
    MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
      
    assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
}
    
public static void main(String[] args){
  test t1=new test();
   t1.whenConvertingMPHToKMPH_thenSuccessfullyConverted();

}
}


