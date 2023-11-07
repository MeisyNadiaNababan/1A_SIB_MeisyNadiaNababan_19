import java.util.Scanner;
public class Perulangan2Kelompok{
    public static void main (String[] args){
# Inisialisasi data guru
guru = [
    {"nama": "Guru A", "gaji_pokok": 5000000, "hari_kerja": 20, "absen": 2},
    {"nama": "Guru B", "gaji_pokok": 5500000, "hari_kerja": 20, "absen": 1},
    #Tambahkan data guru lainnya jika diperlukan
]

# Menghitung gaji, pajak, dan potongan ketidakhadiran
for data_guru in guru:
    nama_guru = data_guru["nama"]
    gaji_pokok = data_guru["gaji_pokok"]
    hari_kerja = data_guru["hari_kerja"]
    absen = data_guru["absen"]
    
    # Menghitung total gaji
    total_gaji = gaji_pokok * (hari_kerja - absen)
    
    # Menghitung pajak (misalnya 10% dari total gaji)
    pajak = 0.1 * total_gaji
    
    # Menghitung potongan ketidakhadiran (misalnya 500000 per hari absen)
    potongan_absen = 500000 * absen
    
    # Menghitung gaji bersih (gaji pokok - pajak - potongan ketidakhadiran)
    gaji_bersih = total_gaji - pajak - potongan_absen
    
    # Menampilkan hasil perhitungan
    print(f"Nama Guru: {nama_guru}")
    print(f"Gaji Pokok: Rp {gaji_pokok}")
    print(f"Total Gaji: Rp {total_gaji}")
    print(f"Pajak: Rp {pajak}")
    print(f"Potongan Ketidakhadiran: Rp {potongan_absen}")
    print(f"Gaji Bersih: Rp {gaji_bersih}")
    print("=" * 30)
       
    }
}

