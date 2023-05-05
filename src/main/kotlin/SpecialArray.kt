fun main() {
    val intArrayOf = intArrayOf(0, 1, 2, 3, 4, 5)
    var isSpecialArray = true //Array kontrolü için kullanılır
    if (intArrayOf.isNotEmpty()) { //Eğer verdiğimiz array boş değil ise işlem yapmayı sağlar
        for (i in 0..intArrayOf.size - 1) { //Array uzunluğu kadar for döngüsü oluşmasını sağlar
            if (i % 2 == 0) { //tek indexlerin kontrolünü sağlar
                if (intArrayOf.get(i) % 2 != 0) { //tek indekste bulunan sayının tek veya çift olduğunu kontrol eder
                    isSpecialArray = false //Eğer tek indexte bulunan sayı tek değil ise boolean false olarak değiştirilir
                }
            } else if (i % 2 == 1) { //çift indexlerin kontrolünü sağlar
                if (intArrayOf.get(i) % 2 != 1) { //çift indekste bulunan sayının tek veya çift olduğunu kontrol eder
                    isSpecialArray = false //Eğer çift indexte bulunan sayı çift değil ise boolean false olarak değiştirilir
                }
            }
        }
        println("is special array: " + isSpecialArray)
    } else {
        println("Array boş olduğu için kontrol yapılamamaktadır")
    }
}