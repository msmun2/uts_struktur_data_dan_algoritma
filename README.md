# Penjelasan Program Menu Makanan Menggunakan Array

## Penggunaan Array

Program menggunakan dua buah array untuk menyimpan data menu dan harga makanan.

```java
String[] menu = {
    "Soto",
    "Rawon",
    "Pecel",
    "Bakso",
    "Siomay"
};
```

Array `menu[]` digunakan untuk menyimpan nama makanan.

```java
int[] harga = {
    15000,
    20000,
    10000,
    12500,
    25000
};
```

Array `harga[]` digunakan untuk menyimpan harga makanan.

Kedua array memiliki hubungan berdasarkan indeks yang sama.

| Indeks | Menu   | Harga |
| ------ | ------ | ----- |
| 0      | Soto   | 15000 |
| 1      | Rawon  | 20000 |
| 2      | Pecel  | 10000 |
| 3      | Bakso  | 12500 |
| 4      | Siomay | 25000 |

Sebagai contoh:

```java
menu[1] = "Rawon";
harga[1] = 20000;
```

Artinya menu Rawon memiliki harga Rp20.000.

---

# Penjelasan Kode Program

### Import Scanner

```java
import java.util.Scanner;
```

Digunakan untuk mengimpor class Scanner agar program dapat menerima input dari keyboard.

---

### Membuat Class

```java
public class MenuMakanan {
```

Mendefinisikan class utama bernama `MenuMakanan`.

---

### Method Main

```java
public static void main(String[] args) {
```

Method utama yang akan dijalankan pertama kali saat program dieksekusi.

---

### Membuat Objek Scanner

```java
Scanner input = new Scanner(System.in);
```

Membuat objek Scanner untuk membaca input dari pengguna.

---

### Deklarasi Array Menu

```java
String[] menu = {
    "Soto",
    "Rawon",
    "Pecel",
    "Bakso",
    "Siomay"
};
```

Menyimpan daftar nama makanan ke dalam array.

---

### Deklarasi Array Harga

```java
int[] harga = {
    15000,
    20000,
    10000,
    12500,
    25000
};
```

Menyimpan harga masing-masing makanan ke dalam array.

---

### Variabel Total

```java
int total = 0;
```

Digunakan untuk menyimpan total harga seluruh pesanan.

---

### Menampilkan Pesan Input

```java
System.out.print("Isikan Makanan yang dipesan : ");
```

Menampilkan pesan agar pengguna memasukkan pesanan.

---

### Membaca Input

```java
String pesanan = input.nextLine();
```

Menyimpan seluruh input pengguna ke dalam variabel `pesanan`.

Contoh:

```text
Soto 1 Rawon 2 Pecel 2
```

---

### Memecah Input

```java
String[] data = pesanan.split(" ");
```

Memisahkan input berdasarkan spasi dan menyimpannya ke dalam array `data`.

Hasil:

```java
[Soto, 1, Rawon, 2, Pecel, 2]
```

---

### Menampilkan Judul Output

```java
System.out.println("\nTotal Harga :");
```

Menampilkan teks "Total Harga".

---

### Perulangan Membaca Pesanan

```java
for(int i = 0; i < data.length; i += 2)
```

Membaca data setiap dua elemen karena format input terdiri dari:

```text
Nama Makanan Jumlah Porsi
```

---

### Mengambil Nama Makanan

```java
String namaMakanan = data[i];
```

Mengambil nama makanan dari array `data`.

---

### Mengambil Jumlah Porsi

```java
int porsi = Integer.parseInt(data[i + 1]);
```

Mengubah jumlah porsi dari String menjadi Integer.

---

### Perulangan Pencarian Menu

```java
for(int j = 0; j < menu.length; j++)
```

Mencari nama makanan pada array `menu`.

---

### Membandingkan Nama Makanan

```java
if(namaMakanan.equalsIgnoreCase(menu[j]))
```

Memeriksa apakah makanan yang diinput sama dengan menu yang tersedia.

---

### Menghitung Subtotal

```java
int subtotal = harga[j] * porsi;
```

Menghitung harga makanan berdasarkan jumlah porsi.

---

### Menampilkan Detail Pesanan

```java
System.out.println(
    "- " + menu[j] +
    " @" + harga[j] +
    " * " + porsi +
    " = " + subtotal
);
```

Menampilkan rincian pesanan beserta subtotalnya.

---

### Menambahkan ke Total

```java
total += subtotal;
```

Menambahkan subtotal ke total harga.

---

### Menghentikan Perulangan

```java
break;
```

Menghentikan pencarian setelah menu ditemukan.

---

### Menampilkan Total Harga

```java
System.out.println("Total = " + total);
```

Menampilkan total seluruh pesanan.

---

### Menutup Scanner

```java
input.close();
```

Menutup objek Scanner setelah program selesai dijalankan.

---

## Contoh Output

```text
Total Harga :

- Soto @15000 * 1 = 15000
- Rawon @20000 * 2 = 40000
- Pecel @10000 * 2 = 20000

Total = 75000
```
