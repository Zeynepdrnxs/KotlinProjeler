import java.util.*

fun main() {
    println("Lütfen dosya ismini giriniz:")
    val scanner = Scanner(System.`in`)
    val dosyaAdi = scanner.nextLine(); //kullanıcıdan dosya adını alır
    val substring = dosyaAdi.substring(dosyaAdi.indexOf("."), dosyaAdi.length) //dosya adında bulunan "."'dan başlayıp son index dahil alma işlemini yapar
    if (substring.equals(".pdf")) { //pdf kontrolü
        println("Dosya pdf servisine gönderildi")
    } else if (substring.equals(".tiff")){ //tiff kontrolü
        println("Dosya tiff servisine gönderildi")
    }else if (substring.equals(".jpg")){ //jpg kontrolü
        println("Dosya jpg servisine gönderildi")
    }else if (substring.equals(".png")){ //png kontrolü
        println("Dosya png servisine gönderildi")
    }else{ //Hatalı ve ya desteklenmeyen dosya adı girilmesi durumunu kontrol eder
                println("hatalı dosya formatı girdiniz")
    }
}
