public class CompraEquipamentos {
    public static void main (String[] lindo) {
        //passo 1: criar vars
        double computador = 3_590.00;
        double mouse      = 45.60;
        double teclado    = 123.80;

        //passo 2: calcular o total da compra
        double totalCompra = computador + mouse + teclado;

        //passo 3: exibir vars e total
        System.out.println("Compras de Hoje :)");
        System.out.println("Computador: R$ " + computador);
        System.out.println("Mouse: R$ " + mouse);
        System.out.println("Teclado: R$ " + teclado);
        System.out.println("---------------------------");
        System.out.println("Total Compra: R$ " + totalCompra);
    }
}