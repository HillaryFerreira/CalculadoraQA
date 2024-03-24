
import org.example.Calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hillary
 */
public class CalculadoraJUnitTest {
    
   // Instancia da classe Calculadora 
   private Calculadora calculadora = new Calculadora();
   // Inicializa as variaveis num1 e num2 que representam os números para as operações
   private double num1 = 10, num2 = 5;
   
   @Test
   @DisplayName("O método soma dois numeros doubles")
    public void somaDoisNumeros() {
        //Compara o resultado esperado com o resultado real
        assertEquals(15, calculadora.somar(num1, num2));
    }
    
    
    @Test
    @DisplayName("O método subtrai dois numeros doubles")
    public void subtraiDoisNumeros() {
        //Compara o resultado esperado com o resultado real
        assertEquals(5, calculadora.subtrair(num1, num2));
    }
    
    @Test
    @DisplayName("O metodo multiplica dois numeros double")
    void multiplicaDoisNumerosInteiros() {
        //Compara o resultado esperado com o resultado real
        assertEquals(50, calculadora.multiplicar(num1, num2));
    }
    
    @Test
    @DisplayName("O metodo divide dois numeros double")
    void divideDoisNumerosInteiros() {
        //Compara o resultado esperado com o resultado real
        assertEquals(2, calculadora.dividir(num1, num2));
    }
    
}
