fun main() {
    println("Lütfen çarpılacak numarayı giriniz: ")
    val number = readln()!!.toInt()
    println("Lütfen çarpım uzunluğunu giriniz: ")
    val length = readln()!!.toInt()
    val arr = IntArray(length) //uzunluk ölçüsünde boş bir array oluşturulur
    for (i in 1..length){
        arr[i-1]=number*i; // boş array'in her indeksini çarpılan sayı ile doldurmak için kullanılır
    }
    print("[")
    for (i in 0..arr.size-1){
        print(arr.get(i))
        if (i!=arr.size-1){ //son elemana gelince boşluk koymamayı kontrol eder
            print(" ")
        }
    }
    print("]")
}