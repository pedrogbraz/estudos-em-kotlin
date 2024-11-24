package github.com.pedrogbraz

import java.math.BigDecimal

fun main() {
   // Tipos de Variáveis

    // Int, Byte, Short, Long
    var int: Int = 1;
    var byte: Byte = 1;
    var short: Short = 1;
    var long: Long = 1;

    // Float, Double
    var float: Float = 1.0f;
    var double: Double = 1.0;
    var bigDecimal: BigDecimal = BigDecimal("1.38423");

    // Char
    var char: Char = 'A';

    // Strings
    var string: String = "World";

    // Boolean
    var boolean: Boolean = true;

    // Arrays
    var intArray: Array<Int> = arrayOf(0, 2, 4,6 ,8, 10, 12, 14, 16, 18, 20);

    // Operadores Aritméticos
    var soma = 1 + 1;
    var subtracao = 1 - 1;
    var multiplicacao = 1 * 1;
    var divisao = 1 / 1;
    var modulo = 1 % 1;

    // Operadores Relacionais
    var maiorQue = 1 > 1;
    var menorQue = 1 < 1;
    var maiorOuIgualQue = 1 >= 1;
    var menorOuIgualQue = 1 <= 1;
    var igualdade = 1 == 1;
    var desigualdade = 1 != 1;

    // Operadores Lógicos
    var and = true && true;
    var or = true || true;
    var not = !true;

    // Operadores de Atribuição
    var atribuicao = 1;
    //var somaAtribuicao = 1 += 1;
    // var subtracaoAtribuicao = 1 -= 1;
    // var multiplicacaoAtribuicao = 1 *= 1;
    // var divisaoAtribuicao = 1 /= 1;
    // var moduloAtribuicao = 1 %= 1;

    // Operadores de Incremento e Decremento
    // var incremento = 1++;
    // var decremento = 1--;

    // Operadores de Bitwise
    var andBitwise = 1 and 1;
    var orBitwise = 1 or 1;
    var xorBitwise = 1 xor 1;
    var notBitwise = 1.inv();
    var shiftLeftBitwise = 1 shl 1;
    var shiftRightBitwise = 1 shr 1;

    // Operadores de String
    var concatenacao = "Hello " + "World";
    var concatenacaoTemplate = "Hello $string";
    println(concatenacaoTemplate)
}