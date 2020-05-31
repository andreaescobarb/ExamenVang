package State;

public class Transacciones {

    private Estado state = null;
    private ClienteBancario cliente = new ClienteBancario();

    public void setState(Estado state) {
        this.state = state;
    }

    public void transacciones() {
        state.Transaccion(cliente);
    }
}
