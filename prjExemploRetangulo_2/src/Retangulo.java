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

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }
    
    public double calcArea(){
        return altura * base;
    }
    
    public double calcPerimetro(){
        return (altura + base) * 2;
    }
    
    public double calcDiagonal(){
        return Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
    }
}