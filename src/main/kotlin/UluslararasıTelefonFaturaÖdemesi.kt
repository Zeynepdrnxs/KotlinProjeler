import java.util.*
fun main() {
// Ülke Kodları:
// 90 - Türkiye Fiyat Çarpanı 3.8
// 39 - İtalya Fiyat Çarpanı 2.7
// 31 - Hollanda Fiyat Çarpanı 1.6
// 34 - İspanya Fiyat Çarpanı 3.4
// 44 - İngiltere Fiyat Çarpanı 1.2
//
// Baz fiyat 2 birim // çarpansız ödeme
    val bazFiyat = 2;
    println("Lütfen Aramak İstediğiniz Numarayı Giriniz:")
    val scanner = Scanner(System.`in`)
    val number = scanner.nextLine(); //kullanıcıdan numarayı alır
    val substring = number.substring(0, 3) //0. indexi dahil edip 3. indexi dahil etmeden aradakalan +90 şekinde ilk 3 basamaklı kısmı almayı sağlar
    println("Lütfen Görüşme dakikasını giriniz:")
    val time = scanner.nextInt(); //kullanıcıdan kaç dakika konuşma yapacağını alır
    if (substring.equals("+90")) { //Ülke Kontrolü yapar
        val toplamOdeme = bazFiyat*3.8*time; //Baz fiyatı,ülke çarpanını ve arama dakikasını kullanarak fiyat hesabı yapılır
        println("Toplam ödeme: "+toplamOdeme +" birimdir.");
    } else if (substring.equals("+39")){ //Ülke Kontrolü yapar
        val toplamOdeme = bazFiyat*2.7*time; //Baz fiyatı,ülke çarpanını ve arama dakikasını kullanarak fiyat hesabı yapılır
        println("Toplam ödeme: "+toplamOdeme +" birimdir.");
    }else if (substring.equals("+31")){ //Ülke Kontrolü yapar
        val toplamOdeme = bazFiyat*1.6*time; //Baz fiyatı,ülke çarpanını ve arama dakikasını kullanarak fiyat hesabı yapılır
        println("Toplam ödeme: "+toplamOdeme +" birimdir.");
    }else if (substring.equals("+34")){ //Ülke Kontrolü yapar
        val toplamOdeme = bazFiyat*3.4*time; //Baz fiyatı,ülke çarpanını ve arama dakikasını kullanarak fiyat hesabı yapılır
        println("Toplam ödeme: "+toplamOdeme +" birimdir.");
    }else if (substring.equals("+44")){ //Ülke Kontrolü yapar
        val toplamOdeme = bazFiyat*1.2*time; //Baz fiyatı,ülke çarpanını ve arama dakikasını kullanarak fiyat hesabı yapılır
        println("Toplam ödeme: "+toplamOdeme +" birimdir.");
    }else{ //Hatalı yada hizmet verilmeyen ülke kontrolü
        println("Hatalı yada hizmet verilmeyen bir ülkeye ait numara girdiniz.")
    }
}