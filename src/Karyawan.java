
import java.util.ArrayList;

/**
 *
 * @author Baskar
 */
public class Karyawan implements User{
    private ArrayList<String> namaKaryawan = new ArrayList();
    private ArrayList<String> alamat = new ArrayList();
    private ArrayList<String> telepon = new ArrayList();
    private ArrayList<Integer> jabatan = new ArrayList();
    
    public Karyawan(){
         this.namaKaryawan.add("Raul");
         this.alamat.add("Zimbabwe");
         this.telepon.add("23232323232323");
         this.jabatan.add(0);
         
         this.namaKaryawan.add("Jack Sparrow");
         this.alamat.add("Oklahoma");
         this.telepon.add("7890293823");
         this.jabatan.add(1);
    }
    
    public void setJabatan(int entryJab){
        jabatan.add(entryJab);
    }
    
    public int getJabatan(int indexjab){
        return jabatan.get(indexjab);
    }
    
    public int getJmlKaryawan(){
        return namaKaryawan.size();
    }

    @Override
    public void setNama(String nama) {
        namaKaryawan.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int nama) {
        return namaKaryawan.get(nama);
    }

    @Override
    public String getAlamat(int alamat) {
        return this.alamat.get(alamat);
    }

    @Override
    public String getTelepon(int telepon) {
        return this.telepon.get(telepon);
    }
    
}
