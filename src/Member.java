
import java.util.ArrayList;

/**
 *
 * @author Baskar
 */
public class Member implements User{
     private ArrayList<String> namaMember = new ArrayList();
     private ArrayList<String> alamat = new ArrayList();
     private ArrayList<String> telepon = new ArrayList();
     private ArrayList<Integer> saldo = new ArrayList();
     
     public Member(){
         this.namaMember.add("null");
         this.alamat.add("null");
         this.telepon.add("null");
         this.saldo.add(null);
         
         this.namaMember.add("sandi");
         this.alamat.add("mars");
         this.telepon.add("09090909090");
         this.saldo.add(100000);
         
         this.namaMember.add("Koree");
         this.alamat.add("Ohio");
         this.telepon.add("68699698686");
         this.saldo.add(690000);
     }
     
    public void setSaldo(int bal){
        saldo.add(bal);
    }
    
    public int getSaldo(int indexBal){
        return saldo.get(indexBal);
    }
    
    public void editSaldo(int index, int entry){
        saldo.set(index, entry);
    }
    
    public int getJmlMember(){
        return namaMember.size()-1;
    }
     
    @Override
    public void setNama(String nama) {
        namaMember.add(nama);
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
        return namaMember.get(nama);
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
