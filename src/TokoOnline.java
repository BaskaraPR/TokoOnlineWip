/**
 *
 * @author Baskar
 */
public class TokoOnline {
    public static void main(String[] args) {
        Member mem = new Member();
        Transaksi tr = new Transaksi();
        Laporan rep = new Laporan();
        Barang bar = new Barang();
        
        
        rep.laporan(bar);
        System.out.println("=========");
        rep.laporan(mem);
        System.out.println("=========");
        tr.ProsesTransaksi(mem, tr, bar);
        System.out.println("=========");
        rep.laporan(bar);
        System.out.println("=========");
        rep.laporan(mem);
        System.out.println("=========");
        rep.laporan(tr, bar);
    }
}
