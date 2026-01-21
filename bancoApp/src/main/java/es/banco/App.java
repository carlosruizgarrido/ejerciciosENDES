package es.banco;

import com.github.javafaker.Faker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Faker fake1 = new Faker();
        System.out.println( fake1.witcher().monster() );
    }
}


/**
 * Class CuentaCorriente
 */
public class CuentaCorriente {

  //
  // Fields
  //

  public String nombre;
  public String nombreBanco;
  protected String dni;
  private double saldo;
  private double limiteDescubierto;
  private Banco banco;
  
  //
  // Constructors
  //
  public CuentaCorriente () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of nombreBanco
   * @param newVar the new value of nombreBanco
   */
  public void setNombreBanco (String newVar) {
    nombreBanco = newVar;
  }

  /**
   * Get the value of nombreBanco
   * @return the value of nombreBanco
   */
  public String getNombreBanco () {
    return nombreBanco;
  }

  /**
   * Set the value of dni
   * @param newVar the new value of dni
   */
  public void setDni (String newVar) {
    dni = newVar;
  }

  /**
   * Get the value of dni
   * @return the value of dni
   */
  public String getDni () {
    return dni;
  }

  /**
   * Set the value of saldo
   * @param newVar the new value of saldo
   */
  public void setSaldo (double newVar) {
    saldo = newVar;
  }

  /**
   * Get the value of saldo
   * @return the value of saldo
   */
  public double getSaldo () {
    return saldo;
  }

  /**
   * Set the value of limiteDescubierto
   * @param newVar the new value of limiteDescubierto
   */
  public void setLimiteDescubierto (double newVar) {
    limiteDescubierto = newVar;
  }

  /**
   * Get the value of limiteDescubierto
   * @return the value of limiteDescubierto
   */
  public double getLimiteDescubierto () {
    return limiteDescubierto;
  }

  /**
   * Set the value of banco
   * @param newVar the new value of banco
   */
  public void setBanco (Banco newVar) {
    banco = newVar;
  }

  /**
   * Get the value of banco
   * @return the value of banco
   */
  public Banco getBanco () {
    return banco;
  }

  //
  // Other methods
  //

  /**
   * @param        nombre
   * @param        dni
   */
  public void CuentaCorriente(String nombre, String dni)
  {
  }


  /**
   * @param        nombre
   * @param        dni
   * @param        saldoInicial
   */
  public void CuentaCorriente(String nombre, String dni, double saldoInicial)
  {
  }


  /**
   * @param        nombre
   * @param        dni
   * @param        saldoInicial
   * @param        limiteDescubierto
   */
  public void CuentaCorriente(String nombre, String dni, double saldoInicial, double limiteDescubierto)
  {
  }


  /**
   * @param        cantidad
   */
  public void ingresar(double cantidad)
  {
  }


  /**
   * @return       boolean
   * @param        cantidad
   */
  public boolean sacar(double cantidad)
  {
  }


  /**
   * @return       double
   */
  public double getSaldo()
  {
  }


  /**
   * @param        limite
   */
  public void setLimiteDescubierto(double limite)
  {
  }


  /**
   * @return       double
   */
  public double getLimiteDescubierto()
  {
  }


  /**
   * @param        banco
   */
  public void setBanco(Banco banco)
  {
  }


  /**
   * @return       Banco
   */
  public Banco getBanco()
  {
  }


  /**
   * @return       String
   */
  public String mostrarInformacion()
  {
  }


  /**
   * @param        nombre
   */
  public static void setNombreBanco(String nombre)
  {
  }


  /**
   * @return       String
   */
  public static String getNombreBanco()
  {
  }


}
