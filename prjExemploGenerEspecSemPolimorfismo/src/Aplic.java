import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;

/**
 *
 * @author edson.barros
 */
public class Aplic {

    public static void main(String[] args) {
        
        Aluno objAlu = new Aluno(1010, "Carlos Silveira", "15/03/78");        
        
        
        objAlu.setMensalidade(1500);
        
        System.out.println("Registro Escolar: " + objAlu.getRegEscolar());
        System.out.println("Nome: " + objAlu.getNome());
        System.out.println("Data Nascimento: " + objAlu.getDataNascimento());
        System.out.println("Mensalidade: " + objAlu.getMensalidade());
        
        Professor objProf = new Professor(2020, "Dimas Turbo", "29/03/63");
        
        objProf.setSalario(3500);
    
        System.out.println("Registro Escolar: " + objProf.getRegFuncional());
        System.out.println("Nome: " + objProf.getNome());
        System.out.println("Data Nascimento: " + objProf.getDataNascimento());
        System.out.println("Salario: " + objProf.getSalario());
        
    }
}
