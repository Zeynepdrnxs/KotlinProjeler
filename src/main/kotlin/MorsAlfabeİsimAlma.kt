fun main() {
    val morseAlfabesi = listOf(
        ".-", // A
        "-...", // B
        "-.-.", // C
        "-..", // D
        ".", // E
        "..-.", // F
        "--.", // G
        "....", // H
        "..", // I
        ".---", // J
        "-.-", // K
        ".-..", // L
        "--", // M
        "-.", // N
        "---", // O
        ".--.", // P
        "--.-", // Q
        ".-.", // R
        "...", // S
        "-", // T
        "..-", // U
        "...-", // V
        ".--", // W
        "-..-", // X
        "-.--", // Y
        "--.." // Z
    )
    val alfabe = listOf(
        "A",
        "B",
        "C",
        "D",
        "E",
        "F",
        "G",
        "H",
        "I",
        "J",
        "K",
        "L",
        "M",
        "N",
        "O",
        "P",
        "Q",
        "R",
        "S",
        "T",
        "U",
        "V",
        "W",
        "X",
        "Y",
        "Z",
    )
    val morsİsim = readln()
    var isim = ""
    val toList = morsİsim.split(" ").toList() // girilen harfleri boşluklara göre bölüp bir arrayiçine atar
    var kontrol = true;
    for (i in 0..toList.size-1){ //bu for döngüsü harflerin mors alfabesinde var olup olmadığını kotnrol eder eğer harf yoksa yanlış girildiğine dair kotnrol boolean ifadesini false olarak setler
        if (!morseAlfabesi.contains(toList.get(i))){
            kontrol=false
        }
    }
    if (kontrol){ //eğer hatalı bir harf girişi yok ise
        for (i in 0..toList.size-1){ //harflerimizin sayısı kadar dönmesini sağlar
            for (j in 0..morseAlfabesi.size-1){
                if (toList.get(i).equals(morseAlfabesi.get(j))){ //eğer harf mors alfabesinde bir karşılık buluyor ise harfin indeksini alır
                    isim =isim+ alfabe.get(j);// bu alınan indekse göre de gider alfabeden karşılığı olan harfi alır
                }
            }
        }
        println("mors alfabesinin karşığı olan isim: "+isim)}
    else{
        println("hatalı bir harf girişi yaptınız")
    }
}
