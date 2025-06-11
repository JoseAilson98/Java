package ExemploEnun;

import java.util.Date;

public class AppMain {
    public static void main(String[] args) {



        OrdemStatus pedido1 = new OrdemStatus(501L, new Date(),Status.PAGAMENTO_PEDENTE);
        System.out.println(pedido1);


        //convertendo enum para texto
        OrdemStatus pedido2 = new OrdemStatus(501L, new Date(),Status.valueOf("ENTREGUE"));
        System.out.println(pedido2);
    }
}
