package sistemaCaixaAutomatico;

public class BasicaStrategy implements TipoContaStrategy {
    @Override
    public float calcularTaxa() {
        return 1.00f;
    }
}