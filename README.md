# Bundle-Case-1
Bundle Java Developer Case - 1(Algorithm and Data Structure)
# Array Filtreleme Metodu

## Parametreler
Metot, dizi olarak bir dizi alacak ve bu dizinin elemanları yine birer dizi olacak. İçteki dizinin elemanları ise String tipinde olacak. Ancak bazı hatalar nedeniyle bu dizi içinde null değerler ve sayısal olmayan değerler de bulunabilir.

## Metodun Amacı
Metod, hatalı gelen verileri temizleyip aşağıdaki algoritma kullanılarak doğru şekilde filtrelenmiş bir Integer listesi döndürecek.

## Algoritma
1. İçteki diziler sıralı olarak ele alınacak, yani ilk dizi bittikten sonra ikinci dizinin ilk elemanı ile işlem yapılacak.
2. String değerler öncelikle integer'a çevrilecek.
3. Bu integerlar üçlü gruplara ayrılacak.
4. Üçlü grupların toplamları 90'dan küçük olanlar elenecek.
5. Kalan büyük olan üçlü gruplar geldikleri sıra ile bir listeye eklenip, bu liste döndürülecek.
6. Eğer son üç adetten az Integer kaldıysa, bunlar yok sayılacak ve dönüş listesine eklenmeyecek.

## Metod
- **Return Type:** List<Integer>
- **Input Params:** Array

## Örnekler
1. Dizi: "0", "s1", null, "35", "90", "60"
2. Dizi: "ttt", null, null, "15"
3. Dizi: "75", "95", "0", "0", null, "ssss", "0", "-15"
4. Dizi: "25", "fgdfg", "", "105", "dsfdsf", "-5"
