fun main() {

    println("Kontrol etmek istediğiniz metni giriniz: ")
    var tekrarEdenHarf = "";
    val kontrolEdilecekMetin = readln()
    for (i in 0 until kontrolEdilecekMetin.length-1) { //String'in uzunluğu kadar döngü içinde kalır
        for (j in 0..kontrolEdilecekMetin.length-1) { //String'in uzunluğu kadar döngü içinde kalır
            if (i != j){ //kontrol edilecek 2 harfin indeksinin eşit olmadığı durumları kontrol eder
                if (kontrolEdilecekMetin[i]==kontrolEdilecekMetin[j]){ // kontrol edilen harfler eşit ise tekrar eden harfi bu harfe atar
                    tekrarEdenHarf = kontrolEdilecekMetin[i].toString();
                    return
                }
            }
        }
    }
    if (!kontrolEdilecekMetin.isBlank()) {
        println("İlk defa tekrar eden harf: $tekrarEdenHarf")
    }else{
        println("Tekrar eden harf yoktur")
    }
}
