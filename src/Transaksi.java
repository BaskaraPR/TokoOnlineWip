
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Baskar
 */
public class Transaksi {
    private ArrayList<Integer> idMember = new ArrayList();
    private ArrayList<Integer> idBarang = new ArrayList();
    private ArrayList<Integer> banyak = new ArrayList();
    
    public Transaksi() {

    }
    
    public void ProsesTransaksi(Member member, Transaksi transaksi,Barang barang){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Silahkan belanja");

        System.out.println("Masukkan ID Member");
        int idMember = myObj.nextInt();
        System.out.println("Selamat datang "+member.getNama(idMember));
        ArrayList<Integer> idBarang = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i=0;
        int temp=0;
        String a = "";
        do{
            System.out.println("Masukkan kode barang :");
            temp=myObj.nextInt();
            if (!"y".equals(a)){
                    idBarang.add(temp);
                    System.out.print(barang.getNamaBarang(idBarang.get(i))+ " sebanyak : ");
                    banyak.add(myObj.nextInt());
                    i++;
                }
            System.out.println("Selesai ? (y/n)");
            a = myObj.next();
        }while (!"y".equals(a));
        System.out.println("Transaksi belanja "+member.getNama(idMember)+" sebagai berikut");
        System.out.println("Nama Barang \tQty \tHarga \tJumlah \t");
        int total=0;
        int x = idBarang.size();
        for (int j = 0; j < x; j++){
            int jumlah=banyak.get(j) * barang.getHarga(idBarang.get(j));
            total+=jumlah;
            System.out.println(barang.getNamaBarang(idBarang.get(j))+"\t"+banyak.get(j)+"\t"+barang.getHarga(idBarang.get(j))+"\t"+jumlah);transaksi.setTransaksi(barang, idMember, idBarang.get(j),banyak.get(j));
        }
        System.out.println("Total Belanja : "+total);
        member.editSaldo(idMember, member.getSaldo(idMember)-total);

    }
    
    public void setTransaksi(Barang barang, int idMember, int idBarang, int banyaknya){
        this.idMember.add(idMember);
        this.idBarang.add(idBarang);
        this.banyak.add(banyaknya); 
        barang.editStok(idBarang, barang.getStok(idBarang)-banyaknya);
}
    
    public int getIdBarang(int index){
        return this.idBarang.get(index);
    }
    
    public int getBanyaknya(int indexBanyak){
        return this.banyak.get(indexBanyak);
    }
    
    public int getIdMember(int indexMember){
        return this.idMember.get(indexMember);
    }
    
    public int getjmltransaksi(){
        return this.idBarang.size();
    }
}
