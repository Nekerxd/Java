package TV;

public class LidarTv {
    public static void main(String[] args) {
        TV televisao = new TV("Samsung", false, 17, 27);
        
        televisao.ligar_desligar();
        
        System.out.println(televisao.getVolume());
        /* 17 */
        System.out.println(televisao.getCanal());
        /* 27 */
        televisao.diminuir_canal();
        /* 27-3 = 24 */
        televisao.aumentar_vol(); 
        /* 17+5 = 22 */
        televisao.setCanal(48);
        televisao.aumentar_canal();
        /* 48+3 = 51 */
        televisao.setVolume(69);
        televisao.diminuir_vol();
        /* 69-5 = 64 */
        televisao.setVolume(0);
        televisao.diminuir_vol();
        /* Volume mínimo*/
        televisao.setCanal(250);
        televisao.aumentar_canal();
        /* Canal máximo*/
        televisao.ligar_desligar();
    }
}
