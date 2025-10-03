import java.util.Scanner;

public class Menu {

    private final RegistroPedidos registroPedidos;
    private final CocinaService cocinaService;
    private final DespachoService despachoService;
    private final ReportesService reportesService;

    public Menu(RegistroPedidos registroPedidos,
                CocinaService cocinaService,
                DespachoService despachoService,
                ReportesService reportesService) {
        this.registroPedidos = registroPedidos;
        this.cocinaService = cocinaService;
        this.despachoService = despachoService;
        this.reportesService = reportesService;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==== SISTEMA DE RESTAURANTE ====");
            System.out.println("1. Registrar pedido");
            System.out.println("2. Preparar platos");
            System.out.println("3. Asignar pedido a repartidor");
            System.out.println("4. Generar reportes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> registrarPedido(scanner);
                case 2 -> prepararPlatos();
                case 3 -> asignarPedido();
                case 4 -> mostrarReportes();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        scanner.close();
    }

    private void registrarPedido(Scanner sc) {
        System.out.println("Ingrese nombre del cliente: ");
        String nombre = sc.nextLine();
        // acá pedís platos, tipo y prioridad → llamás a registroPedidos.registrar(...)
    }

    private void prepararPlatos() {
        cocinaService.procesarPedidosPendientes();
    }

    private void asignarPedido() {
        despachoService.asignarPedidosListos();
    }

    private void mostrarReportes() {
        reportesService.mostrarReportes();
    }
}
