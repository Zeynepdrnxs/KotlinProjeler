fun main() {
    var ornekArray = arrayListOf<String>("test1", "test2", "test3", "test4", "test5", "test6",
        "test7", "test8", "test9", "test10")
    println("Önce:")
    println("ornekArray = " +ornekArray)
    println("method sirasinda")
    do {
        println(ornekArray.get(0)) // Arrayin her zaman ilk elemanını yazmayı sağlar
        ornekArray.removeAt(0) //Array'in ilk elemanını array'den çıkarır
    }while (ornekArray.isNotEmpty()) //Array boş değil iken çalışmaya devam eder
    println("Sonra:")
    println("ornekArray = " +ornekArray)
}