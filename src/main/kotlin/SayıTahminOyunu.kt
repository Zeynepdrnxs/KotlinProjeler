fun main() {
    println("Aklımdan bir sayı tuttum 0 ile 100 arasında bul bulabilirsen:")
    val aklimdakiSayi = (0..100).random() //0 ile 100 arasından random bir sayı üretir
    var kontrol = false
    while (kontrol == false) { //kontrol false iken döngü dönmeye devam eder
        val girilenSayi = readln()!!.toInt() // kullanıcıdan integer almayı sağlar
        if (girilenSayi<0||girilenSayi>100){ // girilen sayının aralığını kontrol eder
            println("sayı 0'dan büyük 100'den küçüktür")
        }else{
            if (aklimdakiSayi==girilenSayi){ // girilen sayının tutulan sayı ile eşitliğini kontrol eder
                println("tebrikler doğru bildin bende aklımdan "+aklimdakiSayi+" tutmuştum")
                kontrol = true
            }else if (girilenSayi>aklimdakiSayi){ // girilen sayının tutulan sayıdan büyük ise
                println("aklımdaki daha küçük")
            }else if (girilenSayi<aklimdakiSayi){ // // girilen sayının tutulan sayıdan küçük ise
                println("aklımdaki daha büyük")
            }
        }
    }
}