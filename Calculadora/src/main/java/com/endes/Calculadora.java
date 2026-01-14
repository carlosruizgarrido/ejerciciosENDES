package com.endes;

/**
 * Class Calculadora
 */
public class Calculadora {

  //
  // Fields
  //

  private int num1;
  private int num2;
  
  //
  // Constructors
  //
  public Calculadora () {
	  this.num1 = 0;
	  this.num2 = 0;
  };
 
  
  public Calculadora(int num1, int num2) {
	super();
	this.num1 = num1;
	this.num2 = num2;
}


  //
  // Methods
  //


  
  //
  // Other methods
  //

  /**
   * @return       int
   */

  public int getNum1() {
	return num1;
}


  public void setNum1(int num1) {
	this.num1 = num1;
  }


  public int getNum2() {
	return num2;
  }


  public void setNum2(int num2) {
	this.num2 = num2;
  }

  public int sumar()
  {
	  return num1+num2;
  }


  /**
   * @return       int
   */
  public int restar()
  {
	  return num1-num2;
  }


  /**
   * @return       int
   */
  public int multiplicar()
  {
	  return num1*num2;
  }


  /**
   * @return       double
   */
  public double dividir()
  {
	  return num1/(double)num2;
  }


}
