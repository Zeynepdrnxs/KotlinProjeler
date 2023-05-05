import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    println("Binom üçgeni için bir sayı girin: ")
    val n = scanner.nextInt()
    for (i in 0 until n) { //i sıfır ile n sayısı arasında döngüye girer
        var number = 1
        print(" ".repeat(n - i - 1)) // üçgenin satır boşluklarını ayarlamak için kullanılır
        for (j in 0..i) {
            print("$number ")
            number = number * (i - j) / (j + 1) //Binom katsayısını hesaplar(binom katsayı formülü)
        }
        println()
    }
}
