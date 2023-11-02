import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;

public class CarrinhoDeComprasTest {

    @Test
    public void testAdicionarProduto() {
        Produto produto = mock(Produto.class);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarProduto(produto);

        assertEquals(1, carrinho.getProdutos().size());
    }

    @Test
    public void testRemoverProduto() {
        Produto produto = mock(Produto.class);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto);

        carrinho.removerProduto(produto);

        assertEquals(0, carrinho.getProdutos().size());
    }

    @Test
    public void testCalcularTotal() {
        Produto produto1 = mock(Produto.class);
        Produto produto2 = mock(Produto.class);

        when(produto1.getValor()).thenReturn(10.0);
        when(produto2.getValor()).thenReturn(20.0);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);

        assertEquals(30.0, carrinho.calcularTotal(), 0.001);
    }
}
