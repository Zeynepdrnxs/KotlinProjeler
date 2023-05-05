fun main() {
    println("Lütfen kontrol etmek istediğiniz metni giriniz: ")
    val metin = readln()!!.toString()
    println("Lütfen kontrol edilecek harfi giriniz: ")
    val harf = readln()!!.toString()
    var counter = 0;
    for (i in 0..metin.length - 1) {
        if (metin[i].toString().equals(harf, true)) { //metin içinde bulunan her harfin istenilen harf ile eşit olup olmadığının kontrolünü yapar
                    counter++;
        }
    }
    println(metin +" metni içinde '"+harf+"' harfi "+counter+" defa tekrar etmiştir")
}
