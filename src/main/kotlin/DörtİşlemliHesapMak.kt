import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    print("Lütfen yapmak istediğiniz işlemi seçiniz (+, -, *, /): ")
    val islem = scanner.next()
    print("Lütfen 1. sayıyı giriniz ")
    val birinciSayi = scanner.nextDouble()
    print("Lütfen 2. sayıyı giriniz ")
    val ikinciSayi = scanner.nextDouble()
    val sonuc: Double
    when (islem) { //verilen işlem türüne göre yapılacak olan işlemi seçer
        "+" -> sonuc = birinciSayi + ikinciSayi
        "-" -> sonuc = birinciSayi - ikinciSayi
        "*" -> sonuc = birinciSayi * ikinciSayi
        "/" -> sonuc = birinciSayi / ikinciSayi
        else -> { //Belirtilenden farklı bir işlem türü girilmesi durumuna karşın hata mesajı yazmak için kullanılır
            System.out.printf("Lütfen geçerli bir işlem türü giriniz")
            return
        }
    }
    println("sonuc: "+sonuc)
}