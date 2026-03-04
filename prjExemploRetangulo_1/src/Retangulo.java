/**
 *
 * @author edson.barros
 */
public class Retangulo {
    
    private double altura;
    private double base;
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public double calcArea(){
        return altura * base;
    }
    
    public double Perimetro(){
        return (altura + base) * 2;
    }
}