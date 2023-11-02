import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProdutoTest {
    @Test
    public void testParcelarProduto(){

        Produto produtoMock = mock(Produto.class);

        when(produtoMock.parcelarProduto(100.0, 4)).thenReturn(110.0);

        double resultado = produtoMock.parcelarProduto(100.0, 4);
        System.out.println(resultado);

        verify(produtoMock).parcelarProduto(100.0,4);

        assertEquals(110.0, resultado);
    }

}
