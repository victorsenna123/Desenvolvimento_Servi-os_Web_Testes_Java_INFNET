import org.example.Aluno;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// TP'S 9,10,11,12

public class AlunoTest {

    @Test
    public void testMatriculaValida() {
        Aluno aluno = new Aluno("João Silva", 8.0, 7.5);
        aluno.setMatricula(12345);
        assertEquals(12345, aluno.getMatricula());
    }

    @Test
    public void testMatriculaInvalida() {
        Aluno aluno = new Aluno("Maria Oliveira", 9.0, 8.5);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            aluno.setMatricula(-1);
        });
        assertEquals("A matrícula deve ser maior que zero.", exception.getMessage());
    }

    @Test
    public void testNomeValido() {
        Aluno aluno = new Aluno("Ana Paula", 7.0, 6.5);
        aluno.setNome("Carlos Alberto");
        assertEquals("Carlos Alberto", aluno.getNome());
    }

    @Test
    public void testNomeInvalido() {
        Aluno aluno = new Aluno("José", 8.0, 9.0);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            aluno.setNome("Ana"); // Nome inválido: menos de quatro caracteres e sem sobrenome
        });
        assertEquals("O nome deve ter pelo menos quatro caracteres e deve conter nome e sobrenome.", exception.getMessage());
    }

    @Test
    public void testNota1Valida() {
        Aluno aluno = new Aluno("Luiz Fernando", 8.0, 7.5);
        aluno.setNota1(9.5);
        assertEquals(9.5, aluno.getNota1(), 0.001);
    }

    @Test
    public void testNota1Invalida() {
        Aluno aluno = new Aluno("Roberto Carlos", 7.0, 6.5);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            aluno.setNota1(12.0); // Nota inválida: fora do intervalo [0, 10]
        });
        assertEquals("A nota deve estar entre 0 e 10.", exception.getMessage());
    }

    @Test
    public void testNota2Valida() {
        Aluno aluno = new Aluno("Mariana Costa", 8.0, 7.5);
        aluno.setNota2(7.0);
        assertEquals(7.0, aluno.getNota2(), 0.001);
    }

    @Test
    public void testNota2Invalida() {
        Aluno aluno = new Aluno("Pedro Gomes", 7.0, 6.5);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            aluno.setNota2(-3.0); // Nota inválida: fora do intervalo [0, 10]
        });
        assertEquals("A nota deve estar entre 0 e 10.", exception.getMessage());
    }

    @Test
    public void testCalcularMedia() {
        Aluno aluno = new Aluno("Renato Russo", 8.0, 7.0);
        assertEquals(7.5, aluno.calcularMedia(), 0.001);
    }
}
