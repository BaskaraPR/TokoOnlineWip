
import java.util.ArrayList;
/**
 *
 * @author Baskar
 */
public class Barang {
    private ArrayList<String> namaBarang = new ArrayList();
    private ArrayList<Integer> stok = new ArrayList();
    private ArrayList<Integer> harga = new ArrayList();
    
    public Barang(){
        
        this.namaBarang.add("null");
        this.stok.add(0);
        this.harga.add(0);
        
        this.namaBarang.add("betadine");
        this.stok.add(10);
        this.harga.add(10000);
        
        this.namaBarang.add("Sosis");
        this.stok.add(20);
        this.harga.add(2000);
        
        this.namaBarang.add("Welkin Moon");
        this.stok.add(20);
        this.harga.add(75000);
    }
    
    public int getJmlBarang(){
        return this.namaBarang.size()-1;
    }
    public void setNamaBarang(String namaBarang ){
        this.namaBarang.add(namaBarang);
    }
    public String getNamaBarang(int idBarang){
        return this.namaBarang.get(idBarang);
    }
    public void setStok(int stok){
        this.stok.add(stok);
    }
    public int getStok(int idBarang){
        return this.stok.get(idBarang);
    }
    public void editStok(int idBarang, int stok){
        this.stok.set(idBarang, stok);
    }
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    public int getHarga(int idBarang){
        return this.harga.get(idBarang);
    }
}
