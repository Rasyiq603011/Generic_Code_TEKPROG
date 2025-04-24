# Tugas Pemrograman Berorientasi Objek - Sistem Manajemen Inventaris

## Deskripsi Tugas
Program ini merupakan implementasi sistem manajemen inventaris sederhana menggunakan Java dengan pendekatan pemrograman berorientasi objek. Program ini dibuat untuk memenuhi tugas mata kuliah Pemrograman Berorientasi Objek.

## Fitur Program
- Mengelola 3 jenis produk: Elektronik, Pakaian, dan Makanan
- Menambahkan produk baru
- Menghapus produk
- Mencari produk berdasarkan nama
- Mengurutkan produk berdasarkan nama
- Menampilkan semua produk

## Konsep OOP yang Diimplementasikan
1. **Inheritance (Pewarisan)**
   - Class `Product` sebagai parent class
   - Class `Electronic`, `Clothing`, dan `Food` sebagai child class

2. **Polymorphism (Polimorfisme)**
   - Method `get_info()` yang diimplementasikan secara berbeda pada setiap class

3. **Abstraction (Abstraksi)**
   - Class abstract `Product` 
   - Method abstract `get_info()`

4. **Encapsulation (Enkapsulasi)**
   - Penggunaan modifier private untuk atribut
   - Getter dan setter untuk mengakses atribut

5. **Interface**
   - Interface `Discountable` untuk produk yang bisa diberi diskon
   - Interface `Expirable` untuk produk yang memiliki masa kedaluwarsa

6. **Generic Class**
   - Class `Inventory<T>` untuk mengelola berbagai jenis produk

## Struktur Program
- `Product.java` - Class abstract dasar
- `Electronic.java` - Class untuk produk elektronik
- `Clothing.java` - Class untuk produk pakaian
- `Food.java` - Class untuk produk makanan
- `Discountable.java` - Interface untuk produk yang bisa diberi diskon
- `Expirable.java` - Interface untuk produk yang bisa kedaluwarsa
- `Inventory.java` - Generic class untuk mengelola inventaris
- `AdminUserInterface.java` - Class untuk user interface
- `Main.java` - Class utama program

## Cara Menjalankan Program
1. Kompilasi semua file java:
   ```
   javac *.java
   ```
2. Jalankan program:
   ```
   java Main
   ```

## Dibuat Oleh
Nama: Muhammad Nabil Syauqi Rasyiq  
NIM: 241524018
Kelas/Prodi: 1A / Sarjana Terapan Teknik Informatika
