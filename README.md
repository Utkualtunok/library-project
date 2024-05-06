## Varlıklar Arasındaki İlişkiler

Bu projede, veritabanındaki varlıklar arasında aşağıdaki ilişkiler tanımlanmıştır:

### Kitaplar ve Yazarlar
Bir kitap, yalnızca bir yazara sahip olabilir, ancak bir yazar birden fazla kitabın yazarı olabilir. Bu, One-to-Many (Birden-Çok) ilişkisidir.

- **Bir kitap bir yazara sahiptir.**
- **Bir yazar birden fazla kitaba sahip olabilir.**

### Kitaplar ve Kategoriler
Bir kategori, birden fazla kitaba sahip olabilirken, bir kitap birden fazla kategoriye ait olabilir. Bu Many-to-Many (Çoktan-Çok) ilişkisidir.

- **Bir kategori birçok kitaba sahip olabilir.**
- **Bir kitap birden fazla kategoriye ait olabilir.**

### Kitaplar ve Yayınevleri
Bir kitap, yalnızca bir yayınevinden çıkabilir, ancak bir yayınevi birden fazla kitap yayımlayabilir. Bu, One-to-Many (Birden-Çok) ilişkisidir.

- **Bir kitap bir yayınevine sahiptir.**
- **Bir yayınevi birden fazla kitaba sahip olabilir.**

### Kitaplar ve Ödünç Alma
Bir kitap birden fazla ödünç alma işlemine sahip olabilir, ancak her ödünç alma işlemi yalnızca bir kitaba ait olabilir. Bu, One-to-Many (Birden-Çok) ilişkisidir.

- **Bir kitap birden fazla ödünç alma işlemine sahip olabilir.**
- **Bir ödünç alma işlemi yalnızca bir kitaba aittir.**
  
## Book Table
<img width="1119" alt="Book" src="https://github.com/Utkualtunok/library-project/assets/64544021/a70425b4-9d24-420f-b13b-670226897ea2">

## Author Table
<img width="1125" alt="Author" src="https://github.com/Utkualtunok/library-project/assets/64544021/d5fe83f2-9a98-4788-bbc2-a185f60957c1">

## Category Table
<img width="1100" alt="Ekran Resmi 2024-05-06 15 33 51" src="https://github.com/Utkualtunok/library-project/assets/64544021/7ab146e3-5267-4106-bee0-dd63563d76ce">

## Book Borrowing Table
<img width="1098" alt="Ekran Resmi 2024-05-06 15 35 05" src="https://github.com/Utkualtunok/library-project/assets/64544021/2caa3c96-ae98-40f3-b650-57f4535c1a0f">

## Publisher Table
<img width="1072" alt="Ekran Resmi 2024-05-06 15 36 25" src="https://github.com/Utkualtunok/library-project/assets/64544021/3d168c58-f12f-4dda-b82d-ec9c99498104">

## Book2Category Table
<img width="1130" alt="Ekran Resmi 2024-05-06 15 37 43" src="https://github.com/Utkualtunok/library-project/assets/64544021/1a75b866-d544-4e17-93b6-9af2f1394173">

## Book & Book Borrowing Table
<img width="1118" alt="Ekran Resmi 2024-05-06 15 39 06" src="https://github.com/Utkualtunok/library-project/assets/64544021/7c63d461-0db4-4af7-b7b9-8e05b47bdb31">
