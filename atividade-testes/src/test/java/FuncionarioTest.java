import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FuncionarioTest {

    @Test
    public void testAumentarSalarioComBaseVendas() {
        // Mock
        Funcionario funcionarioMock = mock(Funcionario.class);

        // When
        when(funcionarioMock.aumentarSalarioComBaseVendas(1000.0,100,0.1)).thenReturn(1010.0);

        double resultado = funcionarioMock.aumentarSalarioComBaseVendas(1000.0,100,0.1);
        System.out.println(resultado);

        // Verify
        verify(funcionarioMock).aumentarSalarioComBaseVendas(1000.0,100,0.1);

        assertEquals(1010, resultado);
    }

    @Test

}
