import java.util.Scanner

fun main() {

    print("Introduce tu nombre: ")
    val nombre = readLine()
    println("Hola, $nombre")

    println()
    println("-----------------------------------------------")
    println()

    print("Dame el primer numero: ")
    val num1 = readLine()
    print("Dame el segundo numero: ")
    val num2 = readLine()
    val resultado: Int = num1 + num2
    print("El resultado de la sumda de $num1 y $num2 es $resultado")


}