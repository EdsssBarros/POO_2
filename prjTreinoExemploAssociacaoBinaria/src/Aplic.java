import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edson
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/78", 15.8);  
    funcHor.setCargo("Programador");
    
    FuncionarioMensalista funcMen = new FuncionarioMensalista(2020, "Ana Beatriz", "22/07/88", (double)600.0F);
    funcMen.setCargo("Aux. Administrativo");
    
    FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, "Joao Mendes", "10/12/1975", (double)10.0F);
    funcCom.setCargo("Vendedor");
    
    Departamento objDep1 = new Departamento("RH", "Recursos Humanos");
    
    Departamento objDep2 = new Departamento("VD", "Vendas");
    
    funcHor.setDepartamento(objDep1);
    
    funcMen.setDepartamento(objDep1);
    
    
    
    }
    
}
