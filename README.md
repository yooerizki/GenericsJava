# Ganeric Class


###### Struktur Data ######
## Ganeric ##



KEGIATAN 1
Buat class generics bernama Generic yang menyimpan data menggunakan parameter Kunci (key) dan
Nilai (value). Kemudian buat lagi kelas bernama GenericArray sehingga gambaran diagramnya akan
tampak.

KEGIATAN 2
Buat kelas generik bernama “Kubus” yang akan menyimpan nilai panjang, lebar, dan tinggi
dengan syarat hanya menerima jenis Nomer (Numbers).

Sehingga contoh inisialisasi object akan seperti berikut:
Kubus<Double> kubusTipeDouble = new Kubus<>();
Kubus<Integer > kubusTipeInteger = new Kubus<>();
Kubus<String > kubusTipeString = new Kubus<>(); //error type parameter; should extend
‘java.lang.Number’
